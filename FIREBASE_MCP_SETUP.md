# Firebase & Dart MCP Setup & Environment Configuration

This guide provides instructions to complete your environment setup for Flutter, Dart, Firebase CLI, and Model Context Protocol (MCP) integrations.

---

## 1. Flutter SDK & JDK 17 Status

> [!NOTE]
> **Status:** Flutter SDK and JDK 17 are **ALREADY INSTALLED** on your system!
> - **Flutter SDK Location:** `C:\src\flutter` (Version `3.44.9`)
> - **JDK 17 Location:** `C:\Program Files\Eclipse Adoptium\jdk-17.0.20.8-hotspot`
> - **PATH & JAVA_HOME:** Automatically updated in your User Environment Variables.

If you open a new PowerShell terminal, test with:
```powershell
flutter --version
java -version
```


---

## 2. Installing Firebase CLI & FlutterFire

To connect your app directly to your Firebase project:

1. **Install Firebase CLI**:
   ```powershell
   winget install --id Google.FirebaseCLI -e
   ```
   *Or via Node/npm if Node.js is installed:*
   ```powershell
   npm install -g firebase-tools
   ```

2. **Login to Firebase**:
   ```powershell
   firebase login
   ```

3. **Install FlutterFire CLI**:
   ```powershell
   dart pub global activate flutterfire_cli
   ```

4. **Configure Firebase for your app**:
   Run from your project root (`c:\Users\Lenovo ThinkBook\Downloads\app-release.apk_Decompiler.com`):
   ```powershell
   flutterfire configure
   ```
   This will automatically generate your actual `lib/firebase_options.dart` and download `google-services.json` into `android/app/`.

---

## 3. Configuring Firebase MCP & Dart MCP

MCP (Model Context Protocol) servers allow AI assistants to interact with Firebase and Dart language tools directly.

### Firebase MCP Server Setup
To run the Firebase MCP server in your IDE configuration (e.g. VS Code / Antigravity / Claude Desktop):

Add to your `mcpServers` configuration (`settings.json` or `claude_desktop_config.json`):

```json
{
  "mcpServers": {
    "firebase": {
      "command": "npx",
      "args": [
        "-y",
        "@firebase/mcp-server"
      ],
      "env": {
        "FIREBASE_TOKEN": "<YOUR_FIREBASE_CI_TOKEN_OR_ADC>"
      }
    },
    "dart": {
      "command": "dart",
      "args": [
        "development_service"
      ]
    }
  }
}
```

---

## 4. Cleaning Up Unnecessary Decompiled Files

To archive or clean up unnecessary raw Smali and intermediate JADX files:
- All raw Smali bytecodes are preserved in `smali/` if you ever need them.
- Main project sources are organized under `lib/`, `pubspec.yaml`, `android/`, and `assets/`.
- Run `flutter clean` once Flutter SDK is configured to clean up build outputs.
