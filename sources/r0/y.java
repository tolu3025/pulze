package r0;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class y implements L0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set f11171b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set f11170a = Collections.newSetFromMap(new ConcurrentHashMap());

    y(Collection collection) {
        this.f11170a.addAll(collection);
    }

    static y b(Collection collection) {
        return new y((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f11170a.iterator();
            while (it.hasNext()) {
                this.f11171b.add(((L0.b) it.next()).get());
            }
            this.f11170a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(L0.b bVar) {
        Set set;
        L0.b bVar2;
        try {
            if (this.f11171b == null) {
                set = this.f11170a;
                bVar2 = bVar;
            } else {
                set = this.f11171b;
                bVar2 = bVar.get();
            }
            set.add(bVar2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // L0.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f11171b == null) {
            synchronized (this) {
                try {
                    if (this.f11171b == null) {
                        this.f11171b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f11171b);
    }
}
