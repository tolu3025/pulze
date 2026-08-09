package y1;

import e0.AbstractC0829j;
import e0.C0824e;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import y1.InterfaceC1309l;

/* JADX INFO: renamed from: y1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1318v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C0824e f12061c = C0824e.e(',');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C1318v f12062d = a().f(new InterfaceC1309l.a(), true).f(InterfaceC1309l.b.f11958a, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f12063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f12064b;

    /* JADX INFO: renamed from: y1.v$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InterfaceC1317u f12065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f12066b;

        a(InterfaceC1317u interfaceC1317u, boolean z2) {
            this.f12065a = (InterfaceC1317u) AbstractC0829j.o(interfaceC1317u, "decompressor");
            this.f12066b = z2;
        }
    }

    private C1318v() {
        this.f12063a = new LinkedHashMap(0);
        this.f12064b = new byte[0];
    }

    public static C1318v a() {
        return new C1318v();
    }

    public static C1318v c() {
        return f12062d;
    }

    public Set b() {
        HashSet hashSet = new HashSet(this.f12063a.size());
        for (Map.Entry entry : this.f12063a.entrySet()) {
            if (((a) entry.getValue()).f12066b) {
                hashSet.add((String) entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    byte[] d() {
        return this.f12064b;
    }

    public InterfaceC1317u e(String str) {
        a aVar = (a) this.f12063a.get(str);
        if (aVar != null) {
            return aVar.f12065a;
        }
        return null;
    }

    public C1318v f(InterfaceC1317u interfaceC1317u, boolean z2) {
        return new C1318v(interfaceC1317u, z2, this);
    }

    private C1318v(InterfaceC1317u interfaceC1317u, boolean z2, C1318v c1318v) {
        String strA = interfaceC1317u.a();
        AbstractC0829j.e(!strA.contains(","), "Comma is currently not allowed in message encoding");
        int size = c1318v.f12063a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c1318v.f12063a.containsKey(interfaceC1317u.a()) ? size : size + 1);
        for (a aVar : c1318v.f12063a.values()) {
            String strA2 = aVar.f12065a.a();
            if (!strA2.equals(strA)) {
                linkedHashMap.put(strA2, new a(aVar.f12065a, aVar.f12066b));
            }
        }
        linkedHashMap.put(strA, new a(interfaceC1317u, z2));
        this.f12063a = Collections.unmodifiableMap(linkedHashMap);
        this.f12064b = f12061c.c(b()).getBytes(Charset.forName("US-ASCII"));
    }
}
