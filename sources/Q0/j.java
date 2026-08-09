package Q0;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import k0.C0992f;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final JSONObject f2803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2804n;

    public j(P0.h hVar, C0992f c0992f, JSONObject jSONObject, String str) {
        super(hVar, c0992f);
        this.f2803m = jSONObject;
        this.f2804n = str;
        if (TextUtils.isEmpty(str)) {
            this.f2785a = new IllegalArgumentException("mContentType is null or empty");
        }
        super.G("X-Goog-Upload-Protocol", "resumable");
        super.G("X-Goog-Upload-Command", "start");
        super.G("X-Goog-Upload-Header-Content-Type", str);
    }

    @Override // Q0.e
    protected String e() {
        return "POST";
    }

    @Override // Q0.e
    protected JSONObject g() {
        return this.f2803m;
    }

    @Override // Q0.e
    protected Map l() {
        HashMap map = new HashMap();
        map.put("name", j());
        map.put("uploadType", "resumable");
        return map;
    }

    @Override // Q0.e
    public Uri u() {
        String authority = s().a().getAuthority();
        Uri.Builder builderBuildUpon = s().b().buildUpon();
        builderBuildUpon.appendPath("b");
        builderBuildUpon.appendPath(authority);
        builderBuildUpon.appendPath("o");
        return builderBuildUpon.build();
    }
}
