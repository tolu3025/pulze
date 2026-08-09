package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes.dex */
public final class zzai {
    static Object[] zza(Object[] objArr, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (objArr[i4] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 9);
                sb.append("at index ");
                sb.append(i4);
                throw new NullPointerException(sb.toString());
            }
        }
        return objArr;
    }
}
