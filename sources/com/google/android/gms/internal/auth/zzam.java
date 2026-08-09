package com.google.android.gms.internal.auth;

import C.h;
import M.C0415c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC0633h;
import com.google.android.gms.common.internal.C0630e;

/* JADX INFO: loaded from: classes.dex */
public final class zzam extends AbstractC0633h {
    public zzam(Context context, Looper looper, C0630e c0630e, f.a aVar, f.b bVar) {
        super(context, looper, 120, c0630e, aVar, bVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return com.google.android.gms.auth.account.f.a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    public final C0415c[] getApiFeatures() {
        return new C0415c[]{h.f751l};
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
