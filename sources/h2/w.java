package h2;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final void a(U1.l lVar, Object obj, M1.g gVar) {
        P pB = b(lVar, obj, null);
        if (pB != null) {
            c2.M.a(gVar, pB);
        }
    }

    public static final P b(U1.l lVar, Object obj, P p2) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (p2 == null || p2.getCause() == th) {
                return new P("Exception in undelivered element handler for " + obj, th);
            }
            I1.b.a(p2, th);
        }
        return p2;
    }

    public static /* synthetic */ P c(U1.l lVar, Object obj, P p2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            p2 = null;
        }
        return b(lVar, obj, p2);
    }
}
