package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0492f implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0492f f4066b = new i(AbstractC0506u.f4282d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final InterfaceC0086f f4067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator f4068d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4069a = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$a */
    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f4070a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f4071b;

        a() {
            this.f4071b = AbstractC0492f.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f.g
        public byte a() {
            int i3 = this.f4070a;
            if (i3 >= this.f4071b) {
                throw new NoSuchElementException();
            }
            this.f4070a = i3 + 1;
            return AbstractC0492f.this.p(i3);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4070a < this.f4071b;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$b */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC0492f abstractC0492f, AbstractC0492f abstractC0492f2) {
            g gVarQ = abstractC0492f.q();
            g gVarQ2 = abstractC0492f2.q();
            while (gVarQ.hasNext() && gVarQ2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC0492f.v(gVarQ.a())).compareTo(Integer.valueOf(AbstractC0492f.v(gVarQ2.a())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC0492f.size()).compareTo(Integer.valueOf(abstractC0492f2.size()));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$c */
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

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$d */
    private static final class d implements InterfaceC0086f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f.InterfaceC0086f
        public byte[] a(byte[] bArr, int i3, int i4) {
            return Arrays.copyOfRange(bArr, i3, i4 + i3);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$e */
    private static final class e extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f4073f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f4074l;

        e(byte[] bArr, int i3, int i4) {
            super(bArr);
            AbstractC0492f.f(i3, i3 + i4, bArr.length);
            this.f4073f = i3;
            this.f4074l = i4;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f.i
        protected int B() {
            return this.f4073f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f.i, androidx.datastore.preferences.protobuf.AbstractC0492f
        public byte b(int i3) {
            AbstractC0492f.d(i3, size());
            return this.f4075e[this.f4073f + i3];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f.i, androidx.datastore.preferences.protobuf.AbstractC0492f
        protected void o(byte[] bArr, int i3, int i4, int i5) {
            System.arraycopy(this.f4075e, B() + i3, bArr, i4, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f.i, androidx.datastore.preferences.protobuf.AbstractC0492f
        byte p(int i3) {
            return this.f4075e[this.f4073f + i3];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f.i, androidx.datastore.preferences.protobuf.AbstractC0492f
        public int size() {
            return this.f4074l;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$f, reason: collision with other inner class name */
    private interface InterfaceC0086f {
        byte[] a(byte[] bArr, int i3, int i4);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$g */
    public interface g extends Iterator {
        byte a();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$h */
    static abstract class h extends AbstractC0492f {
        private h() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.q();
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$i */
    private static class i extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f4075e;

        i(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f4075e = bArr;
        }

        final boolean A(AbstractC0492f abstractC0492f, int i3, int i4) {
            if (i4 > abstractC0492f.size()) {
                throw new IllegalArgumentException("Length too large: " + i4 + size());
            }
            int i5 = i3 + i4;
            if (i5 > abstractC0492f.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i3 + ", " + i4 + ", " + abstractC0492f.size());
            }
            if (!(abstractC0492f instanceof i)) {
                return abstractC0492f.t(i3, i5).equals(t(0, i4));
            }
            i iVar = (i) abstractC0492f;
            byte[] bArr = this.f4075e;
            byte[] bArr2 = iVar.f4075e;
            int iB = B() + i4;
            int iB2 = B();
            int iB3 = iVar.B() + i3;
            while (iB2 < iB) {
                if (bArr[iB2] != bArr2[iB3]) {
                    return false;
                }
                iB2++;
                iB3++;
            }
            return true;
        }

        protected int B() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f
        public byte b(int i3) {
            return this.f4075e[i3];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC0492f) || size() != ((AbstractC0492f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iS = s();
            int iS2 = iVar.s();
            if (iS == 0 || iS2 == 0 || iS == iS2) {
                return A(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f
        protected void o(byte[] bArr, int i3, int i4, int i5) {
            System.arraycopy(this.f4075e, i3, bArr, i4, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f
        byte p(int i3) {
            return this.f4075e[i3];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f
        protected final int r(int i3, int i4, int i5) {
            return AbstractC0506u.g(i3, this.f4075e, B() + i4, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f
        public int size() {
            return this.f4075e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f
        public final AbstractC0492f t(int i3, int i4) {
            int iF = AbstractC0492f.f(i3, i4, size());
            return iF == 0 ? AbstractC0492f.f4066b : new e(this.f4075e, B() + i3, iF);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f
        final void z(AbstractC0491e abstractC0491e) {
            abstractC0491e.a(this.f4075e, B(), size());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$j */
    private static final class j implements InterfaceC0086f {
        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0492f.InterfaceC0086f
        public byte[] a(byte[] bArr, int i3, int i4) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f4067c = AbstractC0490d.c() ? new j(aVar) : new d(aVar);
        f4068d = new b();
    }

    AbstractC0492f() {
    }

    static void d(int i3, int i4) {
        if (((i4 - (i3 + 1)) | i3) < 0) {
            if (i3 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i3);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i3 + ", " + i4);
        }
    }

    static int f(int i3, int i4, int i5) {
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

    public static AbstractC0492f l(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static AbstractC0492f m(byte[] bArr, int i3, int i4) {
        f(i3, i3 + i4, bArr.length);
        return new i(f4067c.a(bArr, i3, i4));
    }

    public static AbstractC0492f n(String str) {
        return new i(str.getBytes(AbstractC0506u.f4280b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int v(byte b3) {
        return b3 & 255;
    }

    private String w() {
        if (size() <= 50) {
            return d0.a(this);
        }
        return d0.a(t(0, 47)) + "...";
    }

    static AbstractC0492f x(byte[] bArr) {
        return new i(bArr);
    }

    static AbstractC0492f y(byte[] bArr, int i3, int i4) {
        return new e(bArr, i3, i4);
    }

    public abstract byte b(int i3);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iR = this.f4069a;
        if (iR == 0) {
            int size = size();
            iR = r(size, 0, size);
            if (iR == 0) {
                iR = 1;
            }
            this.f4069a = iR;
        }
        return iR;
    }

    protected abstract void o(byte[] bArr, int i3, int i4, int i5);

    abstract byte p(int i3);

    public g q() {
        return new a();
    }

    protected abstract int r(int i3, int i4, int i5);

    protected final int s() {
        return this.f4069a;
    }

    public abstract int size();

    public abstract AbstractC0492f t(int i3, int i4);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), w());
    }

    public final byte[] u() {
        int size = size();
        if (size == 0) {
            return AbstractC0506u.f4282d;
        }
        byte[] bArr = new byte[size];
        o(bArr, 0, 0, size);
        return bArr;
    }

    abstract void z(AbstractC0491e abstractC0491e);
}
