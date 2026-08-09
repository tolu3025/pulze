package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends zza implements InterfaceC0636k {
    r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0636k
    public final Account zzb() {
        Parcel parcelZzB = zzB(2, zza());
        Account account = (Account) zzc.zzb(parcelZzB, Account.CREATOR);
        parcelZzB.recycle();
        return account;
    }
}
