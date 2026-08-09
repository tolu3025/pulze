package h2;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static final A b(Object obj) {
        if (obj == AbstractC0884a.f7438a) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (A) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC0884a.f7438a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
