package com.google.android.gms.internal.p002firebaseauthapi;

import N.a;
import N.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0643s;
import org.json.JSONException;
import org.json.JSONObject;
import q0.z0;

/* JADX INFO: loaded from: classes.dex */
public final class zzajb extends a implements zzafa {
    public static final Parcelable.Creator<zzajb> CREATOR = new zzaja();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzajb() {
        this.zzi = true;
        this.zzj = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = c.a(parcel);
        c.C(parcel, 2, this.zza, false);
        c.C(parcel, 3, this.zzb, false);
        c.C(parcel, 4, this.zzc, false);
        c.C(parcel, 5, this.zzd, false);
        c.C(parcel, 6, this.zze, false);
        c.C(parcel, 7, this.zzf, false);
        c.C(parcel, 8, this.zzg, false);
        c.C(parcel, 9, this.zzh, false);
        c.g(parcel, 10, this.zzi);
        c.g(parcel, 11, this.zzj);
        c.C(parcel, 12, this.zzk, false);
        c.C(parcel, 13, this.zzl, false);
        c.C(parcel, 14, this.zzm, false);
        c.C(parcel, 15, this.zzn, false);
        c.g(parcel, 16, this.zzo);
        c.C(parcel, 17, this.zzp, false);
        c.b(parcel, iA);
    }

    public final zzajb zza(String str) {
        this.zzb = AbstractC0643s.e(str);
        return this;
    }

    public final zzajb zzb(String str) {
        this.zzn = str;
        return this;
    }

    public final zzajb zzc(boolean z2) {
        this.zzi = true;
        return this;
    }

    public zzajb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.zzd) && TextUtils.isEmpty(this.zzk)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        this.zze = AbstractC0643s.e(str3);
        this.zzf = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.zzc)) {
            sb.append("id_token=");
            sb.append(this.zzc);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            sb.append("access_token=");
            sb.append(this.zzd);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            sb.append("identifier=");
            sb.append(this.zzf);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            sb.append("oauth_token_secret=");
            sb.append(this.zzh);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzk)) {
            sb.append("code=");
            sb.append(this.zzk);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb.append("nonce=");
            sb.append(str9);
            sb.append("&");
        }
        sb.append("providerId=");
        sb.append(this.zze);
        this.zzg = sb.toString();
        this.zzj = true;
    }

    public final zzajb zza(boolean z2) {
        this.zzj = false;
        return this;
    }

    public final zzajb zzb(boolean z2) {
        this.zzo = true;
        return this;
    }

    zzajb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, boolean z3, String str9, String str10, String str11, String str12, boolean z4, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z2;
        this.zzj = z3;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z4;
        this.zzp = str13;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.zzg;
        if (str3 != null) {
            jSONObject.put("postBody", str3);
        }
        String str4 = this.zzn;
        if (str4 != null) {
            jSONObject.put("tenantId", str4);
        }
        String str5 = this.zzp;
        if (str5 != null) {
            jSONObject.put("pendingToken", str5);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            jSONObject.put("sessionId", this.zzl);
        }
        if (TextUtils.isEmpty(this.zzm)) {
            str = this.zza;
            if (str != null) {
            }
            jSONObject.put("returnIdpCredential", this.zzo);
            return jSONObject.toString();
        }
        str = this.zzm;
        jSONObject.put("requestUri", str);
        jSONObject.put("returnIdpCredential", this.zzo);
        return jSONObject.toString();
    }

    public zzajb(z0 z0Var, String str) {
        AbstractC0643s.k(z0Var);
        this.zzl = AbstractC0643s.e(z0Var.d());
        this.zzm = AbstractC0643s.e(str);
        this.zze = AbstractC0643s.e(z0Var.c());
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }
}
