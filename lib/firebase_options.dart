// File generated for pulze-student-app Firebase connection.
// ignore_for_file: type=lint
import 'package:firebase_core/firebase_core.dart' show FirebaseOptions;
import 'package:flutter/foundation.dart'
    show defaultTargetPlatform, kIsWeb, TargetPlatform;

/// Default [FirebaseOptions] configured for `pulze-student-app`.
class DefaultFirebaseOptions {
  static FirebaseOptions get currentPlatform {
    if (kIsWeb) {
      return web;
    }
    switch (defaultTargetPlatform) {
      case TargetPlatform.android:
        return android;
      case TargetPlatform.iOS:
        return ios;
      case TargetPlatform.macOS:
        return macos;
      case TargetPlatform.windows:
        return windows;
      case TargetPlatform.linux:
        throw UnsupportedError(
          'DefaultFirebaseOptions have not been configured for linux - '
          'you can reconfigure this by running the FlutterFire CLI again.',
        );
      default:
        throw UnsupportedError(
          'DefaultFirebaseOptions are not supported for this platform.',
        );
    }
  }

  static const FirebaseOptions web = FirebaseOptions(
    apiKey: 'AIzaSyAPWgBY32UnR__yT_WGsSF-f3T4PJEwda0',
    appId: '1:273748081036:android:e7fb63bafb28c5dbbbbea9',
    messagingSenderId: '273748081036',
    projectId: 'pulze-student-app',
    authDomain: 'pulze-student-app.firebaseapp.com',
    storageBucket: 'pulze-student-app.firebasestorage.app',
  );

  static const FirebaseOptions android = FirebaseOptions(
    apiKey: 'AIzaSyAPWgBY32UnR__yT_WGsSF-f3T4PJEwda0',
    appId: '1:273748081036:android:e7fb63bafb28c5dbbbbea9',
    messagingSenderId: '273748081036',
    projectId: 'pulze-student-app',
    storageBucket: 'pulze-student-app.firebasestorage.app',
  );

  static const FirebaseOptions ios = FirebaseOptions(
    apiKey: 'AIzaSyAPWgBY32UnR__yT_WGsSF-f3T4PJEwda0',
    appId: '1:273748081036:android:e7fb63bafb28c5dbbbbea9',
    messagingSenderId: '273748081036',
    projectId: 'pulze-student-app',
    storageBucket: 'pulze-student-app.firebasestorage.app',
    iosBundleId: 'com.pulze.pulze',
  );

  static const FirebaseOptions macos = FirebaseOptions(
    apiKey: 'AIzaSyAPWgBY32UnR__yT_WGsSF-f3T4PJEwda0',
    appId: '1:273748081036:android:e7fb63bafb28c5dbbbbea9',
    messagingSenderId: '273748081036',
    projectId: 'pulze-student-app',
    storageBucket: 'pulze-student-app.firebasestorage.app',
    iosBundleId: 'com.pulze.pulze',
  );

  static const FirebaseOptions windows = FirebaseOptions(
    apiKey: 'AIzaSyAPWgBY32UnR__yT_WGsSF-f3T4PJEwda0',
    appId: '1:273748081036:android:e7fb63bafb28c5dbbbbea9',
    messagingSenderId: '273748081036',
    projectId: 'pulze-student-app',
    authDomain: 'pulze-student-app.firebaseapp.com',
    storageBucket: 'pulze-student-app.firebasestorage.app',
  );
}
