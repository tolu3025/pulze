package t0;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t0.c;

/* JADX INFO: loaded from: classes.dex */
public class e implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f11300a;

    private static class a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator f11301a;

        public a(Iterator it) {
            this.f11301a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11301a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return ((Map.Entry) this.f11301a.next()).getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f11301a.remove();
        }
    }

    public e(List list, Comparator comparator) {
        this.f11300a = c.a.b(list, Collections.emptyMap(), c.a.d(), comparator);
    }

    public Object a() {
        return this.f11300a.f();
    }

    public Object b() {
        return this.f11300a.l();
    }

    public boolean contains(Object obj) {
        return this.f11300a.a(obj);
    }

    public e d(Object obj) {
        return new e(this.f11300a.m(obj, null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f11300a.equals(((e) obj).f11300a);
        }
        return false;
    }

    public Iterator f(Object obj) {
        return new a(this.f11300a.n(obj));
    }

    public int hashCode() {
        return this.f11300a.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f11300a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f11300a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this.f11300a.iterator());
    }

    public e l(Object obj) {
        c cVarO = this.f11300a.o(obj);
        return cVarO == this.f11300a ? this : new e(cVarO);
    }

    public e m(e eVar) {
        e eVarD;
        if (size() < eVar.size()) {
            eVarD = eVar;
            eVar = this;
        } else {
            eVarD = this;
        }
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            eVarD = eVarD.d(it.next());
        }
        return eVarD;
    }

    public int size() {
        return this.f11300a.size();
    }

    private e(c cVar) {
        this.f11300a = cVar;
    }
}
