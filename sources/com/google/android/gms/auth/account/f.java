package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zzb;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends zzb implements g {
    public static g a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new e(iBinder);
    }
}
