package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final AbstractC0604d f5411b;

    public f0(int i3, AbstractC0604d abstractC0604d) {
        super(i3);
        this.f5411b = (AbstractC0604d) AbstractC0643s.l(abstractC0604d, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void a(Status status) {
        try {
            this.f5411b.setFailedResult(status);
        } catch (IllegalStateException e3) {
            Log.w("ApiCallRunner", "Exception reporting failure", e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f5411b.setFailedResult(new Status(10, sb.toString()));
        } catch (IllegalStateException e3) {
            Log.w("ApiCallRunner", "Exception reporting failure", e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void c(C0623x c0623x, boolean z2) {
        c0623x.a(this.f5411b, z2);
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void d(G g3) throws DeadObjectException {
        try {
            this.f5411b.run(g3.w());
        } catch (RuntimeException e3) {
            b(e3);
        }
    }
}
