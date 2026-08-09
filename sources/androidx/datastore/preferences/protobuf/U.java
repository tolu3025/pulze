package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U f4027c = new U();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f4028d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f4030b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f4029a = new B();

    private U() {
    }

    public static U a() {
        return f4027c;
    }

    public Y b(Class cls, Y y2) {
        AbstractC0506u.b(cls, "messageType");
        AbstractC0506u.b(y2, "schema");
        return (Y) this.f4030b.putIfAbsent(cls, y2);
    }

    public Y c(Class cls) {
        AbstractC0506u.b(cls, "messageType");
        Y y2 = (Y) this.f4030b.get(cls);
        if (y2 != null) {
            return y2;
        }
        Y yA = this.f4029a.a(cls);
        Y yB = b(cls, yA);
        return yB != null ? yB : yA;
    }

    public Y d(Object obj) {
        return c(obj.getClass());
    }
}
