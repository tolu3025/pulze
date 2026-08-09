package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends zzb implements InterfaceC0638m {
    public u0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 == 1) {
            int i5 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zzb(parcel, Bundle.CREATOR);
            zzc.zzf(parcel);
            s(i5, strongBinder, bundle);
        } else if (i3 == 2) {
            int i6 = parcel.readInt();
            Bundle bundle2 = (Bundle) zzc.zzb(parcel, Bundle.CREATOR);
            zzc.zzf(parcel);
            n(i6, bundle2);
        } else {
            if (i3 != 3) {
                return false;
            }
            int i7 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            h0 h0Var = (h0) zzc.zzb(parcel, h0.CREATOR);
            zzc.zzf(parcel);
            e(i7, strongBinder2, h0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
