package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC0651a implements B {
    z(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.B
    public final void c(Bundle bundle, F f3) {
        Parcel parcelA = a();
        q.c(parcelA, bundle);
        parcelA.writeStrongBinder(f3);
        b(3, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.B
    public final void h(Bundle bundle, D d3) {
        Parcel parcelA = a();
        q.c(parcelA, bundle);
        parcelA.writeStrongBinder(d3);
        b(2, parcelA);
    }
}
