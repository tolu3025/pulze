package G0;

import J0.AbstractC0386b;
import V0.I;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: G0.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0340i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U1.l f1826a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U1.l f1827b = new U1.l() { // from class: G0.g0
        @Override // U1.l
        public final Object invoke(Object obj) {
            return AbstractC0340i0.c((List) obj);
        }
    };

    /* JADX INFO: renamed from: G0.i0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1828a;

        static {
            int[] iArr = new int[I.c.values().length];
            try {
                iArr[I.c.STRING_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f1828a = iArr;
        }
    }

    /* JADX INFO: renamed from: G0.i0$b */
    public static final class b implements U1.l {

        /* JADX INFO: renamed from: G0.i0$b$a */
        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1829a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1830b;

            public a(U1.l lVar, U1.l lVar2) {
                this.f1829a = lVar;
                this.f1830b = lVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1829a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1830b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                try {
                    V0.I iF = m3.f();
                    V0.I iF2 = m4.f();
                    Map mapD0 = (iF == null || !D0.z.T(iF) || D0.z.Z(iF)) ? null : iF.x0().d0();
                    I.c cVarB0 = iF2 != null ? iF2.B0() : null;
                    if (cVarB0 != null && a.f1828a[cVarB0.ordinal()] == 1) {
                        V0.I i3 = mapD0 != null ? (V0.I) mapD0.get(iF2.z0()) : null;
                        return i3 == null ? O.f1694g : new P(i3);
                    }
                    return N.f1689g;
                } catch (Exception unused) {
                    return N.f1689g;
                }
            }
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a((U1.l) params.get(0), (U1.l) params.get(1));
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l c(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        if (params.size() % 2 == 0) {
            return new U1.l() { // from class: G0.h0
                @Override // U1.l
                public final Object invoke(Object obj) {
                    return AbstractC0340i0.d(params, (D0.s) obj);
                }
            };
        }
        throw AbstractC0386b.a("Function should have even number of params, but %d were given.", Integer.valueOf(params.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M d(List list, D0.s input) {
        kotlin.jvm.internal.m.e(input, "input");
        HashMap map = new HashMap(list.size() / 2);
        int i3 = 0;
        int iB = P1.c.b(0, list.size() - 1, 2);
        if (iB >= 0) {
            while (true) {
                V0.I iF = ((M) ((U1.l) list.get(i3)).invoke(input)).f();
                if (iF != null) {
                    if (!iF.I0()) {
                        return N.f1689g;
                    }
                    V0.I iF2 = ((M) ((U1.l) list.get(i3 + 1)).invoke(input)).f();
                    if (iF2 != null) {
                        String strZ0 = iF.z0();
                        kotlin.jvm.internal.m.d(strZ0, "getStringValue(...)");
                        if (map.put(strZ0, iF2) == null) {
                            if (i3 == iB) {
                                break;
                            }
                            i3 += 2;
                        } else {
                            return N.f1689g;
                        }
                    } else {
                        return N.f1689g;
                    }
                } else {
                    return N.f1689g;
                }
            }
        }
        return new P(D0.z.I(map));
    }

    public static final U1.l e() {
        return f1827b;
    }

    public static final U1.l f() {
        return f1826a;
    }
}
