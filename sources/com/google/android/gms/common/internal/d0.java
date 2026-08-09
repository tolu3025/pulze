package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC0629d f5525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5526b;

    public d0(AbstractC0629d abstractC0629d, int i3) {
        this.f5525a = abstractC0629d;
        this.f5526b = i3;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0638m
    public final void e(int i3, IBinder iBinder, h0 h0Var) {
        AbstractC0629d abstractC0629d = this.f5525a;
        AbstractC0643s.l(abstractC0629d, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC0643s.k(h0Var);
        abstractC0629d.zzc(h0Var);
        s(i3, iBinder, h0Var.f5569a);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0638m
    public final void n(int i3, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0638m
    public final void s(int i3, IBinder iBinder, Bundle bundle) {
        AbstractC0643s.l(this.f5525a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f5525a.onPostInitHandler(i3, iBinder, bundle, this.f5526b);
        this.f5525a = null;
    }
}
