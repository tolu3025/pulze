package y1;

/* JADX INFO: loaded from: classes.dex */
public class n0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f12016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z f12017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12018c;

    public n0(l0 l0Var) {
        this(l0Var, null);
    }

    public final l0 a() {
        return this.f12016a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f12018c ? super.fillInStackTrace() : this;
    }

    public n0(l0 l0Var, Z z2) {
        this(l0Var, z2, true);
    }

    n0(l0 l0Var, Z z2, boolean z3) {
        super(l0.g(l0Var), l0Var.l());
        this.f12016a = l0Var;
        this.f12017b = z2;
        this.f12018c = z3;
        fillInStackTrace();
    }
}
