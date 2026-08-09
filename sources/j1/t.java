package J1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends s {
    public static void p(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final void q(List list, Comparator comparator) {
        kotlin.jvm.internal.m.e(list, "<this>");
        kotlin.jvm.internal.m.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
