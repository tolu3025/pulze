package Q0;

import k0.C0992f;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class k extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final JSONObject f2805m;

    public k(P0.h hVar, C0992f c0992f, JSONObject jSONObject) {
        super(hVar, c0992f);
        this.f2805m = jSONObject;
        G("X-HTTP-Method-Override", "PATCH");
    }

    @Override // Q0.e
    protected String e() {
        return "PUT";
    }

    @Override // Q0.e
    protected JSONObject g() {
        return this.f2805m;
    }
}
