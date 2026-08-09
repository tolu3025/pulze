package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzaia {
    private List<zzaib> zza;

    public zzaia() {
        this.zza = new ArrayList();
    }

    public static zzaia zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzaia(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i3);
            arrayList.add(jSONObject == null ? new zzaib() : new zzaib(p.a(jSONObject.optString("federatedId")), p.a(jSONObject.optString("displayName")), p.a(jSONObject.optString("photoUrl")), p.a(jSONObject.optString("providerId")), null, p.a(jSONObject.optString("phoneNumber")), p.a(jSONObject.optString("email"))));
        }
        return new zzaia(arrayList);
    }

    private zzaia(List<zzaib> list) {
        this.zza = !list.isEmpty() ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public final List<zzaib> zza() {
        return this.zza;
    }
}
