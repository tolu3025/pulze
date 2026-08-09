package y1;

import java.util.logging.Level;
import java.util.logging.Logger;
import y1.r;

/* JADX INFO: loaded from: classes.dex */
final class q0 extends r.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f12044a = Logger.getLogger(q0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final ThreadLocal f12045b = new ThreadLocal();

    q0() {
    }

    @Override // y1.r.c
    public r a() {
        r rVar = (r) f12045b.get();
        return rVar == null ? r.f12047c : rVar;
    }

    @Override // y1.r.c
    public void b(r rVar, r rVar2) {
        ThreadLocal threadLocal;
        if (a() != rVar) {
            f12044a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (rVar2 != r.f12047c) {
            threadLocal = f12045b;
        } else {
            threadLocal = f12045b;
            rVar2 = null;
        }
        threadLocal.set(rVar2);
    }

    @Override // y1.r.c
    public r c(r rVar) {
        r rVarA = a();
        f12045b.set(rVar);
        return rVarA;
    }
}
