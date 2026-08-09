package I0;

import A0.EnumC0201b0;
import J0.AbstractC0386b;
import J0.C0391g;
import java.util.Locale;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
class M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0391g.b f2174c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0391g f2176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f2177f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnumC0201b0 f2172a = EnumC0201b0.UNKNOWN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2175d = true;

    interface a {
        void a(EnumC0201b0 enumC0201b0);
    }

    M(C0391g c0391g, a aVar) {
        this.f2176e = c0391g;
        this.f2177f = aVar;
    }

    private void b() {
        C0391g.b bVar = this.f2174c;
        if (bVar != null) {
            bVar.c();
            this.f2174c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f2174c = null;
        AbstractC0386b.d(this.f2172a == EnumC0201b0.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        g(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", 10));
        h(EnumC0201b0.OFFLINE);
    }

    private void g(String str) {
        String str2 = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", str);
        if (!this.f2175d) {
            J0.A.a("OnlineStateTracker", "%s", str2);
        } else {
            J0.A.e("OnlineStateTracker", "%s", str2);
            this.f2175d = false;
        }
    }

    private void h(EnumC0201b0 enumC0201b0) {
        if (enumC0201b0 != this.f2172a) {
            this.f2172a = enumC0201b0;
            this.f2177f.a(enumC0201b0);
        }
    }

    EnumC0201b0 c() {
        return this.f2172a;
    }

    void d(l0 l0Var) {
        if (this.f2172a == EnumC0201b0.ONLINE) {
            h(EnumC0201b0.UNKNOWN);
            AbstractC0386b.d(this.f2173b == 0, "watchStreamFailures must be 0", new Object[0]);
            AbstractC0386b.d(this.f2174c == null, "onlineStateTimer must be null", new Object[0]);
            return;
        }
        int i3 = this.f2173b + 1;
        this.f2173b = i3;
        if (i3 >= 1) {
            b();
            g(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", 1, l0Var));
            h(EnumC0201b0.OFFLINE);
        }
    }

    void e() {
        if (this.f2173b == 0) {
            h(EnumC0201b0.UNKNOWN);
            AbstractC0386b.d(this.f2174c == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.f2174c = this.f2176e.k(C0391g.d.ONLINE_STATE_TIMEOUT, 10000L, new Runnable() { // from class: I0.L
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2171a.f();
                }
            });
        }
    }

    void i(EnumC0201b0 enumC0201b0) {
        b();
        this.f2173b = 0;
        if (enumC0201b0 == EnumC0201b0.ONLINE) {
            this.f2175d = false;
        }
        h(enumC0201b0);
    }
}
