package e2;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final g a(int i3, a aVar, U1.l lVar) {
        g eVar;
        if (i3 == -2) {
            eVar = aVar == a.f7117a ? new e(g.f7162k.a(), lVar) : new r(1, aVar, lVar);
        } else {
            if (i3 == -1) {
                if (aVar == a.f7117a) {
                    return new r(1, a.f7118b, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i3 != 0) {
                return i3 != Integer.MAX_VALUE ? aVar == a.f7117a ? new e(i3, lVar) : new r(i3, aVar, lVar) : new e(a.e.API_PRIORITY_OTHER, lVar);
            }
            eVar = aVar == a.f7117a ? new e(0, lVar) : new r(1, aVar, lVar);
        }
        return eVar;
    }

    public static /* synthetic */ g b(int i3, a aVar, U1.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i3 = 0;
        }
        if ((i4 & 2) != 0) {
            aVar = a.f7117a;
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        return a(i3, aVar, lVar);
    }
}
