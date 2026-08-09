package g2;

/* JADX INFO: loaded from: classes.dex */
public interface k extends f2.b {

    public static final class a {
        public static /* synthetic */ f2.b a(k kVar, M1.g gVar, int i3, e2.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i4 & 1) != 0) {
                gVar = M1.h.f2707a;
            }
            if ((i4 & 2) != 0) {
                i3 = -3;
            }
            if ((i4 & 4) != 0) {
                aVar = e2.a.f7117a;
            }
            return kVar.b(gVar, i3, aVar);
        }
    }

    f2.b b(M1.g gVar, int i3, e2.a aVar);
}
