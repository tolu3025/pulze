package M1;

import M1.g;
import U1.l;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements g.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f2699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g.c f2700b;

    public b(g.c baseKey, l safeCast) {
        m.e(baseKey, "baseKey");
        m.e(safeCast, "safeCast");
        this.f2699a = safeCast;
        this.f2700b = baseKey instanceof b ? ((b) baseKey).f2700b : baseKey;
    }

    public final boolean a(g.c key) {
        m.e(key, "key");
        return key == this || this.f2700b == key;
    }

    public final g.b b(g.b element) {
        m.e(element, "element");
        return (g.b) this.f2699a.invoke(element);
    }
}
