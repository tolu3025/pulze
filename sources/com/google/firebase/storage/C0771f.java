package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.io.UnsupportedEncodingException;
import k0.C0992f;
import m0.AbstractC1028b;
import p0.InterfaceC1058a;
import p0.InterfaceC1059b;
import q0.InterfaceC1136b;
import w0.C1260a;

/* JADX INFO: renamed from: com.google.firebase.storage.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0771f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0992f f6550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L0.b f6551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L0.b f6552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f6554e = 600000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f6555f = 60000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f6556g = 600000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f6557h = 120000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C1260a f6558i;

    C0771f(String str, C0992f c0992f, L0.b bVar, L0.b bVar2) {
        this.f6553d = str;
        this.f6550a = c0992f;
        this.f6551b = bVar;
        this.f6552c = bVar2;
        if (bVar2 == null || bVar2.get() == null) {
            return;
        }
        ((InterfaceC1059b) bVar2.get()).c(new a());
    }

    private String d() {
        return this.f6553d;
    }

    public static C0771f f(C0992f c0992f, String str) {
        AbstractC0643s.b(c0992f != null, "Null is not a valid value for the FirebaseApp.");
        AbstractC0643s.b(str != null, "Null is not a valid value for the Firebase Storage URL.");
        if (!str.toLowerCase().startsWith("gs://")) {
            throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
        }
        try {
            return g(c0992f, P0.i.d(c0992f, str));
        } catch (UnsupportedEncodingException e3) {
            Log.e("FirebaseStorage", "Unable to parse url:" + str, e3);
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    private static C0771f g(C0992f c0992f, Uri uri) {
        String host = uri != null ? uri.getHost() : null;
        if (uri != null && !TextUtils.isEmpty(uri.getPath())) {
            throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
        }
        AbstractC0643s.l(c0992f, "Provided FirebaseApp must not be null.");
        C0772g c0772g = (C0772g) c0992f.k(C0772g.class);
        AbstractC0643s.l(c0772g, "Firebase Storage component is not present.");
        return c0772g.a(host);
    }

    private p m(Uri uri) {
        AbstractC0643s.l(uri, "uri must not be null");
        String strD = d();
        AbstractC0643s.b(TextUtils.isEmpty(strD) || uri.getAuthority().equalsIgnoreCase(strD), "The supplied bucketname does not match the storage bucket of the current instance.");
        return new p(uri, this);
    }

    public C0992f a() {
        return this.f6550a;
    }

    InterfaceC1059b b() {
        L0.b bVar = this.f6552c;
        if (bVar != null) {
            return (InterfaceC1059b) bVar.get();
        }
        return null;
    }

    InterfaceC1136b c() {
        L0.b bVar = this.f6551b;
        if (bVar != null) {
            return (InterfaceC1136b) bVar.get();
        }
        return null;
    }

    C1260a e() {
        return this.f6558i;
    }

    public long h() {
        return this.f6555f;
    }

    public long i() {
        return this.f6556g;
    }

    public long j() {
        return this.f6557h;
    }

    public long k() {
        return this.f6554e;
    }

    public p l() {
        if (TextUtils.isEmpty(d())) {
            throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
        }
        return m(new Uri.Builder().scheme("gs").authority(d()).path("/").build());
    }

    public p n(String str) {
        AbstractC0643s.b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("gs://") || lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) {
            throw new IllegalArgumentException("location should not be a full URL.");
        }
        return l().e(str);
    }

    public void o(long j3) {
        this.f6556g = j3;
    }

    public void p(long j3) {
        this.f6557h = j3;
    }

    public void q(long j3) {
        this.f6554e = j3;
    }

    public void r(String str, int i3) {
        this.f6558i = new C1260a(str, i3);
    }

    /* JADX INFO: renamed from: com.google.firebase.storage.f$a */
    class a implements InterfaceC1058a {
        a() {
        }

        @Override // p0.InterfaceC1058a
        public void a(AbstractC1028b abstractC1028b) {
        }
    }
}
