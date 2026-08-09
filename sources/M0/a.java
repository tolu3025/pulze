package M0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import k0.C0988b;
import x0.C1270a;
import x0.InterfaceC1271b;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f2694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1271b f2695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2696d;

    public a(Context context, String str, InterfaceC1271b interfaceC1271b) {
        Context contextA = a(context);
        this.f2693a = contextA;
        this.f2694b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f2695c = interfaceC1271b;
        this.f2696d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f2694b.contains("firebase_data_collection_default_enabled") ? this.f2694b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f2693a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f2693a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z2) {
        if (this.f2696d != z2) {
            this.f2696d = z2;
            this.f2695c.a(new C1270a(C0988b.class, new C0988b(z2)));
        }
    }

    public synchronized boolean b() {
        return this.f2696d;
    }

    public synchronized void e(Boolean bool) {
        boolean zEquals;
        try {
            if (bool == null) {
                this.f2694b.edit().remove("firebase_data_collection_default_enabled").apply();
                zEquals = d();
            } else {
                zEquals = Boolean.TRUE.equals(bool);
                this.f2694b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
            }
            f(zEquals);
        } catch (Throwable th) {
            throw th;
        }
    }
}
