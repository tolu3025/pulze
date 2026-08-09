package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzaw extends zzah<Object> {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzaw(Object[] objArr, int i3, int i4) {
        this.zza = objArr;
        this.zzb = i3;
        this.zzc = i4;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        zzu.zza(i3, this.zzc);
        Object obj = this.zza[(i3 * 2) + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
