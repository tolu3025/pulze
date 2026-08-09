package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractC0660j;
import com.google.android.play.integrity.internal.H;

/* JADX INFO: loaded from: classes.dex */
final class be extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f5788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f5789b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f5789b = bnVar;
        this.f5788a = context;
    }

    @Override // com.google.android.play.integrity.internal.H
    protected final void b() {
        this.f5789b.f5815d.trySetResult(Integer.valueOf(AbstractC0660j.a(this.f5788a)));
    }
}
