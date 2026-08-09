package com.google.android.recaptcha.internal;

import I1.q;
import J1.G;
import android.os.Build;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzjb {
    public static final Map zza() {
        Map mapF = G.f(q.a(-4, zzba.zzo), q.a(-12, zzba.zzp), q.a(-6, zzba.zzk), q.a(-11, zzba.zzm), q.a(-13, zzba.zzq), q.a(-14, zzba.zzr), q.a(-2, zzba.zzl), q.a(-7, zzba.zzs), q.a(-5, zzba.zzt), q.a(-9, zzba.zzu), q.a(-8, zzba.zzE), q.a(-15, zzba.zzn), q.a(-1, zzba.zzv), q.a(-3, zzba.zzx), q.a(-10, zzba.zzy));
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            mapF.put(-16, zzba.zzw);
        }
        if (i3 >= 27) {
            mapF.put(1, zzba.zzA);
            mapF.put(2, zzba.zzB);
            mapF.put(0, zzba.zzC);
            mapF.put(3, zzba.zzD);
        }
        if (i3 >= 29) {
            mapF.put(4, zzba.zzz);
        }
        return mapF;
    }
}
