package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzaj<E> extends zzab<E> {
    private final zzah<E> zza;

    zzaj(zzah<E> zzahVar, int i3) {
        super(zzahVar.size(), i3);
        this.zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzab
    protected final E zza(int i3) {
        return this.zza.get(i3);
    }
}
