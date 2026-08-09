package G0;

import G0.F0;
import G0.M;
import J0.AbstractC0386b;
import J0.D;
import V0.I;
import android.icu.lang.UCharacter;
import android.os.Build;
import com.google.android.gms.common.api.a;
import com.google.firebase.firestore.C0727g;
import com.google.protobuf.AbstractC0791i;
import e0.AbstractC0820a;
import f0.AbstractC0851j;
import h0.AbstractC0878c;
import i0.AbstractC0901a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U1.l f1835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U1.l f1836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U1.l f1837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final U1.l f1838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final U1.l f1839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final U1.l f1840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final U1.l f1841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final U1.l f1842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final U1.l f1843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final U1.l f1844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final U1.l f1845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final U1.l f1846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final U1.l f1847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final U1.l f1848n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final U1.l f1849o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final U1.l f1850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final U1.l f1851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final U1.l f1852r;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1853a;

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
            f1853a = iArr;
        }
    }

    static final class b implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f1854a = new b();

        b() {
        }

        @Override // U1.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final M invoke(String value, String like) {
            Y0.k kVarA;
            kotlin.jvm.internal.m.e(value, "value");
            kotlin.jvm.internal.m.e(like, "like");
            try {
                kVarA = Y0.k.a(n0.C(like));
            } catch (Exception unused) {
                kVarA = null;
            }
            return kVarA == null ? N.f1689g : M.f1683a.b(kVarA.d(value));
        }
    }

    static final class c implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f1855a = new c();

        c() {
        }

        @Override // U1.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final M invoke(String value, String patternString) {
            Y0.k kVarA;
            kotlin.jvm.internal.m.e(value, "value");
            kotlin.jvm.internal.m.e(patternString, "patternString");
            try {
                kVarA = Y0.k.a(patternString);
            } catch (Exception unused) {
                kVarA = null;
            }
            return kVarA == null ? N.f1689g : M.f1683a.b(kVarA.c(value).b());
        }
    }

    static final class d implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f1856a = new d();

        d() {
        }

        @Override // U1.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final M invoke(String value, String patternString) {
            Y0.k kVarA;
            kotlin.jvm.internal.m.e(value, "value");
            kotlin.jvm.internal.m.e(patternString, "patternString");
            try {
                kVarA = Y0.k.a(patternString);
            } catch (Exception unused) {
                kVarA = null;
            }
            if (kVarA != null) {
                Y0.h hVarC = kVarA.c(value);
                if (!hVarC.b()) {
                    return M.f1683a.g();
                }
                try {
                    M.a aVar = M.f1683a;
                    D.a aVar2 = J0.D.f2426a;
                    kotlin.jvm.internal.m.b(hVarC);
                    return aVar.o(aVar2.a(hVarC));
                } catch (IllegalArgumentException unused2) {
                }
            }
            return N.f1689g;
        }
    }

    static final class e implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f1857a = new e();

        e() {
        }

        @Override // U1.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final M invoke(String value, String patternString) {
            Y0.k kVarA;
            kotlin.jvm.internal.m.e(value, "value");
            kotlin.jvm.internal.m.e(patternString, "patternString");
            try {
                kVarA = Y0.k.a(patternString);
            } catch (Exception unused) {
                kVarA = null;
            }
            if (kVarA != null) {
                AbstractC0851j.a aVarP = AbstractC0851j.p();
                Y0.h hVarC = kVarA.c(value);
                while (hVarC.b()) {
                    try {
                        D.a aVar = J0.D.f2426a;
                        kotlin.jvm.internal.m.b(hVarC);
                        aVarP.a(aVar.a(hVarC));
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                M.a aVar2 = M.f1683a;
                AbstractC0851j abstractC0851jH = aVarP.h();
                kotlin.jvm.internal.m.d(abstractC0851jH, "build(...)");
                return aVar2.i(abstractC0851jH);
            }
            return N.f1689g;
        }
    }

    static final class f implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f1858a = new f();

        f() {
        }

        @Override // U1.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final M invoke(String value, String patternString) {
            Y0.k kVarA;
            kotlin.jvm.internal.m.e(value, "value");
            kotlin.jvm.internal.m.e(patternString, "patternString");
            try {
                kVarA = Y0.k.a(patternString);
            } catch (Exception unused) {
                kVarA = null;
            }
            return kVarA == null ? N.f1689g : M.f1683a.b(kVarA.d(value));
        }
    }

    public static final class g implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ I.c f1860b;

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1861a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1862b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I.c f1863c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ I.c f1864d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ U1.p f1865e;

            public a(U1.l lVar, U1.l lVar2, I.c cVar, I.c cVar2, U1.p pVar) {
                this.f1861a = lVar;
                this.f1862b = lVar2;
                this.f1863c = cVar;
                this.f1864d = cVar2;
                this.f1865e = pVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                V0.I iF;
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1861a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1862b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                V0.I iF2 = m3.f();
                V0.I iF3 = null;
                I.c cVarB0 = iF2 != null ? iF2.B0() : null;
                int i3 = cVarB0 == null ? -1 : H0.f1670a[cVarB0.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    iF = null;
                } else {
                    if (cVarB0 != this.f1863c) {
                        return N.f1689g;
                    }
                    iF = m3.f();
                }
                V0.I iF4 = m4.f();
                I.c cVarB02 = iF4 != null ? iF4.B0() : null;
                int i4 = cVarB02 == null ? -1 : H0.f1670a[cVarB02.ordinal()];
                if (i4 != -1 && i4 != 1) {
                    if (cVarB02 != this.f1864d) {
                        return N.f1689g;
                    }
                    iF3 = m4.f();
                }
                return (iF == null || iF3 == null) ? M.f1683a.g() : (M) this.f1865e.invoke(iF.z0(), iF3.z0());
            }
        }

        public g(I.c cVar, I.c cVar2) {
            this.f1859a = cVar;
            this.f1860b = cVar2;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a((U1.l) params.get(0), (U1.l) params.get(1), this.f1859a, this.f1860b, c.f1855a);
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class h implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ I.c f1867b;

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1868a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1869b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I.c f1870c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ I.c f1871d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ U1.p f1872e;

            public a(U1.l lVar, U1.l lVar2, I.c cVar, I.c cVar2, U1.p pVar) {
                this.f1868a = lVar;
                this.f1869b = lVar2;
                this.f1870c = cVar;
                this.f1871d = cVar2;
                this.f1872e = pVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                V0.I iF;
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1868a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1869b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                V0.I iF2 = m3.f();
                V0.I iF3 = null;
                I.c cVarB0 = iF2 != null ? iF2.B0() : null;
                int i3 = cVarB0 == null ? -1 : H0.f1670a[cVarB0.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    iF = null;
                } else {
                    if (cVarB0 != this.f1870c) {
                        return N.f1689g;
                    }
                    iF = m3.f();
                }
                V0.I iF4 = m4.f();
                I.c cVarB02 = iF4 != null ? iF4.B0() : null;
                int i4 = cVarB02 == null ? -1 : H0.f1670a[cVarB02.ordinal()];
                if (i4 != -1 && i4 != 1) {
                    if (cVarB02 != this.f1871d) {
                        return N.f1689g;
                    }
                    iF3 = m4.f();
                }
                return (iF == null || iF3 == null) ? M.f1683a.g() : (M) this.f1872e.invoke(iF.z0(), iF3.z0());
            }
        }

        public h(I.c cVar, I.c cVar2) {
            this.f1866a = cVar;
            this.f1867b = cVar2;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a((U1.l) params.get(0), (U1.l) params.get(1), this.f1866a, this.f1867b, f.f1858a);
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class i implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ I.c f1874b;

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1875a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1876b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I.c f1877c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ I.c f1878d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ U1.p f1879e;

            public a(U1.l lVar, U1.l lVar2, I.c cVar, I.c cVar2, U1.p pVar) {
                this.f1875a = lVar;
                this.f1876b = lVar2;
                this.f1877c = cVar;
                this.f1878d = cVar2;
                this.f1879e = pVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                V0.I iF;
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1875a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1876b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                V0.I iF2 = m3.f();
                V0.I iF3 = null;
                I.c cVarB0 = iF2 != null ? iF2.B0() : null;
                int i3 = cVarB0 == null ? -1 : H0.f1670a[cVarB0.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    iF = null;
                } else {
                    if (cVarB0 != this.f1877c) {
                        return N.f1689g;
                    }
                    iF = m3.f();
                }
                V0.I iF4 = m4.f();
                I.c cVarB02 = iF4 != null ? iF4.B0() : null;
                int i4 = cVarB02 == null ? -1 : H0.f1670a[cVarB02.ordinal()];
                if (i4 != -1 && i4 != 1) {
                    if (cVarB02 != this.f1878d) {
                        return N.f1689g;
                    }
                    iF3 = m4.f();
                }
                return (iF == null || iF3 == null) ? M.f1683a.g() : (M) this.f1879e.invoke(iF.z0(), iF3.z0());
            }
        }

        public i(I.c cVar, I.c cVar2) {
            this.f1873a = cVar;
            this.f1874b = cVar2;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a((U1.l) params.get(0), (U1.l) params.get(1), this.f1873a, this.f1874b, d.f1856a);
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class j implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ I.c f1881b;

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1882a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1883b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I.c f1884c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ I.c f1885d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ U1.p f1886e;

            public a(U1.l lVar, U1.l lVar2, I.c cVar, I.c cVar2, U1.p pVar) {
                this.f1882a = lVar;
                this.f1883b = lVar2;
                this.f1884c = cVar;
                this.f1885d = cVar2;
                this.f1886e = pVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                V0.I iF;
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1882a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1883b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                V0.I iF2 = m3.f();
                V0.I iF3 = null;
                I.c cVarB0 = iF2 != null ? iF2.B0() : null;
                int i3 = cVarB0 == null ? -1 : H0.f1670a[cVarB0.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    iF = null;
                } else {
                    if (cVarB0 != this.f1884c) {
                        return N.f1689g;
                    }
                    iF = m3.f();
                }
                V0.I iF4 = m4.f();
                I.c cVarB02 = iF4 != null ? iF4.B0() : null;
                int i4 = cVarB02 == null ? -1 : H0.f1670a[cVarB02.ordinal()];
                if (i4 != -1 && i4 != 1) {
                    if (cVarB02 != this.f1885d) {
                        return N.f1689g;
                    }
                    iF3 = m4.f();
                }
                return (iF == null || iF3 == null) ? M.f1683a.g() : (M) this.f1886e.invoke(iF.z0(), iF3.z0());
            }
        }

        public j(I.c cVar, I.c cVar2) {
            this.f1880a = cVar;
            this.f1881b = cVar2;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a((U1.l) params.get(0), (U1.l) params.get(1), this.f1880a, this.f1881b, e.f1857a);
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class k implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ I.c f1888b;

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1889a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1890b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I.c f1891c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ I.c f1892d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ U1.p f1893e;

            public a(U1.l lVar, U1.l lVar2, I.c cVar, I.c cVar2, U1.p pVar) {
                this.f1889a = lVar;
                this.f1890b = lVar2;
                this.f1891c = cVar;
                this.f1892d = cVar2;
                this.f1893e = pVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                V0.I iF;
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1889a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                M m4 = (M) this.f1890b.invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                V0.I iF2 = m3.f();
                V0.I iF3 = null;
                I.c cVarB0 = iF2 != null ? iF2.B0() : null;
                int i3 = cVarB0 == null ? -1 : H0.f1670a[cVarB0.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    iF = null;
                } else {
                    if (cVarB0 != this.f1891c) {
                        return N.f1689g;
                    }
                    iF = m3.f();
                }
                V0.I iF4 = m4.f();
                I.c cVarB02 = iF4 != null ? iF4.B0() : null;
                int i4 = cVarB02 == null ? -1 : H0.f1670a[cVarB02.ordinal()];
                if (i4 != -1 && i4 != 1) {
                    if (cVarB02 != this.f1892d) {
                        return N.f1689g;
                    }
                    iF3 = m4.f();
                }
                return (iF == null || iF3 == null) ? M.f1683a.g() : (M) this.f1893e.invoke(iF.z0(), iF3.z0());
            }
        }

        public k(I.c cVar, I.c cVar2) {
            this.f1887a = cVar;
            this.f1888b = cVar2;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a((U1.l) params.get(0), (U1.l) params.get(1), this.f1887a, this.f1888b, b.f1854a);
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class l implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ I.c f1895b;

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f1896a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ I.c f1897b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I.c f1898c;

            public a(List list, I.c cVar, I.c cVar2) {
                this.f1896a = list;
                this.f1897b = cVar;
                this.f1898c = cVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) ((U1.l) this.f1896a.get(0)).invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                V0.I iF = m3.f();
                M m4 = (M) ((U1.l) this.f1896a.get(1)).invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                V0.I iF2 = m4.f();
                I.c cVarB0 = iF != null ? iF.B0() : null;
                int i3 = cVarB0 == null ? -1 : I0.f1671a[cVarB0.ordinal()];
                if (i3 != -1 && i3 != 1) {
                    if (cVarB0 != this.f1897b) {
                        return N.f1689g;
                    }
                    I.c cVarB02 = iF2 != null ? iF2.B0() : null;
                    int i4 = cVarB02 == null ? -1 : I0.f1671a[cVarB02.ordinal()];
                    if (i4 != -1 && i4 != 1) {
                        if (cVarB02 != this.f1898c) {
                            return N.f1689g;
                        }
                        try {
                            return M.f1683a.b(b2.p.s(iF.z0(), iF2.z0(), false, 2, null));
                        } catch (Exception unused) {
                            return N.f1689g;
                        }
                    }
                }
                return M.f1683a.g();
            }
        }

        public l(I.c cVar, I.c cVar2) {
            this.f1894a = cVar;
            this.f1895b = cVar2;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a(params, this.f1894a, this.f1895b);
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class m implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ I.c f1900b;

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f1901a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ I.c f1902b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I.c f1903c;

            public a(List list, I.c cVar, I.c cVar2) {
                this.f1901a = list;
                this.f1902b = cVar;
                this.f1903c = cVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) ((U1.l) this.f1901a.get(0)).invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                V0.I iF = m3.f();
                M m4 = (M) ((U1.l) this.f1901a.get(1)).invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                V0.I iF2 = m4.f();
                I.c cVarB0 = iF != null ? iF.B0() : null;
                int i3 = cVarB0 == null ? -1 : I0.f1671a[cVarB0.ordinal()];
                if (i3 != -1 && i3 != 1) {
                    if (cVarB0 != this.f1902b) {
                        return N.f1689g;
                    }
                    I.c cVarB02 = iF2 != null ? iF2.B0() : null;
                    int i4 = cVarB02 == null ? -1 : I0.f1671a[cVarB02.ordinal()];
                    if (i4 != -1 && i4 != 1) {
                        if (cVarB02 != this.f1903c) {
                            return N.f1689g;
                        }
                        try {
                            return M.f1683a.b(b2.o.p(iF.z0(), iF2.z0(), false, 2, null));
                        } catch (Exception unused) {
                            return N.f1689g;
                        }
                    }
                }
                return M.f1683a.g();
            }
        }

        public m(I.c cVar, I.c cVar2) {
            this.f1899a = cVar;
            this.f1900b = cVar2;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a(params, this.f1899a, this.f1900b);
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class n implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ I.c f1905b;

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f1906a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ I.c f1907b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I.c f1908c;

            public a(List list, I.c cVar, I.c cVar2) {
                this.f1906a = list;
                this.f1907b = cVar;
                this.f1908c = cVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) ((U1.l) this.f1906a.get(0)).invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                V0.I iF = m3.f();
                M m4 = (M) ((U1.l) this.f1906a.get(1)).invoke(input);
                if (m4.g()) {
                    return N.f1689g;
                }
                V0.I iF2 = m4.f();
                I.c cVarB0 = iF != null ? iF.B0() : null;
                int i3 = cVarB0 == null ? -1 : I0.f1671a[cVarB0.ordinal()];
                if (i3 != -1 && i3 != 1) {
                    if (cVarB0 != this.f1907b) {
                        return N.f1689g;
                    }
                    I.c cVarB02 = iF2 != null ? iF2.B0() : null;
                    int i4 = cVarB02 == null ? -1 : I0.f1671a[cVarB02.ordinal()];
                    if (i4 != -1 && i4 != 1) {
                        if (cVarB02 != this.f1908c) {
                            return N.f1689g;
                        }
                        try {
                            return M.f1683a.b(b2.o.k(iF.z0(), iF2.z0(), false, 2, null));
                        } catch (Exception unused) {
                            return N.f1689g;
                        }
                    }
                }
                return M.f1683a.g();
            }
        }

        public n(I.c cVar, I.c cVar2) {
            this.f1904a = cVar;
            this.f1905b = cVar2;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 2) {
                return new a(params, this.f1904a, this.f1905b);
            }
            throw AbstractC0386b.a("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class o implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1909a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f1910b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ U1.l f1911c;

            /* JADX INFO: renamed from: G0.n0$o$a$a, reason: collision with other inner class name */
            public static final class C0033a implements U1.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ U1.l f1912a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ D0.s f1913b;

                public C0033a(U1.l lVar, D0.s sVar) {
                    this.f1912a = lVar;
                    this.f1913b = sVar;
                }

                @Override // U1.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final M invoke() {
                    return (M) this.f1912a.invoke(this.f1913b);
                }
            }

            public static final class b implements U1.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ U1.l f1914a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ D0.s f1915b;

                public b(U1.l lVar, D0.s sVar) {
                    this.f1914a = lVar;
                    this.f1915b = sVar;
                }

                @Override // U1.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final M invoke() {
                    return (M) this.f1914a.invoke(this.f1915b);
                }
            }

            public static final class c implements U1.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ U1.l f1916a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ D0.s f1917b;

                public c(U1.l lVar, D0.s sVar) {
                    this.f1916a = lVar;
                    this.f1917b = sVar;
                }

                @Override // U1.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final M invoke() {
                    return (M) this.f1916a.invoke(this.f1917b);
                }
            }

            public a(U1.l lVar, U1.l lVar2, U1.l lVar3) {
                this.f1909a = lVar;
                this.f1910b = lVar2;
                this.f1911c = lVar3;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                M.a aVar;
                String string;
                kotlin.jvm.internal.m.e(input, "input");
                U1.l lVar = this.f1909a;
                U1.l lVar2 = this.f1910b;
                U1.l lVar3 = this.f1911c;
                try {
                    C0033a c0033a = new C0033a(lVar, input);
                    b bVar = new b(lVar2, input);
                    c cVar = new c(lVar3, input);
                    Long lZ = n0.z((M) bVar.invoke());
                    if (lZ != null) {
                        long jLongValue = lZ.longValue();
                        Long lZ2 = n0.z((M) cVar.invoke());
                        if (lZ2 != null) {
                            long jLongValue2 = lZ2.longValue();
                            long j3 = 0;
                            if (jLongValue2 >= 0) {
                                V0.I iF = ((M) c0033a.invoke()).f();
                                I.c cVarB0 = iF != null ? iF.B0() : null;
                                int i3 = cVarB0 == null ? -1 : a.f1853a[cVarB0.ordinal()];
                                if (i3 == 1) {
                                    String strZ0 = iF.z0();
                                    if (jLongValue < 0) {
                                        kotlin.jvm.internal.m.b(strZ0);
                                        jLongValue = Math.max(0L, ((long) strZ0.codePointCount(0, strZ0.length())) + jLongValue);
                                    }
                                    kotlin.jvm.internal.m.b(strZ0);
                                    if (jLongValue >= strZ0.codePointCount(0, strZ0.length())) {
                                        aVar = M.f1683a;
                                        string = "";
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        int iOffsetByCodePoints = strZ0.offsetByCodePoints(0, (int) Math.min(jLongValue, 2147483647L));
                                        while (true) {
                                            if (j3 >= jLongValue2) {
                                                aVar = M.f1683a;
                                                string = sb.toString();
                                                break;
                                            }
                                            if (iOffsetByCodePoints >= strZ0.length()) {
                                                aVar = M.f1683a;
                                                string = sb.toString();
                                                break;
                                            }
                                            sb.append(Character.toChars(strZ0.codePointAt(iOffsetByCodePoints)));
                                            iOffsetByCodePoints = strZ0.offsetByCodePoints(iOffsetByCodePoints, 1);
                                            j3++;
                                        }
                                        kotlin.jvm.internal.m.d(string, "toString(...)");
                                    }
                                    return aVar.l(string);
                                }
                                if (i3 == 2) {
                                    AbstractC0791i abstractC0791iQ0 = iF.q0();
                                    int size = abstractC0791iQ0.size();
                                    int i4 = size - 1;
                                    if (jLongValue < 0) {
                                        jLongValue = Math.max(0L, ((long) i4) + jLongValue + 1);
                                    }
                                    if (i4 < jLongValue) {
                                        return M.f1683a.o(D0.z.L(new byte[0]));
                                    }
                                    int iMin = Math.min(a.e.API_PRIORITY_OTHER, Math.min(AbstractC0878c.e(AbstractC0901a.a(jLongValue), AbstractC0901a.a(jLongValue2)), size));
                                    M.a aVar2 = M.f1683a;
                                    C0727g c0727gE = C0727g.e(abstractC0791iQ0.E((int) jLongValue, iMin));
                                    kotlin.jvm.internal.m.d(c0727gE, "fromByteString(...)");
                                    return aVar2.o(D0.z.z(c0727gE));
                                }
                            }
                        }
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
            if (params.size() == 3) {
                return new a((U1.l) params.get(0), (U1.l) params.get(1), (U1.l) params.get(2));
            }
            throw AbstractC0386b.a("Function should have exactly 3 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class p implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ I.c f1919b;

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1920a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ I.c f1921b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ I.c f1922c;

            public a(U1.l lVar, I.c cVar, I.c cVar2) {
                this.f1920a = lVar;
                this.f1921b = cVar;
                this.f1922c = cVar2;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                M.a aVar;
                int length;
                kotlin.jvm.internal.m.e(input, "input");
                M m3 = (M) this.f1920a.invoke(input);
                if (m3.g()) {
                    return N.f1689g;
                }
                V0.I iF = m3.f();
                I.c cVarB0 = iF != null ? iF.B0() : null;
                int i3 = cVarB0 == null ? -1 : J0.f1679a[cVarB0.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    return M.f1683a.g();
                }
                if (cVarB0 != this.f1921b) {
                    if (cVarB0 == this.f1922c) {
                        String strZ0 = iF.z0();
                        aVar = M.f1683a;
                        byte[] bytes = strZ0.getBytes(b2.c.f4952b);
                        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
                        length = bytes.length;
                    }
                    return N.f1689g;
                }
                AbstractC0791i abstractC0791iQ0 = iF.q0();
                aVar = M.f1683a;
                length = abstractC0791iQ0.size();
                return aVar.j(length);
            }
        }

        public p(I.c cVar, I.c cVar2) {
            this.f1918a = cVar;
            this.f1919b = cVar2;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 1) {
                return new a((U1.l) params.get(0), this.f1918a, this.f1919b);
            }
            throw AbstractC0386b.a("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class q implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1923a;

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1924a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ I.c f1925b;

            public a(U1.l lVar, I.c cVar) {
                this.f1924a = lVar;
                this.f1925b = cVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                try {
                    M m3 = (M) this.f1924a.invoke(input);
                    if (!m3.g()) {
                        V0.I iF = m3.f();
                        I.c cVarB0 = iF != null ? iF.B0() : null;
                        int i3 = cVarB0 == null ? -1 : F0.a.f1644a[cVarB0.ordinal()];
                        if (i3 != -1 && i3 != 1) {
                            if (cVarB0 == this.f1925b) {
                                try {
                                    String strZ0 = iF.z0();
                                    return M.f1683a.j(strZ0.codePointCount(0, strZ0.length()));
                                } catch (Exception unused) {
                                }
                            }
                        }
                        return M.f1683a.g();
                    }
                    return N.f1689g;
                } catch (Exception unused2) {
                    return N.f1689g;
                }
            }
        }

        public q(I.c cVar) {
            this.f1923a = cVar;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            if (params.size() == 1) {
                return new a((U1.l) params.get(0), this.f1923a);
            }
            throw AbstractC0386b.a("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class r implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1926a;

            public a(U1.l lVar) {
                this.f1926a = lVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                try {
                    M m3 = (M) this.f1926a.invoke(input);
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
                            i3 = a.f1853a[cVarB02.ordinal()];
                        }
                        if (i3 == 1) {
                            M.a aVar = M.f1683a;
                            String strZ0 = iF2.z0();
                            kotlin.jvm.internal.m.d(strZ0, "getStringValue(...)");
                            String lowerCase = strZ0.toLowerCase(Locale.ROOT);
                            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                            return aVar.l(lowerCase);
                        }
                        if (i3 == 2) {
                            byte[] bArrF = iF2.q0().F();
                            kotlin.jvm.internal.m.d(bArrF, "toByteArray(...)");
                            int length = bArrF.length;
                            for (int i5 = 0; i5 < length; i5++) {
                                bArrF[i5] = n0.B(bArrF[i5]) ? (byte) n0.E(bArrF[i5]) : bArrF[i5];
                            }
                            return M.f1683a.o(D0.z.L(bArrF));
                        }
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

    public static final class s implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1927a;

            public a(U1.l lVar) {
                this.f1927a = lVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                try {
                    M m3 = (M) this.f1927a.invoke(input);
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
                            i3 = a.f1853a[cVarB02.ordinal()];
                        }
                        if (i3 == 1) {
                            M.a aVar = M.f1683a;
                            String strZ0 = iF2.z0();
                            kotlin.jvm.internal.m.d(strZ0, "getStringValue(...)");
                            String upperCase = strZ0.toUpperCase(Locale.ROOT);
                            kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                            return aVar.l(upperCase);
                        }
                        if (i3 == 2) {
                            byte[] bArrF = iF2.q0().F();
                            kotlin.jvm.internal.m.d(bArrF, "toByteArray(...)");
                            int length = bArrF.length;
                            for (int i5 = 0; i5 < length; i5++) {
                                bArrF[i5] = n0.A(bArrF[i5]) ? (byte) n0.F(bArrF[i5]) : bArrF[i5];
                            }
                            return M.f1683a.o(D0.z.L(bArrF));
                        }
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

    public static final class t implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1928a;

            public a(U1.l lVar) {
                this.f1928a = lVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                M.a aVar;
                V0.I iZ;
                kotlin.jvm.internal.m.e(input, "input");
                try {
                    M m3 = (M) this.f1928a.invoke(input);
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
                            i3 = a.f1853a[cVarB02.ordinal()];
                        }
                        if (i3 == 1) {
                            M.a aVar2 = M.f1683a;
                            String strZ0 = iF2.z0();
                            kotlin.jvm.internal.m.d(strZ0, "getStringValue(...)");
                            return aVar2.l(n0.D(strZ0));
                        }
                        if (i3 == 2) {
                            aVar = M.f1683a;
                            AbstractC0791i abstractC0791iQ0 = iF2.q0();
                            kotlin.jvm.internal.m.d(abstractC0791iQ0, "getBytesValue(...)");
                            C0727g c0727gG = C0727g.g(n0.i(abstractC0791iQ0));
                            kotlin.jvm.internal.m.d(c0727gG, "fromBytes(...)");
                            iZ = D0.z.z(c0727gG);
                        } else if (i3 == 3) {
                            aVar = M.f1683a;
                            List listG = iF2.o0().g();
                            kotlin.jvm.internal.m.d(listG, "getValuesList(...)");
                            iZ = D0.z.E(J1.x.L(listG));
                        }
                        return aVar.o(iZ);
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

    public static final class u implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1929a;

            public a(U1.l lVar) {
                this.f1929a = lVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                try {
                    M m3 = (M) this.f1929a.invoke(input);
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
                            i3 = a.f1853a[cVarB02.ordinal()];
                        }
                        if (i3 == 1) {
                            M.a aVar = M.f1683a;
                            String strZ0 = iF2.z0();
                            kotlin.jvm.internal.m.d(strZ0, "getStringValue(...)");
                            return aVar.l(n0.D(strZ0));
                        }
                        if (i3 == 2) {
                            M.a aVar2 = M.f1683a;
                            AbstractC0791i abstractC0791iQ0 = iF2.q0();
                            kotlin.jvm.internal.m.d(abstractC0791iQ0, "getBytesValue(...)");
                            C0727g c0727gG = C0727g.g(n0.i(abstractC0791iQ0));
                            kotlin.jvm.internal.m.d(c0727gG, "fromBytes(...)");
                            return aVar2.o(D0.z.z(c0727gG));
                        }
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

    public static final class v implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1930a;

            public a(U1.l lVar) {
                this.f1930a = lVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                try {
                    M m3 = (M) this.f1930a.invoke(input);
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
                            i3 = a.f1853a[cVarB02.ordinal()];
                        }
                        if (i3 == 1) {
                            M.a aVar = M.f1683a;
                            String strF = AbstractC0820a.g().f(iF2.z0());
                            kotlin.jvm.internal.m.d(strF, "trimFrom(...)");
                            return aVar.l(strF);
                        }
                        if (i3 == 2) {
                            AbstractC0791i abstractC0791iQ0 = iF2.q0();
                            int i5 = 0;
                            while (i5 < abstractC0791iQ0.size() && Character.isWhitespace(abstractC0791iQ0.f(i5))) {
                                i5++;
                            }
                            int size = abstractC0791iQ0.size() - 1;
                            while (size >= i5 && Character.isWhitespace(abstractC0791iQ0.f(size))) {
                                size--;
                            }
                            if (i5 > size) {
                                M.a aVar2 = M.f1683a;
                                byte[] bArrF = AbstractC0791i.f6770b.F();
                                kotlin.jvm.internal.m.d(bArrF, "toByteArray(...)");
                                return aVar2.o(D0.z.L(bArrF));
                            }
                            M.a aVar3 = M.f1683a;
                            byte[] bArrF2 = abstractC0791iQ0.E(i5, size + 1).F();
                            kotlin.jvm.internal.m.d(bArrF2, "toByteArray(...)");
                            return aVar3.o(D0.z.L(bArrF2));
                        }
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

    public static final class w implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I.c f1931a;

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f1932a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ I.c f1933b;

            public a(List list, I.c cVar) {
                this.f1932a = list;
                this.f1933b = cVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                ArrayList arrayList = new ArrayList(this.f1932a.size());
                Iterator it = this.f1932a.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    M m3 = (M) ((U1.l) it.next()).invoke(input);
                    if (m3.g()) {
                        return N.f1689g;
                    }
                    V0.I iF = m3.f();
                    I.c cVarB0 = iF != null ? iF.B0() : null;
                    int i3 = cVarB0 == null ? -1 : L0.f1682a[cVarB0.ordinal()];
                    if (i3 == -1 || i3 == 1) {
                        z2 = true;
                    } else {
                        if (cVarB0 != this.f1933b) {
                            return N.f1689g;
                        }
                        V0.I iF2 = m3.f();
                        kotlin.jvm.internal.m.b(iF2);
                        arrayList.add(iF2.z0());
                    }
                }
                if (z2) {
                    return M.f1683a.g();
                }
                try {
                    M.a aVar = M.f1683a;
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        sb.append((String) it2.next());
                    }
                    String string = sb.toString();
                    kotlin.jvm.internal.m.d(string, "toString(...)");
                    return aVar.l(string);
                } catch (Exception unused) {
                    return N.f1689g;
                }
            }
        }

        public w(I.c cVar) {
            this.f1931a = cVar;
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U1.l invoke(List params) {
            kotlin.jvm.internal.m.e(params, "params");
            return new a(params, this.f1931a);
        }
    }

    static {
        I.c cVar = I.c.STRING_VALUE;
        f1835a = new w(cVar);
        f1836b = new l(cVar, cVar);
        f1837c = new m(cVar, cVar);
        f1838d = new n(cVar, cVar);
        f1839e = new p(I.c.BYTES_VALUE, cVar);
        f1840f = new q(cVar);
        f1841g = new r();
        f1842h = new s();
        f1843i = new t();
        f1844j = new u();
        f1845k = F0.a();
        f1846l = new o();
        f1847m = new v();
        f1848n = new g(cVar, cVar);
        f1849o = new h(cVar, cVar);
        f1850p = new i(cVar, cVar);
        f1851q = new j(cVar, cVar);
        f1852r = new k(cVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(int i3) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UCharacter.isLowerCase(i3);
        }
        if (i3 >= 0 && i3 <= 65535) {
            return Character.isUpperCase((char) i3);
        }
        throw new IllegalArgumentException("Invalid Char code: " + i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(int i3) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UCharacter.isUpperCase(i3);
        }
        if (i3 >= 0 && i3 <= 65535) {
            return Character.isUpperCase((char) i3);
        }
        throw new IllegalArgumentException("Invalid Char code: " + i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String C(String str) throws Exception {
        String str2;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        boolean z2 = false;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (z2) {
                if (cCharAt == '\\') {
                    sb.append("\\");
                } else {
                    sb.append(cCharAt);
                }
                z2 = false;
            } else {
                if (cCharAt == '$') {
                    str2 = "\\$";
                } else if (cCharAt == '%') {
                    str2 = ".*";
                } else if (cCharAt == '.') {
                    str2 = "\\.";
                } else if (cCharAt != '?') {
                    switch (cCharAt) {
                        case '(':
                            str2 = "\\(";
                            break;
                        case ')':
                            str2 = "\\)";
                            break;
                        case '*':
                            str2 = "\\*";
                            break;
                        case '+':
                            str2 = "\\+";
                            break;
                        default:
                            switch (cCharAt) {
                                case '[':
                                    str2 = "\\[";
                                    break;
                                case '\\':
                                    I1.u uVar = I1.u.f2419a;
                                    z2 = true;
                                    continue;
                                case ']':
                                    str2 = "\\]";
                                    break;
                                case '^':
                                    str2 = "\\^";
                                    break;
                                case '_':
                                    sb.append('.');
                                    continue;
                                default:
                                    switch (cCharAt) {
                                        case '{':
                                            str2 = "\\{";
                                            break;
                                        case '|':
                                            str2 = "\\|";
                                            break;
                                        case '}':
                                            str2 = "\\}";
                                            break;
                                        default:
                                            sb.append(cCharAt);
                                            continue;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    str2 = "\\?";
                }
                sb.append(str2);
            }
        }
        if (z2) {
            throw new Exception("LIKE pattern ends in backslash");
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String D(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        while (length > 0) {
            length = str.offsetByCodePoints(length, -1);
            sb.append(Character.toChars(str.codePointAt(length)));
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int E(int i3) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UCharacter.toLowerCase(i3);
        }
        if (i3 >= 0 && i3 <= 65535) {
            return Character.toLowerCase((char) i3);
        }
        throw new IllegalArgumentException("Invalid Char code: " + i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int F(int i3) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UCharacter.toUpperCase(i3);
        }
        if (i3 >= 0 && i3 <= 65535) {
            return Character.toUpperCase((char) i3);
        }
        throw new IllegalArgumentException("Invalid Char code: " + i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] i(AbstractC0791i abstractC0791i) {
        byte[] bArrF = abstractC0791i.F();
        int length = bArrF.length / 2;
        for (int i3 = 0; i3 < length; i3++) {
            byte b3 = bArrF[i3];
            bArrF[i3] = bArrF[(bArrF.length - i3) - 1];
            bArrF[(bArrF.length - i3) - 1] = b3;
        }
        kotlin.jvm.internal.m.b(bArrF);
        return bArrF;
    }

    public static final U1.l j() {
        return f1839e;
    }

    public static final U1.l k() {
        return f1840f;
    }

    public static final U1.l l() {
        return f1838d;
    }

    public static final U1.l m() {
        return f1852r;
    }

    public static final U1.l n() {
        return f1848n;
    }

    public static final U1.l o() {
        return f1850p;
    }

    public static final U1.l p() {
        return f1851q;
    }

    public static final U1.l q() {
        return f1849o;
    }

    public static final U1.l r() {
        return f1843i;
    }

    public static final U1.l s() {
        return f1837c;
    }

    public static final U1.l t() {
        return f1835a;
    }

    public static final U1.l u() {
        return f1836b;
    }

    public static final U1.l v() {
        return f1846l;
    }

    public static final U1.l w() {
        return f1841g;
    }

    public static final U1.l x() {
        return f1842h;
    }

    public static final U1.l y() {
        return f1847m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long z(M m3) {
        V0.I iF;
        if (!m3.h()) {
            return null;
        }
        V0.I iF2 = m3.f();
        if ((iF2 != null ? iF2.B0() : null) == I.c.INTEGER_VALUE && (iF = m3.f()) != null) {
            return Long.valueOf(iF.w0());
        }
        return null;
    }
}
