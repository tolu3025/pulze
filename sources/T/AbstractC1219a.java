package t;

import J1.x;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: t.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1219a {
    public static final Set a(Set set) {
        m.e(set, "set");
        Set setUnmodifiableSet = Collections.unmodifiableSet(x.a0(set));
        m.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final Map b(Map map) {
        m.e(map, "map");
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        m.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }
}
