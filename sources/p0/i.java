package P0;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.C;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k0.C0992f;
import m0.AbstractC1028b;
import p0.InterfaceC1059b;
import q0.InterfaceC1136b;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static boolean a(Object obj, Object obj2) {
        return AbstractC0642q.b(obj, obj2);
    }

    public static String b(InterfaceC1059b interfaceC1059b) {
        if (interfaceC1059b == null) {
            return null;
        }
        try {
            AbstractC1028b abstractC1028b = (AbstractC1028b) Tasks.await(interfaceC1059b.b(false), 30000L, TimeUnit.MILLISECONDS);
            if (abstractC1028b.a() != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + abstractC1028b.a());
            }
            return abstractC1028b.b();
        } catch (InterruptedException e3) {
            e = e3;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (ExecutionException e4) {
            e = e4;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (TimeoutException e5) {
            e = e5;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        }
    }

    public static String c(InterfaceC1136b interfaceC1136b) {
        String strG;
        if (interfaceC1136b != null) {
            try {
                strG = ((C) Tasks.await(interfaceC1136b.c(false), 30000L, TimeUnit.MILLISECONDS)).g();
            } catch (InterruptedException e3) {
                e = e3;
                Log.e("StorageUtil", "error getting token " + e);
            } catch (ExecutionException e4) {
                e = e4;
                Log.e("StorageUtil", "error getting token " + e);
            } catch (TimeoutException e5) {
                e = e5;
                Log.e("StorageUtil", "error getting token " + e);
            }
        } else {
            strG = null;
        }
        if (!TextUtils.isEmpty(strG)) {
            return strG;
        }
        Log.w("StorageUtil", "no auth token for request");
        return null;
    }

    public static Uri d(C0992f c0992f, String str) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = Q0.e.f2783k;
        if (str.toLowerCase().startsWith("gs://")) {
            return Uri.parse("gs://" + d.b(d.a(str.substring(5))));
        }
        Uri uri2 = Uri.parse(str);
        String scheme = uri2.getScheme();
        if (scheme == null || !(a(scheme.toLowerCase(), "http") || a(scheme.toLowerCase(), "https"))) {
            Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
            throw new IllegalArgumentException("Uri scheme");
        }
        int iIndexOf = uri2.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String strC = d.c(uri2.getEncodedPath());
        if (iIndexOf == 0 && strC.startsWith("/")) {
            int iIndexOf2 = strC.indexOf("/b/", 0);
            int i3 = iIndexOf2 + 3;
            int iIndexOf3 = strC.indexOf("/", i3);
            int iIndexOf4 = strC.indexOf("/o/", 0);
            if (iIndexOf2 == -1 || iIndexOf3 == -1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            strSubstring = strC.substring(i3, iIndexOf3);
            strC = iIndexOf4 != -1 ? strC.substring(iIndexOf4 + 3) : "";
        } else {
            if (iIndexOf <= 1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            strSubstring = uri2.getAuthority().substring(0, iIndexOf - 1);
        }
        AbstractC0643s.f(strSubstring, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(strSubstring).encodedPath(strC).build();
    }

    public static long e(String str) {
        if (str == null) {
            return 0L;
        }
        String strReplaceAll = str.replaceAll("Z$", "-0000");
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(strReplaceAll).getTime();
        } catch (ParseException e3) {
            Log.w("StorageUtil", "unable to parse datetime:" + strReplaceAll, e3);
            return 0L;
        }
    }
}
