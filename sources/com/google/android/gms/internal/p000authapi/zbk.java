package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0605e;

/* JADX INFO: loaded from: classes.dex */
final class zbk extends zbd {
    private final InterfaceC0605e zba;

    zbk(InterfaceC0605e interfaceC0605e) {
        this.zba = interfaceC0605e;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbd, com.google.android.gms.internal.p000authapi.zbs
    public final void zbc(Status status) {
        this.zba.setResult(status);
    }
}
