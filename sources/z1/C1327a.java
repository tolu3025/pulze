package z1;

import A1.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import e0.AbstractC0829j;
import java.util.concurrent.TimeUnit;
import y1.AbstractC1304g;
import y1.AbstractC1322z;
import y1.C1300c;
import y1.EnumC1313p;
import y1.L;
import y1.V;
import y1.W;
import y1.X;
import y1.a0;

/* JADX INFO: renamed from: z1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1327a extends AbstractC1322z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final X f12103c = j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W f12104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f12105b;

    /* JADX INFO: renamed from: z1.a$b */
    static final class b extends V {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V f12106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f12107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ConnectivityManager f12108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f12109d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Runnable f12110e;

        /* JADX INFO: renamed from: z1.a$b$a, reason: collision with other inner class name */
        class RunnableC0196a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f12111a;

            RunnableC0196a(c cVar) {
                this.f12111a = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f12108c.unregisterNetworkCallback(this.f12111a);
            }
        }

        /* JADX INFO: renamed from: z1.a$b$b, reason: collision with other inner class name */
        class RunnableC0197b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f12113a;

            RunnableC0197b(d dVar) {
                this.f12113a = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f12107b.unregisterReceiver(this.f12113a);
            }
        }

        /* JADX INFO: renamed from: z1.a$b$c */
        private class c extends ConnectivityManager.NetworkCallback {
            private c() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b.this.f12106a.k();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean z2) {
                if (z2) {
                    return;
                }
                b.this.f12106a.k();
            }
        }

        /* JADX INFO: renamed from: z1.a$b$d */
        private class d extends BroadcastReceiver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f12116a;

            private d() {
                this.f12116a = false;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z2 = this.f12116a;
                boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f12116a = z3;
                if (!z3 || z2) {
                    return;
                }
                b.this.f12106a.k();
            }
        }

        b(V v2, Context context) {
            this.f12106a = v2;
            this.f12107b = context;
            if (context == null) {
                this.f12108c = null;
                return;
            }
            this.f12108c = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                s();
            } catch (SecurityException e3) {
                Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e3);
            }
        }

        private void s() {
            Runnable runnableC0197b;
            if (Build.VERSION.SDK_INT < 24 || this.f12108c == null) {
                d dVar = new d();
                this.f12107b.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                runnableC0197b = new RunnableC0197b(dVar);
            } else {
                c cVar = new c();
                this.f12108c.registerDefaultNetworkCallback(cVar);
                runnableC0197b = new RunnableC0196a(cVar);
            }
            this.f12110e = runnableC0197b;
        }

        private void t() {
            synchronized (this.f12109d) {
                try {
                    Runnable runnable = this.f12110e;
                    if (runnable != null) {
                        runnable.run();
                        this.f12110e = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // y1.AbstractC1301d
        public String a() {
            return this.f12106a.a();
        }

        @Override // y1.AbstractC1301d
        public AbstractC1304g e(a0 a0Var, C1300c c1300c) {
            return this.f12106a.e(a0Var, c1300c);
        }

        @Override // y1.V
        public boolean j(long j3, TimeUnit timeUnit) {
            return this.f12106a.j(j3, timeUnit);
        }

        @Override // y1.V
        public void k() {
            this.f12106a.k();
        }

        @Override // y1.V
        public EnumC1313p l(boolean z2) {
            return this.f12106a.l(z2);
        }

        @Override // y1.V
        public void m(EnumC1313p enumC1313p, Runnable runnable) {
            this.f12106a.m(enumC1313p, runnable);
        }

        @Override // y1.V
        public V n() {
            t();
            return this.f12106a.n();
        }

        @Override // y1.V
        public V o() {
            t();
            return this.f12106a.o();
        }
    }

    private C1327a(W w2) {
        this.f12104a = (W) AbstractC0829j.o(w2, "delegateBuilder");
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    private static X j() {
        try {
            try {
                X x2 = (X) g.class.asSubclass(X.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                if (L.a(x2)) {
                    return x2;
                }
                Log.w("AndroidChannelBuilder", "OkHttpChannelProvider.isAvailable() returned false");
                return null;
            } catch (Exception e3) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e3);
                return null;
            }
        } catch (ClassCastException e4) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e4);
            return null;
        }
    }

    public static C1327a k(W w2) {
        return new C1327a(w2);
    }

    @Override // y1.AbstractC1321y, y1.W
    public V a() {
        return new b(this.f12104a.a(), this.f12105b);
    }

    @Override // y1.AbstractC1322z, y1.AbstractC1321y
    protected W e() {
        return this.f12104a;
    }

    public C1327a i(Context context) {
        this.f12105b = context;
        return this;
    }
}
