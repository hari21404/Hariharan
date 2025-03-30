import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:firebase_storage/firebase_storage.dart';
import 'package:image_picker/image_picker.dart';
import 'dart:io';

class AddLostItemScreen extends StatefulWidget {
  @override
  _AddLostItemScreenState createState() => _AddLostItemScreenState();
}

class _AddLostItemScreenState extends State<AddLostItemScreen> {
  final TextEditingController _titleController = TextEditingController();
  final TextEditingController _descriptionController = TextEditingController();
  final TextEditingController _locationController = TextEditingController();
  final TextEditingController _contactController = TextEditingController();
  DateTime? _selectedDate;
  String _selectedCategory = 'Electronics';
  File? _image;
  bool _isUploading = false;

  final List<String> _categories = [
    'Electronics',
    'Documents',
    'Clothing',
    'Accessories',
    'Other'
  ];

  Future<void> _pickImage() async {
    final pickedFile = await ImagePicker().pickImage(source: ImageSource.gallery);
    if (pickedFile != null) {
      setState(() {
        _image = File(pickedFile.path);
      });
    }
  }

  Future<void> _addLostItem() async {
    if (_titleController.text.isEmpty ||
        _descriptionController.text.isEmpty ||
        _locationController.text.isEmpty ||
        _contactController.text.isEmpty ||
        _selectedDate == null) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(content: Text("Please fill all fields (Image is optional)")),
      );
      return;
    }

    setState(() {
      _isUploading = true;
    });

    String? imageUrl;
    if (_image != null) {
      final ref = FirebaseStorage.instance
          .ref()
          .child('lost_items')
          .child('${DateTime.now().millisecondsSinceEpoch}.jpg');
      await ref.putFile(_image!);
      imageUrl = await ref.getDownloadURL();
    }

    await FirebaseFirestore.instance.collection('lost_items').add({
      'title': _titleController.text,
      'description': _descriptionController.text,
      'category': _selectedCategory,
      'location': _locationController.text,
      'contact': _contactController.text,
      'dateLost': _selectedDate!.toIso8601String(),
      'imageUrl': imageUrl, // Null if no image
      'createdAt': Timestamp.now(),
    });

    setState(() {
      _isUploading = false;
    });

    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(content: Text("Lost Item Added Successfully!")),
    );

    Navigator.pop(context);
  }

  void _pickDate() async {
    DateTime? picked = await showDatePicker(
      context: context,
      initialDate: DateTime.now(),
      firstDate: DateTime(2000),
      lastDate: DateTime.now(),
    );

    if (picked != null) {
      setState(() {
        _selectedDate = picked;
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Add Lost Item")),
      body: Padding(
        padding: EdgeInsets.all(16.0),
        child: SingleChildScrollView(
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              TextField(
                controller: _titleController,
                decoration: InputDecoration(labelText: "Title"),
              ),
              TextField(
                controller: _descriptionController,
                decoration: InputDecoration(labelText: "Description"),
                maxLines: 3,
              ),
              DropdownButtonFormField(
                value: _selectedCategory,
                items: _categories.map((category) {
                  return DropdownMenuItem(
                    value: category,
                    child: Text(category),
                  );
                }).toList(),
                onChanged: (value) {
                  setState(() {
                    _selectedCategory = value.toString();
                  });
                },
                decoration: InputDecoration(labelText: "Category"),
              ),
              TextField(
                controller: _locationController,
                decoration: InputDecoration(labelText: "Location Last Seen"),
              ),
              TextField(
                controller: _contactController,
                decoration: InputDecoration(labelText: "Contact Info"),
                keyboardType: TextInputType.phone,
              ),
              SizedBox(height: 10),
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Text(_selectedDate == null
                      ? "Select Date"
                      : "Date: ${_selectedDate!.toLocal()}".split(' ')[0]),
                  ElevatedButton(
                    onPressed: _pickDate,
                    child: Text("Pick Date"),
                  ),
                ],
              ),
              SizedBox(height: 10),
              _image != null
                  ? Image.file(_image!, height: 150, width: double.infinity, fit: BoxFit.cover)
                  : Text("No Image Selected"),
              SizedBox(height: 10),
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  ElevatedButton.icon(
                    icon: Icon(Icons.camera),
                    label: Text("Pick Image"),
                    onPressed: _pickImage,
                  ),
                  ElevatedButton(
                    child: _isUploading ? CircularProgressIndicator() : Text("Submit"),
                    onPressed: _isUploading ? null : _addLostItem,
                  ),
                ],
              ),
            ],
          ),
        ),
      ),
    );
  }
}
