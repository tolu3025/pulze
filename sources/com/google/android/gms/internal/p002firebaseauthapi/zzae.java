package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzae {
    static int zza(int i3, String str) {
        if (i3 >= 0) {
            return i3;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i3);
    }

    static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + String.valueOf(obj2));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + String.valueOf(obj) + "=null");
    }
}
