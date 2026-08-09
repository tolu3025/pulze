package com.google.android.gms.internal.p000authapi;

import G.C0320c;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class zbab extends zbb implements zbac {
    public zbab() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C0320c c0320c = (C0320c) zbc.zba(parcel, C0320c.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c0320c);
        return true;
    }
}
