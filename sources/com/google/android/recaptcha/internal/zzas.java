package com.google.android.recaptcha.internal;

import c2.V;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zzas {
    public static final Task zza(V v2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        v2.invokeOnCompletion(new zzar(taskCompletionSource, v2));
        return taskCompletionSource.getTask();
    }
}
