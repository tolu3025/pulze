package f0;

import e0.AbstractC0829j;
import f0.AbstractC0850i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: f0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0851j extends AbstractC0850i implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC0841A f7197b = new b(C0861t.f7220e, 0);

    /* JADX INFO: renamed from: f0.j$a */
    public static final class a extends AbstractC0850i.a {
        public a() {
            this(4);
        }

        @Override // f0.AbstractC0850i.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            super.d(obj);
            return this;
        }

        public a g(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public AbstractC0851j h() {
            this.f7196c = true;
            return AbstractC0851j.o(this.f7194a, this.f7195b);
        }

        a(int i3) {
            super(i3);
        }
    }

    /* JADX INFO: renamed from: f0.j$b */
    static class b extends AbstractC0842a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractC0851j f7198c;

        b(AbstractC0851j abstractC0851j, int i3) {
            super(abstractC0851j.size(), i3);
            this.f7198c = abstractC0851j;
        }

        @Override // f0.AbstractC0842a
        protected Object b(int i3) {
            return this.f7198c.get(i3);
        }
    }

    /* JADX INFO: renamed from: f0.j$c */
    class c extends AbstractC0851j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient int f7199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final transient int f7200d;

        c(int i3, int i4) {
            this.f7199c = i3;
            this.f7200d = i4;
        }

        @Override // f0.AbstractC0850i
        Object[] d() {
            return AbstractC0851j.this.d();
        }

        @Override // f0.AbstractC0850i
        int f() {
            return AbstractC0851j.this.l() + this.f7199c + this.f7200d;
        }

        @Override // java.util.List
        public Object get(int i3) {
            AbstractC0829j.l(i3, this.f7200d);
            return AbstractC0851j.this.get(i3 + this.f7199c);
        }

        @Override // f0.AbstractC0851j, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // f0.AbstractC0850i
        int l() {
            return AbstractC0851j.this.l() + this.f7199c;
        }

        @Override // f0.AbstractC0851j, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // f0.AbstractC0850i
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7200d;
        }

        @Override // f0.AbstractC0851j, java.util.List
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public AbstractC0851j subList(int i3, int i4) {
            AbstractC0829j.s(i3, i4, this.f7200d);
            AbstractC0851j abstractC0851j = AbstractC0851j.this;
            int i5 = this.f7199c;
            return abstractC0851j.subList(i3 + i5, i4 + i5);
        }

        @Override // f0.AbstractC0851j, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i3) {
            return super.listIterator(i3);
        }
    }

    AbstractC0851j() {
    }

    static AbstractC0851j n(Object[] objArr) {
        return o(objArr, objArr.length);
    }

    static AbstractC0851j o(Object[] objArr, int i3) {
        return i3 == 0 ? v() : new C0861t(objArr, i3);
    }

    public static a p() {
        return new a();
    }

    private static AbstractC0851j q(Object... objArr) {
        return n(AbstractC0858q.b(objArr));
    }

    public static AbstractC0851j r(Collection collection) {
        if (!(collection instanceof AbstractC0850i)) {
            return q(collection.toArray());
        }
        AbstractC0851j abstractC0851jA = ((AbstractC0850i) collection).a();
        return abstractC0851jA.m() ? n(abstractC0851jA.toArray()) : abstractC0851jA;
    }

    public static AbstractC0851j v() {
        return C0861t.f7220e;
    }

    public static AbstractC0851j w(Object obj) {
        return q(obj);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // f0.AbstractC0850i
    int b(Object[] objArr, int i3) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i3 + i4] = get(i4);
        }
        return i3 + size;
    }

    @Override // f0.AbstractC0850i, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return AbstractC0855n.b(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            i3 = ~(~((i3 * 31) + get(i4).hashCode()));
        }
        return i3;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC0855n.c(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC0855n.e(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public AbstractC0867z iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public AbstractC0841A listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC0841A listIterator(int i3) {
        AbstractC0829j.q(i3, size());
        return isEmpty() ? f7197b : new b(this, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: x */
    public AbstractC0851j subList(int i3, int i4) {
        AbstractC0829j.s(i3, i4, size());
        int i5 = i4 - i3;
        return i5 == size() ? this : i5 == 0 ? v() : y(i3, i4);
    }

    AbstractC0851j y(int i3, int i4) {
        return new c(i3, i4 - i3);
    }

    @Override // f0.AbstractC0850i
    public final AbstractC0851j a() {
        return this;
    }
}
