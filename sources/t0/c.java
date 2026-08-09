package t0;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Iterable {
    public abstract boolean a(Object obj);

    public abstract Object b(Object obj);

    public abstract Comparator d();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!d().equals(cVar.d()) || size() != cVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = cVar.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Object f();

    public int hashCode() {
        int iHashCode = d().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public abstract int indexOf(Object obj);

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public abstract Iterator iterator();

    public abstract Object l();

    public abstract c m(Object obj, Object obj2);

    public abstract Iterator n(Object obj);

    public abstract c o(Object obj);

    public abstract int size();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it = iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final InterfaceC0167a f11297a = new InterfaceC0167a() { // from class: t0.b
            @Override // t0.c.a.InterfaceC0167a
            public final Object a(Object obj) {
                return c.a.e(obj);
            }
        };

        /* JADX INFO: renamed from: t0.c$a$a, reason: collision with other inner class name */
        public interface InterfaceC0167a {
            Object a(Object obj);
        }

        public static c b(List list, Map map, InterfaceC0167a interfaceC0167a, Comparator comparator) {
            return list.size() < 25 ? C1224a.s(list, map, interfaceC0167a, comparator) : k.p(list, map, interfaceC0167a, comparator);
        }

        public static c c(Comparator comparator) {
            return new C1224a(comparator);
        }

        public static InterfaceC0167a d() {
            return f11297a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object e(Object obj) {
            return obj;
        }
    }
}
