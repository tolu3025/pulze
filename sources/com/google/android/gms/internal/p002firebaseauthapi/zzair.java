package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzair implements zzaez<zzair> {
    private static final String zza = "zzair";

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public zzair zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                return (zzaiv) ((zzair) new zzaiv().zza(str));
            }
            if (jSONObject.optJSONObject("totpSessionInfo") != null) {
                return (zzaix) ((zzair) new zzaix().zza(str));
            }
            throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
        } catch (NullPointerException e3) {
            e = e3;
            throw zzajk.zza(e, zza, str);
        } catch (JSONException e4) {
            e = e4;
            throw zzajk.zza(e, zza, str);
        }
    }

    public String zza() {
        return null;
    }
}
