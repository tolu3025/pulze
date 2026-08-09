package n0;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.Map;
import m0.AbstractC1027a;
import o0.AbstractC1042c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: n0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1036a extends AbstractC1027a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f9910d = "n0.a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f9913c;

    C1036a(String str, long j3, long j4) {
        AbstractC0643s.e(str);
        this.f9911a = str;
        this.f9913c = j3;
        this.f9912b = j4;
    }

    public static C1036a c(String str) {
        AbstractC0643s.k(str);
        Map mapB = AbstractC1042c.b(str);
        long jE = e(mapB, "iat");
        return new C1036a(str, (e(mapB, "exp") - jE) * 1000, jE * 1000);
    }

    static C1036a d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C1036a(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e3) {
            Log.e(f9910d, "Could not deserialize token: " + e3.getMessage());
            return null;
        }
    }

    private static long e(Map map, String str) {
        AbstractC0643s.k(map);
        AbstractC0643s.e(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @Override // m0.AbstractC1027a
    public long a() {
        return this.f9912b + this.f9913c;
    }

    @Override // m0.AbstractC1027a
    public String b() {
        return this.f9911a;
    }
}
