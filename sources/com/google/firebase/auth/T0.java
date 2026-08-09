package com.google.firebase.auth;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import com.google.android.gms.internal.p002firebaseauthapi.zzaix;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;
import q0.C1147g0;

/* JADX INFO: loaded from: classes.dex */
final class T0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f6013a;

    T0(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.f6013a = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) AbstractC0643s.k(task.getException()));
        }
        zzair zzairVar = (zzair) task.getResult();
        if (zzairVar instanceof zzaix) {
            zzaix zzaixVar = (zzaix) zzairVar;
            return Tasks.forResult(new C1147g0(AbstractC0643s.e(zzaixVar.zzf()), AbstractC0643s.e(zzaixVar.zze()), zzaixVar.zzc(), zzaixVar.zzb(), zzaixVar.zzd(), AbstractC0643s.e(zzaixVar.zza()), this.f6013a));
        }
        throw new IllegalArgumentException("Response should be an instance of StartTotpMfaEnrollmentResponse but was " + zzairVar.getClass().getName() + ".");
    }
}
