package com.google.firebase.firestore;

import A0.AbstractC0204d;
import A0.AbstractC0212j;
import A0.C0210h;
import A0.C0214l;
import C0.C0254i1;
import D0.q;
import I0.C0384z;
import J0.A;
import J0.AbstractC0386b;
import J0.C0391g;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.S0;
import com.google.firebase.firestore.T;
import com.google.firebase.firestore.U;
import j.InterfaceC0980a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import k0.C0992f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w0.C1260a;
import y0.AbstractC1279a;
import y0.C1283e;
import y0.C1287i;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseFirestore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J0.y f6190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f6191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D0.f f6192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC1279a f6194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC1279a f6195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0992f f6196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final V0 f6197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f6198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C1260a f6199j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final I0.J f6202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C0746p0 f6203n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final W f6201l = new W(new J0.y() { // from class: com.google.firebase.firestore.J
        @Override // J0.y
        public final Object c(Object obj) {
            return this.f6220a.V((C0391g) obj);
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private U f6200k = new U.b().f();

    public interface a {
        void a(String str);
    }

    FirebaseFirestore(Context context, D0.f fVar, String str, AbstractC1279a abstractC1279a, AbstractC1279a abstractC1279a2, J0.y yVar, C0992f c0992f, a aVar, I0.J j3) {
        this.f6191b = (Context) J0.C.b(context);
        this.f6192c = (D0.f) J0.C.b((D0.f) J0.C.b(fVar));
        this.f6197h = new V0(fVar);
        this.f6193d = (String) J0.C.b(str);
        this.f6194e = (AbstractC1279a) J0.C.b(abstractC1279a);
        this.f6195f = (AbstractC1279a) J0.C.b(abstractC1279a2);
        this.f6190a = (J0.y) J0.C.b(yVar);
        this.f6196g = c0992f;
        this.f6198i = aVar;
        this.f6202m = j3;
    }

    public static FirebaseFirestore C(C0992f c0992f, String str) {
        J0.C.c(c0992f, "Provided FirebaseApp must not be null.");
        J0.C.c(str, "Provided database name must not be null.");
        X x2 = (X) c0992f.k(X.class);
        J0.C.c(x2, "Firestore component is not present.");
        return x2.c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(C0210h c0210h, A0.S s2) {
        c0210h.d();
        s2.n0(c0210h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC0720c0 H(final C0210h c0210h, Activity activity, final A0.S s2) {
        s2.A(c0210h);
        return AbstractC0204d.c(activity, new InterfaceC0720c0() { // from class: com.google.firebase.firestore.H
            @Override // com.google.firebase.firestore.InterfaceC0720c0
            public final void remove() {
                FirebaseFirestore.G(c0210h, s2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(Runnable runnable, Void r2, T t2) {
        AbstractC0386b.d(t2 == null, "snapshots-in-sync listeners should never get errors.", new Object[0]);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task J(Executor executor) {
        return Tasks.forException(new T("Persistence cannot be cleared while the firestore instance is running.", T.a.FAILED_PRECONDITION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(TaskCompletionSource taskCompletionSource) {
        try {
            C0254i1.t(this.f6191b, this.f6192c, this.f6193d);
            taskCompletionSource.setResult(null);
        } catch (T e3) {
            taskCompletionSource.setException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task L(String str, A0.S s2) {
        return s2.I(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ D0 M(Task task) {
        A0.f0 f0Var = (A0.f0) task.getResult();
        if (f0Var != null) {
            return new D0(f0Var, this);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object O(S0.a aVar, A0.q0 q0Var) {
        return aVar.a(new S0(q0Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task P(Executor executor, final S0.a aVar, final A0.q0 q0Var) {
        return Tasks.call(executor, new Callable() { // from class: com.google.firebase.firestore.I
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6217a.O(aVar, q0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task Q(T0 t02, J0.y yVar, A0.S s2) {
        return s2.s0(t02, yVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task R(List list, A0.S s2) {
        return s2.B(list);
    }

    private U U(U u2, C1260a c1260a) {
        if (c1260a == null) {
            return u2;
        }
        if (!"firestore.googleapis.com".equals(u2.h())) {
            J0.A.e("FirebaseFirestore", "Host has been set in FirebaseFirestoreSettings and useEmulator, emulator host will be used.", new Object[0]);
        }
        return new U.b(u2).g(c1260a.a() + ":" + c1260a.b()).i(false).f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public A0.S V(C0391g c0391g) {
        A0.S s2;
        synchronized (this.f6201l) {
            s2 = new A0.S(this.f6191b, new C0214l(this.f6192c, this.f6193d, this.f6200k.h(), this.f6200k.j()), this.f6194e, this.f6195f, c0391g, this.f6202m, (AbstractC0212j) this.f6190a.c(this.f6200k));
        }
        return s2;
    }

    static FirebaseFirestore W(Context context, C0992f c0992f, L0.a aVar, L0.a aVar2, String str, a aVar3, I0.J j3) {
        String strG = c0992f.r().g();
        if (strG == null) {
            throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
        }
        return new FirebaseFirestore(context, D0.f.e(strG, str), c0992f.q(), new C1287i(aVar), new C1283e(aVar2), new J0.y() { // from class: com.google.firebase.firestore.A
            @Override // J0.y
            public final Object c(Object obj) {
                return AbstractC0212j.h((U) obj);
            }
        }, c0992f, aVar3, j3);
    }

    private Task Z(final T0 t02, final S0.a aVar, final Executor executor) {
        this.f6201l.c();
        final J0.y yVar = new J0.y() { // from class: com.google.firebase.firestore.E
            @Override // J0.y
            public final Object c(Object obj) {
                return this.f6184a.P(executor, aVar, (A0.q0) obj);
            }
        };
        return (Task) this.f6201l.b(new J0.y() { // from class: com.google.firebase.firestore.F
            @Override // J0.y
            public final Object c(Object obj) {
                return FirebaseFirestore.Q(t02, yVar, (A0.S) obj);
            }
        });
    }

    public static void c0(boolean z2) {
        J0.A.d(z2 ? A.b.DEBUG : A.b.WARN);
    }

    private InterfaceC0720c0 p(Executor executor, final Activity activity, final Runnable runnable) {
        final C0210h c0210h = new C0210h(executor, new InterfaceC0756v() { // from class: com.google.firebase.firestore.P
            @Override // com.google.firebase.firestore.InterfaceC0756v
            public final void a(Object obj, T t2) {
                FirebaseFirestore.I(runnable, (Void) obj, t2);
            }
        });
        return (InterfaceC0720c0) this.f6201l.b(new J0.y() { // from class: com.google.firebase.firestore.Q
            @Override // J0.y
            public final Object c(Object obj) {
                return FirebaseFirestore.H(c0210h, activity, (A0.S) obj);
            }
        });
    }

    static void setClientLanguage(String str) {
        C0384z.p(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task u(Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.firestore.G
            @Override // java.lang.Runnable
            public final void run() {
                this.f6204a.K(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public C0992f A() {
        return this.f6196g;
    }

    D0.f B() {
        return this.f6192c;
    }

    public Task D(final String str) {
        return ((Task) this.f6201l.b(new J0.y() { // from class: com.google.firebase.firestore.L
            @Override // J0.y
            public final Object c(Object obj) {
                return FirebaseFirestore.L(str, (A0.S) obj);
            }
        })).continueWith(new Continuation() { // from class: com.google.firebase.firestore.M
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f6229a.M(task);
            }
        });
    }

    public C0746p0 E() {
        this.f6201l.c();
        if (this.f6203n == null && (this.f6200k.i() || (this.f6200k.f() instanceof C0748q0))) {
            this.f6203n = new C0746p0(this.f6201l);
        }
        return this.f6203n;
    }

    V0 F() {
        return this.f6197h;
    }

    public C0724e0 S(final InputStream inputStream) {
        final C0724e0 c0724e0 = new C0724e0();
        this.f6201l.g(new InterfaceC0980a() { // from class: com.google.firebase.firestore.B
            @Override // j.InterfaceC0980a
            public final void accept(Object obj) {
                ((A0.S) obj).m0(inputStream, c0724e0);
            }
        });
        return c0724e0;
    }

    public C0724e0 T(byte[] bArr) {
        return S(new ByteArrayInputStream(bArr));
    }

    public C0757v0 X() {
        this.f6201l.c();
        return new C0757v0(this);
    }

    public Task Y(T0 t02, S0.a aVar) {
        J0.C.c(aVar, "Provided transaction update function must not be null.");
        return Z(t02, aVar, A0.q0.g());
    }

    public void a0(U u2) {
        J0.C.c(u2, "Provided settings must not be null.");
        synchronized (this.f6192c) {
            try {
                U U2 = U(u2, this.f6199j);
                if (this.f6201l.e() && !this.f6200k.equals(U2)) {
                    throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
                }
                this.f6200k = U2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task b0(String str) {
        this.f6201l.c();
        J0.C.e(this.f6200k.i(), "Cannot enable indexes when persistence is disabled");
        final ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("indexes")) {
                JSONArray jSONArray = jSONObject.getJSONArray("indexes");
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    String string = jSONObject2.getString("collectionGroup");
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("fields");
                    for (int i4 = 0; jSONArrayOptJSONArray != null && i4 < jSONArrayOptJSONArray.length(); i4++) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i4);
                        D0.r rVarB = D0.r.B(jSONObject3.getString("fieldPath"));
                        arrayList2.add("CONTAINS".equals(jSONObject3.optString("arrayConfig")) ? q.c.e(rVarB, q.c.a.CONTAINS) : "ASCENDING".equals(jSONObject3.optString("order")) ? q.c.e(rVarB, q.c.a.ASCENDING) : q.c.e(rVarB, q.c.a.DESCENDING));
                    }
                    arrayList.add(D0.q.b(-1, string, arrayList2, D0.q.f1269a));
                }
            }
            return (Task) this.f6201l.b(new J0.y() { // from class: com.google.firebase.firestore.S
                @Override // J0.y
                public final Object c(Object obj) {
                    return FirebaseFirestore.R(arrayList, (A0.S) obj);
                }
            });
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Failed to parse index configuration", e3);
        }
    }

    public Task d0() {
        this.f6198i.a(B().h());
        return this.f6201l.h();
    }

    void e0(C0752t c0752t) {
        J0.C.c(c0752t, "Provided DocumentReference must not be null.");
        if (c0752t.p() != this) {
            throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
        }
    }

    public Task f0() {
        return (Task) this.f6201l.b(new J0.y() { // from class: com.google.firebase.firestore.K
            @Override // J0.y
            public final Object c(Object obj) {
                return ((A0.S) obj).u0();
            }
        });
    }

    public InterfaceC0720c0 o(Runnable runnable) {
        return q(J0.s.f2499a, runnable);
    }

    public InterfaceC0720c0 q(Executor executor, Runnable runnable) {
        return p(executor, null, runnable);
    }

    public Z0 r() {
        this.f6201l.c();
        return new Z0(this);
    }

    Object s(J0.y yVar) {
        return this.f6201l.b(yVar);
    }

    public Task t() {
        return (Task) this.f6201l.d(new J0.y() { // from class: com.google.firebase.firestore.N
            @Override // J0.y
            public final Object c(Object obj) {
                return this.f6234a.u((Executor) obj);
            }
        }, new J0.y() { // from class: com.google.firebase.firestore.O
            @Override // J0.y
            public final Object c(Object obj) {
                return FirebaseFirestore.J((Executor) obj);
            }
        });
    }

    public C0729h v(String str) {
        J0.C.c(str, "Provided collection path must not be null.");
        this.f6201l.c();
        return new C0729h(D0.u.B(str), this);
    }

    public D0 w(String str) {
        J0.C.c(str, "Provided collection ID must not be null.");
        if (str.contains("/")) {
            throw new IllegalArgumentException(String.format("Invalid collectionId '%s'. Collection IDs must not contain '/'.", str));
        }
        this.f6201l.c();
        return new D0(new A0.f0(D0.u.f1301b, str), this);
    }

    public Task x() {
        return (Task) this.f6201l.b(new J0.y() { // from class: com.google.firebase.firestore.D
            @Override // J0.y
            public final Object c(Object obj) {
                return ((A0.S) obj).D();
            }
        });
    }

    public C0752t y(String str) {
        J0.C.c(str, "Provided document path must not be null.");
        this.f6201l.c();
        return C0752t.n(D0.u.B(str), this);
    }

    public Task z() {
        return (Task) this.f6201l.b(new J0.y() { // from class: com.google.firebase.firestore.C
            @Override // J0.y
            public final Object c(Object obj) {
                return ((A0.S) obj).E();
            }
        });
    }
}
