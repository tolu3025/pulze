package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.firebase.auth.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0676f0 extends N.a {
    public static final Parcelable.Creator<C0676f0> CREATOR = new A0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uri f6071e;

    /* JADX INFO: renamed from: com.google.firebase.auth.f0$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f6073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6075d;

        public C0676f0 a() {
            String str = this.f6072a;
            Uri uri = this.f6073b;
            return new C0676f0(str, uri == null ? null : uri.toString(), this.f6074c, this.f6075d);
        }

        public a b(String str) {
            if (str == null) {
                this.f6074c = true;
            } else {
                this.f6072a = str;
            }
            return this;
        }

        public a c(Uri uri) {
            if (uri == null) {
                this.f6075d = true;
            } else {
                this.f6073b = uri;
            }
            return this;
        }
    }

    C0676f0(String str, String str2, boolean z2, boolean z3) {
        this.f6067a = str;
        this.f6068b = str2;
        this.f6069c = z2;
        this.f6070d = z3;
        this.f6071e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public String p() {
        return this.f6067a;
    }

    public Uri s() {
        return this.f6071e;
    }

    public final boolean t() {
        return this.f6069c;
    }

    public final boolean u() {
        return this.f6070d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 2, p(), false);
        N.c.C(parcel, 3, this.f6068b, false);
        N.c.g(parcel, 4, this.f6069c);
        N.c.g(parcel, 5, this.f6070d);
        N.c.b(parcel, iA);
    }

    public final String zza() {
        return this.f6068b;
    }
}
