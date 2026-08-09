package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC0611k;

/* JADX INFO: loaded from: classes.dex */
final class G extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f5491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC0611k f5492b;

    G(Intent intent, InterfaceC0611k interfaceC0611k, int i3) {
        this.f5491a = intent;
        this.f5492b = interfaceC0611k;
    }

    @Override // com.google.android.gms.common.internal.H
    public final void a() {
        Intent intent = this.f5491a;
        if (intent != null) {
            this.f5492b.startActivityForResult(intent, 2);
        }
    }
}
