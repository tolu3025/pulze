package P0;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.storage.G;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f2764b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f2765a;

    public g(Executor executor) {
        this.f2765a = executor == null ? !f2764b ? G.b().c() : null : executor;
    }

    public void a(Runnable runnable) {
        AbstractC0643s.k(runnable);
        Executor executor = this.f2765a;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            G.b().e(runnable);
        }
    }
}
