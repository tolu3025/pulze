package Q0;

import android.net.Uri;
import k0.C0992f;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Uri f2795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f2796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f2797o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f2798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f2799q;

    public g(P0.h hVar, C0992f c0992f, Uri uri, byte[] bArr, long j3, int i3, boolean z2) {
        super(hVar, c0992f);
        if (bArr == null && i3 != -1) {
            this.f2785a = new IllegalArgumentException("contentType is null or empty");
        }
        if (j3 < 0) {
            this.f2785a = new IllegalArgumentException("offset cannot be negative");
        }
        this.f2799q = i3;
        this.f2795m = uri;
        this.f2796n = i3 <= 0 ? null : bArr;
        this.f2797o = j3;
        this.f2798p = z2;
        super.G("X-Goog-Upload-Protocol", "resumable");
        super.G("X-Goog-Upload-Command", (!z2 || i3 <= 0) ? z2 ? "finalize" : "upload" : "upload, finalize");
        super.G("X-Goog-Upload-Offset", Long.toString(j3));
    }

    @Override // Q0.e
    protected String e() {
        return "POST";
    }

    @Override // Q0.e
    protected byte[] h() {
        return this.f2796n;
    }

    @Override // Q0.e
    protected int i() {
        int i3 = this.f2799q;
        if (i3 > 0) {
            return i3;
        }
        return 0;
    }

    @Override // Q0.e
    public Uri u() {
        return this.f2795m;
    }
}
