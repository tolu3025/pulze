package com.google.firebase.storage;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0771f f6583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p f6584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f6585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f6586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f6587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f6588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f6589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f6590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f6591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f6592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f6593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f6594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f6595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f6596o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private c f6597p;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        o f6598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f6599b;

        public b() {
            this.f6598a = new o();
        }

        private String b(JSONObject jSONObject, String str) {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        }

        private void c(JSONObject jSONObject) throws JSONException {
            this.f6598a.f6586e = jSONObject.optString("generation");
            this.f6598a.f6582a = jSONObject.optString("name");
            this.f6598a.f6585d = jSONObject.optString("bucket");
            this.f6598a.f6588g = jSONObject.optString("metageneration");
            this.f6598a.f6589h = jSONObject.optString("timeCreated");
            this.f6598a.f6590i = jSONObject.optString("updated");
            this.f6598a.f6591j = jSONObject.optLong("size");
            this.f6598a.f6592k = jSONObject.optString("md5Hash");
            if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    i(next, jSONObject2.getString(next));
                }
            }
            String strB = b(jSONObject, "contentType");
            if (strB != null) {
                h(strB);
            }
            String strB2 = b(jSONObject, "cacheControl");
            if (strB2 != null) {
                d(strB2);
            }
            String strB3 = b(jSONObject, "contentDisposition");
            if (strB3 != null) {
                e(strB3);
            }
            String strB4 = b(jSONObject, "contentEncoding");
            if (strB4 != null) {
                f(strB4);
            }
            String strB5 = b(jSONObject, "contentLanguage");
            if (strB5 != null) {
                g(strB5);
            }
        }

        public o a() {
            return new o(this.f6599b);
        }

        public b d(String str) {
            this.f6598a.f6593l = c.d(str);
            return this;
        }

        public b e(String str) {
            this.f6598a.f6594m = c.d(str);
            return this;
        }

        public b f(String str) {
            this.f6598a.f6595n = c.d(str);
            return this;
        }

        public b g(String str) {
            this.f6598a.f6596o = c.d(str);
            return this;
        }

        public b h(String str) {
            this.f6598a.f6587f = c.d(str);
            return this;
        }

        public b i(String str, String str2) {
            if (!this.f6598a.f6597p.b()) {
                this.f6598a.f6597p = c.d(new HashMap());
            }
            ((Map) this.f6598a.f6597p.a()).put(str, str2);
            return this;
        }

        b(JSONObject jSONObject) throws JSONException {
            this.f6598a = new o();
            if (jSONObject != null) {
                c(jSONObject);
                this.f6599b = true;
            }
        }

        b(JSONObject jSONObject, p pVar) {
            this(jSONObject);
            this.f6598a.f6584c = pVar;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f6600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f6601b;

        c(Object obj, boolean z2) {
            this.f6600a = z2;
            this.f6601b = obj;
        }

        static c c(Object obj) {
            return new c(obj, false);
        }

        static c d(Object obj) {
            return new c(obj, true);
        }

        Object a() {
            return this.f6601b;
        }

        boolean b() {
            return this.f6600a;
        }
    }

    public o() {
        this.f6582a = null;
        this.f6583b = null;
        this.f6584c = null;
        this.f6585d = null;
        this.f6586e = null;
        this.f6587f = c.c("");
        this.f6588g = null;
        this.f6589h = null;
        this.f6590i = null;
        this.f6592k = null;
        this.f6593l = c.c("");
        this.f6594m = c.c("");
        this.f6595n = c.c("");
        this.f6596o = c.c("");
        this.f6597p = c.c(Collections.emptyMap());
    }

    public String A() {
        return this.f6586e;
    }

    public String B() {
        return this.f6592k;
    }

    public String C() {
        return this.f6588g;
    }

    public String D() {
        String strE = E();
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        int iLastIndexOf = strE.lastIndexOf(47);
        return iLastIndexOf != -1 ? strE.substring(iLastIndexOf + 1) : strE;
    }

    public String E() {
        String str = this.f6582a;
        return str != null ? str : "";
    }

    public long F() {
        return this.f6591j;
    }

    public long G() {
        return P0.i.e(this.f6590i);
    }

    JSONObject q() {
        HashMap map = new HashMap();
        if (this.f6587f.b()) {
            map.put("contentType", w());
        }
        if (this.f6597p.b()) {
            map.put("metadata", new JSONObject((Map) this.f6597p.a()));
        }
        if (this.f6593l.b()) {
            map.put("cacheControl", s());
        }
        if (this.f6594m.b()) {
            map.put("contentDisposition", t());
        }
        if (this.f6595n.b()) {
            map.put("contentEncoding", u());
        }
        if (this.f6596o.b()) {
            map.put("contentLanguage", v());
        }
        return new JSONObject(map);
    }

    public String r() {
        return this.f6585d;
    }

    public String s() {
        return (String) this.f6593l.a();
    }

    public String t() {
        return (String) this.f6594m.a();
    }

    public String u() {
        return (String) this.f6595n.a();
    }

    public String v() {
        return (String) this.f6596o.a();
    }

    public String w() {
        return (String) this.f6587f.a();
    }

    public long x() {
        return P0.i.e(this.f6589h);
    }

    public String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (String) ((Map) this.f6597p.a()).get(str);
    }

    public Set z() {
        return ((Map) this.f6597p.a()).keySet();
    }

    private o(o oVar, boolean z2) {
        this.f6582a = null;
        this.f6583b = null;
        this.f6584c = null;
        this.f6585d = null;
        this.f6586e = null;
        this.f6587f = c.c("");
        this.f6588g = null;
        this.f6589h = null;
        this.f6590i = null;
        this.f6592k = null;
        this.f6593l = c.c("");
        this.f6594m = c.c("");
        this.f6595n = c.c("");
        this.f6596o = c.c("");
        this.f6597p = c.c(Collections.emptyMap());
        AbstractC0643s.k(oVar);
        this.f6582a = oVar.f6582a;
        this.f6583b = oVar.f6583b;
        this.f6584c = oVar.f6584c;
        this.f6585d = oVar.f6585d;
        this.f6587f = oVar.f6587f;
        this.f6593l = oVar.f6593l;
        this.f6594m = oVar.f6594m;
        this.f6595n = oVar.f6595n;
        this.f6596o = oVar.f6596o;
        this.f6597p = oVar.f6597p;
        if (z2) {
            this.f6592k = oVar.f6592k;
            this.f6591j = oVar.f6591j;
            this.f6590i = oVar.f6590i;
            this.f6589h = oVar.f6589h;
            this.f6588g = oVar.f6588g;
            this.f6586e = oVar.f6586e;
        }
    }
}
