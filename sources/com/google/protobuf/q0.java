package com.google.protobuf;

import c.AbstractC0527b;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
abstract class q0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f6881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f6882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile g f6884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f6885f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile c f6886l;

    class a extends q0 {
        a(int i3) {
            super(i3, null);
        }

        @Override // com.google.protobuf.q0
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
        private int f6887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f6888b;

        private b() {
            this.f6887a = q0.this.f6881b.size();
        }

        private Iterator b() {
            if (this.f6888b == null) {
                this.f6888b = q0.this.f6885f.entrySet().iterator();
            }
            return this.f6888b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object next;
            if (b().hasNext()) {
                next = b().next();
            } else {
                List list = q0.this.f6881b;
                int i3 = this.f6887a - 1;
                this.f6887a = i3;
                next = list.get(i3);
            }
            return (Map.Entry) next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i3 = this.f6887a;
            return (i3 > 0 && i3 <= q0.this.f6881b.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(q0 q0Var, a aVar) {
            this();
        }
    }

    private class c extends g {
        private c() {
            super(q0.this, null);
        }

        @Override // com.google.protobuf.q0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(q0.this, null);
        }

        /* synthetic */ c(q0 q0Var, a aVar) {
            this();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator f6891a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable f6892b = new b();

        class a implements Iterator {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        class b implements Iterable {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f6891a;
            }
        }

        static Iterable b() {
            return f6892b;
        }
    }

    private class e implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparable f6893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f6894b;

        e(Comparable comparable, Object obj) {
            this.f6893a = comparable;
            this.f6894b = obj;
        }

        private boolean e(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
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
            return e(this.f6893a, entry.getKey()) && e(this.f6894b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f6893a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f6894b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f6893a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f6894b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            q0.this.g();
            Object obj2 = this.f6894b;
            this.f6894b = obj;
            return obj2;
        }

        public String toString() {
            return this.f6893a + "=" + this.f6894b;
        }

        e(q0 q0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }
    }

    private class f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f6897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f6898c;

        private f() {
            this.f6896a = -1;
        }

        private Iterator b() {
            if (this.f6898c == null) {
                this.f6898c = q0.this.f6882c.entrySet().iterator();
            }
            return this.f6898c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f6897b = true;
            int i3 = this.f6896a + 1;
            this.f6896a = i3;
            return (Map.Entry) (i3 < q0.this.f6881b.size() ? q0.this.f6881b.get(this.f6896a) : b().next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6896a + 1 >= q0.this.f6881b.size()) {
                return !q0.this.f6882c.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f6897b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f6897b = false;
            q0.this.g();
            if (this.f6896a >= q0.this.f6881b.size()) {
                b().remove();
                return;
            }
            q0 q0Var = q0.this;
            int i3 = this.f6896a;
            this.f6896a = i3 - 1;
            q0Var.s(i3);
        }

        /* synthetic */ f(q0 q0Var, a aVar) {
            this();
        }
    }

    private class g extends AbstractSet {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            q0.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            q0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = q0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(q0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            q0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return q0.this.size();
        }

        /* synthetic */ g(q0 q0Var, a aVar) {
            this();
        }
    }

    private q0(int i3) {
        this.f6880a = i3;
        this.f6881b = Collections.emptyList();
        this.f6882c = Collections.emptyMap();
        this.f6885f = Collections.emptyMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int f(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f6881b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f6881b
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.q0$e r2 = (com.google.protobuf.q0.e) r2
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
            java.util.List r3 = r4.f6881b
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.q0$e r3 = (com.google.protobuf.q0.e) r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q0.f(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f6883d) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f6881b.isEmpty() || (this.f6881b instanceof ArrayList)) {
            return;
        }
        this.f6881b = new ArrayList(this.f6880a);
    }

    private SortedMap n() {
        g();
        if (this.f6882c.isEmpty() && !(this.f6882c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6882c = treeMap;
            this.f6885f = treeMap.descendingMap();
        }
        return (SortedMap) this.f6882c;
    }

    static q0 q(int i3) {
        return new a(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object s(int i3) {
        g();
        Object value = ((e) this.f6881b.remove(i3)).getValue();
        if (!this.f6882c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f6881b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f6881b.isEmpty()) {
            this.f6881b.clear();
        }
        if (this.f6882c.isEmpty()) {
            return;
        }
        this.f6882c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f6882c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f6884e == null) {
            this.f6884e = new g(this, null);
        }
        return this.f6884e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return super.equals(obj);
        }
        q0 q0Var = (q0) obj;
        int size = size();
        if (size != q0Var.size()) {
            return false;
        }
        int iK = k();
        if (iK != q0Var.k()) {
            return entrySet().equals(q0Var.entrySet());
        }
        for (int i3 = 0; i3 < iK; i3++) {
            if (!j(i3).equals(q0Var.j(i3))) {
                return false;
            }
        }
        if (iK != size) {
            return this.f6882c.equals(q0Var.f6882c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((e) this.f6881b.get(iF)).getValue() : this.f6882c.get(comparable);
    }

    Set h() {
        if (this.f6886l == null) {
            this.f6886l = new c(this, null);
        }
        return this.f6886l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i3 = 0; i3 < iK; i3++) {
            iHashCode += ((e) this.f6881b.get(i3)).hashCode();
        }
        return l() > 0 ? iHashCode + this.f6882c.hashCode() : iHashCode;
    }

    public Map.Entry j(int i3) {
        return (Map.Entry) this.f6881b.get(i3);
    }

    public int k() {
        return this.f6881b.size();
    }

    public int l() {
        return this.f6882c.size();
    }

    public Iterable m() {
        return this.f6882c.isEmpty() ? d.b() : this.f6882c.entrySet();
    }

    public boolean o() {
        return this.f6883d;
    }

    public void p() {
        if (this.f6883d) {
            return;
        }
        this.f6882c = this.f6882c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f6882c);
        this.f6885f = this.f6885f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f6885f);
        this.f6883d = true;
    }

    public Object r(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((e) this.f6881b.get(iF)).setValue(obj);
        }
        i();
        int i3 = -(iF + 1);
        if (i3 >= this.f6880a) {
            return n().put(comparable, obj);
        }
        int size = this.f6881b.size();
        int i4 = this.f6880a;
        if (size == i4) {
            e eVar = (e) this.f6881b.remove(i4 - 1);
            n().put(eVar.getKey(), eVar.getValue());
        }
        this.f6881b.add(i3, new e(comparable, obj));
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
        if (this.f6882c.isEmpty()) {
            return null;
        }
        return this.f6882c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f6881b.size() + this.f6882c.size();
    }

    /* synthetic */ q0(int i3, a aVar) {
        this(i3);
    }
}
