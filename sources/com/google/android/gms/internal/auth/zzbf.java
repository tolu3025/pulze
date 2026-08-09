package com.google.android.gms.internal.auth;

import I.c;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 == 1) {
            c cVar = (c) zzc.zza(parcel, c.CREATOR);
            zzc.zzb(parcel);
            zzb(cVar);
        } else {
            if (i3 != 2) {
                return false;
            }
            String string = parcel.readString();
            zzc.zzb(parcel);
            zzc(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
