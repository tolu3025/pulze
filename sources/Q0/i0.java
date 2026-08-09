package q0;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f10745a;

    static {
        HashMap map = new HashMap();
        f10745a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(Intent intent) {
        AbstractC0643s.k(intent);
        AbstractC0643s.a(d(intent));
        return (Status) N.e.b(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    public static Status b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map map = f10745a;
                if (map.containsKey(string)) {
                    return r.a(((String) map.get(string)) + ":" + string2);
                }
            }
            return r.a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e3) {
            return r.a("WEB_INTERNAL_ERROR:" + str + "[ " + e3.getLocalizedMessage() + " ]");
        }
    }

    public static void c(Intent intent, Status status) {
        N.e.e(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean d(Intent intent) {
        AbstractC0643s.k(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}
