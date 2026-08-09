package j2;

import c2.AbstractC0583q0;
import c2.K;
import h2.E;
import h2.G;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0583q0 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f9421d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final K f9422e = K.X(k.f9439c, G.e("kotlinx.coroutines.io.parallelism", Y1.i.a(64, E.a()), 0, 0, 12, null), null, 2, null);

    private b() {
    }

    @Override // c2.K
    public void U(M1.g gVar, Runnable runnable) {
        f9422e.U(gVar, runnable);
    }

    @Override // c2.K
    public K W(int i3, String str) {
        return k.f9439c.W(i3, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        U(M1.h.f2707a, runnable);
    }

    @Override // c2.K
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // c2.AbstractC0583q0
    public Executor Y() {
        return this;
    }
}
