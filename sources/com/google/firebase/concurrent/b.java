package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
class b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f6120e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f6121a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f6124d;

    b(String str, int i3, StrictMode.ThreadPolicy threadPolicy) {
        this.f6122b = str;
        this.f6123c = i3;
        this.f6124d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f6123c);
        StrictMode.ThreadPolicy threadPolicy = this.f6124d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f6120e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f6118a.b(runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f6122b, Long.valueOf(this.f6121a.getAndIncrement())));
        return threadNewThread;
    }
}
