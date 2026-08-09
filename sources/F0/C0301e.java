package F0;

import F0.K;
import com.google.firebase.firestore.V0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: F0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0301e extends O {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f1472f = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f1473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f1474e;

    /* JADX INFO: renamed from: F0.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final C0301e a(C0302f accumulator, C0302f... additionalAccumulators) {
            kotlin.jvm.internal.m.e(accumulator, "accumulator");
            kotlin.jvm.internal.m.e(additionalAccumulators, "additionalAccumulators");
            Map mapB = J1.F.b(I1.q.a(accumulator.a(), accumulator.b()));
            for (C0302f c0302f : additionalAccumulators) {
                if (mapB.containsKey(c0302f.a())) {
                    throw new IllegalArgumentException("Duplicate alias: '" + c0302f.a() + '\'');
                }
                mapB = J1.G.h(mapB, I1.q.a(c0302f.a(), c0302f.b()));
            }
            return new C0301e(mapB, null);
        }
    }

    private C0301e(Map map) {
        this(map, J1.G.d(), null, 4, null);
    }

    public static final C0301e g(C0302f c0302f, C0302f... c0302fArr) {
        return f1472f.a(c0302f, c0302fArr);
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        V0.I[] iArr = new V0.I[2];
        Map map = this.f1473d;
        LinkedHashMap linkedHashMap = new LinkedHashMap(J1.F.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C0299c) entry.getValue()).i(userDataReader));
        }
        iArr[0] = D0.z.I(linkedHashMap);
        Map map2 = this.f1474e;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(J1.F.a(map2.size()));
        for (Map.Entry entry2 : map2.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), ((AbstractC0315t) entry2.getValue()).w0(userDataReader));
        }
        iArr[1] = D0.z.I(linkedHashMap2);
        return a2.i.f(iArr);
    }

    @Override // F0.O
    public String b() {
        throw new I1.l("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0301e)) {
            return false;
        }
        C0301e c0301e = (C0301e) obj;
        return kotlin.jvm.internal.m.a(this.f1473d, c0301e.f1473d) && kotlin.jvm.internal.m.a(this.f1474e, c0301e.f1474e) && kotlin.jvm.internal.m.a(e(), c0301e.e());
    }

    public final C0301e h(K group, Object... additionalGroups) {
        kotlin.jvm.internal.m.e(group, "group");
        kotlin.jvm.internal.m.e(additionalGroups, "additionalGroups");
        K.a aVar = K.f1452c;
        ArrayList<K> arrayList = new ArrayList(additionalGroups.length);
        for (Object obj : additionalGroups) {
            arrayList.add(aVar.a(obj));
        }
        Map mapB = J1.F.b(I1.q.a(group.B0(), group.C0()));
        for (K k3 : arrayList) {
            if (mapB.containsKey(k3.B0())) {
                throw new IllegalArgumentException("Duplicate alias: '" + k3.B0() + '\'');
            }
            mapB = J1.G.h(mapB, I1.q.a(k3.B0(), k3.C0()));
        }
        return new C0301e(this.f1473d, mapB, e());
    }

    public int hashCode() {
        return (((this.f1473d.hashCode() * 31) + this.f1474e.hashCode()) * 31) + e().hashCode();
    }

    public final C0301e i(C0300d options) {
        kotlin.jvm.internal.m.e(options, "options");
        return new C0301e(this.f1473d, this.f1474e, options.a());
    }

    private C0301e(Map map, Map map2, B b3) {
        super("aggregate", b3, null);
        this.f1473d = map;
        this.f1474e = map2;
    }

    /* synthetic */ C0301e(Map map, Map map2, B b3, int i3, kotlin.jvm.internal.h hVar) {
        this(map, map2, (i3 & 4) != 0 ? B.f1420c : b3);
    }

    public /* synthetic */ C0301e(Map map, kotlin.jvm.internal.h hVar) {
        this(map);
    }
}
