package com.google.android.gms.internal.p000authapi;

import G.h;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class zbai extends zbb implements zbaj {
    public zbai() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        h hVar = (h) zbc.zba(parcel, h.CREATOR);
        zbc.zbb(parcel);
        zbb(status, hVar);
        return true;
    }
}
