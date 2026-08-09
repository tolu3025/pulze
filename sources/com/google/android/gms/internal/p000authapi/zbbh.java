package com.google.android.gms.internal.p000authapi;

import G.D;
import M.C0415c;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC0606f;
import com.google.android.gms.common.api.internal.InterfaceC0614n;
import com.google.android.gms.common.internal.AbstractC0633h;
import com.google.android.gms.common.internal.C0630e;

/* JADX INFO: loaded from: classes.dex */
public final class zbbh extends AbstractC0633h {
    private final Bundle zba;

    public zbbh(Context context, Looper looper, D d3, C0630e c0630e, InterfaceC0606f interfaceC0606f, InterfaceC0614n interfaceC0614n) {
        super(context, looper, 212, c0630e, interfaceC0606f, interfaceC0614n);
        this.zba = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof zbam ? (zbam) iInterfaceQueryLocalInterface : new zbam(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    public final C0415c[] getApiFeatures() {
        return zbbi.zbi;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
