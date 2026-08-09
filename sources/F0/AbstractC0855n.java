package f0;

import e0.AbstractC0826g;
import e0.AbstractC0829j;
import i0.AbstractC0901a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: f0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0855n {
    static int a(int i3) {
        AbstractC0844c.b(i3, "arraySize");
        return AbstractC0901a.a(((long) i3) + 5 + ((long) (i3 / 10)));
    }

    static boolean b(List list, Object obj) {
        if (obj == AbstractC0829j.n(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return AbstractC0854m.a(list.iterator(), list2.iterator());
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (!AbstractC0826g.a(list.get(i3), list2.get(i3))) {
                return false;
            }
        }
        return true;
    }

    static int c(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return d(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (AbstractC0826g.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int d(List list, Object obj) {
        int size = list.size();
        int i3 = 0;
        if (obj == null) {
            while (i3 < size) {
                if (list.get(i3) == null) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        while (i3 < size) {
            if (obj.equals(list.get(i3))) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    static int e(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return f(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (AbstractC0826g.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int f(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static ArrayList g(Object... objArr) {
        AbstractC0829j.n(objArr);
        ArrayList arrayList = new ArrayList(a(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }
}
