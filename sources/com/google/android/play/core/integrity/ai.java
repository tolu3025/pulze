package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C;
import com.google.android.play.integrity.internal.G;

/* JADX INFO: loaded from: classes.dex */
final class ai extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f5746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G f5747b = new G("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f5748c;

    ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f5746a = ajVar;
        this.f5748c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.D
    public final void b(Bundle bundle) {
        this.f5746a.f5749a.v(this.f5748c);
        this.f5747b.d("onRequestIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.b bVarA = this.f5746a.f5753e.a(bundle);
        if (bVarA != null) {
            this.f5748c.trySetException(bVarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f5748c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f5746a.f5751c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f5748c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
