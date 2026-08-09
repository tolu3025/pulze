package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzql extends RuntimeException {
    public zzql(String str) {
        super(str);
    }

    public static <T> T zza(zzqo<T> zzqoVar) {
        try {
            return zzqoVar.zza();
        } catch (Exception e3) {
            throw new zzql(e3);
        }
    }

    public zzql(String str, Throwable th) {
        super(str, th);
    }

    public zzql(Throwable th) {
        super(th);
    }
}
