package Y;

/* JADX INFO: loaded from: classes.dex */
public enum B implements InterfaceC0435a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3100a;

    B(int i3) {
        this.f3100a = i3;
    }

    @Override // Y.InterfaceC0435a
    public int c() {
        return this.f3100a;
    }
}
