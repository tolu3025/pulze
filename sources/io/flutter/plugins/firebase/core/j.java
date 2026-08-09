package io.flutter.plugins.firebase.core;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g1.InterfaceC0872a;
import io.flutter.plugins.firebase.core.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k0.C0992f;
import k0.C1001o;

/* JADX INFO: loaded from: classes.dex */
public class j implements InterfaceC0872a, m.d, m.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Map f7947e = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7949d = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            C0992f.p(str).E(bool.booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    private void C(TaskCompletionSource taskCompletionSource, final m.f fVar) {
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.core.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                j.v(fVar, task);
            }
        });
    }

    private void D(TaskCompletionSource taskCompletionSource, final m.g gVar) {
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.core.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                j.w(gVar, task);
            }
        });
    }

    private Task p(final C0992f c0992f) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f7944a.s(c0992f, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private m.a q(C1001o c1001o) {
        m.a.C0131a c0131a = new m.a.C0131a();
        c0131a.b(c1001o.b());
        c0131a.c(c1001o.c());
        if (c1001o.f() != null) {
            c0131a.e(c1001o.f());
        }
        if (c1001o.g() != null) {
            c0131a.f(c1001o.g());
        }
        c0131a.d(c1001o.d());
        c0131a.g(c1001o.h());
        c0131a.h(c1001o.e());
        return c0131a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(String str, TaskCompletionSource taskCompletionSource) {
        try {
            try {
                C0992f.p(str).j();
            } catch (IllegalStateException unused) {
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(C0992f c0992f, TaskCompletionSource taskCompletionSource) {
        try {
            m.b.a aVar = new m.b.a();
            aVar.c(c0992f.q());
            aVar.d(q(c0992f.r()));
            aVar.b(Boolean.valueOf(c0992f.x()));
            aVar.e((Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(c0992f)));
            taskCompletionSource.setResult(aVar.a());
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(m.a aVar, String str, TaskCompletionSource taskCompletionSource) {
        try {
            C1001o c1001oA = new C1001o.b().b(aVar.b()).c(aVar.c()).d(aVar.e()).f(aVar.f()).g(aVar.g()).h(aVar.h()).e(aVar.i()).a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            if (aVar.d() != null) {
                f7947e.put(str, aVar.d());
            }
            taskCompletionSource.setResult((m.b) Tasks.await(p(C0992f.w(this.f7948c, c1001oA, str))));
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(TaskCompletionSource taskCompletionSource) {
        try {
            if (this.f7949d) {
                Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.f7949d = true;
            }
            List listN = C0992f.n(this.f7948c);
            ArrayList arrayList = new ArrayList(listN.size());
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                arrayList.add((m.b) Tasks.await(p((C0992f) it.next())));
            }
            taskCompletionSource.setResult(arrayList);
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(m.f fVar, Task task) {
        if (task.isSuccessful()) {
            fVar.a(task.getResult());
        } else {
            fVar.b(task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(m.g gVar, Task task) {
        if (task.isSuccessful()) {
            gVar.a();
        } else {
            gVar.b(task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(TaskCompletionSource taskCompletionSource) {
        try {
            C1001o c1001oA = C1001o.a(this.f7948c);
            if (c1001oA == null) {
                taskCompletionSource.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
            } else {
                taskCompletionSource.setResult(q(c1001oA));
            }
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            C0992f.p(str).F(bool);
            taskCompletionSource.setResult(null);
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    @Override // g1.InterfaceC0872a
    public void A(InterfaceC0872a.b bVar) {
        u.e(bVar.b(), this);
        q.e(bVar.b(), this);
        this.f7948c = bVar.a();
    }

    @Override // io.flutter.plugins.firebase.core.m.d
    public void a(m.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f7940a.u(taskCompletionSource);
            }
        });
        C(taskCompletionSource, fVar);
    }

    @Override // io.flutter.plugins.firebase.core.m.c
    public void b(final String str, final Boolean bool, m.g gVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.c
            @Override // java.lang.Runnable
            public final void run() {
                j.z(str, bool, taskCompletionSource);
            }
        });
        D(taskCompletionSource, gVar);
    }

    @Override // io.flutter.plugins.firebase.core.m.d
    public void c(m.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f7936a.x(taskCompletionSource);
            }
        });
        C(taskCompletionSource, fVar);
    }

    @Override // io.flutter.plugins.firebase.core.m.c
    public void d(final String str, final Boolean bool, m.g gVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.b
            @Override // java.lang.Runnable
            public final void run() {
                j.B(str, bool, taskCompletionSource);
            }
        });
        D(taskCompletionSource, gVar);
    }

    @Override // io.flutter.plugins.firebase.core.m.d
    public void e(final String str, final m.a aVar, m.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f7926a.t(aVar, str, taskCompletionSource);
            }
        });
        C(taskCompletionSource, fVar);
    }

    @Override // io.flutter.plugins.firebase.core.m.c
    public void f(final String str, m.g gVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.e
            @Override // java.lang.Runnable
            public final void run() {
                j.r(str, taskCompletionSource);
            }
        });
        D(taskCompletionSource, gVar);
    }

    @Override // g1.InterfaceC0872a
    public void y(InterfaceC0872a.b bVar) {
        this.f7948c = null;
        u.e(bVar.b(), null);
        q.e(bVar.b(), null);
    }
}
