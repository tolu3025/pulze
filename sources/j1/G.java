package J1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class G extends F {
    public static Map d() {
        A a3 = A.f2513a;
        kotlin.jvm.internal.m.c(a3, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return a3;
    }

    public static Map e(I1.m... pairs) {
        kotlin.jvm.internal.m.e(pairs, "pairs");
        return pairs.length > 0 ? n(pairs, new LinkedHashMap(F.a(pairs.length))) : d();
    }

    public static Map f(I1.m... pairs) {
        kotlin.jvm.internal.m.e(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(F.a(pairs.length));
        j(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map g(Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : F.c(map) : d();
    }

    public static Map h(Map map, I1.m pair) {
        kotlin.jvm.internal.m.e(map, "<this>");
        kotlin.jvm.internal.m.e(pair, "pair");
        if (map.isEmpty()) {
            return F.b(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static final void i(Map map, Iterable pairs) {
        kotlin.jvm.internal.m.e(map, "<this>");
        kotlin.jvm.internal.m.e(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            I1.m mVar = (I1.m) it.next();
            map.put(mVar.a(), mVar.b());
        }
    }

    public static final void j(Map map, I1.m[] pairs) {
        kotlin.jvm.internal.m.e(map, "<this>");
        kotlin.jvm.internal.m.e(pairs, "pairs");
        for (I1.m mVar : pairs) {
            map.put(mVar.a(), mVar.b());
        }
    }

    public static Map k(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return g(l(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return l(iterable, new LinkedHashMap(F.a(collection.size())));
        }
        return F.b((I1.m) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final Map l(Iterable iterable, Map destination) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        i(destination, iterable);
        return destination;
    }

    public static Map m(Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? o(map) : F.c(map) : d();
    }

    public static final Map n(I1.m[] mVarArr, Map destination) {
        kotlin.jvm.internal.m.e(mVarArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        j(destination, mVarArr);
        return destination;
    }

    public static Map o(Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
