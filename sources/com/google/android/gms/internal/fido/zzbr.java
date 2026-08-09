package com.google.android.gms.internal.fido;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbr implements Comparator {
    protected zzbr() {
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzbr zza() {
        return new zzbw(this);
    }
}
