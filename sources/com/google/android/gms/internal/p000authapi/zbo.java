package com.google.android.gms.internal.p000authapi;

import D.a;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC0633h;
import com.google.android.gms.common.internal.C0630e;

/* JADX INFO: loaded from: classes.dex */
public final class zbo extends AbstractC0633h {
    private final a.C0005a zba;

    public zbo(Context context, Looper looper, C0630e c0630e, a.C0005a c0005a, f.a aVar, f.b bVar) {
        super(context, looper, 68, c0630e, aVar, bVar);
        a.C0005a.C0006a c0006a = new a.C0005a.C0006a(c0005a == null ? a.C0005a.f1234d : c0005a);
        c0006a.a(zbbj.zba());
        this.zba = new a.C0005a(c0006a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof zbt ? (zbt) iInterfaceQueryLocalInterface : new zbt(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.zba.a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    final a.C0005a zba() {
        return this.zba;
    }
}
