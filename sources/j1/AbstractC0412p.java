package J1;

import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: J1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0412p extends AbstractC0411o {
    public static final Collection g(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        return new C0401e(objArr, false);
    }

    public static List h() {
        return z.f2554a;
    }

    public static int i(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        return list.size() - 1;
    }

    public static List j(Object... elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        return elements.length > 0 ? AbstractC0406j.c(elements) : h();
    }

    public static List k(Object... elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        return AbstractC0407k.p(elements);
    }

    public static final List l(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : AbstractC0411o.d(list.get(0)) : h();
    }

    public static void m() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
