package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public class zzai<E> {
    zzai() {
    }

    static int zza(int i3, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i4 <= i3) {
            return i3;
        }
        int iHighestOneBit = i3 + (i3 >> 1) + 1;
        if (iHighestOneBit < i4) {
            iHighestOneBit = Integer.highestOneBit(i4 - 1) << 1;
        }
        return iHighestOneBit < 0 ? a.e.API_PRIORITY_OTHER : iHighestOneBit;
    }
}
