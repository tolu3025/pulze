package I0;

import I0.InterfaceC0374o;
import J0.AbstractC0386b;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: I0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0370k implements InterfaceC0374o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f2315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f2316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f2317d = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0.k$c */
    class c extends ConnectivityManager.NetworkCallback {
        private c() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C0370k.this.k(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            C0370k.this.k(false);
        }

        /* synthetic */ c(C0370k c0370k, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0.k$d */
    class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2323a;

        private d() {
            this.f2323a = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C0370k c0370k;
            boolean z2;
            boolean zH = C0370k.this.h();
            if (!C0370k.this.h() || this.f2323a) {
                if (!zH && this.f2323a) {
                    c0370k = C0370k.this;
                    z2 = false;
                }
                this.f2323a = zH;
            }
            c0370k = C0370k.this;
            z2 = true;
            c0370k.k(z2);
            this.f2323a = zH;
        }

        /* synthetic */ d(C0370k c0370k, a aVar) {
            this();
        }
    }

    C0370k(Context context) {
        AbstractC0386b.d(context != null, "Context must be non-null", new Object[0]);
        this.f2314a = context;
        this.f2315b = (ConnectivityManager) context.getSystemService("connectivity");
        f();
        g();
    }

    private void f() {
        Application application = (Application) this.f2314a.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new a(atomicBoolean));
        application.registerComponentCallbacks(new b(atomicBoolean));
    }

    private void g() {
        Runnable runnable;
        a aVar = null;
        if (Build.VERSION.SDK_INT < 24 || this.f2315b == null) {
            final d dVar = new d(this, aVar);
            this.f2314a.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            runnable = new Runnable() { // from class: I0.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2312a.j(dVar);
                }
            };
        } else {
            final c cVar = new c(this, aVar);
            this.f2315b.registerDefaultNetworkCallback(cVar);
            runnable = new Runnable() { // from class: I0.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2310a.i(cVar);
                }
            };
        }
        this.f2316c = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f2314a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(c cVar) {
        this.f2315b.unregisterNetworkCallback(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(d dVar) {
        this.f2314a.unregisterReceiver(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(boolean z2) {
        synchronized (this.f2317d) {
            try {
                Iterator it = this.f2317d.iterator();
                while (it.hasNext()) {
                    ((J0.n) it.next()).accept(z2 ? InterfaceC0374o.a.REACHABLE : InterfaceC0374o.a.UNREACHABLE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I0.InterfaceC0374o
    public void a(J0.n nVar) {
        synchronized (this.f2317d) {
            this.f2317d.add(nVar);
        }
    }

    public void l() {
        J0.A.a("AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (h()) {
            k(true);
        }
    }

    @Override // I0.InterfaceC0374o
    public void shutdown() {
        Runnable runnable = this.f2316c;
        if (runnable != null) {
            runnable.run();
            this.f2316c = null;
        }
    }

    /* JADX INFO: renamed from: I0.k$a */
    class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f2318a;

        a(AtomicBoolean atomicBoolean) {
            this.f2318a = atomicBoolean;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f2318a.compareAndSet(true, false)) {
                C0370k.this.l();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (this.f2318a.compareAndSet(true, false)) {
                C0370k.this.l();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f2318a.compareAndSet(true, false)) {
                C0370k.this.l();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: I0.k$b */
    class b implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f2320a;

        b(AtomicBoolean atomicBoolean) {
            this.f2320a = atomicBoolean;
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i3) {
            if (i3 == 20) {
                this.f2320a.set(true);
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }
}
