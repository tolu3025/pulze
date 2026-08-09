package com.google.android.gms.common.api.internal;

import M.C0413a;
import M.C0421i;
import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class l0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f5446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ n0 f5447b;

    l0(n0 n0Var, j0 j0Var) {
        Objects.requireNonNull(n0Var);
        this.f5447b = n0Var;
        this.f5446a = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n0 n0Var = this.f5447b;
        if (n0Var.f5448a) {
            j0 j0Var = this.f5446a;
            C0413a c0413aB = j0Var.b();
            if (c0413aB.w()) {
                n0Var.mLifecycleFragment.startActivityForResult(GoogleApiActivity.a(n0Var.getActivity(), (PendingIntent) AbstractC0643s.k(c0413aB.v()), j0Var.a(), false), 1);
                return;
            }
            Activity activity = n0Var.getActivity();
            int iT = c0413aB.t();
            C0421i c0421i = n0Var.f5451d;
            if (c0421i.a(activity, iT, null) != null) {
                c0421i.q(n0Var.getActivity(), n0Var.mLifecycleFragment, c0413aB.t(), 2, n0Var);
            } else if (c0413aB.t() != 18) {
                n0Var.h(c0413aB, j0Var.a());
            } else {
                c0421i.v(n0Var.getActivity().getApplicationContext(), new k0(this, c0421i.u(n0Var.getActivity(), n0Var)));
            }
        }
    }
}
