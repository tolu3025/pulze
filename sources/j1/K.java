package J1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class K extends AbstractC0399c implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f2518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2521e;

    public static final class a extends AbstractC0398b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f2523d;

        a() {
            this.f2522c = K.this.size();
            this.f2523d = K.this.f2520d;
        }

        @Override // J1.AbstractC0398b
        protected void b() {
            if (this.f2522c == 0) {
                c();
                return;
            }
            d(K.this.f2518b[this.f2523d]);
            this.f2523d = (this.f2523d + 1) % K.this.f2519c;
            this.f2522c--;
        }
    }

    public K(int i3) {
        this(new Object[i3], 0);
    }

    @Override // J1.AbstractC0397a
    public int a() {
        return this.f2521e;
    }

    @Override // J1.AbstractC0399c, java.util.List
    public Object get(int i3) {
        AbstractC0399c.f2538a.b(i3, size());
        return this.f2518b[(this.f2520d + i3) % this.f2519c];
    }

    @Override // J1.AbstractC0399c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    public final void l(Object obj) {
        if (n()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f2518b[(this.f2520d + size()) % this.f2519c] = obj;
        this.f2521e = size() + 1;
    }

    public final K m(int i3) {
        Object[] array;
        int i4 = this.f2519c;
        int iC = Y1.i.c(i4 + (i4 >> 1) + 1, i3);
        if (this.f2520d == 0) {
            array = Arrays.copyOf(this.f2518b, iC);
            kotlin.jvm.internal.m.d(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iC]);
        }
        return new K(array, size());
    }

    public final boolean n() {
        return size() == this.f2519c;
    }

    public final void o(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i3).toString());
        }
        if (i3 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i3 + ", size = " + size()).toString());
        }
        if (i3 > 0) {
            int i4 = this.f2520d;
            int i5 = (i4 + i3) % this.f2519c;
            Object[] objArr = this.f2518b;
            if (i4 > i5) {
                AbstractC0406j.j(objArr, null, i4, this.f2519c);
                AbstractC0406j.j(this.f2518b, null, 0, i5);
            } else {
                AbstractC0406j.j(objArr, null, i4, i5);
            }
            this.f2520d = i5;
            this.f2521e = size() - i3;
        }
    }

    @Override // J1.AbstractC0397a, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public K(Object[] buffer, int i3) {
        kotlin.jvm.internal.m.e(buffer, "buffer");
        this.f2518b = buffer;
        if (i3 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i3).toString());
        }
        if (i3 <= buffer.length) {
            this.f2519c = buffer.length;
            this.f2521e = i3;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i3 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    @Override // J1.AbstractC0397a, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            kotlin.jvm.internal.m.d(array, "copyOf(...)");
        }
        int size = size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.f2520d; i4 < size && i5 < this.f2519c; i5++) {
            array[i4] = this.f2518b[i5];
            i4++;
        }
        while (i4 < size) {
            array[i4] = this.f2518b[i3];
            i4++;
            i3++;
        }
        return AbstractC0411o.f(size, array);
    }
}
