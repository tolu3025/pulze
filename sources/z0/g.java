package z0;

import A0.C0203c0;
import A0.C0211i;
import A0.C0218p;
import A0.f0;
import D0.l;
import D0.r;
import D0.s;
import D0.t;
import D0.u;
import D0.w;
import D0.z;
import I0.P;
import V0.C0423b;
import V0.I;
import V0.x;
import a1.C0473a;
import android.util.Base64;
import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.e0;
import com.google.protobuf.t0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import k0.C1004r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SimpleDateFormat f12092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P f12093b;

    public g(P p2) {
        this.f12093b = p2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.f12092a = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    private void A(List list, JSONObject jSONObject) throws JSONException {
        r rVarJ;
        String string;
        C0218p.b bVar;
        I i3;
        rVarJ = j(jSONObject.getJSONObject("field"));
        string = jSONObject.getString("op");
        string.hashCode();
        switch (string) {
            case "IS_NAN":
                bVar = C0218p.b.EQUAL;
                i3 = z.f1309b;
                list.add(C0218p.e(rVarJ, bVar, i3));
                return;
            case "IS_NULL":
                bVar = C0218p.b.EQUAL;
                i3 = z.f1310c;
                list.add(C0218p.e(rVarJ, bVar, i3));
                return;
            case "IS_NOT_NAN":
                bVar = C0218p.b.NOT_EQUAL;
                i3 = z.f1309b;
                list.add(C0218p.e(rVarJ, bVar, i3));
                return;
            case "IS_NOT_NULL":
                bVar = C0218p.b.NOT_EQUAL;
                i3 = z.f1310c;
                list.add(C0218p.e(rVarJ, bVar, i3));
                return;
            default:
                throw new IllegalArgumentException("Unexpected unary filter: " + string);
        }
    }

    private I B(JSONObject jSONObject) {
        I.b bVarJ0 = I.J0();
        if (jSONObject.has("nullValue")) {
            bVarJ0.I(e0.NULL_VALUE);
        } else if (jSONObject.has("booleanValue")) {
            bVarJ0.z(jSONObject.optBoolean("booleanValue", false));
        } else if (jSONObject.has("integerValue")) {
            bVarJ0.F(jSONObject.optLong("integerValue"));
        } else if (jSONObject.has("doubleValue")) {
            bVarJ0.B(jSONObject.optDouble("doubleValue"));
        } else if (jSONObject.has("timestampValue")) {
            y(bVarJ0, jSONObject.get("timestampValue"));
        } else if (jSONObject.has("stringValue")) {
            bVarJ0.L(jSONObject.optString("stringValue", ""));
        } else if (jSONObject.has("bytesValue")) {
            bVarJ0.A(AbstractC0791i.p(Base64.decode(jSONObject.getString("bytesValue"), 0)));
        } else if (jSONObject.has("referenceValue")) {
            bVarJ0.K(jSONObject.getString("referenceValue"));
        } else if (jSONObject.has("geoPointValue")) {
            l(bVarJ0, jSONObject.getJSONObject("geoPointValue"));
        } else if (jSONObject.has("arrayValue")) {
            a(bVarJ0, jSONObject.getJSONObject("arrayValue").optJSONArray("values"));
        } else {
            if (!jSONObject.has("mapValue")) {
                throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
            }
            o(bVarJ0, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
        }
        return (I) bVarJ0.n();
    }

    private List C(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            k(arrayList, jSONObject);
        }
        return arrayList;
    }

    private static int D(String str) {
        int iCharAt = 0;
        for (int i3 = 0; i3 < 9; i3++) {
            iCharAt *= 10;
            if (i3 < str.length()) {
                if (str.charAt(i3) < '0' || str.charAt(i3) > '9') {
                    throw new IllegalArgumentException("Invalid nanoseconds: " + str);
                }
                iCharAt += str.charAt(i3) - '0';
            }
        }
        return iCharAt;
    }

    private void E(JSONArray jSONArray) {
        if (jSONArray.length() != 1) {
            throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
        }
    }

    private void F(JSONObject jSONObject) {
        if (jSONObject.has("offset")) {
            throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
        }
    }

    private void G(JSONObject jSONObject) {
        if (jSONObject.has("select")) {
            throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
        }
    }

    private void a(I.b bVar, JSONArray jSONArray) {
        C0423b.C0068b c0068bJ0 = C0423b.j0();
        if (jSONArray != null) {
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                c0068bJ0.x(B(jSONArray.getJSONObject(i3)));
            }
        }
        bVar.x(c0068bJ0);
    }

    private i d(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("structuredQuery");
        G(jSONObject2);
        u uVarP = p(jSONObject.getString("parent"));
        JSONArray jSONArray = jSONObject2.getJSONArray("from");
        E(jSONArray);
        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
        boolean zOptBoolean = jSONObject3.optBoolean("allDescendants", false);
        String string = jSONObject3.getString("collectionId");
        if (!zOptBoolean) {
            uVarP = (u) uVarP.m(string);
            string = null;
        }
        u uVar = uVarP;
        String str = string;
        List listC = C(jSONObject2.optJSONObject("where"));
        List listR = r(jSONObject2.optJSONArray("orderBy"));
        C0211i c0211iU = u(jSONObject2.optJSONObject("startAt"));
        C0211i c0211iG = g(jSONObject2.optJSONObject("endAt"));
        F(jSONObject2);
        return new i(new f0(uVar, str, listC, listR, m(jSONObject2), f0.a.LIMIT_TO_FIRST, c0211iU, c0211iG).D(), n(jSONObject));
    }

    private void e(List list, JSONObject jSONObject) {
        if (!jSONObject.getString("op").equals("AND")) {
            throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("filters");
        if (jSONArrayOptJSONArray != null) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                k(list, jSONArrayOptJSONArray.getJSONObject(i3));
            }
        }
    }

    private C0211i g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C0211i(s(jSONObject), !jSONObject.optBoolean("before", false));
    }

    private void h(List list, JSONObject jSONObject) {
        list.add(C0218p.e(j(jSONObject.getJSONObject("field")), i(jSONObject.getString("op")), B(jSONObject.getJSONObject("value"))));
    }

    private C0218p.b i(String str) {
        return C0218p.b.valueOf(str);
    }

    private r j(JSONObject jSONObject) {
        return r.B(jSONObject.getString("fieldPath"));
    }

    private void k(List list, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("compositeFilter")) {
            e(list, jSONObject.getJSONObject("compositeFilter"));
        } else if (jSONObject.has("fieldFilter")) {
            h(list, jSONObject.getJSONObject("fieldFilter"));
        } else if (jSONObject.has("unaryFilter")) {
            A(list, jSONObject.getJSONObject("unaryFilter"));
        }
    }

    private void l(I.b bVar, JSONObject jSONObject) {
        bVar.E(C0473a.f0().w(jSONObject.optDouble("latitude")).x(jSONObject.optDouble("longitude")));
    }

    private int m(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("limit");
        return jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("value", -1) : jSONObject.optInt("limit", -1);
    }

    private f0.a n(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("limitType", "FIRST");
        if (strOptString.equals("FIRST")) {
            return f0.a.LIMIT_TO_FIRST;
        }
        if (strOptString.equals("LAST")) {
            return f0.a.LIMIT_TO_LAST;
        }
        throw new IllegalArgumentException("Invalid limit type for bundle query: " + strOptString);
    }

    private void o(I.b bVar, JSONObject jSONObject) {
        x.b bVarJ0 = x.j0();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bVarJ0.y(next, B(jSONObject.getJSONObject(next)));
            }
        }
        bVar.G(bVarJ0);
    }

    private u p(String str) {
        u uVarB = u.B(str);
        if (this.f12093b.j0(uVarB)) {
            return (u) uVarB.x(5);
        }
        throw new IllegalArgumentException("Resource name is not valid for current instance: " + str);
    }

    private List r(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                arrayList.add(C0203c0.d(jSONObject.optString("direction", "ASCENDING").equals("ASCENDING") ? C0203c0.a.ASCENDING : C0203c0.a.DESCENDING, j(jSONObject.getJSONObject("field"))));
            }
        }
        return arrayList;
    }

    private List s(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
        if (jSONArrayOptJSONArray != null) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                arrayList.add(B(jSONArrayOptJSONArray.getJSONObject(i3)));
            }
        }
        return arrayList;
    }

    private w t(Object obj) {
        return new w(v(obj));
    }

    private C0211i u(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C0211i(s(jSONObject), jSONObject.optBoolean("before", false));
    }

    private C1004r v(Object obj) {
        if (obj instanceof String) {
            return w((String) obj);
        }
        if (obj instanceof JSONObject) {
            return x((JSONObject) obj);
        }
        throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
    }

    private C1004r w(String str) {
        try {
            int iIndexOf = str.indexOf(84);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Invalid timestamp: " + str);
            }
            int iIndexOf2 = str.indexOf(90, iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(43, iIndexOf);
            }
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(45, iIndexOf);
            }
            if (iIndexOf2 == -1) {
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: " + str);
            }
            int iD = 0;
            String strSubstring = str.substring(0, iIndexOf2);
            String strSubstring2 = "";
            int iIndexOf3 = strSubstring.indexOf(46);
            if (iIndexOf3 != -1) {
                String strSubstring3 = strSubstring.substring(0, iIndexOf3);
                strSubstring2 = strSubstring.substring(iIndexOf3 + 1);
                strSubstring = strSubstring3;
            }
            long time = this.f12092a.parse(strSubstring).getTime() / 1000;
            if (!strSubstring2.isEmpty()) {
                iD = D(strSubstring2);
            }
            if (str.charAt(iIndexOf2) != 'Z') {
                long jZ = z(str.substring(iIndexOf2 + 1));
                time = str.charAt(iIndexOf2) == '+' ? time - jZ : time + jZ;
            } else if (str.length() != iIndexOf2 + 1) {
                throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(iIndexOf2) + "\"");
            }
            return new C1004r(time, iD);
        } catch (ParseException e3) {
            throw new IllegalArgumentException("Failed to parse timestamp", e3);
        }
    }

    private C1004r x(JSONObject jSONObject) {
        return new C1004r(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
    }

    private void y(I.b bVar, Object obj) {
        C1004r c1004rV = v(obj);
        bVar.M(t0.f0().x(c1004rV.l()).w(c1004rV.i()));
    }

    private static long z(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf != -1) {
            return ((Long.parseLong(str.substring(0, iIndexOf)) * 60) + Long.parseLong(str.substring(iIndexOf + 1))) * 60;
        }
        throw new IllegalArgumentException("Invalid offset value: " + str);
    }

    public e b(JSONObject jSONObject) {
        return new e(jSONObject.getString("id"), jSONObject.getInt("version"), t(jSONObject.get("createTime")), jSONObject.getInt("totalDocuments"), jSONObject.getLong("totalBytes"));
    }

    public h c(JSONObject jSONObject) {
        l lVarJ = l.j(p(jSONObject.getString("name")));
        w wVarT = t(jSONObject.get("readTime"));
        boolean zOptBoolean = jSONObject.optBoolean("exists", false);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("queries");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i3));
            }
        }
        return new h(lVarJ, wVarT, zOptBoolean, arrayList);
    }

    b f(JSONObject jSONObject) {
        l lVarJ = l.j(p(jSONObject.getString("name")));
        w wVarT = t(jSONObject.get("updateTime"));
        I.b bVarJ0 = I.J0();
        o(bVarJ0, jSONObject.getJSONObject("fields"));
        return new b(s.q(lVarJ, wVarT, t.h(bVarJ0.w().d0())));
    }

    public j q(JSONObject jSONObject) {
        return new j(jSONObject.getString("name"), d(jSONObject.getJSONObject("bundledQuery")), t(jSONObject.get("readTime")));
    }
}
