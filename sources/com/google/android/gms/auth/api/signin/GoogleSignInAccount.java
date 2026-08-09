package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends N.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.google.android.gms.common.util.d f5251r = com.google.android.gms.common.util.f.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f5256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f5257f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f5258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f5259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final List f5260n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f5261o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f5262p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Set f5263q = new HashSet();

    GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j3, String str6, List list, String str7, String str8) {
        this.f5252a = str;
        this.f5253b = str2;
        this.f5254c = str3;
        this.f5255d = str4;
        this.f5256e = uri;
        this.f5257f = str5;
        this.f5258l = j3;
        this.f5259m = str6;
        this.f5260n = list;
        this.f5261o = str7;
        this.f5262p = str8;
    }

    public static GoogleSignInAccount y(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j3 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new Scope(jSONArray.getString(i3)));
        }
        GoogleSignInAccount googleSignInAccountZ = z(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j3), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountZ.f5257f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountZ;
    }

    public static GoogleSignInAccount z(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l3, String str7, Set set) {
        return new GoogleSignInAccount(str, str2, str3, str4, uri, null, l3.longValue(), AbstractC0643s.e(str7), new ArrayList((Collection) AbstractC0643s.k(set)), str5, str6);
    }

    public final String A() {
        return this.f5259m;
    }

    public final String B() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (u() != null) {
                jSONObject.put("id", u());
            }
            if (v() != null) {
                jSONObject.put("tokenId", v());
            }
            if (m() != null) {
                jSONObject.put("email", m());
            }
            if (p() != null) {
                jSONObject.put("displayName", p());
            }
            if (t() != null) {
                jSONObject.put("givenName", t());
            }
            if (s() != null) {
                jSONObject.put("familyName", s());
            }
            Uri uriB = b();
            if (uriB != null) {
                jSONObject.put("photoUrl", uriB.toString());
            }
            if (x() != null) {
                jSONObject.put("serverAuthCode", x());
            }
            jSONObject.put("expirationTime", this.f5258l);
            jSONObject.put("obfuscatedIdentifier", this.f5259m);
            JSONArray jSONArray = new JSONArray();
            List list = this.f5260n;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, c.f5297a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.s());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }

    public Uri b() {
        return this.f5256e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f5259m.equals(this.f5259m) && googleSignInAccount.w().equals(w());
    }

    public int hashCode() {
        return ((this.f5259m.hashCode() + 527) * 31) + w().hashCode();
    }

    public String m() {
        return this.f5254c;
    }

    public String p() {
        return this.f5255d;
    }

    public String s() {
        return this.f5262p;
    }

    public String t() {
        return this.f5261o;
    }

    public String u() {
        return this.f5252a;
    }

    public String v() {
        return this.f5253b;
    }

    public Set w() {
        HashSet hashSet = new HashSet(this.f5260n);
        hashSet.addAll(this.f5263q);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 2, u(), false);
        N.c.C(parcel, 3, v(), false);
        N.c.C(parcel, 4, m(), false);
        N.c.C(parcel, 5, p(), false);
        N.c.A(parcel, 6, b(), i3, false);
        N.c.C(parcel, 7, x(), false);
        N.c.v(parcel, 8, this.f5258l);
        N.c.C(parcel, 9, this.f5259m, false);
        N.c.G(parcel, 10, this.f5260n, false);
        N.c.C(parcel, 11, t(), false);
        N.c.C(parcel, 12, s(), false);
        N.c.b(parcel, iA);
    }

    public String x() {
        return this.f5257f;
    }
}
