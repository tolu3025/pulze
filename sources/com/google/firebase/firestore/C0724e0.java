package com.google.firebase.firestore;

import J0.AbstractC0386b;
import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.firestore.C0726f0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.firestore.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0724e0 extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6328a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0726f0 f6329b = C0726f0.f6337g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f6330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Task f6331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Queue f6332e;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.firebase.firestore.e0$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Executor f6333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        InterfaceC0738l0 f6334b;

        a(Executor executor, InterfaceC0738l0 interfaceC0738l0) {
            this.f6333a = executor == null ? TaskExecutors.MAIN_THREAD : executor;
            this.f6334b = interfaceC0738l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(C0726f0 c0726f0) {
            this.f6334b.a(c0726f0);
        }

        public void b(final C0726f0 c0726f0) {
            this.f6333a.execute(new Runnable() { // from class: com.google.firebase.firestore.d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6324a.c(c0726f0);
                }
            });
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f6334b.equals(((a) obj).f6334b);
        }

        public int hashCode() {
            return this.f6334b.hashCode();
        }
    }

    public C0724e0() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6330c = taskCompletionSource;
        this.f6331d = taskCompletionSource.getTask();
        this.f6332e = new ArrayDeque();
    }

    public C0724e0 a(InterfaceC0738l0 interfaceC0738l0) {
        a aVar = new a(null, interfaceC0738l0);
        synchronized (this.f6328a) {
            this.f6332e.add(aVar);
        }
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        return this.f6331d.addOnCanceledListener(activity, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        return this.f6331d.addOnCompleteListener(activity, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        return this.f6331d.addOnFailureListener(activity, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        return this.f6331d.addOnSuccessListener(activity, onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0726f0 getResult() {
        return (C0726f0) this.f6331d.getResult();
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0726f0 getResult(Class cls) {
        return (C0726f0) this.f6331d.getResult(cls);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWith(Continuation continuation) {
        return this.f6331d.continueWith(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWithTask(Continuation continuation) {
        return this.f6331d.continueWithTask(continuation);
    }

    public void d(Exception exc) {
        synchronized (this.f6328a) {
            try {
                C0726f0 c0726f0 = new C0726f0(this.f6329b.d(), this.f6329b.g(), this.f6329b.c(), this.f6329b.f(), exc, C0726f0.a.ERROR);
                this.f6329b = c0726f0;
                Iterator it = this.f6332e.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).b(c0726f0);
                }
                this.f6332e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6330c.setException(exc);
    }

    public void e(C0726f0 c0726f0) {
        AbstractC0386b.d(c0726f0.e().equals(C0726f0.a.SUCCESS), "Expected success, but was " + c0726f0.e(), new Object[0]);
        synchronized (this.f6328a) {
            try {
                this.f6329b = c0726f0;
                Iterator it = this.f6332e.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).b(this.f6329b);
                }
                this.f6332e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6330c.setResult(c0726f0);
    }

    public void f(C0726f0 c0726f0) {
        synchronized (this.f6328a) {
            try {
                this.f6329b = c0726f0;
                Iterator it = this.f6332e.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).b(c0726f0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        return this.f6331d.getException();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return this.f6331d.isCanceled();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return this.f6331d.isComplete();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return this.f6331d.isSuccessful();
    }

    @Override // com.google.android.gms.tasks.Task
    public Task onSuccessTask(SuccessContinuation successContinuation) {
        return this.f6331d.onSuccessTask(successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnCanceledListener(OnCanceledListener onCanceledListener) {
        return this.f6331d.addOnCanceledListener(onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        return this.f6331d.addOnCompleteListener(onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnFailureListener(OnFailureListener onFailureListener) {
        return this.f6331d.addOnFailureListener(onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        return this.f6331d.addOnSuccessListener(onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWith(Executor executor, Continuation continuation) {
        return this.f6331d.continueWith(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWithTask(Executor executor, Continuation continuation) {
        return this.f6331d.continueWithTask(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        return this.f6331d.onSuccessTask(executor, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        return this.f6331d.addOnCanceledListener(executor, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        return this.f6331d.addOnCompleteListener(executor, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        return this.f6331d.addOnFailureListener(executor, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        return this.f6331d.addOnSuccessListener(executor, onSuccessListener);
    }
}
