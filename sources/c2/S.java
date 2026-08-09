package c2;

import I1.n;
import h2.C0891h;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(M1.d dVar) {
        Object objB;
        if (dVar instanceof C0891h) {
            return ((C0891h) dVar).toString();
        }
        try {
            n.a aVar = I1.n.f2411b;
            objB = I1.n.b(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            n.a aVar2 = I1.n.f2411b;
            objB = I1.n.b(I1.o.a(th));
        }
        if (I1.n.d(objB) != null) {
            objB = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) objB;
    }
}
