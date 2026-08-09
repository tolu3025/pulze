package c1;

import b1.AbstractC0525b;
import b1.C0524a;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.AbstractC1016b;
import l1.InterfaceC1017c;

/* JADX INFO: renamed from: c1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0545c implements InterfaceC1017c, InterfaceC0548f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f5023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f5024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f5025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f5026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f5027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f5028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f5030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakHashMap f5031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f5032j;

    /* JADX INFO: renamed from: c1.c$b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f5033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f5035c;

        b(ByteBuffer byteBuffer, int i3, long j3) {
            this.f5033a = byteBuffer;
            this.f5034b = i3;
            this.f5035c = j3;
        }
    }

    /* JADX INFO: renamed from: c1.c$c, reason: collision with other inner class name */
    static class C0105c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExecutorService f5036a;

        C0105c(ExecutorService executorService) {
            this.f5036a = executorService;
        }

        @Override // c1.C0545c.d
        public void a(Runnable runnable) {
            this.f5036a.execute(runnable);
        }
    }

    /* JADX INFO: renamed from: c1.c$d */
    interface d {
        void a(Runnable runnable);
    }

    /* JADX INFO: renamed from: c1.c$e */
    private static class e implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ExecutorService f5037a = C0524a.e().b();

        e() {
        }

        @Override // c1.C0545c.i
        public d a(InterfaceC1017c.d dVar) {
            return dVar.a() ? new h(this.f5037a) : new C0105c(this.f5037a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1.c$f */
    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1017c.a f5038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f5039b;

        f(InterfaceC1017c.a aVar, d dVar) {
            this.f5038a = aVar;
            this.f5039b = dVar;
        }
    }

    /* JADX INFO: renamed from: c1.c$g */
    static class g implements InterfaceC1017c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FlutterJNI f5040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f5041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f5042c = new AtomicBoolean(false);

        g(FlutterJNI flutterJNI, int i3) {
            this.f5040a = flutterJNI;
            this.f5041b = i3;
        }

        @Override // l1.InterfaceC1017c.b
        public void a(ByteBuffer byteBuffer) {
            if (this.f5042c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f5040a.invokePlatformMessageEmptyResponseCallback(this.f5041b);
            } else {
                this.f5040a.invokePlatformMessageResponseCallback(this.f5041b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* JADX INFO: renamed from: c1.c$h */
    static class h implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExecutorService f5043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue f5044b = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f5045c = new AtomicBoolean(false);

        h(ExecutorService executorService) {
            this.f5043a = executorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void f() {
            if (this.f5045c.compareAndSet(false, true)) {
                try {
                    Runnable runnable = (Runnable) this.f5044b.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                } finally {
                    this.f5045c.set(false);
                    if (!this.f5044b.isEmpty()) {
                        this.f5043a.execute(new Runnable() { // from class: c1.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f5047a.f();
                            }
                        });
                    }
                }
            }
        }

        @Override // c1.C0545c.d
        public void a(Runnable runnable) {
            this.f5044b.add(runnable);
            this.f5043a.execute(new Runnable() { // from class: c1.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5046a.e();
                }
            });
        }
    }

    /* JADX INFO: renamed from: c1.c$i */
    interface i {
        d a(InterfaceC1017c.d dVar);
    }

    /* JADX INFO: renamed from: c1.c$j */
    private static class j implements InterfaceC1017c.InterfaceC0146c {
        private j() {
        }
    }

    C0545c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }

    private void j(final String str, final f fVar, final ByteBuffer byteBuffer, final int i3, final long j3) {
        d dVar = fVar != null ? fVar.f5039b : null;
        x1.f.c("PlatformChannel ScheduleHandler on " + str, i3);
        Runnable runnable = new Runnable() { // from class: c1.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f5017a.m(str, i3, fVar, byteBuffer, j3);
            }
        };
        if (dVar == null) {
            dVar = this.f5030h;
        }
        dVar.a(runnable);
    }

    private static void k(Error error) {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, error);
    }

    private void l(f fVar, ByteBuffer byteBuffer, int i3) {
        if (fVar != null) {
            try {
                AbstractC0525b.f("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f5038a.a(byteBuffer, new g(this.f5023a, i3));
                return;
            } catch (Error e3) {
                k(e3);
                return;
            } catch (Exception e4) {
                AbstractC0525b.c("DartMessenger", "Uncaught exception in binary message listener", e4);
            }
        } else {
            AbstractC0525b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f5023a.invokePlatformMessageEmptyResponseCallback(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(String str, int i3, f fVar, ByteBuffer byteBuffer, long j3) {
        x1.f.q("PlatformChannel ScheduleHandler on " + str, i3);
        try {
            x1.f fVarR = x1.f.r("DartMessenger#handleMessageFromDart on " + str);
            try {
                l(fVar, byteBuffer, i3);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
                if (fVarR != null) {
                    fVarR.close();
                }
            } finally {
            }
        } finally {
            this.f5023a.cleanupMessageData(j3);
        }
    }

    @Override // l1.InterfaceC1017c
    public InterfaceC1017c.InterfaceC0146c a(InterfaceC1017c.d dVar) {
        d dVarA = this.f5032j.a(dVar);
        j jVar = new j();
        this.f5031i.put(jVar, dVarA);
        return jVar;
    }

    @Override // l1.InterfaceC1017c
    public void b(String str, InterfaceC1017c.a aVar) {
        h(str, aVar, null);
    }

    @Override // l1.InterfaceC1017c
    public void c(String str, ByteBuffer byteBuffer, InterfaceC1017c.b bVar) {
        x1.f fVarR = x1.f.r("DartMessenger#send on " + str);
        try {
            AbstractC0525b.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i3 = this.f5029g;
            this.f5029g = i3 + 1;
            if (bVar != null) {
                this.f5028f.put(Integer.valueOf(i3), bVar);
            }
            if (byteBuffer == null) {
                this.f5023a.dispatchEmptyPlatformMessage(str, i3);
            } else {
                this.f5023a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i3);
            }
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l1.InterfaceC1017c
    public /* synthetic */ InterfaceC1017c.InterfaceC0146c d() {
        return AbstractC1016b.a(this);
    }

    @Override // l1.InterfaceC1017c
    public void e(String str, ByteBuffer byteBuffer) {
        AbstractC0525b.f("DartMessenger", "Sending message over channel '" + str + "'");
        c(str, byteBuffer, null);
    }

    @Override // c1.InterfaceC0548f
    public void f(int i3, ByteBuffer byteBuffer) {
        AbstractC0525b.f("DartMessenger", "Received message reply from Dart.");
        InterfaceC1017c.b bVar = (InterfaceC1017c.b) this.f5028f.remove(Integer.valueOf(i3));
        if (bVar != null) {
            try {
                AbstractC0525b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                bVar.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e3) {
                k(e3);
            } catch (Exception e4) {
                AbstractC0525b.c("DartMessenger", "Uncaught exception in binary message reply handler", e4);
            }
        }
    }

    @Override // c1.InterfaceC0548f
    public void g(String str, ByteBuffer byteBuffer, int i3, long j3) {
        f fVar;
        boolean z2;
        AbstractC0525b.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f5026d) {
            try {
                fVar = (f) this.f5024b.get(str);
                z2 = this.f5027e.get() && fVar == null;
                if (z2) {
                    if (!this.f5025c.containsKey(str)) {
                        this.f5025c.put(str, new LinkedList());
                    }
                    ((List) this.f5025c.get(str)).add(new b(byteBuffer, i3, j3));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            return;
        }
        j(str, fVar, byteBuffer, i3, j3);
    }

    @Override // l1.InterfaceC1017c
    public void h(String str, InterfaceC1017c.a aVar, InterfaceC1017c.InterfaceC0146c interfaceC0146c) {
        d dVar;
        if (aVar == null) {
            AbstractC0525b.f("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.f5026d) {
                this.f5024b.remove(str);
            }
            return;
        }
        if (interfaceC0146c != null) {
            dVar = (d) this.f5031i.get(interfaceC0146c);
            if (dVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dVar = null;
        }
        AbstractC0525b.f("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.f5026d) {
            try {
                this.f5024b.put(str, new f(aVar, dVar));
                List<b> list = (List) this.f5025c.remove(str);
                if (list == null) {
                    return;
                }
                for (b bVar : list) {
                    j(str, (f) this.f5024b.get(str), bVar.f5033a, bVar.f5034b, bVar.f5035c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    C0545c(FlutterJNI flutterJNI, i iVar) {
        this.f5024b = new HashMap();
        this.f5025c = new HashMap();
        this.f5026d = new Object();
        this.f5027e = new AtomicBoolean(false);
        this.f5028f = new HashMap();
        this.f5029g = 1;
        this.f5030h = new C0549g();
        this.f5031i = new WeakHashMap();
        this.f5023a = flutterJNI;
        this.f5032j = iVar;
    }
}
