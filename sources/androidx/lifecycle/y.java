package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4788a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f4789b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f4790c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    final void a() {
        this.f4790c = true;
        Map map = this.f4788a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.f4788a.values().iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } finally {
                }
            }
        }
        Set set = this.f4789b;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator it2 = this.f4789b.iterator();
                    while (it2.hasNext()) {
                        b((Closeable) it2.next());
                    }
                } finally {
                }
            }
        }
        d();
    }

    Object c(String str) {
        Object obj;
        Map map = this.f4788a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f4788a.get(str);
        }
        return obj;
    }

    protected void d() {
    }

    Object e(String str, Object obj) {
        Object obj2;
        synchronized (this.f4788a) {
            try {
                obj2 = this.f4788a.get(str);
                if (obj2 == null) {
                    this.f4788a.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f4790c) {
            b(obj);
        }
        return obj;
    }
}
