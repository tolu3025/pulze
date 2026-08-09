package f0;

import com.google.android.gms.common.api.a;
import e0.AbstractC0829j;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: f0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0850i extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f7193a = new Object[0];

    /* JADX INFO: renamed from: f0.i$a */
    static abstract class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object[] f7194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f7196c;

        a(int i3) {
            AbstractC0844c.b(i3, "initialCapacity");
            this.f7194a = new Object[i3];
            this.f7195b = 0;
        }

        private void e(int i3) {
            Object[] objArr = this.f7194a;
            if (objArr.length < i3) {
                this.f7194a = Arrays.copyOf(objArr, b.c(objArr.length, i3));
            } else if (!this.f7196c) {
                return;
            } else {
                this.f7194a = (Object[]) objArr.clone();
            }
            this.f7196c = false;
        }

        @Override // f0.AbstractC0850i.b
        public b b(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                e(this.f7195b + collection.size());
                if (collection instanceof AbstractC0850i) {
                    this.f7195b = ((AbstractC0850i) collection).b(this.f7194a, this.f7195b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a d(Object obj) {
            AbstractC0829j.n(obj);
            e(this.f7195b + 1);
            Object[] objArr = this.f7194a;
            int i3 = this.f7195b;
            this.f7195b = i3 + 1;
            objArr[i3] = obj;
            return this;
        }
    }

    /* JADX INFO: renamed from: f0.i$b */
    public static abstract class b {
        b() {
        }

        static int c(int i3, int i4) {
            if (i4 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i3 + (i3 >> 1) + 1;
            if (iHighestOneBit < i4) {
                iHighestOneBit = Integer.highestOneBit(i4 - 1) << 1;
            }
            return iHighestOneBit < 0 ? a.e.API_PRIORITY_OTHER : iHighestOneBit;
        }

        public abstract b a(Object obj);

        public b b(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    AbstractC0850i() {
    }

    public abstract AbstractC0851j a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    abstract int b(Object[] objArr, int i3);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    Object[] d() {
        return null;
    }

    int f() {
        throw new UnsupportedOperationException();
    }

    int l() {
        throw new UnsupportedOperationException();
    }

    abstract boolean m();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f7193a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC0829j.n(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrD = d();
            if (objArrD != null) {
                return AbstractC0860s.a(objArrD, l(), f(), objArr);
            }
            objArr = AbstractC0858q.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        b(objArr, 0);
        return objArr;
    }
}
