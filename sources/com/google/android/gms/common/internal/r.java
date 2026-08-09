package com.google.android.gms.common.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final P f5619a = new M();

    public interface a {
        Object a(com.google.android.gms.common.api.j jVar);
    }

    public static Task a(com.google.android.gms.common.api.g gVar, a aVar) {
        P p2 = f5619a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.addStatusListener(new N(gVar, taskCompletionSource, aVar, p2));
        return taskCompletionSource.getTask();
    }

    public static Task b(com.google.android.gms.common.api.g gVar) {
        return a(gVar, new O());
    }
}
