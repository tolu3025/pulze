package g2;

import kotlin.jvm.internal.D;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final U1.q f7375a;

    /* synthetic */ class a extends kotlin.jvm.internal.k implements U1.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7376a = new a();

        a() {
            super(3, f2.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // U1.q
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object e(f2.c cVar, Object obj, M1.d dVar) {
            return cVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f7376a;
        kotlin.jvm.internal.m.c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f7375a = (U1.q) D.b(aVar, 3);
    }
}
