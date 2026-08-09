package q0;

/* JADX INFO: loaded from: classes.dex */
final class u0 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10787c;

    u0() {
    }

    @Override // q0.q0
    public final q0 a(String str) {
        this.f10786b = str;
        return this;
    }

    @Override // q0.q0
    public final r0 b() {
        return new v0(this.f10785a, this.f10786b, this.f10787c);
    }

    @Override // q0.q0
    public final q0 c(String str) {
        this.f10787c = str;
        return this;
    }

    @Override // q0.q0
    public final q0 d(String str) {
        this.f10785a = str;
        return this;
    }
}
