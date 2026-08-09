package J0;

import android.os.AsyncTask;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f2499a = TaskExecutors.MAIN_THREAD;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f2500b = new androidx.profileinstaller.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Executor f2501c = new G(4, AsyncTask.THREAD_POOL_EXECUTOR);
}
