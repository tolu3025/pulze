package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class U extends J {
    public static final Parcelable.Creator<U> CREATOR = new C0709w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6017d;

    public U(String str, String str2, long j3, String str3) {
        this.f6014a = AbstractC0643s.e(str);
        this.f6015b = str2;
        this.f6016c = j3;
        this.f6017d = AbstractC0643s.e(str3);
    }

    public static U v(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new U(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // com.google.firebase.auth.J
    public String a() {
        return this.f6014a;
    }

    public String i() {
        return this.f6017d;
    }

    @Override // com.google.firebase.auth.J
    public String p() {
        return this.f6015b;
    }

    @Override // com.google.firebase.auth.J
    public long s() {
        return this.f6016c;
    }

    @Override // com.google.firebase.auth.J
    public String t() {
        return "phone";
    }

    @Override // com.google.firebase.auth.J
    public JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f6014a);
            jSONObject.putOpt("displayName", this.f6015b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f6016c));
            jSONObject.putOpt("phoneNumber", this.f6017d);
            return jSONObject;
        } catch (JSONException e3) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaao(e3);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, a(), false);
        N.c.C(parcel, 2, p(), false);
        N.c.v(parcel, 3, s());
        N.c.C(parcel, 4, i(), false);
        N.c.b(parcel, iA);
    }
}
