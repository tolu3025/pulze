package Q0;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import k0.C0992f;

/* JADX INFO: loaded from: classes.dex */
public class d extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Integer f2781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2782n;

    public d(P0.h hVar, C0992f c0992f, Integer num, String str) {
        super(hVar, c0992f);
        this.f2781m = num;
        this.f2782n = str;
    }

    @Override // Q0.e
    protected String e() {
        return "GET";
    }

    @Override // Q0.e
    protected Map l() {
        HashMap map = new HashMap();
        String strJ = j();
        if (!strJ.isEmpty()) {
            map.put("prefix", strJ + "/");
        }
        map.put("delimiter", "/");
        Integer num = this.f2781m;
        if (num != null) {
            map.put("maxResults", Integer.toString(num.intValue()));
        }
        if (!TextUtils.isEmpty(this.f2782n)) {
            map.put("pageToken", this.f2782n);
        }
        return map;
    }

    @Override // Q0.e
    public Uri u() {
        return Uri.parse(s().b() + "/b/" + s().a().getAuthority() + "/o");
    }
}
