package A0;

import J0.C0391g;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.T;
import com.google.firebase.firestore.T0;

/* JADX INFO: loaded from: classes.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0391g f288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private I0.U f289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private J0.y f290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private J0.u f292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TaskCompletionSource f293f = new TaskCompletionSource();

    public u0(C0391g c0391g, I0.U u2, T0 t02, J0.y yVar) {
        this.f288a = c0391g;
        this.f289b = u2;
        this.f290c = yVar;
        this.f291d = t02.a();
        this.f292e = new J0.u(c0391g, C0391g.d.RETRY_TRANSACTION);
    }

    private void d(Task task) {
        if (this.f291d <= 0 || !e(task.getException())) {
            this.f293f.setException(task.getException());
        } else {
            j();
        }
    }

    private static boolean e(Exception exc) {
        if (!(exc instanceof com.google.firebase.firestore.T)) {
            return false;
        }
        com.google.firebase.firestore.T t2 = (com.google.firebase.firestore.T) exc;
        T.a aVarA = t2.a();
        return aVarA == T.a.ABORTED || aVarA == T.a.ALREADY_EXISTS || aVarA == T.a.FAILED_PRECONDITION || !I0.r.i(t2.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Task task, Task task2) {
        if (task2.isSuccessful()) {
            this.f293f.setResult(task.getResult());
        } else {
            d(task2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(q0 q0Var, final Task task) {
        if (task.isSuccessful()) {
            q0Var.c().addOnCompleteListener(this.f288a.o(), new OnCompleteListener() { // from class: A0.r0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    this.f278a.f(task, task2);
                }
            });
        } else {
            d(task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        final q0 q0VarP = this.f289b.p();
        ((Task) this.f290c.c(q0VarP)).addOnCompleteListener(this.f288a.o(), new OnCompleteListener() { // from class: A0.t0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f286a.g(q0VarP, task);
            }
        });
    }

    private void j() {
        this.f291d--;
        this.f292e.b(new Runnable() { // from class: A0.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f283a.h();
            }
        });
    }

    public Task i() {
        j();
        return this.f293f.getTask();
    }
}
