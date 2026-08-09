package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class r0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f5454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0623x f5455b;

    r0(C0623x c0623x, TaskCompletionSource taskCompletionSource) {
        this.f5454a = taskCompletionSource;
        Objects.requireNonNull(c0623x);
        this.f5455b = c0623x;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f5455b.g().remove(this.f5454a);
    }
}
