package p;

import M1.g;

/* JADX INFO: loaded from: classes.dex */
public final class J implements g.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10001c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f10002d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f10003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1057k f10004b;

    public static final class a {

        /* JADX INFO: renamed from: p.J$a$a, reason: collision with other inner class name */
        public static final class C0154a implements g.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0154a f10005a = new C0154a();

            private C0154a() {
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public J(J j3, C1057k instance) {
        kotlin.jvm.internal.m.e(instance, "instance");
        this.f10003a = j3;
        this.f10004b = instance;
    }

    public final void a(InterfaceC1055i candidate) {
        kotlin.jvm.internal.m.e(candidate, "candidate");
        if (this.f10004b == candidate) {
            throw new IllegalStateException(f10002d.toString());
        }
        J j3 = this.f10003a;
        if (j3 != null) {
            j3.a(candidate);
        }
    }

    @Override // M1.g.b, M1.g
    public Object fold(Object obj, U1.p pVar) {
        return g.b.a.a(this, obj, pVar);
    }

    @Override // M1.g.b, M1.g
    public g.b get(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // M1.g.b
    public g.c getKey() {
        return a.C0154a.f10005a;
    }

    @Override // M1.g.b, M1.g
    public M1.g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // M1.g
    public M1.g plus(M1.g gVar) {
        return g.b.a.d(this, gVar);
    }
}
