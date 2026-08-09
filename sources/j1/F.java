package J1;

import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class F extends E {
    public static int a(int i3) {
        return i3 < 0 ? i3 : i3 < 3 ? i3 + 1 : i3 < 1073741824 ? (int) ((i3 / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
    }

    public static Map b(I1.m pair) {
        kotlin.jvm.internal.m.e(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.c(), pair.d());
        kotlin.jvm.internal.m.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map c(Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.m.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
