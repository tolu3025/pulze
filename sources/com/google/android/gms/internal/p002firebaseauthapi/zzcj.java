package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzcj {
    public static zzcb zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzxb zzxbVarZza = zzxb.zza(bArr, zzaku.zza());
            zzoz zzozVarZza = zzoz.zza();
            zzqe zzqeVarZza = zzqe.zza(zzxbVarZza);
            return !zzozVarZza.zzc(zzqeVarZza) ? new zzoi(zzqeVarZza) : zzozVarZza.zza(zzqeVarZza);
        } catch (IOException e3) {
            throw new GeneralSecurityException("Failed to parse proto", e3);
        }
    }

    public static byte[] zza(zzcb zzcbVar) {
        return (zzcbVar instanceof zzoi ? ((zzoi) zzcbVar).zzb() : (zzqe) zzoz.zza().zza(zzcbVar, zzqe.class)).zza().zzk();
    }
}
