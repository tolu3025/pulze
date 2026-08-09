package c2;

import I1.n;
import h2.C0891h;

/* JADX INFO: renamed from: c2.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0553b0 {
    public static final void a(AbstractC0551a0 abstractC0551a0, int i3) {
        M1.d dVarE = abstractC0551a0.e();
        boolean z2 = i3 == 4;
        if (z2 || !(dVarE instanceof C0891h) || b(i3) != b(abstractC0551a0.f5117c)) {
            d(abstractC0551a0, dVarE, z2);
            return;
        }
        C0891h c0891h = (C0891h) dVarE;
        K k3 = c0891h.f7445d;
        M1.g context = c0891h.getContext();
        if (k3.V(context)) {
            k3.U(context, abstractC0551a0);
        } else {
            e(abstractC0551a0);
        }
    }

    public static final boolean b(int i3) {
        return i3 == 1 || i3 == 2;
    }

    public static final boolean c(int i3) {
        return i3 == 2;
    }

    public static final void d(AbstractC0551a0 abstractC0551a0, M1.d dVar, boolean z2) {
        Object objH;
        Object objJ = abstractC0551a0.j();
        Throwable thF = abstractC0551a0.f(objJ);
        if (thF != null) {
            n.a aVar = I1.n.f2411b;
            objH = I1.o.a(thF);
        } else {
            n.a aVar2 = I1.n.f2411b;
            objH = abstractC0551a0.h(objJ);
        }
        Object objB = I1.n.b(objH);
        if (!z2) {
            dVar.resumeWith(objB);
            return;
        }
        kotlin.jvm.internal.m.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C0891h c0891h = (C0891h) dVar;
        M1.d dVar2 = c0891h.f7446e;
        Object obj = c0891h.f7448l;
        M1.g context = dVar2.getContext();
        Object objI = h2.K.i(context, obj);
        a1 a1VarM = objI != h2.K.f7428a ? I.m(dVar2, context, objI) : null;
        try {
            c0891h.f7446e.resumeWith(objB);
            I1.u uVar = I1.u.f2419a;
        } finally {
            if (a1VarM == null || a1VarM.M0()) {
                h2.K.f(context, objI);
            }
        }
    }

    private static final void e(AbstractC0551a0 abstractC0551a0) {
        AbstractC0569j0 abstractC0569j0B = V0.f5110a.b();
        if (abstractC0569j0B.f0()) {
            abstractC0569j0B.b0(abstractC0551a0);
            return;
        }
        abstractC0569j0B.d0(true);
        try {
            d(abstractC0551a0, abstractC0551a0.e(), true);
            do {
            } while (abstractC0569j0B.i0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
