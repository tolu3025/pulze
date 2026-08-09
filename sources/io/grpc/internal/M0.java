package io.grpc.internal;

import e0.AbstractC0829j;
import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final M0 f8630d = new M0(new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IdentityHashMap f8631a = new IdentityHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f8632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f8633c;

    class a implements e {
        a() {
        }

        @Override // io.grpc.internal.M0.e
        public ScheduledExecutorService a() {
            return Executors.newSingleThreadScheduledExecutor(S.j("grpc-shared-destroyer-%d", true));
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f8634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f8635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f8636c;

        b(c cVar, d dVar, Object obj) {
            this.f8634a = cVar;
            this.f8635b = dVar;
            this.f8636c = obj;
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (M0.this) {
                try {
                    if (this.f8634a.f8639b == 0) {
                        try {
                            this.f8635b.b(this.f8636c);
                            M0.this.f8631a.remove(this.f8635b);
                            if (M0.this.f8631a.isEmpty()) {
                                M0.this.f8633c.shutdown();
                                M0.this.f8633c = null;
                            }
                        } catch (Throwable th) {
                            M0.this.f8631a.remove(this.f8635b);
                            if (M0.this.f8631a.isEmpty()) {
                                M0.this.f8633c.shutdown();
                                M0.this.f8633c = null;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f8638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ScheduledFuture f8640c;

        c(Object obj) {
            this.f8638a = obj;
        }
    }

    public interface d {
        Object a();

        void b(Object obj);
    }

    interface e {
        ScheduledExecutorService a();
    }

    M0(e eVar) {
        this.f8632b = eVar;
    }

    public static Object d(d dVar) {
        return f8630d.e(dVar);
    }

    public static Object f(d dVar, Object obj) {
        return f8630d.g(dVar, obj);
    }

    synchronized Object e(d dVar) {
        c cVar;
        try {
            cVar = (c) this.f8631a.get(dVar);
            if (cVar == null) {
                cVar = new c(dVar.a());
                this.f8631a.put(dVar, cVar);
            }
            ScheduledFuture scheduledFuture = cVar.f8640c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                cVar.f8640c = null;
            }
            cVar.f8639b++;
        } catch (Throwable th) {
            throw th;
        }
        return cVar.f8638a;
    }

    synchronized Object g(d dVar, Object obj) {
        try {
            c cVar = (c) this.f8631a.get(dVar);
            if (cVar == null) {
                throw new IllegalArgumentException("No cached instance found for " + dVar);
            }
            AbstractC0829j.e(obj == cVar.f8638a, "Releasing the wrong instance");
            AbstractC0829j.u(cVar.f8639b > 0, "Refcount has already reached zero");
            int i3 = cVar.f8639b - 1;
            cVar.f8639b = i3;
            if (i3 == 0) {
                AbstractC0829j.u(cVar.f8640c == null, "Destroy task already scheduled");
                if (this.f8633c == null) {
                    this.f8633c = this.f8632b.a();
                }
                cVar.f8640c = this.f8633c.schedule(new RunnableC0940e0(new b(cVar, dVar, obj)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return null;
    }
}
