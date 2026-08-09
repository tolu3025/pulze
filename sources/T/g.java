package t;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import t.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final f a() {
        return new C1221c(null, true, 1, null);
    }

    public static final C1221c b(f.b... pairs) {
        m.e(pairs, "pairs");
        C1221c c1221c = new C1221c(null, false, 1, null);
        c1221c.h((f.b[]) Arrays.copyOf(pairs, pairs.length));
        return c1221c;
    }
}
