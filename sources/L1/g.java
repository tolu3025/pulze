package l1;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f9777a = new g();

    private g() {
    }

    @Override // l1.l
    public ByteBuffer a(Object obj) {
        return f.f9776a.a(new JSONArray().put(h.a(obj)));
    }

    @Override // l1.l
    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        return f.f9776a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)).put(h.a(str3)));
    }

    @Override // l1.l
    public ByteBuffer c(String str, String str2, Object obj) {
        return f.f9776a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)));
    }

    @Override // l1.l
    public ByteBuffer d(j jVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", jVar.f9778a);
            jSONObject.put("args", h.a(jVar.f9779b));
            return f.f9776a.a(jSONObject);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // l1.l
    public j e(ByteBuffer byteBuffer) {
        try {
            Object objB = f.f9776a.b(byteBuffer);
            if (objB instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objB;
                Object obj = jSONObject.get("method");
                Object objG = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new j((String) obj, objG);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + objB);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // l1.l
    public Object f(ByteBuffer byteBuffer) {
        try {
            Object objB = f.f9776a.b(byteBuffer);
            if (objB instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objB;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object objG = g(jSONArray.opt(1));
                    Object objG2 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (objG == null || (objG instanceof String))) {
                        throw new e((String) obj, (String) objG, objG2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + objB);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
