package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0651a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f5871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5872b;

    protected AbstractC0651a(IBinder iBinder, String str) {
        this.f5871a = iBinder;
        this.f5872b = str;
    }

    protected final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f5872b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5871a;
    }

    protected final void b(int i3, Parcel parcel) {
        try {
            this.f5871a.transact(i3, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
