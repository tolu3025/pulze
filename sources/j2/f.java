package j2;

import c2.AbstractC0583q0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends AbstractC0583q0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f9426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f9427f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f9428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f9429m = Z();

    public f(int i3, int i4, long j3, String str) {
        this.f9425d = i3;
        this.f9426e = i4;
        this.f9427f = j3;
        this.f9428l = str;
    }

    private final a Z() {
        return new a(this.f9425d, this.f9426e, this.f9427f, this.f9428l);
    }

    @Override // c2.K
    public void U(M1.g gVar, Runnable runnable) {
        a.B(this.f9429m, runnable, false, false, 6, null);
    }

    @Override // c2.AbstractC0583q0
    public Executor Y() {
        return this.f9429m;
    }

    public final void a0(Runnable runnable, boolean z2, boolean z3) {
        this.f9429m.z(runnable, z2, z3);
    }
}
