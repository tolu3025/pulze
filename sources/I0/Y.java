package I0;

import A0.C0215m;
import J0.AbstractC0386b;
import com.google.protobuf.AbstractC0791i;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2235a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f2236b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2237c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC0791i f2238d = AbstractC0791i.f6770b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2239e = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2240a;

        static {
            int[] iArr = new int[C0215m.a.values().length];
            f2240a = iArr;
            try {
                iArr[C0215m.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2240a[C0215m.a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2240a[C0215m.a.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    Y() {
    }

    void a(D0.l lVar, C0215m.a aVar) {
        this.f2237c = true;
        this.f2236b.put(lVar, aVar);
    }

    void b() {
        this.f2237c = false;
        this.f2236b.clear();
    }

    boolean c() {
        return this.f2237c;
    }

    boolean d() {
        return this.f2239e;
    }

    boolean e() {
        return this.f2235a != 0;
    }

    void f() {
        this.f2237c = true;
        this.f2239e = true;
    }

    void g() {
        this.f2235a++;
    }

    void h() {
        this.f2235a--;
    }

    void i(D0.l lVar) {
        this.f2237c = true;
        this.f2236b.remove(lVar);
    }

    X j() {
        t0.e eVarH = D0.l.h();
        t0.e eVarH2 = D0.l.h();
        t0.e eVarH3 = D0.l.h();
        t0.e eVarD = eVarH;
        t0.e eVarD2 = eVarH2;
        t0.e eVarD3 = eVarH3;
        for (Map.Entry entry : this.f2236b.entrySet()) {
            D0.l lVar = (D0.l) entry.getKey();
            C0215m.a aVar = (C0215m.a) entry.getValue();
            int i3 = a.f2240a[aVar.ordinal()];
            if (i3 == 1) {
                eVarD = eVarD.d(lVar);
            } else if (i3 == 2) {
                eVarD2 = eVarD2.d(lVar);
            } else {
                if (i3 != 3) {
                    throw AbstractC0386b.a("Encountered invalid change type: %s", aVar);
                }
                eVarD3 = eVarD3.d(lVar);
            }
        }
        return new X(this.f2238d, this.f2239e, eVarD, eVarD2, eVarD3);
    }

    void k(AbstractC0791i abstractC0791i) {
        if (abstractC0791i.isEmpty()) {
            return;
        }
        this.f2237c = true;
        this.f2238d = abstractC0791i;
    }
}
