package i2;

import I1.n;
import I1.o;
import M1.d;
import M1.g;
import N1.c;
import U1.p;
import c2.C;
import c2.G0;
import c2.W0;
import h2.K;
import h2.z;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.D;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(p pVar, Object obj, d dVar) {
        d dVarA = h.a(dVar);
        try {
            g context = dVarA.getContext();
            Object objI = K.i(context, null);
            try {
                h.b(dVarA);
                Object objD = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? c.d(pVar, obj, dVarA) : ((p) D.b(pVar, 2)).invoke(obj, dVarA);
                K.f(context, objI);
                if (objD != N1.d.e()) {
                    dVarA.resumeWith(n.b(objD));
                }
            } catch (Throwable th) {
                K.f(context, objI);
                throw th;
            }
        } catch (Throwable th2) {
            n.a aVar = n.f2411b;
            dVarA.resumeWith(n.b(o.a(th2)));
        }
    }

    public static final Object b(z zVar, Object obj, p pVar) {
        Object c3;
        Object objJ0;
        try {
            c3 = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? c.d(pVar, obj, zVar) : ((p) D.b(pVar, 2)).invoke(obj, zVar);
        } catch (Throwable th) {
            c3 = new C(th, false, 2, null);
        }
        if (c3 == N1.d.e() || (objJ0 = zVar.j0(c3)) == G0.f5083b) {
            return N1.d.e();
        }
        if (objJ0 instanceof C) {
            throw ((C) objJ0).f5057a;
        }
        return G0.h(objJ0);
    }

    public static final Object c(z zVar, Object obj, p pVar) throws Throwable {
        Object c3;
        Object objJ0;
        try {
            c3 = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? c.d(pVar, obj, zVar) : ((p) D.b(pVar, 2)).invoke(obj, zVar);
        } catch (Throwable th) {
            c3 = new C(th, false, 2, null);
        }
        if (c3 == N1.d.e() || (objJ0 = zVar.j0(c3)) == G0.f5083b) {
            return N1.d.e();
        }
        if (objJ0 instanceof C) {
            Throwable th2 = ((C) objJ0).f5057a;
            if (!(th2 instanceof W0) || ((W0) th2).f5112a != zVar) {
                throw th2;
            }
            if (c3 instanceof C) {
                throw ((C) c3).f5057a;
            }
        } else {
            c3 = G0.h(objJ0);
        }
        return c3;
    }
}
