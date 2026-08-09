package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzx extends zzaa {
    private final /* synthetic */ zzm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzx(zzt zztVar, CharSequence charSequence, zzm zzmVar) {
        super(zztVar, charSequence);
        this.zzb = zzmVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaa
    public final int zza(int i3) {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaa
    public final int zzb(int i3) {
        if (this.zzb.zza(i3)) {
            return this.zzb.zzb();
        }
        return -1;
    }
}
