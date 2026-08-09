package G0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final P f1684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final P f1685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final P f1686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final P f1687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final P f1688f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final P a(Boolean bool) {
            return bool == null ? g() : b(bool.booleanValue());
        }

        public final P b(boolean z2) {
            return z2 ? h() : e();
        }

        public final P c(double d3) {
            return new P(D0.z.u(d3));
        }

        public final P d() {
            return M.f1687e;
        }

        public final P e() {
            return M.f1685c;
        }

        public final P f() {
            return M.f1688f;
        }

        public final P g() {
            return M.f1686d;
        }

        public final P h() {
            return M.f1684b;
        }

        public final P i(List list) {
            kotlin.jvm.internal.m.e(list, "list");
            return new P(D0.z.E(list));
        }

        public final P j(int i3) {
            return new P(D0.z.x(i3));
        }

        public final P k(long j3) {
            return new P(D0.z.x(j3));
        }

        public final P l(String string) {
            kotlin.jvm.internal.m.e(string, "string");
            return new P(D0.z.G(string));
        }

        public final M m(long j3, int i3) {
            try {
                return n(D0.z.e0(j3, i3));
            } catch (IllegalArgumentException unused) {
                return N.f1689g;
            }
        }

        public final M n(com.google.protobuf.t0 timestamp) {
            kotlin.jvm.internal.m.e(timestamp, "timestamp");
            return new P(D0.z.D(timestamp));
        }

        public final P o(V0.I value) {
            kotlin.jvm.internal.m.e(value, "value");
            return new P(value);
        }
    }

    static {
        a aVar = new a(null);
        f1683a = aVar;
        f1684b = new P(D0.z.f1325r);
        f1685c = new P(D0.z.f1326s);
        f1686d = new P(D0.z.f1310c);
        f1687e = aVar.c(0.0d);
        f1688f = aVar.j(0);
    }

    private M() {
    }

    public /* synthetic */ M(kotlin.jvm.internal.h hVar) {
        this();
    }

    public abstract V0.I f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();
}
