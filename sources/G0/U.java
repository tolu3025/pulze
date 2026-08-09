package G0;

import G0.F0;
import G0.M;
import J0.AbstractC0386b;
import J1.AbstractC0406j;
import V0.I;
import com.google.protobuf.AbstractC0791i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U1.l f1705a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U1.l f1706b = new U1.l() { // from class: G0.S
        @Override // U1.l
        public final Object invoke(Object obj) {
            return U.d((List) obj);
        }
    };

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1707a;

        static {
            int[] iArr = new int[I.c.values().length];
            try {
                iArr[I.c.STRING_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I.c.BYTES_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I.c.ARRAY_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[I.c.MAP_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1707a = iArr;
        }
    }

    public static final class b implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1708a;

            public a(U1.l lVar) {
                this.f1708a = lVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                M.a aVar;
                int iCodePointCount;
                kotlin.jvm.internal.m.e(input, "input");
                try {
                    M m3 = (M) this.f1708a.invoke(input);
                    if (!m3.g()) {
                        V0.I iF = m3.f();
                        I.c cVarB0 = iF != null ? iF.B0() : null;
                        int i3 = -1;
                        int i4 = cVarB0 == null ? -1 : F0.a.f1644a[cVarB0.ordinal()];
                        if (i4 == -1 || i4 == 1) {
                            return M.f1683a.g();
                        }
                        V0.I iF2 = m3.f();
                        kotlin.jvm.internal.m.b(iF2);
                        I.c cVarB02 = iF2.B0();
                        if (cVarB02 != null) {
                            i3 = a.f1707a[cVarB02.ordinal()];
                        }
                        if (i3 == 1) {
                            aVar = M.f1683a;
                            String strZ0 = iF2.z0();
                            kotlin.jvm.internal.m.d(strZ0, "getStringValue(...)");
                            iCodePointCount = strZ0.codePointCount(0, iF2.z0().length());
                        } else if (i3 == 2) {
                            aVar = M.f1683a;
                            iCodePointCount = iF2.q0().size();
                        } else if (i3 == 3) {
                            aVar = M.f1683a;
                            iCodePointCount = iF2.o0().i0();
                        } else if (i3 == 4) {
                            if (D0.z.Z(iF2)) {
                                return M.f1683a.k(U.h(iF2));
                            }
                            aVar = M.f1683a;
                            iCodePointCount = iF2.x0().d0().size();
                        }
                        return aVar.j(iCodePointCount);
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
            if (params.size() == 1) {
                return new a((U1.l) params.get(0));
            }
            throw AbstractC0386b.a("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    private static final P c(List list) {
        M.a aVar = M.f1683a;
        ArrayList arrayList = new ArrayList(J1.q.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0791i) it.next()).F());
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            byte[] bArr2 = (byte[]) next;
            kotlin.jvm.internal.m.b(bArr2);
            kotlin.jvm.internal.m.b(bArr);
            next = AbstractC0406j.k(bArr2, bArr);
        }
        kotlin.jvm.internal.m.d(next, "reduce(...)");
        return aVar.o(D0.z.L((byte[]) next));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l d(final List params) {
        kotlin.jvm.internal.m.e(params, "params");
        return new U1.l() { // from class: G0.T
            @Override // U1.l
            public final Object invoke(Object obj) {
                return U.e(params, (D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M e(List list, D0.s input) {
        int i3;
        boolean z2 = false;
        kotlin.jvm.internal.m.e(input, "input");
        if (list.size() < 2) {
            throw AbstractC0386b.a("Function should have at least 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        V0.I iF = null;
        while (true) {
            if (!it.hasNext()) {
                if (z2) {
                    return M.f1683a.g();
                }
                I.c cVarB0 = iF != null ? iF.B0() : null;
                i3 = cVarB0 != null ? a.f1707a[cVarB0.ordinal()] : -1;
                if (i3 == 1) {
                    M.a aVar = M.f1683a;
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        sb.append(((V0.I) it2.next()).z0());
                    }
                    String string = sb.toString();
                    kotlin.jvm.internal.m.d(string, "toString(...)");
                    return aVar.l(string);
                }
                if (i3 == 2) {
                    ArrayList arrayList2 = new ArrayList(J1.q.n(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((V0.I) it3.next()).q0());
                    }
                    return c(arrayList2);
                }
                if (i3 != 3) {
                    throw new IllegalStateException("Unreachable");
                }
                ArrayList arrayList3 = new ArrayList(J1.q.n(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((V0.I) it4.next()).o0().g());
                }
                return F.G(arrayList3);
            }
            M m3 = (M) ((U1.l) it.next()).invoke(input);
            if (m3 instanceof N) {
                return N.f1689g;
            }
            if ((m3 instanceof O) || kotlin.jvm.internal.m.a(m3, M.f1683a.g())) {
                z2 = true;
            } else {
                if (iF == null) {
                    V0.I iF2 = m3.f();
                    I.c cVarB02 = iF2 != null ? iF2.B0() : null;
                    i3 = cVarB02 != null ? a.f1707a[cVarB02.ordinal()] : -1;
                    if (i3 != 1 && i3 != 2 && i3 != 3) {
                        return N.f1689g;
                    }
                    iF = m3.f();
                } else {
                    I.c cVarB03 = iF.B0();
                    V0.I iF3 = m3.f();
                    if (cVarB03 != (iF3 != null ? iF3.B0() : null)) {
                        return N.f1689g;
                    }
                }
                V0.I iF4 = m3.f();
                kotlin.jvm.internal.m.b(iF4);
                arrayList.add(iF4);
            }
        }
    }

    public static final U1.l f() {
        return f1706b;
    }

    public static final U1.l g() {
        return f1705a;
    }

    public static final long h(V0.I value) {
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.b(value.x0().d0().get("value"));
        return ((V0.I) r2).o0().i0();
    }
}
