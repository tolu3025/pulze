package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.AbstractC0791i;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class m0 extends AbstractC0791i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int[] f6858o = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, a.e.API_PRIORITY_OTHER};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f6859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC0791i f6860f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AbstractC0791i f6861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f6862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f6863n;

    class a extends AbstractC0791i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f6864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        AbstractC0791i.g f6865b = c();

        a() {
            this.f6864a = new c(m0.this, null);
        }

        private AbstractC0791i.g c() {
            if (this.f6864a.hasNext()) {
                return this.f6864a.next().iterator();
            }
            return null;
        }

        @Override // com.google.protobuf.AbstractC0791i.g
        public byte a() {
            AbstractC0791i.g gVar = this.f6865b;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte bA = gVar.a();
            if (!this.f6865b.hasNext()) {
                this.f6865b = c();
            }
            return bA;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6865b != null;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque f6867a;

        private b() {
            this.f6867a = new ArrayDeque();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AbstractC0791i b(AbstractC0791i abstractC0791i, AbstractC0791i abstractC0791i2) {
            c(abstractC0791i);
            c(abstractC0791i2);
            AbstractC0791i m0Var = (AbstractC0791i) this.f6867a.pop();
            while (!this.f6867a.isEmpty()) {
                m0Var = new m0((AbstractC0791i) this.f6867a.pop(), m0Var, null);
            }
            return m0Var;
        }

        private void c(AbstractC0791i abstractC0791i) {
            if (abstractC0791i.w()) {
                e(abstractC0791i);
                return;
            }
            if (abstractC0791i instanceof m0) {
                m0 m0Var = (m0) abstractC0791i;
                c(m0Var.f6860f);
                c(m0Var.f6861l);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC0791i.getClass());
            }
        }

        private int d(int i3) {
            int iBinarySearch = Arrays.binarySearch(m0.f6858o, i3);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(AbstractC0791i abstractC0791i) {
            a aVar;
            int iD = d(abstractC0791i.size());
            int iV = m0.V(iD + 1);
            if (this.f6867a.isEmpty() || ((AbstractC0791i) this.f6867a.peek()).size() >= iV) {
                this.f6867a.push(abstractC0791i);
                return;
            }
            int iV2 = m0.V(iD);
            AbstractC0791i m0Var = (AbstractC0791i) this.f6867a.pop();
            while (true) {
                aVar = null;
                if (this.f6867a.isEmpty() || ((AbstractC0791i) this.f6867a.peek()).size() >= iV2) {
                    break;
                } else {
                    m0Var = new m0((AbstractC0791i) this.f6867a.pop(), m0Var, aVar);
                }
            }
            m0 m0Var2 = new m0(m0Var, abstractC0791i, aVar);
            while (!this.f6867a.isEmpty()) {
                if (((AbstractC0791i) this.f6867a.peek()).size() >= m0.V(d(m0Var2.size()) + 1)) {
                    break;
                } else {
                    m0Var2 = new m0((AbstractC0791i) this.f6867a.pop(), m0Var2, aVar);
                }
            }
            this.f6867a.push(m0Var2);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private static final class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque f6868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AbstractC0791i.h f6869b;

        private c(AbstractC0791i abstractC0791i) {
            AbstractC0791i.h hVarB;
            if (abstractC0791i instanceof m0) {
                m0 m0Var = (m0) abstractC0791i;
                ArrayDeque arrayDeque = new ArrayDeque(m0Var.u());
                this.f6868a = arrayDeque;
                arrayDeque.push(m0Var);
                hVarB = b(m0Var.f6860f);
            } else {
                this.f6868a = null;
                hVarB = (AbstractC0791i.h) abstractC0791i;
            }
            this.f6869b = hVarB;
        }

        private AbstractC0791i.h b(AbstractC0791i abstractC0791i) {
            while (abstractC0791i instanceof m0) {
                m0 m0Var = (m0) abstractC0791i;
                this.f6868a.push(m0Var);
                abstractC0791i = m0Var.f6860f;
            }
            return (AbstractC0791i.h) abstractC0791i;
        }

        private AbstractC0791i.h c() {
            AbstractC0791i.h hVarB;
            do {
                ArrayDeque arrayDeque = this.f6868a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                hVarB = b(((m0) this.f6868a.pop()).f6861l);
            } while (hVarB.isEmpty());
            return hVarB;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public AbstractC0791i.h next() {
            AbstractC0791i.h hVar = this.f6869b;
            if (hVar == null) {
                throw new NoSuchElementException();
            }
            this.f6869b = c();
            return hVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6869b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ c(AbstractC0791i abstractC0791i, a aVar) {
            this(abstractC0791i);
        }
    }

    private m0(AbstractC0791i abstractC0791i, AbstractC0791i abstractC0791i2) {
        this.f6860f = abstractC0791i;
        this.f6861l = abstractC0791i2;
        int size = abstractC0791i.size();
        this.f6862m = size;
        this.f6859e = size + abstractC0791i2.size();
        this.f6863n = Math.max(abstractC0791i.u(), abstractC0791i2.u()) + 1;
    }

    static AbstractC0791i S(AbstractC0791i abstractC0791i, AbstractC0791i abstractC0791i2) {
        if (abstractC0791i2.size() == 0) {
            return abstractC0791i;
        }
        if (abstractC0791i.size() == 0) {
            return abstractC0791i2;
        }
        int size = abstractC0791i.size() + abstractC0791i2.size();
        if (size < 128) {
            return T(abstractC0791i, abstractC0791i2);
        }
        if (abstractC0791i instanceof m0) {
            m0 m0Var = (m0) abstractC0791i;
            if (m0Var.f6861l.size() + abstractC0791i2.size() < 128) {
                return new m0(m0Var.f6860f, T(m0Var.f6861l, abstractC0791i2));
            }
            if (m0Var.f6860f.u() > m0Var.f6861l.u() && m0Var.u() > abstractC0791i2.u()) {
                return new m0(m0Var.f6860f, new m0(m0Var.f6861l, abstractC0791i2));
            }
        }
        return size >= V(Math.max(abstractC0791i.u(), abstractC0791i2.u()) + 1) ? new m0(abstractC0791i, abstractC0791i2) : new b(null).b(abstractC0791i, abstractC0791i2);
    }

    private static AbstractC0791i T(AbstractC0791i abstractC0791i, AbstractC0791i abstractC0791i2) {
        int size = abstractC0791i.size();
        int size2 = abstractC0791i2.size();
        byte[] bArr = new byte[size + size2];
        abstractC0791i.s(bArr, 0, 0, size);
        abstractC0791i2.s(bArr, 0, size, size2);
        return AbstractC0791i.M(bArr);
    }

    private boolean U(AbstractC0791i abstractC0791i) {
        a aVar = null;
        c cVar = new c(this, aVar);
        AbstractC0791i.h hVar = (AbstractC0791i.h) cVar.next();
        c cVar2 = new c(abstractC0791i, aVar);
        AbstractC0791i.h hVar2 = (AbstractC0791i.h) cVar2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int size = hVar.size() - i3;
            int size2 = hVar2.size() - i4;
            int iMin = Math.min(size, size2);
            if (!(i3 == 0 ? hVar.P(hVar2, i4, iMin) : hVar2.P(hVar, i3, iMin))) {
                return false;
            }
            i5 += iMin;
            int i6 = this.f6859e;
            if (i5 >= i6) {
                if (i5 == i6) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                i3 = 0;
                hVar = (AbstractC0791i.h) cVar.next();
            } else {
                i3 += iMin;
                hVar = hVar;
            }
            if (iMin == size2) {
                hVar2 = (AbstractC0791i.h) cVar2.next();
                i4 = 0;
            } else {
                i4 += iMin;
            }
        }
    }

    static int V(int i3) {
        int[] iArr = f6858o;
        return i3 >= iArr.length ? a.e.API_PRIORITY_OTHER : iArr[i3];
    }

    @Override // com.google.protobuf.AbstractC0791i
    protected int A(int i3, int i4, int i5) {
        int i6 = i4 + i5;
        int i7 = this.f6862m;
        if (i6 <= i7) {
            return this.f6860f.A(i3, i4, i5);
        }
        if (i4 >= i7) {
            return this.f6861l.A(i3, i4 - i7, i5);
        }
        int i8 = i7 - i4;
        return this.f6861l.A(this.f6860f.A(i3, i4, i8), 0, i5 - i8);
    }

    @Override // com.google.protobuf.AbstractC0791i
    protected int B(int i3, int i4, int i5) {
        int i6 = i4 + i5;
        int i7 = this.f6862m;
        if (i6 <= i7) {
            return this.f6860f.B(i3, i4, i5);
        }
        if (i4 >= i7) {
            return this.f6861l.B(i3, i4 - i7, i5);
        }
        int i8 = i7 - i4;
        return this.f6861l.B(this.f6860f.B(i3, i4, i8), 0, i5 - i8);
    }

    @Override // com.google.protobuf.AbstractC0791i
    public AbstractC0791i E(int i3, int i4) {
        int iM = AbstractC0791i.m(i3, i4, this.f6859e);
        if (iM == 0) {
            return AbstractC0791i.f6770b;
        }
        if (iM == this.f6859e) {
            return this;
        }
        int i5 = this.f6862m;
        return i4 <= i5 ? this.f6860f.E(i3, i4) : i3 >= i5 ? this.f6861l.E(i3 - i5, i4 - i5) : new m0(this.f6860f.D(i3), this.f6861l.E(0, i4 - this.f6862m));
    }

    @Override // com.google.protobuf.AbstractC0791i
    protected String I(Charset charset) {
        return new String(F(), charset);
    }

    @Override // com.google.protobuf.AbstractC0791i
    void O(AbstractC0790h abstractC0790h) {
        this.f6860f.O(abstractC0790h);
        this.f6861l.O(abstractC0790h);
    }

    public List R() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().b());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.AbstractC0791i
    public ByteBuffer b() {
        return ByteBuffer.wrap(F()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC0791i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0791i)) {
            return false;
        }
        AbstractC0791i abstractC0791i = (AbstractC0791i) obj;
        if (this.f6859e != abstractC0791i.size()) {
            return false;
        }
        if (this.f6859e == 0) {
            return true;
        }
        int iC = C();
        int iC2 = abstractC0791i.C();
        if (iC == 0 || iC2 == 0 || iC == iC2) {
            return U(abstractC0791i);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC0791i
    public byte f(int i3) {
        AbstractC0791i.l(i3, this.f6859e);
        return v(i3);
    }

    @Override // com.google.protobuf.AbstractC0791i
    public int size() {
        return this.f6859e;
    }

    @Override // com.google.protobuf.AbstractC0791i
    protected void t(byte[] bArr, int i3, int i4, int i5) {
        AbstractC0791i abstractC0791i;
        int i6 = i3 + i5;
        int i7 = this.f6862m;
        if (i6 <= i7) {
            abstractC0791i = this.f6860f;
        } else {
            if (i3 < i7) {
                int i8 = i7 - i3;
                this.f6860f.t(bArr, i3, i4, i8);
                this.f6861l.t(bArr, 0, i4 + i8, i5 - i8);
                return;
            }
            abstractC0791i = this.f6861l;
            i3 -= i7;
        }
        abstractC0791i.t(bArr, i3, i4, i5);
    }

    @Override // com.google.protobuf.AbstractC0791i
    protected int u() {
        return this.f6863n;
    }

    @Override // com.google.protobuf.AbstractC0791i
    byte v(int i3) {
        int i4 = this.f6862m;
        return i3 < i4 ? this.f6860f.v(i3) : this.f6861l.v(i3 - i4);
    }

    @Override // com.google.protobuf.AbstractC0791i
    protected boolean w() {
        return this.f6859e >= V(this.f6863n);
    }

    @Override // com.google.protobuf.AbstractC0791i
    public boolean x() {
        int iB = this.f6860f.B(0, 0, this.f6862m);
        AbstractC0791i abstractC0791i = this.f6861l;
        return abstractC0791i.B(iB, 0, abstractC0791i.size()) == 0;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public AbstractC0791i.g iterator() {
        return new a();
    }

    @Override // com.google.protobuf.AbstractC0791i
    public AbstractC0792j z() {
        return AbstractC0792j.i(R(), true);
    }

    /* synthetic */ m0(AbstractC0791i abstractC0791i, AbstractC0791i abstractC0791i2, a aVar) {
        this(abstractC0791i, abstractC0791i2);
    }
}
