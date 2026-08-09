package t;

import J1.AbstractC0407k;
import J1.F;
import J1.q;
import J1.x;
import U1.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import t.f;

/* JADX INFO: renamed from: t.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1221c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1220b f11276b;

    /* JADX INFO: renamed from: t.c$a */
    static final class a extends n implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11277a = new a();

        a() {
            super(1);
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            m.e(entry, "entry");
            Object value = entry.getValue();
            return "  " + ((f.a) entry.getKey()).a() + " = " + (value instanceof byte[] ? AbstractC0407k.I((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    public C1221c(Map preferencesMap, boolean z2) {
        m.e(preferencesMap, "preferencesMap");
        this.f11275a = preferencesMap;
        this.f11276b = new C1220b(z2);
    }

    @Override // t.f
    public Map a() {
        I1.m mVar;
        Set<Map.Entry> setEntrySet = this.f11275a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Y1.i.a(F.a(q.n(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                m.d(bArrCopyOf, "copyOf(this, size)");
                mVar = new I1.m(key, bArrCopyOf);
            } else {
                mVar = new I1.m(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(mVar.c(), mVar.d());
        }
        return AbstractC1219a.b(linkedHashMap);
    }

    @Override // t.f
    public Object b(f.a key) {
        m.e(key, "key");
        Object obj = this.f11275a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        m.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void e() {
        if (!(!this.f11276b.a())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1221c)) {
            return false;
        }
        C1221c c1221c = (C1221c) obj;
        Map map = c1221c.f11275a;
        if (map == this.f11275a) {
            return true;
        }
        if (map.size() != this.f11275a.size()) {
            return false;
        }
        Map map2 = c1221c.f11275a;
        if (!map2.isEmpty()) {
            for (Map.Entry entry : map2.entrySet()) {
                Object obj2 = this.f11275a.get(entry.getKey());
                if (obj2 == null) {
                    return false;
                }
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        return false;
                    }
                } else if (!m.a(value, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void f() {
        e();
        this.f11275a.clear();
    }

    public final void g() {
        this.f11276b.b(true);
    }

    public final void h(f.b... pairs) {
        m.e(pairs, "pairs");
        e();
        if (pairs.length <= 0) {
            return;
        }
        f.b bVar = pairs[0];
        throw null;
    }

    public int hashCode() {
        Iterator it = this.f11275a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final Object i(f.a key) {
        m.e(key, "key");
        e();
        return this.f11275a.remove(key);
    }

    public final void j(f.a key, Object obj) {
        m.e(key, "key");
        k(key, obj);
    }

    public final void k(f.a key, Object obj) {
        m.e(key, "key");
        e();
        if (obj == null) {
            i(key);
            return;
        }
        if (obj instanceof Set) {
            this.f11275a.put(key, AbstractC1219a.a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f11275a.put(key, obj);
            return;
        }
        Map map = this.f11275a;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        m.d(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    public String toString() {
        return x.G(this.f11275a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f11277a, 24, null);
    }

    public /* synthetic */ C1221c(Map map, boolean z2, int i3, kotlin.jvm.internal.h hVar) {
        this((i3 & 1) != 0 ? new LinkedHashMap() : map, (i3 & 2) != 0 ? true : z2);
    }
}
