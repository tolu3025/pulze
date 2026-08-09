package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC0655e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0656f f5876a;

    /* synthetic */ ServiceConnectionC0655e(C0656f c0656f, AbstractC0654d abstractC0654d) {
        this.f5876a = c0656f;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5876a.f5879b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f5876a.c().post(new C0652b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f5876a.f5879b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f5876a.c().post(new C0653c(this));
    }
}
