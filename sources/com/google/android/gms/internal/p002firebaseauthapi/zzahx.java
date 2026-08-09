package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.util.c;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzahx {
    public static long zza(String str) {
        zzahw zzahwVarZzb = zzb(str);
        return zzahwVarZzb.zza().longValue() - zzahwVarZzb.zzb().longValue();
    }

    private static zzahw zzb(String str) {
        AbstractC0643s.e(str);
        List<String> listZza = zzt.zza('.').zza((CharSequence) str);
        if (listZza.size() >= 2) {
            try {
                return zzahw.zza(new String(c.b(listZza.get(1)), "UTF-8"));
            } catch (UnsupportedEncodingException e3) {
                throw new RuntimeException("Unable to decode token", e3);
            }
        }
        throw new RuntimeException("Invalid idToken " + str);
    }
}
