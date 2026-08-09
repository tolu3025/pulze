package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.util.p;
import com.google.firebase.auth.E0;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzajd implements zzaez<zzajd> {
    private static final String zza = "zzajd";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private List<zzahy> zzp;
    private String zzq;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzajd zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = p.a(jSONObject.optString("idToken", null));
            this.zzd = p.a(jSONObject.optString("refreshToken", null));
            this.zze = jSONObject.optLong("expiresIn", 0L);
            p.a(jSONObject.optString("localId", null));
            this.zzf = p.a(jSONObject.optString("email", null));
            p.a(jSONObject.optString("displayName", null));
            p.a(jSONObject.optString("photoUrl", null));
            this.zzg = p.a(jSONObject.optString("providerId", null));
            this.zzh = p.a(jSONObject.optString("rawUserInfo", null));
            this.zzi = jSONObject.optBoolean("isNewUser", false);
            this.zzj = jSONObject.optString("oauthAccessToken", null);
            this.zzk = jSONObject.optString("oauthIdToken", null);
            this.zzm = p.a(jSONObject.optString("errorMessage", null));
            this.zzn = p.a(jSONObject.optString("pendingToken", null));
            this.zzo = p.a(jSONObject.optString("tenantId", null));
            this.zzp = zzahy.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzq = p.a(jSONObject.optString("mfaPendingCredential", null));
            this.zzl = p.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e3) {
            throw zzajk.zza(e3, zza, str);
        }
    }

    public final long zza() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final String zzj() {
        return this.zzo;
    }

    public final List<zzahy> zzk() {
        return this.zzp;
    }

    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzq);
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzi;
    }

    public final boolean zzo() {
        return this.zzb || !TextUtils.isEmpty(this.zzm);
    }

    public final E0 zzb() {
        if (TextUtils.isEmpty(this.zzj) && TextUtils.isEmpty(this.zzk)) {
            return null;
        }
        return E0.B(this.zzg, this.zzk, this.zzj, this.zzn, this.zzl);
    }
}
