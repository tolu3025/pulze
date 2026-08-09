package t1;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.C0771f;
import com.google.firebase.storage.E;
import com.google.firebase.storage.InterfaceC0777l;
import com.google.firebase.storage.InterfaceC0778m;
import java.util.HashMap;
import java.util.Map;
import l1.C1018d;
import t1.G;

/* JADX INFO: loaded from: classes.dex */
public final class W implements C1018d.InterfaceC0147d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H f11398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0771f f11399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.storage.E f11401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f11402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f11403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f11404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f11405h;

    static final class a extends kotlin.jvm.internal.n implements U1.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1018d.b f11407b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1018d.b bVar) {
            super(1);
            this.f11407b = bVar;
        }

        public final void b(E.a taskSnapshot) {
            kotlin.jvm.internal.m.e(taskSnapshot, "taskSnapshot");
            if (W.this.f11398a.e()) {
                return;
            }
            Map mapK = W.this.k(taskSnapshot, null);
            mapK.put(W.this.f11402e, Integer.valueOf(P.f11384d.e()));
            this.f11407b.a(mapK);
            W.this.f11398a.i();
        }

        @Override // U1.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((E.a) obj);
            return I1.u.f2419a;
        }
    }

    static final class b extends kotlin.jvm.internal.n implements U1.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1018d.b f11409b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1018d.b bVar) {
            super(1);
            this.f11409b = bVar;
        }

        public final void b(E.a taskSnapshot) {
            kotlin.jvm.internal.m.e(taskSnapshot, "taskSnapshot");
            if (W.this.f11398a.e()) {
                return;
            }
            Map mapK = W.this.k(taskSnapshot, null);
            mapK.put(W.this.f11402e, Integer.valueOf(P.f11383c.e()));
            this.f11409b.a(mapK);
            W.this.f11398a.h();
        }

        @Override // U1.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((E.a) obj);
            return I1.u.f2419a;
        }
    }

    static final class c extends kotlin.jvm.internal.n implements U1.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1018d.b f11411b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C1018d.b bVar) {
            super(1);
            this.f11411b = bVar;
        }

        public final void b(E.a aVar) {
            if (W.this.f11398a.e()) {
                return;
            }
            Map mapK = W.this.k(aVar, null);
            mapK.put(W.this.f11402e, Integer.valueOf(P.f11385e.e()));
            this.f11411b.a(mapK);
            W.this.f11398a.c();
        }

        @Override // U1.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((E.a) obj);
            return I1.u.f2419a;
        }
    }

    public W(H flutterTask, C0771f androidStorage, Object task, String identifier) {
        kotlin.jvm.internal.m.e(flutterTask, "flutterTask");
        kotlin.jvm.internal.m.e(androidStorage, "androidStorage");
        kotlin.jvm.internal.m.e(task, "task");
        kotlin.jvm.internal.m.e(identifier, "identifier");
        this.f11398a = flutterTask;
        this.f11399b = androidStorage;
        this.f11400c = identifier;
        this.f11401d = (com.google.firebase.storage.E) task;
        this.f11402e = "taskState";
        this.f11403f = "appName";
        this.f11404g = "snapshot";
        this.f11405h = "error";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map k(Object obj, Exception exc) {
        HashMap map = new HashMap();
        map.put(this.f11403f, this.f11399b.a().q());
        if (obj != null) {
            map.put(this.f11404g, H.f11339l.f(obj));
        }
        if (exc != null) {
            map.put(this.f11405h, G.f11334e.b(exc));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(U1.l tmp0, Object p02) {
        kotlin.jvm.internal.m.e(tmp0, "$tmp0");
        kotlin.jvm.internal.m.e(p02, "p0");
        tmp0.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(U1.l tmp0, Object p02) {
        kotlin.jvm.internal.m.e(tmp0, "$tmp0");
        kotlin.jvm.internal.m.e(p02, "p0");
        tmp0.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(U1.l tmp0, Object obj) {
        kotlin.jvm.internal.m.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(W this$0, C1018d.b events) {
        kotlin.jvm.internal.m.e(this$0, "this$0");
        kotlin.jvm.internal.m.e(events, "$events");
        if (this$0.f11398a.e()) {
            return;
        }
        Map mapK = this$0.k(null, null);
        mapK.put(this$0.f11402e, Integer.valueOf(P.f11387l.e()));
        HashMap map = new HashMap();
        map.put("code", C1248w.a(-13040));
        map.put("message", C1248w.b(-13040));
        mapK.put(this$0.f11405h, map);
        events.a(mapK);
        this$0.f11398a.g();
        this$0.f11398a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(W this$0, C1018d.b events, Exception exception) {
        kotlin.jvm.internal.m.e(this$0, "this$0");
        kotlin.jvm.internal.m.e(events, "$events");
        kotlin.jvm.internal.m.e(exception, "exception");
        if (this$0.f11398a.e()) {
            return;
        }
        Map mapK = this$0.k(null, exception);
        mapK.put(this$0.f11402e, Integer.valueOf(P.f11387l.e()));
        events.a(mapK);
        this$0.f11398a.c();
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void b(Object obj) {
        if (!this.f11401d.isCanceled()) {
            this.f11401d.w();
        }
        if (!this.f11398a.e()) {
            this.f11398a.c();
        }
        G.a aVar = G.f11334e;
        C1018d c1018d = (C1018d) aVar.a().get(this.f11400c);
        if (c1018d != null) {
            c1018d.d(null);
            aVar.a().remove(this.f11400c);
        }
        if (aVar.c().get(this.f11400c) != null) {
            aVar.c().remove(this.f11400c);
        }
    }

    @Override // l1.C1018d.InterfaceC0147d
    public void c(Object obj, final C1018d.b events) {
        kotlin.jvm.internal.m.e(events, "events");
        com.google.firebase.storage.E e3 = this.f11401d;
        final a aVar = new a(events);
        e3.s(new InterfaceC0778m() { // from class: t1.Q
            @Override // com.google.firebase.storage.InterfaceC0778m
            public final void a(Object obj2) {
                W.l(aVar, obj2);
            }
        });
        com.google.firebase.storage.E e4 = this.f11401d;
        final b bVar = new b(events);
        e4.r(new InterfaceC0777l() { // from class: t1.S
            @Override // com.google.firebase.storage.InterfaceC0777l
            public final void a(Object obj2) {
                W.m(bVar, obj2);
            }
        });
        com.google.firebase.storage.E e5 = this.f11401d;
        final c cVar = new c(events);
        e5.addOnSuccessListener(new OnSuccessListener() { // from class: t1.T
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj2) {
                W.n(cVar, obj2);
            }
        });
        this.f11401d.addOnCanceledListener(new OnCanceledListener() { // from class: t1.U
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                W.o(this.f11394a, events);
            }
        });
        this.f11401d.addOnFailureListener(new OnFailureListener() { // from class: t1.V
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                W.p(this.f11396a, events, exc);
            }
        });
    }
}
