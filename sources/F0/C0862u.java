package f0;

import e0.AbstractC0829j;
import f0.AbstractC0852k;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: f0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0862u extends AbstractC0852k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final AbstractC0852k f7223m = new C0862u(null, new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Object f7224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Object[] f7225f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final transient int f7226l;

    /* JADX INFO: renamed from: f0.u$a */
    static class a extends AbstractC0853l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient AbstractC0852k f7227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient Object[] f7228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f7229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f7230f;

        /* JADX INFO: renamed from: f0.u$a$a, reason: collision with other inner class name */
        class C0124a extends AbstractC0851j {
            C0124a() {
            }

            @Override // f0.AbstractC0850i
            public boolean m() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f7230f;
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i3) {
                AbstractC0829j.l(i3, a.this.f7230f);
                int i4 = i3 * 2;
                Object obj = a.this.f7228d[a.this.f7229e + i4];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f7228d[i4 + (a.this.f7229e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
        }

        a(AbstractC0852k abstractC0852k, Object[] objArr, int i3, int i4) {
            this.f7227c = abstractC0852k;
            this.f7228d = objArr;
            this.f7229e = i3;
            this.f7230f = i4;
        }

        @Override // f0.AbstractC0850i
        int b(Object[] objArr, int i3) {
            return a().b(objArr, i3);
        }

        @Override // f0.AbstractC0850i, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f7227c.get(key));
        }

        @Override // f0.AbstractC0850i
        boolean m() {
            return true;
        }

        @Override // f0.AbstractC0853l
        AbstractC0851j q() {
            return new C0124a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: s */
        public AbstractC0867z iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7230f;
        }
    }

    /* JADX INFO: renamed from: f0.u$b */
    static final class b extends AbstractC0853l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient AbstractC0852k f7232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient AbstractC0851j f7233d;

        b(AbstractC0852k abstractC0852k, AbstractC0851j abstractC0851j) {
            this.f7232c = abstractC0852k;
            this.f7233d = abstractC0851j;
        }

        @Override // f0.AbstractC0853l, f0.AbstractC0850i
        public AbstractC0851j a() {
            return this.f7233d;
        }

        @Override // f0.AbstractC0850i
        int b(Object[] objArr, int i3) {
            return a().b(objArr, i3);
        }

        @Override // f0.AbstractC0850i, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f7232c.get(obj) != null;
        }

        @Override // f0.AbstractC0850i
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: s */
        public AbstractC0867z iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7232c.size();
        }
    }

    /* JADX INFO: renamed from: f0.u$c */
    static final class c extends AbstractC0851j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient Object[] f7234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient int f7235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f7236e;

        c(Object[] objArr, int i3, int i4) {
            this.f7234c = objArr;
            this.f7235d = i3;
            this.f7236e = i4;
        }

        @Override // java.util.List
        public Object get(int i3) {
            AbstractC0829j.l(i3, this.f7236e);
            Object obj = this.f7234c[(i3 * 2) + this.f7235d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // f0.AbstractC0850i
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7236e;
        }
    }

    private C0862u(Object obj, Object[] objArr, int i3) {
        this.f7224e = obj;
        this.f7225f = objArr;
        this.f7226l = i3;
    }

    static C0862u l(int i3, Object[] objArr, AbstractC0852k.a aVar) {
        if (i3 == 0) {
            return (C0862u) f7223m;
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC0844c.a(obj, obj2);
            return new C0862u(null, objArr, 1);
        }
        AbstractC0829j.q(i3, objArr.length >> 1);
        Object objM = m(objArr, i3, AbstractC0853l.n(i3), 0);
        if (objM instanceof Object[]) {
            Object[] objArr2 = (Object[]) objM;
            AbstractC0852k.a.C0122a c0122a = (AbstractC0852k.a.C0122a) objArr2[2];
            if (aVar == null) {
                throw c0122a.a();
            }
            aVar.f7210e = c0122a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objM = obj3;
            i3 = iIntValue;
        }
        return new C0862u(objM, objArr, i3);
    }

    private static Object m(Object[] objArr, int i3, int i4, int i5) {
        AbstractC0852k.a.C0122a c0122a = null;
        if (i3 == 1) {
            Object obj = objArr[i5];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i5 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC0844c.a(obj, obj2);
            return null;
        }
        int i6 = i4 - 1;
        int i7 = -1;
        if (i4 <= 128) {
            byte[] bArr = new byte[i4];
            Arrays.fill(bArr, (byte) -1);
            int i8 = 0;
            for (int i9 = 0; i9 < i3; i9++) {
                int i10 = (i9 * 2) + i5;
                int i11 = (i8 * 2) + i5;
                Object obj3 = objArr[i10];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i10 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC0844c.a(obj3, obj4);
                int iA = AbstractC0849h.a(obj3.hashCode());
                while (true) {
                    int i12 = iA & i6;
                    int i13 = bArr[i12] & 255;
                    if (i13 == 255) {
                        bArr[i12] = (byte) i11;
                        if (i8 < i9) {
                            objArr[i11] = obj3;
                            objArr[i11 ^ 1] = obj4;
                        }
                        i8++;
                    } else {
                        if (obj3.equals(objArr[i13])) {
                            int i14 = i13 ^ 1;
                            Object obj5 = objArr[i14];
                            Objects.requireNonNull(obj5);
                            c0122a = new AbstractC0852k.a.C0122a(obj3, obj4, obj5);
                            objArr[i14] = obj4;
                            break;
                        }
                        iA = i12 + 1;
                    }
                }
            }
            return i8 == i3 ? bArr : new Object[]{bArr, Integer.valueOf(i8), c0122a};
        }
        if (i4 <= 32768) {
            short[] sArr = new short[i4];
            Arrays.fill(sArr, (short) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i3; i16++) {
                int i17 = (i16 * 2) + i5;
                int i18 = (i15 * 2) + i5;
                Object obj6 = objArr[i17];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC0844c.a(obj6, obj7);
                int iA2 = AbstractC0849h.a(obj6.hashCode());
                while (true) {
                    int i19 = iA2 & i6;
                    int i20 = sArr[i19] & 65535;
                    if (i20 == 65535) {
                        sArr[i19] = (short) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj6;
                            objArr[i18 ^ 1] = obj7;
                        }
                        i15++;
                    } else {
                        if (obj6.equals(objArr[i20])) {
                            int i21 = i20 ^ 1;
                            Object obj8 = objArr[i21];
                            Objects.requireNonNull(obj8);
                            c0122a = new AbstractC0852k.a.C0122a(obj6, obj7, obj8);
                            objArr[i21] = obj7;
                            break;
                        }
                        iA2 = i19 + 1;
                    }
                }
            }
            return i15 == i3 ? sArr : new Object[]{sArr, Integer.valueOf(i15), c0122a};
        }
        int[] iArr = new int[i4];
        Arrays.fill(iArr, -1);
        int i22 = 0;
        int i23 = 0;
        while (i22 < i3) {
            int i24 = (i22 * 2) + i5;
            int i25 = (i23 * 2) + i5;
            Object obj9 = objArr[i24];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i24 ^ 1];
            Objects.requireNonNull(obj10);
            AbstractC0844c.a(obj9, obj10);
            int iA3 = AbstractC0849h.a(obj9.hashCode());
            while (true) {
                int i26 = iA3 & i6;
                int i27 = iArr[i26];
                if (i27 == i7) {
                    iArr[i26] = i25;
                    if (i23 < i22) {
                        objArr[i25] = obj9;
                        objArr[i25 ^ 1] = obj10;
                    }
                    i23++;
                } else {
                    if (obj9.equals(objArr[i27])) {
                        int i28 = i27 ^ 1;
                        Object obj11 = objArr[i28];
                        Objects.requireNonNull(obj11);
                        c0122a = new AbstractC0852k.a.C0122a(obj9, obj10, obj11);
                        objArr[i28] = obj10;
                        break;
                    }
                    iA3 = i26 + 1;
                    i7 = -1;
                }
            }
            i22++;
            i7 = -1;
        }
        return i23 == i3 ? iArr : new Object[]{iArr, Integer.valueOf(i23), c0122a};
    }

    static Object n(Object obj, Object[] objArr, int i3, int i4, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i3 == 1) {
            Object obj3 = objArr[i4];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i4 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iA = AbstractC0849h.a(obj2.hashCode());
            while (true) {
                int i5 = iA & length;
                int i6 = bArr[i5] & 255;
                if (i6 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iA = i5 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iA2 = AbstractC0849h.a(obj2.hashCode());
            while (true) {
                int i7 = iA2 & length2;
                int i8 = sArr[i7] & 65535;
                if (i8 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iA2 = i7 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iA3 = AbstractC0849h.a(obj2.hashCode());
            while (true) {
                int i9 = iA3 & length3;
                int i10 = iArr[i9];
                if (i10 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i10])) {
                    return objArr[i10 ^ 1];
                }
                iA3 = i9 + 1;
            }
        }
    }

    @Override // f0.AbstractC0852k
    AbstractC0853l d() {
        return new a(this, this.f7225f, 0, this.f7226l);
    }

    @Override // f0.AbstractC0852k
    AbstractC0853l e() {
        return new b(this, new c(this.f7225f, 0, this.f7226l));
    }

    @Override // f0.AbstractC0852k
    AbstractC0850i f() {
        return new c(this.f7225f, 1, this.f7226l);
    }

    @Override // f0.AbstractC0852k, java.util.Map
    public Object get(Object obj) {
        Object objN = n(this.f7224e, this.f7225f, this.f7226l, 0, obj);
        if (objN == null) {
            return null;
        }
        return objN;
    }

    @Override // f0.AbstractC0852k
    boolean h() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f7226l;
    }
}
