package g2;

import M1.g;
import c2.C0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.coroutines.jvm.internal.d implements f2.c, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.c f7370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M1.g f7371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private M1.g f7373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private M1.d f7374e;

    public o(f2.c cVar, M1.g gVar) {
        super(l.f7365a, M1.h.f2707a);
        this.f7370a = cVar;
        this.f7371b = gVar;
        this.f7372c = ((Number) gVar.fold(0, new U1.p() { // from class: g2.n
            @Override // U1.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(o.l(((Integer) obj).intValue(), (g.b) obj2));
            }
        })).intValue();
    }

    private final void j(M1.g gVar, M1.g gVar2, Object obj) {
        if (gVar2 instanceof i) {
            p((i) gVar2, obj);
        }
        r.b(this, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(int i3, g.b bVar) {
        return i3 + 1;
    }

    private final Object o(M1.d dVar, Object obj) {
        M1.g context = dVar.getContext();
        C0.h(context);
        M1.g gVar = this.f7373d;
        if (gVar != context) {
            j(context, gVar, obj);
            this.f7373d = context;
        }
        this.f7374e = dVar;
        U1.q qVar = p.f7375a;
        f2.c cVar = this.f7370a;
        kotlin.jvm.internal.m.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        kotlin.jvm.internal.m.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objE = qVar.e(cVar, obj, this);
        if (!kotlin.jvm.internal.m.a(objE, N1.d.e())) {
            this.f7374e = null;
        }
        return objE;
    }

    private final void p(i iVar, Object obj) {
        throw new IllegalStateException(b2.h.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + iVar.f7364b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // f2.c
    public Object emit(Object obj, M1.d dVar) {
        try {
            Object objO = o(dVar, obj);
            if (objO == N1.d.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objO == N1.d.e() ? objO : I1.u.f2419a;
        } catch (Throwable th) {
            this.f7373d = new i(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        M1.d dVar = this.f7374e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, M1.d
    public M1.g getContext() {
        M1.g gVar = this.f7373d;
        return gVar == null ? M1.h.f2707a : gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected Object invokeSuspend(Object obj) {
        Throwable thD = I1.n.d(obj);
        if (thD != null) {
            this.f7373d = new i(thD, getContext());
        }
        M1.d dVar = this.f7374e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return N1.d.e();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
