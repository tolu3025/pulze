package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
abstract class e0 extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final TaskCompletionSource f5410b;

    public e0(int i3, TaskCompletionSource taskCompletionSource) {
        super(i3);
        this.f5410b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void a(Status status) {
        this.f5410b.trySetException(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void b(Exception exc) {
        this.f5410b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void d(G g3) throws DeadObjectException {
        try {
            i(g3);
        } catch (DeadObjectException e3) {
            a(i0.e(e3));
            throw e3;
        } catch (RemoteException e4) {
            a(i0.e(e4));
        } catch (RuntimeException e5) {
            this.f5410b.trySetException(e5);
        }
    }

    protected abstract void i(G g3);
}
