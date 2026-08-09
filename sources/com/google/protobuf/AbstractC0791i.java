package com.google.protobuf;

import com.google.android.gms.common.api.a;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0791i implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0791i f6770b = new C0117i(C.f6668d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f6771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator f6772d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6773a = 0;

    /* JADX INFO: renamed from: com.google.protobuf.i$a */
    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6774a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6775b;

        a() {
            this.f6775b = AbstractC0791i.this.size();
        }

        @Override // com.google.protobuf.AbstractC0791i.g
        public byte a() {
            int i3 = this.f6774a;
            if (i3 >= this.f6775b) {
                throw new NoSuchElementException();
            }
            this.f6774a = i3 + 1;
            return AbstractC0791i.this.v(i3);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6774a < this.f6775b;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$b */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC0791i abstractC0791i, AbstractC0791i abstractC0791i2) {
            g gVarY = abstractC0791i.iterator();
            g gVarY2 = abstractC0791i2.iterator();
            while (gVarY.hasNext() && gVarY2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC0791i.G(gVarY.a())).compareTo(Integer.valueOf(AbstractC0791i.G(gVarY2.a())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC0791i.size()).compareTo(Integer.valueOf(abstractC0791i2.size()));
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$c */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$d */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.protobuf.AbstractC0791i.f
        public byte[] a(byte[] bArr, int i3, int i4) {
            return Arrays.copyOfRange(bArr, i3, i4 + i3);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$e */
    private static final class e extends C0117i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f6777f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f6778l;

        e(byte[] bArr, int i3, int i4) {
            super(bArr);
            AbstractC0791i.m(i3, i3 + i4, bArr.length);
            this.f6777f = i3;
            this.f6778l = i4;
        }

        @Override // com.google.protobuf.AbstractC0791i.C0117i
        protected int Q() {
            return this.f6777f;
        }

        @Override // com.google.protobuf.AbstractC0791i.C0117i, com.google.protobuf.AbstractC0791i
        public byte f(int i3) {
            AbstractC0791i.l(i3, size());
            return this.f6779e[this.f6777f + i3];
        }

        @Override // com.google.protobuf.AbstractC0791i.C0117i, com.google.protobuf.AbstractC0791i
        public int size() {
            return this.f6778l;
        }

        @Override // com.google.protobuf.AbstractC0791i.C0117i, com.google.protobuf.AbstractC0791i
        protected void t(byte[] bArr, int i3, int i4, int i5) {
            System.arraycopy(this.f6779e, Q() + i3, bArr, i4, i5);
        }

        @Override // com.google.protobuf.AbstractC0791i.C0117i, com.google.protobuf.AbstractC0791i
        byte v(int i3) {
            return this.f6779e[this.f6777f + i3];
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$f */
    private interface f {
        byte[] a(byte[] bArr, int i3, int i4);
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$g */
    public interface g extends Iterator {
        byte a();
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$h */
    static abstract class h extends AbstractC0791i {
        h() {
        }

        abstract boolean P(AbstractC0791i abstractC0791i, int i3, int i4);

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.protobuf.AbstractC0791i
        protected final int u() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC0791i
        protected final boolean w() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$i, reason: collision with other inner class name */
    private static class C0117i extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f6779e;

        C0117i(byte[] bArr) {
            bArr.getClass();
            this.f6779e = bArr;
        }

        @Override // com.google.protobuf.AbstractC0791i
        protected final int A(int i3, int i4, int i5) {
            return C.h(i3, this.f6779e, Q() + i4, i5);
        }

        @Override // com.google.protobuf.AbstractC0791i
        protected final int B(int i3, int i4, int i5) {
            int iQ = Q() + i4;
            return A0.v(i3, this.f6779e, iQ, i5 + iQ);
        }

        @Override // com.google.protobuf.AbstractC0791i
        public final AbstractC0791i E(int i3, int i4) {
            int iM = AbstractC0791i.m(i3, i4, size());
            return iM == 0 ? AbstractC0791i.f6770b : new e(this.f6779e, Q() + i3, iM);
        }

        @Override // com.google.protobuf.AbstractC0791i
        protected final String I(Charset charset) {
            return new String(this.f6779e, Q(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC0791i
        final void O(AbstractC0790h abstractC0790h) {
            abstractC0790h.b(this.f6779e, Q(), size());
        }

        @Override // com.google.protobuf.AbstractC0791i.h
        final boolean P(AbstractC0791i abstractC0791i, int i3, int i4) {
            if (i4 > abstractC0791i.size()) {
                throw new IllegalArgumentException("Length too large: " + i4 + size());
            }
            int i5 = i3 + i4;
            if (i5 > abstractC0791i.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i3 + ", " + i4 + ", " + abstractC0791i.size());
            }
            if (!(abstractC0791i instanceof C0117i)) {
                return abstractC0791i.E(i3, i5).equals(E(0, i4));
            }
            C0117i c0117i = (C0117i) abstractC0791i;
            byte[] bArr = this.f6779e;
            byte[] bArr2 = c0117i.f6779e;
            int iQ = Q() + i4;
            int iQ2 = Q();
            int iQ3 = c0117i.Q() + i3;
            while (iQ2 < iQ) {
                if (bArr[iQ2] != bArr2[iQ3]) {
                    return false;
                }
                iQ2++;
                iQ3++;
            }
            return true;
        }

        protected int Q() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC0791i
        public final ByteBuffer b() {
            return ByteBuffer.wrap(this.f6779e, Q(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.AbstractC0791i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC0791i) || size() != ((AbstractC0791i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C0117i)) {
                return obj.equals(this);
            }
            C0117i c0117i = (C0117i) obj;
            int iC = C();
            int iC2 = c0117i.C();
            if (iC == 0 || iC2 == 0 || iC == iC2) {
                return P(c0117i, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC0791i
        public byte f(int i3) {
            return this.f6779e[i3];
        }

        @Override // com.google.protobuf.AbstractC0791i
        public int size() {
            return this.f6779e.length;
        }

        @Override // com.google.protobuf.AbstractC0791i
        protected void t(byte[] bArr, int i3, int i4, int i5) {
            System.arraycopy(this.f6779e, i3, bArr, i4, i5);
        }

        @Override // com.google.protobuf.AbstractC0791i
        byte v(int i3) {
            return this.f6779e[i3];
        }

        @Override // com.google.protobuf.AbstractC0791i
        public final boolean x() {
            int iQ = Q();
            return A0.t(this.f6779e, iQ, size() + iQ);
        }

        @Override // com.google.protobuf.AbstractC0791i
        public final AbstractC0792j z() {
            return AbstractC0792j.m(this.f6779e, Q(), size(), true);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$j */
    private static final class j implements f {
        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }

        @Override // com.google.protobuf.AbstractC0791i.f
        public byte[] a(byte[] bArr, int i3, int i4) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f6771c = AbstractC0786d.c() ? new j(aVar) : new d(aVar);
        f6772d = new b();
    }

    AbstractC0791i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int G(byte b3) {
        return b3 & 255;
    }

    private String K() {
        if (size() <= 50) {
            return s0.a(this);
        }
        return s0.a(E(0, 47)) + "...";
    }

    static AbstractC0791i L(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new d0(byteBuffer);
        }
        return N(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    static AbstractC0791i M(byte[] bArr) {
        return new C0117i(bArr);
    }

    static AbstractC0791i N(byte[] bArr, int i3, int i4) {
        return new e(bArr, i3, i4);
    }

    private static AbstractC0791i d(Iterator it, int i3) {
        if (i3 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i3)));
        }
        if (i3 == 1) {
            return (AbstractC0791i) it.next();
        }
        int i4 = i3 >>> 1;
        return d(it, i4).n(d(it, i3 - i4));
    }

    static void l(int i3, int i4) {
        if (((i4 - (i3 + 1)) | i3) < 0) {
            if (i3 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i3);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i3 + ", " + i4);
        }
    }

    static int m(int i3, int i4, int i5) {
        int i6 = i4 - i3;
        if ((i3 | i4 | i6 | (i5 - i4)) >= 0) {
            return i6;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i3 + " < 0");
        }
        if (i4 < i3) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i3 + ", " + i4);
        }
        throw new IndexOutOfBoundsException("End index: " + i4 + " >= " + i5);
    }

    public static AbstractC0791i o(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f6770b : d(iterable.iterator(), size);
    }

    public static AbstractC0791i p(byte[] bArr) {
        return q(bArr, 0, bArr.length);
    }

    public static AbstractC0791i q(byte[] bArr, int i3, int i4) {
        m(i3, i3 + i4, bArr.length);
        return new C0117i(f6771c.a(bArr, i3, i4));
    }

    public static AbstractC0791i r(String str) {
        return new C0117i(str.getBytes(C.f6666b));
    }

    protected abstract int A(int i3, int i4, int i5);

    protected abstract int B(int i3, int i4, int i5);

    protected final int C() {
        return this.f6773a;
    }

    public final AbstractC0791i D(int i3) {
        return E(i3, size());
    }

    public abstract AbstractC0791i E(int i3, int i4);

    public final byte[] F() {
        int size = size();
        if (size == 0) {
            return C.f6668d;
        }
        byte[] bArr = new byte[size];
        t(bArr, 0, 0, size);
        return bArr;
    }

    public final String H(Charset charset) {
        return size() == 0 ? "" : I(charset);
    }

    protected abstract String I(Charset charset);

    public final String J() {
        return H(C.f6666b);
    }

    abstract void O(AbstractC0790h abstractC0790h);

    public abstract ByteBuffer b();

    public abstract boolean equals(Object obj);

    public abstract byte f(int i3);

    public final int hashCode() {
        int iA = this.f6773a;
        if (iA == 0) {
            int size = size();
            iA = A(size, 0, size);
            if (iA == 0) {
                iA = 1;
            }
            this.f6773a = iA;
        }
        return iA;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final AbstractC0791i n(AbstractC0791i abstractC0791i) {
        if (a.e.API_PRIORITY_OTHER - size() >= abstractC0791i.size()) {
            return m0.S(this, abstractC0791i);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + abstractC0791i.size());
    }

    public final void s(byte[] bArr, int i3, int i4, int i5) {
        m(i3, i3 + i5, size());
        m(i4, i4 + i5, bArr.length);
        if (i5 > 0) {
            t(bArr, i3, i4, i5);
        }
    }

    public abstract int size();

    protected abstract void t(byte[] bArr, int i3, int i4, int i5);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), K());
    }

    protected abstract int u();

    abstract byte v(int i3);

    protected abstract boolean w();

    public abstract boolean x();

    /* JADX INFO: renamed from: y */
    public g iterator() {
        return new a();
    }

    public abstract AbstractC0792j z();
}
