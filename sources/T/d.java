package T;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f2817a;

    public d(Context context) {
        this.f2817a = context;
    }

    public ApplicationInfo a(String str, int i3) {
        return this.f2817a.getPackageManager().getApplicationInfo(str, i3);
    }

    public CharSequence b(String str) {
        Context context = this.f2817a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo c(String str, int i3) {
        return this.f2817a.getPackageManager().getPackageInfo(str, i3);
    }

    public final boolean d(int i3, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f2817a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i3, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
