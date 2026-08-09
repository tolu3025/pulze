package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class F extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f5488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f5489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f5490c;

    F(Intent intent, Activity activity, int i3) {
        this.f5488a = intent;
        this.f5489b = activity;
        this.f5490c = i3;
    }

    @Override // com.google.android.gms.common.internal.H
    public final void a() {
        Intent intent = this.f5488a;
        if (intent != null) {
            this.f5489b.startActivityForResult(intent, this.f5490c);
        }
    }
}
