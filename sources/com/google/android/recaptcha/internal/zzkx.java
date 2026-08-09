package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class zzkx extends zzky {
    final /* synthetic */ zzle zza;
    private int zzb = 0;
    private final int zzc;

    zzkx(zzle zzleVar) {
        this.zza = zzleVar;
        this.zzc = zzleVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzla
    public final byte zza() {
        int i3 = this.zzb;
        if (i3 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i3 + 1;
        return this.zza.zzb(i3);
    }
}
