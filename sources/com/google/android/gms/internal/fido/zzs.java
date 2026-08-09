package com.google.android.gms.internal.fido;

import Y.C0463u;
import Y.C0466x;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends zza implements IInterface {
    zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzr zzrVar, C0463u c0463u) {
        Parcel parcelZza = zza();
        int i3 = zzc.zza;
        parcelZza.writeStrongBinder(zzrVar);
        zzc.zzd(parcelZza, c0463u);
        zzb(1, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzr zzrVar, C0466x c0466x) {
        Parcel parcelZza = zza();
        int i3 = zzc.zza;
        parcelZza.writeStrongBinder(zzrVar);
        zzc.zzd(parcelZza, c0466x);
        zzb(2, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zze zzeVar) {
        Parcel parcelZza = zza();
        int i3 = zzc.zza;
        parcelZza.writeStrongBinder(zzeVar);
        zzb(3, parcelZza);
    }
}
