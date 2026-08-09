package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class e extends zza implements g {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.g
    public final void m(boolean z2) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z2);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.auth.account.g
    public final void o(d dVar, String str) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, dVar);
        parcelZza.writeString(str);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.auth.account.g
    public final void p(d dVar, Account account) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, dVar);
        zzc.zzd(parcelZza, account);
        zzc(3, parcelZza);
    }
}
