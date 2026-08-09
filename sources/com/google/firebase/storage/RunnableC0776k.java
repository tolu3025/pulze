package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.firebase.storage.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0776k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f6574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource f6575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P0.c f6576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f6578e;

    RunnableC0776k(p pVar, Integer num, String str, TaskCompletionSource taskCompletionSource) {
        AbstractC0643s.k(pVar);
        AbstractC0643s.k(taskCompletionSource);
        this.f6574a = pVar;
        this.f6578e = num;
        this.f6577d = str;
        this.f6575b = taskCompletionSource;
        C0771f c0771fS = pVar.s();
        this.f6576c = new P0.c(c0771fS.a().m(), c0771fS.c(), c0771fS.b(), c0771fS.i());
    }

    @Override // java.lang.Runnable
    public void run() {
        C0775j c0775jA;
        Q0.d dVar = new Q0.d(this.f6574a.t(), this.f6574a.i(), this.f6578e, this.f6577d);
        this.f6576c.d(dVar);
        if (dVar.v()) {
            try {
                c0775jA = C0775j.a(this.f6574a.s(), dVar.n());
            } catch (JSONException e3) {
                Log.e("ListTask", "Unable to parse response body. " + dVar.m(), e3);
                this.f6575b.setException(C0779n.d(e3));
                return;
            }
        } else {
            c0775jA = null;
        }
        TaskCompletionSource taskCompletionSource = this.f6575b;
        if (taskCompletionSource != null) {
            dVar.a(taskCompletionSource, c0775jA);
        }
    }
}
