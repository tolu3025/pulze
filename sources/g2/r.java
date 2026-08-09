package g2;

import M1.g;
import c2.InterfaceC0600z0;
import h2.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final void b(final o oVar, M1.g gVar) {
        if (((Number) gVar.fold(0, new U1.p() { // from class: g2.q
            @Override // U1.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(r.c(oVar, ((Integer) obj).intValue(), (g.b) obj2));
            }
        })).intValue() == oVar.f7372c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + oVar.f7371b + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(o oVar, int i3, g.b bVar) {
        g.c key = bVar.getKey();
        g.b bVar2 = oVar.f7371b.get(key);
        if (key != InterfaceC0600z0.f5183i) {
            if (bVar != bVar2) {
                return Integer.MIN_VALUE;
            }
            return i3 + 1;
        }
        InterfaceC0600z0 interfaceC0600z0 = (InterfaceC0600z0) bVar2;
        kotlin.jvm.internal.m.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        InterfaceC0600z0 interfaceC0600z0D = d((InterfaceC0600z0) bVar, interfaceC0600z0);
        if (interfaceC0600z0D == interfaceC0600z0) {
            return interfaceC0600z0 == null ? i3 : i3 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC0600z0D + ", expected child of " + interfaceC0600z0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final InterfaceC0600z0 d(InterfaceC0600z0 interfaceC0600z0, InterfaceC0600z0 interfaceC0600z02) {
        while (interfaceC0600z0 != null) {
            if (interfaceC0600z0 == interfaceC0600z02) {
                return interfaceC0600z0;
            }
            if (!(interfaceC0600z0 instanceof z)) {
                return interfaceC0600z0;
            }
            interfaceC0600z0 = ((z) interfaceC0600z0).getParent();
        }
        return null;
    }
}
