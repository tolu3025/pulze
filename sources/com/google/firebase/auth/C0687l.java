package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;

/* JADX INFO: renamed from: com.google.firebase.auth.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0687l extends AbstractC0679h {
    public static final Parcelable.Creator<C0687l> CREATOR = new G0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6094a;

    C0687l(String str) {
        this.f6094a = AbstractC0643s.e(str);
    }

    public static zzajb v(C0687l c0687l, String str) {
        AbstractC0643s.k(c0687l);
        return new zzajb(null, c0687l.f6094a, c0687l.s(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String s() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String t() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public final AbstractC0679h u() {
        return new C0687l(this.f6094a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, this.f6094a, false);
        N.c.b(parcel, iA);
    }
}
