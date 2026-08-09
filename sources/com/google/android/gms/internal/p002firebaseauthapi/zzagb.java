package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.collection.a;
import com.google.android.gms.common.util.f;
import com.google.firebase.auth.Q;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzagb {
    private static final Map<String, zzagd> zza = new a();

    public static Q.b zza(String str, Q.b bVar, zzaff zzaffVar) {
        zza(str, zzaffVar);
        return new zzaga(bVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaff zzaffVar) {
        zza.put(str, new zzagd(zzaffVar, f.c().a()));
    }

    public static boolean zza(String str, Q.b bVar, Activity activity, Executor executor) {
        Map<String, zzagd> map = zza;
        if (!map.containsKey(str)) {
            zza(str, null);
            return false;
        }
        zzagd zzagdVar = map.get(str);
        if (f.c().a() - zzagdVar.zzb >= 120000) {
            zza(str, null);
            return false;
        }
        zzaff zzaffVar = zzagdVar.zza;
        if (zzaffVar == null) {
            return true;
        }
        zzaffVar.zza(bVar, activity, executor, str);
        return true;
    }
}
