package f;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: f.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0840b implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f7175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f7176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f7177c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7178d = 0;

    /* JADX INFO: renamed from: f.b$a */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // f.C0840b.e
        c c(c cVar) {
            return cVar.f7182d;
        }

        @Override // f.C0840b.e
        c d(c cVar) {
            return cVar.f7181c;
        }
    }

    /* JADX INFO: renamed from: f.b$b, reason: collision with other inner class name */
    private static class C0121b extends e {
        C0121b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // f.C0840b.e
        c c(c cVar) {
            return cVar.f7181c;
        }

        @Override // f.C0840b.e
        c d(c cVar) {
            return cVar.f7182d;
        }
    }

    /* JADX INFO: renamed from: f.b$c */
    static class c implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f7179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f7180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f7181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c f7182d;

        c(Object obj, Object obj2) {
            this.f7179a = obj;
            this.f7180b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f7179a.equals(cVar.f7179a) && this.f7180b.equals(cVar.f7180b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f7179a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f7180b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f7179a.hashCode() ^ this.f7180b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f7179a + "=" + this.f7180b;
        }
    }

    /* JADX INFO: renamed from: f.b$d */
    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f7183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7184b = true;

        d() {
        }

        @Override // f.C0840b.f
        void b(c cVar) {
            c cVar2 = this.f7183a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f7182d;
                this.f7183a = cVar3;
                this.f7184b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar;
            if (this.f7184b) {
                this.f7184b = false;
                cVar = C0840b.this.f7175a;
            } else {
                c cVar2 = this.f7183a;
                cVar = cVar2 != null ? cVar2.f7181c : null;
            }
            this.f7183a = cVar;
            return this.f7183a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f7184b) {
                return C0840b.this.f7175a != null;
            }
            c cVar = this.f7183a;
            return (cVar == null || cVar.f7181c == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: f.b$e */
    private static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f7186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c f7187b;

        e(c cVar, c cVar2) {
            this.f7186a = cVar2;
            this.f7187b = cVar;
        }

        private c f() {
            c cVar = this.f7187b;
            c cVar2 = this.f7186a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // f.C0840b.f
        public void b(c cVar) {
            if (this.f7186a == cVar && cVar == this.f7187b) {
                this.f7187b = null;
                this.f7186a = null;
            }
            c cVar2 = this.f7186a;
            if (cVar2 == cVar) {
                this.f7186a = c(cVar2);
            }
            if (this.f7187b == cVar) {
                this.f7187b = f();
            }
        }

        abstract c c(c cVar);

        abstract c d(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f7187b;
            this.f7187b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7187b != null;
        }
    }

    /* JADX INFO: renamed from: f.b$f */
    public static abstract class f {
        abstract void b(c cVar);
    }

    public Map.Entry a() {
        return this.f7175a;
    }

    protected c b(Object obj) {
        c cVar = this.f7175a;
        while (cVar != null && !cVar.f7179a.equals(obj)) {
            cVar = cVar.f7181c;
        }
        return cVar;
    }

    public d d() {
        d dVar = new d();
        this.f7177c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator descendingIterator() {
        C0121b c0121b = new C0121b(this.f7176b, this.f7175a);
        this.f7177c.put(c0121b, Boolean.FALSE);
        return c0121b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0840b)) {
            return false;
        }
        C0840b c0840b = (C0840b) obj;
        if (size() != c0840b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0840b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Map.Entry f() {
        return this.f7176b;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f7175a, this.f7176b);
        this.f7177c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    c l(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f7178d++;
        c cVar2 = this.f7176b;
        if (cVar2 == null) {
            this.f7175a = cVar;
        } else {
            cVar2.f7181c = cVar;
            cVar.f7182d = cVar2;
        }
        this.f7176b = cVar;
        return cVar;
    }

    public Object m(Object obj, Object obj2) {
        c cVarB = b(obj);
        if (cVarB != null) {
            return cVarB.f7180b;
        }
        l(obj, obj2);
        return null;
    }

    public Object n(Object obj) {
        c cVarB = b(obj);
        if (cVarB == null) {
            return null;
        }
        this.f7178d--;
        if (!this.f7177c.isEmpty()) {
            Iterator it = this.f7177c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).b(cVarB);
            }
        }
        c cVar = cVarB.f7182d;
        c cVar2 = cVarB.f7181c;
        if (cVar != null) {
            cVar.f7181c = cVar2;
        } else {
            this.f7175a = cVar2;
        }
        c cVar3 = cVarB.f7181c;
        if (cVar3 != null) {
            cVar3.f7182d = cVar;
        } else {
            this.f7176b = cVar;
        }
        cVarB.f7181c = null;
        cVarB.f7182d = null;
        return cVarB.f7180b;
    }

    public int size() {
        return this.f7178d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
