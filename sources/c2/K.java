package c2;

import M1.e;
import M1.g;
import c2.K;
import h2.AbstractC0895l;
import h2.C0891h;
import h2.C0894k;

/* JADX INFO: loaded from: classes.dex */
public abstract class K extends M1.a implements M1.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5091b = new a(null);

    public static final class a extends M1.b {
        private a() {
            super(M1.e.f2704g, new U1.l() { // from class: c2.J
                @Override // U1.l
                public final Object invoke(Object obj) {
                    return K.a.d((g.b) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final K d(g.b bVar) {
            if (bVar instanceof K) {
                return (K) bVar;
            }
            return null;
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public K() {
        super(M1.e.f2704g);
    }

    public static /* synthetic */ K X(K k3, int i3, String str, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        return k3.W(i3, str);
    }

    @Override // M1.e
    public final void K(M1.d dVar) {
        kotlin.jvm.internal.m.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C0891h) dVar).t();
    }

    public abstract void U(M1.g gVar, Runnable runnable);

    public boolean V(M1.g gVar) {
        return true;
    }

    public K W(int i3, String str) {
        AbstractC0895l.a(i3);
        return new C0894k(this, i3, str);
    }

    @Override // M1.a, M1.g.b, M1.g
    public g.b get(g.c cVar) {
        return e.a.a(this, cVar);
    }

    @Override // M1.a, M1.g.b, M1.g
    public M1.g minusKey(g.c cVar) {
        return e.a.b(this, cVar);
    }

    public String toString() {
        return S.a(this) + '@' + S.b(this);
    }

    @Override // M1.e
    public final M1.d z(M1.d dVar) {
        return new C0891h(this, dVar);
    }
}
