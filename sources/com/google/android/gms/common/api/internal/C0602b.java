package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0602b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f5394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.d f5395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5396d;

    private C0602b(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        this.f5394b = aVar;
        this.f5395c = dVar;
        this.f5396d = str;
        this.f5393a = AbstractC0642q.c(aVar, dVar, str);
    }

    public static C0602b a(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        return new C0602b(aVar, dVar, str);
    }

    public final String b() {
        return this.f5394b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0602b)) {
            return false;
        }
        C0602b c0602b = (C0602b) obj;
        return AbstractC0642q.b(this.f5394b, c0602b.f5394b) && AbstractC0642q.b(this.f5395c, c0602b.f5395c) && AbstractC0642q.b(this.f5396d, c0602b.f5396d);
    }

    public final int hashCode() {
        return this.f5393a;
    }
}
