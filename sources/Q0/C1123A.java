package q0;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC0679h;
import com.google.firebase.auth.FirebaseAuth;
import x.C1269a;

/* JADX INFO: renamed from: q0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1123A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1123A f10615c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10616a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f10617b;

    private C1123A() {
    }

    private static AbstractC0679h a(Intent intent) {
        AbstractC0643s.k(intent);
        return com.google.firebase.auth.E0.z(((zzajb) N.e.b(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzajb.CREATOR)).zzc(true));
    }

    public static C1123A b() {
        if (f10615c == null) {
            f10615c = new C1123A();
        }
        return f10615c;
    }

    private final void c(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f10617b = broadcastReceiver;
        C1269a.b(activity).c(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    static void d(Context context) {
        C1123A c1123a = f10615c;
        c1123a.f10616a = false;
        if (c1123a.f10617b != null) {
            C1269a.b(context).e(f10615c.f10617b);
        }
        f10615c.f10617b = null;
    }

    static /* synthetic */ void e(C1123A c1123a, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        d(context);
    }

    public final boolean h(Activity activity, TaskCompletionSource taskCompletionSource) {
        if (this.f10616a) {
            return false;
        }
        c(activity, new C1131I(this, activity, taskCompletionSource));
        this.f10616a = true;
        return true;
    }

    public final boolean i(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        return j(activity, taskCompletionSource, firebaseAuth, null);
    }

    public final boolean j(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, com.google.firebase.auth.A a3) {
        if (this.f10616a) {
            return false;
        }
        c(activity, new C1129G(this, activity, taskCompletionSource, firebaseAuth, a3));
        this.f10616a = true;
        return true;
    }
}
