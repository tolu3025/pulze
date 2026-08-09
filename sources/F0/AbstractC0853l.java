package f0;

import e0.AbstractC0829j;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: f0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0853l extends AbstractC0850i implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC0851j f7214b;

    AbstractC0853l() {
    }

    static int n(int i3) {
        int iMax = Math.max(i3, 2);
        if (iMax >= 751619276) {
            AbstractC0829j.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    private static AbstractC0853l o(int i3, Object... objArr) {
        if (i3 == 0) {
            return t();
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return u(obj);
        }
        int iN = n(i3);
        Object[] objArr2 = new Object[iN];
        int i4 = iN - 1;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            Object objA = AbstractC0858q.a(objArr[i7], i7);
            int iHashCode = objA.hashCode();
            int iA = AbstractC0849h.a(iHashCode);
            while (true) {
                int i8 = iA & i4;
                Object obj2 = objArr2[i8];
                if (obj2 == null) {
                    objArr[i6] = objA;
                    objArr2[i8] = objA;
                    i5 += iHashCode;
                    i6++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i6, i3, (Object) null);
        if (i6 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new C0865x(obj3);
        }
        if (n(i6) < iN / 2) {
            return o(i6, objArr);
        }
        if (v(i6, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i6);
        }
        return new C0863v(objArr, i5, objArr2, i4, i6);
    }

    public static AbstractC0853l p(Collection collection) {
        if ((collection instanceof AbstractC0853l) && !(collection instanceof SortedSet)) {
            AbstractC0853l abstractC0853l = (AbstractC0853l) collection;
            if (!abstractC0853l.m()) {
                return abstractC0853l;
            }
        }
        Object[] array = collection.toArray();
        return o(array.length, array);
    }

    public static AbstractC0853l t() {
        return C0863v.f7238n;
    }

    public static AbstractC0853l u(Object obj) {
        return new C0865x(obj);
    }

    private static boolean v(int i3, int i4) {
        return i3 < (i4 >> 1) + (i4 >> 2);
    }

    @Override // f0.AbstractC0850i
    public AbstractC0851j a() {
        AbstractC0851j abstractC0851j = this.f7214b;
        if (abstractC0851j != null) {
            return abstractC0851j;
        }
        AbstractC0851j abstractC0851jQ = q();
        this.f7214b = abstractC0851jQ;
        return abstractC0851jQ;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC0853l) && r() && ((AbstractC0853l) obj).r() && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC0864w.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC0864w.b(this);
    }

    AbstractC0851j q() {
        return AbstractC0851j.n(toArray());
    }

    boolean r() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public abstract AbstractC0867z iterator();
}
