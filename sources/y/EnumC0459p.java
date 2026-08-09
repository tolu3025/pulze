package Y;

/* JADX INFO: renamed from: Y.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0459p implements InterfaceC0435a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3187a;

    EnumC0459p(int i3) {
        this.f3187a = i3;
    }

    @Override // Y.InterfaceC0435a
    public int c() {
        return this.f3187a;
    }
}
