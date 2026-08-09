package io.grpc.internal;

import c.AbstractC0527b;
import e0.AbstractC0825f;
import e0.AbstractC0829j;
import e0.C0831l;
import e0.InterfaceC0833n;
import io.grpc.internal.C0947i;
import io.grpc.internal.C0952k0;
import io.grpc.internal.C0957n;
import io.grpc.internal.C0963q;
import io.grpc.internal.D0;
import io.grpc.internal.F;
import io.grpc.internal.InterfaceC0949j;
import io.grpc.internal.InterfaceC0954l0;
import io.grpc.internal.Z;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import y1.AbstractC1289A;
import y1.AbstractC1295G;
import y1.AbstractC1301d;
import y1.AbstractC1303f;
import y1.AbstractC1304g;
import y1.AbstractC1307j;
import y1.AbstractC1308k;
import y1.C1293E;
import y1.C1294F;
import y1.C1298a;
import y1.C1300c;
import y1.C1312o;
import y1.C1314q;
import y1.C1316t;
import y1.C1318v;
import y1.C1320x;
import y1.EnumC1313p;
import y1.S;
import y1.c0;
import y1.p0;

/* JADX INFO: renamed from: io.grpc.internal.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0946h0 extends y1.V implements y1.J {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    static final Logger f8915m0 = Logger.getLogger(C0946h0.class.getName());

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    static final Pattern f8916n0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final y1.l0 f8917o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final y1.l0 f8918p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    static final y1.l0 f8919q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final C0952k0 f8920r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final AbstractC1295G f8921s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final AbstractC1304g f8922t0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final List f8923A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final String f8924B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private y1.c0 f8925C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f8926D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private s f8927E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private volatile S.j f8928F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f8929G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Set f8930H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Collection f8931I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Object f8932J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Set f8933K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final B f8934L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final y f8935M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final AtomicBoolean f8936N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f8937O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f8938P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private volatile boolean f8939Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final CountDownLatch f8940R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final C0957n.b f8941S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final C0957n f8942T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final C0961p f8943U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final AbstractC1303f f8944V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final C1293E f8945W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final u f8946X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private v f8947Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private C0952k0 f8948Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.K f8949a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final C0952k0 f8950a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8951b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f8952b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8953c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final boolean f8954c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y1.e0 f8955d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final D0.t f8956d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0.a f8957e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final long f8958e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0947i f8959f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final long f8960f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0970u f8961g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final boolean f8962g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0970u f8963h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final C1316t.c f8964h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0970u f8965i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final InterfaceC0954l0.a f8966i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f8967j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    final X f8968j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Executor f8969k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final m f8970k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC0964q0 f8971l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final C0 f8972l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC0964q0 f8973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p f8974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p f8975o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final S0 f8976p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f8977q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final y1.p0 f8978r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8979s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C1318v f8980t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C1312o f8981u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final InterfaceC0833n f8982v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f8983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final C0976x f8984x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final InterfaceC0949j.a f8985y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AbstractC1301d f8986z;

    /* JADX INFO: renamed from: io.grpc.internal.h0$a */
    class a extends AbstractC1295G {
        a() {
        }

        @Override // y1.AbstractC1295G
        public AbstractC1295G.b a(S.g gVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$b */
    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0946h0.this.y0(true);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$c */
    final class c implements C0957n.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ S0 f8988a;

        c(S0 s02) {
            this.f8988a = s02;
        }

        @Override // io.grpc.internal.C0957n.b
        public C0957n a() {
            return new C0957n(this.f8988a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$d */
    final class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f8990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC1313p f8991b;

        d(Runnable runnable, EnumC1313p enumC1313p) {
            this.f8990a = runnable;
            this.f8991b = enumC1313p;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0946h0.this.f8984x.c(this.f8990a, C0946h0.this.f8969k, this.f8991b);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$e */
    final class e extends S.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S.f f8993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f8994b;

        e(Throwable th) {
            this.f8994b = th;
            this.f8993a = S.f.e(y1.l0.f11974s.q("Panic! This is a bug!").p(th));
        }

        @Override // y1.S.j
        public S.f a(S.g gVar) {
            return this.f8993a;
        }

        public String toString() {
            return AbstractC0825f.a(e.class).d("panicPickResult", this.f8993a).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$f */
    final class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0946h0.this.f8936N.get() || C0946h0.this.f8927E == null) {
                return;
            }
            C0946h0.this.y0(false);
            C0946h0.this.z0();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$g */
    final class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0946h0.this.A0();
            if (C0946h0.this.f8928F != null) {
                C0946h0.this.f8928F.b();
            }
            if (C0946h0.this.f8927E != null) {
                C0946h0.this.f8927E.f9027a.c();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$h */
    final class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0946h0.this.f8944V.a(AbstractC1303f.a.INFO, "Entering SHUTDOWN state");
            C0946h0.this.f8984x.b(EnumC1313p.SHUTDOWN);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$i */
    final class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0946h0.this.f8937O) {
                return;
            }
            C0946h0.this.f8937O = true;
            C0946h0.this.E0();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$j */
    class j implements Thread.UncaughtExceptionHandler {
        j() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            C0946h0.f8915m0.log(Level.SEVERE, "[" + C0946h0.this.g() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            C0946h0.this.G0(th);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$k */
    class k extends N {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(y1.c0 c0Var, String str) {
            super(c0Var);
            this.f9001b = str;
        }

        @Override // io.grpc.internal.N, y1.c0
        public String a() {
            return this.f9001b;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$m */
    private final class m implements C0963q.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile D0.D f9002a;

        /* JADX INFO: renamed from: io.grpc.internal.h0$m$a */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0946h0.this.A0();
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$m$b */
        final class b extends D0 {

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ y1.a0 f9005E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ y1.Z f9006F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ C1300c f9007G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ E0 f9008H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ U f9009I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ y1.r f9010J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(y1.a0 a0Var, y1.Z z2, C1300c c1300c, E0 e02, U u2, y1.r rVar) {
                super(a0Var, z2, C0946h0.this.f8956d0, C0946h0.this.f8958e0, C0946h0.this.f8960f0, C0946h0.this.B0(c1300c), C0946h0.this.f8963h.F(), e02, u2, m.this.f9002a);
                this.f9005E = a0Var;
                this.f9006F = z2;
                this.f9007G = c1300c;
                this.f9008H = e02;
                this.f9009I = u2;
                this.f9010J = rVar;
            }

            @Override // io.grpc.internal.D0
            io.grpc.internal.r j0(y1.Z z2, AbstractC1308k.a aVar, int i3, boolean z3) {
                C1300c c1300cR = this.f9007G.r(aVar);
                AbstractC1308k[] abstractC1308kArrF = S.f(c1300cR, z2, i3, z3);
                InterfaceC0968t interfaceC0968tC = m.this.c(new C0975w0(this.f9005E, z2, c1300cR));
                y1.r rVarB = this.f9010J.b();
                try {
                    return interfaceC0968tC.b(this.f9005E, z2, c1300cR, abstractC1308kArrF);
                } finally {
                    this.f9010J.f(rVarB);
                }
            }

            @Override // io.grpc.internal.D0
            void k0() {
                C0946h0.this.f8935M.d(this);
            }

            @Override // io.grpc.internal.D0
            y1.l0 l0() {
                return C0946h0.this.f8935M.a(this);
            }
        }

        private m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterfaceC0968t c(S.g gVar) {
            S.j jVar = C0946h0.this.f8928F;
            if (!C0946h0.this.f8936N.get()) {
                if (jVar == null) {
                    C0946h0.this.f8978r.execute(new a());
                } else {
                    InterfaceC0968t interfaceC0968tK = S.k(jVar.a(gVar), gVar.a().j());
                    if (interfaceC0968tK != null) {
                        return interfaceC0968tK;
                    }
                }
            }
            return C0946h0.this.f8934L;
        }

        @Override // io.grpc.internal.C0963q.e
        public io.grpc.internal.r a(y1.a0 a0Var, C1300c c1300c, y1.Z z2, y1.r rVar) {
            if (C0946h0.this.f8962g0) {
                C0952k0.b bVar = (C0952k0.b) c1300c.h(C0952k0.b.f9146g);
                return new b(a0Var, z2, c1300c, bVar == null ? null : bVar.f9151e, bVar != null ? bVar.f9152f : null, rVar);
            }
            InterfaceC0968t interfaceC0968tC = c(new C0975w0(a0Var, z2, c1300c));
            y1.r rVarB = rVar.b();
            try {
                return interfaceC0968tC.b(a0Var, z2, c1300c, S.f(c1300c, z2, 0, false));
            } finally {
                rVar.f(rVarB);
            }
        }

        /* synthetic */ m(C0946h0 c0946h0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$n */
    static final class n extends AbstractC1289A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1295G f9012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC1301d f9013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Executor f9014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final y1.a0 f9015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final y1.r f9016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private C1300c f9017f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private AbstractC1304g f9018g;

        /* JADX INFO: renamed from: io.grpc.internal.h0$n$a */
        class a extends AbstractRunnableC0978y {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC1304g.a f9019b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y1.l0 f9020c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC1304g.a aVar, y1.l0 l0Var) {
                super(n.this.f9016e);
                this.f9019b = aVar;
                this.f9020c = l0Var;
            }

            @Override // io.grpc.internal.AbstractRunnableC0978y
            public void a() {
                this.f9019b.a(this.f9020c, new y1.Z());
            }
        }

        n(AbstractC1295G abstractC1295G, AbstractC1301d abstractC1301d, Executor executor, y1.a0 a0Var, C1300c c1300c) {
            this.f9012a = abstractC1295G;
            this.f9013b = abstractC1301d;
            this.f9015d = a0Var;
            executor = c1300c.e() != null ? c1300c.e() : executor;
            this.f9014c = executor;
            this.f9017f = c1300c.n(executor);
            this.f9016e = y1.r.e();
        }

        private void h(AbstractC1304g.a aVar, y1.l0 l0Var) {
            this.f9014c.execute(new a(aVar, l0Var));
        }

        @Override // y1.AbstractC1289A, y1.f0, y1.AbstractC1304g
        public void a(String str, Throwable th) {
            AbstractC1304g abstractC1304g = this.f9018g;
            if (abstractC1304g != null) {
                abstractC1304g.a(str, th);
            }
        }

        @Override // y1.AbstractC1289A, y1.AbstractC1304g
        public void e(AbstractC1304g.a aVar, y1.Z z2) {
            AbstractC1295G.b bVarA = this.f9012a.a(new C0975w0(this.f9015d, z2, this.f9017f));
            y1.l0 l0VarC = bVarA.c();
            if (!l0VarC.o()) {
                h(aVar, S.o(l0VarC));
                this.f9018g = C0946h0.f8922t0;
                return;
            }
            bVarA.b();
            C0952k0.b bVarF = ((C0952k0) bVarA.a()).f(this.f9015d);
            if (bVarF != null) {
                this.f9017f = this.f9017f.q(C0952k0.b.f9146g, bVarF);
            }
            AbstractC1304g abstractC1304gE = this.f9013b.e(this.f9015d, this.f9017f);
            this.f9018g = abstractC1304gE;
            abstractC1304gE.e(aVar, z2);
        }

        @Override // y1.AbstractC1289A, y1.f0
        protected AbstractC1304g f() {
            return this.f9018g;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$o */
    private final class o implements InterfaceC0954l0.a {
        private o() {
        }

        @Override // io.grpc.internal.InterfaceC0954l0.a
        public void a() {
            AbstractC0829j.u(C0946h0.this.f8936N.get(), "Channel must have been shut down");
            C0946h0.this.f8938P = true;
            C0946h0.this.K0(false);
            C0946h0.this.E0();
            C0946h0.this.F0();
        }

        @Override // io.grpc.internal.InterfaceC0954l0.a
        public void b(boolean z2) {
            C0946h0 c0946h0 = C0946h0.this;
            c0946h0.f8968j0.e(c0946h0.f8934L, z2);
        }

        @Override // io.grpc.internal.InterfaceC0954l0.a
        public void c(y1.l0 l0Var) {
            AbstractC0829j.u(C0946h0.this.f8936N.get(), "Channel must have been shut down");
        }

        @Override // io.grpc.internal.InterfaceC0954l0.a
        public void d() {
        }

        /* synthetic */ o(C0946h0 c0946h0, a aVar) {
            this();
        }

        @Override // io.grpc.internal.InterfaceC0954l0.a
        public C1298a e(C1298a c1298a) {
            return c1298a;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$p */
    static final class p implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0964q0 f9023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Executor f9024b;

        p(InterfaceC0964q0 interfaceC0964q0) {
            this.f9023a = (InterfaceC0964q0) AbstractC0829j.o(interfaceC0964q0, "executorPool");
        }

        synchronized Executor a() {
            try {
                if (this.f9024b == null) {
                    this.f9024b = (Executor) AbstractC0829j.p((Executor) this.f9023a.a(), "%s.getObject()", this.f9024b);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f9024b;
        }

        synchronized void b() {
            Executor executor = this.f9024b;
            if (executor != null) {
                this.f9024b = (Executor) this.f9023a.b(executor);
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a().execute(runnable);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$q */
    private final class q extends X {
        private q() {
        }

        @Override // io.grpc.internal.X
        protected void b() {
            C0946h0.this.A0();
        }

        @Override // io.grpc.internal.X
        protected void c() {
            if (C0946h0.this.f8936N.get()) {
                return;
            }
            C0946h0.this.I0();
        }

        /* synthetic */ q(C0946h0 c0946h0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$r */
    private class r implements Runnable {
        private r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0946h0.this.f8927E == null) {
                return;
            }
            C0946h0.this.z0();
        }

        /* synthetic */ r(C0946h0 c0946h0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$s */
    private final class s extends S.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        C0947i.b f9027a;

        /* JADX INFO: renamed from: io.grpc.internal.h0$s$a */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0946h0.this.H0();
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$s$b */
        final class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ S.j f9030a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ EnumC1313p f9031b;

            b(S.j jVar, EnumC1313p enumC1313p) {
                this.f9030a = jVar;
                this.f9031b = enumC1313p;
            }

            @Override // java.lang.Runnable
            public void run() {
                s sVar = s.this;
                if (sVar != C0946h0.this.f8927E) {
                    return;
                }
                C0946h0.this.M0(this.f9030a);
                if (this.f9031b != EnumC1313p.SHUTDOWN) {
                    C0946h0.this.f8944V.b(AbstractC1303f.a.INFO, "Entering {0} state with picker: {1}", this.f9031b, this.f9030a);
                    C0946h0.this.f8984x.b(this.f9031b);
                }
            }
        }

        private s() {
        }

        @Override // y1.S.e
        public AbstractC1303f b() {
            return C0946h0.this.f8944V;
        }

        @Override // y1.S.e
        public ScheduledExecutorService c() {
            return C0946h0.this.f8967j;
        }

        @Override // y1.S.e
        public y1.p0 d() {
            return C0946h0.this.f8978r;
        }

        @Override // y1.S.e
        public void e() {
            C0946h0.this.f8978r.f();
            C0946h0.this.f8978r.execute(new a());
        }

        @Override // y1.S.e
        public void f(EnumC1313p enumC1313p, S.j jVar) {
            C0946h0.this.f8978r.f();
            AbstractC0829j.o(enumC1313p, "newState");
            AbstractC0829j.o(jVar, "newPicker");
            C0946h0.this.f8978r.execute(new b(jVar, enumC1313p));
        }

        @Override // y1.S.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC0937d a(S.b bVar) {
            C0946h0.this.f8978r.f();
            AbstractC0829j.u(!C0946h0.this.f8938P, "Channel is being terminated");
            return C0946h0.this.new x(bVar);
        }

        /* synthetic */ s(C0946h0 c0946h0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$t */
    final class t extends c0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final s f9033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final y1.c0 f9034b;

        /* JADX INFO: renamed from: io.grpc.internal.h0$t$a */
        final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1.l0 f9036a;

            a(y1.l0 l0Var) {
                this.f9036a = l0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                t.this.d(this.f9036a);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$t$b */
        final class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c0.e f9038a;

            b(c0.e eVar) {
                this.f9038a = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:50:0x0196  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instruction units count: 591
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.C0946h0.t.b.run():void");
            }
        }

        t(s sVar, y1.c0 c0Var) {
            this.f9033a = (s) AbstractC0829j.o(sVar, "helperImpl");
            this.f9034b = (y1.c0) AbstractC0829j.o(c0Var, "resolver");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(y1.l0 l0Var) {
            C0946h0.f8915m0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{C0946h0.this.g(), l0Var});
            C0946h0.this.f8946X.n();
            v vVar = C0946h0.this.f8947Y;
            v vVar2 = v.ERROR;
            if (vVar != vVar2) {
                C0946h0.this.f8944V.b(AbstractC1303f.a.WARNING, "Failed to resolve name: {0}", l0Var);
                C0946h0.this.f8947Y = vVar2;
            }
            if (this.f9033a != C0946h0.this.f8927E) {
                return;
            }
            this.f9033a.f9027a.b(l0Var);
        }

        @Override // y1.c0.d
        public void a(y1.l0 l0Var) {
            AbstractC0829j.e(!l0Var.o(), "the error status must not be OK");
            C0946h0.this.f8978r.execute(new a(l0Var));
        }

        @Override // y1.c0.d
        public void b(c0.e eVar) {
            C0946h0.this.f8978r.execute(new b(eVar));
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$u */
    private class u extends AbstractC1301d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference f9040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractC1301d f9042c;

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$a */
        class a extends AbstractC1301d {
            a() {
            }

            @Override // y1.AbstractC1301d
            public String a() {
                return u.this.f9041b;
            }

            @Override // y1.AbstractC1301d
            public AbstractC1304g e(y1.a0 a0Var, C1300c c1300c) {
                return new C0963q(a0Var, C0946h0.this.B0(c1300c), c1300c, C0946h0.this.f8970k0, C0946h0.this.f8939Q ? null : C0946h0.this.f8963h.F(), C0946h0.this.f8942T, null).E(C0946h0.this.f8979s).D(C0946h0.this.f8980t).C(C0946h0.this.f8981u);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$b */
        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C0946h0.this.f8931I == null) {
                    if (u.this.f9040a.get() == C0946h0.f8921s0) {
                        u.this.f9040a.set(null);
                    }
                    C0946h0.this.f8935M.b(C0946h0.f8918p0);
                }
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$c */
        final class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (u.this.f9040a.get() == C0946h0.f8921s0) {
                    u.this.f9040a.set(null);
                }
                if (C0946h0.this.f8931I != null) {
                    Iterator it = C0946h0.this.f8931I.iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).a("Channel is forcefully shutdown", null);
                    }
                }
                C0946h0.this.f8935M.c(C0946h0.f8917o0);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$d */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0946h0.this.A0();
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$e */
        class e extends AbstractC1304g {
            e() {
            }

            @Override // y1.AbstractC1304g
            public void a(String str, Throwable th) {
            }

            @Override // y1.AbstractC1304g
            public void b() {
            }

            @Override // y1.AbstractC1304g
            public void c(int i3) {
            }

            @Override // y1.AbstractC1304g
            public void d(Object obj) {
            }

            @Override // y1.AbstractC1304g
            public void e(AbstractC1304g.a aVar, y1.Z z2) {
                aVar.a(C0946h0.f8918p0, new y1.Z());
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$f */
        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f9049a;

            f(g gVar) {
                this.f9049a = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (u.this.f9040a.get() != C0946h0.f8921s0) {
                    this.f9049a.r();
                    return;
                }
                if (C0946h0.this.f8931I == null) {
                    C0946h0.this.f8931I = new LinkedHashSet();
                    C0946h0 c0946h0 = C0946h0.this;
                    c0946h0.f8968j0.e(c0946h0.f8932J, true);
                }
                C0946h0.this.f8931I.add(this.f9049a);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$g */
        private final class g extends A {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final y1.r f9051l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final y1.a0 f9052m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final C1300c f9053n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private final long f9054o;

            /* JADX INFO: renamed from: io.grpc.internal.h0$u$g$a */
            class a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Runnable f9056a;

                a(Runnable runnable) {
                    this.f9056a = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f9056a.run();
                    g gVar = g.this;
                    C0946h0.this.f8978r.execute(gVar.new b());
                }
            }

            /* JADX INFO: renamed from: io.grpc.internal.h0$u$g$b */
            final class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C0946h0.this.f8931I != null) {
                        C0946h0.this.f8931I.remove(g.this);
                        if (C0946h0.this.f8931I.isEmpty()) {
                            C0946h0 c0946h0 = C0946h0.this;
                            c0946h0.f8968j0.e(c0946h0.f8932J, false);
                            C0946h0.this.f8931I = null;
                            if (C0946h0.this.f8936N.get()) {
                                C0946h0.this.f8935M.b(C0946h0.f8918p0);
                            }
                        }
                    }
                }
            }

            g(y1.r rVar, y1.a0 a0Var, C1300c c1300c) {
                super(C0946h0.this.B0(c1300c), C0946h0.this.f8967j, c1300c.d());
                this.f9051l = rVar;
                this.f9052m = a0Var;
                this.f9053n = c1300c;
                this.f9054o = C0946h0.this.f8964h0.a();
            }

            @Override // io.grpc.internal.A
            protected void j() {
                super.j();
                C0946h0.this.f8978r.execute(new b());
            }

            void r() {
                y1.r rVarB = this.f9051l.b();
                try {
                    AbstractC1304g abstractC1304gM = u.this.m(this.f9052m, this.f9053n.q(AbstractC1308k.f11950a, Long.valueOf(C0946h0.this.f8964h0.a() - this.f9054o)));
                    this.f9051l.f(rVarB);
                    Runnable runnableP = p(abstractC1304gM);
                    if (runnableP == null) {
                        C0946h0.this.f8978r.execute(new b());
                    } else {
                        C0946h0.this.B0(this.f9053n).execute(new a(runnableP));
                    }
                } catch (Throwable th) {
                    this.f9051l.f(rVarB);
                    throw th;
                }
            }
        }

        private u(String str) {
            this.f9040a = new AtomicReference(C0946h0.f8921s0);
            this.f9042c = new a();
            this.f9041b = (String) AbstractC0829j.o(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AbstractC1304g m(y1.a0 a0Var, C1300c c1300c) {
            AbstractC1295G abstractC1295G = (AbstractC1295G) this.f9040a.get();
            if (abstractC1295G != null) {
                if (!(abstractC1295G instanceof C0952k0.c)) {
                    return new n(abstractC1295G, this.f9042c, C0946h0.this.f8969k, a0Var, c1300c);
                }
                C0952k0.b bVarF = ((C0952k0.c) abstractC1295G).f9153b.f(a0Var);
                if (bVarF != null) {
                    c1300c = c1300c.q(C0952k0.b.f9146g, bVarF);
                }
            }
            return this.f9042c.e(a0Var, c1300c);
        }

        @Override // y1.AbstractC1301d
        public String a() {
            return this.f9041b;
        }

        @Override // y1.AbstractC1301d
        public AbstractC1304g e(y1.a0 a0Var, C1300c c1300c) {
            if (this.f9040a.get() != C0946h0.f8921s0) {
                return m(a0Var, c1300c);
            }
            C0946h0.this.f8978r.execute(new d());
            if (this.f9040a.get() != C0946h0.f8921s0) {
                return m(a0Var, c1300c);
            }
            if (C0946h0.this.f8936N.get()) {
                return new e();
            }
            g gVar = new g(y1.r.e(), a0Var, c1300c);
            C0946h0.this.f8978r.execute(new f(gVar));
            return gVar;
        }

        void n() {
            if (this.f9040a.get() == C0946h0.f8921s0) {
                q(null);
            }
        }

        void o() {
            C0946h0.this.f8978r.execute(new b());
        }

        void p() {
            C0946h0.this.f8978r.execute(new c());
        }

        void q(AbstractC1295G abstractC1295G) {
            AbstractC1295G abstractC1295G2 = (AbstractC1295G) this.f9040a.get();
            this.f9040a.set(abstractC1295G);
            if (abstractC1295G2 != C0946h0.f8921s0 || C0946h0.this.f8931I == null) {
                return;
            }
            Iterator it = C0946h0.this.f8931I.iterator();
            while (it.hasNext()) {
                ((g) it.next()).r();
            }
        }

        /* synthetic */ u(C0946h0 c0946h0, String str, a aVar) {
            this(str);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$v */
    enum v {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$w */
    private static final class w implements ScheduledExecutorService {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f9063a;

        private w(ScheduledExecutorService scheduledExecutorService) {
            this.f9063a = (ScheduledExecutorService) AbstractC0829j.o(scheduledExecutorService, "delegate");
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j3, TimeUnit timeUnit) {
            return this.f9063a.awaitTermination(j3, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f9063a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection) {
            return this.f9063a.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection) {
            return this.f9063a.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f9063a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f9063a.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
            return this.f9063a.schedule(runnable, j3, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j4, TimeUnit timeUnit) {
            return this.f9063a.scheduleAtFixedRate(runnable, j3, j4, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j4, TimeUnit timeUnit) {
            return this.f9063a.scheduleWithFixedDelay(runnable, j3, j4, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable) {
            return this.f9063a.submit(runnable);
        }

        /* synthetic */ w(ScheduledExecutorService scheduledExecutorService, a aVar) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection, long j3, TimeUnit timeUnit) {
            return this.f9063a.invokeAll(collection, j3, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection, long j3, TimeUnit timeUnit) {
            return this.f9063a.invokeAny(collection, j3, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
            return this.f9063a.schedule(callable, j3, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable, Object obj) {
            return this.f9063a.submit(runnable, obj);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Callable callable) {
            return this.f9063a.submit(callable);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$x */
    private final class x extends AbstractC0937d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final S.b f9064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final y1.K f9065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C0959o f9066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final C0961p f9067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        List f9068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Z f9069f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f9070g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f9071h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        p0.d f9072i;

        /* JADX INFO: renamed from: io.grpc.internal.h0$x$a */
        final class a extends Z.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ S.k f9074a;

            a(S.k kVar) {
                this.f9074a = kVar;
            }

            @Override // io.grpc.internal.Z.j
            void a(Z z2) {
                C0946h0.this.f8968j0.e(z2, true);
            }

            @Override // io.grpc.internal.Z.j
            void b(Z z2) {
                C0946h0.this.f8968j0.e(z2, false);
            }

            @Override // io.grpc.internal.Z.j
            void c(Z z2, C1314q c1314q) {
                AbstractC0829j.u(this.f9074a != null, "listener is null");
                this.f9074a.a(c1314q);
            }

            @Override // io.grpc.internal.Z.j
            void d(Z z2) {
                C0946h0.this.f8930H.remove(z2);
                C0946h0.this.f8945W.k(z2);
                C0946h0.this.F0();
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$x$b */
        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                x.this.f9069f.d(C0946h0.f8919q0);
            }
        }

        x(S.b bVar) {
            AbstractC0829j.o(bVar, "args");
            this.f9068e = bVar.a();
            if (C0946h0.this.f8953c != null) {
                bVar = bVar.e().e(j(bVar.a())).c();
            }
            this.f9064a = bVar;
            y1.K kB = y1.K.b("Subchannel", C0946h0.this.a());
            this.f9065b = kB;
            C0961p c0961p = new C0961p(kB, C0946h0.this.f8977q, C0946h0.this.f8976p.a(), "Subchannel for " + bVar.a());
            this.f9067d = c0961p;
            this.f9066c = new C0959o(c0961p, C0946h0.this.f8976p);
        }

        private List j(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1320x c1320x = (C1320x) it.next();
                arrayList.add(new C1320x(c1320x.a(), c1320x.b().d().c(C1320x.f12067d).a()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // y1.S.i
        public List b() {
            C0946h0.this.f8978r.f();
            AbstractC0829j.u(this.f9070g, "not started");
            return this.f9068e;
        }

        @Override // y1.S.i
        public C1298a c() {
            return this.f9064a.b();
        }

        @Override // y1.S.i
        public AbstractC1303f d() {
            return this.f9066c;
        }

        @Override // y1.S.i
        public Object e() {
            AbstractC0829j.u(this.f9070g, "Subchannel is not started");
            return this.f9069f;
        }

        @Override // y1.S.i
        public void f() {
            C0946h0.this.f8978r.f();
            AbstractC0829j.u(this.f9070g, "not started");
            this.f9069f.a();
        }

        @Override // y1.S.i
        public void g() {
            p0.d dVar;
            C0946h0.this.f8978r.f();
            if (this.f9069f == null) {
                this.f9071h = true;
                return;
            }
            if (!this.f9071h) {
                this.f9071h = true;
            } else {
                if (!C0946h0.this.f8938P || (dVar = this.f9072i) == null) {
                    return;
                }
                dVar.a();
                this.f9072i = null;
            }
            if (C0946h0.this.f8938P) {
                this.f9069f.d(C0946h0.f8918p0);
            } else {
                this.f9072i = C0946h0.this.f8978r.d(new RunnableC0940e0(new b()), 5L, TimeUnit.SECONDS, C0946h0.this.f8963h.F());
            }
        }

        @Override // y1.S.i
        public void h(S.k kVar) {
            C0946h0.this.f8978r.f();
            AbstractC0829j.u(!this.f9070g, "already started");
            AbstractC0829j.u(!this.f9071h, "already shutdown");
            AbstractC0829j.u(!C0946h0.this.f8938P, "Channel is being terminated");
            this.f9070g = true;
            Z z2 = new Z(this.f9064a.a(), C0946h0.this.a(), C0946h0.this.f8924B, C0946h0.this.f8985y, C0946h0.this.f8963h, C0946h0.this.f8963h.F(), C0946h0.this.f8982v, C0946h0.this.f8978r, new a(kVar), C0946h0.this.f8945W, C0946h0.this.f8941S.a(), this.f9067d, this.f9065b, this.f9066c, C0946h0.this.f8923A);
            C0946h0.this.f8943U.e(new C1294F.a().b("Child Subchannel started").c(C1294F.b.CT_INFO).e(C0946h0.this.f8976p.a()).d(z2).a());
            this.f9069f = z2;
            C0946h0.this.f8945W.e(z2);
            C0946h0.this.f8930H.add(z2);
        }

        @Override // y1.S.i
        public void i(List list) {
            C0946h0.this.f8978r.f();
            this.f9068e = list;
            if (C0946h0.this.f8953c != null) {
                list = j(list);
            }
            this.f9069f.V(list);
        }

        public String toString() {
            return this.f9065b.toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$y */
    private final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f9077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Collection f9078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        y1.l0 f9079c;

        private y() {
            this.f9077a = new Object();
            this.f9078b = new HashSet();
        }

        y1.l0 a(D0 d02) {
            synchronized (this.f9077a) {
                try {
                    y1.l0 l0Var = this.f9079c;
                    if (l0Var != null) {
                        return l0Var;
                    }
                    this.f9078b.add(d02);
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void b(y1.l0 l0Var) {
            synchronized (this.f9077a) {
                try {
                    if (this.f9079c != null) {
                        return;
                    }
                    this.f9079c = l0Var;
                    boolean zIsEmpty = this.f9078b.isEmpty();
                    if (zIsEmpty) {
                        C0946h0.this.f8934L.d(l0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void c(y1.l0 l0Var) {
            ArrayList arrayList;
            b(l0Var);
            synchronized (this.f9077a) {
                arrayList = new ArrayList(this.f9078b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((io.grpc.internal.r) it.next()).d(l0Var);
            }
            C0946h0.this.f8934L.i(l0Var);
        }

        void d(D0 d02) {
            y1.l0 l0Var;
            synchronized (this.f9077a) {
                try {
                    this.f9078b.remove(d02);
                    if (this.f9078b.isEmpty()) {
                        l0Var = this.f9079c;
                        this.f9078b = new HashSet();
                    } else {
                        l0Var = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (l0Var != null) {
                C0946h0.this.f8934L.d(l0Var);
            }
        }

        /* synthetic */ y(C0946h0 c0946h0, a aVar) {
            this();
        }
    }

    static {
        y1.l0 l0Var = y1.l0.f11975t;
        f8917o0 = l0Var.q("Channel shutdownNow invoked");
        f8918p0 = l0Var.q("Channel shutdown invoked");
        f8919q0 = l0Var.q("Subchannel shutdown invoked");
        f8920r0 = C0952k0.a();
        f8921s0 = new a();
        f8922t0 = new l();
    }

    C0946h0(C0948i0 c0948i0, InterfaceC0970u interfaceC0970u, InterfaceC0949j.a aVar, InterfaceC0964q0 interfaceC0964q0, InterfaceC0833n interfaceC0833n, List list, S0 s02) {
        a aVar2;
        y1.p0 p0Var = new y1.p0(new j());
        this.f8978r = p0Var;
        this.f8984x = new C0976x();
        this.f8930H = new HashSet(16, 0.75f);
        this.f8932J = new Object();
        this.f8933K = new HashSet(1, 0.75f);
        a aVar3 = null;
        this.f8935M = new y(this, aVar3);
        this.f8936N = new AtomicBoolean(false);
        this.f8940R = new CountDownLatch(1);
        this.f8947Y = v.NO_RESOLUTION;
        this.f8948Z = f8920r0;
        this.f8952b0 = false;
        this.f8956d0 = new D0.t();
        this.f8964h0 = C1316t.j();
        o oVar = new o(this, aVar3);
        this.f8966i0 = oVar;
        this.f8968j0 = new q(this, aVar3);
        this.f8970k0 = new m(this, aVar3);
        String str = (String) AbstractC0829j.o(c0948i0.f9107f, "target");
        this.f8951b = str;
        y1.K kB = y1.K.b("Channel", str);
        this.f8949a = kB;
        this.f8976p = (S0) AbstractC0829j.o(s02, "timeProvider");
        InterfaceC0964q0 interfaceC0964q02 = (InterfaceC0964q0) AbstractC0829j.o(c0948i0.f9102a, "executorPool");
        this.f8971l = interfaceC0964q02;
        Executor executor = (Executor) AbstractC0829j.o((Executor) interfaceC0964q02.a(), "executor");
        this.f8969k = executor;
        this.f8961g = interfaceC0970u;
        p pVar = new p((InterfaceC0964q0) AbstractC0829j.o(c0948i0.f9103b, "offloadExecutorPool"));
        this.f8975o = pVar;
        C0955m c0955m = new C0955m(interfaceC0970u, c0948i0.f9108g, pVar);
        this.f8963h = c0955m;
        this.f8965i = new C0955m(interfaceC0970u, null, pVar);
        w wVar = new w(c0955m.F(), aVar3);
        this.f8967j = wVar;
        this.f8977q = c0948i0.f9123v;
        C0961p c0961p = new C0961p(kB, c0948i0.f9123v, s02.a(), "Channel for '" + str + "'");
        this.f8943U = c0961p;
        C0959o c0959o = new C0959o(c0961p, s02);
        this.f8944V = c0959o;
        y1.h0 h0Var = c0948i0.f9126y;
        h0Var = h0Var == null ? S.f8667q : h0Var;
        boolean z2 = c0948i0.f9121t;
        this.f8962g0 = z2;
        C0947i c0947i = new C0947i(c0948i0.f9112k);
        this.f8959f = c0947i;
        y1.e0 e0Var = c0948i0.f9105d;
        this.f8955d = e0Var;
        I0 i02 = new I0(z2, c0948i0.f9117p, c0948i0.f9118q, c0947i);
        String str2 = c0948i0.f9111j;
        this.f8953c = str2;
        c0.a aVarA = c0.a.g().c(c0948i0.e()).f(h0Var).i(p0Var).g(wVar).h(i02).b(c0959o).d(pVar).e(str2).a();
        this.f8957e = aVarA;
        this.f8925C = C0(str, str2, e0Var, aVarA, c0955m.Q());
        this.f8973m = (InterfaceC0964q0) AbstractC0829j.o(interfaceC0964q0, "balancerRpcExecutorPool");
        this.f8974n = new p(interfaceC0964q0);
        B b3 = new B(executor, p0Var);
        this.f8934L = b3;
        b3.c(oVar);
        this.f8985y = aVar;
        Map map = c0948i0.f9124w;
        if (map != null) {
            c0.b bVarA = i02.a(map);
            AbstractC0829j.w(bVarA.d() == null, "Default config is invalid: %s", bVarA.d());
            C0952k0 c0952k0 = (C0952k0) bVarA.c();
            this.f8950a0 = c0952k0;
            this.f8948Z = c0952k0;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.f8950a0 = null;
        }
        boolean z3 = c0948i0.f9125x;
        this.f8954c0 = z3;
        u uVar = new u(this, this.f8925C.a(), aVar2);
        this.f8946X = uVar;
        this.f8986z = AbstractC1307j.a(uVar, list);
        this.f8923A = new ArrayList(c0948i0.f9106e);
        this.f8982v = (InterfaceC0833n) AbstractC0829j.o(interfaceC0833n, "stopwatchSupplier");
        long j3 = c0948i0.f9116o;
        if (j3 != -1) {
            AbstractC0829j.i(j3 >= C0948i0.f9090J, "invalid idleTimeoutMillis %s", j3);
            j3 = c0948i0.f9116o;
        }
        this.f8983w = j3;
        this.f8972l0 = new C0(new r(this, null), p0Var, c0955m.F(), (C0831l) interfaceC0833n.get());
        this.f8979s = c0948i0.f9113l;
        this.f8980t = (C1318v) AbstractC0829j.o(c0948i0.f9114m, "decompressorRegistry");
        this.f8981u = (C1312o) AbstractC0829j.o(c0948i0.f9115n, "compressorRegistry");
        this.f8924B = c0948i0.f9110i;
        this.f8960f0 = c0948i0.f9119r;
        this.f8958e0 = c0948i0.f9120s;
        c cVar = new c(s02);
        this.f8941S = cVar;
        this.f8942T = cVar.a();
        C1293E c1293e = (C1293E) AbstractC0829j.n(c0948i0.f9122u);
        this.f8945W = c1293e;
        c1293e.d(this);
        if (z3) {
            return;
        }
        if (this.f8950a0 != null) {
            c0959o.a(AbstractC1303f.a.INFO, "Service config look-up disabled, using default service config");
        }
        this.f8952b0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Executor B0(C1300c c1300c) {
        Executor executorE = c1300c.e();
        return executorE == null ? this.f8969k : executorE;
    }

    static y1.c0 C0(String str, String str2, y1.e0 e0Var, c0.a aVar, Collection collection) {
        G0 g02 = new G0(D0(str, e0Var, aVar, collection), new C0953l(new F.a(), aVar.d(), aVar.f()), aVar.f());
        return str2 == null ? g02 : new k(g02, str2);
    }

    private static y1.c0 D0(String str, y1.e0 e0Var, c0.a aVar, Collection collection) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e3) {
            sb.append(e3.getMessage());
            uri = null;
        }
        y1.d0 d0VarE = uri != null ? e0Var.e(uri.getScheme()) : null;
        String str2 = "";
        if (d0VarE == null && !f8916n0.matcher(str).matches()) {
            try {
                uri = new URI(e0Var.c(), "", "/" + str, null);
                d0VarE = e0Var.e(uri.getScheme());
            } catch (URISyntaxException e4) {
                throw new IllegalArgumentException(e4);
            }
        }
        if (d0VarE == null) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (sb.length() > 0) {
                str2 = " (" + ((Object) sb) + ")";
            }
            objArr[1] = str2;
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", objArr));
        }
        if (collection != null && !collection.containsAll(d0VarE.c())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
        }
        y1.c0 c0VarB = d0VarE.b(uri, aVar);
        if (c0VarB != null) {
            return c0VarB;
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = str;
        if (sb.length() > 0) {
            str2 = " (" + ((Object) sb) + ")";
        }
        objArr2[1] = str2;
        throw new IllegalArgumentException(String.format("cannot create a NameResolver for %s%s", objArr2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        if (this.f8937O) {
            Iterator it = this.f8930H.iterator();
            while (it.hasNext()) {
                ((Z) it.next()).i(f8917o0);
            }
            Iterator it2 = this.f8933K.iterator();
            if (it2.hasNext()) {
                AbstractC0527b.a(it2.next());
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        if (!this.f8939Q && this.f8936N.get() && this.f8930H.isEmpty() && this.f8933K.isEmpty()) {
            this.f8944V.a(AbstractC1303f.a.INFO, "Terminated");
            this.f8945W.j(this);
            this.f8971l.b(this.f8969k);
            this.f8974n.b();
            this.f8975o.b();
            this.f8963h.close();
            this.f8939Q = true;
            this.f8940R.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0() {
        this.f8978r.f();
        if (this.f8926D) {
            this.f8925C.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0() {
        long j3 = this.f8983w;
        if (j3 == -1) {
            return;
        }
        this.f8972l0.k(j3, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0(boolean z2) {
        this.f8978r.f();
        if (z2) {
            AbstractC0829j.u(this.f8926D, "nameResolver is not started");
            AbstractC0829j.u(this.f8927E != null, "lbHelper is null");
        }
        y1.c0 c0Var = this.f8925C;
        if (c0Var != null) {
            c0Var.c();
            this.f8926D = false;
            if (z2) {
                this.f8925C = C0(this.f8951b, this.f8953c, this.f8955d, this.f8957e, this.f8963h.Q());
            } else {
                this.f8925C = null;
            }
        }
        s sVar = this.f8927E;
        if (sVar != null) {
            sVar.f9027a.d();
            this.f8927E = null;
        }
        this.f8928F = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(S.j jVar) {
        this.f8928F = jVar;
        this.f8934L.s(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(boolean z2) {
        this.f8972l0.i(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0() {
        K0(true);
        this.f8934L.s(null);
        this.f8944V.a(AbstractC1303f.a.INFO, "Entering IDLE state");
        this.f8984x.b(EnumC1313p.IDLE);
        if (this.f8968j0.a(this.f8932J, this.f8934L)) {
            A0();
        }
    }

    void A0() {
        this.f8978r.f();
        if (this.f8936N.get() || this.f8929G) {
            return;
        }
        if (this.f8968j0.d()) {
            y0(false);
        } else {
            I0();
        }
        if (this.f8927E != null) {
            return;
        }
        this.f8944V.a(AbstractC1303f.a.INFO, "Exiting idle mode");
        s sVar = new s(this, null);
        sVar.f9027a = this.f8959f.e(sVar);
        this.f8927E = sVar;
        this.f8925C.d(new t(sVar, this.f8925C));
        this.f8926D = true;
    }

    void G0(Throwable th) {
        if (this.f8929G) {
            return;
        }
        this.f8929G = true;
        y0(true);
        K0(false);
        M0(new e(th));
        this.f8946X.q(null);
        this.f8944V.a(AbstractC1303f.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.f8984x.b(EnumC1313p.TRANSIENT_FAILURE);
    }

    @Override // y1.V
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public C0946h0 n() {
        this.f8944V.a(AbstractC1303f.a.DEBUG, "shutdown() called");
        if (!this.f8936N.compareAndSet(false, true)) {
            return this;
        }
        this.f8978r.execute(new h());
        this.f8946X.o();
        this.f8978r.execute(new b());
        return this;
    }

    @Override // y1.V
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public C0946h0 o() {
        this.f8944V.a(AbstractC1303f.a.DEBUG, "shutdownNow() called");
        n();
        this.f8946X.p();
        this.f8978r.execute(new i());
        return this;
    }

    @Override // y1.AbstractC1301d
    public String a() {
        return this.f8986z.a();
    }

    @Override // y1.AbstractC1301d
    public AbstractC1304g e(y1.a0 a0Var, C1300c c1300c) {
        return this.f8986z.e(a0Var, c1300c);
    }

    @Override // y1.P
    public y1.K g() {
        return this.f8949a;
    }

    @Override // y1.V
    public boolean j(long j3, TimeUnit timeUnit) {
        return this.f8940R.await(j3, timeUnit);
    }

    @Override // y1.V
    public void k() {
        this.f8978r.execute(new f());
    }

    @Override // y1.V
    public EnumC1313p l(boolean z2) {
        EnumC1313p enumC1313pA = this.f8984x.a();
        if (z2 && enumC1313pA == EnumC1313p.IDLE) {
            this.f8978r.execute(new g());
        }
        return enumC1313pA;
    }

    @Override // y1.V
    public void m(EnumC1313p enumC1313p, Runnable runnable) {
        this.f8978r.execute(new d(runnable, enumC1313p));
    }

    public String toString() {
        return AbstractC0825f.b(this).c("logId", this.f8949a.d()).d("target", this.f8951b).toString();
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$l */
    class l extends AbstractC1304g {
        l() {
        }

        @Override // y1.AbstractC1304g
        public void a(String str, Throwable th) {
        }

        @Override // y1.AbstractC1304g
        public void b() {
        }

        @Override // y1.AbstractC1304g
        public void c(int i3) {
        }

        @Override // y1.AbstractC1304g
        public void d(Object obj) {
        }

        @Override // y1.AbstractC1304g
        public void e(AbstractC1304g.a aVar, y1.Z z2) {
        }
    }
}
