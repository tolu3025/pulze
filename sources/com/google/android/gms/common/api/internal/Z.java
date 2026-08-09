package com.google.android.gms.common.api.internal;

import M.C0413a;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import b0.AbstractC0522d;
import b0.InterfaceC0523e;
import c0.AbstractBinderC0533d;
import c0.C0541l;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.C0630e;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends AbstractBinderC0533d implements f.a, f.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a.AbstractC0106a f5384h = AbstractC0522d.f4935c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f5386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.AbstractC0106a f5387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f5388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0630e f5389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC0523e f5390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Y f5391g;

    public Z(Context context, Handler handler, C0630e c0630e) {
        a.AbstractC0106a abstractC0106a = f5384h;
        this.f5385a = context;
        this.f5386b = handler;
        this.f5389e = (C0630e) AbstractC0643s.l(c0630e, "ClientSettings must not be null");
        this.f5388d = c0630e.g();
        this.f5387c = abstractC0106a;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0606f
    public final void a(int i3) {
        this.f5391g.a(i3);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0614n
    public final void b(C0413a c0413a) {
        this.f5391g.c(c0413a);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0606f
    public final void f(Bundle bundle) {
        this.f5390f.b(this);
    }

    @Override // c0.InterfaceC0535f
    public final void i(C0541l c0541l) {
        this.f5386b.post(new X(this, c0541l));
    }

    public final void t(Y y2) {
        InterfaceC0523e interfaceC0523e = this.f5390f;
        if (interfaceC0523e != null) {
            interfaceC0523e.disconnect();
        }
        C0630e c0630e = this.f5389e;
        c0630e.k(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0106a abstractC0106a = this.f5387c;
        Context context = this.f5385a;
        Handler handler = this.f5386b;
        this.f5390f = (InterfaceC0523e) abstractC0106a.buildClient(context, handler.getLooper(), c0630e, (Object) c0630e.i(), (f.a) this, (f.b) this);
        this.f5391g = y2;
        Set set = this.f5388d;
        if (set == null || set.isEmpty()) {
            handler.post(new W(this));
        } else {
            this.f5390f.a();
        }
    }

    public final void u() {
        InterfaceC0523e interfaceC0523e = this.f5390f;
        if (interfaceC0523e != null) {
            interfaceC0523e.disconnect();
        }
    }

    final /* synthetic */ void v(C0541l c0541l) {
        C0413a c0413aS = c0541l.s();
        if (c0413aS.x()) {
            com.google.android.gms.common.internal.T t2 = (com.google.android.gms.common.internal.T) AbstractC0643s.k(c0541l.t());
            c0413aS = t2.t();
            if (c0413aS.x()) {
                this.f5391g.d(t2.s(), this.f5388d);
            } else {
                String strValueOf = String.valueOf(c0413aS);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                this.f5391g.c(c0413aS);
            }
        } else {
            this.f5391g.c(c0413aS);
        }
        this.f5390f.disconnect();
    }

    final /* synthetic */ Y w() {
        return this.f5391g;
    }
}
