package m2;

import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f9902d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f9903e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f9905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f9906c;

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public long a() {
        if (this.f9904a) {
            return this.f9905b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean b() {
        return this.f9904a;
    }

    public void c() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f9904a && this.f9905b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long d() {
        return this.f9906c;
    }

    public static final class a extends u {
        a() {
        }

        @Override // m2.u
        public void c() {
        }
    }
}
