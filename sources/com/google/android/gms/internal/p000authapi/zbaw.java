package com.google.android.gms.internal.p000authapi;

import G.InterfaceC0321d;
import G.h;
import G.i;
import G.j;
import G.s;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC0620u;
import com.google.android.gms.common.api.internal.InterfaceC0617q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zbaw extends e implements InterfaceC0321d {
    private static final a.g zba;
    private static final a.AbstractC0106a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbat zbatVar = new zbat();
        zbb = zbatVar;
        zbc = new a("Auth.Api.Identity.CredentialSaving.API", zbatVar, gVar);
    }

    public zbaw(Activity activity, s sVar) {
        super(activity, zbc, (a.d) sVar, e.a.f5327c);
        this.zbd = zbbj.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status;
        return (intent == null || (status = (Status) N.e.b(intent, "status", Status.CREATOR)) == null) ? Status.f5314m : status;
    }

    public final Task<h> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        AbstractC0643s.k(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.a aVarX = SaveAccountLinkingTokenRequest.x(saveAccountLinkingTokenRequest);
        aVarX.f(this.zbd);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequestA = aVarX.a();
        return doRead(AbstractC0620u.a().d(zbbi.zbg).b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth-api.zbar
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = this.zba;
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = saveAccountLinkingTokenRequestA;
                ((zbad) ((zbx) obj).getService()).zbc(new zbau(zbawVar, (TaskCompletionSource) obj2), (SaveAccountLinkingTokenRequest) AbstractC0643s.k(saveAccountLinkingTokenRequest2));
            }
        }).c(false).e(1535).a());
    }

    @Override // G.InterfaceC0321d
    public final Task<j> savePassword(i iVar) {
        AbstractC0643s.k(iVar);
        i.a aVarU = i.u(iVar);
        aVarU.c(this.zbd);
        final i iVarA = aVarU.a();
        return doRead(AbstractC0620u.a().d(zbbi.zbe).b(new InterfaceC0617q() { // from class: com.google.android.gms.internal.auth-api.zbas
            @Override // com.google.android.gms.common.api.internal.InterfaceC0617q
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = this.zba;
                i iVar2 = iVarA;
                ((zbad) ((zbx) obj).getService()).zbd(new zbav(zbawVar, (TaskCompletionSource) obj2), (i) AbstractC0643s.k(iVar2));
            }
        }).c(false).e(1536).a());
    }

    public zbaw(Context context, s sVar) {
        super(context, zbc, sVar, e.a.f5327c);
        this.zbd = zbbj.zba();
    }
}
