package t1;

import I1.n;
import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.C0771f;
import com.google.firebase.storage.C0775j;
import com.google.firebase.storage.o;
import g1.InterfaceC0872a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import k0.C0992f;
import l1.C1018d;
import l1.InterfaceC1017c;
import t1.H;
import t1.InterfaceC1245t;

/* JADX INFO: loaded from: classes.dex */
public final class G implements FlutterFirebasePlugin, InterfaceC0872a, InterfaceC1245t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11334e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f11335f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f11336g = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l1.k f11337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC1017c f11338d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final Map a() {
            return G.f11335f;
        }

        public final Map b(Exception exception) {
            kotlin.jvm.internal.m.e(exception, "exception");
            C1247v c1247vC = C1248w.c(exception);
            HashMap map = new HashMap();
            map.put("code", c1247vC.a());
            String message = c1247vC.getMessage();
            if (message == null) {
                message = "";
            }
            map.put("message", message);
            return map;
        }

        public final Map c() {
            return G.f11336g;
        }

        public final Map d(com.google.firebase.storage.o oVar) {
            if (oVar == null) {
                return null;
            }
            HashMap map = new HashMap();
            String strD = oVar.D();
            if (strD != null) {
                map.put("name", strD);
            }
            String strR = oVar.r();
            if (strR != null) {
                map.put("bucket", strR);
            }
            String strA = oVar.A();
            if (strA != null) {
                map.put("generation", strA);
            }
            String strC = oVar.C();
            if (strC != null) {
                map.put("metadataGeneration", strC);
            }
            map.put("fullPath", oVar.E());
            map.put("size", Long.valueOf(oVar.F()));
            map.put("creationTimeMillis", Long.valueOf(oVar.x()));
            map.put("updatedTimeMillis", Long.valueOf(oVar.G()));
            String strB = oVar.B();
            if (strB != null) {
                map.put("md5Hash", strB);
            }
            String strS = oVar.s();
            if (strS != null) {
                map.put("cacheControl", strS);
            }
            String strT = oVar.t();
            if (strT != null) {
                map.put("contentDisposition", strT);
            }
            String strU = oVar.u();
            if (strU != null) {
                map.put("contentEncoding", strU);
            }
            String strV = oVar.v();
            if (strV != null) {
                map.put("contentLanguage", strV);
            }
            String strW = oVar.w();
            if (strW != null) {
                map.put("contentType", strW);
            }
            HashMap map2 = new HashMap();
            for (String str : oVar.z()) {
                String strY = oVar.y(str);
                if (strY == null) {
                    strY = "";
                }
                map2.put(str, strY);
            }
            map.put("customMetadata", map2);
            return map;
        }
    }

    private final L G(C0775j c0775j) {
        List<com.google.firebase.storage.p> listB = c0775j.b();
        kotlin.jvm.internal.m.d(listB, "getItems(...)");
        ArrayList arrayList = new ArrayList(J1.q.n(listB, 10));
        for (com.google.firebase.storage.p pVar : listB) {
            kotlin.jvm.internal.m.b(pVar);
            arrayList.add(I(pVar));
        }
        List<com.google.firebase.storage.p> listD = c0775j.d();
        kotlin.jvm.internal.m.d(listD, "getPrefixes(...)");
        ArrayList arrayList2 = new ArrayList(J1.q.n(listD, 10));
        for (com.google.firebase.storage.p pVar2 : listD) {
            kotlin.jvm.internal.m.b(pVar2);
            arrayList2.add(I(pVar2));
        }
        return new L(arrayList, c0775j.c(), arrayList2);
    }

    private final J H(com.google.firebase.storage.o oVar) {
        return new J(f11334e.d(oVar));
    }

    private final O I(com.google.firebase.storage.p pVar) {
        String strJ = pVar.j();
        kotlin.jvm.internal.m.d(strJ, "getBucket(...)");
        String strQ = pVar.q();
        kotlin.jvm.internal.m.d(strQ, "getPath(...)");
        String strO = pVar.o();
        kotlin.jvm.internal.m.d(strO, "getName(...)");
        return new O(strJ, strQ, strO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(TaskCompletionSource taskCompletionSource, G this$0) {
        kotlin.jvm.internal.m.e(taskCompletionSource, "$taskCompletionSource");
        kotlin.jvm.internal.m.e(this$0, "this$0");
        H.f11339l.a();
        taskCompletionSource.setResult(null);
        this$0.X();
    }

    private final com.google.firebase.storage.o K(M m3) {
        o.b bVar = new o.b();
        String strE = m3.e();
        if (strE != null) {
            bVar.h(strE);
        }
        String strA = m3.a();
        if (strA != null) {
            bVar.d(strA);
        }
        String strB = m3.b();
        if (strB != null) {
            bVar.e(strB);
        }
        String strC = m3.c();
        if (strC != null) {
            bVar.f(strC);
        }
        String strD = m3.d();
        if (strD != null) {
            bVar.g(strD);
        }
        Map mapF = m3.f();
        if (mapF != null) {
            for (Map.Entry entry : mapF.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str != null && str2 != null) {
                    bVar.i(str, str2);
                }
            }
        }
        com.google.firebase.storage.o oVarA = bVar.a();
        kotlin.jvm.internal.m.d(oVarA, "build(...)");
        return oVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(TaskCompletionSource taskCompletionSource) {
        kotlin.jvm.internal.m.e(taskCompletionSource, "$taskCompletionSource");
        taskCompletionSource.setResult(new HashMap());
    }

    private final com.google.firebase.storage.p M(N n3, O o2) {
        com.google.firebase.storage.p pVarN = N(n3).n(o2.a());
        kotlin.jvm.internal.m.d(pVarN, "getReference(...)");
        return pVarN;
    }

    private final C0771f N(N n3) {
        C0992f c0992fP = C0992f.p(n3.a());
        kotlin.jvm.internal.m.d(c0992fP, "getInstance(...)");
        C0771f c0771fF = C0771f.f(c0992fP, "gs://" + n3.b());
        kotlin.jvm.internal.m.d(c0771fF, "getInstance(...)");
        return c0771fF;
    }

    private final void O(InterfaceC1017c interfaceC1017c) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_storage", this);
        this.f11337c = new l1.k(interfaceC1017c, "plugins.flutter.io/firebase_storage");
        InterfaceC1245t.f11431a.u(interfaceC1017c, this);
        this.f11338d = interfaceC1017c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(U1.l callback, Task task) {
        Object objA;
        kotlin.jvm.internal.m.e(callback, "$callback");
        kotlin.jvm.internal.m.e(task, "task");
        if (task.isSuccessful()) {
            n.a aVar = I1.n.f2411b;
            objA = I1.u.f2419a;
        } else {
            n.a aVar2 = I1.n.f2411b;
            objA = I1.o.a(C1248w.c(task.getException()));
        }
        callback.invoke(I1.n.a(I1.n.b(objA)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(U1.l callback, Task task) {
        Object objA;
        kotlin.jvm.internal.m.e(callback, "$callback");
        kotlin.jvm.internal.m.e(task, "task");
        if (task.isSuccessful()) {
            n.a aVar = I1.n.f2411b;
            objA = task.getResult();
        } else {
            n.a aVar2 = I1.n.f2411b;
            objA = I1.o.a(C1248w.c(task.getException()));
        }
        callback.invoke(I1.n.a(I1.n.b(objA)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(U1.l callback, Task task) {
        Object objA;
        kotlin.jvm.internal.m.e(callback, "$callback");
        kotlin.jvm.internal.m.e(task, "task");
        if (task.isSuccessful()) {
            n.a aVar = I1.n.f2411b;
            objA = ((Uri) task.getResult()).toString();
        } else {
            n.a aVar2 = I1.n.f2411b;
            objA = I1.o.a(C1248w.c(task.getException()));
        }
        callback.invoke(I1.n.a(I1.n.b(objA)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(U1.l callback, G this$0, Task task) {
        Object objA;
        kotlin.jvm.internal.m.e(callback, "$callback");
        kotlin.jvm.internal.m.e(this$0, "this$0");
        kotlin.jvm.internal.m.e(task, "task");
        if (task.isSuccessful()) {
            n.a aVar = I1.n.f2411b;
            objA = this$0.H((com.google.firebase.storage.o) task.getResult());
        } else {
            n.a aVar2 = I1.n.f2411b;
            objA = I1.o.a(C1248w.c(task.getException()));
        }
        callback.invoke(I1.n.a(I1.n.b(objA)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(U1.l callback, G this$0, Task t2) {
        Object objA;
        kotlin.jvm.internal.m.e(callback, "$callback");
        kotlin.jvm.internal.m.e(this$0, "this$0");
        kotlin.jvm.internal.m.e(t2, "t");
        if (t2.isSuccessful()) {
            n.a aVar = I1.n.f2411b;
            Object result = t2.getResult();
            kotlin.jvm.internal.m.d(result, "getResult(...)");
            objA = this$0.G((C0775j) result);
        } else {
            n.a aVar2 = I1.n.f2411b;
            objA = I1.o.a(C1248w.c(t2.getException()));
        }
        callback.invoke(I1.n.a(I1.n.b(objA)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(U1.l callback, G this$0, Task task) {
        Object objA;
        kotlin.jvm.internal.m.e(callback, "$callback");
        kotlin.jvm.internal.m.e(this$0, "this$0");
        kotlin.jvm.internal.m.e(task, "task");
        if (task.isSuccessful()) {
            n.a aVar = I1.n.f2411b;
            Object result = task.getResult();
            kotlin.jvm.internal.m.d(result, "getResult(...)");
            objA = this$0.G((C0775j) result);
        } else {
            n.a aVar2 = I1.n.f2411b;
            objA = I1.o.a(C1248w.c(task.getException()));
        }
        callback.invoke(I1.n.a(I1.n.b(objA)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(U1.l callback, G this$0, Task task) {
        Object objA;
        kotlin.jvm.internal.m.e(callback, "$callback");
        kotlin.jvm.internal.m.e(this$0, "this$0");
        kotlin.jvm.internal.m.e(task, "task");
        if (task.isSuccessful()) {
            n.a aVar = I1.n.f2411b;
            objA = this$0.H((com.google.firebase.storage.o) task.getResult());
        } else {
            n.a aVar2 = I1.n.f2411b;
            objA = I1.o.a(C1248w.c(task.getException()));
        }
        callback.invoke(I1.n.a(I1.n.b(objA)));
    }

    private final String W(String str, String str2, C1018d.InterfaceC0147d interfaceC0147d) {
        C1018d c1018d = new C1018d(this.f11338d, str + "/" + str2);
        c1018d.d(interfaceC0147d);
        f11335f.put(str2, c1018d);
        f11336g.put(str2, interfaceC0147d);
        return str2;
    }

    private final synchronized void X() {
        try {
            for (String str : new ArrayList(f11335f.keySet())) {
                Map map = f11335f;
                C1018d c1018d = (C1018d) map.get(str);
                if (c1018d != null) {
                    c1018d.d(null);
                }
                map.remove(str);
            }
            for (String str2 : new ArrayList(f11336g.keySet())) {
                Map map2 = f11336g;
                C1018d.InterfaceC0147d interfaceC0147d = (C1018d.InterfaceC0147d) map2.get(str2);
                if (interfaceC0147d instanceof W) {
                    ((W) interfaceC0147d).b(null);
                }
                map2.remove(str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final byte[] Y(String str, int i3) {
        int i4;
        if (i3 == 1) {
            i4 = 0;
        } else {
            if (i3 != 2) {
                return null;
            }
            i4 = 8;
        }
        return Base64.decode(str, i4);
    }

    @Override // g1.InterfaceC0872a
    public void A(InterfaceC0872a.b binding) {
        kotlin.jvm.internal.m.e(binding, "binding");
        InterfaceC1017c interfaceC1017cB = binding.b();
        kotlin.jvm.internal.m.d(interfaceC1017cB, "getBinaryMessenger(...)");
        O(interfaceC1017cB);
    }

    @Override // t1.InterfaceC1245t
    public void a(N app, O reference, byte[] data, M settableMetaData, long j3, U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(reference, "reference");
        kotlin.jvm.internal.m.e(data, "data");
        kotlin.jvm.internal.m.e(settableMetaData, "settableMetaData");
        kotlin.jvm.internal.m.e(callback, "callback");
        H h3 = H.f11339l.h((int) j3, M(app, reference), data, K(settableMetaData));
        try {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.m.d(string, "toString(...)");
            Locale US = Locale.US;
            kotlin.jvm.internal.m.d(US, "US");
            String lowerCase = string.toLowerCase(US);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            l1.k kVar = this.f11337c;
            kotlin.jvm.internal.m.b(kVar);
            W wL = h3.l(kVar, lowerCase);
            n.a aVar = I1.n.f2411b;
            callback.invoke(I1.n.a(I1.n.b(W("plugins.flutter.io/firebase_storage/taskEvent", lowerCase, wL))));
        } catch (Exception e3) {
            n.a aVar2 = I1.n.f2411b;
            callback.invoke(I1.n.a(I1.n.b(I1.o.a(C1248w.c(e3)))));
        }
    }

    @Override // t1.InterfaceC1245t
    public void b(N app, O reference, String filePath, M m3, long j3, U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(reference, "reference");
        kotlin.jvm.internal.m.e(filePath, "filePath");
        kotlin.jvm.internal.m.e(callback, "callback");
        com.google.firebase.storage.p pVarM = M(app, reference);
        H.a aVar = H.f11339l;
        int i3 = (int) j3;
        Uri uriFromFile = Uri.fromFile(new File(filePath));
        kotlin.jvm.internal.m.d(uriFromFile, "fromFile(...)");
        H hI = aVar.i(i3, pVarM, uriFromFile, m3 != null ? K(m3) : null);
        try {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.m.d(string, "toString(...)");
            Locale US = Locale.US;
            kotlin.jvm.internal.m.d(US, "US");
            String lowerCase = string.toLowerCase(US);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            l1.k kVar = this.f11337c;
            kotlin.jvm.internal.m.b(kVar);
            W wL = hI.l(kVar, lowerCase);
            n.a aVar2 = I1.n.f2411b;
            callback.invoke(I1.n.a(I1.n.b(W("plugins.flutter.io/firebase_storage/taskEvent", lowerCase, wL))));
        } catch (Exception e3) {
            n.a aVar3 = I1.n.f2411b;
            callback.invoke(I1.n.a(I1.n.b(I1.o.a(C1248w.c(e3)))));
        }
    }

    @Override // t1.InterfaceC1245t
    public void c(N app, long j3, U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(callback, "callback");
        N(app).o(j3);
        n.a aVar = I1.n.f2411b;
        callback.invoke(I1.n.a(I1.n.b(I1.u.f2419a)));
    }

    @Override // t1.InterfaceC1245t
    public void d(N app, long j3, U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(callback, "callback");
        N(app).q(j3);
        n.a aVar = I1.n.f2411b;
        callback.invoke(I1.n.a(I1.n.b(I1.u.f2419a)));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: t1.x
            @Override // java.lang.Runnable
            public final void run() {
                G.J(taskCompletionSource, this);
            }
        });
        Task task = taskCompletionSource.getTask();
        kotlin.jvm.internal.m.d(task, "getTask(...)");
        return task;
    }

    @Override // t1.InterfaceC1245t
    public void e(N app, long j3, U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(callback, "callback");
        N(app).p(j3);
        n.a aVar = I1.n.f2411b;
        callback.invoke(I1.n.a(I1.n.b(I1.u.f2419a)));
    }

    @Override // t1.InterfaceC1245t
    public void f(N app, O reference, long j3, final U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(reference, "reference");
        kotlin.jvm.internal.m.e(callback, "callback");
        com.google.firebase.storage.p pVarN = N(app).n(reference.a());
        kotlin.jvm.internal.m.d(pVarN, "getReference(...)");
        pVarN.k(j3).addOnCompleteListener(new OnCompleteListener() { // from class: t1.D
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                G.Q(callback, task);
            }
        });
    }

    @Override // t1.InterfaceC1245t
    public void g(N app, O reference, final U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(reference, "reference");
        kotlin.jvm.internal.m.e(callback, "callback");
        com.google.firebase.storage.p pVarN = N(app).n(reference.a());
        kotlin.jvm.internal.m.d(pVarN, "getReference(...)");
        pVarN.n().addOnCompleteListener(new OnCompleteListener() { // from class: t1.F
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                G.S(callback, this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task getPluginConstantsForFirebaseApp(C0992f c0992f) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: t1.y
            @Override // java.lang.Runnable
            public final void run() {
                G.L(taskCompletionSource);
            }
        });
        Task task = taskCompletionSource.getTask();
        kotlin.jvm.internal.m.d(task, "getTask(...)");
        return task;
    }

    @Override // t1.InterfaceC1245t
    public void h(N app, long j3, U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(callback, "callback");
        H.a aVar = H.f11339l;
        H hC = aVar.c((int) j3);
        if (hC == null) {
            HashMap map = new HashMap();
            map.put("status", Boolean.FALSE);
            callback.invoke(I1.n.a(I1.n.b(map)));
            return;
        }
        try {
            boolean zK = hC.f() ? hC.k() : false;
            HashMap map2 = new HashMap();
            map2.put("status", Boolean.valueOf(zK));
            if (zK) {
                map2.put("snapshot", aVar.f(hC.d()));
            }
            callback.invoke(I1.n.a(I1.n.b(map2)));
        } catch (Exception e3) {
            n.a aVar2 = I1.n.f2411b;
            callback.invoke(I1.n.a(I1.n.b(I1.o.a(C1248w.c(e3)))));
        }
    }

    @Override // t1.InterfaceC1245t
    public void i(N app, O reference, M metadata, final U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(reference, "reference");
        kotlin.jvm.internal.m.e(metadata, "metadata");
        kotlin.jvm.internal.m.e(callback, "callback");
        com.google.firebase.storage.p pVarN = N(app).n(reference.a());
        kotlin.jvm.internal.m.d(pVarN, "getReference(...)");
        pVarN.C(K(metadata)).addOnCompleteListener(new OnCompleteListener() { // from class: t1.E
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                G.V(callback, this, task);
            }
        });
    }

    @Override // t1.InterfaceC1245t
    public void j(N app, O reference, final U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(reference, "reference");
        kotlin.jvm.internal.m.e(callback, "callback");
        com.google.firebase.storage.p pVarN = N(app).n(reference.a());
        kotlin.jvm.internal.m.d(pVarN, "getReference(...)");
        pVarN.l().addOnCompleteListener(new OnCompleteListener() { // from class: t1.B
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                G.R(callback, task);
            }
        });
    }

    @Override // t1.InterfaceC1245t
    public void k(N app, String path, String str, U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(path, "path");
        kotlin.jvm.internal.m.e(callback, "callback");
        com.google.firebase.storage.p pVarN = N(app).n(path);
        kotlin.jvm.internal.m.d(pVarN, "getReference(...)");
        n.a aVar = I1.n.f2411b;
        callback.invoke(I1.n.a(I1.n.b(I(pVarN))));
    }

    @Override // t1.InterfaceC1245t
    public void l(N app, O reference, final U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(reference, "reference");
        kotlin.jvm.internal.m.e(callback, "callback");
        com.google.firebase.storage.p pVarN = N(app).n(reference.a());
        kotlin.jvm.internal.m.d(pVarN, "getReference(...)");
        pVarN.h().addOnCompleteListener(new OnCompleteListener() { // from class: t1.z
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                G.P(callback, task);
            }
        });
    }

    @Override // t1.InterfaceC1245t
    public void m(N app, O reference, String filePath, long j3, U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(reference, "reference");
        kotlin.jvm.internal.m.e(filePath, "filePath");
        kotlin.jvm.internal.m.e(callback, "callback");
        H hB = H.f11339l.b((int) j3, M(app, reference), new File(filePath));
        try {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.m.d(string, "toString(...)");
            Locale US = Locale.US;
            kotlin.jvm.internal.m.d(US, "US");
            String lowerCase = string.toLowerCase(US);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            l1.k kVar = this.f11337c;
            kotlin.jvm.internal.m.b(kVar);
            W wL = hB.l(kVar, lowerCase);
            n.a aVar = I1.n.f2411b;
            callback.invoke(I1.n.a(I1.n.b(W("plugins.flutter.io/firebase_storage/taskEvent", lowerCase, wL))));
        } catch (Exception e3) {
            n.a aVar2 = I1.n.f2411b;
            callback.invoke(I1.n.a(I1.n.b(I1.o.a(C1248w.c(e3)))));
        }
    }

    @Override // t1.InterfaceC1245t
    public void n(N app, long j3, U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(callback, "callback");
        H.a aVar = H.f11339l;
        H hC = aVar.c((int) j3);
        if (hC == null) {
            HashMap map = new HashMap();
            map.put("status", Boolean.FALSE);
            callback.invoke(I1.n.a(I1.n.b(map)));
            return;
        }
        try {
            boolean zJ = !hC.f() ? hC.j() : false;
            HashMap map2 = new HashMap();
            map2.put("status", Boolean.valueOf(zJ));
            if (zJ) {
                map2.put("snapshot", aVar.f(hC.d()));
            }
            callback.invoke(I1.n.a(I1.n.b(map2)));
        } catch (Exception e3) {
            n.a aVar2 = I1.n.f2411b;
            callback.invoke(I1.n.a(I1.n.b(I1.o.a(C1248w.c(e3)))));
        }
    }

    @Override // t1.InterfaceC1245t
    public void o(N app, O reference, String data, long j3, M settableMetaData, long j4, U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(reference, "reference");
        kotlin.jvm.internal.m.e(data, "data");
        kotlin.jvm.internal.m.e(settableMetaData, "settableMetaData");
        kotlin.jvm.internal.m.e(callback, "callback");
        com.google.firebase.storage.p pVarM = M(app, reference);
        com.google.firebase.storage.o oVarK = K(settableMetaData);
        byte[] bArrY = Y(data, (int) j3);
        kotlin.jvm.internal.m.b(bArrY);
        H h3 = H.f11339l.h((int) j4, pVarM, bArrY, oVarK);
        try {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.m.d(string, "toString(...)");
            Locale US = Locale.US;
            kotlin.jvm.internal.m.d(US, "US");
            String lowerCase = string.toLowerCase(US);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            l1.k kVar = this.f11337c;
            kotlin.jvm.internal.m.b(kVar);
            W wL = h3.l(kVar, lowerCase);
            n.a aVar = I1.n.f2411b;
            callback.invoke(I1.n.a(I1.n.b(W("plugins.flutter.io/firebase_storage/taskEvent", lowerCase, wL))));
        } catch (Exception e3) {
            n.a aVar2 = I1.n.f2411b;
            callback.invoke(I1.n.a(I1.n.b(I1.o.a(C1248w.c(e3)))));
        }
    }

    @Override // t1.InterfaceC1245t
    public void p(N app, long j3, U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(callback, "callback");
        H.a aVar = H.f11339l;
        H hC = aVar.c((int) j3);
        if (hC == null) {
            HashMap map = new HashMap();
            map.put("status", Boolean.FALSE);
            callback.invoke(I1.n.a(I1.n.b(map)));
            return;
        }
        try {
            boolean zB = hC.b();
            HashMap map2 = new HashMap();
            map2.put("status", Boolean.valueOf(zB));
            if (zB) {
                map2.put("snapshot", aVar.f(hC.d()));
            }
            callback.invoke(I1.n.a(I1.n.b(map2)));
        } catch (Exception e3) {
            n.a aVar2 = I1.n.f2411b;
            callback.invoke(I1.n.a(I1.n.b(I1.o.a(C1248w.c(e3)))));
        }
    }

    @Override // t1.InterfaceC1245t
    public void q(N app, O reference, K options, final U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(reference, "reference");
        kotlin.jvm.internal.m.e(options, "options");
        kotlin.jvm.internal.m.e(callback, "callback");
        com.google.firebase.storage.p pVarN = N(app).n(reference.a());
        kotlin.jvm.internal.m.d(pVarN, "getReference(...)");
        Task taskV = options.b() != null ? pVarN.v((int) options.a(), options.b()) : pVarN.u((int) options.a());
        kotlin.jvm.internal.m.b(taskV);
        taskV.addOnCompleteListener(new OnCompleteListener() { // from class: t1.C
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                G.T(callback, this, task);
            }
        });
    }

    @Override // t1.InterfaceC1245t
    public void r(N app, O reference, final U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(reference, "reference");
        kotlin.jvm.internal.m.e(callback, "callback");
        com.google.firebase.storage.p pVarN = N(app).n(reference.a());
        kotlin.jvm.internal.m.d(pVarN, "getReference(...)");
        pVarN.w().addOnCompleteListener(new OnCompleteListener() { // from class: t1.A
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                G.U(callback, this, task);
            }
        });
    }

    @Override // t1.InterfaceC1245t
    public void s(N app, String host, long j3, U1.l callback) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(host, "host");
        kotlin.jvm.internal.m.e(callback, "callback");
        try {
            N(app).r(host, (int) j3);
            n.a aVar = I1.n.f2411b;
            callback.invoke(I1.n.a(I1.n.b(I1.u.f2419a)));
        } catch (Exception e3) {
            n.a aVar2 = I1.n.f2411b;
            callback.invoke(I1.n.a(I1.n.b(I1.o.a(C1248w.c(e3)))));
        }
    }

    @Override // g1.InterfaceC0872a
    public void y(InterfaceC0872a.b binding) {
        kotlin.jvm.internal.m.e(binding, "binding");
        H.f11339l.a();
        l1.k kVar = this.f11337c;
        if (kVar != null) {
            kVar.e(null);
        }
        InterfaceC1017c interfaceC1017c = this.f11338d;
        if (interfaceC1017c == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        InterfaceC1245t.a aVar = InterfaceC1245t.f11431a;
        kotlin.jvm.internal.m.b(interfaceC1017c);
        aVar.u(interfaceC1017c, null);
        this.f11337c = null;
        this.f11338d = null;
        X();
    }
}
