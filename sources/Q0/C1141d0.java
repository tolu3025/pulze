package q0;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: renamed from: q0.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1141d0 implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f10696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Activity f10698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f10699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f10700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ k0 f10701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f10702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ C1126D f10703h;

    C1141d0(C1126D c1126d, FirebaseAuth firebaseAuth, String str, Activity activity, boolean z2, boolean z3, k0 k0Var, TaskCompletionSource taskCompletionSource) {
        this.f10696a = firebaseAuth;
        this.f10697b = str;
        this.f10698c = activity;
        this.f10699d = z2;
        this.f10700e = z3;
        this.f10701f = k0Var;
        this.f10702g = taskCompletionSource;
        Objects.requireNonNull(c1126d);
        this.f10703h = c1126d;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e(C1126D.f10627b, "Failed to get reCAPTCHA enterprise token: " + exc.getMessage() + "\n\n Using fallback methods.");
        if (this.f10696a.q0().d("PHONE_PROVIDER")) {
            this.f10703h.c(this.f10696a, this.f10697b, this.f10698c, this.f10699d, this.f10700e, this.f10701f, this.f10702g);
        } else {
            this.f10702g.setResult(new u0().b());
        }
    }
}
