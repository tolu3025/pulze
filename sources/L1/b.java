package L1;

import U1.l;
import kotlin.jvm.internal.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static int a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int b(Object obj, Object obj2, l... selectors) {
        m.e(selectors, "selectors");
        if (selectors.length > 0) {
            return c(obj, obj2, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final int c(Object obj, Object obj2, l[] lVarArr) {
        for (l lVar : lVarArr) {
            int iA = a((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }
}
