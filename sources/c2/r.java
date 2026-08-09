package c2;

import h2.C0891h;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final void a(InterfaceC0576n interfaceC0576n, InterfaceC0561f0 interfaceC0561f0) {
        c(interfaceC0576n, new C0563g0(interfaceC0561f0));
    }

    public static final C0580p b(M1.d dVar) {
        if (!(dVar instanceof C0891h)) {
            return new C0580p(dVar, 1);
        }
        C0580p c0580pO = ((C0891h) dVar).o();
        if (c0580pO != null) {
            if (!c0580pO.O()) {
                c0580pO = null;
            }
            if (c0580pO != null) {
                return c0580pO;
            }
        }
        return new C0580p(dVar, 2);
    }

    public static final void c(InterfaceC0576n interfaceC0576n, InterfaceC0574m interfaceC0574m) {
        if (!(interfaceC0576n instanceof C0580p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C0580p) interfaceC0576n).I(interfaceC0574m);
    }
}
