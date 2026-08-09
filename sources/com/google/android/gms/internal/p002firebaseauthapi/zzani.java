package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzani implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzang zzc;

    private zzani(zzang zzangVar) {
        Objects.requireNonNull(zzangVar);
        this.zzc = zzangVar;
        this.zza = zzangVar.zzb;
    }

    private final Iterator zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3 = this.zza;
        return (i3 > 0 && i3 <= this.zzc.zzb) || zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        Object[] objArr = this.zzc.zza;
        int i3 = this.zza - 1;
        this.zza = i3;
        return (zzank) objArr[i3];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
