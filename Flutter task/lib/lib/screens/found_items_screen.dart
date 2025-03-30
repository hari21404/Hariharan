import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';


class FoundItemsScreen extends StatefulWidget {
  @override
  _FoundItemsScreenState createState() => _FoundItemsScreenState();
}

class _FoundItemsScreenState extends State<FoundItemsScreen> {
  final FirebaseFirestore _firestore = FirebaseFirestore.instance;

  void deleteItem(String itemId) async {
    await _firestore.collection('found_items').doc(itemId).delete();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Found Items')),
      body: StreamBuilder(
        stream: _firestore.collection('found_items').snapshots(),
        builder: (context, AsyncSnapshot<QuerySnapshot> snapshot) {
          if (!snapshot.hasData) {
            return Center(child: CircularProgressIndicator());
          }
          return ListView.builder(
            itemCount: snapshot.data?.docs.length,
            itemBuilder: (context, index) {
              final DocumentSnapshot item = snapshot.data!.docs[index];
              return Card(
                margin: EdgeInsets.all(10),
                child: ListTile(
                  title: Text(item['title']),
                  subtitle: Text('Description: ${item['description']}'),
                  trailing: IconButton(
                    icon: Icon(Icons.delete, color: Colors.red),
                    onPressed: () {
                      showDialog(
                        context: context,
                        builder: (context) => AlertDialog(
                          title: Text("Delete Item"),
                          content: Text("Are you sure you want to delete this item?"),
                          actions: [
                            TextButton(
                              onPressed: () => Navigator.pop(context),
                              child: Text("Cancel"),
                            ),
                            TextButton(
                              onPressed: () {
                                deleteItem(item.id);
                                Navigator.pop(context);
                              },
                              child: Text("Delete", style: TextStyle(color: Colors.red)),
                            ),
                          ],
                        ),
                      );
                    },
                  ),
                ),
              );
            },
          );
        },
      ),
      
    );
  }
}
