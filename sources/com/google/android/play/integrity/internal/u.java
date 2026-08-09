package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC0651a implements w {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.w
    public final void c(Bundle bundle, F f3) {
        Parcel parcelA = a();
        q.c(parcelA, bundle);
        parcelA.writeStrongBinder(f3);
        b(6, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.w
    public final void d(Bundle bundle, y yVar) {
        Parcel parcelA = a();
        q.c(parcelA, bundle);
        parcelA.writeStrongBinder(yVar);
        b(2, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.w
    public final void j(Bundle bundle, y yVar) {
        Parcel parcelA = a();
        q.c(parcelA, bundle);
        parcelA.writeStrongBinder(yVar);
        b(3, parcelA);
    }
}
