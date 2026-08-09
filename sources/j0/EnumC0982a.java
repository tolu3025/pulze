package j0;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: j0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
enum EnumC0982a implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
