package c1;

import android.os.Handler;
import android.os.Looper;
import c1.C0545c;
import x1.AbstractC1273a;

/* JADX INFO: renamed from: c1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0549g implements C0545c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f5048a = AbstractC1273a.a(Looper.getMainLooper());

    @Override // c1.C0545c.d
    public void a(Runnable runnable) {
        this.f5048a.post(runnable);
    }
}
