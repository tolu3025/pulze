package c2;

import I1.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    public static final Object a(Object obj, M1.d dVar) {
        if (obj instanceof C) {
            n.a aVar = I1.n.f2411b;
            obj = I1.o.a(((C) obj).f5057a);
        }
        return I1.n.b(obj);
    }

    public static final Object b(Object obj) {
        Throwable thD = I1.n.d(obj);
        return thD == null ? obj : new C(thD, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC0576n interfaceC0576n) {
        Throwable thD = I1.n.d(obj);
        return thD == null ? obj : new C(thD, false, 2, null);
    }
}
