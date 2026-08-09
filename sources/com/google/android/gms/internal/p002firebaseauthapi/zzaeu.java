package com.google.android.gms.internal.p002firebaseauthapi;

import M.j;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzaeu {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int iG = j.e().g(context, 12451000);
            zza = Boolean.valueOf(iG == 0 || iG == 2);
        }
        return zza.booleanValue();
    }
}
