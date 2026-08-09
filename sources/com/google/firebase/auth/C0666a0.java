package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.firebase.auth.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0666a0 extends J {
    public static final Parcelable.Creator<C0666a0> CREATOR = new C0713y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zzaiz f6037d;

    public C0666a0(String str, String str2, long j3, zzaiz zzaizVar) {
        this.f6034a = AbstractC0643s.e(str);
        this.f6035b = str2;
        this.f6036c = j3;
        this.f6037d = (zzaiz) AbstractC0643s.l(zzaizVar, "totpInfo cannot be null.");
    }

    public static C0666a0 v(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new C0666a0(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzaiz());
    }

    @Override // com.google.firebase.auth.J
    public String a() {
        return this.f6034a;
    }

    @Override // com.google.firebase.auth.J
    public String p() {
        return this.f6035b;
    }

    @Override // com.google.firebase.auth.J
    public long s() {
        return this.f6036c;
    }

    @Override // com.google.firebase.auth.J
    public String t() {
        return "totp";
    }

    @Override // com.google.firebase.auth.J
    public JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f6034a);
            jSONObject.putOpt("displayName", this.f6035b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f6036c));
            jSONObject.putOpt("totpInfo", this.f6037d);
            return jSONObject;
        } catch (JSONException e3) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaao(e3);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, a(), false);
        N.c.C(parcel, 2, p(), false);
        N.c.v(parcel, 3, s());
        N.c.A(parcel, 4, this.f6037d, i3, false);
        N.c.b(parcel, iA);
    }
}
