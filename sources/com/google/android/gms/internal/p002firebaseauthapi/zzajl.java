package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.p;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzajl implements zzaez<zzajl> {
    private static final String zza = "zzajl";
    private String zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzajl zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("idToken"));
            this.zzc = p.a(jSONObject.optString("refreshToken"));
            return this;
        } catch (NullPointerException | JSONException e3) {
            throw zzajk.zza(e3, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}
