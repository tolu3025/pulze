package kotlin.coroutines.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends a {
    public j(M1.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != M1.h.f2707a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // M1.d
    public M1.g getContext() {
        return M1.h.f2707a;
    }
}
