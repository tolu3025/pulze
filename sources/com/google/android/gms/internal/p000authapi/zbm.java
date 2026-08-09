package com.google.android.gms.internal.p000authapi;

import D.a;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC0604d;
import com.google.android.gms.common.api.j;

/* JADX INFO: loaded from: classes.dex */
abstract class zbm extends AbstractC0604d {
    zbm(f fVar) {
        super(a.f1225b, fVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0604d
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        zbo zboVar = (zbo) bVar;
        zba(zboVar.getContext(), (zbt) zboVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0605e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((j) obj);
    }

    protected abstract void zba(Context context, zbt zbtVar);
}
