package com.google.firebase.auth;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.firebase.auth.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0694o0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f6103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C0673e f6104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ A f6105c;

    C0694o0(A a3, String str, C0673e c0673e) {
        this.f6103a = str;
        this.f6104b = c0673e;
        Objects.requireNonNull(a3);
        this.f6105c = a3;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f6105c.O()).Y((String) AbstractC0643s.k(((C) task.getResult()).g()), this.f6103a, this.f6104b);
    }
}
