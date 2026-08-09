package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class y0 extends AbstractList implements J, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f6998a;

    class a implements ListIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ListIterator f6999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7000b;

        a(int i3) {
            this.f7000b = i3;
            this.f6999a = y0.this.f6998a.listIterator(i3);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f6999a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f6999a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f6999a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f6999a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f6999a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f6999a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator f7002a;

        b() {
            this.f7002a = y0.this.f6998a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f7002a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7002a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public y0(J j3) {
        this.f6998a = j3;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get(int i3) {
        return (String) this.f6998a.get(i3);
    }

    @Override // com.google.protobuf.J
    public void h(AbstractC0791i abstractC0791i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.J
    public J i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // com.google.protobuf.J
    public Object j(int i3) {
        return this.f6998a.j(i3);
    }

    @Override // com.google.protobuf.J
    public List k() {
        return this.f6998a.k();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i3) {
        return new a(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6998a.size();
    }
}
