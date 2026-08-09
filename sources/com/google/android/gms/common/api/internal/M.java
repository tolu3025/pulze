package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class M extends A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.e f5365c;

    public M(com.google.android.gms.common.api.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f5365c = eVar;
    }

    @Override // com.google.android.gms.common.api.f
    public final AbstractC0604d a(AbstractC0604d abstractC0604d) {
        return this.f5365c.doRead(abstractC0604d);
    }

    @Override // com.google.android.gms.common.api.f
    public final AbstractC0604d b(AbstractC0604d abstractC0604d) {
        return this.f5365c.doWrite(abstractC0604d);
    }

    @Override // com.google.android.gms.common.api.f
    public final Context e() {
        return this.f5365c.getApplicationContext();
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper f() {
        return this.f5365c.getLooper();
    }
}
