package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;

/* JADX INFO: loaded from: classes.dex */
public class D extends AbstractC0679h {
    public static final Parcelable.Creator<D> CREATOR = new C0696p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5907a;

    D(String str) {
        this.f5907a = AbstractC0643s.e(str);
    }

    public static zzajb v(D d3, String str) {
        AbstractC0643s.k(d3);
        return new zzajb(null, d3.f5907a, d3.s(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String s() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String t() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public final AbstractC0679h u() {
        return new D(this.f5907a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, this.f5907a, false);
        N.c.b(parcel, iA);
    }
}
