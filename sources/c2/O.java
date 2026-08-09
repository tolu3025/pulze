package c2;

import h2.C0887d;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {
    public static final N a(M1.g gVar) {
        if (gVar.get(InterfaceC0600z0.f5183i) == null) {
            gVar = gVar.plus(D0.b(null, 1, null));
        }
        return new C0887d(gVar);
    }

    public static final N b() {
        return new C0887d(T0.b(null, 1, null).plus(C0557d0.c()));
    }

    public static final Object c(U1.p pVar, M1.d dVar) {
        h2.z zVar = new h2.z(dVar.getContext(), dVar);
        Object objB = i2.b.b(zVar, zVar, pVar);
        if (objB == N1.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objB;
    }

    public static final void d(N n3) {
        C0.h(n3.e());
    }

    public static final boolean e(N n3) {
        InterfaceC0600z0 interfaceC0600z0 = (InterfaceC0600z0) n3.e().get(InterfaceC0600z0.f5183i);
        if (interfaceC0600z0 != null) {
            return interfaceC0600z0.isActive();
        }
        return true;
    }
}
