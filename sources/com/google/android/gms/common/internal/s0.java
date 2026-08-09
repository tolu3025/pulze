package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 extends zzb implements t0 {
    public s0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 == 1) {
            U.a aVarZzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, aVarZzd);
        } else {
            if (i3 != 2) {
                return false;
            }
            int iZze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(iZze);
        }
        return true;
    }
}
