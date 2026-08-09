package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class zzbt implements I.a {
    public final g getSpatulaHeader(f fVar) {
        AbstractC0643s.k(fVar);
        return fVar.b(new zzbs(this, fVar));
    }

    public final g performProxyRequest(f fVar, I.b bVar) {
        AbstractC0643s.k(fVar);
        AbstractC0643s.k(bVar);
        return fVar.b(new zzbq(this, fVar, bVar));
    }
}
