package J1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends AbstractC0412p {
    public static int n(Iterable iterable, int i3) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i3;
    }

    public static List o(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            u.r(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
