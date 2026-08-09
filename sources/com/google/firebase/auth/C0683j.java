package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: com.google.firebase.auth.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0683j extends AbstractC0679h {
    public static final Parcelable.Creator<C0683j> CREATOR = new F0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f6092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6093e;

    C0683j(String str, String str2) {
        this(str, str2, null, null, false);
    }

    public static boolean w(String str) {
        C0675f c0675fC;
        return (TextUtils.isEmpty(str) || (c0675fC = C0675f.c(str)) == null || c0675fC.b() != 4) ? false : true;
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String s() {
        return "password";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String t() {
        return !TextUtils.isEmpty(this.f6090b) ? "password" : "emailLink";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public final AbstractC0679h u() {
        return new C0683j(this.f6089a, this.f6090b, this.f6091c, this.f6092d, this.f6093e);
    }

    public final C0683j v(A a3) {
        this.f6092d = a3.zze();
        this.f6093e = true;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, this.f6089a, false);
        N.c.C(parcel, 2, this.f6090b, false);
        N.c.C(parcel, 3, this.f6091c, false);
        N.c.C(parcel, 4, this.f6092d, false);
        N.c.g(parcel, 5, this.f6093e);
        N.c.b(parcel, iA);
    }

    public final String x() {
        return this.f6092d;
    }

    public final boolean y() {
        return !TextUtils.isEmpty(this.f6091c);
    }

    public final String zzc() {
        return this.f6089a;
    }

    public final String zzd() {
        return this.f6090b;
    }

    public final String zze() {
        return this.f6091c;
    }

    public final boolean zzg() {
        return this.f6093e;
    }

    C0683j(String str, String str2, String str3, String str4, boolean z2) {
        this.f6089a = AbstractC0643s.e(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f6090b = str2;
        this.f6091c = str3;
        this.f6092d = str4;
        this.f6093e = z2;
    }
}
