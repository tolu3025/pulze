package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzahw {
    private Long zza;
    private Long zzb;

    public static zzahw zza(String str) throws UnsupportedEncodingException {
        try {
            zzahw zzahwVar = new zzahw();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            zzahwVar.zza = Long.valueOf(jSONObject.optLong("iat"));
            zzahwVar.zzb = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzahwVar;
        } catch (JSONException e3) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. " + String.valueOf(e3));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. " + String.valueOf(e3));
        }
    }

    public final Long zzb() {
        return this.zza;
    }

    public final Long zza() {
        return this.zzb;
    }
}
