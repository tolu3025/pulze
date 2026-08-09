package com.google.android.gms.internal.p000authapi;

import G.C0318a;
import G.n;
import G.o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC0620u;
import com.google.android.gms.common.api.internal.InterfaceC0617q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zbaq extends e {
    private static final a.g zba;
    private static final a.AbstractC0106a zbb;
    private static final a zbc;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbao zbaoVar = new zbao();
        zbb = zbaoVar;
        zbc = new a("Auth.Api.Identity.Authorization.API", zbaoVar, gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaq(Activity activity, o oVar) {
        a aVar = zbc;
        n nVarC = n.c(oVar);
        nVarC.a(zbbj.zba());
        super(activity, aVar, (a.d) nVarC.b(), e.a.f5327c);
    }

    public final Task<C0318a> authorize(AuthorizationRequest authorizationRequest) {
        AbstractC0643s.k(authorizationRequest);
        AuthorizationRequest.a aVarZ = AuthorizationRequest.z(authorizationRequest);
        aVarZ.g(((o) getApiOptions()).b());
        final AuthorizationRequest authorizationRequestA = aVarZ.a();
        return doRead(AbstractC0620u.a().d(zbbi.zbc).b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth-api.zban
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                zbaq zbaqVar = this.zba;
                AuthorizationRequest authorizationRequest2 = authorizationRequestA;
                ((zbaa) ((zbw) obj).getService()).zbc(new zbap(zbaqVar, (TaskCompletionSource) obj2), (AuthorizationRequest) AbstractC0643s.k(authorizationRequest2));
            }
        }).c(false).e(1534).a());
    }

    public final C0318a getAuthorizationResultFromIntent(Intent intent) throws b {
        if (intent == null) {
            throw new b(Status.f5314m);
        }
        Status status = (Status) N.e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new b(Status.f5316o);
        }
        if (!status.x()) {
            throw new b(status);
        }
        C0318a c0318a = (C0318a) N.e.b(intent, "authorization_result", C0318a.CREATOR);
        if (c0318a != null) {
            return c0318a;
        }
        throw new b(Status.f5314m);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaq(Context context, o oVar) {
        a aVar = zbc;
        n nVarC = n.c(oVar);
        nVarC.a(zbbj.zba());
        super(context, aVar, nVarC.b(), e.a.f5327c);
    }
}
