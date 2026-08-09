package K;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
final class k extends n {
    k(com.google.android.gms.common.api.f fVar) {
        super(fVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0604d
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        i iVar = (i) bVar;
        ((u) iVar.getService()).b(new j(this), iVar.e());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ com.google.android.gms.common.api.j createFailedResult(Status status) {
        return status;
    }
}
