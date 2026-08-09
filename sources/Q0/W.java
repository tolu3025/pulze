package q0;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* JADX INFO: loaded from: classes.dex */
final class W implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C1135a0 f10672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ RecaptchaAction f10673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Continuation f10674d;

    W(String str, C1135a0 c1135a0, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f10671a = str;
        this.f10672b = c1135a0;
        this.f10673c = recaptchaAction;
        this.f10674d = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful() || !zzaen.zzc((Exception) AbstractC0643s.k(task.getException()))) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + this.f10671a);
        }
        return this.f10672b.b(this.f10671a, Boolean.TRUE, this.f10673c).continueWithTask(this.f10674d);
    }
}
