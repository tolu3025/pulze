package h2;

import I1.n;
import a.C0469a;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f7423a = new C0469a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7425c;

    static {
        Object objB;
        Object objB2;
        try {
            n.a aVar = I1.n.f2411b;
            objB = I1.n.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            n.a aVar2 = I1.n.f2411b;
            objB = I1.n.b(I1.o.a(th));
        }
        if (I1.n.d(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f7424b = (String) objB;
        try {
            objB2 = I1.n.b(C.class.getCanonicalName());
        } catch (Throwable th2) {
            n.a aVar3 = I1.n.f2411b;
            objB2 = I1.n.b(I1.o.a(th2));
        }
        if (I1.n.d(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f7425c = (String) objB2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
