package com.google.android.gms.common.internal;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f5583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f5585e;

    public l0(String str, String str2, int i3, boolean z2) {
        AbstractC0643s.e(str);
        this.f5581a = str;
        AbstractC0643s.e(str2);
        this.f5582b = str2;
        this.f5583c = null;
        this.f5584d = 4225;
        this.f5585e = z2;
    }

    public final String a() {
        return this.f5581a;
    }

    public final String b() {
        return this.f5582b;
    }

    public final ComponentName c() {
        return this.f5583c;
    }

    public final boolean d() {
        return this.f5585e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return AbstractC0642q.b(this.f5581a, l0Var.f5581a) && AbstractC0642q.b(this.f5582b, l0Var.f5582b) && AbstractC0642q.b(this.f5583c, l0Var.f5583c) && this.f5585e == l0Var.f5585e;
    }

    public final int hashCode() {
        return AbstractC0642q.c(this.f5581a, this.f5582b, this.f5583c, 4225, Boolean.valueOf(this.f5585e));
    }

    public final String toString() {
        String str = this.f5581a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f5583c;
        AbstractC0643s.k(componentName);
        return componentName.flattenToString();
    }
}
