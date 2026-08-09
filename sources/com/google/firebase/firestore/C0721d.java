package com.google.firebase.firestore;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.firebase.firestore.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0721d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0 f6322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f6323b;

    C0721d(D0 d02, List list) {
        this.f6322a = d02;
        this.f6323b = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task e(A0.S s2) {
        return s2.o0(this.f6322a.f6176a, this.f6323b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object f(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(new C0723e(this, (Map) task.getResult()));
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    public Task c(EnumC0725f enumC0725f) {
        J0.C.c(enumC0725f, "AggregateSource must not be null");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Task) this.f6322a.f6177b.s(new J0.y() { // from class: com.google.firebase.firestore.b
            @Override // J0.y
            public final Object c(Object obj) {
                return this.f6316a.e((A0.S) obj);
            }
        })).continueWith(J0.s.f2500b, new Continuation() { // from class: com.google.firebase.firestore.c
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f6320a.f(taskCompletionSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    public D0 d() {
        return this.f6322a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0721d)) {
            return false;
        }
        C0721d c0721d = (C0721d) obj;
        return this.f6322a.equals(c0721d.f6322a) && this.f6323b.equals(c0721d.f6323b);
    }

    public int hashCode() {
        return Objects.hash(this.f6322a, this.f6323b);
    }
}
