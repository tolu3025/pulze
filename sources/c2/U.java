package c2;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f5108a = h2.E.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final X f5109b = b();

    public static final X a() {
        return f5109b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final X b() {
        if (!f5108a) {
            return T.f5106n;
        }
        J0 j0C = C0557d0.c();
        return (h2.t.c(j0C) || !(j0C instanceof X)) ? T.f5106n : (X) j0C;
    }
}
