package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class O extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f5366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N f5367b;

    public O(N n3) {
        this.f5367b = n3;
    }

    public final void a(Context context) {
        this.f5366a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f5366a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f5366a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f5367b.a();
            b();
        }
    }
}
