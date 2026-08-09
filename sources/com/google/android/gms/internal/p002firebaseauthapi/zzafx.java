package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzafx {
    private final String zza;
    private final String zzb;

    public zzafx(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzafx(Context context, String str) {
        AbstractC0643s.k(context);
        String strE = AbstractC0643s.e(str);
        this.zza = strE;
        try {
            byte[] bArrA = a.a(context, strE);
            if (bArrA != null) {
                this.zzb = h.b(bArrA, false);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: " + str);
            this.zzb = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }
}
