package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.o;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
class M implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f6503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource f6504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f6505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f6506d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private P0.c f6507e;

    public M(p pVar, TaskCompletionSource taskCompletionSource, o oVar) {
        this.f6503a = pVar;
        this.f6504b = taskCompletionSource;
        this.f6505c = oVar;
        C0771f c0771fS = pVar.s();
        this.f6507e = new P0.c(c0771fS.a().m(), c0771fS.c(), c0771fS.b(), c0771fS.j());
    }

    @Override // java.lang.Runnable
    public void run() {
        Q0.k kVar = new Q0.k(this.f6503a.t(), this.f6503a.i(), this.f6505c.q());
        this.f6507e.d(kVar);
        if (kVar.v()) {
            try {
                this.f6506d = new o.b(kVar.n(), this.f6503a).a();
            } catch (JSONException e3) {
                Log.e("UpdateMetadataTask", "Unable to parse a valid JSON object from resulting metadata:" + kVar.m(), e3);
                this.f6504b.setException(C0779n.d(e3));
                return;
            }
        }
        TaskCompletionSource taskCompletionSource = this.f6504b;
        if (taskCompletionSource != null) {
            kVar.a(taskCompletionSource, this.f6506d);
        }
    }
}
