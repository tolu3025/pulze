package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f3854c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Set f3855d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f3856e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f3858b;

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    private j(Context context) {
        this.f3857a = context;
        this.f3858b = (NotificationManager) context.getSystemService("notification");
    }

    public static j b(Context context) {
        return new j(context);
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f3858b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f3857a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f3857a.getApplicationInfo();
        String packageName = this.f3857a.getApplicationContext().getPackageName();
        int i3 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i3), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
