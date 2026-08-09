package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzagi {
    public static String zza(String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
