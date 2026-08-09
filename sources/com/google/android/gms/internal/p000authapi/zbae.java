package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class zbae extends zbb implements zbaf {
    public zbae() {
        super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) zbc.zba(parcel, PendingIntent.CREATOR);
        zbc.zbb(parcel);
        zbb(status, pendingIntent);
        return true;
    }
}
