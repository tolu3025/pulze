package q0;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.internal.p002firebaseauthapi.zzaib;
import com.google.firebase.auth.InterfaceC0674e0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: q0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1142e extends N.a implements InterfaceC0674e0 {
    public static final Parcelable.Creator<C1142e> CREATOR = new C1140d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f10707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uri f10708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f10709f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f10710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f10712n;

    public C1142e(zzahk zzahkVar, String str) {
        AbstractC0643s.k(zzahkVar);
        AbstractC0643s.e(str);
        this.f10704a = AbstractC0643s.e(zzahkVar.zzi());
        this.f10705b = str;
        this.f10709f = zzahkVar.zzh();
        this.f10706c = zzahkVar.zzg();
        Uri uriZzc = zzahkVar.zzc();
        if (uriZzc != null) {
            this.f10707d = uriZzc.toString();
            this.f10708e = uriZzc;
        }
        this.f10711m = zzahkVar.zzm();
        this.f10712n = null;
        this.f10710l = zzahkVar.zzj();
    }

    public static C1142e s(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C1142e(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e3) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzaao(e3);
        }
    }

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public final String a() {
        return this.f10704a;
    }

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public final Uri b() {
        if (!TextUtils.isEmpty(this.f10707d) && this.f10708e == null) {
            this.f10708e = Uri.parse(this.f10707d);
        }
        return this.f10708e;
    }

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public final String c() {
        return this.f10705b;
    }

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public final boolean d() {
        return this.f10711m;
    }

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public final String i() {
        return this.f10710l;
    }

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public final String m() {
        return this.f10709f;
    }

    @Override // com.google.firebase.auth.InterfaceC0674e0
    public final String p() {
        return this.f10706c;
    }

    public final String t() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f10704a);
            jSONObject.putOpt("providerId", this.f10705b);
            jSONObject.putOpt("displayName", this.f10706c);
            jSONObject.putOpt("photoUrl", this.f10707d);
            jSONObject.putOpt("email", this.f10709f);
            jSONObject.putOpt("phoneNumber", this.f10710l);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f10711m));
            jSONObject.putOpt("rawUserInfo", this.f10712n);
            return jSONObject.toString();
        } catch (JSONException e3) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzaao(e3);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, a(), false);
        N.c.C(parcel, 2, c(), false);
        N.c.C(parcel, 3, p(), false);
        N.c.C(parcel, 4, this.f10707d, false);
        N.c.C(parcel, 5, m(), false);
        N.c.C(parcel, 6, i(), false);
        N.c.g(parcel, 7, d());
        N.c.C(parcel, 8, this.f10712n, false);
        N.c.b(parcel, iA);
    }

    public final String zza() {
        return this.f10712n;
    }

    public C1142e(zzaib zzaibVar) {
        AbstractC0643s.k(zzaibVar);
        this.f10704a = zzaibVar.zzd();
        this.f10705b = AbstractC0643s.e(zzaibVar.zzf());
        this.f10706c = zzaibVar.zzb();
        Uri uriZza = zzaibVar.zza();
        if (uriZza != null) {
            this.f10707d = uriZza.toString();
            this.f10708e = uriZza;
        }
        this.f10709f = zzaibVar.zzc();
        this.f10710l = zzaibVar.zze();
        this.f10711m = false;
        this.f10712n = zzaibVar.zzg();
    }

    public C1142e(String str, String str2, String str3, String str4, String str5, String str6, boolean z2, String str7) {
        this.f10704a = str;
        this.f10705b = str2;
        this.f10709f = str3;
        this.f10710l = str4;
        this.f10706c = str5;
        this.f10707d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f10708e = Uri.parse(this.f10707d);
        }
        this.f10711m = z2;
        this.f10712n = str7;
    }
}
