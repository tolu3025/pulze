package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0636k extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.k$a */
    public static abstract class a extends zzb implements InterfaceC0636k {
        public static InterfaceC0636k a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC0636k ? (InterfaceC0636k) iInterfaceQueryLocalInterface : new r0(iBinder);
        }
    }

    Account zzb();
}
