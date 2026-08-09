package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.p;
import com.google.firebase.auth.C0703t0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzahl implements zzaez<zzahl> {
    private static final String zza = "zzahl";
    private zzahn zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahl zza(String str) throws zzacn {
        zzahn zzahnVar;
        int i3;
        zzahk zzahkVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzahnVar = new zzahn(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    boolean z2 = false;
                    int i4 = 0;
                    while (i4 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i4);
                        if (jSONObject2 == null) {
                            zzahkVar = new zzahk();
                            i3 = i4;
                        } else {
                            i3 = i4;
                            zzahkVar = new zzahk(p.a(jSONObject2.optString("localId", null)), p.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z2), p.a(jSONObject2.optString("displayName", null)), p.a(jSONObject2.optString("photoUrl", null)), zzaia.zza(jSONObject2.optJSONArray("providerUserInfo")), p.a(jSONObject2.optString("rawPassword", null)), p.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzahy.zza(jSONObject2.optJSONArray("mfaInfo")), C0703t0.s(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzahkVar);
                        i4 = i3 + 1;
                        z2 = false;
                    }
                    zzahnVar = new zzahn(arrayList);
                }
            } else {
                zzahnVar = new zzahn();
            }
            this.zzb = zzahnVar;
            return this;
        } catch (NullPointerException e3) {
            e = e3;
            throw zzajk.zza(e, zza, str);
        } catch (JSONException e4) {
            e = e4;
            throw zzajk.zza(e, zza, str);
        }
    }

    public final List<zzahk> zza() {
        return this.zzb.zza();
    }
}
