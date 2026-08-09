package j0;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: j0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0984c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9381a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f9382b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f9383c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f9384d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ThreadFactory f9385e = null;

    /* JADX INFO: renamed from: j0.c$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f9386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicLong f9388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f9389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f9390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f9391f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f9386a = threadFactory;
            this.f9387b = str;
            this.f9388c = atomicLong;
            this.f9389d = bool;
            this.f9390e = num;
            this.f9391f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f9386a.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.f9387b;
            if (str != null) {
                AtomicLong atomicLong = this.f9388c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(C0984c.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f9389d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f9390e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f9391f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    private static ThreadFactory c(C0984c c0984c) {
        String str = c0984c.f9381a;
        Boolean bool = c0984c.f9382b;
        Integer num = c0984c.f9383c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = c0984c.f9384d;
        ThreadFactory threadFactoryDefaultThreadFactory = c0984c.f9385e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public C0984c e(boolean z2) {
        this.f9382b = Boolean.valueOf(z2);
        return this;
    }

    public C0984c f(String str) {
        d(str, 0);
        this.f9381a = str;
        return this;
    }
}
