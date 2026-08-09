package com.google.firebase.storage;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.firebase.storage.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0769d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f6536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TaskCompletionSource f6537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private P0.c f6538c;

    public RunnableC0769d(p pVar, TaskCompletionSource taskCompletionSource) {
        AbstractC0643s.k(pVar);
        AbstractC0643s.k(taskCompletionSource);
        this.f6536a = pVar;
        this.f6537b = taskCompletionSource;
        C0771f c0771fS = pVar.s();
        this.f6538c = new P0.c(c0771fS.a().m(), c0771fS.c(), c0771fS.b(), c0771fS.i());
    }

    @Override // java.lang.Runnable
    public void run() {
        Q0.a aVar = new Q0.a(this.f6536a.t(), this.f6536a.i());
        this.f6538c.d(aVar);
        aVar.a(this.f6537b, null);
    }
}
