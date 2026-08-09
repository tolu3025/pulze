package h2;

import c2.J0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    private static final u a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        d();
        throw new I1.d();
    }

    static /* synthetic */ u b(Throwable th, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            th = null;
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(J0 j02) {
        return j02.Y() instanceof u;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final J0 e(r rVar, List list) {
        try {
            return rVar.b(list);
        } catch (Throwable th) {
            return a(th, rVar.a());
        }
    }
}
