package g2;

/* JADX INFO: loaded from: classes.dex */
final class t implements M1.d, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M1.d f7379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M1.g f7380b;

    public t(M1.d dVar, M1.g gVar) {
        this.f7379a = dVar;
        this.f7380b = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        M1.d dVar = this.f7379a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // M1.d
    public M1.g getContext() {
        return this.f7380b;
    }

    @Override // M1.d
    public void resumeWith(Object obj) {
        this.f7379a.resumeWith(obj);
    }
}
