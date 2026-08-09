package t;

import I1.o;
import I1.u;
import U1.p;
import kotlin.coroutines.jvm.internal.l;
import p.InterfaceC1055i;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f11289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, M1.d dVar) {
            super(2, dVar);
            this.f11289c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            a aVar = new a(this.f11289c, dVar);
            aVar.f11288b = obj;
            return aVar;
        }

        @Override // U1.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, M1.d dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f11287a;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1221c c1221c = (C1221c) this.f11288b;
                o.b(obj);
                return c1221c;
            }
            o.b(obj);
            C1221c c1221cC = ((f) this.f11288b).c();
            p pVar = this.f11289c;
            this.f11288b = c1221cC;
            this.f11287a = 1;
            return pVar.invoke(c1221cC, this) == objE ? objE : c1221cC;
        }
    }

    public static final Object a(InterfaceC1055i interfaceC1055i, p pVar, M1.d dVar) {
        return interfaceC1055i.a(new a(pVar, null), dVar);
    }
}
