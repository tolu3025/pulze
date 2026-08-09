package com.google.android.gms.internal.p002firebaseauthapi;

import N.a;
import N.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.p;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzahv extends a implements zzaez<zzahv> {
    public static final Parcelable.Creator<zzahv> CREATOR = new zzahu();
    private static final String zza = "zzahv";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzahv() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahv zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("refresh_token"));
            this.zzc = p.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = p.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e3) {
            throw zzajk.zza(e3, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = c.a(parcel);
        c.C(parcel, 2, this.zzb, false);
        c.C(parcel, 3, this.zzc, false);
        c.x(parcel, 4, Long.valueOf(zza()), false);
        c.C(parcel, 5, this.zze, false);
        Long l3 = this.zzf;
        l3.longValue();
        c.x(parcel, 6, l3, false);
        c.b(parcel, iA);
    }

    public final long zza() {
        Long l3 = this.zzd;
        if (l3 == null) {
            return 0L;
        }
        return l3.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e3) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzaao(e3);
        }
    }

    public final boolean zzg() {
        return f.c().a() + 300000 < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }

    public zzahv(String str, String str2, Long l3, String str3) {
        this(str, str2, l3, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public static zzahv zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzahv zzahvVar = new zzahv();
            zzahvVar.zzb = jSONObject.optString("refresh_token", null);
            zzahvVar.zzc = jSONObject.optString("access_token", null);
            zzahvVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzahvVar.zze = jSONObject.optString("token_type", null);
            zzahvVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzahvVar;
        } catch (JSONException e3) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzaao(e3);
        }
    }

    public final void zzc(String str) {
        this.zzb = AbstractC0643s.e(str);
    }

    public final String zzd() {
        return this.zzb;
    }

    zzahv(String str, String str2, Long l3, String str3, Long l4) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l3;
        this.zze = str3;
        this.zzf = l4;
    }
}
