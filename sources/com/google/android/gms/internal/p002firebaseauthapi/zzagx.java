package com.google.android.gms.internal.p002firebaseauthapi;

import P.a;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.auth.C0675f;
import com.google.firebase.auth.C0683j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzagx implements zzafa {
    private static final String zza = "zzagx";
    private final String zzb;
    private final String zzc;
    private final C0683j zzd;
    private final String zze;
    private final String zzf;

    static {
        new a(zzagx.class.getSimpleName(), new String[0]);
    }

    public zzagx(C0683j c0683j, String str, String str2) {
        this.zzd = (C0683j) AbstractC0643s.k(c0683j);
        this.zzb = AbstractC0643s.e(c0683j.zzc());
        this.zzc = AbstractC0643s.e(c0683j.zze());
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        C0675f c0675fC = C0675f.c(this.zzc);
        String strA = c0675fC != null ? c0675fC.a() : null;
        String strD = c0675fC != null ? c0675fC.d() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (strA != null) {
            jSONObject.put("oobCode", strA);
        }
        if (strD != null) {
            jSONObject.put("tenantId", strD);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            zzajk.zza(jSONObject, "captchaResp", str2);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final C0683j zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
