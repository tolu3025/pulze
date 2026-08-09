package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0608h extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.h$a */
    public static abstract class a extends zab implements InterfaceC0608h {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        public static InterfaceC0608h asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return iInterfaceQueryLocalInterface instanceof InterfaceC0608h ? (InterfaceC0608h) iInterfaceQueryLocalInterface : new P(iBinder);
        }

        @Override // com.google.android.gms.internal.base.zab
        protected final boolean zaa(int i3, Parcel parcel, Parcel parcel2, int i4) {
            if (i3 != 1) {
                return false;
            }
            Status status = (Status) zac.zaa(parcel, Status.CREATOR);
            zac.zad(parcel);
            onResult(status);
            return true;
        }
    }

    void onResult(Status status);
}
