package M;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static r f2684b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2685a;

    public r(Context context) {
        this.f2685a = context.getApplicationContext();
    }

    public static r a(Context context) {
        AbstractC0643s.k(context);
        synchronized (r.class) {
            try {
                if (f2684b == null) {
                    I.a(context);
                    f2684b = new r(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2684b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ba, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: IllegalArgumentException -> 0x00c6, TryCatch #0 {IllegalArgumentException -> 0x00c6, blocks: (B:17:0x002a, B:19:0x002f, B:21:0x0037, B:23:0x003c, B:25:0x003f, B:27:0x0047, B:43:0x008a, B:45:0x0090, B:47:0x009b, B:48:0x00a5, B:50:0x00ad, B:56:0x00be, B:57:0x00c5, B:28:0x004c, B:32:0x0056, B:34:0x005f, B:36:0x0065, B:39:0x006c, B:41:0x007b, B:42:0x0086, B:18:0x002d), top: B:65:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static final boolean c(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M.r.c(android.content.pm.PackageInfo, boolean):boolean");
    }

    private static E d(PackageInfo packageInfo, E... eArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            F f3 = new F(packageInfo.signatures[0].toByteArray());
            for (int i3 = 0; i3 < eArr.length; i3++) {
                if (eArr[i3].equals(f3)) {
                    return eArr[i3];
                }
            }
        }
        return null;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (c(packageInfo, false)) {
            return true;
        }
        if (c(packageInfo, true)) {
            if (n.e(this.f2685a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
}
