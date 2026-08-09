package com.google.android.gms.internal.auth;

import E.i;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i3, Parcel parcel, Parcel parcel2, int i4) {
        switch (i3) {
            case 1:
                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzh(status);
                return true;
            case 2:
                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                i iVar = (i) zzc.zza(parcel, i.CREATOR);
                zzc.zzb(parcel);
                zzf(status2, iVar);
                return true;
            case 3:
                Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
                E.b bVar = (E.b) zzc.zza(parcel, E.b.CREATOR);
                zzc.zzb(parcel);
                zzg(status3, bVar);
                return true;
            case 4:
                zze();
                return true;
            case 5:
                Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzd(status4);
                return true;
            case 6:
                byte[] bArrCreateByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                zzb(bArrCreateByteArray);
                return true;
            case 7:
                E.a aVar = (E.a) zzc.zza(parcel, E.a.CREATOR);
                zzc.zzb(parcel);
                zzc(aVar);
                return true;
            default:
                return false;
        }
    }
}
