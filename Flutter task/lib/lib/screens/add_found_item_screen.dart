/*import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';

class AddFoundItemScreen extends StatefulWidget {
  @override
  _AddFoundItemScreenState createState() => _AddFoundItemScreenState();
}

class _AddFoundItemScreenState extends State<AddFoundItemScreen> {
  String? selectedItemId; // Stores the selected lost item ID

  Future<void> markAsFound() async {
    if (selectedItemId == null) return;

    FirebaseFirestore firestore = FirebaseFirestore.instance;

    // Fetch the selected lost item data
    DocumentSnapshot lostItem =
        await firestore.collection('lost_items').doc(selectedItemId).get();

    if (!lostItem.exists) return;

    // Move the item to "found_items"
    await firestore.collection('found_items').add({
      'title': lostItem['title'],
      'description': lostItem['description'],
      'category': lostItem['category'],
      'location': lostItem['location'],
      'contact': lostItem['contact'],
      'dateLost': lostItem['dateLost'],
      'imageUrl': lostItem['imageUrl'],
      'foundDate': DateTime.now().toIso8601String(),
      'createdAt': lostItem['createdAt'],
    });

    // Delete from "lost_items"
    await firestore.collection('lost_items').doc(selectedItemId).delete();

    // Show success message
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(content: Text("Item marked as found!")),
    );

    setState(() {
      selectedItemId = null; // Reset selection
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Mark Lost Item as Found")),
      body: Column(
        children: [
          Padding(
            padding: const EdgeInsets.all(8.0),
            child: Text(
              "Select the lost item that has been found:",
              style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold),
            ),
          ),
          StreamBuilder(
            stream: FirebaseFirestore.instance.collection('lost_items').snapshots(),
            builder: (context, AsyncSnapshot<QuerySnapshot> snapshot) {
              if (!snapshot.hasData) return CircularProgressIndicator();

              List<DropdownMenuItem<String>> items = snapshot.data!.docs.map((doc) {
                return DropdownMenuItem(
                  value: doc.id,
                  child: Text(doc['title']),
                );
              }).toList();

              return Padding(
                padding: const EdgeInsets.all(8.0),
                child: DropdownButton<String>(
                  value: selectedItemId,
                  hint: Text("Select Lost Item"),
                  isExpanded: true,
                  onChanged: (newValue) {
                    setState(() {
                      selectedItemId = newValue;
                    });
                  },
                  items: items,
                ),
              );
            },
          ),
          ElevatedButton(
            onPressed: markAsFound,
            child: Text("Mark as Found"),
          ),
        ],
      ),
    );
  }
}
*/