package androidx.datastore.preferences.protobuf;

import c.AbstractC0527b;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
abstract class b0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f4042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f4043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile f f4045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f4046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile c f4047f;

    class a extends b0 {
        a() {
            super(null);
        }

        @Override // androidx.datastore.preferences.protobuf.b0
        public void p() {
            if (!o()) {
                if (k() > 0) {
                    AbstractC0527b.a(j(0).getKey());
                    throw null;
                }
                Iterator it = m().iterator();
                if (it.hasNext()) {
                    AbstractC0527b.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.r((Comparable) obj, obj2);
        }
    }

    private class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f4048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f4049b;

        private b() {
            this.f4048a = b0.this.f4042a.size();
        }

        private Iterator b() {
            if (this.f4049b == null) {
                this.f4049b = b0.this.f4046e.entrySet().iterator();
            }
            return this.f4049b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object next;
            if (b().hasNext()) {
                next = b().next();
            } else {
                List list = b0.this.f4042a;
                int i3 = this.f4048a - 1;
                this.f4048a = i3;
                next = list.get(i3);
            }
            return (Map.Entry) next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i3 = this.f4048a;
            return (i3 > 0 && i3 <= b0.this.f4042a.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(b0 b0Var, a aVar) {
            this();
        }
    }

    private class c extends f {
        private c() {
            super(b0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.b0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(b0.this, null);
        }

        /* synthetic */ c(b0 b0Var, a aVar) {
            this();
        }
    }

    private class d implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparable f4052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f4053b;

        d(Comparable comparable, Object obj) {
            this.f4052a = comparable;
            this.f4053b = obj;
        }

        private boolean e(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e(this.f4052a, entry.getKey()) && e(this.f4053b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f4052a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f4053b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f4052a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f4053b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            b0.this.g();
            Object obj2 = this.f4053b;
            this.f4053b = obj;
            return obj2;
        }

        public String toString() {
            return this.f4052a + "=" + this.f4053b;
        }

        d(b0 b0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }
    }

    private class e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f4055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f4056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f4057c;

        private e() {
            this.f4055a = -1;
        }

        private Iterator b() {
            if (this.f4057c == null) {
                this.f4057c = b0.this.f4043b.entrySet().iterator();
            }
            return this.f4057c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f4056b = true;
            int i3 = this.f4055a + 1;
            this.f4055a = i3;
            return (Map.Entry) (i3 < b0.this.f4042a.size() ? b0.this.f4042a.get(this.f4055a) : b().next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f4055a + 1 >= b0.this.f4042a.size()) {
                return !b0.this.f4043b.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f4056b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f4056b = false;
            b0.this.g();
            if (this.f4055a >= b0.this.f4042a.size()) {
                b().remove();
                return;
            }
            b0 b0Var = b0.this;
            int i3 = this.f4055a;
            this.f4055a = i3 - 1;
            b0Var.s(i3);
        }

        /* synthetic */ e(b0 b0Var, a aVar) {
            this();
        }
    }

    private class f extends AbstractSet {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            b0.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = b0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(b0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            b0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.size();
        }

        /* synthetic */ f(b0 b0Var, a aVar) {
            this();
        }
    }

    private b0() {
        this.f4042a = Collections.emptyList();
        this.f4043b = Collections.emptyMap();
        this.f4046e = Collections.emptyMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int f(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f4042a
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f4042a
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.b0$d r2 = (androidx.datastore.preferences.protobuf.b0.d) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f4042a
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.b0$d r3 = (androidx.datastore.preferences.protobuf.b0.d) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b0.f(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f4044c) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f4042a.isEmpty() || (this.f4042a instanceof ArrayList)) {
            return;
        }
        this.f4042a = new ArrayList(16);
    }

    private SortedMap n() {
        g();
        if (this.f4043b.isEmpty() && !(this.f4043b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4043b = treeMap;
            this.f4046e = treeMap.descendingMap();
        }
        return (SortedMap) this.f4043b;
    }

    static b0 q() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object s(int i3) {
        g();
        Object value = ((d) this.f4042a.remove(i3)).getValue();
        if (!this.f4043b.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f4042a.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f4042a.isEmpty()) {
            this.f4042a.clear();
        }
        if (this.f4043b.isEmpty()) {
            return;
        }
        this.f4043b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f4043b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f4045d == null) {
            this.f4045d = new f(this, null);
        }
        return this.f4045d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return super.equals(obj);
        }
        b0 b0Var = (b0) obj;
        int size = size();
        if (size != b0Var.size()) {
            return false;
        }
        int iK = k();
        if (iK != b0Var.k()) {
            return entrySet().equals(b0Var.entrySet());
        }
        for (int i3 = 0; i3 < iK; i3++) {
            if (!j(i3).equals(b0Var.j(i3))) {
                return false;
            }
        }
        if (iK != size) {
            return this.f4043b.equals(b0Var.f4043b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((d) this.f4042a.get(iF)).getValue() : this.f4043b.get(comparable);
    }

    Set h() {
        if (this.f4047f == null) {
            this.f4047f = new c(this, null);
        }
        return this.f4047f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i3 = 0; i3 < iK; i3++) {
            iHashCode += ((d) this.f4042a.get(i3)).hashCode();
        }
        return l() > 0 ? iHashCode + this.f4043b.hashCode() : iHashCode;
    }

    public Map.Entry j(int i3) {
        return (Map.Entry) this.f4042a.get(i3);
    }

    public int k() {
        return this.f4042a.size();
    }

    public int l() {
        return this.f4043b.size();
    }

    public Iterable m() {
        return this.f4043b.isEmpty() ? Collections.emptySet() : this.f4043b.entrySet();
    }

    public boolean o() {
        return this.f4044c;
    }

    public void p() {
        if (this.f4044c) {
            return;
        }
        this.f4043b = this.f4043b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4043b);
        this.f4046e = this.f4046e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4046e);
        this.f4044c = true;
    }

    public Object r(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((d) this.f4042a.get(iF)).setValue(obj);
        }
        i();
        int i3 = -(iF + 1);
        if (i3 >= 16) {
            return n().put(comparable, obj);
        }
        if (this.f4042a.size() == 16) {
            d dVar = (d) this.f4042a.remove(15);
            n().put(dVar.getKey(), dVar.getValue());
        }
        this.f4042a.add(i3, new d(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return s(iF);
        }
        if (this.f4043b.isEmpty()) {
            return null;
        }
        return this.f4043b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f4042a.size() + this.f4043b.size();
    }

    /* synthetic */ b0(a aVar) {
        this();
    }
}
