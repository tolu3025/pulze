package V0;

import F1.b;
import y1.AbstractC1301d;
import y1.C1300c;
import y1.a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a0 f2993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a0 f2994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a0 f2995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a0 f2996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a0 f2997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile a0 f2998f;

    class a implements b.a {
        a() {
        }

        @Override // F1.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(AbstractC1301d abstractC1301d, C1300c c1300c) {
            return new b(abstractC1301d, c1300c, null);
        }
    }

    public static final class b extends F1.a {
        private b(AbstractC1301d abstractC1301d, C1300c c1300c) {
            super(abstractC1301d, c1300c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // F1.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b a(AbstractC1301d abstractC1301d, C1300c c1300c) {
            return new b(abstractC1301d, c1300c);
        }

        /* synthetic */ b(AbstractC1301d abstractC1301d, C1300c c1300c, a aVar) {
            this(abstractC1301d, c1300c);
        }
    }

    public static a0 a() {
        a0 a0VarA = f2993a;
        if (a0VarA == null) {
            synchronized (t.class) {
                try {
                    a0VarA = f2993a;
                    if (a0VarA == null) {
                        a0VarA = a0.g().f(a0.d.SERVER_STREAMING).b(a0.b("google.firestore.v1.Firestore", "BatchGetDocuments")).e(true).c(E1.b.b(C0425d.e0())).d(E1.b.b(C0426e.a0())).a();
                        f2993a = a0VarA;
                    }
                } finally {
                }
            }
        }
        return a0VarA;
    }

    public static a0 b() {
        a0 a0VarA = f2994b;
        if (a0VarA == null) {
            synchronized (t.class) {
                try {
                    a0VarA = f2994b;
                    if (a0VarA == null) {
                        a0VarA = a0.g().f(a0.d.UNARY).b(a0.b("google.firestore.v1.Firestore", "Commit")).e(true).c(E1.b.b(C0429h.e0())).d(E1.b.b(C0430i.b0())).a();
                        f2994b = a0VarA;
                    }
                } finally {
                }
            }
        }
        return a0VarA;
    }

    public static a0 c() {
        a0 a0VarA = f2995c;
        if (a0VarA == null) {
            synchronized (t.class) {
                try {
                    a0VarA = f2995c;
                    if (a0VarA == null) {
                        a0VarA = a0.g().f(a0.d.SERVER_STREAMING).b(a0.b("google.firestore.v1.Firestore", "ExecutePipeline")).e(true).c(E1.b.b(q.c0())).d(E1.b.b(r.a0())).a();
                        f2995c = a0VarA;
                    }
                } finally {
                }
            }
        }
        return a0VarA;
    }

    public static a0 d() {
        a0 a0VarA = f2998f;
        if (a0VarA == null) {
            synchronized (t.class) {
                try {
                    a0VarA = f2998f;
                    if (a0VarA == null) {
                        a0VarA = a0.g().f(a0.d.BIDI_STREAMING).b(a0.b("google.firestore.v1.Firestore", "Listen")).e(true).c(E1.b.b(v.e0())).d(E1.b.b(w.a0())).a();
                        f2998f = a0VarA;
                    }
                } finally {
                }
            }
        }
        return a0VarA;
    }

    public static a0 e() {
        a0 a0VarA = f2996d;
        if (a0VarA == null) {
            synchronized (t.class) {
                try {
                    a0VarA = f2996d;
                    if (a0VarA == null) {
                        a0VarA = a0.g().f(a0.d.SERVER_STREAMING).b(a0.b("google.firestore.v1.Firestore", "RunAggregationQuery")).e(true).c(E1.b.b(A.c0())).d(E1.b.b(B.a0())).a();
                        f2996d = a0VarA;
                    }
                } finally {
                }
            }
        }
        return a0VarA;
    }

    public static a0 f() {
        a0 a0VarA = f2997e;
        if (a0VarA == null) {
            synchronized (t.class) {
                try {
                    a0VarA = f2997e;
                    if (a0VarA == null) {
                        a0VarA = a0.g().f(a0.d.BIDI_STREAMING).b(a0.b("google.firestore.v1.Firestore", "Write")).e(true).c(E1.b.b(K.f0())).d(E1.b.b(L.b0())).a();
                        f2997e = a0VarA;
                    }
                } finally {
                }
            }
        }
        return a0VarA;
    }

    public static b g(AbstractC1301d abstractC1301d) {
        return (b) F1.a.e(new a(), abstractC1301d);
    }
}
