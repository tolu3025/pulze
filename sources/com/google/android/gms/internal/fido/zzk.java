package com.google.android.gms.internal.fido;

import M.C0415c;
import W.b;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC0633h;
import com.google.android.gms.common.internal.C0630e;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends AbstractC0633h {
    public zzk(Context context, Looper looper, C0630e c0630e, f.a aVar, f.b bVar) {
        super(context, looper, 149, c0630e, aVar, bVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        return iInterfaceQueryLocalInterface instanceof zzn ? (zzn) iInterfaceQueryLocalInterface : new zzn(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    public final C0415c[] getApiFeatures() {
        return new C0415c[]{b.f3032h, b.f3033i, b.f3044t};
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.privileged.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.privileged.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
