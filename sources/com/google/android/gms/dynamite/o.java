package com.google.android.gms.dynamite;

import U.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class o extends zza implements IInterface {
    o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final U.a a(U.a aVar, String str, int i3, U.a aVar2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i3);
        zzc.zze(parcelZza, aVar2);
        Parcel parcelZzB = zzB(2, parcelZza);
        U.a aVarA = a.AbstractBinderC0062a.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final U.a b(U.a aVar, String str, int i3, U.a aVar2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i3);
        zzc.zze(parcelZza, aVar2);
        Parcel parcelZzB = zzB(3, parcelZza);
        U.a aVarA = a.AbstractBinderC0062a.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }
}
