package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends N.a implements a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final GoogleSignInOptions f5264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final GoogleSignInOptions f5265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Scope f5266s = new Scope("profile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Scope f5267t = new Scope("email");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Scope f5268u = new Scope("openid");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Scope f5269v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Scope f5270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Comparator f5271x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f5273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Account f5274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f5276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f5277f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f5278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f5279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList f5280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f5281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map f5282p;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Set f5283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f5285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f5286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f5287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Account f5288f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f5289g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f5290h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f5291i;

        public a() {
            this.f5283a = new HashSet();
            this.f5290h = new HashMap();
        }

        public GoogleSignInOptions a() {
            if (this.f5283a.contains(GoogleSignInOptions.f5270w)) {
                Set set = this.f5283a;
                Scope scope = GoogleSignInOptions.f5269v;
                if (set.contains(scope)) {
                    this.f5283a.remove(scope);
                }
            }
            if (this.f5286d && (this.f5288f == null || !this.f5283a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f5283a), this.f5288f, this.f5286d, this.f5284b, this.f5285c, this.f5287e, this.f5289g, this.f5290h, this.f5291i, null);
        }

        public a b() {
            this.f5283a.add(GoogleSignInOptions.f5268u);
            return this;
        }

        public a c() {
            this.f5283a.add(GoogleSignInOptions.f5266s);
            return this;
        }

        public a d(Scope scope, Scope... scopeArr) {
            this.f5283a.add(scope);
            this.f5283a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a e(String str) {
            this.f5291i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f5283a = new HashSet();
            this.f5290h = new HashMap();
            AbstractC0643s.k(googleSignInOptions);
            this.f5283a = new HashSet(googleSignInOptions.D());
            this.f5284b = googleSignInOptions.G();
            this.f5285c = googleSignInOptions.H();
            this.f5286d = googleSignInOptions.F();
            this.f5287e = googleSignInOptions.I();
            this.f5288f = googleSignInOptions.E();
            this.f5289g = googleSignInOptions.J();
            this.f5290h = GoogleSignInOptions.M(googleSignInOptions.K());
            this.f5291i = googleSignInOptions.L();
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f5269v = scope;
        f5270w = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.c();
        f5264q = aVar.a();
        a aVar2 = new a();
        aVar2.d(scope, new Scope[0]);
        f5265r = aVar2.a();
        CREATOR = new f();
        f5271x = new e();
    }

    GoogleSignInOptions(int i3, ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, ArrayList arrayList2, String str3) {
        this(i3, arrayList, account, z2, z3, z4, str, str2, M(arrayList2), str3);
    }

    public static GoogleSignInOptions A(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new Scope(jSONArray.getString(i3)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map M(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                K.a aVar = (K.a) it.next();
                map.put(Integer.valueOf(aVar.s()), aVar);
            }
        }
        return map;
    }

    public final String B() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f5273b;
            Collections.sort(arrayList, f5271x);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).s());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f5274c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f5275d);
            jSONObject.put("forceCodeForRefreshToken", this.f5277f);
            jSONObject.put("serverAuthRequested", this.f5276e);
            if (!TextUtils.isEmpty(this.f5278l)) {
                jSONObject.put("serverClientId", this.f5278l);
            }
            if (!TextUtils.isEmpty(this.f5279m)) {
                jSONObject.put("hostedDomain", this.f5279m);
            }
            return jSONObject.toString();
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }

    final /* synthetic */ ArrayList D() {
        return this.f5273b;
    }

    final /* synthetic */ Account E() {
        return this.f5274c;
    }

    final /* synthetic */ boolean F() {
        return this.f5275d;
    }

    final /* synthetic */ boolean G() {
        return this.f5276e;
    }

    final /* synthetic */ boolean H() {
        return this.f5277f;
    }

    final /* synthetic */ String I() {
        return this.f5278l;
    }

    final /* synthetic */ String J() {
        return this.f5279m;
    }

    final /* synthetic */ ArrayList K() {
        return this.f5280n;
    }

    final /* synthetic */ String L() {
        return this.f5281o;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[Catch: ClassCastException -> 0x008e, TryCatch #0 {ClassCastException -> 0x008e, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0033, B:17:0x0037, B:22:0x0048, B:24:0x0050, B:30:0x0068, B:32:0x0070, B:34:0x0078, B:36:0x0080, B:27:0x005b, B:20:0x003e), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b A[Catch: ClassCastException -> 0x008e, TryCatch #0 {ClassCastException -> 0x008e, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0033, B:17:0x0037, B:22:0x0048, B:24:0x0050, B:30:0x0068, B:32:0x0070, B:34:0x0078, B:36:0x0080, B:27:0x005b, B:20:0x003e), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r5 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r5     // Catch: java.lang.ClassCastException -> L8e
            java.util.ArrayList r1 = r4.f5280n     // Catch: java.lang.ClassCastException -> L8e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L8e
            if (r1 == 0) goto L8e
            java.util.ArrayList r1 = r5.f5280n     // Catch: java.lang.ClassCastException -> L8e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L8e
            if (r1 != 0) goto L18
            goto L8e
        L18:
            java.util.ArrayList r1 = r4.f5273b     // Catch: java.lang.ClassCastException -> L8e
            int r2 = r1.size()     // Catch: java.lang.ClassCastException -> L8e
            java.util.ArrayList r3 = r5.v()     // Catch: java.lang.ClassCastException -> L8e
            int r3 = r3.size()     // Catch: java.lang.ClassCastException -> L8e
            if (r2 != r3) goto L8e
            java.util.ArrayList r2 = r5.v()     // Catch: java.lang.ClassCastException -> L8e
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L8e
            if (r1 != 0) goto L33
            goto L8e
        L33:
            android.accounts.Account r1 = r4.f5274c     // Catch: java.lang.ClassCastException -> L8e
            if (r1 != 0) goto L3e
            android.accounts.Account r1 = r5.s()     // Catch: java.lang.ClassCastException -> L8e
            if (r1 != 0) goto L8e
            goto L48
        L3e:
            android.accounts.Account r2 = r5.s()     // Catch: java.lang.ClassCastException -> L8e
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L8e
            if (r1 == 0) goto L8e
        L48:
            java.lang.String r1 = r4.f5278l     // Catch: java.lang.ClassCastException -> L8e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L8e
            if (r1 == 0) goto L5b
            java.lang.String r1 = r5.w()     // Catch: java.lang.ClassCastException -> L8e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L8e
            if (r1 == 0) goto L8e
            goto L68
        L5b:
            java.lang.String r1 = r4.f5278l     // Catch: java.lang.ClassCastException -> L8e
            java.lang.String r2 = r5.w()     // Catch: java.lang.ClassCastException -> L8e
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L8e
            if (r1 != 0) goto L68
            goto L8e
        L68:
            boolean r1 = r4.f5277f     // Catch: java.lang.ClassCastException -> L8e
            boolean r2 = r5.x()     // Catch: java.lang.ClassCastException -> L8e
            if (r1 != r2) goto L8e
            boolean r1 = r4.f5275d     // Catch: java.lang.ClassCastException -> L8e
            boolean r2 = r5.y()     // Catch: java.lang.ClassCastException -> L8e
            if (r1 != r2) goto L8e
            boolean r1 = r4.f5276e     // Catch: java.lang.ClassCastException -> L8e
            boolean r2 = r5.z()     // Catch: java.lang.ClassCastException -> L8e
            if (r1 != r2) goto L8e
            java.lang.String r1 = r4.f5281o     // Catch: java.lang.ClassCastException -> L8e
            java.lang.String r5 = r5.u()     // Catch: java.lang.ClassCastException -> L8e
            boolean r5 = android.text.TextUtils.equals(r1, r5)     // Catch: java.lang.ClassCastException -> L8e
            if (r5 == 0) goto L8e
            r5 = 1
            return r5
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5273b;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((Scope) arrayList2.get(i3)).s());
        }
        Collections.sort(arrayList);
        K.b bVar = new K.b();
        bVar.a(arrayList);
        bVar.a(this.f5274c);
        bVar.a(this.f5278l);
        bVar.c(this.f5277f);
        bVar.c(this.f5275d);
        bVar.c(this.f5276e);
        bVar.a(this.f5281o);
        return bVar.b();
    }

    public Account s() {
        return this.f5274c;
    }

    public ArrayList t() {
        return this.f5280n;
    }

    public String u() {
        return this.f5281o;
    }

    public ArrayList v() {
        return new ArrayList(this.f5273b);
    }

    public String w() {
        return this.f5278l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.f5272a;
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, i4);
        N.c.G(parcel, 2, v(), false);
        N.c.A(parcel, 3, s(), i3, false);
        N.c.g(parcel, 4, y());
        N.c.g(parcel, 5, z());
        N.c.g(parcel, 6, x());
        N.c.C(parcel, 7, w(), false);
        N.c.C(parcel, 8, this.f5279m, false);
        N.c.G(parcel, 9, t(), false);
        N.c.C(parcel, 10, u(), false);
        N.c.b(parcel, iA);
    }

    public boolean x() {
        return this.f5277f;
    }

    public boolean y() {
        return this.f5275d;
    }

    public boolean z() {
        return this.f5276e;
    }

    private GoogleSignInOptions(int i3, ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, Map map, String str3) {
        this.f5272a = i3;
        this.f5273b = arrayList;
        this.f5274c = account;
        this.f5275d = z2;
        this.f5276e = z3;
        this.f5277f = z4;
        this.f5278l = str;
        this.f5279m = str2;
        this.f5280n = new ArrayList(map.values());
        this.f5282p = map;
        this.f5281o = str3;
    }

    /* synthetic */ GoogleSignInOptions(int i3, ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, Map map, String str3, byte[] bArr) {
        this(3, arrayList, account, z2, z3, z4, str, str2, map, str3);
    }
}
