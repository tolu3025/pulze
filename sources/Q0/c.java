package Q0;

import java.util.Collections;
import java.util.Map;
import k0.C0992f;

/* JADX INFO: loaded from: classes.dex */
public class c extends e {
    public c(P0.h hVar, C0992f c0992f, long j3) {
        super(hVar, c0992f);
        if (j3 != 0) {
            super.G("Range", "bytes=" + j3 + "-");
        }
    }

    @Override // Q0.e
    protected String e() {
        return "GET";
    }

    @Override // Q0.e
    protected Map l() {
        return Collections.singletonMap("alt", "media");
    }
}
