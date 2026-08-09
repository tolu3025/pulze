package io.grpc.internal;

import e0.C0831l;
import io.grpc.internal.InterfaceC0968t;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class W {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f8747g = Logger.getLogger(W.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0831l f8749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f8750c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f8752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f8753f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0968t.a f8754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f8755b;

        a(InterfaceC0968t.a aVar, long j3) {
            this.f8754a = aVar;
            this.f8755b = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8754a.b(this.f8755b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0968t.a f8756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f8757b;

        b(InterfaceC0968t.a aVar, Throwable th) {
            this.f8756a = aVar;
            this.f8757b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8756a.a(this.f8757b);
        }
    }

    public W(long j3, C0831l c0831l) {
        this.f8748a = j3;
        this.f8749b = c0831l;
    }

    private static Runnable b(InterfaceC0968t.a aVar, long j3) {
        return new a(aVar, j3);
    }

    private static Runnable c(InterfaceC0968t.a aVar, Throwable th) {
        return new b(aVar, th);
    }

    private static void e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f8747g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    public static void g(InterfaceC0968t.a aVar, Executor executor, Throwable th) {
        e(executor, c(aVar, th));
    }

    public void a(InterfaceC0968t.a aVar, Executor executor) {
        synchronized (this) {
            try {
                if (!this.f8751d) {
                    this.f8750c.put(aVar, executor);
                } else {
                    Throwable th = this.f8752e;
                    e(executor, th != null ? c(aVar, th) : b(aVar, this.f8753f));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d() {
        synchronized (this) {
            try {
                if (this.f8751d) {
                    return false;
                }
                this.f8751d = true;
                long jD = this.f8749b.d(TimeUnit.NANOSECONDS);
                this.f8753f = jD;
                Map map = this.f8750c;
                this.f8750c = null;
                for (Map.Entry entry : map.entrySet()) {
                    e((Executor) entry.getValue(), b((InterfaceC0968t.a) entry.getKey(), jD));
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(Throwable th) {
        synchronized (this) {
            try {
                if (this.f8751d) {
                    return;
                }
                this.f8751d = true;
                this.f8752e = th;
                Map map = this.f8750c;
                this.f8750c = null;
                for (Map.Entry entry : map.entrySet()) {
                    g((InterfaceC0968t.a) entry.getKey(), (Executor) entry.getValue(), th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long h() {
        return this.f8748a;
    }
}
