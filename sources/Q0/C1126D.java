package q0;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.internal.p002firebaseauthapi.zzafz;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.C0697q;
import com.google.firebase.auth.C0702t;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: renamed from: q0.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1126D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f10627b = "D";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1126D f10628c = new C1126D();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10629a;

    private C1126D() {
    }

    public static C1126D b() {
        return f10628c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z2, boolean z3, final k0 k0Var, final TaskCompletionSource taskCompletionSource) {
        if (!z2 || z3) {
            d(firebaseAuth, k0Var, activity, taskCompletionSource);
        } else {
            (!TextUtils.isEmpty(this.f10629a) ? Tasks.forResult(new zzahr(this.f10629a)) : firebaseAuth.K()).continueWithTask(firebaseAuth.C0(), new m0(this, str, IntegrityManagerFactory.create(firebaseAuth.l().m()))).addOnCompleteListener(new OnCompleteListener() { // from class: q0.l0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1126D.f(this.f10752a, taskCompletionSource, firebaseAuth, k0Var, activity, task);
                }
            });
        }
    }

    private final void d(FirebaseAuth firebaseAuth, k0 k0Var, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task task;
        if (activity == null) {
            taskCompletionSource.setException(new C0702t());
            return;
        }
        O.d(firebaseAuth.l().m(), firebaseAuth);
        AbstractC0643s.k(activity);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (C1123A.b().h(activity, taskCompletionSource2)) {
            new zzafz(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        } else {
            task = Tasks.forException(zzaen.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        }
        task.addOnSuccessListener(new o0(this, taskCompletionSource)).addOnFailureListener(new p0(this, taskCompletionSource));
    }

    public static /* synthetic */ void e(C1126D c1126d, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, RecaptchaAction recaptchaAction, String str, Activity activity, boolean z2, boolean z3, k0 k0Var, Task task) {
        if (!task.isSuccessful()) {
            Log.e(f10627b, "Failed to initialize reCAPTCHA config: " + task.getException().getMessage());
        }
        if (firebaseAuth.q0() == null || !firebaseAuth.q0().e("PHONE_PROVIDER")) {
            c1126d.c(firebaseAuth, str, activity, z2, z3, k0Var, taskCompletionSource);
        } else {
            firebaseAuth.q0().b(firebaseAuth.q(), Boolean.FALSE, recaptchaAction).addOnSuccessListener(new n0(c1126d, taskCompletionSource)).addOnFailureListener(new C1141d0(c1126d, firebaseAuth, str, activity, z2, z3, k0Var, taskCompletionSource));
        }
    }

    public static /* synthetic */ void f(C1126D c1126d, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, k0 k0Var, Activity activity, Task task) {
        if (task.isSuccessful() && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new u0().a(((IntegrityTokenResponse) task.getResult()).token()).b());
            return;
        }
        String message = task.getException() == null ? "" : task.getException().getMessage();
        Log.e(f10627b, "Play Integrity Token fetch failed, falling back to Recaptcha" + message);
        c1126d.d(firebaseAuth, k0Var, activity, taskCompletionSource);
    }

    public static boolean i(Exception exc) {
        if (exc instanceof C0702t) {
            return true;
        }
        return (exc instanceof C0697q) && ((C0697q) exc).a().endsWith("UNAUTHORIZED_DOMAIN");
    }

    public final Task a(final FirebaseAuth firebaseAuth, final String str, final Activity activity, final boolean z2, boolean z3, boolean z4, final RecaptchaAction recaptchaAction) {
        q0 u0Var;
        C1144f c1144f = (C1144f) firebaseAuth.o();
        final k0 k0VarF = k0.f();
        if (!zzagl.zza(firebaseAuth.l()) && !c1144f.h()) {
            String str2 = f10627b;
            Log.i(str2, "ForceRecaptchaV2Flow from phoneAuthOptions = " + z3 + ", ForceRecaptchav2Flow from firebaseSettings = " + c1144f.f());
            boolean z5 = z3 || c1144f.f();
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            Task taskE = k0VarF.e();
            if (taskE != null) {
                if (taskE.isSuccessful()) {
                    u0Var = new u0().d((String) taskE.getResult());
                } else {
                    Log.e(str2, "Error in previous reCAPTCHAV2 flow: " + taskE.getException().getMessage());
                    Log.e(str2, "Continuing with application verification as normal");
                }
            }
            if (z5 || z4) {
                c(firebaseAuth, str, activity, z2, z5, k0VarF, taskCompletionSource);
            } else {
                final boolean z6 = false;
                firebaseAuth.r().addOnCompleteListener(new OnCompleteListener() { // from class: q0.c
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        C1126D.e(this.f10686a, taskCompletionSource, firebaseAuth, recaptchaAction, str, activity, z2, z6, k0VarF, task);
                    }
                });
            }
            return taskCompletionSource.getTask();
        }
        u0Var = new u0();
        return Tasks.forResult(u0Var.b());
    }
}
