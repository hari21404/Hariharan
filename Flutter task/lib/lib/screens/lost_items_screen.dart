import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'add_lost_item_screen.dart';

class LostItemsScreen extends StatelessWidget {
  void markAsFound(DocumentSnapshot lostItem) async {
    // Move item from 'lost_items' to 'found_items'
    await FirebaseFirestore.instance.collection('found_items').add({
      'title': lostItem['title'],
      'description': lostItem['description'],
      'contact': lostItem['contact'],
      'dateLost': lostItem['dateLost'],
      'imageUrl': lostItem['imageUrl'] ?? '',
      'foundDate': DateTime.now().toString(),
    });

    // Delete from 'lost_items'
    await FirebaseFirestore.instance.collection('lost_items').doc(lostItem.id).delete();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Lost Items')),
      body: StreamBuilder(
        stream: FirebaseFirestore.instance.collection('lost_items').snapshots(),
        builder: (context, AsyncSnapshot<QuerySnapshot> snapshot) {
          if (!snapshot.hasData) {
            return Center(child: CircularProgressIndicator());
          }
          return ListView.builder(
            itemCount: snapshot.data!.docs.length,
            itemBuilder: (context, index) {
              DocumentSnapshot lostItem = snapshot.data!.docs[index];
              return Card(
                margin: EdgeInsets.all(10),
                child: ListTile(
                  title: Text(lostItem['title']),
                  subtitle: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(lostItem['description']),
                      Text("Contact: ${lostItem['contact']}"),
                      Text("Date Lost: ${lostItem['dateLost']}"),
                    ],
                  ),
                  leading: lostItem['imageUrl'] != null && lostItem['imageUrl'].isNotEmpty
                      ? Image.network(lostItem['imageUrl'], width: 50, height: 50, fit: BoxFit.cover)
                      : Icon(Icons.image_not_supported),
                  trailing: ElevatedButton(
                    onPressed: () => markAsFound(lostItem),
                    child: Text("Mark as Found"),
                  ),
                ),
              );
            },
          );
        },
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          Navigator.push(context, MaterialPageRoute(builder: (context) => AddLostItemScreen()));
        },
        child: Icon(Icons.add),
      ),
    );
  }
}
