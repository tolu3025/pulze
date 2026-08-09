package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.p;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzahr implements zzaez<zzahr> {
    private static final String zza = "zzahr";
    private String zzb;

    public zzahr() {
    }

    public zzahr(String str) {
        this.zzb = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahr zza(String str) throws zzacn {
        try {
            this.zzb = p.a(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException | JSONException e3) {
            throw zzajk.zza(e3, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
