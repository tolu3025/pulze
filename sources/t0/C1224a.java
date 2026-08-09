package t0;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t0.c;

/* JADX INFO: renamed from: t0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1224a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f11290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f11291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Comparator f11292c;

    /* JADX INFO: renamed from: t0.a$a, reason: collision with other inner class name */
    class C0166a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11295c;

        C0166a(int i3, boolean z2) {
            this.f11294b = i3;
            this.f11295c = z2;
            this.f11293a = i3;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object obj = C1224a.this.f11290a[this.f11293a];
            Object[] objArr = C1224a.this.f11291b;
            int i3 = this.f11293a;
            Object obj2 = objArr[i3];
            this.f11293a = this.f11295c ? i3 - 1 : i3 + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f11295c) {
                if (this.f11293a < 0) {
                    return false;
                }
            } else if (this.f11293a >= C1224a.this.f11290a.length) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public C1224a(Comparator comparator) {
        this.f11290a = new Object[0];
        this.f11291b = new Object[0];
        this.f11292c = comparator;
    }

    private static Object[] r(Object[] objArr, int i3, Object obj) {
        Object[] objArr2 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr2, 0, i3);
        objArr2[i3] = obj;
        System.arraycopy(objArr, i3, objArr2, i3 + 1, (r0 - i3) - 1);
        return objArr2;
    }

    public static C1224a s(List list, Map map, c.a.InterfaceC0167a interfaceC0167a, Comparator comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i3 = 0;
        for (Object obj : list) {
            objArr[i3] = obj;
            objArr2[i3] = map.get(interfaceC0167a.a(obj));
            i3++;
        }
        return new C1224a(comparator, objArr, objArr2);
    }

    private int t(Object obj) {
        int i3 = 0;
        for (Object obj2 : this.f11290a) {
            if (this.f11292c.compare(obj, obj2) == 0) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    private int u(Object obj) {
        int i3 = 0;
        while (true) {
            Object[] objArr = this.f11290a;
            if (i3 >= objArr.length || this.f11292c.compare(objArr[i3], obj) >= 0) {
                break;
            }
            i3++;
        }
        return i3;
    }

    private Iterator v(int i3, boolean z2) {
        return new C0166a(i3, z2);
    }

    private static Object[] w(Object[] objArr, int i3) {
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, i3);
        System.arraycopy(objArr, i3 + 1, objArr2, i3, length - i3);
        return objArr2;
    }

    private static Object[] x(Object[] objArr, int i3, Object obj) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        objArr2[i3] = obj;
        return objArr2;
    }

    @Override // t0.c
    public boolean a(Object obj) {
        return t(obj) != -1;
    }

    @Override // t0.c
    public Object b(Object obj) {
        int iT = t(obj);
        if (iT != -1) {
            return this.f11291b[iT];
        }
        return null;
    }

    @Override // t0.c
    public Comparator d() {
        return this.f11292c;
    }

    @Override // t0.c
    public Object f() {
        Object[] objArr = this.f11290a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // t0.c
    public int indexOf(Object obj) {
        return t(obj);
    }

    @Override // t0.c
    public boolean isEmpty() {
        return this.f11290a.length == 0;
    }

    @Override // t0.c, java.lang.Iterable
    public Iterator iterator() {
        return v(0, false);
    }

    @Override // t0.c
    public Object l() {
        Object[] objArr = this.f11290a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // t0.c
    public c m(Object obj, Object obj2) {
        int iT = t(obj);
        if (iT != -1) {
            Object[] objArr = this.f11290a;
            if (objArr[iT] == obj && this.f11291b[iT] == obj2) {
                return this;
            }
            return new C1224a(this.f11292c, x(objArr, iT, obj), x(this.f11291b, iT, obj2));
        }
        if (this.f11290a.length <= 25) {
            int iU = u(obj);
            return new C1224a(this.f11292c, r(this.f11290a, iU, obj), r(this.f11291b, iU, obj2));
        }
        HashMap map = new HashMap(this.f11290a.length + 1);
        int i3 = 0;
        while (true) {
            Object[] objArr2 = this.f11290a;
            if (i3 >= objArr2.length) {
                map.put(obj, obj2);
                return k.q(map, this.f11292c);
            }
            map.put(objArr2[i3], this.f11291b[i3]);
            i3++;
        }
    }

    @Override // t0.c
    public Iterator n(Object obj) {
        return v(u(obj), false);
    }

    @Override // t0.c
    public c o(Object obj) {
        int iT = t(obj);
        if (iT == -1) {
            return this;
        }
        return new C1224a(this.f11292c, w(this.f11290a, iT), w(this.f11291b, iT));
    }

    @Override // t0.c
    public int size() {
        return this.f11290a.length;
    }

    private C1224a(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f11290a = objArr;
        this.f11291b = objArr2;
        this.f11292c = comparator;
    }
}
