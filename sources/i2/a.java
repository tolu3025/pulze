package i2;

import I1.n;
import I1.o;
import I1.u;
import M1.d;
import N1.c;
import U1.p;
import h2.AbstractC0892i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private static final void a(d dVar, Throwable th) throws Throwable {
        n.a aVar = n.f2411b;
        dVar.resumeWith(n.b(o.a(th)));
        throw th;
    }

    public static final void b(d dVar, d dVar2) throws Throwable {
        try {
            d dVarC = c.c(dVar);
            n.a aVar = n.f2411b;
            AbstractC0892i.b(dVarC, n.b(u.f2419a));
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final void c(p pVar, Object obj, d dVar) {
        try {
            d dVarC = c.c(c.a(pVar, obj, dVar));
            n.a aVar = n.f2411b;
            AbstractC0892i.b(dVarC, n.b(u.f2419a));
        } catch (Throwable th) {
            a(dVar, th);
        }
    }
}
