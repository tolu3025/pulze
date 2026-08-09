package com.google.android.gms.common.internal;

import M.C0413a;
import android.app.PendingIntent;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
abstract class V extends c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f5511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC0629d f5512f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected V(AbstractC0629d abstractC0629d, int i3, Bundle bundle) {
        super(abstractC0629d, Boolean.TRUE);
        Objects.requireNonNull(abstractC0629d);
        this.f5512f = abstractC0629d;
        this.f5510d = i3;
        this.f5511e = bundle;
    }

    @Override // com.google.android.gms.common.internal.c0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        int i3 = this.f5510d;
        if (i3 != 0) {
            this.f5512f.zzd(1, null);
            Bundle bundle = this.f5511e;
            f(new C0413a(i3, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC0629d.KEY_PENDING_INTENT) : null));
        } else {
            if (e()) {
                return;
            }
            this.f5512f.zzd(1, null);
            f(new C0413a(8, null));
        }
    }

    protected abstract boolean e();

    protected abstract void f(C0413a c0413a);
}
