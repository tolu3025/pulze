package com.google.android.gms.internal.p000authapi;

import G.j;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class zbak extends zbb implements zbal {
    public zbak() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        j jVar = (j) zbc.zba(parcel, j.CREATOR);
        zbc.zbb(parcel);
        zbb(status, jVar);
        return true;
    }
}
