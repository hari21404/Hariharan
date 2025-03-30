import 'package:flutter/material.dart';
import 'package:flutter_gen/gen_l10n/app_localizations.dart';
import 'lost_items_screen.dart';
import 'found_items_screen.dart';
import 'language_controller.dart';
import 'package:provider/provider.dart';

class HomeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // Access localization
    final l10n = AppLocalizations.of(context)!;
    
    return Scaffold(
      appBar: AppBar(
        title: Text(l10n.appTitle),
        actions: [
          // Language selector
          LanguageSelector(),
        ],
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Padding(
              padding: const EdgeInsets.all(20.0),
              child: Text(
                l10n.appDescription,
                textAlign: TextAlign.center,
                style: TextStyle(fontSize: 16),
              ),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              child: Text(l10n.viewLostItems),
              onPressed: () {
                Navigator.push(context, MaterialPageRoute(builder: (context) => LostItemsScreen()));
              },
            ),
            SizedBox(height: 20),
            ElevatedButton(
              child: Text(l10n.viewFoundItems),
              onPressed: () {
                Navigator.push(context, MaterialPageRoute(builder: (context) => FoundItemsScreen()));
              },
            ),
          ],
        ),
      ),
    );
  }
}

// Language selector widget
class LanguageSelector extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final languageController = Provider.of<LanguageController>(context);
    
    return PopupMenuButton<Locale>(
      icon: Icon(Icons.language),
      onSelected: (Locale locale) {
        languageController.setLocale(locale);
      },
      itemBuilder: (context) => [
        PopupMenuItem(
          value: Locale('en'),
          child: Text('English'),
        ),
        PopupMenuItem(
          value: Locale('es'),
          child: Text('Español'),
        ),
        // Add more languages as needed
      ],
    );
  }
}