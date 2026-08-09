package q0;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzt;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: q0.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1133K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final P.a f10654a = new P.a("JSONParser", new String[0]);

    private static List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            Object objC = jSONArray.get(i3);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static Map b(String str) {
        AbstractC0643s.e(str);
        List<String> listZza = zzt.zza('.').zza((CharSequence) str);
        if (listZza.size() < 2) {
            f10654a.c("Invalid idToken " + str, new Object[0]);
            return new HashMap();
        }
        try {
            Map mapD = d(new String(com.google.android.gms.common.util.c.b(listZza.get(1)), "UTF-8"));
            return mapD == null ? new HashMap() : mapD;
        } catch (UnsupportedEncodingException e3) {
            f10654a.b("Unable to decode token", e3, new Object[0]);
            return new HashMap();
        }
    }

    private static Map c(JSONObject jSONObject) throws JSONException {
        androidx.collection.a aVar = new androidx.collection.a();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objC = jSONObject.get(next);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            aVar.put(next, objC);
        }
        return aVar;
    }

    public static Map d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e3) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzaao(e3);
        }
    }
}
