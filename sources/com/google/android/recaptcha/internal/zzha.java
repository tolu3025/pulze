package com.google.android.recaptcha.internal;

import J1.AbstractC0407k;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzha implements zzgx {
    public static final zzha zza = new zzha();

    private zzha() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i3, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length == 0) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Class)) {
            objZza = null;
        }
        Class cls = (Class) objZza;
        if (cls == null) {
            throw new zzce(4, 5, null);
        }
        Class[] clsArrZzf = zzgdVar.zzc().zzf(AbstractC0407k.Z(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i3, cls.getConstructor((Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
        } catch (Exception e3) {
            throw new zzce(6, 9, e3);
        }
    }
}
