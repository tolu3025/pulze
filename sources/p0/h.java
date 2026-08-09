package P0;

import android.net.Uri;
import w0.C1260a;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f2766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f2767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f2768c;

    public h(Uri uri, C1260a c1260a) {
        Uri uri2;
        this.f2768c = uri;
        if (c1260a == null) {
            uri2 = Q0.e.f2783k;
        } else {
            uri2 = Uri.parse("http://" + c1260a.a() + ":" + c1260a.b() + "/v0");
        }
        this.f2766a = uri2;
        Uri.Builder builderAppendEncodedPath = uri2.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String strA = d.a(uri.getPath());
        if (strA.length() > 0 && !"/".equals(strA)) {
            builderAppendEncodedPath = builderAppendEncodedPath.appendPath("o").appendPath(strA);
        }
        this.f2767b = builderAppendEncodedPath.build();
    }

    public Uri a() {
        return this.f2768c;
    }

    public Uri b() {
        return this.f2766a;
    }

    public Uri c() {
        return this.f2767b;
    }
}
