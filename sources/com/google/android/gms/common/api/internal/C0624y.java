package com.google.android.gms.common.api.internal;

import M.C0413a;
import M.C0421i;
import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0624y extends n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.collection.b f5475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0607g f5476f;

    C0624y(InterfaceC0611k interfaceC0611k, C0607g c0607g, C0421i c0421i) {
        super(interfaceC0611k, c0421i);
        this.f5475e = new androidx.collection.b();
        this.f5476f = c0607g;
        this.mLifecycleFragment.b("ConnectionlessLifecycleHelper", this);
    }

    public static void i(Activity activity, C0607g c0607g, C0602b c0602b) {
        InterfaceC0611k fragment = AbstractC0610j.getFragment(activity);
        C0624y c0624y = (C0624y) fragment.c("ConnectionlessLifecycleHelper", C0624y.class);
        if (c0624y == null) {
            c0624y = new C0624y(fragment, c0607g, C0421i.m());
        }
        AbstractC0643s.l(c0602b, "ApiKey cannot be null");
        c0624y.f5475e.add(c0602b);
        c0607g.q(c0624y);
    }

    private final void k() {
        if (this.f5475e.isEmpty()) {
            return;
        }
        this.f5476f.q(this);
    }

    @Override // com.google.android.gms.common.api.internal.n0
    protected final void d(C0413a c0413a, int i3) {
        this.f5476f.A(c0413a, i3);
    }

    @Override // com.google.android.gms.common.api.internal.n0
    protected final void e() {
        this.f5476f.t();
    }

    final androidx.collection.b j() {
        return this.f5475e;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0610j
    public final void onResume() {
        super.onResume();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.n0, com.google.android.gms.common.api.internal.AbstractC0610j
    public final void onStart() {
        super.onStart();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.n0, com.google.android.gms.common.api.internal.AbstractC0610j
    public final void onStop() {
        super.onStop();
        this.f5476f.r(this);
    }
}
