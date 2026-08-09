package h2;

/* JADX INFO: renamed from: h2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0887d implements c2.N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M1.g f7441a;

    public C0887d(M1.g gVar) {
        this.f7441a = gVar;
    }

    @Override // c2.N
    public M1.g e() {
        return this.f7441a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + e() + ')';
    }
}
