package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class V extends AbstractC0489c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final V f4031d = new V(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f4032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4033c;

    private V(Object[] objArr, int i3, boolean z2) {
        super(z2);
        this.f4032b = objArr;
        this.f4033c = i3;
    }

    private static Object[] b(int i3) {
        return new Object[i3];
    }

    public static V d() {
        return f4031d;
    }

    private void f(int i3) {
        if (i3 < 0 || i3 >= this.f4033c) {
            throw new IndexOutOfBoundsException(l(i3));
        }
    }

    private String l(int i3) {
        return "Index:" + i3 + ", Size:" + this.f4033c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i3, Object obj) {
        int i4;
        a();
        if (i3 < 0 || i3 > (i4 = this.f4033c)) {
            throw new IndexOutOfBoundsException(l(i3));
        }
        Object[] objArr = this.f4032b;
        if (i4 < objArr.length) {
            System.arraycopy(objArr, i3, objArr, i3 + 1, i4 - i3);
        } else {
            Object[] objArrB = b(((i4 * 3) / 2) + 1);
            System.arraycopy(this.f4032b, 0, objArrB, 0, i3);
            System.arraycopy(this.f4032b, i3, objArrB, i3 + 1, this.f4033c - i3);
            this.f4032b = objArrB;
        }
        this.f4032b[i3] = obj;
        this.f4033c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i3) {
        f(i3);
        return this.f4032b[i3];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0506u.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public V e(int i3) {
        if (i3 >= this.f4033c) {
            return new V(Arrays.copyOf(this.f4032b, i3), this.f4033c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0489c, java.util.AbstractList, java.util.List
    public Object remove(int i3) {
        a();
        f(i3);
        Object[] objArr = this.f4032b;
        Object obj = objArr[i3];
        if (i3 < this.f4033c - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.f4033c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i3, Object obj) {
        a();
        f(i3);
        Object[] objArr = this.f4032b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4033c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        int i3 = this.f4033c;
        Object[] objArr = this.f4032b;
        if (i3 == objArr.length) {
            this.f4032b = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4032b;
        int i4 = this.f4033c;
        this.f4033c = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
