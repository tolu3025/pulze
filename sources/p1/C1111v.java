package p1;

import android.app.Activity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC0679h;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.InterfaceC0671d;
import com.google.firebase.auth.InterfaceC0681i;
import com.google.firebase.auth.N;
import g1.InterfaceC0872a;
import h1.InterfaceC0881a;
import h1.InterfaceC0883c;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import k0.C0992f;
import l1.C1018d;
import l1.InterfaceC1017c;
import p1.AbstractC1068c0;
import p1.i1;

/* JADX INFO: renamed from: p1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1111v implements FlutterFirebasePlugin, InterfaceC0872a, InterfaceC0881a, AbstractC1068c0.InterfaceC1071c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final HashMap f10594k = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1017c f10595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l1.k f10596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Activity f10597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f10598f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final S f10599g = new S();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Y f10600h = new Y();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1064a0 f10601i = new C1064a0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1066b0 f10602j = new C1066b0();

    private Activity W() {
        return this.f10597e;
    }

    static FirebaseAuth X(AbstractC1068c0.C1070b c1070b) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C0992f.p(c1070b.b()));
        if (c1070b.d() != null) {
            firebaseAuth.z(c1070b.d());
        }
        String str = (String) io.flutter.plugins.firebase.core.j.f7947e.get(c1070b.b());
        if (str != null) {
            firebaseAuth.x(str);
        }
        if (c1070b.c() != null) {
            firebaseAuth.x(c1070b.c());
        }
        return firebaseAuth;
    }

    private void Y(InterfaceC1017c interfaceC1017c) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_auth", this);
        this.f10596d = new l1.k(interfaceC1017c, "plugins.flutter.io/firebase_auth");
        A0.z(interfaceC1017c, this);
        P0.q(interfaceC1017c, this.f10599g);
        e1.h(interfaceC1017c, this.f10600h);
        R0.d(interfaceC1017c, this.f10600h);
        V0.f(interfaceC1017c, this.f10601i);
        Y0.e(interfaceC1017c, this.f10602j);
        this.f10595c = interfaceC1017c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z(AbstractC1068c0.G g3, Task task) {
        if (task.isSuccessful()) {
            g3.a();
        } else {
            g3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a0(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.f((InterfaceC0671d) task.getResult()));
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
    public static /* synthetic */ void c0(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.i((InterfaceC0681i) task.getResult()));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(TaskCompletionSource taskCompletionSource) {
        try {
            s0();
            f10594k.clear();
            taskCompletionSource.setResult(null);
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e0(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(((com.google.firebase.auth.X) task.getResult()).a());
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f0(C0992f c0992f, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap map = new HashMap();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c0992f);
            com.google.firebase.auth.A aM = firebaseAuth.m();
            String strP = firebaseAuth.p();
            AbstractC1068c0.B bJ = aM == null ? null : j1.j(aM);
            if (strP != null) {
                map.put("APP_LANGUAGE_CODE", strP);
            }
            if (bJ != null) {
                map.put("APP_CURRENT_USER", j1.c(bJ));
            }
            taskCompletionSource.setResult(map);
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g0(AbstractC1068c0.G g3, Task task) {
        if (task.isSuccessful()) {
            g3.a();
        } else {
            g3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h0(AbstractC1068c0.G g3, Task task) {
        if (task.isSuccessful()) {
            g3.a();
        } else {
            g3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i0(AbstractC1068c0.G g3, Task task) {
        if (task.isSuccessful()) {
            g3.a();
        } else {
            g3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j0(AbstractC1068c0.G g3, Task task) {
        if (task.isSuccessful()) {
            g3.a();
        } else {
            g3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k0(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.i((InterfaceC0681i) task.getResult()));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l0(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.i((InterfaceC0681i) task.getResult()));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m0(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.i((InterfaceC0681i) task.getResult()));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n0(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.i((InterfaceC0681i) task.getResult()));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o0(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.i((InterfaceC0681i) task.getResult()));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p0(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a(j1.i((InterfaceC0681i) task.getResult()));
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q0(AbstractC1068c0.F f3, Task task) {
        if (task.isSuccessful()) {
            f3.a((String) task.getResult());
        } else {
            f3.b(AbstractC1113w.e(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r0(com.google.firebase.auth.O o2) {
        f10594k.put(Integer.valueOf(o2.hashCode()), o2);
    }

    private void s0() {
        for (C1018d c1018d : this.f10598f.keySet()) {
            C1018d.InterfaceC0147d interfaceC0147d = (C1018d.InterfaceC0147d) this.f10598f.get(c1018d);
            if (interfaceC0147d != null) {
                interfaceC0147d.b(null);
            }
            c1018d.d(null);
        }
        this.f10598f.clear();
    }

    @Override // g1.InterfaceC0872a
    public void A(InterfaceC0872a.b bVar) {
        Y(bVar.b());
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void B(AbstractC1068c0.C1070b c1070b, String str, final AbstractC1068c0.F f3) {
        X(c1070b).C(str).addOnCompleteListener(new OnCompleteListener() { // from class: p1.j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.m0(f3, task);
            }
        });
    }

    @Override // h1.InterfaceC0881a
    public void C() {
        this.f10597e = null;
        this.f10599g.d0(null);
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void a(AbstractC1068c0.C1070b c1070b, String str, final AbstractC1068c0.G g3) {
        X(c1070b).g(str).addOnCompleteListener(new OnCompleteListener() { // from class: p1.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.Z(g3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void b(AbstractC1068c0.C1070b c1070b, AbstractC1068c0.G g3) {
        Map map;
        try {
            FirebaseAuth firebaseAuthX = X(c1070b);
            if (firebaseAuthX.m() != null && (map = (Map) Y.f10366a.get(c1070b.b())) != null) {
                map.remove(firebaseAuthX.m().a());
            }
            firebaseAuthX.F();
            g3.a();
        } catch (Exception e3) {
            g3.b(e3);
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void c(AbstractC1068c0.C1070b c1070b, String str, final AbstractC1068c0.F f3) {
        X(c1070b).h(str).addOnCompleteListener(new OnCompleteListener() { // from class: p1.k
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.a0(f3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void d(AbstractC1068c0.C1070b c1070b, Map map, final AbstractC1068c0.F f3) {
        FirebaseAuth firebaseAuthX = X(c1070b);
        AbstractC0679h abstractC0679hB = j1.b(map);
        if (abstractC0679hB == null) {
            throw AbstractC1113w.b();
        }
        firebaseAuthX.B(abstractC0679hB).addOnCompleteListener(new OnCompleteListener() { // from class: p1.l
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.l0(f3, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p1.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f10384a.d0(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void e(AbstractC1068c0.C1070b c1070b, String str, String str2, final AbstractC1068c0.F f3) {
        X(c1070b).E(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: p1.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.o0(f3, task);
            }
        });
    }

    @Override // h1.InterfaceC0881a
    public void f(InterfaceC0883c interfaceC0883c) {
        Activity activityD = interfaceC0883c.d();
        this.f10597e = activityD;
        this.f10599g.d0(activityD);
    }

    @Override // h1.InterfaceC0881a
    public void g(InterfaceC0883c interfaceC0883c) {
        Activity activityD = interfaceC0883c.d();
        this.f10597e = activityD;
        this.f10599g.d0(activityD);
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task getPluginConstantsForFirebaseApp(final C0992f c0992f) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p1.m
            @Override // java.lang.Runnable
            public final void run() {
                C1111v.f0(c0992f, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void h(AbstractC1068c0.C1070b c1070b, AbstractC1068c0.F f3) {
        try {
            FirebaseAuth firebaseAuthX = X(c1070b);
            g1 g1Var = new g1(firebaseAuthX);
            String str = "plugins.flutter.io/firebase_auth/id-token/" + firebaseAuthX.l().q();
            C1018d c1018d = new C1018d(this.f10595c, str);
            c1018d.d(g1Var);
            this.f10598f.put(c1018d, g1Var);
            f3.a(str);
        } catch (Exception e3) {
            f3.b(e3);
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void i(AbstractC1068c0.C1070b c1070b, String str, Long l3, AbstractC1068c0.G g3) {
        try {
            X(c1070b).I(str, l3.intValue());
            g3.a();
        } catch (Exception e3) {
            g3.b(e3);
        }
    }

    @Override // h1.InterfaceC0881a
    public void j() {
        this.f10597e = null;
        this.f10599g.d0(null);
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void k(AbstractC1068c0.C1070b c1070b, String str, AbstractC1068c0.F f3) {
        try {
            FirebaseAuth firebaseAuthX = X(c1070b);
            if (str == null) {
                firebaseAuthX.H();
            } else {
                firebaseAuthX.y(str);
            }
            f3.a(firebaseAuthX.p());
        } catch (Exception e3) {
            f3.b(e3);
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void l(AbstractC1068c0.C1070b c1070b, String str, AbstractC1068c0.q qVar, final AbstractC1068c0.G g3) {
        X(c1070b).w(str, j1.a(qVar)).addOnCompleteListener(new OnCompleteListener() { // from class: p1.p
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.j0(g3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void m(AbstractC1068c0.C1070b c1070b, final AbstractC1068c0.F f3) {
        X(c1070b).A().addOnCompleteListener(new OnCompleteListener() { // from class: p1.q
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.k0(f3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void n(AbstractC1068c0.C1070b c1070b, String str, AbstractC1068c0.G g3) {
        g3.a();
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void o(AbstractC1068c0.C1070b c1070b, String str, String str2, final AbstractC1068c0.F f3) {
        X(c1070b).D(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: p1.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.n0(f3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void p(AbstractC1068c0.C1070b c1070b, String str, final AbstractC1068c0.F f3) {
        X(c1070b).k(str).addOnCompleteListener(new OnCompleteListener() { // from class: p1.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.e0(f3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void q(AbstractC1068c0.C1070b c1070b, String str, String str2, final AbstractC1068c0.F f3) {
        X(c1070b).j(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: p1.u
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.c0(f3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void r(AbstractC1068c0.C1070b c1070b, final AbstractC1068c0.G g3) {
        X(c1070b).r().addOnCompleteListener(new OnCompleteListener() { // from class: p1.s
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.g0(g3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void s(AbstractC1068c0.C1070b c1070b, AbstractC1068c0.t tVar, AbstractC1068c0.G g3) {
        try {
            FirebaseAuth firebaseAuthX = X(c1070b);
            firebaseAuthX.o().b(tVar.b().booleanValue());
            if (tVar.c() != null) {
                firebaseAuthX.o().a(tVar.c().booleanValue());
            }
            if (tVar.d() != null && tVar.e() != null) {
                firebaseAuthX.o().c(tVar.d(), tVar.e());
            }
            g3.a();
        } catch (Exception e3) {
            g3.b(e3);
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void t(AbstractC1068c0.C1070b c1070b, String str, final AbstractC1068c0.F f3) {
        X(c1070b).J(str).addOnCompleteListener(new OnCompleteListener() { // from class: p1.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.q0(f3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void u(AbstractC1068c0.C1070b c1070b, AbstractC1068c0.y yVar, final AbstractC1068c0.F f3) {
        FirebaseAuth firebaseAuthX = X(c1070b);
        N.a aVarE = com.google.firebase.auth.N.e(yVar.c(), firebaseAuthX);
        if (yVar.d() != null) {
            aVarE.c(yVar.d());
        }
        if (yVar.b() != null) {
            aVarE.a(yVar.b());
        }
        firebaseAuthX.G(W(), aVarE.b()).addOnCompleteListener(new OnCompleteListener() { // from class: p1.n
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.p0(f3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void v(AbstractC1068c0.C1070b c1070b, AbstractC1068c0.F f3) {
        try {
            FirebaseAuth firebaseAuthX = X(c1070b);
            C1065b c1065b = new C1065b(firebaseAuthX);
            String str = "plugins.flutter.io/firebase_auth/auth-state/" + firebaseAuthX.l().q();
            C1018d c1018d = new C1018d(this.f10595c, str);
            c1018d.d(c1065b);
            this.f10598f.put(c1018d, c1065b);
            f3.a(str);
        } catch (Exception e3) {
            f3.b(e3);
        }
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void w(AbstractC1068c0.C1070b c1070b, String str, String str2, final AbstractC1068c0.G g3) {
        X(c1070b).i(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: p1.o
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1111v.b0(g3, task);
            }
        });
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void x(AbstractC1068c0.C1070b c1070b, AbstractC1068c0.E e3, AbstractC1068c0.F f3) {
        try {
            String str = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
            C1018d c1018d = new C1018d(this.f10595c, str);
            com.google.firebase.auth.U u2 = null;
            com.google.firebase.auth.L l3 = e3.e() != null ? (com.google.firebase.auth.L) Y.f10367b.get(e3.e()) : null;
            String strD = e3.d();
            if (strD != null) {
                Iterator it = Y.f10368c.keySet().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((com.google.firebase.auth.K) Y.f10368c.get((String) it.next())).t().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            com.google.firebase.auth.J j3 = (com.google.firebase.auth.J) it2.next();
                            if (j3.a().equals(strD) && (j3 instanceof com.google.firebase.auth.U)) {
                                u2 = (com.google.firebase.auth.U) j3;
                                break;
                            }
                        }
                    }
                }
            }
            i1 i1Var = new i1(W(), c1070b, e3, l3, u2, new i1.b() { // from class: p1.t
                @Override // p1.i1.b
                public final void a(com.google.firebase.auth.O o2) {
                    C1111v.r0(o2);
                }
            });
            c1018d.d(i1Var);
            this.f10598f.put(c1018d, i1Var);
            f3.a(str);
        } catch (Exception e4) {
            f3.b(e4);
        }
    }

    @Override // g1.InterfaceC0872a
    public void y(InterfaceC0872a.b bVar) {
        this.f10596d.e(null);
        A0.z(this.f10595c, null);
        P0.q(this.f10595c, null);
        e1.h(this.f10595c, null);
        R0.d(this.f10595c, null);
        V0.f(this.f10595c, null);
        Y0.e(this.f10595c, null);
        this.f10596d = null;
        this.f10595c = null;
        s0();
    }

    @Override // p1.AbstractC1068c0.InterfaceC1071c
    public void z(AbstractC1068c0.C1070b c1070b, String str, AbstractC1068c0.q qVar, final AbstractC1068c0.G g3) {
        Task taskV;
        OnCompleteListener onCompleteListener;
        FirebaseAuth firebaseAuthX = X(c1070b);
        if (qVar == null) {
            taskV = firebaseAuthX.u(str);
            onCompleteListener = new OnCompleteListener() { // from class: p1.h
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1111v.h0(g3, task);
                }
            };
        } else {
            taskV = firebaseAuthX.v(str, j1.a(qVar));
            onCompleteListener = new OnCompleteListener() { // from class: p1.i
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1111v.i0(g3, task);
                }
            };
        }
        taskV.addOnCompleteListener(onCompleteListener);
    }
}
