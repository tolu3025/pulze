package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a extends f implements Map {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    e f3701m;

    /* JADX INFO: renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    class C0075a extends e {
        C0075a() {
        }

        @Override // androidx.collection.e
        protected void a() {
            a.this.clear();
        }

        @Override // androidx.collection.e
        protected Object b(int i3, int i4) {
            return a.this.f3737b[(i3 << 1) + i4];
        }

        @Override // androidx.collection.e
        protected Map c() {
            return a.this;
        }

        @Override // androidx.collection.e
        protected int d() {
            return a.this.f3738c;
        }

        @Override // androidx.collection.e
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // androidx.collection.e
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // androidx.collection.e
        protected void g(Object obj, Object obj2) {
            a.this.put(obj, obj2);
        }

        @Override // androidx.collection.e
        protected void h(int i3) {
            a.this.j(i3);
        }

        @Override // androidx.collection.e
        protected Object i(int i3, Object obj) {
            return a.this.k(i3, obj);
        }
    }

    public a() {
    }

    private e m() {
        if (this.f3701m == null) {
            this.f3701m = new C0075a();
        }
        return this.f3701m;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return m().l();
    }

    @Override // java.util.Map
    public Set keySet() {
        return m().m();
    }

    public boolean n(Collection collection) {
        return e.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c(this.f3738c + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        return m().n();
    }

    public a(int i3) {
        super(i3);
    }
}
