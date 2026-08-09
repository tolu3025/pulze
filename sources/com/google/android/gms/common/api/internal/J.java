package com.google.android.gms.common.api.internal;

import M.C0413a;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC0629d;
import com.google.android.gms.common.internal.InterfaceC0636k;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class J implements AbstractC0629d.c, Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.f f5357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0602b f5358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0636k f5359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f5360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ C0607g f5362f;

    public J(C0607g c0607g, a.f fVar, C0602b c0602b) {
        Objects.requireNonNull(c0607g);
        this.f5362f = c0607g;
        this.f5359c = null;
        this.f5360d = null;
        this.f5361e = false;
        this.f5357a = fVar;
        this.f5358b = c0602b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void e() {
        InterfaceC0636k interfaceC0636k;
        if (!this.f5361e || (interfaceC0636k = this.f5359c) == null) {
            return;
        }
        this.f5357a.getRemoteService(interfaceC0636k, this.f5360d);
    }

    @Override // com.google.android.gms.common.api.internal.Y
    public final void a(int i3) {
        G g3 = (G) this.f5362f.d().get(this.f5358b);
        if (g3 != null) {
            if (g3.d()) {
                g3.s(new C0413a(17));
            } else {
                g3.a(i3);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d.c
    public final void b(C0413a c0413a) {
        this.f5362f.g().post(new I(this, c0413a));
    }

    @Override // com.google.android.gms.common.api.internal.Y
    public final void c(C0413a c0413a) {
        G g3 = (G) this.f5362f.d().get(this.f5358b);
        if (g3 != null) {
            g3.s(c0413a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.Y
    public final void d(InterfaceC0636k interfaceC0636k, Set set) {
        if (interfaceC0636k == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new C0413a(4));
        } else {
            this.f5359c = interfaceC0636k;
            this.f5360d = set;
            e();
        }
    }

    final /* synthetic */ a.f f() {
        return this.f5357a;
    }

    final /* synthetic */ C0602b g() {
        return this.f5358b;
    }

    final /* synthetic */ void h(boolean z2) {
        this.f5361e = true;
    }
}
