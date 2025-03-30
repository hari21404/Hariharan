class Item {
  String id;
  String title;
  String description;
  String imageUrl;
  String contactInfo;
  bool isLost;

  Item({
    required this.id,
    required this.title,
    required this.description,
    required this.imageUrl,
    required this.contactInfo,
    required this.isLost,
  });

  factory Item.fromMap(Map<String, dynamic> data, String documentId) {
    return Item(
      id: documentId,
      title: data['title'],
      description: data['description'],
      imageUrl: data['imageUrl'],
      contactInfo: data['contactInfo'],
      isLost: data['isLost'],
    );
  }

  Map<String, dynamic> toMap() {
    return {
      'title': title,
      'description': description,
      'imageUrl': imageUrl,
      'contactInfo': contactInfo,
      'isLost': isLost,
    };
  }
}
