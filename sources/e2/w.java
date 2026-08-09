package e2;

/* JADX INFO: loaded from: classes.dex */
public interface w {

    public static final class a {
        public static /* synthetic */ boolean a(w wVar, Throwable th, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i3 & 1) != 0) {
                th = null;
            }
            return wVar.a(th);
        }
    }

    boolean a(Throwable th);

    Object h(Object obj, M1.d dVar);

    Object j(Object obj);
}
