package p1;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.InterfaceC0681i;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p1.AbstractC1068c0;

/* JADX INFO: loaded from: classes.dex */
public class Y implements AbstractC1068c0.m, AbstractC1068c0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Map f10366a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Map f10367b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Map f10368c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map f10369d = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(AbstractC1068c0.G g3, Task task) {
        if (task.isSuccessful()) {
            g3.a();
        } else {
            g3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(AbstractC1068c0.G g3, Task task) {
        if (task.isSuccessful()) {
            g3.a();
        } else {
            g3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(AbstractC1068c0.F f3, Task task) {
        if (!task.isSuccessful()) {
            f3.b(AbstractC1113w.e(task.getException()));
            return;
        }
        com.google.firebase.auth.L l3 = (com.google.firebase.auth.L) task.getResult();
        String string = UUID.randomUUID().toString();
        f10367b.put(string, l3);
        f3.a(new AbstractC1068c0.w.a().b(string).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.i((InterfaceC0681i) task.getResult()));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(AbstractC1068c0.G g3, Task task) {
        if (task.isSuccessful()) {
            g3.a();
        } else {
            g3.b(AbstractC1113w.e(task.getException()));
        }
    }

    @Override // p1.AbstractC1068c0.m
    public void a(AbstractC1068c0.C1070b c1070b, String str, String str2, final AbstractC1068c0.G g3) {
        try {
            l(c1070b).a((com.google.firebase.auth.I) f10369d.get(str), str2).addOnCompleteListener(new OnCompleteListener() { // from class: p1.V
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    Y.n(g3, task);
                }
            });
        } catch (N0.a e3) {
            g3.b(e3);
        }
    }

    @Override // p1.AbstractC1068c0.m
    public void b(AbstractC1068c0.C1070b c1070b, final AbstractC1068c0.F f3) {
        try {
            l(c1070b).c().addOnCompleteListener(new OnCompleteListener() { // from class: p1.U
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    Y.o(f3, task);
                }
            });
        } catch (N0.a e3) {
            f3.b(e3);
        }
    }

    @Override // p1.AbstractC1068c0.m
    public void c(AbstractC1068c0.C1070b c1070b, String str, final AbstractC1068c0.G g3) {
        try {
            l(c1070b).d(str).addOnCompleteListener(new OnCompleteListener() { // from class: p1.W
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    Y.q(g3, task);
                }
            });
        } catch (N0.a e3) {
            g3.b(AbstractC1113w.e(e3));
        }
    }

    @Override // p1.AbstractC1068c0.m
    public void d(AbstractC1068c0.C1070b c1070b, AbstractC1068c0.x xVar, String str, final AbstractC1068c0.G g3) {
        try {
            l(c1070b).a(com.google.firebase.auth.T.a(com.google.firebase.auth.Q.a(xVar.c(), xVar.b())), str).addOnCompleteListener(new OnCompleteListener() { // from class: p1.X
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    Y.m(g3, task);
                }
            });
        } catch (N0.a e3) {
            g3.b(e3);
        }
    }

    @Override // p1.AbstractC1068c0.m
    public void e(AbstractC1068c0.C1070b c1070b, AbstractC1068c0.F f3) {
        try {
            f3.a(j1.e(l(c1070b).b()));
        } catch (N0.a e3) {
            f3.b(e3);
        }
    }

    @Override // p1.AbstractC1068c0.h
    public void f(String str, AbstractC1068c0.x xVar, String str2, final AbstractC1068c0.F f3) {
        com.google.firebase.auth.K k3 = (com.google.firebase.auth.K) f10368c.get(str);
        if (k3 == null) {
            f3.b(AbstractC1113w.e(new Exception("Resolver not found")));
        } else {
            k3.v(xVar != null ? com.google.firebase.auth.T.a(com.google.firebase.auth.Q.a(xVar.c(), xVar.b())) : (com.google.firebase.auth.I) f10369d.get(str2)).addOnCompleteListener(new OnCompleteListener() { // from class: p1.T
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    Y.p(f3, task);
                }
            });
        }
    }

    com.google.firebase.auth.H l(AbstractC1068c0.C1070b c1070b) throws N0.a {
        com.google.firebase.auth.A aI = S.I(c1070b);
        if (aI == null) {
            throw new N0.a("No user is signed in");
        }
        Map map = f10366a;
        if (map.get(c1070b.b()) == null) {
            map.put(c1070b.b(), new HashMap());
        }
        Map map2 = (Map) map.get(c1070b.b());
        if (map2.get(aI.a()) == null) {
            map2.put(aI.a(), aI.v());
        }
        return (com.google.firebase.auth.H) map2.get(aI.a());
    }
}
