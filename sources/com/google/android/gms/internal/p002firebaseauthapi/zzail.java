package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzail implements zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzj;
    private boolean zzh = true;
    private zzaiw zzg = new zzaiw();
    private zzaiw zzi = new zzaiw();

    public final zzail zza(String str) {
        AbstractC0643s.e(str);
        this.zzi.zzb().add(str);
        return this;
    }

    public final zzail zzb(String str) {
        if (str == null) {
            this.zzg.zzb().add("DISPLAY_NAME");
        } else {
            this.zzb = str;
        }
        return this;
    }

    public final zzail zzc(String str) {
        if (str == null) {
            this.zzg.zzb().add("EMAIL");
        } else {
            this.zzc = str;
        }
        return this;
    }

    public final zzail zzd(String str) {
        this.zza = AbstractC0643s.e(str);
        return this;
    }

    public final zzail zze(String str) {
        this.zze = AbstractC0643s.e(str);
        return this;
    }

    public final zzail zzf(String str) {
        if (str == null) {
            this.zzg.zzb().add("PASSWORD");
        } else {
            this.zzd = str;
        }
        return this;
    }

    public final zzail zzg(String str) {
        if (str == null) {
            this.zzg.zzb().add("PHOTO_URL");
        } else {
            this.zzf = str;
        }
        return this;
    }

    public final zzail zzh(String str) {
        this.zzj = str;
        return this;
    }

    public final boolean zzi(String str) {
        AbstractC0643s.e(str);
        return this.zzg.zzb().contains(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        int i3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", this.zzh);
        if (!this.zzi.zzb().isEmpty()) {
            List<String> listZzb = this.zzi.zzb();
            JSONArray jSONArray = new JSONArray();
            for (int i4 = 0; i4 < listZzb.size(); i4++) {
                jSONArray.put(listZzb.get(i4));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List<String> listZzb2 = this.zzg.zzb();
        int size = listZzb2.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < listZzb2.size(); i5++) {
            String str = listZzb2.get(i5);
            str.hashCode();
            i3 = 2;
            switch (str) {
                case "DISPLAY_NAME":
                    break;
                case "EMAIL":
                    i3 = 1;
                    break;
                case "PHOTO_URL":
                    i3 = 4;
                    break;
                case "PASSWORD":
                    i3 = 5;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            iArr[i5] = i3;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i6 = 0; i6 < size; i6++) {
                jSONArray2.put(iArr[i6]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.zza;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("password", str4);
        }
        String str5 = this.zzb;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.zzf;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.zze;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.zzj;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zzf;
    }
}
