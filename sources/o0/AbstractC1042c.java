package o0;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1042c {
    private static Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return d(jSONObject);
            }
            return null;
        } catch (Exception e3) {
            C1041b.f().b("Failed to parse JSONObject into Map:\n" + e3);
            return Collections.emptyMap();
        }
    }

    public static Map b(String str) {
        C1041b c1041bF;
        StringBuilder sb;
        AbstractC0643s.e(str);
        String[] strArrSplit = str.split("\\.", -1);
        if (strArrSplit.length < 2) {
            c1041bF = C1041b.f();
            sb = new StringBuilder();
            sb.append("Invalid token (too few subsections):\n");
            sb.append(str);
        } else {
            try {
                Map mapA = a(new String(Base64.decode(strArrSplit[1], 11), "UTF-8"));
                return mapA == null ? Collections.emptyMap() : mapA;
            } catch (UnsupportedEncodingException e3) {
                c1041bF = C1041b.f();
                sb = new StringBuilder();
                sb.append("Unable to decode token (charset unknown):\n");
                sb.append(e3);
            }
        }
        c1041bF.d(sb.toString());
        return Collections.emptyMap();
    }

    private static List c(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            Object objD = jSONArray.get(i3);
            if (objD instanceof JSONArray) {
                objD = c((JSONArray) objD);
            } else if (objD instanceof JSONObject) {
                objD = d((JSONObject) objD);
            }
            arrayList.add(objD);
        }
        return arrayList;
    }

    private static Map d(JSONObject jSONObject) throws JSONException {
        androidx.collection.a aVar = new androidx.collection.a();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objD = jSONObject.get(next);
            if (objD instanceof JSONArray) {
                objD = c((JSONArray) objD);
            } else if (objD instanceof JSONObject) {
                objD = d((JSONObject) objD);
            } else if (objD.equals(JSONObject.NULL)) {
                objD = null;
            }
            aVar.put(next, objD);
        }
        return aVar;
    }
}
