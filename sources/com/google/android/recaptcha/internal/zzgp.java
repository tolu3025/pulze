package com.google.android.recaptcha.internal;

import J1.AbstractC0407k;
import J1.x;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i3, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        String strG;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        if (objZza instanceof int[]) {
            strG = AbstractC0407k.L((int[]) objZza, ",", "[", "]", 0, null, null, 56, null);
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, b2.c.f4952b);
            } else if (objZza instanceof long[]) {
                strG = AbstractC0407k.M((long[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof short[]) {
                strG = AbstractC0407k.O((short[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof float[]) {
                strG = AbstractC0407k.K((float[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof double[]) {
                strG = AbstractC0407k.J((double[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strG = AbstractC0407k.N((Object[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                strG = x.G((Iterable) objZza, ",", "[", "]", 0, null, null, 56, null);
            }
            strG = str;
        }
        zzgdVar.zzc().zze(i3, strG);
    }
}
