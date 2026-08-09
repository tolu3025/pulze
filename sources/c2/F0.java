package c2;

import M1.g;
import c.AbstractC0527b;
import c2.InterfaceC0600z0;
import h2.C0898o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class F0 implements InterfaceC0600z0, InterfaceC0593w, N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5059a = AtomicReferenceFieldUpdater.newUpdater(F0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5060b = AtomicReferenceFieldUpdater.newUpdater(F0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    private static final class a extends C0580p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final F0 f5061n;

        public a(M1.d dVar, F0 f02) {
            super(dVar, 1);
            this.f5061n = f02;
        }

        @Override // c2.C0580p
        protected String L() {
            return "AwaitContinuation";
        }

        @Override // c2.C0580p
        public Throwable x(InterfaceC0600z0 interfaceC0600z0) {
            Throwable thE;
            Object objX = this.f5061n.X();
            return (!(objX instanceof c) || (thE = ((c) objX).e()) == null) ? objX instanceof C ? ((C) objX).f5057a : interfaceC0600z0.getCancellationException() : thE;
        }
    }

    private static final class b extends E0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final F0 f5062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final c f5063f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final C0591v f5064l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Object f5065m;

        public b(F0 f02, c cVar, C0591v c0591v, Object obj) {
            this.f5062e = f02;
            this.f5063f = cVar;
            this.f5064l = c0591v;
            this.f5065m = obj;
        }

        @Override // c2.E0
        public boolean v() {
            return false;
        }

        @Override // c2.E0
        public void w(Throwable th) {
            this.f5062e.J(this.f5063f, this.f5064l, this.f5065m);
        }
    }

    private static final class c implements InterfaceC0592v0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f5066b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f5067c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f5068d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K0 f5069a;

        public c(K0 k02, boolean z2, Throwable th) {
            this.f5069a = k02;
            this._isCompleting$volatile = z2 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        private final ArrayList c() {
            return new ArrayList(4);
        }

        private final Object d() {
            return f5068d.get(this);
        }

        private final void n(Object obj) {
            f5068d.set(this, obj);
        }

        @Override // c2.InterfaceC0592v0
        public K0 a() {
            return this.f5069a;
        }

        public final void b(Throwable th) {
            Throwable thE = e();
            if (thE == null) {
                o(th);
                return;
            }
            if (th == thE) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                n(th);
                return;
            }
            if (objD instanceof Throwable) {
                if (th == objD) {
                    return;
                }
                ArrayList arrayListC = c();
                arrayListC.add(objD);
                arrayListC.add(th);
                n(arrayListC);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        public final Throwable e() {
            return (Throwable) f5067c.get(this);
        }

        public final boolean i() {
            return e() != null;
        }

        @Override // c2.InterfaceC0592v0
        public boolean isActive() {
            return e() == null;
        }

        public final boolean j() {
            return f5066b.get(this) != 0;
        }

        public final boolean k() {
            return d() == G0.f5086e;
        }

        public final List l(Throwable th) {
            ArrayList arrayListC;
            Object objD = d();
            if (objD == null) {
                arrayListC = c();
            } else if (objD instanceof Throwable) {
                ArrayList arrayListC2 = c();
                arrayListC2.add(objD);
                arrayListC = arrayListC2;
            } else {
                if (!(objD instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objD).toString());
                }
                arrayListC = (ArrayList) objD;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListC.add(0, thE);
            }
            if (th != null && !kotlin.jvm.internal.m.a(th, thE)) {
                arrayListC.add(th);
            }
            n(G0.f5086e);
            return arrayListC;
        }

        public final void m(boolean z2) {
            f5066b.set(this, z2 ? 1 : 0);
        }

        public final void o(Throwable th) {
            f5067c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + i() + ", completing=" + j() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + a() + ']';
        }
    }

    private final class d extends E0 {
        public d(k2.e eVar) {
        }

        @Override // c2.E0
        public boolean v() {
            return false;
        }

        @Override // c2.E0
        public void w(Throwable th) {
            Object objX = F0.this.X();
            if (!(objX instanceof C)) {
                G0.h(objX);
            }
            throw null;
        }
    }

    private final class e extends E0 {
        public e(k2.e eVar) {
        }

        @Override // c2.E0
        public boolean v() {
            return false;
        }

        @Override // c2.E0
        public void w(Throwable th) {
            I1.u uVar = I1.u.f2419a;
            throw null;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.k implements U1.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f5072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f5073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f5074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f5075e;

        f(M1.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            f fVar = F0.this.new f(dVar);
            fVar.f5075e = obj;
            return fVar;
        }

        @Override // U1.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a2.e eVar, M1.d dVar) {
            return ((f) create(eVar, dVar)).invokeSuspend(I1.u.f2419a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = N1.b.e()
                int r1 = r6.f5074d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f5073c
                h2.o r1 = (h2.C0898o) r1
                java.lang.Object r3 = r6.f5072b
                h2.n r3 = (h2.AbstractC0897n) r3
                java.lang.Object r4 = r6.f5075e
                a2.e r4 = (a2.e) r4
                I1.o.b(r7)
                goto L81
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                I1.o.b(r7)
                goto L86
            L2a:
                I1.o.b(r7)
                java.lang.Object r7 = r6.f5075e
                a2.e r7 = (a2.e) r7
                c2.F0 r1 = c2.F0.this
                java.lang.Object r1 = r1.X()
                boolean r4 = r1 instanceof c2.C0591v
                if (r4 == 0) goto L48
                c2.v r1 = (c2.C0591v) r1
                c2.w r1 = r1.f5178e
                r6.f5074d = r3
                java.lang.Object r7 = r7.d(r1, r6)
                if (r7 != r0) goto L86
                return r0
            L48:
                boolean r3 = r1 instanceof c2.InterfaceC0592v0
                if (r3 == 0) goto L86
                c2.v0 r1 = (c2.InterfaceC0592v0) r1
                c2.K0 r1 = r1.a()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.k()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                kotlin.jvm.internal.m.c(r3, r4)
                h2.o r3 = (h2.C0898o) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L63:
                boolean r7 = kotlin.jvm.internal.m.a(r1, r3)
                if (r7 != 0) goto L86
                boolean r7 = r1 instanceof c2.C0591v
                if (r7 == 0) goto L81
                r7 = r1
                c2.v r7 = (c2.C0591v) r7
                c2.w r7 = r7.f5178e
                r6.f5075e = r4
                r6.f5072b = r3
                r6.f5073c = r1
                r6.f5074d = r2
                java.lang.Object r7 = r4.d(r7, r6)
                if (r7 != r0) goto L81
                return r0
            L81:
                h2.o r1 = r1.l()
                goto L63
            L86:
                I1.u r7 = I1.u.f2419a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: c2.F0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* synthetic */ class g extends kotlin.jvm.internal.k implements U1.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f5077a = new g();

        g() {
            super(3, F0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void c(F0 f02, k2.e eVar, Object obj) {
            f02.p0(eVar, obj);
        }

        @Override // U1.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            AbstractC0527b.a(obj2);
            c((F0) obj, null, obj3);
            return I1.u.f2419a;
        }
    }

    /* synthetic */ class h extends kotlin.jvm.internal.k implements U1.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f5078a = new h();

        h() {
            super(3, F0.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // U1.q
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object e(F0 f02, Object obj, Object obj2) {
            return f02.o0(obj, obj2);
        }
    }

    /* synthetic */ class i extends kotlin.jvm.internal.k implements U1.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f5079a = new i();

        i() {
            super(3, F0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void c(F0 f02, k2.e eVar, Object obj) {
            f02.v0(eVar, obj);
        }

        @Override // U1.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            AbstractC0527b.a(obj2);
            c((F0) obj, null, obj3);
            return I1.u.f2419a;
        }
    }

    public F0(boolean z2) {
        this._state$volatile = z2 ? G0.f5088g : G0.f5087f;
    }

    public static /* synthetic */ CancellationException B0(F0 f02, Throwable th, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i3 & 1) != 0) {
            str = null;
        }
        return f02.A0(th, str);
    }

    private final boolean D0(InterfaceC0592v0 interfaceC0592v0, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f5059a, this, interfaceC0592v0, G0.g(obj))) {
            return false;
        }
        q0(null);
        r0(obj);
        I(interfaceC0592v0, obj);
        return true;
    }

    private final Object E(Object obj) {
        Object objF0;
        do {
            Object objX = X();
            if (!(objX instanceof InterfaceC0592v0) || ((objX instanceof c) && ((c) objX).j())) {
                return G0.f5082a;
            }
            objF0 = F0(objX, new C(L(obj), false, 2, null));
        } while (objF0 == G0.f5084c);
        return objF0;
    }

    private final boolean E0(InterfaceC0592v0 interfaceC0592v0, Throwable th) throws Throwable {
        K0 k0V = V(interfaceC0592v0);
        if (k0V == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f5059a, this, interfaceC0592v0, new c(k0V, false, th))) {
            return false;
        }
        m0(k0V, th);
        return true;
    }

    private final boolean F(Throwable th) {
        if (e0()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0589u interfaceC0589uW = W();
        return (interfaceC0589uW == null || interfaceC0589uW == L0.f5094a) ? z2 : interfaceC0589uW.h(th) || z2;
    }

    private final Object F0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC0592v0) ? G0.f5082a : ((!(obj instanceof C0567i0) && !(obj instanceof E0)) || (obj instanceof C0591v) || (obj2 instanceof C)) ? G0((InterfaceC0592v0) obj, obj2) : D0((InterfaceC0592v0) obj, obj2) ? obj2 : G0.f5084c;
    }

    private final Object G0(InterfaceC0592v0 interfaceC0592v0, Object obj) throws Throwable {
        K0 k0V = V(interfaceC0592v0);
        if (k0V == null) {
            return G0.f5084c;
        }
        c cVar = interfaceC0592v0 instanceof c ? (c) interfaceC0592v0 : null;
        if (cVar == null) {
            cVar = new c(k0V, false, null);
        }
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        synchronized (cVar) {
            if (cVar.j()) {
                return G0.f5082a;
            }
            cVar.m(true);
            if (cVar != interfaceC0592v0 && !androidx.concurrent.futures.b.a(f5059a, this, interfaceC0592v0, cVar)) {
                return G0.f5084c;
            }
            boolean zI = cVar.i();
            C c3 = obj instanceof C ? (C) obj : null;
            if (c3 != null) {
                cVar.b(c3.f5057a);
            }
            Throwable thE = zI ^ true ? cVar.e() : null;
            yVar.f9750a = thE;
            I1.u uVar = I1.u.f2419a;
            if (thE != null) {
                m0(k0V, thE);
            }
            C0591v c0591vL0 = l0(k0V);
            if (c0591vL0 != null && H0(cVar, c0591vL0, obj)) {
                return G0.f5083b;
            }
            k0V.f(2);
            C0591v c0591vL02 = l0(k0V);
            return (c0591vL02 == null || !H0(cVar, c0591vL02, obj)) ? M(cVar, obj) : G0.f5083b;
        }
    }

    private final boolean H0(c cVar, C0591v c0591v, Object obj) {
        while (C0.k(c0591v.f5178e, false, new b(this, cVar, c0591v, obj)) == L0.f5094a) {
            c0591v = l0(c0591v);
            if (c0591v == null) {
                return false;
            }
        }
        return true;
    }

    private final void I(InterfaceC0592v0 interfaceC0592v0, Object obj) throws Throwable {
        InterfaceC0589u interfaceC0589uW = W();
        if (interfaceC0589uW != null) {
            interfaceC0589uW.e();
            x0(L0.f5094a);
        }
        C c3 = obj instanceof C ? (C) obj : null;
        Throwable th = c3 != null ? c3.f5057a : null;
        if (!(interfaceC0592v0 instanceof E0)) {
            K0 k0A = interfaceC0592v0.a();
            if (k0A != null) {
                n0(k0A, th);
                return;
            }
            return;
        }
        try {
            ((E0) interfaceC0592v0).w(th);
        } catch (Throwable th2) {
            b0(new D("Exception in completion handler " + interfaceC0592v0 + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(c cVar, C0591v c0591v, Object obj) {
        C0591v c0591vL0 = l0(c0591v);
        if (c0591vL0 == null || !H0(cVar, c0591vL0, obj)) {
            cVar.a().f(2);
            C0591v c0591vL02 = l0(c0591v);
            if (c0591vL02 == null || !H0(cVar, c0591vL02, obj)) {
                w(M(cVar, obj));
            }
        }
    }

    private final Throwable L(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th == null ? new A0(G(), null, this) : th;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((N0) obj).B();
    }

    private final Object M(c cVar, Object obj) throws Throwable {
        boolean zI;
        Throwable thQ;
        C c3 = obj instanceof C ? (C) obj : null;
        Throwable th = c3 != null ? c3.f5057a : null;
        synchronized (cVar) {
            zI = cVar.i();
            List listL = cVar.l(th);
            thQ = Q(cVar, listL);
            if (thQ != null) {
                v(thQ, listL);
            }
        }
        if (thQ != null && thQ != th) {
            obj = new C(thQ, false, 2, null);
        }
        if (thQ != null && (F(thQ) || a0(thQ))) {
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C) obj).c();
        }
        if (!zI) {
            q0(thQ);
        }
        r0(obj);
        androidx.concurrent.futures.b.a(f5059a, this, cVar, G0.g(obj));
        I(cVar, obj);
        return obj;
    }

    private final Throwable O(Object obj) {
        C c3 = obj instanceof C ? (C) obj : null;
        if (c3 != null) {
            return c3.f5057a;
        }
        return null;
    }

    private final Throwable Q(c cVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.i()) {
                return new A0(G(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof W0) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof W0)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final K0 V(InterfaceC0592v0 interfaceC0592v0) {
        K0 k0A = interfaceC0592v0.a();
        if (k0A != null) {
            return k0A;
        }
        if (interfaceC0592v0 instanceof C0567i0) {
            return new K0();
        }
        if (interfaceC0592v0 instanceof E0) {
            u0((E0) interfaceC0592v0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0592v0).toString());
    }

    private final boolean f0() {
        Object objX;
        do {
            objX = X();
            if (!(objX instanceof InterfaceC0592v0)) {
                return false;
            }
        } while (y0(objX) < 0);
        return true;
    }

    private final Object g0(M1.d dVar) {
        C0580p c0580p = new C0580p(N1.c.c(dVar), 1);
        c0580p.F();
        r.a(c0580p, D0.l(this, false, new P0(c0580p), 1, null));
        Object objZ = c0580p.z();
        if (objZ == N1.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objZ == N1.d.e() ? objZ : I1.u.f2419a;
    }

    private final Object h0(Object obj) throws Throwable {
        Throwable thL = null;
        while (true) {
            Object objX = X();
            if (objX instanceof c) {
                synchronized (objX) {
                    if (((c) objX).k()) {
                        return G0.f5085d;
                    }
                    boolean zI = ((c) objX).i();
                    if (obj != null || !zI) {
                        if (thL == null) {
                            thL = L(obj);
                        }
                        ((c) objX).b(thL);
                    }
                    Throwable thE = zI ^ true ? ((c) objX).e() : null;
                    if (thE != null) {
                        m0(((c) objX).a(), thE);
                    }
                    return G0.f5082a;
                }
            }
            if (!(objX instanceof InterfaceC0592v0)) {
                return G0.f5085d;
            }
            if (thL == null) {
                thL = L(obj);
            }
            InterfaceC0592v0 interfaceC0592v0 = (InterfaceC0592v0) objX;
            if (!interfaceC0592v0.isActive()) {
                Object objF0 = F0(objX, new C(thL, false, 2, null));
                if (objF0 == G0.f5082a) {
                    throw new IllegalStateException(("Cannot happen in " + objX).toString());
                }
                if (objF0 != G0.f5084c) {
                    return objF0;
                }
            } else if (E0(interfaceC0592v0, thL)) {
                return G0.f5082a;
            }
        }
    }

    private final C0591v l0(C0898o c0898o) {
        while (c0898o.q()) {
            c0898o = c0898o.m();
        }
        while (true) {
            c0898o = c0898o.l();
            if (!c0898o.q()) {
                if (c0898o instanceof C0591v) {
                    return (C0591v) c0898o;
                }
                if (c0898o instanceof K0) {
                    return null;
                }
            }
        }
    }

    private final void m0(K0 k02, Throwable th) throws Throwable {
        q0(th);
        k02.f(4);
        Object objK = k02.k();
        kotlin.jvm.internal.m.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        D d3 = null;
        for (C0898o c0898oL = (C0898o) objK; !kotlin.jvm.internal.m.a(c0898oL, k02); c0898oL = c0898oL.l()) {
            if ((c0898oL instanceof E0) && ((E0) c0898oL).v()) {
                try {
                    ((E0) c0898oL).w(th);
                } catch (Throwable th2) {
                    if (d3 != null) {
                        I1.b.a(d3, th2);
                    } else {
                        d3 = new D("Exception in completion handler " + c0898oL + " for " + this, th2);
                        I1.u uVar = I1.u.f2419a;
                    }
                }
            }
        }
        if (d3 != null) {
            b0(d3);
        }
        F(th);
    }

    private final void n0(K0 k02, Throwable th) throws Throwable {
        k02.f(1);
        Object objK = k02.k();
        kotlin.jvm.internal.m.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        D d3 = null;
        for (C0898o c0898oL = (C0898o) objK; !kotlin.jvm.internal.m.a(c0898oL, k02); c0898oL = c0898oL.l()) {
            if (c0898oL instanceof E0) {
                try {
                    ((E0) c0898oL).w(th);
                } catch (Throwable th2) {
                    if (d3 != null) {
                        I1.b.a(d3, th2);
                    } else {
                        d3 = new D("Exception in completion handler " + c0898oL + " for " + this, th2);
                        I1.u uVar = I1.u.f2419a;
                    }
                }
            }
        }
        if (d3 != null) {
            b0(d3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o0(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof C) {
            throw ((C) obj2).f5057a;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(k2.e eVar, Object obj) {
        Object objX;
        do {
            objX = X();
            if (!(objX instanceof InterfaceC0592v0)) {
                if (!(objX instanceof C)) {
                    objX = G0.h(objX);
                }
                eVar.b(objX);
                return;
            }
        } while (y0(objX) < 0);
        eVar.a(D0.l(this, false, new d(eVar), 1, null));
    }

    private final void t0(C0567i0 c0567i0) {
        K0 k02 = new K0();
        Object c0590u0 = k02;
        if (!c0567i0.isActive()) {
            c0590u0 = new C0590u0(k02);
        }
        androidx.concurrent.futures.b.a(f5059a, this, c0567i0, c0590u0);
    }

    private final void u0(E0 e02) {
        e02.d(new K0());
        androidx.concurrent.futures.b.a(f5059a, this, e02, e02.l());
    }

    private final void v(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                I1.b.a(th, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(k2.e eVar, Object obj) {
        if (f0()) {
            eVar.a(D0.l(this, false, new e(eVar), 1, null));
        } else {
            eVar.b(I1.u.f2419a);
        }
    }

    private final Object y(M1.d dVar) {
        a aVar = new a(N1.c.c(dVar), this);
        aVar.F();
        r.a(aVar, D0.l(this, false, new O0(aVar), 1, null));
        Object objZ = aVar.z();
        if (objZ == N1.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objZ;
    }

    private final int y0(Object obj) {
        if (obj instanceof C0567i0) {
            if (((C0567i0) obj).isActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f5059a, this, obj, G0.f5088g)) {
                return -1;
            }
            s0();
            return 1;
        }
        if (!(obj instanceof C0590u0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f5059a, this, obj, ((C0590u0) obj).a())) {
            return -1;
        }
        s0();
        return 1;
    }

    private final String z0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC0592v0 ? ((InterfaceC0592v0) obj).isActive() ? "Active" : "New" : obj instanceof C ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.i() ? "Cancelling" : cVar.j() ? "Completing" : "Active";
    }

    public final boolean A(Throwable th) {
        return C(th);
    }

    protected final CancellationException A0(Throwable th, String str) {
        CancellationException a02 = th instanceof CancellationException ? (CancellationException) th : null;
        if (a02 == null) {
            if (str == null) {
                str = G();
            }
            a02 = new A0(str, th, this);
        }
        return a02;
    }

    @Override // c2.N0
    public CancellationException B() {
        Throwable thE;
        Object objX = X();
        if (objX instanceof c) {
            thE = ((c) objX).e();
        } else if (objX instanceof C) {
            thE = ((C) objX).f5057a;
        } else {
            if (objX instanceof InterfaceC0592v0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objX).toString());
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new A0("Parent job is " + z0(objX), thE, this);
    }

    public final boolean C(Object obj) throws Throwable {
        Object objH0 = G0.f5082a;
        if (U() && (objH0 = E(obj)) == G0.f5083b) {
            return true;
        }
        if (objH0 == G0.f5082a) {
            objH0 = h0(obj);
        }
        if (objH0 == G0.f5082a || objH0 == G0.f5083b) {
            return true;
        }
        if (objH0 == G0.f5085d) {
            return false;
        }
        w(objH0);
        return true;
    }

    public final String C0() {
        return k0() + '{' + z0(X()) + '}';
    }

    public void D(Throwable th) throws Throwable {
        C(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String G() {
        return "Job was cancelled";
    }

    public boolean H(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return C(th) && S();
    }

    public final Object N() throws Throwable {
        Object objX = X();
        if (!(!(objX instanceof InterfaceC0592v0))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objX instanceof C) {
            throw ((C) objX).f5057a;
        }
        return G0.h(objX);
    }

    public boolean S() {
        return true;
    }

    protected final k2.c T() {
        g gVar = g.f5077a;
        kotlin.jvm.internal.m.c(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        U1.q qVar = (U1.q) kotlin.jvm.internal.D.b(gVar, 3);
        h hVar = h.f5078a;
        kotlin.jvm.internal.m.c(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new k2.d(this, qVar, (U1.q) kotlin.jvm.internal.D.b(hVar, 3), null, 8, null);
    }

    public boolean U() {
        return false;
    }

    public final InterfaceC0589u W() {
        return (InterfaceC0589u) f5060b.get(this);
    }

    public final Object X() {
        return f5059a.get(this);
    }

    protected boolean a0(Throwable th) {
        return false;
    }

    @Override // c2.InterfaceC0600z0
    public final InterfaceC0589u attachChild(InterfaceC0593w interfaceC0593w) {
        C0591v c0591v = new C0591v(interfaceC0593w);
        c0591v.x(this);
        while (true) {
            Object objX = X();
            if (objX instanceof C0567i0) {
                C0567i0 c0567i0 = (C0567i0) objX;
                if (!c0567i0.isActive()) {
                    t0(c0567i0);
                } else if (androidx.concurrent.futures.b.a(f5059a, this, objX, c0591v)) {
                    break;
                }
            } else {
                if (!(objX instanceof InterfaceC0592v0)) {
                    Object objX2 = X();
                    C c3 = objX2 instanceof C ? (C) objX2 : null;
                    c0591v.w(c3 != null ? c3.f5057a : null);
                    return L0.f5094a;
                }
                K0 k0A = ((InterfaceC0592v0) objX).a();
                if (k0A == null) {
                    kotlin.jvm.internal.m.c(objX, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    u0((E0) objX);
                } else if (!k0A.b(c0591v, 7)) {
                    boolean zB = k0A.b(c0591v, 3);
                    Object objX3 = X();
                    if (objX3 instanceof c) {
                        thE = ((c) objX3).e();
                    } else {
                        C c4 = objX3 instanceof C ? (C) objX3 : null;
                        if (c4 != null) {
                            thE = c4.f5057a;
                        }
                    }
                    c0591v.w(thE);
                    if (!zB) {
                        return L0.f5094a;
                    }
                }
            }
        }
        return c0591v;
    }

    protected final void c0(InterfaceC0600z0 interfaceC0600z0) {
        if (interfaceC0600z0 == null) {
            x0(L0.f5094a);
            return;
        }
        interfaceC0600z0.start();
        InterfaceC0589u interfaceC0589uAttachChild = interfaceC0600z0.attachChild(this);
        x0(interfaceC0589uAttachChild);
        if (isCompleted()) {
            interfaceC0589uAttachChild.e();
            x0(L0.f5094a);
        }
    }

    @Override // c2.InterfaceC0600z0
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    public final InterfaceC0561f0 d0(boolean z2, E0 e02) {
        int i3;
        e02.x(this);
        while (true) {
            Object objX = X();
            if (objX instanceof C0567i0) {
                C0567i0 c0567i0 = (C0567i0) objX;
                if (!c0567i0.isActive()) {
                    t0(c0567i0);
                } else if (androidx.concurrent.futures.b.a(f5059a, this, objX, e02)) {
                    break;
                }
            } else {
                if (!(objX instanceof InterfaceC0592v0)) {
                    if (z2) {
                        Object objX2 = X();
                        C c3 = objX2 instanceof C ? (C) objX2 : null;
                        e02.w(c3 != null ? c3.f5057a : null);
                    }
                    return L0.f5094a;
                }
                InterfaceC0592v0 interfaceC0592v0 = (InterfaceC0592v0) objX;
                K0 k0A = interfaceC0592v0.a();
                if (k0A == null) {
                    kotlin.jvm.internal.m.c(objX, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    u0((E0) objX);
                } else {
                    if (e02.v()) {
                        c cVar = interfaceC0592v0 instanceof c ? (c) interfaceC0592v0 : null;
                        Throwable thE = cVar != null ? cVar.e() : null;
                        if (thE != null) {
                            if (z2) {
                                e02.w(thE);
                            }
                            return L0.f5094a;
                        }
                        i3 = 5;
                    } else {
                        i3 = 1;
                    }
                    if (k0A.b(e02, i3)) {
                        break;
                    }
                }
            }
        }
        return e02;
    }

    protected boolean e0() {
        return false;
    }

    @Override // c2.InterfaceC0593w
    public final void f(N0 n02) throws Throwable {
        C(n02);
    }

    @Override // M1.g.b, M1.g
    public Object fold(Object obj, U1.p pVar) {
        return InterfaceC0600z0.a.c(this, obj, pVar);
    }

    @Override // M1.g.b, M1.g
    public g.b get(g.c cVar) {
        return InterfaceC0600z0.a.d(this, cVar);
    }

    @Override // c2.InterfaceC0600z0
    public final CancellationException getCancellationException() {
        Object objX = X();
        if (!(objX instanceof c)) {
            if (objX instanceof InterfaceC0592v0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objX instanceof C) {
                return B0(this, ((C) objX).f5057a, null, 1, null);
            }
            return new A0(S.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objX).e();
        if (thE != null) {
            CancellationException cancellationExceptionA0 = A0(thE, S.a(this) + " is cancelling");
            if (cancellationExceptionA0 != null) {
                return cancellationExceptionA0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // c2.InterfaceC0600z0
    public final a2.c getChildren() {
        return a2.g.b(new f(null));
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object objX = X();
        if (!(objX instanceof InterfaceC0592v0)) {
            return O(objX);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // M1.g.b
    public final g.c getKey() {
        return InterfaceC0600z0.f5183i;
    }

    @Override // c2.InterfaceC0600z0
    public final k2.a getOnJoin() {
        i iVar = i.f5079a;
        kotlin.jvm.internal.m.c(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new k2.b(this, (U1.q) kotlin.jvm.internal.D.b(iVar, 3), null, 4, null);
    }

    @Override // c2.InterfaceC0600z0
    public InterfaceC0600z0 getParent() {
        InterfaceC0589u interfaceC0589uW = W();
        if (interfaceC0589uW != null) {
            return interfaceC0589uW.getParent();
        }
        return null;
    }

    public final boolean i0(Object obj) {
        Object objF0;
        do {
            objF0 = F0(X(), obj);
            if (objF0 == G0.f5082a) {
                return false;
            }
            if (objF0 == G0.f5083b) {
                return true;
            }
        } while (objF0 == G0.f5084c);
        w(objF0);
        return true;
    }

    @Override // c2.InterfaceC0600z0
    public final InterfaceC0561f0 invokeOnCompletion(U1.l lVar) {
        return d0(true, new C0598y0(lVar));
    }

    @Override // c2.InterfaceC0600z0
    public boolean isActive() {
        Object objX = X();
        return (objX instanceof InterfaceC0592v0) && ((InterfaceC0592v0) objX).isActive();
    }

    @Override // c2.InterfaceC0600z0
    public final boolean isCancelled() {
        Object objX = X();
        return (objX instanceof C) || ((objX instanceof c) && ((c) objX).i());
    }

    @Override // c2.InterfaceC0600z0
    public final boolean isCompleted() {
        return !(X() instanceof InterfaceC0592v0);
    }

    public final Object j0(Object obj) {
        Object objF0;
        do {
            objF0 = F0(X(), obj);
            if (objF0 == G0.f5082a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, O(obj));
            }
        } while (objF0 == G0.f5084c);
        return objF0;
    }

    @Override // c2.InterfaceC0600z0
    public final Object join(M1.d dVar) {
        if (f0()) {
            Object objG0 = g0(dVar);
            return objG0 == N1.d.e() ? objG0 : I1.u.f2419a;
        }
        C0.h(dVar.getContext());
        return I1.u.f2419a;
    }

    public String k0() {
        return S.a(this);
    }

    @Override // M1.g.b, M1.g
    public M1.g minusKey(g.c cVar) {
        return InterfaceC0600z0.a.e(this, cVar);
    }

    @Override // M1.g
    public M1.g plus(M1.g gVar) {
        return InterfaceC0600z0.a.f(this, gVar);
    }

    @Override // c2.InterfaceC0600z0
    public final boolean start() {
        int iY0;
        do {
            iY0 = y0(X());
            if (iY0 == 0) {
                return false;
            }
        } while (iY0 != 1);
        return true;
    }

    public String toString() {
        return C0() + '@' + S.b(this);
    }

    public final void w0(E0 e02) {
        Object objX;
        do {
            objX = X();
            if (!(objX instanceof E0)) {
                if (!(objX instanceof InterfaceC0592v0) || ((InterfaceC0592v0) objX).a() == null) {
                    return;
                }
                e02.r();
                return;
            }
            if (objX != e02) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f5059a, this, objX, G0.f5088g));
    }

    protected final Object x(M1.d dVar) throws Throwable {
        Object objX;
        do {
            objX = X();
            if (!(objX instanceof InterfaceC0592v0)) {
                if (objX instanceof C) {
                    throw ((C) objX).f5057a;
                }
                return G0.h(objX);
            }
        } while (y0(objX) < 0);
        return y(dVar);
    }

    public final void x0(InterfaceC0589u interfaceC0589u) {
        f5060b.set(this, interfaceC0589u);
    }

    @Override // c2.InterfaceC0600z0
    public void cancel(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new A0(G(), null, this);
        }
        D(cancellationException);
    }

    @Override // c2.InterfaceC0600z0
    public final InterfaceC0561f0 invokeOnCompletion(boolean z2, boolean z3, U1.l lVar) {
        return d0(z3, z2 ? new C0596x0(lVar) : new C0598y0(lVar));
    }

    @Override // c2.InterfaceC0600z0
    public InterfaceC0600z0 plus(InterfaceC0600z0 interfaceC0600z0) {
        return InterfaceC0600z0.a.g(this, interfaceC0600z0);
    }

    @Override // c2.InterfaceC0600z0
    public /* synthetic */ boolean cancel(Throwable th) throws Throwable {
        Throwable a02;
        if (th == null || (a02 = B0(this, th, null, 1, null)) == null) {
            a02 = new A0(G(), null, this);
        }
        D(a02);
        return true;
    }

    public void b0(Throwable th) throws Throwable {
        throw th;
    }

    protected void q0(Throwable th) {
    }

    protected void r0(Object obj) {
    }

    protected void w(Object obj) {
    }

    protected void s0() {
    }
}
