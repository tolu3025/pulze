package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
class b {
    b() {
    }

    private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, i3);
        }
    }

    private static String b(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf < 0 ? str : str.substring(0, iLastIndexOf);
    }

    private static String c(Context context, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType != null && !extensionFromMimeType.isEmpty()) {
                return "." + extensionFromMimeType;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String d(Context context, Uri uri) {
        Cursor cursorF = f(context, uri);
        if (cursorF != null) {
            try {
                if (cursorF.moveToFirst() && cursorF.getColumnCount() >= 1) {
                    String string = cursorF.getString(0);
                    cursorF.close();
                    return string;
                }
            } catch (Throwable th) {
                try {
                    cursorF.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (cursorF == null) {
            return null;
        }
        cursorF.close();
        return null;
    }

    private static Cursor f(Context context, Uri uri) {
        return context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081 A[Catch: IOException | SecurityException -> 0x009a, IOException | SecurityException -> 0x009a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException | SecurityException -> 0x009a, blocks: (B:3:0x0001, B:19:0x0081, B:19:0x0081, B:32:0x0099, B:32:0x0099, B:31:0x0096, B:31:0x0096), top: B:34:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String e(android.content.Context r7, android.net.Uri r8) {
        /*
            r6 = this;
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L9a
            java.io.InputStream r1 = r1.openInputStream(r8)     // Catch: java.lang.Throwable -> L9a
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L45
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L45
            java.io.File r4 = r7.getCacheDir()     // Catch: java.lang.Throwable -> L45
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L45
            r3.mkdir()     // Catch: java.lang.Throwable -> L45
            r3.deleteOnExit()     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = d(r7, r8)     // Catch: java.lang.Throwable -> L45
            java.lang.String r7 = c(r7, r8)     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L59
            java.lang.String r2 = "FileUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r4.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "Cannot get file name for "
            r4.append(r5)     // Catch: java.lang.Throwable -> L45
            r4.append(r8)     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L45
            b1.AbstractC0525b.g(r2, r8)     // Catch: java.lang.Throwable -> L45
            if (r7 != 0) goto L47
            java.lang.String r7 = ".jpg"
            goto L47
        L45:
            r7 = move-exception
            goto L8f
        L47:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r8.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = "image_picker"
            r8.append(r2)     // Catch: java.lang.Throwable -> L45
            r8.append(r7)     // Catch: java.lang.Throwable -> L45
        L54:
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Throwable -> L45
            goto L6b
        L59:
            if (r7 == 0) goto L6b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r8.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = b(r2)     // Catch: java.lang.Throwable -> L45
            r8.append(r2)     // Catch: java.lang.Throwable -> L45
            r8.append(r7)     // Catch: java.lang.Throwable -> L45
            goto L54
        L6b:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L45
            r7.<init>(r3, r2)     // Catch: java.lang.Throwable -> L45
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L45
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L45
            a(r1, r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r7.getPath()     // Catch: java.lang.Throwable -> L85
            r8.close()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L84
            r1.close()     // Catch: java.lang.Throwable -> L9a java.lang.Throwable -> L9a
        L84:
            return r7
        L85:
            r7 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> L8a
            goto L8e
        L8a:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> L45
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L45
        L8f:
            if (r1 == 0) goto L99
            r1.close()     // Catch: java.lang.Throwable -> L95
            goto L99
        L95:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> L9a java.lang.Throwable -> L9a
        L99:
            throw r7     // Catch: java.lang.Throwable -> L9a java.lang.Throwable -> L9a
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.b.e(android.content.Context, android.net.Uri):java.lang.String");
    }
}
