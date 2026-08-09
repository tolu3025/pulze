package N1;

import I1.o;
import M1.g;
import U1.p;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f2714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f2715c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M1.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f2714b = pVar;
            this.f2715c = obj;
            m.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            int i3 = this.f2713a;
            if (i3 == 0) {
                this.f2713a = 1;
                o.b(obj);
                m.c(this.f2714b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) D.b(this.f2714b, 2)).invoke(this.f2715c, this);
            }
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f2713a = 2;
            o.b(obj);
            return obj;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f2717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f2718c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(M1.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f2717b = pVar;
            this.f2718c = obj;
            m.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            int i3 = this.f2716a;
            if (i3 == 0) {
                this.f2716a = 1;
                o.b(obj);
                m.c(this.f2717b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) D.b(this.f2717b, 2)).invoke(this.f2718c, this);
            }
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f2716a = 2;
            o.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: N1.c$c, reason: collision with other inner class name */
    public static final class C0052c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0052c(M1.d dVar) {
            super(dVar);
            m.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            o.b(obj);
            return obj;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(M1.d dVar, g gVar) {
            super(dVar, gVar);
            m.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            o.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static M1.d a(p pVar, Object obj, M1.d completion) {
        m.e(pVar, "<this>");
        m.e(completion, "completion");
        M1.d dVarA = h.a(completion);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(obj, dVarA);
        }
        g context = dVarA.getContext();
        return context == M1.h.f2707a ? new a(dVarA, pVar, obj) : new b(dVarA, context, pVar, obj);
    }

    private static final M1.d b(M1.d dVar) {
        g context = dVar.getContext();
        return context == M1.h.f2707a ? new C0052c(dVar) : new d(dVar, context);
    }

    public static M1.d c(M1.d dVar) {
        M1.d dVarIntercepted;
        m.e(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar2 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar2 == null || (dVarIntercepted = dVar2.intercepted()) == null) ? dVar : dVarIntercepted;
    }

    public static Object d(p pVar, Object obj, M1.d completion) {
        m.e(pVar, "<this>");
        m.e(completion, "completion");
        return ((p) D.b(pVar, 2)).invoke(obj, b(h.a(completion)));
    }
}
