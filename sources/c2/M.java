package c2;

import h2.AbstractC0889f;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    public static final void a(M1.g gVar, Throwable th) {
        try {
            L l3 = (L) gVar.get(L.f5092h);
            if (l3 != null) {
                l3.P(gVar, th);
            } else {
                AbstractC0889f.a(gVar, th);
            }
        } catch (Throwable th2) {
            AbstractC0889f.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        I1.b.a(runtimeException, th);
        return runtimeException;
    }
}
