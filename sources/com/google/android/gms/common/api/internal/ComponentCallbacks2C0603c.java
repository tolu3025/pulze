package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0603c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ComponentCallbacks2C0603c f5398e = new ComponentCallbacks2C0603c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f5399a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f5400b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f5401c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5402d = false;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c$a */
    public interface a {
        void a(boolean z2);
    }

    private ComponentCallbacks2C0603c() {
    }

    public static ComponentCallbacks2C0603c b() {
        return f5398e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C0603c componentCallbacks2C0603c = f5398e;
        synchronized (componentCallbacks2C0603c) {
            try {
                if (!componentCallbacks2C0603c.f5402d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0603c);
                    application.registerComponentCallbacks(componentCallbacks2C0603c);
                    componentCallbacks2C0603c.f5402d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z2) {
        synchronized (f5398e) {
            try {
                Iterator it = this.f5401c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f5398e) {
            this.f5401c.add(aVar);
        }
    }

    public boolean d() {
        return this.f5399a.get();
    }

    public boolean e(boolean z2) {
        AtomicBoolean atomicBoolean = this.f5400b;
        if (!atomicBoolean.get()) {
            if (com.google.android.gms.common.util.o.b()) {
                return z2;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f5399a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f5400b;
        boolean zCompareAndSet = this.f5399a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f5400b;
        boolean zCompareAndSet = this.f5399a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        if (i3 == 20 && this.f5399a.compareAndSet(false, true)) {
            this.f5400b.set(true);
            f(true);
        }
    }
}
