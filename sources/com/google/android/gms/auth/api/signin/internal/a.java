package com.google.android.gms.auth.api.signin.internal;

import K.g;
import K.x;
import android.os.Bundle;
import androidx.loader.app.a;
import com.google.android.gms.common.api.f;
import w.AbstractC1259b;

/* JADX INFO: loaded from: classes.dex */
final class a implements a.InterfaceC0097a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f5306a;

    /* synthetic */ a(SignInHubActivity signInHubActivity, x xVar) {
        this.f5306a = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0097a
    public final /* bridge */ /* synthetic */ void a(AbstractC1259b abstractC1259b, Object obj) {
        SignInHubActivity signInHubActivity = this.f5306a;
        signInHubActivity.setResult(signInHubActivity.f5304O, signInHubActivity.f5305P);
        this.f5306a.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0097a
    public final AbstractC1259b c(int i3, Bundle bundle) {
        return new g(this.f5306a, f.c());
    }

    @Override // androidx.loader.app.a.InterfaceC0097a
    public final void b(AbstractC1259b abstractC1259b) {
    }
}
