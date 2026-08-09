package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C0656f;
import com.google.android.play.integrity.internal.G;
import com.google.android.play.integrity.internal.N;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0656f f5812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G f5813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f5815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final at f5816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f5817f;

    bn(Context context, G g3, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f5815d = taskCompletionSource;
        this.f5814c = context.getPackageName();
        this.f5813b = g3;
        this.f5816e = atVar;
        this.f5817f = kVar;
        C0656f c0656f = new C0656f(context, g3, "ExpressIntegrityService", bo.f5818a, new N() { // from class: com.google.android.play.core.integrity.bd
            @Override // com.google.android.play.integrity.internal.N
            public final Object a(IBinder iBinder) {
                return com.google.android.play.integrity.internal.v.b(iBinder);
            }
        }, null);
        this.f5812a = c0656f;
        c0656f.c().post(new be(this, taskCompletionSource, context));
    }

    static /* bridge */ /* synthetic */ Bundle a(bn bnVar, String str, long j3, long j4, int i3) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f5814c);
        bundle.putLong("cloud.prj", j3);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j4);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.r.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.r.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j3, int i3) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f5814c);
        bundle.putLong("cloud.prj", j3);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.r.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.r.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f5815d.getTask().isSuccessful() && ((Integer) bnVar.f5815d.getTask().getResult()).intValue() == 0;
    }

    final Task c(Activity activity, Bundle bundle) {
        int i3 = bundle.getInt("dialog.intent.type");
        this.f5813b.d("requestAndShowDialog(%s)", Integer.valueOf(i3));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f5812a.t(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i3), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j3, long j4, int i3) {
        this.f5813b.d("requestExpressIntegrityToken(%s)", Long.valueOf(j4));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f5812a.t(new bg(this, taskCompletionSource, 0, str, j3, j4, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j3, int i3) {
        this.f5813b.d("warmUpIntegrityToken(%s)", Long.valueOf(j3));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f5812a.t(new bf(this, taskCompletionSource, 0, j3, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
