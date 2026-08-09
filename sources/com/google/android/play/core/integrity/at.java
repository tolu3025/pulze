package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C0656f;

/* JADX INFO: loaded from: classes.dex */
final class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.o f5774b;

    at(com.google.android.play.integrity.internal.o oVar, com.google.android.play.integrity.internal.o oVar2) {
        this.f5773a = oVar;
        this.f5774b = oVar2;
    }

    final as a(Activity activity, TaskCompletionSource taskCompletionSource, C0656f c0656f) {
        Object objA = this.f5773a.a();
        objA.getClass();
        k kVar = (k) this.f5774b.a();
        kVar.getClass();
        activity.getClass();
        c0656f.getClass();
        return new as((Context) objA, kVar, activity, taskCompletionSource, c0656f);
    }
}
