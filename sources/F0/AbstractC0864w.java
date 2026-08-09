package f0;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: f0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0864w {
    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static int b(Set set) {
        Iterator it = set.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3 = ~(~(i3 + (next != null ? next.hashCode() : 0)));
        }
        return i3;
    }
}
