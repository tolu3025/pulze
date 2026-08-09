package c2;

import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class D0 {

    /* synthetic */ class a extends kotlin.jvm.internal.k implements U1.l {
        a(Object obj) {
            super(1, obj, E0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void c(Throwable th) {
            ((E0) this.receiver).w(th);
        }

        @Override // U1.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c((Throwable) obj);
            return I1.u.f2419a;
        }
    }

    public static final A a(InterfaceC0600z0 interfaceC0600z0) {
        return new B0(interfaceC0600z0);
    }

    public static /* synthetic */ A b(InterfaceC0600z0 interfaceC0600z0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            interfaceC0600z0 = null;
        }
        return C0.a(interfaceC0600z0);
    }

    public static final void c(M1.g gVar, CancellationException cancellationException) {
        InterfaceC0600z0 interfaceC0600z0 = (InterfaceC0600z0) gVar.get(InterfaceC0600z0.f5183i);
        if (interfaceC0600z0 != null) {
            interfaceC0600z0.cancel(cancellationException);
        }
    }

    public static /* synthetic */ void d(M1.g gVar, CancellationException cancellationException, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            cancellationException = null;
        }
        C0.c(gVar, cancellationException);
    }

    public static final void e(M1.g gVar, CancellationException cancellationException) {
        a2.c children;
        InterfaceC0600z0 interfaceC0600z0 = (InterfaceC0600z0) gVar.get(InterfaceC0600z0.f5183i);
        if (interfaceC0600z0 == null || (children = interfaceC0600z0.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((InterfaceC0600z0) it.next()).cancel(cancellationException);
        }
    }

    public static /* synthetic */ void f(M1.g gVar, CancellationException cancellationException, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            cancellationException = null;
        }
        C0.e(gVar, cancellationException);
    }

    public static final InterfaceC0561f0 g(InterfaceC0600z0 interfaceC0600z0, InterfaceC0561f0 interfaceC0561f0) {
        return l(interfaceC0600z0, false, new C0565h0(interfaceC0561f0), 1, null);
    }

    public static final void h(M1.g gVar) {
        InterfaceC0600z0 interfaceC0600z0 = (InterfaceC0600z0) gVar.get(InterfaceC0600z0.f5183i);
        if (interfaceC0600z0 != null) {
            C0.i(interfaceC0600z0);
        }
    }

    public static final void i(InterfaceC0600z0 interfaceC0600z0) {
        if (!interfaceC0600z0.isActive()) {
            throw interfaceC0600z0.getCancellationException();
        }
    }

    public static final InterfaceC0600z0 j(M1.g gVar) {
        InterfaceC0600z0 interfaceC0600z0 = (InterfaceC0600z0) gVar.get(InterfaceC0600z0.f5183i);
        if (interfaceC0600z0 != null) {
            return interfaceC0600z0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }

    public static final InterfaceC0561f0 k(InterfaceC0600z0 interfaceC0600z0, boolean z2, E0 e02) {
        return interfaceC0600z0 instanceof F0 ? ((F0) interfaceC0600z0).d0(z2, e02) : interfaceC0600z0.invokeOnCompletion(e02.v(), z2, new a(e02));
    }

    public static /* synthetic */ InterfaceC0561f0 l(InterfaceC0600z0 interfaceC0600z0, boolean z2, E0 e02, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = true;
        }
        return C0.k(interfaceC0600z0, z2, e02);
    }
}
