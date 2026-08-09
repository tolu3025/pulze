package com.google.android.gms.common.internal;

import M.C0415c;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC0636k;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0632g extends N.a {
    public static final Parcelable.Creator<C0632g> CREATOR = new k0();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Scope[] f5552t = new Scope[0];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final C0415c[] f5553u = new C0415c[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f5555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f5556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f5557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    IBinder f5558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Scope[] f5559f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Bundle f5560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Account f5561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    C0415c[] f5562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    C0415c[] f5563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f5564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f5565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f5566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f5567s;

    C0632g(int i3, int i4, int i5, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C0415c[] c0415cArr, C0415c[] c0415cArr2, boolean z2, int i6, boolean z3, String str2) {
        scopeArr = scopeArr == null ? f5552t : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c0415cArr = c0415cArr == null ? f5553u : c0415cArr;
        c0415cArr2 = c0415cArr2 == null ? f5553u : c0415cArr2;
        this.f5554a = i3;
        this.f5555b = i4;
        this.f5556c = i5;
        if ("com.google.android.gms".equals(str)) {
            this.f5557d = "com.google.android.gms";
        } else {
            this.f5557d = str;
        }
        if (i3 < 2) {
            this.f5561m = iBinder != null ? AbstractBinderC0626a.b(InterfaceC0636k.a.a(iBinder)) : null;
        } else {
            this.f5558e = iBinder;
            this.f5561m = account;
        }
        this.f5559f = scopeArr;
        this.f5560l = bundle;
        this.f5562n = c0415cArr;
        this.f5563o = c0415cArr2;
        this.f5564p = z2;
        this.f5565q = i6;
        this.f5566r = z3;
        this.f5567s = str2;
    }

    public String s() {
        return this.f5567s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        k0.a(this, parcel, i3);
    }
}
