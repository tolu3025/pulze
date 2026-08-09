package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class zzaf<E> extends zzai<E> {
    Object[] zza;
    int zzb;
    boolean zzc;

    zzaf(int i3) {
        zzae.zza(4, "initialCapacity");
        this.zza = new Object[4];
        this.zzb = 0;
    }

    public zzaf<E> zza(E e3) {
        zzu.zza(e3);
        Object[] objArr = this.zza;
        int iZza = zzai.zza(objArr.length, this.zzb + 1);
        if (iZza > objArr.length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZza);
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i3 = this.zzb;
        this.zzb = i3 + 1;
        objArr2[i3] = e3;
        return this;
    }
}
