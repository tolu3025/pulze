package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.integrity.internal.C0656f;
import com.google.android.play.integrity.internal.E;
import com.google.android.play.integrity.internal.G;

/* JADX INFO: loaded from: classes.dex */
final class as extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f5767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C0656f f5768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G f5769c = new G("RequestDialogCallbackImpl");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f5771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Activity f5772f;

    as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, C0656f c0656f) {
        this.f5770d = context.getPackageName();
        this.f5771e = kVar;
        this.f5767a = taskCompletionSource;
        this.f5772f = activity;
        this.f5768b = c0656f;
    }

    @Override // com.google.android.play.integrity.internal.F
    public final void b(Bundle bundle) {
        this.f5768b.v(this.f5767a);
        this.f5769c.d("onRequestDialog(%s)", this.f5770d);
        com.google.android.gms.common.api.b bVarA = this.f5771e.a(bundle);
        if (bVarA != null) {
            this.f5767a.trySetException(bVarA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f5769c.b("onRequestDialog(%s): got null dialog intent", this.f5770d);
            this.f5767a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f5772f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f5768b.c()));
        this.f5769c.a("Starting dialog intent...", new Object[0]);
        this.f5772f.startActivityForResult(intent, 0);
    }
}
