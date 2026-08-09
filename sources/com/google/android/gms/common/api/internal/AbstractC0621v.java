package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0627b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0621v {
    public static void a(Status status, TaskCompletionSource taskCompletionSource) {
        b(status, null, taskCompletionSource);
    }

    public static void b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.x()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(AbstractC0627b.a(status));
        }
    }

    public static boolean c(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        return status.x() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(AbstractC0627b.a(status));
    }
}
