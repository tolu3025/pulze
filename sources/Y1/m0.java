package y1;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f12013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z f12014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12015c;

    public m0(l0 l0Var) {
        this(l0Var, null);
    }

    public final l0 a() {
        return this.f12013a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f12015c ? super.fillInStackTrace() : this;
    }

    public m0(l0 l0Var, Z z2) {
        this(l0Var, z2, true);
    }

    m0(l0 l0Var, Z z2, boolean z3) {
        super(l0.g(l0Var), l0Var.l());
        this.f12013a = l0Var;
        this.f12014b = z2;
        this.f12015c = z3;
        fillInStackTrace();
    }
}
