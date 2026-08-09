package com.google.firebase.auth;

import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.firebase.auth.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0680h0 implements Continuation {
    C0680h0(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        return Tasks.forException(new C0697q("INTERNAL_ERROR", zzac.zzb(exception != null ? exception.getMessage() : "")));
    }
}
