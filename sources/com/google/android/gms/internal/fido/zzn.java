package com.google.android.gms.internal.fido;

import Y.C0455l;
import Y.C0456m;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzn extends zza implements IInterface {
    zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzg zzgVar, String str) {
        Parcel parcelZza = zza();
        int i3 = zzc.zza;
        parcelZza.writeStrongBinder(zzgVar);
        parcelZza.writeString(str);
        zzb(4, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzm zzmVar, C0455l c0455l) {
        Parcel parcelZza = zza();
        int i3 = zzc.zza;
        parcelZza.writeStrongBinder(zzmVar);
        zzc.zzd(parcelZza, c0455l);
        zzb(1, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzm zzmVar, C0456m c0456m) {
        Parcel parcelZza = zza();
        int i3 = zzc.zza;
        parcelZza.writeStrongBinder(zzmVar);
        zzc.zzd(parcelZza, c0456m);
        zzb(2, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(zze zzeVar) {
        Parcel parcelZza = zza();
        int i3 = zzc.zza;
        parcelZza.writeStrongBinder(zzeVar);
        zzb(3, parcelZza);
    }
}
