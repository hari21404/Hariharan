import 'package:cloud_firestore/cloud_firestore.dart';
import '../models/item.dart';

class FirebaseService {
  final CollectionReference _itemsCollection =
      FirebaseFirestore.instance.collection('items');

  Future<void> addItem(Item item) async {
    await _itemsCollection.add(item.toMap());
  }

  Stream<List<Item>> getLostItems() {
    return _itemsCollection.where('isLost', isEqualTo: true).snapshots().map(
        (snapshot) => snapshot.docs
            .map((doc) => Item.fromMap(doc.data() as Map<String, dynamic>, doc.id))
            .toList());
  }

  Stream<List<Item>> getFoundItems() {
    return _itemsCollection.where('isLost', isEqualTo: false).snapshots().map(
        (snapshot) => snapshot.docs
            .map((doc) => Item.fromMap(doc.data() as Map<String, dynamic>, doc.id))
            .toList());
  }

  Future<void> deleteItem(String id) async {
    await _itemsCollection.doc(id).delete();
  }
}
