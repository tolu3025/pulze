package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC0629d f5543b;

    public e0(AbstractC0629d abstractC0629d, int i3) {
        Objects.requireNonNull(abstractC0629d);
        this.f5543b = abstractC0629d;
        this.f5542a = i3;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC0629d abstractC0629d = this.f5543b;
        if (iBinder == null) {
            abstractC0629d.zzf(16);
            return;
        }
        synchronized (abstractC0629d.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0629d.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0639n)) ? new W(iBinder) : (InterfaceC0639n) iInterfaceQueryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5543b.zzb(0, null, this.f5542a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0629d abstractC0629d = this.f5543b;
        synchronized (abstractC0629d.zzh()) {
            abstractC0629d.zzi(null);
        }
        AbstractC0629d abstractC0629d2 = this.f5543b;
        int i3 = this.f5542a;
        Handler handler = abstractC0629d2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i3, 1));
    }
}
