package com.google.firebase.storage;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.E;
import com.google.firebase.storage.L;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends AbstractC0768c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final HashMap f6447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final HashMap f6448k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f6449a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final L f6450b = new L(this, 128, new L.a() { // from class: com.google.firebase.storage.r
        @Override // com.google.firebase.storage.L.a
        public final void a(Object obj, Object obj2) {
            this.f6617a.P((OnSuccessListener) obj, (E.a) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final L f6451c = new L(this, 64, new L.a() { // from class: com.google.firebase.storage.v
        @Override // com.google.firebase.storage.L.a
        public final void a(Object obj, Object obj2) {
            this.f6621a.Q((OnFailureListener) obj, (E.a) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final L f6452d = new L(this, 448, new L.a() { // from class: com.google.firebase.storage.w
        @Override // com.google.firebase.storage.L.a
        public final void a(Object obj, Object obj2) {
            this.f6622a.R((OnCompleteListener) obj, (E.a) obj2);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final L f6453e = new L(this, 256, new L.a() { // from class: com.google.firebase.storage.x
        @Override // com.google.firebase.storage.L.a
        public final void a(Object obj, Object obj2) {
            this.f6623a.S((OnCanceledListener) obj, (E.a) obj2);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final L f6454f = new L(this, -465, new L.a() { // from class: com.google.firebase.storage.y
        @Override // com.google.firebase.storage.L.a
        public final void a(Object obj, Object obj2) {
            ((InterfaceC0778m) obj).a((E.a) obj2);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final L f6455g = new L(this, 16, new L.a() { // from class: com.google.firebase.storage.z
        @Override // com.google.firebase.storage.L.a
        public final void a(Object obj, Object obj2) {
            ((InterfaceC0777l) obj).a((E.a) obj2);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f6456h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f6457i;

    /* JADX INFO: Access modifiers changed from: protected */
    public interface a {
        Exception a();
    }

    public class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Exception f6458a;

        public b(Exception exc) {
            C0779n c0779nC;
            Status status;
            if (exc != null) {
                this.f6458a = exc;
                return;
            }
            if (E.this.isCanceled()) {
                status = Status.f5316o;
            } else {
                if (E.this.B() != 64) {
                    c0779nC = null;
                    this.f6458a = c0779nC;
                }
                status = Status.f5314m;
            }
            c0779nC = C0779n.c(status);
            this.f6458a = c0779nC;
        }

        @Override // com.google.firebase.storage.E.a
        public Exception a() {
            return this.f6458a;
        }

        public p b() {
            return c().I();
        }

        public E c() {
            return E.this;
        }
    }

    static {
        HashMap map = new HashMap();
        f6447j = map;
        HashMap map2 = new HashMap();
        f6448k = map2;
        map.put(1, new HashSet(Arrays.asList(16, 256)));
        map.put(2, new HashSet(Arrays.asList(8, 32)));
        map.put(4, new HashSet(Arrays.asList(8, 32)));
        map.put(16, new HashSet(Arrays.asList(2, 256)));
        map.put(64, new HashSet(Arrays.asList(2, 256)));
        map2.put(1, new HashSet(Arrays.asList(2, 64)));
        map2.put(2, new HashSet(Arrays.asList(4, 64, 128)));
        map2.put(4, new HashSet(Arrays.asList(4, 64, 128)));
        map2.put(8, new HashSet(Arrays.asList(16, 64, 128)));
        map2.put(32, new HashSet(Arrays.asList(256, 64, 128)));
    }

    protected E() {
    }

    private a A() {
        a aVar = this.f6457i;
        if (aVar != null) {
            return aVar;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.f6457i == null) {
            this.f6457i = g0();
        }
        return this.f6457i;
    }

    private String G(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 4 ? i3 != 8 ? i3 != 16 ? i3 != 32 ? i3 != 64 ? i3 != 128 ? i3 != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED";
    }

    private String H(int[] iArr) {
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 : iArr) {
            sb.append(G(i3));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Continuation continuation, TaskCompletionSource taskCompletionSource, Task task) {
        try {
            Object objThen = continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            taskCompletionSource.setResult(objThen);
        } catch (RuntimeExecutionException e3) {
            e = e3;
            if (e.getCause() instanceof Exception) {
                e = (Exception) e.getCause();
            }
            taskCompletionSource.setException(e);
        } catch (Exception e4) {
            taskCompletionSource.setException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, Task task) {
        try {
            Task task2 = (Task) continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.addOnSuccessListener(new s(taskCompletionSource));
            task2.addOnFailureListener(new t(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            task2.addOnCanceledListener(new u(cancellationTokenSource));
        } catch (RuntimeExecutionException e3) {
            e = e3;
            if (e.getCause() instanceof Exception) {
                e = (Exception) e.getCause();
            }
            taskCompletionSource.setException(e);
        } catch (Exception e4) {
            taskCompletionSource.setException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        try {
            e0();
        } finally {
            z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(OnSuccessListener onSuccessListener, a aVar) {
        F.b().c(this);
        onSuccessListener.onSuccess(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(OnFailureListener onFailureListener, a aVar) {
        F.b().c(this);
        onFailureListener.onFailure(aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(OnCompleteListener onCompleteListener, a aVar) {
        F.b().c(this);
        onCompleteListener.onComplete(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(OnCanceledListener onCanceledListener, a aVar) {
        F.b().c(this);
        onCanceledListener.onCanceled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, a aVar) {
        try {
            Task taskThen = successContinuation.then(aVar);
            Objects.requireNonNull(taskCompletionSource);
            taskThen.addOnSuccessListener(new s(taskCompletionSource));
            taskThen.addOnFailureListener(new t(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            taskThen.addOnCanceledListener(new u(cancellationTokenSource));
        } catch (RuntimeExecutionException e3) {
            e = e3;
            if (e.getCause() instanceof Exception) {
                e = (Exception) e.getCause();
            }
            taskCompletionSource.setException(e);
        } catch (Exception e4) {
            taskCompletionSource.setException(e4);
        }
    }

    private Task i0(Executor executor, final SuccessContinuation successContinuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f6450b.d(null, executor, new OnSuccessListener() { // from class: com.google.firebase.storage.D
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                E.T(successContinuation, taskCompletionSource, cancellationTokenSource, (E.a) obj);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task x(Executor executor, final Continuation continuation) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6452d.d(null, executor, new OnCompleteListener() { // from class: com.google.firebase.storage.A
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f6436a.M(continuation, taskCompletionSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task y(Executor executor, final Continuation continuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f6452d.d(null, executor, new OnCompleteListener() { // from class: com.google.firebase.storage.C
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f6440a.N(continuation, taskCompletionSource, cancellationTokenSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private void z() {
        if (isComplete() || L() || B() == 2 || j0(256, false)) {
            return;
        }
        j0(64, false);
    }

    int B() {
        return this.f6456h;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public a getResult() {
        if (A() == null) {
            throw new IllegalStateException();
        }
        Exception excA = A().a();
        if (excA == null) {
            return A();
        }
        throw new RuntimeExecutionException(excA);
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a getResult(Class cls) throws Throwable {
        if (A() == null) {
            throw new IllegalStateException();
        }
        if (cls.isInstance(A().a())) {
            throw ((Throwable) cls.cast(A().a()));
        }
        Exception excA = A().a();
        if (excA == null) {
            return A();
        }
        throw new RuntimeExecutionException(excA);
    }

    Runnable E() {
        return new Runnable() { // from class: com.google.firebase.storage.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f6439a.O();
            }
        };
    }

    public a F() {
        return g0();
    }

    abstract p I();

    Object J() {
        return this.f6449a;
    }

    public boolean K() {
        return (B() & (-465)) != 0;
    }

    public boolean L() {
        return (B() & 16) != 0;
    }

    protected void U() {
    }

    protected void V() {
    }

    protected void W() {
    }

    protected void X() {
    }

    protected void Y() {
    }

    protected void Z() {
    }

    public boolean a0() {
        return k0(new int[]{16, 8}, true);
    }

    boolean b0() {
        if (!j0(2, false)) {
            return false;
        }
        f0();
        return true;
    }

    void c0() {
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWith(Continuation continuation) {
        return x(null, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWithTask(Continuation continuation) {
        return y(null, continuation);
    }

    public boolean d0() {
        if (!j0(2, true)) {
            return false;
        }
        c0();
        f0();
        return true;
    }

    abstract void e0();

    abstract void f0();

    a g0() {
        a aVarH0;
        synchronized (this.f6449a) {
            aVarH0 = h0();
        }
        return aVarH0;
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        if (A() == null) {
            return null;
        }
        return A().a();
    }

    abstract a h0();

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public E addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        AbstractC0643s.k(onCanceledListener);
        AbstractC0643s.k(activity);
        this.f6453e.d(activity, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return B() == 256;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return (B() & 448) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return (B() & 128) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public E addOnCanceledListener(OnCanceledListener onCanceledListener) {
        AbstractC0643s.k(onCanceledListener);
        this.f6453e.d(null, null, onCanceledListener);
        return this;
    }

    boolean j0(int i3, boolean z2) {
        return k0(new int[]{i3}, z2);
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public E addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        AbstractC0643s.k(onCanceledListener);
        AbstractC0643s.k(executor);
        this.f6453e.d(null, executor, onCanceledListener);
        return this;
    }

    boolean k0(int[] iArr, boolean z2) {
        HashMap map = z2 ? f6447j : f6448k;
        synchronized (this.f6449a) {
            try {
                for (int i3 : iArr) {
                    HashSet hashSet = (HashSet) map.get(Integer.valueOf(B()));
                    if (hashSet != null && hashSet.contains(Integer.valueOf(i3))) {
                        this.f6456h = i3;
                        int i4 = this.f6456h;
                        if (i4 == 2) {
                            F.b().a(this);
                            Y();
                        } else if (i4 == 4) {
                            X();
                        } else if (i4 == 16) {
                            W();
                        } else if (i4 == 64) {
                            V();
                        } else if (i4 == 128) {
                            Z();
                        } else if (i4 == 256) {
                            U();
                        }
                        this.f6450b.h();
                        this.f6451c.h();
                        this.f6453e.h();
                        this.f6452d.h();
                        this.f6455g.h();
                        this.f6454f.h();
                        if (Log.isLoggable("StorageTask", 3)) {
                            Log.d("StorageTask", "changed internal state to: " + G(i3) + " isUser: " + z2 + " from state:" + G(this.f6456h));
                        }
                        return true;
                    }
                }
                Log.w("StorageTask", "unable to change internal state to: " + H(iArr) + " isUser: " + z2 + " from state:" + G(this.f6456h));
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public E addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        AbstractC0643s.k(onCompleteListener);
        AbstractC0643s.k(activity);
        this.f6452d.d(activity, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public E addOnCompleteListener(OnCompleteListener onCompleteListener) {
        AbstractC0643s.k(onCompleteListener);
        this.f6452d.d(null, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public E addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        AbstractC0643s.k(onCompleteListener);
        AbstractC0643s.k(executor);
        this.f6452d.d(null, executor, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public E addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        AbstractC0643s.k(onFailureListener);
        AbstractC0643s.k(activity);
        this.f6451c.d(activity, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task onSuccessTask(SuccessContinuation successContinuation) {
        return i0(null, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public E addOnFailureListener(OnFailureListener onFailureListener) {
        AbstractC0643s.k(onFailureListener);
        this.f6451c.d(null, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public E addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        AbstractC0643s.k(onFailureListener);
        AbstractC0643s.k(executor);
        this.f6451c.d(null, executor, onFailureListener);
        return this;
    }

    public E r(InterfaceC0777l interfaceC0777l) {
        AbstractC0643s.k(interfaceC0777l);
        this.f6455g.d(null, null, interfaceC0777l);
        return this;
    }

    public E s(InterfaceC0778m interfaceC0778m) {
        AbstractC0643s.k(interfaceC0778m);
        this.f6454f.d(null, null, interfaceC0778m);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public E addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        AbstractC0643s.k(activity);
        AbstractC0643s.k(onSuccessListener);
        this.f6450b.d(activity, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public E addOnSuccessListener(OnSuccessListener onSuccessListener) {
        AbstractC0643s.k(onSuccessListener);
        this.f6450b.d(null, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public E addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        AbstractC0643s.k(executor);
        AbstractC0643s.k(onSuccessListener);
        this.f6450b.d(null, executor, onSuccessListener);
        return this;
    }

    public boolean w() {
        return k0(new int[]{256, 32}, true);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWith(Executor executor, Continuation continuation) {
        return x(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWithTask(Executor executor, Continuation continuation) {
        return y(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        return i0(executor, successContinuation);
    }
}
