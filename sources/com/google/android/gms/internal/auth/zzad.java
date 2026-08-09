package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
final class zzad extends zzah {
    final /* synthetic */ zzae zza;

    zzad(zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.d
    public final void zzb(Account account) {
        this.zza.setResult(new zzai(account != null ? Status.f5312f : zzal.zza, account));
    }
}
