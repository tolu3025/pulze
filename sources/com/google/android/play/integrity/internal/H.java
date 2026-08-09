package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class H implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f5863a;

    H() {
        this.f5863a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f5863a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void b();

    final TaskCompletionSource c() {
        return this.f5863a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e3) {
            a(e3);
        }
    }

    public H(TaskCompletionSource taskCompletionSource) {
        this.f5863a = taskCompletionSource;
    }
}
