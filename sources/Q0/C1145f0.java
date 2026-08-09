package q0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.auth.C0666a0;
import com.google.firebase.auth.C0703t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k0.C0992f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: q0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1145f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f10722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private P.a f10723d;

    public C1145f0(Context context, String str) {
        AbstractC0643s.k(context);
        this.f10721b = AbstractC0643s.e(str);
        this.f10720a = context.getApplicationContext();
        this.f10722c = this.f10720a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f10721b), 0);
        this.f10723d = new P.a("StorageHelpers", new String[0]);
    }

    private final String c(String str) {
        String string = this.f10722c.getString(str, null);
        if (string != null) {
            return string.startsWith("ENCRYPTED:") ? C1137b0.b(this.f10720a, this.f10721b).a(string.substring(10)) : string;
        }
        return null;
    }

    private final C1150i d(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        C1152k c1152kB;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z2 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i3 = 0; i3 < length; i3++) {
                arrayList.add(C1142e.s(jSONArray3.getString(i3)));
            }
            C1150i c1150i = new C1150i(C0992f.p(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                c1150i.P(zzahv.zzb(string));
            }
            if (!z2) {
                c1150i.Q();
            }
            c1150i.W(str);
            if (jSONObject.has("userMetadata") && (c1152kB = C1152k.b(jSONObject.getJSONObject("userMetadata"))) != null) {
                c1150i.Y(c1152kB);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i4));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? com.google.firebase.auth.U.v(jSONObject2) : Objects.equals(strOptString, "totp") ? C0666a0.v(jSONObject2) : null);
                }
                c1150i.T(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    arrayList3.add(C0703t0.t(new JSONObject(jSONArray.getString(i5))));
                }
                c1150i.R(arrayList3);
            }
            return c1150i;
        } catch (zzaao e3) {
            e = e3;
            this.f10723d.j(e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e4) {
            e = e4;
            this.f10723d.j(e);
            return null;
        } catch (IllegalArgumentException e5) {
            e = e5;
            this.f10723d.j(e);
            return null;
        } catch (JSONException e6) {
            e = e6;
            this.f10723d.j(e);
            return null;
        }
    }

    private final void f(String str, String str2) {
        String strD = C1137b0.b(this.f10720a, this.f10721b).d(str2);
        if (strD != null) {
            this.f10722c.edit().putString(str, "ENCRYPTED:" + strD).apply();
        }
    }

    private final void i(String str) {
        this.f10722c.edit().remove(str).apply();
    }

    private final String k(com.google.firebase.auth.A a3) {
        JSONObject jSONObject = new JSONObject();
        if (!(a3 instanceof C1150i)) {
            return null;
        }
        C1150i c1150i = (C1150i) a3;
        try {
            jSONObject.put("cachedTokenState", c1150i.zze());
            jSONObject.put("applicationName", c1150i.O().q());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (c1150i.c0() != null) {
                JSONArray jSONArray = new JSONArray();
                List listC0 = c1150i.c0();
                int size = listC0.size();
                if (listC0.size() > 30) {
                    this.f10723d.h("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(listC0.size()));
                    size = 30;
                }
                boolean z2 = false;
                for (int i3 = 0; i3 < size; i3++) {
                    C1142e c1142e = (C1142e) listC0.get(i3);
                    if (c1142e.c().equals("firebase")) {
                        z2 = true;
                    }
                    if (i3 == size - 1 && !z2) {
                        break;
                    }
                    jSONArray.put(c1142e.t());
                }
                if (!z2) {
                    for (int i4 = size - 1; i4 < listC0.size() && i4 >= 0; i4++) {
                        C1142e c1142e2 = (C1142e) listC0.get(i4);
                        if (c1142e2.c().equals("firebase")) {
                            jSONArray.put(c1142e2.t());
                            break;
                        }
                        if (i4 == listC0.size() - 1) {
                            jSONArray.put(c1142e2.t());
                        }
                    }
                    if (!z2) {
                        this.f10723d.h("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(listC0.size()), Integer.valueOf(size));
                        if (listC0.size() < 5) {
                            StringBuilder sb = new StringBuilder("Provider user info list:\n");
                            Iterator it = listC0.iterator();
                            while (it.hasNext()) {
                                sb.append(String.format("Provider - %s\n", ((C1142e) it.next()).c()));
                            }
                            this.f10723d.h(sb.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", c1150i.y());
            jSONObject.put("version", "2");
            if (c1150i.u() != null) {
                jSONObject.put("userMetadata", ((C1152k) c1150i.u()).a());
            }
            List listB = ((C1154m) c1150i.v()).b();
            if (listB != null && !listB.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i5 = 0; i5 < listB.size(); i5++) {
                    jSONArray2.put(((com.google.firebase.auth.J) listB.get(i5)).u());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            List listU = c1150i.U();
            if (listU != null && !listU.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i6 = 0; i6 < listU.size(); i6++) {
                    jSONArray3.put(C0703t0.u((C0703t0) listU.get(i6)));
                }
                jSONObject.put("passkeyInfo", jSONArray3);
            }
            return jSONObject.toString();
        } catch (Exception e3) {
            this.f10723d.i("Failed to turn object into JSON", e3, new Object[0]);
            throw new zzaao(e3);
        }
    }

    public final zzahv a(com.google.firebase.auth.A a3) {
        AbstractC0643s.k(a3);
        String strC = c(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a3.a()));
        if (strC == null) {
            return null;
        }
        try {
            return zzahv.zzb(strC);
        } catch (zzaao unused) {
            this.f10723d.e("Failed to restore token data from persistent storage.", new Object[0]);
            return null;
        }
    }

    public final com.google.firebase.auth.A b() {
        String strC = c("com.google.firebase.auth.FIREBASE_USER");
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strC);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return d(jSONObject);
            }
        } catch (Exception unused) {
            this.f10723d.e("Failed to restore user data from persistent storage.", new Object[0]);
        }
        return null;
    }

    public final void e(com.google.firebase.auth.A a3, zzahv zzahvVar) {
        AbstractC0643s.k(a3);
        AbstractC0643s.k(zzahvVar);
        f(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a3.a()), zzahvVar.zzf());
    }

    public final void g() {
        i("com.google.firebase.auth.FIREBASE_USER");
    }

    public final void h(com.google.firebase.auth.A a3) {
        AbstractC0643s.k(a3);
        i(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a3.a()));
    }

    public final void j(com.google.firebase.auth.A a3) {
        AbstractC0643s.k(a3);
        String strK = k(a3);
        if (TextUtils.isEmpty(strK)) {
            return;
        }
        f("com.google.firebase.auth.FIREBASE_USER", strK);
    }
}
