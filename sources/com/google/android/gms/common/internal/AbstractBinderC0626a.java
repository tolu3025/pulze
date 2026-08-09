package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.InterfaceC0636k;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0626a extends InterfaceC0636k.a {
    public static Account b(InterfaceC0636k interfaceC0636k) {
        Account accountZzb = null;
        if (interfaceC0636k != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    accountZzb = interfaceC0636k.zzb();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return accountZzb;
    }
}
