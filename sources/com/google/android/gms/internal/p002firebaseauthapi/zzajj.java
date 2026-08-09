package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.p;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzajj implements zzaez<zzajj> {
    private static final String zza = "zzajj";
    private String zzb;
    private String zzc;
    private long zzd;
    private boolean zze;
    private String zzf;
    private String zzg;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzajj zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("idToken", null));
            this.zzc = p.a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            p.a(jSONObject.optString("localId", null));
            this.zze = jSONObject.optBoolean("isNewUser", false);
            this.zzf = p.a(jSONObject.optString("temporaryProof", null));
            this.zzg = p.a(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e3) {
            throw zzajk.zza(e3, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
