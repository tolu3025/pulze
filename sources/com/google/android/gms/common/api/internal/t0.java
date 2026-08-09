package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC0610j f5458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f5459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ u0 f5460c;

    t0(u0 u0Var, AbstractC0610j abstractC0610j, String str) {
        this.f5458a = abstractC0610j;
        this.f5459b = str;
        Objects.requireNonNull(u0Var);
        this.f5460c = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        u0 u0Var = this.f5460c;
        if (u0Var.k() > 0) {
            AbstractC0610j abstractC0610j = this.f5458a;
            if (u0Var.l() != null) {
                bundle = u0Var.l().getBundle(this.f5459b);
            } else {
                bundle = null;
            }
            abstractC0610j.onCreate(bundle);
        }
        if (u0Var.k() >= 2) {
            this.f5458a.onStart();
        }
        if (u0Var.k() >= 3) {
            this.f5458a.onResume();
        }
        if (u0Var.k() >= 4) {
            this.f5458a.onStop();
        }
        if (u0Var.k() >= 5) {
            this.f5458a.onDestroy();
        }
    }
}
