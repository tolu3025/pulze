package q0;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: renamed from: q0.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1129G extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f10639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource f10640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FirebaseAuth f10641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.auth.A f10642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C1123A f10643e;

    C1129G(C1123A c1123a, Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, com.google.firebase.auth.A a3) {
        Objects.requireNonNull(c1123a);
        this.f10643e = c1123a;
        this.f10639a = new WeakReference(activity);
        this.f10640b = taskCompletionSource;
        this.f10641c = firebaseAuth;
        this.f10642d = a3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f10639a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f10640b.setException(zzaen.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C1123A.d(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            if (i0.d(intent)) {
                this.f10640b.setException(zzaen.zza(i0.a(intent)));
                C1123A.d(context);
                return;
            } else {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    this.f10640b.setException(zzaen.zza(r.a("WEB_CONTEXT_CANCELED")));
                    C1123A.d(context);
                    return;
                }
                return;
            }
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            C1123A c1123a = this.f10643e;
            TaskCompletionSource taskCompletionSource = this.f10640b;
            this.f10641c.B(C1123A.a(intent)).addOnSuccessListener(new C1125C(c1123a, taskCompletionSource, context)).addOnFailureListener(new C1166z(c1123a, taskCompletionSource, context));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
            C1123A c1123a2 = this.f10643e;
            TaskCompletionSource taskCompletionSource2 = this.f10640b;
            this.f10642d.z(C1123A.a(intent)).addOnSuccessListener(new C1128F(c1123a2, taskCompletionSource2, context)).addOnFailureListener(new C1124B(c1123a2, taskCompletionSource2, context));
        } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            C1123A c1123a3 = this.f10643e;
            TaskCompletionSource taskCompletionSource3 = this.f10640b;
            this.f10642d.A(C1123A.a(intent)).addOnSuccessListener(new C1130H(c1123a3, taskCompletionSource3, context)).addOnFailureListener(new C1127E(c1123a3, taskCompletionSource3, context));
        } else {
            this.f10640b.setException(zzaen.zza(r.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
