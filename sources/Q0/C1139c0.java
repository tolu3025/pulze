package q0;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.Objects;

/* JADX INFO: renamed from: q0.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1139c0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ RecaptchaAction f10695a;

    C1139c0(C1135a0 c1135a0, RecaptchaAction recaptchaAction) {
        this.f10695a = recaptchaAction;
        Objects.requireNonNull(c1135a0);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask(this.f10695a);
        }
        Exception exc = (Exception) AbstractC0643s.k(task.getException());
        if (!(exc instanceof X)) {
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exc.getMessage());
        }
        return Tasks.forResult("");
    }
}
