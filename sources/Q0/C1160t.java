package q0;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zze;
import k0.C0992f;

/* JADX INFO: renamed from: q0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1160t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static P.a f10776h = new P.a("TokenRefresher", "FirebaseAuth:");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0992f f10777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile long f10778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile long f10779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f10780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HandlerThread f10781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Handler f10782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f10783g;

    public C1160t(C0992f c0992f) {
        f10776h.g("Initializing TokenRefresher", new Object[0]);
        C0992f c0992f2 = (C0992f) AbstractC0643s.k(c0992f);
        this.f10777a = c0992f2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f10781e = handlerThread;
        handlerThread.start();
        this.f10782f = new zze(this.f10781e.getLooper());
        this.f10783g = new RunnableC1163w(this, c0992f2.q());
        this.f10780d = 300000L;
    }

    public final void b() {
        this.f10782f.removeCallbacks(this.f10783g);
    }

    public final void c() {
        f10776h.g("Scheduling refresh for " + (this.f10778b - this.f10780d), new Object[0]);
        b();
        this.f10779c = Math.max((this.f10778b - com.google.android.gms.common.util.f.c().a()) - this.f10780d, 0L) / 1000;
        this.f10782f.postDelayed(this.f10783g, this.f10779c * 1000);
    }

    final void d() {
        int i3 = (int) this.f10779c;
        this.f10779c = (i3 == 30 || i3 == 60 || i3 == 120 || i3 == 240 || i3 == 480) ? 2 * this.f10779c : i3 != 960 ? 30L : 960L;
        this.f10778b = com.google.android.gms.common.util.f.c().a() + (this.f10779c * 1000);
        f10776h.g("Scheduling refresh for " + this.f10778b, new Object[0]);
        this.f10782f.postDelayed(this.f10783g, this.f10779c * 1000);
    }
}
