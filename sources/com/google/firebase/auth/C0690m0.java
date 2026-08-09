package com.google.firebase.auth;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.firebase.auth.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0690m0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C0673e f6100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A f6101b;

    C0690m0(A a3, C0673e c0673e) {
        this.f6100a = c0673e;
        Objects.requireNonNull(a3);
        this.f6101b = a3;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f6101b.O()).M(this.f6100a, (String) AbstractC0643s.k(((C) task.getResult()).g()));
    }
}
