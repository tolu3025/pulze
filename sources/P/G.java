package p;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    static final class a extends kotlin.coroutines.jvm.internal.l implements U1.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9998b;

        a(M1.d dVar) {
            super(3, dVar);
        }

        @Override // U1.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            return i((y) obj, ((Boolean) obj2).booleanValue(), (M1.d) obj3);
        }

        public final Object i(y yVar, boolean z2, M1.d dVar) {
            a aVar = new a(dVar);
            aVar.f9998b = yVar;
            return aVar.invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f9997a;
            if (i3 == 0) {
                I1.o.b(obj);
                y yVar = (y) this.f9998b;
                this.f9997a = 1;
                obj = yVar.c(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return obj;
        }
    }

    public static final Object a(F f3, M1.d dVar) {
        return f3.b(new a(null), dVar);
    }
}
