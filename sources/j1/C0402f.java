package J1;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: J1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0402f extends AbstractC0400d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2547d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object[] f2548e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f2550b = f2548e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2551c;

    /* JADX INFO: renamed from: J1.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    private final void d(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2550b.length;
        while (i3 < length && it.hasNext()) {
            this.f2550b[i3] = it.next();
            i3++;
        }
        int i4 = this.f2549a;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.f2550b[i5] = it.next();
        }
        this.f2551c = size() + collection.size();
    }

    private final void f(int i3) {
        Object[] objArr = new Object[i3];
        Object[] objArr2 = this.f2550b;
        AbstractC0406j.e(objArr2, objArr, 0, this.f2549a, objArr2.length);
        Object[] objArr3 = this.f2550b;
        int length = objArr3.length;
        int i4 = this.f2549a;
        AbstractC0406j.e(objArr3, objArr, length - i4, 0, i4);
        this.f2549a = 0;
        this.f2550b = objArr;
    }

    private final int l(int i3) {
        return i3 == 0 ? AbstractC0407k.r(this.f2550b) : i3 - 1;
    }

    private final void m(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f2550b;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == f2548e) {
            this.f2550b = new Object[Y1.i.a(i3, 10)];
        } else {
            f(AbstractC0399c.f2538a.e(objArr.length, i3));
        }
    }

    private final int n(int i3) {
        if (i3 == AbstractC0407k.r(this.f2550b)) {
            return 0;
        }
        return i3 + 1;
    }

    private final int o(int i3) {
        return i3 < 0 ? i3 + this.f2550b.length : i3;
    }

    private final void p(int i3, int i4) {
        Object[] objArr = this.f2550b;
        if (i3 < i4) {
            AbstractC0406j.j(objArr, null, i3, i4);
        } else {
            AbstractC0406j.j(objArr, null, i3, objArr.length);
            AbstractC0406j.j(this.f2550b, null, 0, i4);
        }
    }

    private final int q(int i3) {
        Object[] objArr = this.f2550b;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    private final void r() {
        ((AbstractList) this).modCount++;
    }

    private final void t(int i3, int i4) {
        int iQ = q(this.f2549a + (i3 - 1));
        int iQ2 = q(this.f2549a + (i4 - 1));
        while (i3 > 0) {
            int i5 = iQ + 1;
            int iMin = Math.min(i3, Math.min(i5, iQ2 + 1));
            Object[] objArr = this.f2550b;
            int i6 = iQ2 - iMin;
            int i7 = iQ - iMin;
            AbstractC0406j.e(objArr, objArr, i6 + 1, i7 + 1, i5);
            iQ = o(i7);
            iQ2 = o(i6);
            i3 -= iMin;
        }
    }

    private final void u(int i3, int i4) {
        int iQ = q(this.f2549a + i4);
        int iQ2 = q(this.f2549a + i3);
        int size = size();
        while (true) {
            size -= i4;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f2550b;
            i4 = Math.min(size, Math.min(objArr.length - iQ, objArr.length - iQ2));
            Object[] objArr2 = this.f2550b;
            int i5 = iQ + i4;
            AbstractC0406j.e(objArr2, objArr2, iQ2, iQ, i5);
            iQ = q(i5);
            iQ2 = q(iQ2 + i4);
        }
    }

    @Override // J1.AbstractC0400d
    public int a() {
        return this.f2551c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i3, Object obj) {
        AbstractC0399c.f2538a.c(i3, size());
        if (i3 == size()) {
            addLast(obj);
            return;
        }
        if (i3 == 0) {
            addFirst(obj);
            return;
        }
        r();
        m(size() + 1);
        int iQ = q(this.f2549a + i3);
        if (i3 < ((size() + 1) >> 1)) {
            int iL = l(iQ);
            int iL2 = l(this.f2549a);
            int i4 = this.f2549a;
            if (iL >= i4) {
                Object[] objArr = this.f2550b;
                objArr[iL2] = objArr[i4];
                AbstractC0406j.e(objArr, objArr, i4, i4 + 1, iL + 1);
            } else {
                Object[] objArr2 = this.f2550b;
                AbstractC0406j.e(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                Object[] objArr3 = this.f2550b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC0406j.e(objArr3, objArr3, 0, 1, iL + 1);
            }
            this.f2550b[iL] = obj;
            this.f2549a = iL2;
        } else {
            int iQ2 = q(this.f2549a + size());
            Object[] objArr4 = this.f2550b;
            if (iQ < iQ2) {
                AbstractC0406j.e(objArr4, objArr4, iQ + 1, iQ, iQ2);
            } else {
                AbstractC0406j.e(objArr4, objArr4, 1, 0, iQ2);
                Object[] objArr5 = this.f2550b;
                objArr5[0] = objArr5[objArr5.length - 1];
                AbstractC0406j.e(objArr5, objArr5, iQ + 1, iQ, objArr5.length - 1);
            }
            this.f2550b[iQ] = obj;
        }
        this.f2551c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i3, Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        AbstractC0399c.f2538a.c(i3, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i3 == size()) {
            return addAll(elements);
        }
        r();
        m(size() + elements.size());
        int iQ = q(this.f2549a + size());
        int iQ2 = q(this.f2549a + i3);
        int size = elements.size();
        if (i3 < ((size() + 1) >> 1)) {
            int i4 = this.f2549a;
            int length = i4 - size;
            if (iQ2 < i4) {
                Object[] objArr = this.f2550b;
                AbstractC0406j.e(objArr, objArr, length, i4, objArr.length);
                Object[] objArr2 = this.f2550b;
                if (size >= iQ2) {
                    AbstractC0406j.e(objArr2, objArr2, objArr2.length - size, 0, iQ2);
                } else {
                    AbstractC0406j.e(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f2550b;
                    AbstractC0406j.e(objArr3, objArr3, 0, size, iQ2);
                }
            } else if (length >= 0) {
                Object[] objArr4 = this.f2550b;
                AbstractC0406j.e(objArr4, objArr4, length, i4, iQ2);
            } else {
                Object[] objArr5 = this.f2550b;
                length += objArr5.length;
                int i5 = iQ2 - i4;
                int length2 = objArr5.length - length;
                if (length2 >= i5) {
                    AbstractC0406j.e(objArr5, objArr5, length, i4, iQ2);
                } else {
                    AbstractC0406j.e(objArr5, objArr5, length, i4, i4 + length2);
                    Object[] objArr6 = this.f2550b;
                    AbstractC0406j.e(objArr6, objArr6, 0, this.f2549a + length2, iQ2);
                }
            }
            this.f2549a = length;
            d(o(iQ2 - size), elements);
        } else {
            int length3 = iQ2 + size;
            if (iQ2 < iQ) {
                int i6 = size + iQ;
                Object[] objArr7 = this.f2550b;
                if (i6 <= objArr7.length) {
                    AbstractC0406j.e(objArr7, objArr7, length3, iQ2, iQ);
                } else if (length3 >= objArr7.length) {
                    length3 -= objArr7.length;
                    AbstractC0406j.e(objArr7, objArr7, length3, iQ2, iQ);
                } else {
                    int length4 = iQ - (i6 - objArr7.length);
                    AbstractC0406j.e(objArr7, objArr7, 0, length4, iQ);
                    Object[] objArr8 = this.f2550b;
                    AbstractC0406j.e(objArr8, objArr8, length3, iQ2, length4);
                }
            } else {
                Object[] objArr9 = this.f2550b;
                AbstractC0406j.e(objArr9, objArr9, size, 0, iQ);
                Object[] objArr10 = this.f2550b;
                if (length3 >= objArr10.length) {
                    AbstractC0406j.e(objArr10, objArr10, length3 - objArr10.length, iQ2, objArr10.length);
                } else {
                    AbstractC0406j.e(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f2550b;
                    AbstractC0406j.e(objArr11, objArr11, length3, iQ2, objArr11.length - size);
                }
            }
            d(iQ2, elements);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        r();
        m(size() + 1);
        int iL = l(this.f2549a);
        this.f2549a = iL;
        this.f2550b[iL] = obj;
        this.f2551c = size() + 1;
    }

    public final void addLast(Object obj) {
        r();
        m(size() + 1);
        this.f2550b[q(this.f2549a + size())] = obj;
        this.f2551c = size() + 1;
    }

    @Override // J1.AbstractC0400d
    public Object b(int i3) {
        AbstractC0399c.f2538a.b(i3, size());
        if (i3 == AbstractC0412p.i(this)) {
            return removeLast();
        }
        if (i3 == 0) {
            return removeFirst();
        }
        r();
        int iQ = q(this.f2549a + i3);
        Object obj = this.f2550b[iQ];
        if (i3 < (size() >> 1)) {
            int i4 = this.f2549a;
            if (iQ >= i4) {
                Object[] objArr = this.f2550b;
                AbstractC0406j.e(objArr, objArr, i4 + 1, i4, iQ);
            } else {
                Object[] objArr2 = this.f2550b;
                AbstractC0406j.e(objArr2, objArr2, 1, 0, iQ);
                Object[] objArr3 = this.f2550b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i5 = this.f2549a;
                AbstractC0406j.e(objArr3, objArr3, i5 + 1, i5, objArr3.length - 1);
            }
            Object[] objArr4 = this.f2550b;
            int i6 = this.f2549a;
            objArr4[i6] = null;
            this.f2549a = n(i6);
        } else {
            int iQ2 = q(this.f2549a + AbstractC0412p.i(this));
            Object[] objArr5 = this.f2550b;
            if (iQ <= iQ2) {
                AbstractC0406j.e(objArr5, objArr5, iQ, iQ + 1, iQ2 + 1);
            } else {
                AbstractC0406j.e(objArr5, objArr5, iQ, iQ + 1, objArr5.length);
                Object[] objArr6 = this.f2550b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0406j.e(objArr6, objArr6, 0, 1, iQ2 + 1);
            }
            this.f2550b[iQ2] = null;
        }
        this.f2551c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            r();
            p(this.f2549a, q(this.f2549a + size()));
        }
        this.f2549a = 0;
        this.f2551c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i3) {
        AbstractC0399c.f2538a.b(i3, size());
        return this.f2550b[q(this.f2549a + i3)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int iQ = q(this.f2549a + size());
        int length = this.f2549a;
        if (length < iQ) {
            while (length < iQ) {
                if (!kotlin.jvm.internal.m.a(obj, this.f2550b[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (length < iQ) {
            return -1;
        }
        int length2 = this.f2550b.length;
        while (true) {
            if (length >= length2) {
                for (int i3 = 0; i3 < iQ; i3++) {
                    if (kotlin.jvm.internal.m.a(obj, this.f2550b[i3])) {
                        length = i3 + this.f2550b.length;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.m.a(obj, this.f2550b[length])) {
                break;
            }
            length++;
        }
        return length - this.f2549a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iR;
        int iQ = q(this.f2549a + size());
        int i3 = this.f2549a;
        if (i3 < iQ) {
            iR = iQ - 1;
            if (i3 <= iR) {
                while (!kotlin.jvm.internal.m.a(obj, this.f2550b[iR])) {
                    if (iR != i3) {
                        iR--;
                    }
                }
                return iR - this.f2549a;
            }
            return -1;
        }
        if (i3 > iQ) {
            int i4 = iQ - 1;
            while (true) {
                if (-1 >= i4) {
                    iR = AbstractC0407k.r(this.f2550b);
                    int i5 = this.f2549a;
                    if (i5 <= iR) {
                        while (!kotlin.jvm.internal.m.a(obj, this.f2550b[iR])) {
                            if (iR != i5) {
                                iR--;
                            }
                        }
                    }
                } else {
                    if (kotlin.jvm.internal.m.a(obj, this.f2550b[i4])) {
                        iR = i4 + this.f2550b.length;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int iQ;
        kotlin.jvm.internal.m.e(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f2550b.length != 0) {
            int iQ2 = q(this.f2549a + size());
            int i3 = this.f2549a;
            if (i3 < iQ2) {
                iQ = i3;
                while (i3 < iQ2) {
                    Object obj = this.f2550b[i3];
                    if (!elements.contains(obj)) {
                        this.f2550b[iQ] = obj;
                        iQ++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                AbstractC0406j.j(this.f2550b, null, iQ, iQ2);
            } else {
                int length = this.f2550b.length;
                boolean z3 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f2550b;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (!elements.contains(obj2)) {
                        this.f2550b[i4] = obj2;
                        i4++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                iQ = q(i4);
                for (int i5 = 0; i5 < iQ2; i5++) {
                    Object[] objArr2 = this.f2550b;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (!elements.contains(obj3)) {
                        this.f2550b[iQ] = obj3;
                        iQ = n(iQ);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                r();
                this.f2551c = o(iQ - this.f2549a);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        r();
        Object[] objArr = this.f2550b;
        int i3 = this.f2549a;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f2549a = n(i3);
        this.f2551c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        r();
        int iQ = q(this.f2549a + AbstractC0412p.i(this));
        Object[] objArr = this.f2550b;
        Object obj = objArr[iQ];
        objArr[iQ] = null;
        this.f2551c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i3, int i4) {
        AbstractC0399c.f2538a.d(i3, i4, size());
        int i5 = i4 - i3;
        if (i5 == 0) {
            return;
        }
        if (i5 == size()) {
            clear();
            return;
        }
        if (i5 == 1) {
            remove(i3);
            return;
        }
        r();
        if (i3 < size() - i4) {
            t(i3, i4);
            int iQ = q(this.f2549a + i5);
            p(this.f2549a, iQ);
            this.f2549a = iQ;
        } else {
            u(i3, i4);
            int iQ2 = q(this.f2549a + size());
            p(o(iQ2 - i5), iQ2);
        }
        this.f2551c = size() - i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iQ;
        kotlin.jvm.internal.m.e(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f2550b.length != 0) {
            int iQ2 = q(this.f2549a + size());
            int i3 = this.f2549a;
            if (i3 < iQ2) {
                iQ = i3;
                while (i3 < iQ2) {
                    Object obj = this.f2550b[i3];
                    if (elements.contains(obj)) {
                        this.f2550b[iQ] = obj;
                        iQ++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                AbstractC0406j.j(this.f2550b, null, iQ, iQ2);
            } else {
                int length = this.f2550b.length;
                boolean z3 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f2550b;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (elements.contains(obj2)) {
                        this.f2550b[i4] = obj2;
                        i4++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                iQ = q(i4);
                for (int i5 = 0; i5 < iQ2; i5++) {
                    Object[] objArr2 = this.f2550b;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (elements.contains(obj3)) {
                        this.f2550b[iQ] = obj3;
                        iQ = n(iQ);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                r();
                this.f2551c = o(iQ - this.f2549a);
            }
        }
        return z2;
    }

    public final Object s() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i3, Object obj) {
        AbstractC0399c.f2538a.b(i3, size());
        int iQ = q(this.f2549a + i3);
        Object[] objArr = this.f2550b;
        Object obj2 = objArr[iQ];
        objArr[iQ] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        r();
        m(size() + elements.size());
        d(q(this.f2549a + size()), elements);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        if (array.length < size()) {
            array = AbstractC0404h.a(array, size());
        }
        int iQ = q(this.f2549a + size());
        int i3 = this.f2549a;
        if (i3 < iQ) {
            AbstractC0406j.g(this.f2550b, array, 0, i3, iQ, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f2550b;
            AbstractC0406j.e(objArr, array, 0, this.f2549a, objArr.length);
            Object[] objArr2 = this.f2550b;
            AbstractC0406j.e(objArr2, array, objArr2.length - this.f2549a, 0, iQ);
        }
        return AbstractC0411o.f(size(), array);
    }
}
