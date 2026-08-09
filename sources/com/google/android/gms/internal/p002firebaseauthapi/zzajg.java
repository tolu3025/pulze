package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0643s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzajg implements zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzajg() {
    }

    public static zzajg zza(String str, String str2, boolean z2) {
        zzajg zzajgVar = new zzajg();
        zzajgVar.zzb = AbstractC0643s.e(str);
        zzajgVar.zzc = AbstractC0643s.e(str2);
        zzajgVar.zzf = z2;
        return zzajgVar;
    }

    public static zzajg zzb(String str, String str2, boolean z2) {
        zzajg zzajgVar = new zzajg();
        zzajgVar.zza = AbstractC0643s.e(str);
        zzajgVar.zzd = AbstractC0643s.e(str2);
        zzajgVar.zzf = z2;
        return zzajgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("sessionInfo", this.zzb);
            str = "code";
            str2 = this.zzc;
        } else {
            jSONObject.put("phoneNumber", this.zza);
            str = "temporaryProof";
            str2 = this.zzd;
        }
        jSONObject.put(str, str2);
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
