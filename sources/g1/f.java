package G1;

import e0.AbstractC0829j;
import y1.C1298a;
import y1.C1314q;
import y1.S;

/* JADX INFO: loaded from: classes.dex */
public final class f extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S.e f1999a;

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S.i f2000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final S.k f2001b;

        /* JADX INFO: renamed from: G1.f$a$a, reason: collision with other inner class name */
        class C0038a implements S.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ S.k f2002a;

            C0038a(S.k kVar) {
                this.f2002a = kVar;
            }

            @Override // y1.S.k
            public void a(C1314q c1314q) {
                this.f2002a.a(c1314q);
                a.this.f2001b.a(c1314q);
            }
        }

        a(S.i iVar, S.k kVar) {
            this.f2000a = (S.i) AbstractC0829j.o(iVar, "delegate");
            this.f2001b = (S.k) AbstractC0829j.o(kVar, "healthListener");
        }

        @Override // G1.d, y1.S.i
        public C1298a c() {
            return super.c().d().d(S.f11805d, Boolean.TRUE).a();
        }

        @Override // G1.d, y1.S.i
        public void h(S.k kVar) {
            this.f2000a.h(new C0038a(kVar));
        }

        @Override // G1.d
        public S.i j() {
            return this.f2000a;
        }
    }

    public f(S.e eVar) {
        this.f1999a = (S.e) AbstractC0829j.o(eVar, "helper");
    }

    @Override // G1.c, y1.S.e
    public S.i a(S.b bVar) {
        S.k kVar = (S.k) bVar.c(S.f11804c);
        S.i iVarA = super.a(bVar);
        return (kVar == null || iVarA.c().b(S.f11805d) != null) ? iVarA : new a(iVarA, kVar);
    }

    @Override // G1.c
    protected S.e g() {
        return this.f1999a;
    }
}
