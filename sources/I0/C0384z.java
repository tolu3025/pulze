package I0;

import J0.AbstractC0386b;
import J0.C0391g;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.T;
import y0.AbstractC1279a;
import y1.AbstractC1289A;
import y1.AbstractC1304g;
import y1.Z;
import y1.l0;

/* JADX INFO: renamed from: I0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0384z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Z.g f2381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Z.g f2382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Z.g f2383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile String f2384j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0391g f2385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1279a f2386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1279a f2387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I f2388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f2389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final J f2390f;

    /* JADX INFO: renamed from: I0.z$b */
    class b extends AbstractC1289A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1304g[] f2394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Task f2395b;

        b(AbstractC1304g[] abstractC1304gArr, Task task) {
            this.f2394a = abstractC1304gArr;
            this.f2395b = task;
        }

        @Override // y1.AbstractC1289A, y1.f0, y1.AbstractC1304g
        public void b() {
            if (this.f2394a[0] == null) {
                this.f2395b.addOnSuccessListener(C0384z.this.f2385a.o(), new OnSuccessListener() { // from class: I0.A
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        ((AbstractC1304g) obj).b();
                    }
                });
            } else {
                super.b();
            }
        }

        @Override // y1.AbstractC1289A, y1.f0
        protected AbstractC1304g f() {
            AbstractC0386b.d(this.f2394a[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
            return this.f2394a[0];
        }
    }

    /* JADX INFO: renamed from: I0.z$c */
    class c extends AbstractC1304g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f2397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1304g f2398b;

        c(e eVar, AbstractC1304g abstractC1304g) {
            this.f2397a = eVar;
            this.f2398b = abstractC1304g;
        }

        @Override // y1.AbstractC1304g.a
        public void a(l0 l0Var, y1.Z z2) {
            this.f2397a.a(l0Var);
        }

        @Override // y1.AbstractC1304g.a
        public void c(Object obj) {
            this.f2397a.b(obj);
            this.f2398b.c(1);
        }
    }

    /* JADX INFO: renamed from: I0.z$d */
    class d extends AbstractC1304g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f2400a;

        d(TaskCompletionSource taskCompletionSource) {
            this.f2400a = taskCompletionSource;
        }

        @Override // y1.AbstractC1304g.a
        public void a(l0 l0Var, y1.Z z2) {
            if (!l0Var.o()) {
                this.f2400a.setException(C0384z.this.f(l0Var));
            } else {
                if (this.f2400a.getTask().isComplete()) {
                    return;
                }
                this.f2400a.setException(new com.google.firebase.firestore.T("Received onClose with status OK, but no message.", T.a.INTERNAL));
            }
        }

        @Override // y1.AbstractC1304g.a
        public void c(Object obj) {
            this.f2400a.setResult(obj);
        }
    }

    /* JADX INFO: renamed from: I0.z$e */
    public static abstract class e {
        public abstract void a(l0 l0Var);

        public abstract void b(Object obj);
    }

    static {
        Z.d dVar = y1.Z.f11842e;
        f2381g = Z.g.e("x-goog-api-client", dVar);
        f2382h = Z.g.e("google-cloud-resource-prefix", dVar);
        f2383i = Z.g.e("x-goog-request-params", dVar);
        f2384j = "gl-java/";
    }

    C0384z(C0391g c0391g, AbstractC1279a abstractC1279a, AbstractC1279a abstractC1279a2, D0.f fVar, J j3, I i3) {
        this.f2385a = c0391g;
        this.f2390f = j3;
        this.f2386b = abstractC1279a;
        this.f2387c = abstractC1279a2;
        this.f2388d = i3;
        this.f2389e = String.format("projects/%s/databases/%s", fVar.i(), fVar.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.firebase.firestore.T f(l0 l0Var) {
        return r.h(l0Var) ? new com.google.firebase.firestore.T("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", T.a.g(l0Var.m().g()), l0Var.l()) : J0.L.o(l0Var);
    }

    private String g() {
        return String.format("%s fire/%s grpc/", f2384j, "26.2.0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(AbstractC1304g[] abstractC1304gArr, K k3, Task task) {
        AbstractC1304g abstractC1304g = (AbstractC1304g) task.getResult();
        abstractC1304gArr[0] = abstractC1304g;
        abstractC1304g.e(new a(k3, abstractC1304gArr), l());
        k3.a();
        abstractC1304gArr[0].c(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(TaskCompletionSource taskCompletionSource, Object obj, Task task) {
        AbstractC1304g abstractC1304g = (AbstractC1304g) task.getResult();
        abstractC1304g.e(new d(taskCompletionSource), l());
        abstractC1304g.c(2);
        abstractC1304g.d(obj);
        abstractC1304g.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(e eVar, Object obj, Task task) {
        AbstractC1304g abstractC1304g = (AbstractC1304g) task.getResult();
        abstractC1304g.e(new c(eVar, abstractC1304g), l());
        abstractC1304g.c(1);
        abstractC1304g.d(obj);
        abstractC1304g.b();
    }

    private y1.Z l() {
        y1.Z z2 = new y1.Z();
        z2.p(f2381g, g());
        z2.p(f2382h, this.f2389e);
        z2.p(f2383i, this.f2389e);
        J j3 = this.f2390f;
        if (j3 != null) {
            j3.a(z2);
        }
        return z2;
    }

    public static void p(String str) {
        f2384j = str;
    }

    public void h() {
        this.f2386b.b();
        this.f2387c.b();
    }

    AbstractC1304g m(y1.a0 a0Var, final K k3) {
        final AbstractC1304g[] abstractC1304gArr = {null};
        Task taskI = this.f2388d.i(a0Var);
        taskI.addOnCompleteListener(this.f2385a.o(), new OnCompleteListener() { // from class: I0.w
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f2372a.i(abstractC1304gArr, k3, task);
            }
        });
        return new b(abstractC1304gArr, taskI);
    }

    Task n(y1.a0 a0Var, final Object obj) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2388d.i(a0Var).addOnCompleteListener(this.f2385a.o(), new OnCompleteListener() { // from class: I0.y
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f2378a.j(taskCompletionSource, obj, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    void o(y1.a0 a0Var, final Object obj, final e eVar) {
        this.f2388d.i(a0Var).addOnCompleteListener(this.f2385a.o(), new OnCompleteListener() { // from class: I0.x
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f2375a.k(eVar, obj, task);
            }
        });
    }

    public void q() {
        this.f2388d.u();
    }

    /* JADX INFO: renamed from: I0.z$a */
    class a extends AbstractC1304g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ K f2391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1304g[] f2392b;

        a(K k3, AbstractC1304g[] abstractC1304gArr) {
            this.f2391a = k3;
            this.f2392b = abstractC1304gArr;
        }

        @Override // y1.AbstractC1304g.a
        public void a(l0 l0Var, y1.Z z2) {
            try {
                this.f2391a.b(l0Var);
            } catch (Throwable th) {
                C0384z.this.f2385a.u(th);
            }
        }

        @Override // y1.AbstractC1304g.a
        public void b(y1.Z z2) {
            try {
                this.f2391a.c(z2);
            } catch (Throwable th) {
                C0384z.this.f2385a.u(th);
            }
        }

        @Override // y1.AbstractC1304g.a
        public void c(Object obj) {
            try {
                this.f2391a.d(obj);
                this.f2392b[0].c(1);
            } catch (Throwable th) {
                C0384z.this.f2385a.u(th);
            }
        }

        @Override // y1.AbstractC1304g.a
        public void d() {
        }
    }
}
