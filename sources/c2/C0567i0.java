package c2;

/* JADX INFO: renamed from: c2.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0567i0 implements InterfaceC0592v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f5148a;

    public C0567i0(boolean z2) {
        this.f5148a = z2;
    }

    @Override // c2.InterfaceC0592v0
    public K0 a() {
        return null;
    }

    @Override // c2.InterfaceC0592v0
    public boolean isActive() {
        return this.f5148a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
