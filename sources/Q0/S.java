package q0;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {
    static /* synthetic */ Task a(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) AbstractC0643s.k(task.getException());
        if (zzaen.zzd(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + String.valueOf(recaptchaAction));
            }
            if (firebaseAuth.q0() == null) {
                firebaseAuth.m0(new C1135a0(firebaseAuth.l(), firebaseAuth));
            }
            return d(firebaseAuth.q0(), recaptchaAction, str, continuation);
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
        return Tasks.forException(exc);
    }

    private static Task d(C1135a0 c1135a0, RecaptchaAction recaptchaAction, String str, Continuation continuation) {
        Task taskB = c1135a0.b(str, Boolean.FALSE, recaptchaAction);
        return taskB.continueWithTask(continuation).continueWithTask(new W(str, c1135a0, recaptchaAction, continuation));
    }

    public final Task b(final FirebaseAuth firebaseAuth, final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: q0.T
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                String str3;
                S s2 = this.f10666a;
                if (task.isSuccessful()) {
                    str3 = (String) task.getResult();
                } else {
                    Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) AbstractC0643s.k(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
                    str3 = "NO_RECAPTCHA";
                }
                return s2.c(str3);
            }
        };
        C1135a0 c1135a0Q0 = firebaseAuth.q0();
        return (c1135a0Q0 == null || !c1135a0Q0.e(str2)) ? c(null).continueWithTask(new Continuation() { // from class: q0.U
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return S.a(recaptchaAction, firebaseAuth, str, continuation, task);
            }
        }) : d(c1135a0Q0, recaptchaAction, str, continuation);
    }

    public abstract Task c(String str);
}
