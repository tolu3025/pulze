package com.google.android.gms.dynamite;

import U.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class n extends zza implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final U.a a(U.a aVar, String str, int i3) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i3);
        Parcel parcelZzB = zzB(2, parcelZza);
        U.a aVarA = a.AbstractBinderC0062a.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final int b(U.a aVar, String str, boolean z2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z2 ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i3 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i3;
    }

    public final U.a f(U.a aVar, String str, int i3) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i3);
        Parcel parcelZzB = zzB(4, parcelZza);
        U.a aVarA = a.AbstractBinderC0062a.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final int t(U.a aVar, String str, boolean z2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z2 ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i3 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i3;
    }

    public final int u() {
        Parcel parcelZzB = zzB(6, zza());
        int i3 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i3;
    }

    public final U.a v(U.a aVar, String str, boolean z2, long j3) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(z2 ? 1 : 0);
        parcelZza.writeLong(j3);
        Parcel parcelZzB = zzB(7, parcelZza);
        U.a aVarA = a.AbstractBinderC0062a.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }

    public final U.a w(U.a aVar, String str, int i3, U.a aVar2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i3);
        zzc.zze(parcelZza, aVar2);
        Parcel parcelZzB = zzB(8, parcelZza);
        U.a aVarA = a.AbstractBinderC0062a.a(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarA;
    }
}
