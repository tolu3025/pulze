package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Objects;
import k0.C0999m;
import q0.C1126D;

/* JADX INFO: loaded from: classes.dex */
final class K0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ P f5954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f5955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f5956c;

    K0(FirebaseAuth firebaseAuth, P p2, String str) {
        this.f5954a = p2;
        this.f5955b = str;
        Objects.requireNonNull(firebaseAuth);
        this.f5956c = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", "Error while validating application identity: " + (exception != null ? exception.getMessage() : ""));
            if (exception != null && C1126D.i(exception)) {
                FirebaseAuth.l0((C0999m) exception, this.f5954a, this.f5955b);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
        }
        this.f5956c.k0(this.f5954a, (q0.r0) task.getResult());
    }
}
