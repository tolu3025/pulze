package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import com.google.android.gms.internal.p002firebaseauthapi.zzak;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.firebase.auth.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0703t0 extends N.a {
    public static final Parcelable.Creator<C0703t0> CREATOR = new C0701s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6109c;

    C0703t0(String str, String str2, String str3) {
        this.f6107a = str;
        this.f6108b = str2;
        this.f6109c = str3;
    }

    public static zzah s(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzah.zzg();
        }
        zzak zzakVarZzf = zzah.zzf();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i3);
            zzakVarZzf.zza(new C0703t0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzakVarZzf.zza();
    }

    public static final C0703t0 t(JSONObject jSONObject) {
        return new C0703t0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    public static final JSONObject u(C0703t0 c0703t0) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credentialId", c0703t0.f6107a);
        jSONObject.put("name", c0703t0.f6108b);
        jSONObject.put("displayName", c0703t0.f6109c);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, this.f6107a, false);
        N.c.C(parcel, 2, this.f6108b, false);
        N.c.C(parcel, 3, this.f6109c, false);
        N.c.b(parcel, iA);
    }
}
