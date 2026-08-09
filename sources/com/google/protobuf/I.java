package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class I extends AbstractC0784c implements J, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final I f6700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J f6701d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f6702b;

    static {
        I i3 = new I(false);
        f6700c = i3;
        f6701d = i3;
    }

    public I(int i3) {
        this(new ArrayList(i3));
    }

    private static String d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC0791i ? ((AbstractC0791i) obj).J() : C.i((byte[]) obj);
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractList, java.util.List
    public boolean addAll(int i3, Collection collection) {
        a();
        if (collection instanceof J) {
            collection = ((J) collection).k();
        }
        boolean zAddAll = this.f6702b.addAll(i3, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i3, String str) {
        a();
        this.f6702b.add(i3, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f6702b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i3) {
        Object obj = this.f6702b.get(i3);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0791i) {
            AbstractC0791i abstractC0791i = (AbstractC0791i) obj;
            String strJ = abstractC0791i.J();
            if (abstractC0791i.x()) {
                this.f6702b.set(i3, strJ);
            }
            return strJ;
        }
        byte[] bArr = (byte[]) obj;
        String strI = C.i(bArr);
        if (C.g(bArr)) {
            this.f6702b.set(i3, strI);
        }
        return strI;
    }

    @Override // com.google.protobuf.AbstractC0784c, com.google.protobuf.C.e
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // com.google.protobuf.J
    public void h(AbstractC0791i abstractC0791i) {
        a();
        this.f6702b.add(abstractC0791i);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.J
    public J i() {
        return g() ? new y0(this) : this;
    }

    @Override // com.google.protobuf.J
    public Object j(int i3) {
        return this.f6702b.get(i3);
    }

    @Override // com.google.protobuf.J
    public List k() {
        return Collections.unmodifiableList(this.f6702b);
    }

    @Override // com.google.protobuf.C.e
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public I e(int i3) {
        if (i3 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i3);
        arrayList.addAll(this.f6702b);
        return new I(arrayList);
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public String remove(int i3) {
        a();
        Object objRemove = this.f6702b.remove(i3);
        ((AbstractList) this).modCount++;
        return d(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public String set(int i3, String str) {
        a();
        return d(this.f6702b.set(i3, str));
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6702b.size();
    }

    private I(ArrayList arrayList) {
        this.f6702b = arrayList;
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.AbstractC0784c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private I(boolean z2) {
        super(z2);
        this.f6702b = Collections.emptyList();
    }
}
