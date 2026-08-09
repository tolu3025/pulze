package I0;

import k0.C1001o;
import y1.Z;

/* JADX INFO: renamed from: I0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0378t implements J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Z.g f2359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Z.g f2360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Z.g f2361f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L0.b f2362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L0.b f2363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1001o f2364c;

    static {
        Z.d dVar = y1.Z.f11842e;
        f2359d = Z.g.e("x-firebase-client-log-type", dVar);
        f2360e = Z.g.e("x-firebase-client", dVar);
        f2361f = Z.g.e("x-firebase-gmpid", dVar);
    }

    public C0378t(L0.b bVar, L0.b bVar2, C1001o c1001o) {
        this.f2363b = bVar;
        this.f2362a = bVar2;
        this.f2364c = c1001o;
    }

    private void b(y1.Z z2) {
        C1001o c1001o = this.f2364c;
        if (c1001o == null) {
            return;
        }
        String strC = c1001o.c();
        if (strC.length() != 0) {
            z2.p(f2361f, strC);
        }
    }

    @Override // I0.J
    public void a(y1.Z z2) {
        if (this.f2362a.get() == null || this.f2363b.get() == null) {
            return;
        }
        int iE = ((K0.j) this.f2362a.get()).b("fire-fst").e();
        if (iE != 0) {
            z2.p(f2359d, Integer.toString(iE));
        }
        z2.p(f2360e, ((O0.i) this.f2363b.get()).a());
        b(z2);
    }
}
