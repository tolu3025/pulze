package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbh extends zza implements IInterface {
    zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbgVar) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzbgVar);
        zzc(3, parcelZza);
    }

    public final void zze(zzbg zzbgVar, I.b bVar) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, zzbgVar);
        zzc.zzd(parcelZza, bVar);
        zzc(1, parcelZza);
    }
}
