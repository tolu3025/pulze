package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes.dex */
public final class zzbq {
    static Object zza(Object obj, int i3) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i3);
    }

    static Object[] zzb(Object[] objArr, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            zza(objArr[i4], i4);
        }
        return objArr;
    }
}
