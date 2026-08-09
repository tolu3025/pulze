package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.C;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class B extends AbstractC0784c implements C.d, RandomAccess, g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final B f6626d = new B(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f6627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6628c;

    private B(int[] iArr, int i3, boolean z2) {
        super(z2);
        this.f6627b = iArr;
        this.f6628c = i3;
    }

    private void l(int i3, int i4) {
        int i5;
        a();
        if (i3 < 0 || i3 > (i5 = this.f6628c)) {
            throw new IndexOutOfBoundsException(q(i3));
        }
        int[] iArr = this.f6627b;
        if (i5 < iArr.length) {
            System.arraycopy(iArr, i3, iArr, i3 + 1, i5 - i3);
        } else {
            int[] iArr2 = new int[((i5 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            System.arraycopy(this.f6627b, i3, iArr2, i3 + 1, this.f6628c - i3);
            this.f6627b = iArr2;
        }
        this.f6627b[i3] = i4;
        this.f6628c++;
        ((AbstractList) this).modCount++;
    }

    public static B m() {
        return f6626d;
    }

    private void n(int i3) {
        if (i3 < 0 || i3 >= this.f6628c) {
            throw new IndexOutOfBoundsException(q(i3));
        }
    }

    private String q(int i3) {
        return "Index:" + i3 + ", Size:" + this.f6628c;
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        a();
        C.a(collection);
        if (!(collection instanceof B)) {
            return super.addAll(collection);
        }
        B b3 = (B) collection;
        int i3 = b3.f6628c;
        if (i3 == 0) {
            return false;
        }
        int i4 = this.f6628c;
        if (a.e.API_PRIORITY_OTHER - i4 < i3) {
            throw new OutOfMemoryError();
        }
        int i5 = i4 + i3;
        int[] iArr = this.f6627b;
        if (i5 > iArr.length) {
            this.f6627b = Arrays.copyOf(iArr, i5);
        }
        System.arraycopy(b3.f6627b, 0, this.f6627b, this.f6628c, b3.f6628c);
        this.f6628c = i5;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i3, Integer num) {
        l(i3, num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        f(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return super.equals(obj);
        }
        B b3 = (B) obj;
        if (this.f6628c != b3.f6628c) {
            return false;
        }
        int[] iArr = b3.f6627b;
        for (int i3 = 0; i3 < this.f6628c; i3++) {
            if (this.f6627b[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public void f(int i3) {
        a();
        int i4 = this.f6628c;
        int[] iArr = this.f6627b;
        if (i4 == iArr.length) {
            int[] iArr2 = new int[((i4 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            this.f6627b = iArr2;
        }
        int[] iArr3 = this.f6627b;
        int i5 = this.f6628c;
        this.f6628c = i5 + 1;
        iArr3[i5] = i3;
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i3 = 1;
        for (int i4 = 0; i4 < this.f6628c; i4++) {
            i3 = (i3 * 31) + this.f6627b[i4];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f6627b[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer get(int i3) {
        return Integer.valueOf(p(i3));
    }

    public int p(int i3) {
        n(i3);
        return this.f6627b[i3];
    }

    @Override // com.google.protobuf.C.e
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C.d e(int i3) {
        if (i3 >= this.f6628c) {
            return new B(Arrays.copyOf(this.f6627b, i3), this.f6628c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i3, int i4) {
        a();
        if (i4 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f6627b;
        System.arraycopy(iArr, i4, iArr, i3, this.f6628c - i4);
        this.f6628c -= i4 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i3) {
        a();
        n(i3);
        int[] iArr = this.f6627b;
        int i4 = iArr[i3];
        if (i3 < this.f6628c - 1) {
            System.arraycopy(iArr, i3 + 1, iArr, i3, (r2 - i3) - 1);
        }
        this.f6628c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6628c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer set(int i3, Integer num) {
        return Integer.valueOf(u(i3, num.intValue()));
    }

    public int u(int i3, int i4) {
        a();
        n(i3);
        int[] iArr = this.f6627b;
        int i5 = iArr[i3];
        iArr[i3] = i4;
        return i5;
    }
}
