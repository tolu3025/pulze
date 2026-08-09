package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC0633h;
import com.google.android.gms.common.internal.C0630e;

/* JADX INFO: loaded from: classes.dex */
public final class zzac extends AbstractC0633h {
    public zzac(Context context, Looper looper, C0630e c0630e, f.a aVar, f.b bVar) {
        super(context, looper, 119, c0630e, aVar, bVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        return iInterfaceQueryLocalInterface instanceof zzz ? (zzz) iInterfaceQueryLocalInterface : new zzz(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.fido.u2f.zeroparty.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
