package w;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ThreadFactory f11538f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final BlockingQueue f11539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Executor f11540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static f f11541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile Executor f11542o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f11543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FutureTask f11544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile g f11545c = g.PENDING;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f11546d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicBoolean f11547e = new AtomicBoolean();

    static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f11548a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f11548a.getAndIncrement());
        }
    }

    class b extends h {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            c.this.f11547e.set(true);
            Object objB = null;
            try {
                Process.setThreadPriority(10);
                objB = c.this.b(this.f11558a);
                Binder.flushPendingCommands();
                return objB;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: w.c$c, reason: collision with other inner class name */
    class C0176c extends FutureTask {
        C0176c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                c.this.l(get());
            } catch (InterruptedException e3) {
                Log.w("AsyncTask", e3);
            } catch (CancellationException unused) {
                c.this.l(null);
            } catch (ExecutionException e4) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e4.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11551a;

        static {
            int[] iArr = new int[g.values().length];
            f11551a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11551a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f11552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f11553b;

        e(c cVar, Object... objArr) {
            this.f11552a = cVar;
            this.f11553b = objArr;
        }
    }

    private static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i3 = message.what;
            if (i3 == 1) {
                eVar.f11552a.d(eVar.f11553b[0]);
            } else {
                if (i3 != 2) {
                    return;
                }
                eVar.f11552a.j(eVar.f11553b);
            }
        }
    }

    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    private static abstract class h implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object[] f11558a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f11538f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f11539l = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f11540m = threadPoolExecutor;
        f11542o = threadPoolExecutor;
    }

    c() {
        b bVar = new b();
        this.f11543a = bVar;
        this.f11544b = new C0176c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (c.class) {
            try {
                if (f11541n == null) {
                    f11541n = new f();
                }
                fVar = f11541n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public final boolean a(boolean z2) {
        this.f11546d.set(true);
        return this.f11544b.cancel(z2);
    }

    protected abstract Object b(Object... objArr);

    public final c c(Executor executor, Object... objArr) {
        if (this.f11545c == g.PENDING) {
            this.f11545c = g.RUNNING;
            i();
            this.f11543a.f11558a = objArr;
            executor.execute(this.f11544b);
            return this;
        }
        int i3 = d.f11551a[this.f11545c.ordinal()];
        if (i3 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i3 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f11545c = g.FINISHED;
    }

    public final boolean f() {
        return this.f11546d.get();
    }

    protected abstract void g(Object obj);

    protected abstract void h(Object obj);

    Object k(Object obj) {
        e().obtainMessage(1, new e(this, obj)).sendToTarget();
        return obj;
    }

    void l(Object obj) {
        if (this.f11547e.get()) {
            return;
        }
        k(obj);
    }

    protected void j(Object... objArr) {
    }

    protected void i() {
    }
}
