package J1;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class v extends u {
    public static List w(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        return new J(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int x(List list, int i3) {
        if (i3 >= 0 && i3 <= AbstractC0412p.i(list)) {
            return AbstractC0412p.i(list) - i3;
        }
        throw new IndexOutOfBoundsException("Element index " + i3 + " must be in range [" + new Y1.f(0, AbstractC0412p.i(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int y(List list, int i3) {
        return AbstractC0412p.i(list) - i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int z(List list, int i3) {
        if (i3 >= 0 && i3 <= list.size()) {
            return list.size() - i3;
        }
        throw new IndexOutOfBoundsException("Position index " + i3 + " must be in range [" + new Y1.f(0, list.size()) + "].");
    }
}
