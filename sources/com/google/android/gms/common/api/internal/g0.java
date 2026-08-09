package com.google.android.gms.common.api.internal;

import M.C0415c;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC0620u f5432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f5433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0618s f5434d;

    public g0(int i3, AbstractC0620u abstractC0620u, TaskCompletionSource taskCompletionSource, InterfaceC0618s interfaceC0618s) {
        super(i3);
        this.f5433c = taskCompletionSource;
        this.f5432b = abstractC0620u;
        this.f5434d = interfaceC0618s;
        if (i3 == 2 && abstractC0620u.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void a(Status status) {
        this.f5433c.trySetException(this.f5434d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void b(Exception exc) {
        this.f5433c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void c(C0623x c0623x, boolean z2) {
        c0623x.b(this.f5433c, z2);
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void d(G g3) throws DeadObjectException {
        try {
            this.f5432b.b(g3.w(), this.f5433c);
        } catch (DeadObjectException e3) {
            throw e3;
        } catch (RemoteException e4) {
            a(i0.e(e4));
        } catch (RuntimeException e5) {
            this.f5433c.trySetException(e5);
        }
    }

    @Override // com.google.android.gms.common.api.internal.T
    public final C0415c[] f(G g3) {
        return this.f5432b.d();
    }

    @Override // com.google.android.gms.common.api.internal.T
    public final boolean g(G g3) {
        return this.f5432b.c();
    }

    @Override // com.google.android.gms.common.api.internal.T
    public final int h(G g3) {
        return this.f5432b.e();
    }
}
