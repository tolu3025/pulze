package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile e f7734b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7735a = new HashMap();

    e() {
    }

    public static e b() {
        if (f7734b == null) {
            synchronized (e.class) {
                try {
                    if (f7734b == null) {
                        f7734b = new e();
                    }
                } finally {
                }
            }
        }
        return f7734b;
    }

    public d a(String str) {
        return (d) this.f7735a.get(str);
    }
}
