package s0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public enum n implements Executor {
    INSTANCE;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Handler f11265b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f11265b.post(runnable);
    }
}
