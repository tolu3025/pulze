package q0;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C0697q;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class p0 implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f10775a;

    p0(C1126D c1126d, TaskCompletionSource taskCompletionSource) {
        this.f10775a = taskCompletionSource;
        Objects.requireNonNull(c1126d);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e(C1126D.f10627b, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", exc.getMessage()));
        if ((exc instanceof C0697q) && ((C0697q) exc).a().endsWith("UNAUTHORIZED_DOMAIN")) {
            this.f10775a.setException(exc);
        } else {
            this.f10775a.setResult(new u0().b());
        }
    }
}
