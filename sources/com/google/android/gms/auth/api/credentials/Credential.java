package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class Credential extends N.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f5191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f5192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5194f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f5195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f5196m;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    Credential(java.lang.String r4, java.lang.String r5, android.net.Uri r6, java.util.List r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "credential identifier cannot be null"
            java.lang.Object r4 = com.google.android.gms.common.internal.AbstractC0643s.l(r4, r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.trim()
            java.lang.String r0 = "credential identifier cannot be empty"
            com.google.android.gms.common.internal.AbstractC0643s.f(r4, r0)
            if (r8 == 0) goto L25
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L1d
            goto L25
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Password must not be empty if set"
            r4.<init>(r5)
            throw r4
        L25:
            if (r9 == 0) goto L83
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L30
        L2d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L74
        L30:
            android.net.Uri r0 = android.net.Uri.parse(r9)
            boolean r1 = r0.isAbsolute()
            if (r1 == 0) goto L2d
            boolean r1 = r0.isHierarchical()
            if (r1 == 0) goto L2d
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2d
            java.lang.String r1 = r0.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L55
            goto L2d
        L55:
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "http"
            boolean r1 = r2.equalsIgnoreCase(r1)
            r2 = 1
            if (r1 != 0) goto L70
            java.lang.String r0 = r0.getScheme()
            java.lang.String r1 = "https"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L6f
            goto L70
        L6f:
            r2 = 0
        L70:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L74:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7b
            goto L83
        L7b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Account type must be a valid Http/Https URI"
            r4.<init>(r5)
            throw r4
        L83:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L98
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L90
            goto L98
        L90:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Password and AccountType are mutually exclusive"
            r4.<init>(r5)
            throw r4
        L98:
            if (r5 == 0) goto La5
            java.lang.String r0 = r5.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La5
            r5 = 0
        La5:
            r3.f5190b = r5
            r3.f5191c = r6
            if (r7 != 0) goto Lb0
            java.util.List r5 = java.util.Collections.emptyList()
            goto Lb4
        Lb0:
            java.util.List r5 = java.util.Collections.unmodifiableList(r7)
        Lb4:
            r3.f5192d = r5
            r3.f5189a = r4
            r3.f5193e = r8
            r3.f5194f = r9
            r3.f5195l = r10
            r3.f5196m = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.Credential.<init>(java.lang.String, java.lang.String, android.net.Uri, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f5189a, credential.f5189a) && TextUtils.equals(this.f5190b, credential.f5190b) && AbstractC0642q.b(this.f5191c, credential.f5191c) && TextUtils.equals(this.f5193e, credential.f5193e) && TextUtils.equals(this.f5194f, credential.f5194f);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f5189a, this.f5190b, this.f5191c, this.f5193e, this.f5194f);
    }

    public String s() {
        return this.f5194f;
    }

    public String t() {
        return this.f5196m;
    }

    public String u() {
        return this.f5195l;
    }

    public String v() {
        return this.f5189a;
    }

    public List w() {
        return this.f5192d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, v(), false);
        N.c.C(parcel, 2, x(), false);
        N.c.A(parcel, 3, z(), i3, false);
        N.c.G(parcel, 4, w(), false);
        N.c.C(parcel, 5, y(), false);
        N.c.C(parcel, 6, s(), false);
        N.c.C(parcel, 9, u(), false);
        N.c.C(parcel, 10, t(), false);
        N.c.b(parcel, iA);
    }

    public String x() {
        return this.f5190b;
    }

    public String y() {
        return this.f5193e;
    }

    public Uri z() {
        return this.f5191c;
    }
}
