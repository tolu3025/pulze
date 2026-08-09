package com.google.android.gms.common.api;

import M.C0413a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends N.a implements j, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f5321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0413a f5322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Status f5311e = new Status(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f5312f = new Status(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Status f5313l = new Status(14);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Status f5314m = new Status(8);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Status f5315n = new Status(15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Status f5316o = new Status(16);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f5317p = new Status(17);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Status f5318q = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new q();

    public Status(int i3) {
        this(i3, (String) null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5319a == status.f5319a && AbstractC0642q.b(this.f5320b, status.f5320b) && AbstractC0642q.b(this.f5321c, status.f5321c) && AbstractC0642q.b(this.f5322d, status.f5322d);
    }

    @Override // com.google.android.gms.common.api.j
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return AbstractC0642q.c(Integer.valueOf(this.f5319a), this.f5320b, this.f5321c, this.f5322d);
    }

    public C0413a s() {
        return this.f5322d;
    }

    public int t() {
        return this.f5319a;
    }

    public String toString() {
        AbstractC0642q.a aVarD = AbstractC0642q.d(this);
        aVarD.a("statusCode", zza());
        aVarD.a("resolution", this.f5321c);
        return aVarD.toString();
    }

    public String u() {
        return this.f5320b;
    }

    public boolean v() {
        return this.f5321c != null;
    }

    public boolean w() {
        return this.f5319a == 16;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, t());
        N.c.C(parcel, 2, u(), false);
        N.c.A(parcel, 3, this.f5321c, i3, false);
        N.c.A(parcel, 4, s(), i3, false);
        N.c.b(parcel, iA);
    }

    public boolean x() {
        return this.f5319a <= 0;
    }

    public final String zza() {
        String str = this.f5320b;
        return str != null ? str : c.a(this.f5319a);
    }

    public Status(int i3, String str) {
        this(i3, str, (PendingIntent) null);
    }

    public Status(int i3, String str, PendingIntent pendingIntent) {
        this(i3, str, pendingIntent, null);
    }

    Status(int i3, String str, PendingIntent pendingIntent, C0413a c0413a) {
        this.f5319a = i3;
        this.f5320b = str;
        this.f5321c = pendingIntent;
        this.f5322d = c0413a;
    }

    public Status(C0413a c0413a, String str) {
        this(c0413a, str, 17);
    }

    public Status(C0413a c0413a, String str, int i3) {
        this(i3, str, c0413a.v(), c0413a);
    }
}
