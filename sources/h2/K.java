package h2;

import M1.g;
import c2.U0;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f7428a = new D("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U1.p f7429b = new U1.p() { // from class: h2.H
        @Override // U1.p
        public final Object invoke(Object obj, Object obj2) {
            return K.d(obj, (g.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U1.p f7430c = new U1.p() { // from class: h2.I
        @Override // U1.p
        public final Object invoke(Object obj, Object obj2) {
            return K.e((U0) obj, (g.b) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final U1.p f7431d = new U1.p() { // from class: h2.J
        @Override // U1.p
        public final Object invoke(Object obj, Object obj2) {
            return K.h((O) obj, (g.b) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, g.b bVar) {
        if (!(bVar instanceof U0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U0 e(U0 u02, g.b bVar) {
        if (u02 != null) {
            return u02;
        }
        if (bVar instanceof U0) {
            return (U0) bVar;
        }
        return null;
    }

    public static final void f(M1.g gVar, Object obj) {
        if (obj == f7428a) {
            return;
        }
        if (obj instanceof O) {
            ((O) obj).b(gVar);
            return;
        }
        Object objFold = gVar.fold(null, f7430c);
        kotlin.jvm.internal.m.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((U0) objFold).l(gVar, obj);
    }

    public static final Object g(M1.g gVar) {
        Object objFold = gVar.fold(0, f7429b);
        kotlin.jvm.internal.m.b(objFold);
        return objFold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O h(O o2, g.b bVar) {
        if (bVar instanceof U0) {
            U0 u02 = (U0) bVar;
            o2.a(u02, u02.R(o2.f7434a));
        }
        return o2;
    }

    public static final Object i(M1.g gVar, Object obj) {
        if (obj == null) {
            obj = g(gVar);
        }
        if (obj == 0) {
            return f7428a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new O(gVar, ((Number) obj).intValue()), f7431d);
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((U0) obj).R(gVar);
    }
}
