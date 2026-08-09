package s0;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static Executor a(Executor executor, int i3) {
        return new l(executor, i3);
    }

    public static Executor b(Executor executor) {
        return new m(executor);
    }
}
