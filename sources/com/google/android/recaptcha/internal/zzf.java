package com.google.android.recaptcha.internal;

import c2.W0;

/* JADX INFO: loaded from: classes.dex */
public final class zzf {
    public static final zzbd zza(Exception exc, zzbd zzbdVar) {
        return exc instanceof W0 ? new zzbd(zzbb.zzb, zzba.zzb, exc.getMessage()) : exc instanceof zzbd ? (zzbd) exc : zzbdVar;
    }
}
