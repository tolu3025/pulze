package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzagm {
    private final String zza;

    public zzagm(String str) {
        this.zza = AbstractC0643s.e(str);
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.zza);
        return jSONObject;
    }
}
