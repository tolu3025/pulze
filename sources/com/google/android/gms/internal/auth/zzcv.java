package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class zzcv extends zzdc {
    zzcv(zzcz zzczVar, String str, Long l3, boolean z2) {
        super(zzczVar, str, l3, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            Log.e("PhenotypeFlag", "Invalid long value for " + super.zzc() + ": " + ((String) obj));
            return null;
        }
    }
}
