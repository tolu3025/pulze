package M1;

import M1.g;
import U1.p;
import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f2707a = new h();

    private h() {
    }

    @Override // M1.g
    public Object fold(Object obj, p operation) {
        m.e(operation, "operation");
        return obj;
    }

    @Override // M1.g
    public g.b get(g.c key) {
        m.e(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // M1.g
    public g minusKey(g.c key) {
        m.e(key, "key");
        return this;
    }

    @Override // M1.g
    public g plus(g context) {
        m.e(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
