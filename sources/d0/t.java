package D0;

import J0.AbstractC0386b;
import V0.I;
import V0.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile I f1298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private I f1299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f1300d;

    public t() {
        this((I) I.J0().H(V0.x.b0()).n());
    }

    private static V0.x a(I i3, r rVar, Map map) {
        I iG = g(i3, rVar);
        x.b bVarJ0 = z.T(iG) ? (x.b) iG.x0().Y() : V0.x.j0();
        boolean z2 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                V0.x xVarA = a(i3, (r) rVar.m(str), (Map) value);
                if (xVarA != null) {
                    bVarJ0.y(str, (I) I.J0().H(xVarA).n());
                    z2 = true;
                }
            } else {
                if (value instanceof I) {
                    bVarJ0.y(str, (I) value);
                } else if (bVarJ0.w(str)) {
                    AbstractC0386b.d(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                    bVarJ0.z(str);
                }
                z2 = true;
            }
        }
        if (z2) {
            return (V0.x) bVarJ0.n();
        }
        return null;
    }

    private I b() {
        V0.x xVarA;
        I i3 = this.f1298b;
        if (i3 == null) {
            synchronized (this.f1297a) {
                try {
                    i3 = this.f1298b;
                    if (i3 == null) {
                        i3 = (this.f1300d.isEmpty() || (xVarA = a(this.f1299c, r.f1280e, this.f1300d)) == null) ? this.f1299c : (I) I.J0().H(xVarA).n();
                        this.f1298b = i3;
                        this.f1299c = null;
                        this.f1300d.clear();
                    }
                } finally {
                }
            }
        }
        return i3;
    }

    private E0.d e(V0.x xVar) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : xVar.d0().entrySet()) {
            r rVarC = r.C((String) entry.getKey());
            if (z.T((I) entry.getValue())) {
                Set setC = e(((I) entry.getValue()).x0()).c();
                if (!setC.isEmpty()) {
                    Iterator it = setC.iterator();
                    while (it.hasNext()) {
                        hashSet.add((r) rVarC.l((r) it.next()));
                    }
                }
            }
            hashSet.add(rVarC);
        }
        return E0.d.b(hashSet);
    }

    private static I g(I i3, r rVar) {
        if (rVar.isEmpty()) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int iW = rVar.w() - 1;
            V0.x xVarX0 = i3.x0();
            if (i4 >= iW) {
                return xVarX0.e0(rVar.s(), null);
            }
            i3 = xVarX0.e0(rVar.t(i4), null);
            if (!z.T(i3)) {
                return null;
            }
            i4++;
        }
    }

    public static t h(Map map) {
        return new t(z.I(map));
    }

    private void n(r rVar, I i3) {
        synchronized (this.f1297a) {
            try {
                if (this.f1298b != null) {
                    this.f1299c = this.f1298b;
                    this.f1298b = null;
                }
                o(this.f1300d, rVar, i3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void o(Map map, r rVar, I i3) {
        Map map2;
        for (int i4 = 0; i4 < rVar.w() - 1; i4++) {
            String strT = rVar.t(i4);
            Object obj = map.get(strT);
            if (obj instanceof Map) {
                map2 = (Map) obj;
            } else {
                if (obj instanceof I) {
                    I i5 = (I) obj;
                    if (i5.F0()) {
                        HashMap map3 = new HashMap(i5.x0().d0());
                        map.put(strT, map3);
                        map = map3;
                    }
                }
                map2 = new HashMap();
                map.put(strT, map2);
            }
            map = map2;
        }
        map.put(rVar.s(), i3);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t clone() {
        return new t(b());
    }

    public void d(r rVar) {
        AbstractC0386b.d(!rVar.isEmpty(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        n(rVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return z.N(b(), ((t) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public I i(r rVar) {
        return g(b(), rVar);
    }

    public E0.d j() {
        return e(b().x0());
    }

    public Map k() {
        return b().x0().d0();
    }

    public void l(r rVar, I i3) {
        AbstractC0386b.d(!rVar.isEmpty(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        n(rVar, i3);
    }

    public void m(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            r rVar = (r) entry.getKey();
            if (entry.getValue() == null) {
                d(rVar);
            } else {
                l(rVar, (I) entry.getValue());
            }
        }
    }

    public String toString() {
        return "ObjectValue{internalValue=" + z.c(b()) + '}';
    }

    public t(I i3) {
        this.f1297a = new Object();
        this.f1300d = new HashMap();
        AbstractC0386b.d(i3.F0(), "ObjectValues should be backed by a MapValue", new Object[0]);
        AbstractC0386b.d(!v.c(i3), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f1298b = i3;
    }
}
