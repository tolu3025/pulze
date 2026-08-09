package w;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import j.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: w.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1258a extends AbstractC1259b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f11521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    volatile RunnableC0175a f11522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    volatile RunnableC0175a f11523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    long f11524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    long f11525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Handler f11526n;

    /* JADX INFO: renamed from: w.a$a, reason: collision with other inner class name */
    final class RunnableC0175a extends c implements Runnable {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final CountDownLatch f11527p = new CountDownLatch(1);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f11528q;

        RunnableC0175a() {
        }

        @Override // w.c
        protected void g(Object obj) {
            try {
                AbstractC1258a.this.x(this, obj);
            } finally {
                this.f11527p.countDown();
            }
        }

        @Override // w.c
        protected void h(Object obj) {
            try {
                AbstractC1258a.this.y(this, obj);
            } finally {
                this.f11527p.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w.c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Object b(Void... voidArr) {
            return AbstractC1258a.this.C();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11528q = false;
            AbstractC1258a.this.z();
        }
    }

    public AbstractC1258a(Context context) {
        this(context, c.f11540m);
    }

    public abstract Object A();

    protected Object C() {
        return A();
    }

    @Override // w.AbstractC1259b
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f11522j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f11522j);
            printWriter.print(" waiting=");
            printWriter.println(this.f11522j.f11528q);
        }
        if (this.f11523k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f11523k);
            printWriter.print(" waiting=");
            printWriter.println(this.f11523k.f11528q);
        }
        if (this.f11524l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            g.c(this.f11524l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            g.b(this.f11525m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // w.AbstractC1259b
    protected boolean k() {
        if (this.f11522j == null) {
            return false;
        }
        if (!this.f11533d) {
            this.f11536g = true;
        }
        if (this.f11523k != null) {
            if (this.f11522j.f11528q) {
                this.f11522j.f11528q = false;
                this.f11526n.removeCallbacks(this.f11522j);
            }
            this.f11522j = null;
            return false;
        }
        if (this.f11522j.f11528q) {
            this.f11522j.f11528q = false;
            this.f11526n.removeCallbacks(this.f11522j);
            this.f11522j = null;
            return false;
        }
        boolean zA = this.f11522j.a(false);
        if (zA) {
            this.f11523k = this.f11522j;
            w();
        }
        this.f11522j = null;
        return zA;
    }

    @Override // w.AbstractC1259b
    protected void m() {
        super.m();
        b();
        this.f11522j = new RunnableC0175a();
        z();
    }

    void x(RunnableC0175a runnableC0175a, Object obj) {
        B(obj);
        if (this.f11523k == runnableC0175a) {
            s();
            this.f11525m = SystemClock.uptimeMillis();
            this.f11523k = null;
            e();
            z();
        }
    }

    void y(RunnableC0175a runnableC0175a, Object obj) {
        if (this.f11522j != runnableC0175a) {
            x(runnableC0175a, obj);
            return;
        }
        if (i()) {
            B(obj);
            return;
        }
        c();
        this.f11525m = SystemClock.uptimeMillis();
        this.f11522j = null;
        f(obj);
    }

    void z() {
        if (this.f11523k != null || this.f11522j == null) {
            return;
        }
        if (this.f11522j.f11528q) {
            this.f11522j.f11528q = false;
            this.f11526n.removeCallbacks(this.f11522j);
        }
        if (this.f11524l <= 0 || SystemClock.uptimeMillis() >= this.f11525m + this.f11524l) {
            this.f11522j.c(this.f11521i, null);
        } else {
            this.f11522j.f11528q = true;
            this.f11526n.postAtTime(this.f11522j, this.f11525m + this.f11524l);
        }
    }

    private AbstractC1258a(Context context, Executor executor) {
        super(context);
        this.f11525m = -10000L;
        this.f11521i = executor;
    }

    public void B(Object obj) {
    }

    public void w() {
    }
}
