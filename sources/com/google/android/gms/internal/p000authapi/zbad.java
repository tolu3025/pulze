package com.google.android.gms.internal.p000authapi;

import G.i;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;

/* JADX INFO: loaded from: classes.dex */
public final class zbad extends zba implements IInterface {
    zbad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbaj zbajVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbajVar);
        zbc.zbc(parcelZba, saveAccountLinkingTokenRequest);
        zbb(1, parcelZba);
    }

    public final void zbd(zbal zbalVar, i iVar) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbalVar);
        zbc.zbc(parcelZba, iVar);
        zbb(2, parcelZba);
    }
}
