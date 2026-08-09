package com.google.android.gms.internal.p000authapi;

import G.C0319b;
import G.C0322e;
import G.f;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.InterfaceC0608h;

/* JADX INFO: loaded from: classes.dex */
public final class zbam extends zba implements IInterface {
    zbam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbac zbacVar, C0319b c0319b) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbacVar);
        zbc.zbc(parcelZba, c0319b);
        zbb(1, parcelZba);
    }

    public final void zbd(zbaf zbafVar, C0322e c0322e, String str) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbafVar);
        zbc.zbc(parcelZba, c0322e);
        parcelZba.writeString(str);
        zbb(4, parcelZba);
    }

    public final void zbe(zbah zbahVar, f fVar) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbahVar);
        zbc.zbc(parcelZba, fVar);
        zbb(3, parcelZba);
    }

    public final void zbf(InterfaceC0608h interfaceC0608h, String str) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, interfaceC0608h);
        parcelZba.writeString(str);
        zbb(2, parcelZba);
    }
}
