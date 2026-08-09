package j2;

import h2.E;
import h2.G;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f9433a = E.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f9434b = G.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9435c = G.e("kotlinx.coroutines.scheduler.core.pool.size", Y1.i.a(E.a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f9436d = G.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f9437e = TimeUnit.SECONDS.toNanos(G.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static g f9438f = e.f9424a;

    public static final h b(Runnable runnable, long j3, boolean z2) {
        return new i(runnable, j3, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(boolean z2) {
        return z2 ? "Blocking" : "Non-blocking";
    }
}
