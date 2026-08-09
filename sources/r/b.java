package R;

import T.e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.p0;
import com.google.android.gms.common.util.l;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f2808b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile b f2809c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f2810a = new ConcurrentHashMap();

    private b() {
    }

    public static b a() {
        if (f2809c == null) {
            synchronized (f2808b) {
                try {
                    if (f2809c == null) {
                        f2809c = new b();
                    }
                } finally {
                }
            }
        }
        b bVar = f2809c;
        AbstractC0643s.k(bVar);
        return bVar;
    }

    private final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i3, boolean z2, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((e.a(context).a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!e(serviceConnection)) {
            return g(context, intent, serviceConnection, i3, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f2810a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zG = g(context, intent, serviceConnection, i3, executor);
            if (zG) {
                return zG;
            }
            return false;
        } finally {
            this.f2810a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean e(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof p0);
    }

    private static void f(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private static final boolean g(Context context, Intent intent, ServiceConnection serviceConnection, int i3, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!l.e() || executor == null) ? context.bindService(intent, serviceConnection, i3) : context.bindService(intent, i3, executor, serviceConnection);
    }

    public void b(Context context, ServiceConnection serviceConnection) {
        if (e(serviceConnection)) {
            ConcurrentHashMap concurrentHashMap = this.f2810a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    f(context, (ServiceConnection) concurrentHashMap.get(serviceConnection));
                    return;
                } finally {
                    this.f2810a.remove(serviceConnection);
                }
            }
        }
        f(context, serviceConnection);
    }

    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i3, Executor executor) {
        return d(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
