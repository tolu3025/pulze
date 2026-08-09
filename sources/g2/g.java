package g2;

import M1.e;
import c2.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final f2.b f7359d;

    static final class a extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7361b;

        a(M1.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            a aVar = g.this.new a(dVar);
            aVar.f7361b = obj;
            return aVar;
        }

        @Override // U1.p
        public final Object invoke(f2.c cVar, M1.d dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f7360a;
            if (i3 == 0) {
                I1.o.b(obj);
                f2.c cVar = (f2.c) this.f7361b;
                g gVar = g.this;
                this.f7360a = 1;
                if (gVar.n(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return I1.u.f2419a;
        }
    }

    public g(f2.b bVar, M1.g gVar, int i3, e2.a aVar) {
        super(gVar, i3, aVar);
        this.f7359d = bVar;
    }

    static /* synthetic */ Object k(g gVar, f2.c cVar, M1.d dVar) {
        if (gVar.f7350b == -3) {
            M1.g context = dVar.getContext();
            M1.g gVarJ = I.j(context, gVar.f7349a);
            if (kotlin.jvm.internal.m.a(gVarJ, context)) {
                Object objN = gVar.n(cVar, dVar);
                return objN == N1.d.e() ? objN : I1.u.f2419a;
            }
            e.b bVar = M1.e.f2704g;
            if (kotlin.jvm.internal.m.a(gVarJ.get(bVar), context.get(bVar))) {
                Object objM = gVar.m(cVar, gVarJ, dVar);
                return objM == N1.d.e() ? objM : I1.u.f2419a;
            }
        }
        Object objA = super.a(cVar, dVar);
        return objA == N1.d.e() ? objA : I1.u.f2419a;
    }

    static /* synthetic */ Object l(g gVar, e2.u uVar, M1.d dVar) {
        Object objN = gVar.n(new s(uVar), dVar);
        return objN == N1.d.e() ? objN : I1.u.f2419a;
    }

    private final Object m(f2.c cVar, M1.g gVar, M1.d dVar) {
        return f.c(gVar, f.d(cVar, dVar.getContext()), null, new a(null), dVar, 4, null);
    }

    @Override // g2.e, f2.b
    public Object a(f2.c cVar, M1.d dVar) {
        return k(this, cVar, dVar);
    }

    @Override // g2.e
    protected Object f(e2.u uVar, M1.d dVar) {
        return l(this, uVar, dVar);
    }

    protected abstract Object n(f2.c cVar, M1.d dVar);

    @Override // g2.e
    public String toString() {
        return this.f7359d + " -> " + super.toString();
    }
}
