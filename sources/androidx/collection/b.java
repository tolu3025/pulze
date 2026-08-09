package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Collection, Set {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f3703e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object[] f3704f = new Object[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Object[] f3705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f3706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Object[] f3707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f3708o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f3709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object[] f3710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f3711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f3712d;

    class a extends e {
        a() {
        }

        @Override // androidx.collection.e
        protected void a() {
            b.this.clear();
        }

        @Override // androidx.collection.e
        protected Object b(int i3, int i4) {
            return b.this.f3710b[i3];
        }

        @Override // androidx.collection.e
        protected Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.e
        protected int d() {
            return b.this.f3711c;
        }

        @Override // androidx.collection.e
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.e
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.e
        protected void g(Object obj, Object obj2) {
            b.this.add(obj);
        }

        @Override // androidx.collection.e
        protected void h(int i3) {
            b.this.n(i3);
        }

        @Override // androidx.collection.e
        protected Object i(int i3, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void a(int i3) {
        if (i3 == 8) {
            synchronized (b.class) {
                try {
                    Object[] objArr = f3707n;
                    if (objArr != null) {
                        this.f3710b = objArr;
                        f3707n = (Object[]) objArr[0];
                        this.f3709a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3708o--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i3 == 4) {
            synchronized (b.class) {
                try {
                    Object[] objArr2 = f3705l;
                    if (objArr2 != null) {
                        this.f3710b = objArr2;
                        f3705l = (Object[]) objArr2[0];
                        this.f3709a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f3706m--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f3709a = new int[i3];
        this.f3710b = new Object[i3];
    }

    private static void d(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                try {
                    if (f3708o < 10) {
                        objArr[0] = f3707n;
                        objArr[1] = iArr;
                        for (int i4 = i3 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f3707n = objArr;
                        f3708o++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                try {
                    if (f3706m < 10) {
                        objArr[0] = f3705l;
                        objArr[1] = iArr;
                        for (int i5 = i3 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f3705l = objArr;
                        f3706m++;
                    }
                } finally {
                }
            }
        }
    }

    private e f() {
        if (this.f3712d == null) {
            this.f3712d = new a();
        }
        return this.f3712d;
    }

    private int l(Object obj, int i3) {
        int i4 = this.f3711c;
        if (i4 == 0) {
            return -1;
        }
        int iA = c.a(this.f3709a, i4, i3);
        if (iA < 0 || obj.equals(this.f3710b[iA])) {
            return iA;
        }
        int i5 = iA + 1;
        while (i5 < i4 && this.f3709a[i5] == i3) {
            if (obj.equals(this.f3710b[i5])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iA - 1; i6 >= 0 && this.f3709a[i6] == i3; i6--) {
            if (obj.equals(this.f3710b[i6])) {
                return i6;
            }
        }
        return ~i5;
    }

    private int m() {
        int i3 = this.f3711c;
        if (i3 == 0) {
            return -1;
        }
        int iA = c.a(this.f3709a, i3, 0);
        if (iA < 0 || this.f3710b[iA] == null) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.f3709a[i4] == 0) {
            if (this.f3710b[i4] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.f3709a[i5] == 0; i5--) {
            if (this.f3710b[i5] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i3;
        int iL;
        if (obj == null) {
            iL = m();
            i3 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i3 = iHashCode;
            iL = l(obj, iHashCode);
        }
        if (iL >= 0) {
            return false;
        }
        int i4 = ~iL;
        int i5 = this.f3711c;
        int[] iArr = this.f3709a;
        if (i5 >= iArr.length) {
            int i6 = 8;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f3710b;
            a(i6);
            int[] iArr2 = this.f3709a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3710b, 0, objArr.length);
            }
            d(iArr, objArr, this.f3711c);
        }
        int i7 = this.f3711c;
        if (i4 < i7) {
            int[] iArr3 = this.f3709a;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f3710b;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f3711c - i4);
        }
        this.f3709a[i4] = i3;
        this.f3710b[i4] = obj;
        this.f3711c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        b(this.f3711c + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public void b(int i3) {
        int[] iArr = this.f3709a;
        if (iArr.length < i3) {
            Object[] objArr = this.f3710b;
            a(i3);
            int i4 = this.f3711c;
            if (i4 > 0) {
                System.arraycopy(iArr, 0, this.f3709a, 0, i4);
                System.arraycopy(objArr, 0, this.f3710b, 0, this.f3711c);
            }
            d(iArr, objArr, this.f3711c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i3 = this.f3711c;
        if (i3 != 0) {
            d(this.f3709a, this.f3710b, i3);
            this.f3709a = f3703e;
            this.f3710b = f3704f;
            this.f3711c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f3711c; i3++) {
                try {
                    if (!set.contains(o(i3))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f3709a;
        int i3 = this.f3711c;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    public int indexOf(Object obj) {
        return obj == null ? m() : l(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f3711c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return f().m().iterator();
    }

    public Object n(int i3) {
        Object[] objArr = this.f3710b;
        Object obj = objArr[i3];
        int i4 = this.f3711c;
        if (i4 <= 1) {
            d(this.f3709a, objArr, i4);
            this.f3709a = f3703e;
            this.f3710b = f3704f;
            this.f3711c = 0;
        } else {
            int[] iArr = this.f3709a;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                int i5 = i4 - 1;
                this.f3711c = i5;
                if (i3 < i5) {
                    int i6 = i3 + 1;
                    System.arraycopy(iArr, i6, iArr, i3, i5 - i3);
                    Object[] objArr2 = this.f3710b;
                    System.arraycopy(objArr2, i6, objArr2, i3, this.f3711c - i3);
                }
                this.f3710b[this.f3711c] = null;
            } else {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                this.f3711c--;
                if (i3 > 0) {
                    System.arraycopy(iArr, 0, this.f3709a, 0, i3);
                    System.arraycopy(objArr, 0, this.f3710b, 0, i3);
                }
                int i7 = this.f3711c;
                if (i3 < i7) {
                    int i8 = i3 + 1;
                    System.arraycopy(iArr, i8, this.f3709a, i3, i7 - i3);
                    System.arraycopy(objArr, i8, this.f3710b, i3, this.f3711c - i3);
                }
            }
        }
        return obj;
    }

    public Object o(int i3) {
        return this.f3710b[i3];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        n(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int i3 = this.f3711c - 1; i3 >= 0; i3--) {
            if (!collection.contains(this.f3710b[i3])) {
                n(i3);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f3711c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i3 = this.f3711c;
        Object[] objArr = new Object[i3];
        System.arraycopy(this.f3710b, 0, objArr, 0, i3);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3711c * 14);
        sb.append('{');
        for (int i3 = 0; i3 < this.f3711c; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objO = o(i3);
            if (objO != this) {
                sb.append(objO);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i3) {
        if (i3 == 0) {
            this.f3709a = f3703e;
            this.f3710b = f3704f;
        } else {
            a(i3);
        }
        this.f3711c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f3711c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f3711c);
        }
        System.arraycopy(this.f3710b, 0, objArr, 0, this.f3711c);
        int length = objArr.length;
        int i3 = this.f3711c;
        if (length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
