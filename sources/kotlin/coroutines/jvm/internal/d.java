package kotlin.coroutines.jvm.internal;

import M1.g;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends a {
    private final M1.g _context;
    private transient M1.d intercepted;

    public d(M1.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    @Override // M1.d
    public M1.g getContext() {
        M1.g gVar = this._context;
        m.b(gVar);
        return gVar;
    }

    public final M1.d intercepted() {
        M1.d dVarZ = this.intercepted;
        if (dVarZ == null) {
            M1.e eVar = (M1.e) getContext().get(M1.e.f2704g);
            if (eVar == null || (dVarZ = eVar.z(this)) == null) {
                dVarZ = this;
            }
            this.intercepted = dVarZ;
        }
        return dVarZ;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        M1.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(M1.e.f2704g);
            m.b(bVar);
            ((M1.e) bVar).K(dVar);
        }
        this.intercepted = c.f9717a;
    }

    public d(M1.d dVar, M1.g gVar) {
        super(dVar);
        this._context = gVar;
    }
}
