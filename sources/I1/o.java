package I1;

import I1.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final Object a(Throwable exception) {
        kotlin.jvm.internal.m.e(exception, "exception");
        return new n.b(exception);
    }

    public static final void b(Object obj) throws Throwable {
        if (obj instanceof n.b) {
            throw ((n.b) obj).f2413a;
        }
    }
}
