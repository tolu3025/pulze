package r0;

import c.AbstractC0527b;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import x0.C1270a;
import x0.InterfaceC1271b;
import x0.InterfaceC1272c;

/* JADX INFO: loaded from: classes.dex */
class v implements InterfaceC1272c, InterfaceC1271b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11164a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f11165b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f11166c;

    v(Executor executor) {
        this.f11166c = executor;
    }

    private synchronized Set d(C1270a c1270a) {
        Map map;
        try {
            map = (Map) this.f11164a.get(c1270a.a());
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Map.Entry entry, C1270a c1270a) {
        AbstractC0527b.a(entry.getKey());
        throw null;
    }

    @Override // x0.InterfaceC1271b
    public void a(final C1270a c1270a) {
        E.b(c1270a);
        synchronized (this) {
            try {
                Queue queue = this.f11165b;
                if (queue != null) {
                    queue.add(c1270a);
                    return;
                }
                for (final Map.Entry entry : d(c1270a)) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: r0.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.e(entry, c1270a);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void c() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f11165b;
                if (queue != null) {
                    this.f11165b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                a((C1270a) it.next());
            }
        }
    }
}
