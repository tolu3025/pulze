package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.util.p;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzahy {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzaiz zze;

    private zzahy(String str, String str2, String str3, long j3, zzaiz zzaizVar) {
        if (!TextUtils.isEmpty(str) && zzaizVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.zza = str;
        this.zzb = AbstractC0643s.e(str2);
        this.zzc = str3;
        this.zzd = j3;
        this.zze = zzaizVar;
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzaiz zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }

    private static long zza(String str) {
        try {
            return zzaoo.zza(zzaoo.zza(str));
        } catch (ParseException e3) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e3);
            return 0L;
        }
    }

    public static zzahy zza(JSONObject jSONObject) {
        zzahy zzahyVar = new zzahy(p.a(jSONObject.optString("phoneInfo")), p.a(jSONObject.optString("mfaEnrollmentId")), p.a(jSONObject.optString("displayName")), zza(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new zzaiz() : null);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return zzahyVar;
    }

    public static List<zzahy> zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            arrayList.add(zza(jSONArray.getJSONObject(i3)));
        }
        return arrayList;
    }
}
