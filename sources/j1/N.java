package J1;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class N extends M {
    public static Set b() {
        return B.f2514a;
    }

    public static final Set c(Set set) {
        kotlin.jvm.internal.m.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : M.a(set.iterator().next()) : b();
    }

    public static Set d(Object... elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        return AbstractC0407k.i0(elements);
    }
}
