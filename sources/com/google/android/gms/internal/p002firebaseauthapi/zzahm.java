package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.auth.C0673e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzahm implements zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private C0673e zze;
    private String zzf;
    private String zzg;

    public zzahm(int i3) {
        this.zza = zza(i3);
    }

    public final zzahm zza(C0673e c0673e) {
        this.zze = (C0673e) AbstractC0643s.k(c0673e);
        return this;
    }

    public final zzahm zzb(String str) {
        this.zzb = AbstractC0643s.e(str);
        return this;
    }

    public final zzahm zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzahm zzd(String str) {
        this.zzd = AbstractC0643s.e(str);
        return this;
    }

    private zzahm(int i3, C0673e c0673e, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        this.zze = (C0673e) AbstractC0643s.k(c0673e);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public static zzahm zza(C0673e c0673e, String str, String str2) {
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.k(c0673e);
        return new zzahm(7, c0673e, null, str2, str, null, null);
    }

    public final C0673e zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final zzahm zza(String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        int i3;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.hashCode();
        i3 = 1;
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i3 = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i3 = 7;
                break;
            case "EMAIL_SIGNIN":
                i3 = 6;
                break;
            default:
                i3 = 0;
                break;
        }
        jSONObject.put("requestType", i3);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        C0673e c0673e = this.zze;
        if (c0673e != null) {
            jSONObject.put("androidInstallApp", c0673e.t());
            jSONObject.put("canHandleCodeInApp", this.zze.s());
            if (this.zze.y() != null) {
                jSONObject.put("continueUrl", this.zze.y());
            }
            if (this.zze.w() != null) {
                jSONObject.put("iosBundleId", this.zze.w());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.v() != null) {
                jSONObject.put("androidPackageName", this.zze.v());
            }
            if (this.zze.u() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.u());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
            if (this.zze.x() != null) {
                jSONObject.put("linkDomain", this.zze.x());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.zzg;
        if (str6 != null) {
            zzajk.zza(jSONObject, "captchaResp", str6);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    private static String zza(int i3) {
        return i3 != 1 ? i3 != 4 ? i3 != 6 ? i3 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }
}
