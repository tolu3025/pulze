package Q0;

import android.net.Uri;
import k0.C0992f;

/* JADX INFO: loaded from: classes.dex */
public class h extends f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f2800n = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Uri f2801m;

    public h(P0.h hVar, C0992f c0992f, Uri uri) {
        super(hVar, c0992f);
        f2800n = true;
        this.f2801m = uri;
        super.G("X-Goog-Upload-Protocol", "resumable");
        super.G("X-Goog-Upload-Command", "cancel");
    }

    @Override // Q0.e
    protected String e() {
        return "POST";
    }

    @Override // Q0.e
    public Uri u() {
        return this.f2801m;
    }
}
