package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0643s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzahf implements zzagz {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzahf(String str, String str2, String str3, String str4, String str5) {
        this.zza = AbstractC0643s.e(str);
        this.zzb = AbstractC0643s.e(str2);
        this.zzc = AbstractC0643s.e(str3);
        this.zzd = AbstractC0643s.e(str4);
        this.zze = str5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagz
    public final /* synthetic */ zzagz zza(String str) {
        this.zza = str;
        return this;
    }

    public static zzahf zza(String str, String str2, String str3, String str4, String str5) {
        return new zzahf(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("displayName", this.zzb);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(this.zzc)) {
            jSONObject2.put("sessionInfo", this.zzc);
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject2.put("verificationCode", this.zzd);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        if (!TextUtils.isEmpty(this.zze)) {
            jSONObject.put("tenantId", this.zze);
        }
        return jSONObject.toString();
    }
}
