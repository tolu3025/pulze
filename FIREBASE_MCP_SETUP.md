# Firebase & Dart MCP Setup & Environment Configuration

This guide provides configuration details and instructions for connecting to the **`pulze-student-app`** Firebase project.

---

## 1. Firebase Credentials (Extracted & Active)

Your application is now directly configured with your project's original Firebase database credentials:

- **Project ID:** `pulze-student-app`
- **Storage Bucket:** `pulze-student-app.firebasestorage.app`
- **App ID (Android):** `1:273748081036:android:e7fb63bafb28c5dbbbbea9`
- **Sender ID:** `273748081036`
- **API Key:** `AIzaSyAPWgBY32UnR__yT_WGsSF-f3T4PJEwda0`

### Files Updated:
- **[lib/firebase_options.dart](file:///c:/Users/Lenovo%20ThinkBook/Downloads/app-release.apk_Decompiler.com/lib/firebase_options.dart)**: Contains active `FirebaseOptions` for Android, iOS, Web, and Desktop.
- **[android/app/google-services.json](file:///c:/Users/Lenovo%20ThinkBook/Downloads/app-release.apk_Decompiler.com/android/app/google-services.json)**: Native Android Firebase configuration.

---

## 2. Flutter SDK & JDK 17 Status

- **Flutter SDK Location:** `C:\src\flutter` (Version `3.44.9`)
- **JDK 17 Location:** `C:\Program Files\Eclipse Adoptium\jdk-17.0.20.8-hotspot`
- **PATH & JAVA_HOME:** Configured in User Environment.

Test in a new PowerShell window:
```powershell
flutter --version
java -version
```

---

## 3. Configuring Firebase MCP & Dart MCP Server

To enable the **Firebase MCP Server** in your IDE context:

1. **Login to Firebase CLI**:
   ```powershell
   firebase login
   ```

2. **Add Firebase MCP Server to your IDE `settings.json`**:

```json
{
  "mcpServers": {
    "firebase": {
      "command": "npx",
      "args": [
        "-y",
        "@firebase/mcp-server"
      ]
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
