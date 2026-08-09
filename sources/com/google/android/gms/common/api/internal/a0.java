package com.google.android.gms.common.api.internal;

import M.C0415c;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.AbstractC0620u;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class a0 extends AbstractC0620u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC0620u.a f5392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(AbstractC0620u.a aVar, C0415c[] c0415cArr, boolean z2, int i3) {
        super(c0415cArr, z2, i3);
        Objects.requireNonNull(aVar);
        this.f5392d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0620u
    protected final void b(a.b bVar, TaskCompletionSource taskCompletionSource) {
        this.f5392d.f().accept(bVar, taskCompletionSource);
    }
}
