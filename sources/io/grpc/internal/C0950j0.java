package io.grpc.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0950j0 extends M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ReferenceQueue f9128c = new ReferenceQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f9129d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f9130e = Logger.getLogger(C0950j0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f9131b;

    /* JADX INFO: renamed from: io.grpc.internal.j0$a */
    static final class a extends WeakReference {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final boolean f9132f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final RuntimeException f9133g = e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReferenceQueue f9134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentMap f9135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Reference f9137d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicBoolean f9138e;

        a(C0950j0 c0950j0, y1.V v2, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
            super(c0950j0, referenceQueue);
            this.f9138e = new AtomicBoolean();
            this.f9137d = new SoftReference(f9132f ? new RuntimeException("ManagedChannel allocation site") : f9133g);
            this.f9136c = v2.toString();
            this.f9134a = referenceQueue;
            this.f9135b = concurrentMap;
            concurrentMap.put(this, this);
            b(referenceQueue);
        }

        static int b(ReferenceQueue referenceQueue) {
            int i3 = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i3;
                }
                RuntimeException runtimeException = (RuntimeException) aVar.f9137d.get();
                aVar.c();
                if (!aVar.f9138e.get()) {
                    i3++;
                    Level level = Level.SEVERE;
                    if (C0950j0.f9130e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                        logRecord.setLoggerName(C0950j0.f9130e.getName());
                        logRecord.setParameters(new Object[]{aVar.f9136c});
                        logRecord.setThrown(runtimeException);
                        C0950j0.f9130e.log(logRecord);
                    }
                }
            }
        }

        private void c() {
            super.clear();
            this.f9135b.remove(this);
            this.f9137d.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (this.f9138e.getAndSet(true)) {
                return;
            }
            clear();
        }

        private static RuntimeException e() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            c();
            b(this.f9134a);
        }
    }

    C0950j0(y1.V v2) {
        this(v2, f9128c, f9129d);
    }

    @Override // io.grpc.internal.M, y1.V
    public y1.V n() {
        this.f9131b.d();
        return super.n();
    }

    @Override // io.grpc.internal.M, y1.V
    public y1.V o() {
        this.f9131b.d();
        return super.o();
    }

    C0950j0(y1.V v2, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(v2);
        this.f9131b = new a(this, v2, referenceQueue, concurrentMap);
    }
}
