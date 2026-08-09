package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.o;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.firebase.storage.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0774i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f6567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TaskCompletionSource f6568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o f6569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private P0.c f6570d;

    RunnableC0774i(p pVar, TaskCompletionSource taskCompletionSource) {
        AbstractC0643s.k(pVar);
        AbstractC0643s.k(taskCompletionSource);
        this.f6567a = pVar;
        this.f6568b = taskCompletionSource;
        if (pVar.r().o().equals(pVar.o())) {
            throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
        }
        C0771f c0771fS = this.f6567a.s();
        this.f6570d = new P0.c(c0771fS.a().m(), c0771fS.c(), c0771fS.b(), c0771fS.i());
    }

    @Override // java.lang.Runnable
    public void run() {
        Q0.b bVar = new Q0.b(this.f6567a.t(), this.f6567a.i());
        this.f6570d.d(bVar);
        if (bVar.v()) {
            try {
                this.f6569c = new o.b(bVar.n(), this.f6567a).a();
            } catch (JSONException e3) {
                Log.e("GetMetadataTask", "Unable to parse resulting metadata. " + bVar.m(), e3);
                this.f6568b.setException(C0779n.d(e3));
                return;
            }
        }
        TaskCompletionSource taskCompletionSource = this.f6568b;
        if (taskCompletionSource != null) {
            bVar.a(taskCompletionSource, this.f6569c);
        }
    }
}
