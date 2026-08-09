package com.google.android.recaptcha.internal;

import J1.AbstractC0407k;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzhj implements zzgx {
    public static final zzhj zza = new zzhj();

    private zzhj() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i3, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length == 0) {
            throw new zzce(4, 3, null);
        }
        Constructor<?> constructorZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (constructorZza instanceof Object)) {
            constructorZza = null;
        }
        if (constructorZza == null) {
            throw new zzce(4, 5, null);
        }
        Constructor<?> constructor = constructorZza instanceof Constructor ? constructorZza : constructorZza.getClass().getConstructor(new Class[0]);
        Object[] objArrZzg = zzgdVar.zzc().zzg(AbstractC0407k.Z(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i3, constructor.newInstance(Arrays.copyOf(objArrZzg, objArrZzg.length)));
        } catch (Exception e3) {
            throw new zzce(6, 14, e3);
        }
    }
}
