package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0604d extends BasePendingResult implements InterfaceC0605e {
    private final com.google.android.gms.common.api.a api;
    private final a.c clientKey;

    protected AbstractC0604d(com.google.android.gms.common.api.a aVar, com.google.android.gms.common.api.f fVar) {
        super((com.google.android.gms.common.api.f) AbstractC0643s.l(fVar, "GoogleApiClient must not be null"));
        AbstractC0643s.l(aVar, "Api must not be null");
        this.clientKey = aVar.b();
        this.api = aVar;
    }

    private void c(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void doExecute(a.b bVar);

    public final com.google.android.gms.common.api.a getApi() {
        return this.api;
    }

    public final a.c getClientKey() {
        return this.clientKey;
    }

    protected void onSetFailedResult(com.google.android.gms.common.api.j jVar) {
    }

    public final void run(a.b bVar) throws DeadObjectException {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e3) {
            c(e3);
            throw e3;
        } catch (RemoteException e4) {
            c(e4);
        }
    }

    public final void setFailedResult(Status status) {
        AbstractC0643s.b(!status.x(), "Failed result must not be success");
        com.google.android.gms.common.api.j jVarCreateFailedResult = createFailedResult(status);
        setResult(jVarCreateFailedResult);
        onSetFailedResult(jVarCreateFailedResult);
    }
}
