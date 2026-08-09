package e;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: e.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0818d extends AbstractC0819e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f7051a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f7052b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Handler f7053c;

    /* JADX INFO: renamed from: e.d$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f7054a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f7054a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: e.d$b */
    private static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // e.AbstractC0819e
    public void a(Runnable runnable) {
        this.f7052b.execute(runnable);
    }

    @Override // e.AbstractC0819e
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // e.AbstractC0819e
    public void c(Runnable runnable) {
        if (this.f7053c == null) {
            synchronized (this.f7051a) {
                try {
                    if (this.f7053c == null) {
                        this.f7053c = d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f7053c.post(runnable);
    }
}
