package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import androidx.core.app.j;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f3861a = new Object();

    /* JADX INFO: renamed from: androidx.core.content.a$a, reason: collision with other inner class name */
    static class C0082a {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static class b {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i3) {
            return ((i3 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i3 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, a.g(context), handler);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class c {
        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    static class d {
        static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        static String b(Context context) {
            return context.getAttributionTag();
        }

        static Display c(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w("ContextCompat", "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    static class e {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i3) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i3);
        }
    }

    public static int a(Context context, String str) {
        j.d.d(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : j.b(context).a() ? 0 : -1;
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0082a.a(context);
        }
        return null;
    }

    public static String c(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return d.b(context);
        }
        return null;
    }

    public static File[] d(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] e(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor f(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? c.a(context) : androidx.core.os.d.a(new Handler(context.getMainLooper()));
    }

    static String g(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (androidx.core.content.c.b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i3) {
        return i(context, broadcastReceiver, intentFilter, null, null, i3);
    }

    public static Intent i(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i3) {
        int i4 = i3 & 1;
        if (i4 != 0 && (i3 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i4 != 0) {
            i3 |= 2;
        }
        int i5 = i3;
        int i6 = i5 & 2;
        if (i6 == 0 && (i5 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i6 != 0 && (i5 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i7 = Build.VERSION.SDK_INT;
        return i7 >= 33 ? e.a(context, broadcastReceiver, intentFilter, str, handler, i5) : i7 >= 26 ? b.a(context, broadcastReceiver, intentFilter, str, handler, i5) : ((i5 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, g(context), handler);
    }

    public static void j(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}
