package s0;

import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
final class m implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f11249f = Logger.getLogger(m.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f11250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque f11251b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f11252c = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f11253d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f11254e = new b(this, null);

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f11255a;

        a(Runnable runnable) {
            this.f11255a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11255a.run();
        }

        public String toString() {
            return this.f11255a.toString();
        }
    }

    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Runnable f11257a;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r8.f11257a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        
            s0.m.f11249f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f11257a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        
            r8.f11257a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                s0.m r2 = s0.m.this     // Catch: java.lang.Throwable -> L5e
                java.util.Deque r2 = s0.m.a(r2)     // Catch: java.lang.Throwable -> L5e
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
                if (r0 != 0) goto L2d
                s0.m r0 = s0.m.this     // Catch: java.lang.Throwable -> L20
                s0.m$c r0 = s0.m.b(r0)     // Catch: java.lang.Throwable -> L20
                s0.m$c r3 = s0.m.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                r0 = move-exception
                goto L83
            L22:
                s0.m r0 = s0.m.this     // Catch: java.lang.Throwable -> L20
                s0.m.e(r0)     // Catch: java.lang.Throwable -> L20
                s0.m r0 = s0.m.this     // Catch: java.lang.Throwable -> L20
                s0.m.d(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                s0.m r3 = s0.m.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = s0.m.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f11257a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L4f
                s0.m r0 = s0.m.this     // Catch: java.lang.Throwable -> L20
                s0.m$c r3 = s0.m.c.IDLE     // Catch: java.lang.Throwable -> L20
                s0.m.d(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L4e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4e:
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f11257a     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
                r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            L5b:
                r8.f11257a = r2     // Catch: java.lang.Throwable -> L5e
                goto L2
            L5e:
                r0 = move-exception
                goto L85
            L60:
                r0 = move-exception
                goto L80
            L62:
                r3 = move-exception
                java.util.logging.Logger r4 = s0.m.f()     // Catch: java.lang.Throwable -> L60
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r6.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.Runnable r7 = r8.f11257a     // Catch: java.lang.Throwable -> L60
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
                goto L5b
            L80:
                r8.f11257a = r2     // Catch: java.lang.Throwable -> L5e
                throw r0     // Catch: java.lang.Throwable -> L5e
            L83:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L5e
            L85:
                if (r1 == 0) goto L8e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.m.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e3) {
                synchronized (m.this.f11251b) {
                    m.this.f11252c = c.IDLE;
                    throw e3;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f11257a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + m.this.f11252c + "}";
        }

        /* synthetic */ b(m mVar, a aVar) {
            this();
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    m(Executor executor) {
        this.f11250a = (Executor) AbstractC0643s.k(executor);
    }

    static /* synthetic */ long e(m mVar) {
        long j3 = mVar.f11253d;
        mVar.f11253d = 1 + j3;
        return j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            com.google.android.gms.common.internal.AbstractC0643s.k(r8)
            java.util.Deque r0 = r7.f11251b
            monitor-enter(r0)
            s0.m$c r1 = r7.f11252c     // Catch: java.lang.Throwable -> L6d
            s0.m$c r2 = s0.m.c.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            s0.m$c r2 = s0.m.c.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f11253d     // Catch: java.lang.Throwable -> L6d
            s0.m$a r1 = new s0.m$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque r8 = r7.f11251b     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            s0.m$c r8 = s0.m.c.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f11252c = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f11250a     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            s0.m$b r5 = r7.f11254e     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            s0.m$c r0 = r7.f11252c
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque r0 = r7.f11251b
            monitor-enter(r0)
            long r5 = r7.f11253d     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            s0.m$c r1 = r7.f11252c     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f11252c = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque r2 = r7.f11251b
            monitor-enter(r2)
            s0.m$c r0 = r7.f11252c     // Catch: java.lang.Throwable -> L55
            s0.m$c r3 = s0.m.c.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            s0.m$c r3 = s0.m.c.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque r0 = r7.f11251b     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque r1 = r7.f11251b     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.m.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f11250a + "}";
    }
}
