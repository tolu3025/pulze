package com.google.android.recaptcha.internal;

import M.j;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzbs {
    private final j zza;

    public zzbs() {
        this.zza = j.e();
    }

    public final int zza(Context context) {
        int iF = this.zza.f(context);
        return (iF == 1 || iF == 3 || iF == 9) ? 4 : 3;
    }

    public zzbs(j jVar) {
        this.zza = jVar;
    }
}
