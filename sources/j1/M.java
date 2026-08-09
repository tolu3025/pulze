package J1;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class M {
    public static final Set a(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        kotlin.jvm.internal.m.d(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
