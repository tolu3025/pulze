package io.grpc.internal;

import io.grpc.internal.InterfaceC0954l0;
import io.grpc.internal.InterfaceC0966s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import y1.AbstractC1308k;
import y1.C1300c;
import y1.S;

/* JADX INFO: loaded from: classes.dex */
final class B implements InterfaceC0954l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f8351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y1.p0 f8352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f8353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f8354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f8355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC0954l0.a f8356h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private y1.l0 f8358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private S.j f8359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f8360l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.K f8349a = y1.K.a(B.class, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8350b = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Collection f8357i = new LinkedHashSet();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0954l0.a f8361a;

        a(InterfaceC0954l0.a aVar) {
            this.f8361a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8361a.b(true);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0954l0.a f8363a;

        b(InterfaceC0954l0.a aVar) {
            this.f8363a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8363a.b(false);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0954l0.a f8365a;

        c(InterfaceC0954l0.a aVar) {
            this.f8365a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8365a.a();
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y1.l0 f8367a;

        d(y1.l0 l0Var) {
            this.f8367a = l0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.f8356h.c(this.f8367a);
        }
    }

    private class e extends C {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final S.g f8369j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final y1.r f8370k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final AbstractC1308k[] f8371l;

        private e(S.g gVar, AbstractC1308k[] abstractC1308kArr) {
            this.f8370k = y1.r.e();
            this.f8369j = gVar;
            this.f8371l = abstractC1308kArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Runnable B(InterfaceC0968t interfaceC0968t) {
            y1.r rVarB = this.f8370k.b();
            try {
                r rVarB2 = interfaceC0968t.b(this.f8369j.c(), this.f8369j.b(), this.f8369j.a(), this.f8371l);
                this.f8370k.f(rVarB);
                return x(rVarB2);
            } catch (Throwable th) {
                this.f8370k.f(rVarB);
                throw th;
            }
        }

        @Override // io.grpc.internal.C, io.grpc.internal.r
        public void d(y1.l0 l0Var) {
            super.d(l0Var);
            synchronized (B.this.f8350b) {
                try {
                    if (B.this.f8355g != null) {
                        boolean zRemove = B.this.f8357i.remove(this);
                        if (!B.this.r() && zRemove) {
                            B.this.f8352d.b(B.this.f8354f);
                            if (B.this.f8358j != null) {
                                B.this.f8352d.b(B.this.f8355g);
                                B.this.f8355g = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            B.this.f8352d.a();
        }

        @Override // io.grpc.internal.C, io.grpc.internal.r
        public void l(Y y2) {
            if (this.f8369j.a().j()) {
                y2.a("wait_for_ready");
            }
            super.l(y2);
        }

        @Override // io.grpc.internal.C
        protected void v(y1.l0 l0Var) {
            for (AbstractC1308k abstractC1308k : this.f8371l) {
                abstractC1308k.i(l0Var);
            }
        }

        /* synthetic */ e(B b3, S.g gVar, AbstractC1308k[] abstractC1308kArr, a aVar) {
            this(gVar, abstractC1308kArr);
        }
    }

    B(Executor executor, y1.p0 p0Var) {
        this.f8351c = executor;
        this.f8352d = p0Var;
    }

    private e p(S.g gVar, AbstractC1308k[] abstractC1308kArr) {
        e eVar = new e(this, gVar, abstractC1308kArr, null);
        this.f8357i.add(eVar);
        if (q() == 1) {
            this.f8352d.b(this.f8353e);
        }
        for (AbstractC1308k abstractC1308k : abstractC1308kArr) {
            abstractC1308k.j();
        }
        return eVar;
    }

    @Override // io.grpc.internal.InterfaceC0968t
    public final r b(y1.a0 a0Var, y1.Z z2, C1300c c1300c, AbstractC1308k[] abstractC1308kArr) {
        r g3;
        try {
            C0975w0 c0975w0 = new C0975w0(a0Var, z2, c1300c);
            S.j jVar = null;
            long j3 = -1;
            while (true) {
                synchronized (this.f8350b) {
                    if (this.f8358j == null) {
                        S.j jVar2 = this.f8359k;
                        if (jVar2 != null) {
                            if (jVar != null && j3 == this.f8360l) {
                                g3 = p(c0975w0, abstractC1308kArr);
                                break;
                            }
                            j3 = this.f8360l;
                            InterfaceC0968t interfaceC0968tK = S.k(jVar2.a(c0975w0), c1300c.j());
                            if (interfaceC0968tK != null) {
                                g3 = interfaceC0968tK.b(c0975w0.c(), c0975w0.b(), c0975w0.a(), abstractC1308kArr);
                                break;
                            }
                            jVar = jVar2;
                        } else {
                            g3 = p(c0975w0, abstractC1308kArr);
                            break;
                        }
                    } else {
                        g3 = new G(this.f8358j, abstractC1308kArr);
                        break;
                    }
                }
            }
            return g3;
        } finally {
            this.f8352d.a();
        }
    }

    @Override // io.grpc.internal.InterfaceC0954l0
    public final Runnable c(InterfaceC0954l0.a aVar) {
        this.f8356h = aVar;
        this.f8353e = new a(aVar);
        this.f8354f = new b(aVar);
        this.f8355g = new c(aVar);
        return null;
    }

    @Override // io.grpc.internal.InterfaceC0954l0
    public final void d(y1.l0 l0Var) {
        Runnable runnable;
        synchronized (this.f8350b) {
            try {
                if (this.f8358j != null) {
                    return;
                }
                this.f8358j = l0Var;
                this.f8352d.b(new d(l0Var));
                if (!r() && (runnable = this.f8355g) != null) {
                    this.f8352d.b(runnable);
                    this.f8355g = null;
                }
                this.f8352d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.P
    public y1.K g() {
        return this.f8349a;
    }

    @Override // io.grpc.internal.InterfaceC0954l0
    public final void i(y1.l0 l0Var) {
        Collection<e> collection;
        Runnable runnable;
        d(l0Var);
        synchronized (this.f8350b) {
            try {
                collection = this.f8357i;
                runnable = this.f8355g;
                this.f8355g = null;
                if (!collection.isEmpty()) {
                    this.f8357i = Collections.emptyList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                Runnable runnableX = eVar.x(new G(l0Var, InterfaceC0966s.a.REFUSED, eVar.f8371l));
                if (runnableX != null) {
                    runnableX.run();
                }
            }
            this.f8352d.execute(runnable);
        }
    }

    final int q() {
        int size;
        synchronized (this.f8350b) {
            size = this.f8357i.size();
        }
        return size;
    }

    public final boolean r() {
        boolean z2;
        synchronized (this.f8350b) {
            z2 = !this.f8357i.isEmpty();
        }
        return z2;
    }

    final void s(S.j jVar) {
        Runnable runnable;
        synchronized (this.f8350b) {
            this.f8359k = jVar;
            this.f8360l++;
            if (jVar != null && r()) {
                ArrayList<e> arrayList = new ArrayList(this.f8357i);
                ArrayList arrayList2 = new ArrayList();
                for (e eVar : arrayList) {
                    S.f fVarA = jVar.a(eVar.f8369j);
                    C1300c c1300cA = eVar.f8369j.a();
                    InterfaceC0968t interfaceC0968tK = S.k(fVarA, c1300cA.j());
                    if (interfaceC0968tK != null) {
                        Executor executorE = this.f8351c;
                        if (c1300cA.e() != null) {
                            executorE = c1300cA.e();
                        }
                        Runnable runnableB = eVar.B(interfaceC0968tK);
                        if (runnableB != null) {
                            executorE.execute(runnableB);
                        }
                        arrayList2.add(eVar);
                    }
                }
                synchronized (this.f8350b) {
                    try {
                        if (r()) {
                            this.f8357i.removeAll(arrayList2);
                            if (this.f8357i.isEmpty()) {
                                this.f8357i = new LinkedHashSet();
                            }
                            if (!r()) {
                                this.f8352d.b(this.f8354f);
                                if (this.f8358j != null && (runnable = this.f8355g) != null) {
                                    this.f8352d.b(runnable);
                                    this.f8355g = null;
                                }
                            }
                            this.f8352d.a();
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
