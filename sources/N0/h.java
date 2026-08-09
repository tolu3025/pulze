package n0;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f9934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f9935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f9936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile ScheduledFuture f9937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f9938e = -1;

    h(e eVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f9934a = (e) AbstractC0643s.k(eVar);
        this.f9935b = executor;
        this.f9936c = scheduledExecutorService;
    }

    private long d() {
        if (this.f9938e == -1) {
            return 30L;
        }
        if (this.f9938e * 2 < 960) {
            return this.f9938e * 2;
        }
        return 960L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Exception exc) {
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f9934a.f().addOnFailureListener(this.f9935b, new OnFailureListener() { // from class: n0.g
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f9933a.e(exc);
            }
        });
    }

    private void h() {
        c();
        this.f9938e = d();
        this.f9937d = this.f9936c.schedule(new f(this), this.f9938e, TimeUnit.SECONDS);
    }

    public void c() {
        if (this.f9937d == null || this.f9937d.isDone()) {
            return;
        }
        this.f9937d.cancel(false);
    }

    public void g(long j3) {
        c();
        this.f9938e = -1L;
        this.f9937d = this.f9936c.schedule(new f(this), Math.max(0L, j3), TimeUnit.MILLISECONDS);
    }
}
