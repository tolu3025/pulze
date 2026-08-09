package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    private static class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f3888a;

        a(Handler handler) {
            this.f3888a = (Handler) j.e.b(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f3888a.post((Runnable) j.e.b(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f3888a + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
