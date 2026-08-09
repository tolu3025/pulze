package Q0;

import android.net.Uri;
import k0.C0992f;

/* JADX INFO: loaded from: classes.dex */
public class i extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Uri f2802m;

    public i(P0.h hVar, C0992f c0992f, Uri uri) {
        super(hVar, c0992f);
        this.f2802m = uri;
        super.G("X-Goog-Upload-Protocol", "resumable");
        super.G("X-Goog-Upload-Command", "query");
    }

    @Override // Q0.e
    protected String e() {
        return "POST";
    }

    @Override // Q0.e
    public Uri u() {
        return this.f2802m;
    }
}
