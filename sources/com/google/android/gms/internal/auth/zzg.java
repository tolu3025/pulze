package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.C0602b;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public interface zzg {
    /* synthetic */ C0602b getApiKey();

    Task zza(zzbw zzbwVar);

    Task zzb(C.b bVar);

    Task zzc(Account account, String str, Bundle bundle);

    Task zzd(Account account);

    Task zze(String str);
}
