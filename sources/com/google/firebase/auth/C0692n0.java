package com.google.firebase.auth;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.firebase.auth.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0692n0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ A f6102a;

    C0692n0(A a3) {
        Objects.requireNonNull(a3);
        this.f6102a = a3;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f6102a.O()).M(null, (String) AbstractC0643s.k(((C) task.getResult()).g()));
    }
}
