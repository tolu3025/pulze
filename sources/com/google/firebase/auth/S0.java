package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class S0 implements Continuation {
    S0(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return (!task.isSuccessful() && (task.getException() instanceof C0697q) && ((C0697q) task.getException()).a().equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? Tasks.forResult(null) : task;
    }
}
