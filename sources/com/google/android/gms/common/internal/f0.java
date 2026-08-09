package com.google.android.gms.common.internal;

import M.C0413a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0629d;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends V {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f5550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC0629d f5551h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(AbstractC0629d abstractC0629d, int i3, IBinder iBinder, Bundle bundle) {
        super(abstractC0629d, i3, bundle);
        Objects.requireNonNull(abstractC0629d);
        this.f5551h = abstractC0629d;
        this.f5550g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.V
    protected final boolean e() {
        String string;
        String interfaceDescriptor;
        AbstractC0629d abstractC0629d;
        try {
            IBinder iBinder = this.f5550g;
            AbstractC0643s.k(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            abstractC0629d = this.f5551h;
        } catch (RemoteException unused) {
            string = "service probably died";
        }
        if (!abstractC0629d.getServiceDescriptor().equals(interfaceDescriptor)) {
            String serviceDescriptor = abstractC0629d.getServiceDescriptor();
            StringBuilder sb = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
            sb.append("service descriptor mismatch: ");
            sb.append(serviceDescriptor);
            sb.append(" vs. ");
            sb.append(interfaceDescriptor);
            string = sb.toString();
            Log.w("GmsClient", string);
            return false;
        }
        IInterface iInterfaceCreateServiceInterface = abstractC0629d.createServiceInterface(this.f5550g);
        if (iInterfaceCreateServiceInterface == null || !(abstractC0629d.zze(2, 4, iInterfaceCreateServiceInterface) || abstractC0629d.zze(3, 4, iInterfaceCreateServiceInterface))) {
            return false;
        }
        abstractC0629d.zzn(null);
        AbstractC0629d.a aVarZzk = abstractC0629d.zzk();
        Bundle connectionHint = abstractC0629d.getConnectionHint();
        if (aVarZzk == null) {
            return true;
        }
        abstractC0629d.zzk().f(connectionHint);
        return true;
    }

    @Override // com.google.android.gms.common.internal.V
    protected final void f(C0413a c0413a) {
        AbstractC0629d abstractC0629d = this.f5551h;
        if (abstractC0629d.zzl() != null) {
            abstractC0629d.zzl().b(c0413a);
        }
        abstractC0629d.onConnectionFailed(c0413a);
    }
}
