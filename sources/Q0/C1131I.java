package q0;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: renamed from: q0.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1131I extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f10649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource f10650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C1123A f10651c;

    C1131I(C1123A c1123a, Activity activity, TaskCompletionSource taskCompletionSource) {
        Objects.requireNonNull(c1123a);
        this.f10651c = c1123a;
        this.f10649a = new WeakReference(activity);
        this.f10650b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f10649a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f10650b.setException(zzaen.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C1123A.d(context);
            return;
        }
        if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                C1123A.e(this.f10651c, intent, this.f10650b, context);
                return;
            }
            this.f10650b.setException(zzaen.zza(r.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            return;
        }
        if (i0.d(intent)) {
            this.f10650b.setException(zzaen.zza(i0.a(intent)));
            C1123A.d(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f10650b.setException(zzaen.zza(r.a("WEB_CONTEXT_CANCELED")));
            C1123A.d(context);
        }
    }
}
