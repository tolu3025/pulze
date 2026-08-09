package a2;

import I1.n;
import I1.o;
import I1.u;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
final class d extends e implements Iterator, M1.d, V1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f3591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f3592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private M1.d f3593d;

    private final Throwable e() {
        int i3 = this.f3590a;
        if (i3 == 4) {
            return new NoSuchElementException();
        }
        if (i3 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f3590a);
    }

    private final Object f() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // a2.e
    public Object d(Object obj, M1.d dVar) {
        this.f3591b = obj;
        this.f3590a = 3;
        this.f3593d = dVar;
        Object objE = N1.d.e();
        if (objE == N1.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objE == N1.d.e() ? objE : u.f2419a;
    }

    @Override // M1.d
    public M1.g getContext() {
        return M1.h.f2707a;
    }

    public final void h(M1.d dVar) {
        this.f3593d = dVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i3 = this.f3590a;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2 || i3 == 3) {
                        return true;
                    }
                    if (i3 == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator it = this.f3592c;
                m.b(it);
                if (it.hasNext()) {
                    this.f3590a = 2;
                    return true;
                }
                this.f3592c = null;
            }
            this.f3590a = 5;
            M1.d dVar = this.f3593d;
            m.b(dVar);
            this.f3593d = null;
            n.a aVar = n.f2411b;
            dVar.resumeWith(n.b(u.f2419a));
        }
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i3 = this.f3590a;
        if (i3 == 0 || i3 == 1) {
            return f();
        }
        if (i3 == 2) {
            this.f3590a = 1;
            Iterator it = this.f3592c;
            m.b(it);
            return it.next();
        }
        if (i3 != 3) {
            throw e();
        }
        this.f3590a = 0;
        Object obj = this.f3591b;
        this.f3591b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // M1.d
    public void resumeWith(Object obj) throws Throwable {
        o.b(obj);
        this.f3590a = 4;
    }
}
