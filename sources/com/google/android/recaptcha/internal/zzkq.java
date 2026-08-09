package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public class zzkq implements zzoq {
    private static final zzmo zza;

    static {
        int i3 = zzmo.zzb;
        int i4 = zzos.zza;
        zza = zzmo.zza;
    }

    public zzoi zza(byte[] bArr, int i3, int i4, zzmo zzmoVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final /* synthetic */ Object zzb(byte[] bArr) throws zznn {
        zzoi zzoiVarZza = zza(bArr, 0, bArr.length, zza);
        if (zzoiVarZza == null || zzoiVarZza.zzp()) {
            return zzoiVarZza;
        }
        throw new zzpk((zzko) zzoiVarZza).zza();
    }
}
