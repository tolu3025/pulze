package g2;

import h2.K;

/* JADX INFO: loaded from: classes.dex */
final class u implements f2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M1.g f7381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f7382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U1.p f7383c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f2.c f7386c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f2.c cVar, M1.d dVar) {
            super(2, dVar);
            this.f7386c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            a aVar = new a(this.f7386c, dVar);
            aVar.f7385b = obj;
            return aVar;
        }

        @Override // U1.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, M1.d dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f7384a;
            if (i3 == 0) {
                I1.o.b(obj);
                Object obj2 = this.f7385b;
                f2.c cVar = this.f7386c;
                this.f7384a = 1;
                if (cVar.emit(obj2, this) == objE) {
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

    public u(f2.c cVar, M1.g gVar) {
        this.f7381a = gVar;
        this.f7382b = K.g(gVar);
        this.f7383c = new a(cVar, null);
    }

    @Override // f2.c
    public Object emit(Object obj, M1.d dVar) {
        Object objB = f.b(this.f7381a, obj, this.f7382b, this.f7383c, dVar);
        return objB == N1.d.e() ? objB : I1.u.f2419a;
    }
}
