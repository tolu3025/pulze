package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;

/* JADX INFO: loaded from: classes.dex */
public final class zzal implements com.google.android.gms.auth.account.b {
    private static final Status zza = new Status(13);

    public final g addWorkAccount(f fVar, String str) {
        return fVar.b(new zzae(this, com.google.android.gms.auth.account.a.f5185a, fVar, str));
    }

    public final g removeWorkAccount(f fVar, Account account) {
        return fVar.b(new zzag(this, com.google.android.gms.auth.account.a.f5185a, fVar, account));
    }

    public final void setWorkAuthenticatorEnabled(f fVar, boolean z2) {
        setWorkAuthenticatorEnabledWithResult(fVar, z2);
    }

    public final g setWorkAuthenticatorEnabledWithResult(f fVar, boolean z2) {
        return fVar.b(new zzac(this, com.google.android.gms.auth.account.a.f5185a, fVar, z2));
    }
}
