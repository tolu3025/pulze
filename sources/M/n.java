package M;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2679a = 12451000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f2681c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f2682d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final AtomicBoolean f2680b = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f2683e = new AtomicBoolean();

    public static void a(Context context, int i3) throws l, k {
        int iG = j.e().g(context, i3);
        if (iG != 0) {
            Intent intentA = j.e().a(context, iG, "e");
            StringBuilder sb = new StringBuilder(String.valueOf(iG).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(iG);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (intentA != null) {
                throw new l(iG, "Google Play Services not available", intentA);
            }
            throw new k(iG);
        }
    }

    public static String b(int i3) {
        return C0413a.y(i3);
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean e(Context context) {
        try {
            if (!f2682d) {
                try {
                    PackageInfo packageInfoC = T.e.a(context).c("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                    r.a(context);
                    if (packageInfoC == null || r.c(packageInfoC, false) || !r.c(packageInfoC, true)) {
                        f2681c = false;
                    } else {
                        f2681c = true;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e3);
                }
                f2682d = true;
            }
            return f2681c || !com.google.android.gms.common.util.g.b();
        } catch (Throwable th) {
            f2682d = true;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r11, int r12) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M.n.f(android.content.Context, int):int");
    }

    public static boolean g(Context context, int i3) {
        if (i3 == 18) {
            return true;
        }
        if (i3 == 1) {
            return j(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean h(Context context) {
        Object systemService = context.getSystemService("user");
        AbstractC0643s.k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static boolean i(int i3) {
        return i3 == 1 || i3 == 2 || i3 == 3 || i3 == 9;
    }

    static boolean j(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !h(context);
    }
}
