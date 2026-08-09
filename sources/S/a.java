package S;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f2811a;

    public a(Looper looper) {
        this.f2811a = new zzg(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2811a.post(runnable);
    }
}
