package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends p implements F {
    public E() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }

    @Override // com.google.android.play.integrity.internal.p
    protected final boolean a(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) q.a(parcel, Bundle.CREATOR);
        q.b(parcel);
        b(bundle);
        return true;
    }
}
