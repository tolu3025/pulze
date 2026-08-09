package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f7700b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7701a = new HashMap();

    b() {
    }

    public static b b() {
        if (f7700b == null) {
            f7700b = new b();
        }
        return f7700b;
    }

    public a a(String str) {
        return (a) this.f7701a.get(str);
    }

    public void c(String str, a aVar) {
        if (aVar != null) {
            this.f7701a.put(str, aVar);
        } else {
            this.f7701a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}
