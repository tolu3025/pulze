package k0;

import android.os.SystemClock;

/* JADX INFO: renamed from: k0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1003q {
    public static AbstractC1003q a(long j3, long j4, long j5) {
        return new C0987a(j3, j4, j5);
    }

    public static AbstractC1003q e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
