package io.grpc.internal;

import e0.AbstractC0829j;
import e0.AbstractC0834o;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0940e0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f8898b = Logger.getLogger(RunnableC0940e0.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f8899a;

    public RunnableC0940e0(Runnable runnable) {
        this.f8899a = (Runnable) AbstractC0829j.o(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f8899a.run();
        } catch (Throwable th) {
            f8898b.log(Level.SEVERE, "Exception while executing runnable " + this.f8899a, th);
            AbstractC0834o.f(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f8899a + ")";
    }
}
