package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends zzb implements d {
    public c() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 == 1) {
            Account account = (Account) zzc.zza(parcel, Account.CREATOR);
            zzc.zzb(parcel);
            zzb(account);
        } else {
            if (i3 != 2) {
                return false;
            }
            boolean zZzf = zzc.zzf(parcel);
            zzc.zzb(parcel);
            zzc(zZzf);
        }
        return true;
    }
}
