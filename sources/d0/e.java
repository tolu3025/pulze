package D0;

import J0.AbstractC0386b;
import J0.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Comparable, Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f1257a;

    e(List list) {
        this.f1257a = list;
    }

    private static int o(String str, String str2) {
        boolean zU = u(str);
        boolean zU2 = u(str2);
        if (zU && !zU2) {
            return -1;
        }
        if (zU || !zU2) {
            return (zU && zU2) ? Long.compare(r(str), r(str2)) : L.i(str, str2);
        }
        return 1;
    }

    private static long r(String str) {
        return Long.parseLong(str.substring(4, str.length() - 2));
    }

    private static boolean u(String str) {
        return str.startsWith("__id") && str.endsWith("__");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    public int hashCode() {
        return ((getClass().hashCode() + 37) * 37) + this.f1257a.hashCode();
    }

    public boolean isEmpty() {
        return w() == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f1257a.iterator();
    }

    public e l(e eVar) {
        ArrayList arrayList = new ArrayList(this.f1257a);
        arrayList.addAll(eVar.f1257a);
        return q(arrayList);
    }

    public e m(String str) {
        ArrayList arrayList = new ArrayList(this.f1257a);
        arrayList.add(str);
        return q(arrayList);
    }

    public abstract String n();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        int iW = w();
        int iW2 = eVar.w();
        for (int i3 = 0; i3 < iW && i3 < iW2; i3++) {
            int iO = o(t(i3), eVar.t(i3));
            if (iO != 0) {
                return iO;
            }
        }
        return Integer.compare(iW, iW2);
    }

    abstract e q(List list);

    public String s() {
        return (String) this.f1257a.get(w() - 1);
    }

    public String t(int i3) {
        return (String) this.f1257a.get(i3);
    }

    public String toString() {
        return n();
    }

    public boolean v(e eVar) {
        if (w() > eVar.w()) {
            return false;
        }
        for (int i3 = 0; i3 < w(); i3++) {
            if (!t(i3).equals(eVar.t(i3))) {
                return false;
            }
        }
        return true;
    }

    public int w() {
        return this.f1257a.size();
    }

    public e x(int i3) {
        int iW = w();
        AbstractC0386b.d(iW >= i3, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i3), Integer.valueOf(iW));
        return q(this.f1257a.subList(i3, iW));
    }

    public e y() {
        return q(this.f1257a.subList(0, w() - 1));
    }
}
