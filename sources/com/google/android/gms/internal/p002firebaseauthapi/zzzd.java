package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzzd {
    private ECPrivateKey zza;

    public zzzd(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i3, zzzh zzzhVar) throws GeneralSecurityException {
        byte[] bArrZza = zzyz.zza(bArr, zzzf.zza(this.zza, zzzf.zza(this.zza.getParams(), zzzhVar, bArr)));
        Mac macZza = zzzj.zzb.zza(str);
        if (i3 > macZza.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            macZza.init(new SecretKeySpec(new byte[macZza.getMacLength()], str));
        } else {
            macZza.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArrDoFinal = macZza.doFinal(bArrZza);
        byte[] bArr4 = new byte[i3];
        macZza.init(new SecretKeySpec(bArrDoFinal, str));
        byte[] bArrDoFinal2 = new byte[0];
        int i4 = 1;
        int length = 0;
        while (true) {
            macZza.update(bArrDoFinal2);
            macZza.update(bArr3);
            macZza.update((byte) i4);
            bArrDoFinal2 = macZza.doFinal();
            if (bArrDoFinal2.length + length >= i3) {
                System.arraycopy(bArrDoFinal2, 0, bArr4, length, i3 - length);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal2, 0, bArr4, length, bArrDoFinal2.length);
            length += bArrDoFinal2.length;
            i4++;
        }
    }
}
