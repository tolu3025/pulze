package T;

import android.content.Context;
import com.google.android.gms.common.util.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f2815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f2816b;

    public static synchronized boolean a(Context context) {
        Boolean boolValueOf;
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f2815a;
        if (context2 != null && (bool = f2816b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f2816b = null;
        if (!l.c()) {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f2816b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
                f2816b = boolValueOf;
            }
            f2815a = applicationContext;
            return f2816b.booleanValue();
        }
        boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f2816b = boolValueOf;
        f2815a = applicationContext;
        return f2816b.booleanValue();
    }
}
