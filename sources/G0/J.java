package G0;

import J0.AbstractC0386b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U1.l f1672a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U1.l f1673b = new U1.l() { // from class: G0.H
        @Override // U1.l
        public final Object invoke(Object obj) {
            return J.c((List) obj);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U1.l f1674c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final U1.l f1675d = new c();

    public static final class a implements U1.l {

        /* JADX INFO: renamed from: G0.J$a$a, reason: collision with other inner class name */
        public static final class C0014a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1676a;

            public C0014a(U1.l lVar) {
                this.f1676a = lVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                try {
                    return M.f1683a.b(((M) this.f1676a.invoke(input)).g());
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
                return new C0014a((U1.l) params.get(0));
            }
            throw AbstractC0386b.a("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
        }
    }

    public static final class b implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1677a;

            public a(U1.l lVar) {
                this.f1677a = lVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                try {
                    M m3 = (M) this.f1677a.invoke(input);
                    if (kotlin.jvm.internal.m.a(m3, N.f1689g)) {
                        return m3;
                    }
                    if (kotlin.jvm.internal.m.a(m3, O.f1694g)) {
                        return M.f1683a.e();
                    }
                    if (m3 instanceof P) {
                        return M.f1683a.h();
                    }
                    throw new I1.k();
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

    public static final class c implements U1.l {

        public static final class a implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f1678a;

            public a(U1.l lVar) {
                this.f1678a = lVar;
            }

            @Override // U1.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M invoke(D0.s input) {
                kotlin.jvm.internal.m.e(input, "input");
                try {
                    M m3 = (M) this.f1678a.invoke(input);
                    if (kotlin.jvm.internal.m.a(m3, N.f1689g)) {
                        return m3;
                    }
                    if (kotlin.jvm.internal.m.a(m3, O.f1694g)) {
                        return M.f1683a.h();
                    }
                    if (m3 instanceof P) {
                        return M.f1683a.e();
                    }
                    throw new I1.k();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.l c(List list) {
        kotlin.jvm.internal.m.e(list, "<unused var>");
        return new U1.l() { // from class: G0.I
            @Override // U1.l
            public final Object invoke(Object obj) {
                return J.d((D0.s) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N d(D0.s sVar) {
        kotlin.jvm.internal.m.e(sVar, "<unused var>");
        return N.f1689g;
    }

    public static final U1.l e() {
        return f1674c;
    }

    public static final U1.l f() {
        return f1675d;
    }

    public static final U1.l g() {
        return f1672a;
    }
}
