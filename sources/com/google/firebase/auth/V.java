package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;

/* JADX INFO: loaded from: classes.dex */
public class V extends AbstractC0679h {
    public static final Parcelable.Creator<V> CREATOR = new C0711x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6020a;

    V(String str) {
        this.f6020a = AbstractC0643s.e(str);
    }

    public static zzajb v(V v2, String str) {
        AbstractC0643s.k(v2);
        return new zzajb(null, null, v2.s(), null, null, v2.f6020a, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String s() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String t() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public final AbstractC0679h u() {
        return new V(this.f6020a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, this.f6020a, false);
        N.c.b(parcel, iA);
    }
}
