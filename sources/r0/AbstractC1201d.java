package r0;

import java.util.Set;

/* JADX INFO: renamed from: r0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1201d {
    public static Object a(InterfaceC1202e interfaceC1202e, Class cls) {
        return interfaceC1202e.g(F.b(cls));
    }

    public static Object b(InterfaceC1202e interfaceC1202e, F f3) {
        L0.b bVarC = interfaceC1202e.c(f3);
        if (bVarC == null) {
            return null;
        }
        return bVarC.get();
    }

    public static L0.a c(InterfaceC1202e interfaceC1202e, Class cls) {
        return interfaceC1202e.b(F.b(cls));
    }

    public static L0.b d(InterfaceC1202e interfaceC1202e, Class cls) {
        return interfaceC1202e.c(F.b(cls));
    }

    public static Set e(InterfaceC1202e interfaceC1202e, Class cls) {
        return interfaceC1202e.f(F.b(cls));
    }

    public static Set f(InterfaceC1202e interfaceC1202e, F f3) {
        return (Set) interfaceC1202e.i(f3).get();
    }
}
