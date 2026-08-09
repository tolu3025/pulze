package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class j0 extends AbstractC0784c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j0 f6831d = new j0(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f6832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6833c;

    private j0(Object[] objArr, int i3, boolean z2) {
        super(z2);
        this.f6832b = objArr;
        this.f6833c = i3;
    }

    private static Object[] b(int i3) {
        return new Object[i3];
    }

    public static j0 d() {
        return f6831d;
    }

    private void f(int i3) {
        if (i3 < 0 || i3 >= this.f6833c) {
            throw new IndexOutOfBoundsException(l(i3));
        }
    }

    private String l(int i3) {
        return "Index:" + i3 + ", Size:" + this.f6833c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i3, Object obj) {
        int i4;
        a();
        if (i3 < 0 || i3 > (i4 = this.f6833c)) {
            throw new IndexOutOfBoundsException(l(i3));
        }
        Object[] objArr = this.f6832b;
        if (i4 < objArr.length) {
            System.arraycopy(objArr, i3, objArr, i3 + 1, i4 - i3);
        } else {
            Object[] objArrB = b(((i4 * 3) / 2) + 1);
            System.arraycopy(this.f6832b, 0, objArrB, 0, i3);
            System.arraycopy(this.f6832b, i3, objArrB, i3 + 1, this.f6833c - i3);
            this.f6832b = objArrB;
        }
        this.f6832b[i3] = obj;
        this.f6833c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i3) {
        f(i3);
        return this.f6832b[i3];
    }

    @Override // com.google.protobuf.C.e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public j0 e(int i3) {
        if (i3 >= this.f6833c) {
            return new j0(Arrays.copyOf(this.f6832b, i3), this.f6833c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractList, java.util.List
    public Object remove(int i3) {
        a();
        f(i3);
        Object[] objArr = this.f6832b;
        Object obj = objArr[i3];
        if (i3 < this.f6833c - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.f6833c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i3, Object obj) {
        a();
        f(i3);
        Object[] objArr = this.f6832b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6833c;
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        int i3 = this.f6833c;
        Object[] objArr = this.f6832b;
        if (i3 == objArr.length) {
            this.f6832b = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f6832b;
        int i4 = this.f6833c;
        this.f6833c = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
