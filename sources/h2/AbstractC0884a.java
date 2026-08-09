package h2;

/* JADX INFO: renamed from: h2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0884a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D f7438a = new D("CLOSED");

    public static final AbstractC0885b b(AbstractC0885b abstractC0885b) {
        while (true) {
            Object objG = abstractC0885b.g();
            if (objG == f7438a) {
                return abstractC0885b;
            }
            AbstractC0885b abstractC0885b2 = (AbstractC0885b) objG;
            if (abstractC0885b2 != null) {
                abstractC0885b = abstractC0885b2;
            } else if (abstractC0885b.m()) {
                return abstractC0885b;
            }
        }
    }

    public static final Object c(A a3, long j3, U1.p pVar) {
        while (true) {
            if (a3.f7422c >= j3 && !a3.k()) {
                return B.a(a3);
            }
            Object objG = a3.g();
            if (objG == f7438a) {
                return B.a(f7438a);
            }
            A a4 = (A) ((AbstractC0885b) objG);
            if (a4 == null) {
                a4 = (A) pVar.invoke(Long.valueOf(a3.f7422c + 1), a3);
                if (a3.o(a4)) {
                    if (a3.k()) {
                        a3.n();
                    }
                }
            }
            a3 = a4;
        }
    }
}
