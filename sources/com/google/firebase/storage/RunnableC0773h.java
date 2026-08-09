package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.firebase.storage.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0773h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f6564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TaskCompletionSource f6565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private P0.c f6566c;

    RunnableC0773h(p pVar, TaskCompletionSource taskCompletionSource) {
        AbstractC0643s.k(pVar);
        AbstractC0643s.k(taskCompletionSource);
        this.f6564a = pVar;
        this.f6565b = taskCompletionSource;
        if (pVar.r().o().equals(pVar.o())) {
            throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
        }
        C0771f c0771fS = this.f6564a.s();
        this.f6566c = new P0.c(c0771fS.a().m(), c0771fS.c(), c0771fS.b(), c0771fS.j());
    }

    private Uri a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("downloadTokens");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        String str = strOptString.split(",", -1)[0];
        Uri.Builder builderBuildUpon = this.f6564a.t().c().buildUpon();
        builderBuildUpon.appendQueryParameter("alt", "media");
        builderBuildUpon.appendQueryParameter("token", str);
        return builderBuildUpon.build();
    }

    @Override // java.lang.Runnable
    public void run() {
        Q0.b bVar = new Q0.b(this.f6564a.t(), this.f6564a.i());
        this.f6566c.d(bVar);
        Uri uriA = bVar.v() ? a(bVar.n()) : null;
        TaskCompletionSource taskCompletionSource = this.f6565b;
        if (taskCompletionSource != null) {
            bVar.a(taskCompletionSource, uriA);
        }
    }
}
