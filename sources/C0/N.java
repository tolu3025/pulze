package C0;

import A0.C0215m;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0.e f854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t0.e f855d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f856a;

        static {
            int[] iArr = new int[C0215m.a.values().length];
            f856a = iArr;
            try {
                iArr[C0215m.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f856a[C0215m.a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public N(int i3, boolean z2, t0.e eVar, t0.e eVar2) {
        this.f852a = i3;
        this.f853b = z2;
        this.f854c = eVar;
        this.f855d = eVar2;
    }

    public static N a(int i3, A0.E0 e02) {
        t0.e eVar = new t0.e(new ArrayList(), D0.l.c());
        t0.e eVar2 = new t0.e(new ArrayList(), D0.l.c());
        for (C0215m c0215m : e02.d()) {
            int i4 = a.f856a[c0215m.c().ordinal()];
            if (i4 == 1) {
                eVar = eVar.d(c0215m.b().getKey());
            } else if (i4 == 2) {
                eVar2 = eVar2.d(c0215m.b().getKey());
            }
        }
        return new N(i3, e02.k(), eVar, eVar2);
    }

    public t0.e b() {
        return this.f854c;
    }

    public t0.e c() {
        return this.f855d;
    }

    public int d() {
        return this.f852a;
    }

    public boolean e() {
        return this.f853b;
    }
}
