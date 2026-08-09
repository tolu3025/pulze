package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzy extends zzaa {
    private final /* synthetic */ zzf zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzy(zzt zztVar, CharSequence charSequence, zzf zzfVar) {
        super(zztVar, charSequence);
        this.zzb = zzfVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaa
    final int zza(int i3) {
        return i3 + 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaa
    final int zzb(int i3) {
        return this.zzb.zza(((zzaa) this).zza, i3);
    }
}
