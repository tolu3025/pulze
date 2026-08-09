package J1;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends t {
    public static boolean r(Collection collection, Iterable elements) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean s(Collection collection, Object[] elements) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        return collection.addAll(AbstractC0406j.c(elements));
    }
}
