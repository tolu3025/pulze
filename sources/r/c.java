package r;

import J1.F;
import J1.x;
import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f11093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f11094b;

    public c(SharedPreferences prefs, Set set) {
        m.e(prefs, "prefs");
        this.f11093a = prefs;
        this.f11094b = set;
    }

    public final Map a() {
        Map<String, ?> all = this.f11093a.getAll();
        m.d(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.f11094b;
            if (set == null || set.contains(key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(F.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = x.a0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }
}
