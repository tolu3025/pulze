package G0;

/* JADX INFO: loaded from: classes.dex */
public final class P extends M {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V0.I f1699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f1700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f1701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f1702j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(V0.I value) {
        super(null);
        kotlin.jvm.internal.m.e(value, "value");
        this.f1699g = value;
        this.f1700h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P) && kotlin.jvm.internal.m.a(this.f1699g, ((P) obj).f1699g);
    }

    @Override // G0.M
    public V0.I f() {
        return this.f1699g;
    }

    @Override // G0.M
    public boolean g() {
        return this.f1701i;
    }

    @Override // G0.M
    public boolean h() {
        return this.f1700h;
    }

    public int hashCode() {
        return this.f1699g.hashCode();
    }

    @Override // G0.M
    public boolean i() {
        return this.f1702j;
    }

    public String toString() {
        return "EvaluateResultValue(value=" + this.f1699g + ')';
    }
}
