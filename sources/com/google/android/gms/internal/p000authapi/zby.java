package com.google.android.gms.internal.p000authapi;

import G.C0318a;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class zby extends zbb implements zbz {
    public zby() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C0318a c0318a = (C0318a) zbc.zba(parcel, C0318a.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c0318a);
        return true;
    }
}
