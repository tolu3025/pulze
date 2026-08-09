package y1;

import e0.AbstractC0829j;
import java.util.concurrent.Executor;
import y1.AbstractC1299b;

/* JADX INFO: renamed from: y1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1310m extends AbstractC1299b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1299b f12004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1299b f12005b;

    /* JADX INFO: renamed from: y1.m$a */
    private static final class a extends AbstractC1299b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1299b.a f12006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Z f12007b;

        public a(AbstractC1299b.a aVar, Z z2) {
            this.f12006a = aVar;
            this.f12007b = z2;
        }

        @Override // y1.AbstractC1299b.a
        public void a(Z z2) {
            AbstractC0829j.o(z2, "headers");
            Z z3 = new Z();
            z3.m(this.f12007b);
            z3.m(z2);
            this.f12006a.a(z3);
        }

        @Override // y1.AbstractC1299b.a
        public void b(l0 l0Var) {
            this.f12006a.b(l0Var);
        }
    }

    /* JADX INFO: renamed from: y1.m$b */
    private final class b extends AbstractC1299b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1299b.AbstractC0192b f12008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f12009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractC1299b.a f12010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final r f12011d;

        public b(AbstractC1299b.AbstractC0192b abstractC0192b, Executor executor, AbstractC1299b.a aVar, r rVar) {
            this.f12008a = abstractC0192b;
            this.f12009b = executor;
            this.f12010c = (AbstractC1299b.a) AbstractC0829j.o(aVar, "delegate");
            this.f12011d = (r) AbstractC0829j.o(rVar, "context");
        }

        @Override // y1.AbstractC1299b.a
        public void a(Z z2) {
            AbstractC0829j.o(z2, "headers");
            r rVarB = this.f12011d.b();
            try {
                C1310m.this.f12005b.a(this.f12008a, this.f12009b, new a(this.f12010c, z2));
            } finally {
                this.f12011d.f(rVarB);
            }
        }

        @Override // y1.AbstractC1299b.a
        public void b(l0 l0Var) {
            this.f12010c.b(l0Var);
        }
    }

    public C1310m(AbstractC1299b abstractC1299b, AbstractC1299b abstractC1299b2) {
        this.f12004a = (AbstractC1299b) AbstractC0829j.o(abstractC1299b, "creds1");
        this.f12005b = (AbstractC1299b) AbstractC0829j.o(abstractC1299b2, "creds2");
    }

    @Override // y1.AbstractC1299b
    public void a(AbstractC1299b.AbstractC0192b abstractC0192b, Executor executor, AbstractC1299b.a aVar) {
        this.f12004a.a(abstractC0192b, executor, new b(abstractC0192b, executor, aVar, r.e()));
    }
}
