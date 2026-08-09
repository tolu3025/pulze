package p1;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AbstractC0679h;
import com.google.firebase.auth.C0676f0;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.InterfaceC0681i;
import com.google.firebase.auth.N;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.Map;
import k0.C0992f;
import p1.AbstractC1068c0;

/* JADX INFO: loaded from: classes.dex */
public class S implements AbstractC1068c0.InterfaceC1073e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f10349a;

    public static com.google.firebase.auth.A I(AbstractC1068c0.C1070b c1070b) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C0992f.p(c1070b.b()));
        if (c1070b.d() != null) {
            firebaseAuth.z(c1070b.d());
        }
        return firebaseAuth.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J(AbstractC1068c0.G g3, Task task) {
        if (task.isSuccessful()) {
            g3.a();
        } else {
            g3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(AbstractC1068c0.C1070b c1070b, AbstractC1068c0.F f3, Boolean bool) {
        com.google.firebase.auth.A aI = I(c1070b);
        if (aI == null) {
            f3.b(AbstractC1113w.d());
            return;
        }
        try {
            f3.a(j1.l((com.google.firebase.auth.C) Tasks.await(aI.t(bool.booleanValue()))));
        } catch (Exception e3) {
            f3.b(AbstractC1113w.e(e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.i((InterfaceC0681i) task.getResult()));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.i((InterfaceC0681i) task.getResult()));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.i((InterfaceC0681i) task.getResult()));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.i((InterfaceC0681i) task.getResult()));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(AbstractC1068c0.F f3, com.google.firebase.auth.A a3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.j(a3));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(AbstractC1068c0.G g3, Task task) {
        if (task.isSuccessful()) {
            g3.a();
        } else {
            g3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R(AbstractC1068c0.G g3, Task task) {
        if (task.isSuccessful()) {
            g3.a();
        } else {
            g3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.i((InterfaceC0681i) task.getResult()));
        } else {
            Exception exception = task.getException();
            f3.b(exception.getMessage().contains("User was not linked to an account with the given provider.") ? AbstractC1113w.c() : AbstractC1113w.e(exception));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(AbstractC1068c0.F f3, com.google.firebase.auth.A a3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.j(a3));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U(final com.google.firebase.auth.A a3, final AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            a3.B().addOnCompleteListener(new OnCompleteListener() { // from class: p1.G
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    S.T(f3, a3, task2);
                }
            });
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V(AbstractC1068c0.F f3, com.google.firebase.auth.A a3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.j(a3));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W(final com.google.firebase.auth.A a3, final AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            a3.B().addOnCompleteListener(new OnCompleteListener() { // from class: p1.E
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    S.V(f3, a3, task2);
                }
            });
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void X(AbstractC1068c0.F f3, com.google.firebase.auth.A a3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.j(a3));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y(final com.google.firebase.auth.A a3, final AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            a3.B().addOnCompleteListener(new OnCompleteListener() { // from class: p1.H
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    S.X(f3, a3, task2);
                }
            });
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z(AbstractC1068c0.F f3, com.google.firebase.auth.A a3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.j(a3));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a0(final com.google.firebase.auth.A a3, final AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            a3.B().addOnCompleteListener(new OnCompleteListener() { // from class: p1.F
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    S.Z(f3, a3, task2);
                }
            });
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b0(AbstractC1068c0.G g3, Task task) {
        if (task.isSuccessful()) {
            g3.a();
        } else {
            g3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c0(AbstractC1068c0.G g3, Task task) {
        if (task.isSuccessful()) {
            g3.a();
        } else {
            g3.b(AbstractC1113w.e(task.getException()));
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void a(AbstractC1068c0.C1070b c1070b, AbstractC1068c0.y yVar, final AbstractC1068c0.F f3) {
        com.google.firebase.auth.A aI = I(c1070b);
        N.a aVarD = com.google.firebase.auth.N.d(yVar.c());
        if (yVar.d() != null) {
            aVarD.c(yVar.d());
        }
        if (yVar.b() != null) {
            aVarD.a(yVar.b());
        }
        aI.F(this.f10349a, aVarD.b()).addOnCompleteListener(new OnCompleteListener() { // from class: p1.Q
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                S.O(f3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void b(AbstractC1068c0.C1070b c1070b, final AbstractC1068c0.G g3) {
        com.google.firebase.auth.A aI = I(c1070b);
        if (aI == null) {
            g3.b(AbstractC1113w.d());
        } else {
            aI.s().addOnCompleteListener(new OnCompleteListener() { // from class: p1.P
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    S.J(g3, task);
                }
            });
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void c(AbstractC1068c0.C1070b c1070b, String str, AbstractC1068c0.q qVar, final AbstractC1068c0.G g3) {
        com.google.firebase.auth.A aI = I(c1070b);
        if (aI == null) {
            g3.b(AbstractC1113w.d());
        } else if (qVar == null) {
            aI.L(str).addOnCompleteListener(new OnCompleteListener() { // from class: p1.L
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    S.b0(g3, task);
                }
            });
        } else {
            aI.M(str, j1.a(qVar)).addOnCompleteListener(new OnCompleteListener() { // from class: p1.M
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    S.c0(g3, task);
                }
            });
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void d(AbstractC1068c0.C1070b c1070b, String str, final AbstractC1068c0.F f3) {
        com.google.firebase.auth.A aI = I(c1070b);
        if (aI == null) {
            f3.b(AbstractC1113w.d());
        } else {
            aI.G(str).addOnCompleteListener(new OnCompleteListener() { // from class: p1.O
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    S.S(f3, task);
                }
            });
        }
    }

    public void d0(Activity activity) {
        this.f10349a = activity;
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void e(final AbstractC1068c0.C1070b c1070b, final Boolean bool, final AbstractC1068c0.F f3) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p1.z
            @Override // java.lang.Runnable
            public final void run() {
                S.K(c1070b, f3, bool);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void f(AbstractC1068c0.C1070b c1070b, AbstractC1068c0.y yVar, final AbstractC1068c0.F f3) {
        com.google.firebase.auth.A aI = I(c1070b);
        N.a aVarD = com.google.firebase.auth.N.d(yVar.c());
        if (yVar.d() != null) {
            aVarD.c(yVar.d());
        }
        if (yVar.b() != null) {
            aVarD.a(yVar.b());
        }
        aI.E(this.f10349a, aVarD.b()).addOnCompleteListener(new OnCompleteListener() { // from class: p1.x
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                S.M(f3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void g(AbstractC1068c0.C1070b c1070b, String str, final AbstractC1068c0.F f3) {
        final com.google.firebase.auth.A aI = I(c1070b);
        if (aI == null) {
            f3.b(AbstractC1113w.d());
        } else {
            aI.H(str).addOnCompleteListener(new OnCompleteListener() { // from class: p1.C
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    S.U(aI, f3, task);
                }
            });
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void h(AbstractC1068c0.C1070b c1070b, AbstractC1068c0.q qVar, final AbstractC1068c0.G g3) {
        com.google.firebase.auth.A aI = I(c1070b);
        if (aI == null) {
            g3.b(AbstractC1113w.d());
        } else if (qVar == null) {
            aI.C().addOnCompleteListener(new OnCompleteListener() { // from class: p1.I
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    S.Q(g3, task);
                }
            });
        } else {
            aI.D(j1.a(qVar)).addOnCompleteListener(new OnCompleteListener() { // from class: p1.J
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    S.R(g3, task);
                }
            });
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void i(AbstractC1068c0.C1070b c1070b, String str, final AbstractC1068c0.F f3) {
        final com.google.firebase.auth.A aI = I(c1070b);
        if (aI == null) {
            f3.b(AbstractC1113w.d());
        } else {
            aI.I(str).addOnCompleteListener(new OnCompleteListener() { // from class: p1.B
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    S.W(aI, f3, task);
                }
            });
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void j(AbstractC1068c0.C1070b c1070b, Map map, final AbstractC1068c0.F f3) {
        final com.google.firebase.auth.A aI = I(c1070b);
        if (aI == null) {
            f3.b(AbstractC1113w.d());
            return;
        }
        com.google.firebase.auth.O o2 = (com.google.firebase.auth.O) j1.b(map);
        if (o2 == null) {
            f3.b(AbstractC1113w.b());
        } else {
            aI.J(o2).addOnCompleteListener(new OnCompleteListener() { // from class: p1.A
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    S.Y(aI, f3, task);
                }
            });
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void k(AbstractC1068c0.C1070b c1070b, AbstractC1068c0.D d3, final AbstractC1068c0.F f3) {
        final com.google.firebase.auth.A aI = I(c1070b);
        if (aI == null) {
            f3.b(AbstractC1113w.d());
            return;
        }
        C0676f0.a aVar = new C0676f0.a();
        if (d3.c().booleanValue()) {
            aVar.b(d3.b());
        }
        if (d3.e().booleanValue()) {
            aVar.c(d3.d() != null ? Uri.parse(d3.d()) : null);
        }
        aI.K(aVar.a()).addOnCompleteListener(new OnCompleteListener() { // from class: p1.N
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                S.a0(aI, f3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void l(AbstractC1068c0.C1070b c1070b, Map map, final AbstractC1068c0.F f3) {
        com.google.firebase.auth.A aI = I(c1070b);
        AbstractC0679h abstractC0679hB = j1.b(map);
        if (aI == null) {
            f3.b(AbstractC1113w.d());
        } else if (abstractC0679hB == null) {
            f3.b(AbstractC1113w.b());
        } else {
            aI.z(abstractC0679hB).addOnCompleteListener(new OnCompleteListener() { // from class: p1.K
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    S.L(f3, task);
                }
            });
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void m(AbstractC1068c0.C1070b c1070b, Map map, final AbstractC1068c0.F f3) {
        com.google.firebase.auth.A aI = I(c1070b);
        AbstractC0679h abstractC0679hB = j1.b(map);
        if (aI == null) {
            f3.b(AbstractC1113w.d());
        } else if (abstractC0679hB == null) {
            f3.b(AbstractC1113w.b());
        } else {
            aI.A(abstractC0679hB).addOnCompleteListener(new OnCompleteListener() { // from class: p1.D
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    S.N(f3, task);
                }
            });
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1073e
    public void n(AbstractC1068c0.C1070b c1070b, final AbstractC1068c0.F f3) {
        final com.google.firebase.auth.A aI = I(c1070b);
        if (aI == null) {
            f3.b(AbstractC1113w.d());
        } else {
            aI.B().addOnCompleteListener(new OnCompleteListener() { // from class: p1.y
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    S.P(f3, aI, task);
                }
            });
        }
    }
}
