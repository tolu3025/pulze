package com.google.android.gms.internal.p000authapi;

import N.a;
import N.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;

/* JADX INFO: loaded from: classes.dex */
public final class zbu extends a {
    public static final Parcelable.Creator<zbu> CREATOR = new zbv();
    private final Credential zba;

    public zbu(Credential credential) {
        this.zba = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = c.a(parcel);
        c.A(parcel, 1, this.zba, i3, false);
        c.b(parcel, iA);
    }
}
