package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
final class W implements InterfaceC0639n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f5513a;

    W(IBinder iBinder) {
        this.f5513a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5513a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0639n
    public final void k(InterfaceC0638m interfaceC0638m, C0632g c0632g) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC0638m != null ? interfaceC0638m.asBinder() : null);
            if (c0632g != null) {
                parcelObtain.writeInt(1);
                k0.a(c0632g, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f5513a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
