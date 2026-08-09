package io.grpc.internal;

import e0.AbstractC0826g;
import e0.AbstractC0829j;
import io.grpc.internal.InterfaceC0966s;
import io.grpc.internal.R0;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import y1.AbstractC1308k;
import y1.C1316t;
import y1.C1318v;
import y1.InterfaceC1311n;
import y1.Z;

/* JADX INFO: loaded from: classes.dex */
abstract class D0 implements io.grpc.internal.r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    static final Z.g f8471A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    static final Z.g f8472B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final y1.l0 f8473C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static Random f8474D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.a0 f8475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f8476b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f8478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y1.Z f8479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final E0 f8480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final U f8481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f8482h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t f8484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f8485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f8486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final D f8487m;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private y f8493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f8494t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private InterfaceC0966s f8495u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private u f8496v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private u f8497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f8498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private y1.l0 f8499y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f8500z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f8477c = new y1.p0(new C0927a());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f8483i = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Y f8488n = new Y();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile A f8489o = new A(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f8490p = new AtomicBoolean();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicInteger f8491q = new AtomicInteger();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicInteger f8492r = new AtomicInteger();

    private static final class A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f8501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List f8502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Collection f8503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Collection f8504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f8505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final C f8506f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f8507g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final boolean f8508h;

        A(List list, Collection collection, Collection collection2, C c3, boolean z2, boolean z3, boolean z4, int i3) {
            this.f8502b = list;
            this.f8503c = (Collection) AbstractC0829j.o(collection, "drainedSubstreams");
            this.f8506f = c3;
            this.f8504d = collection2;
            this.f8507g = z2;
            this.f8501a = z3;
            this.f8508h = z4;
            this.f8505e = i3;
            AbstractC0829j.u(!z3 || list == null, "passThrough should imply buffer is null");
            AbstractC0829j.u((z3 && c3 == null) ? false : true, "passThrough should imply winningSubstream != null");
            AbstractC0829j.u(!z3 || (collection.size() == 1 && collection.contains(c3)) || (collection.size() == 0 && c3.f8523b), "passThrough should imply winningSubstream is drained");
            AbstractC0829j.u((z2 && c3 == null) ? false : true, "cancelled should imply committed");
        }

        A a(C c3) {
            Collection collectionUnmodifiableCollection;
            AbstractC0829j.u(!this.f8508h, "hedging frozen");
            AbstractC0829j.u(this.f8506f == null, "already committed");
            if (this.f8504d == null) {
                collectionUnmodifiableCollection = Collections.singleton(c3);
            } else {
                ArrayList arrayList = new ArrayList(this.f8504d);
                arrayList.add(c3);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new A(this.f8502b, this.f8503c, collectionUnmodifiableCollection, this.f8506f, this.f8507g, this.f8501a, this.f8508h, this.f8505e + 1);
        }

        A b() {
            return new A(this.f8502b, this.f8503c, this.f8504d, this.f8506f, true, this.f8501a, this.f8508h, this.f8505e);
        }

        A c(C c3) {
            List list;
            boolean z2;
            Collection collectionEmptyList;
            AbstractC0829j.u(this.f8506f == null, "Already committed");
            List list2 = this.f8502b;
            if (this.f8503c.contains(c3)) {
                collectionEmptyList = Collections.singleton(c3);
                list = null;
                z2 = true;
            } else {
                list = list2;
                z2 = false;
                collectionEmptyList = Collections.emptyList();
            }
            return new A(list, collectionEmptyList, this.f8504d, c3, this.f8507g, z2, this.f8508h, this.f8505e);
        }

        A d() {
            return this.f8508h ? this : new A(this.f8502b, this.f8503c, this.f8504d, this.f8506f, this.f8507g, this.f8501a, true, this.f8505e);
        }

        A e(C c3) {
            ArrayList arrayList = new ArrayList(this.f8504d);
            arrayList.remove(c3);
            return new A(this.f8502b, this.f8503c, Collections.unmodifiableCollection(arrayList), this.f8506f, this.f8507g, this.f8501a, this.f8508h, this.f8505e);
        }

        A f(C c3, C c4) {
            ArrayList arrayList = new ArrayList(this.f8504d);
            arrayList.remove(c3);
            arrayList.add(c4);
            return new A(this.f8502b, this.f8503c, Collections.unmodifiableCollection(arrayList), this.f8506f, this.f8507g, this.f8501a, this.f8508h, this.f8505e);
        }

        A g(C c3) {
            c3.f8523b = true;
            if (!this.f8503c.contains(c3)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f8503c);
            arrayList.remove(c3);
            return new A(this.f8502b, Collections.unmodifiableCollection(arrayList), this.f8504d, this.f8506f, this.f8507g, this.f8501a, this.f8508h, this.f8505e);
        }

        A h(C c3) {
            Collection collectionUnmodifiableCollection;
            AbstractC0829j.u(!this.f8501a, "Already passThrough");
            if (c3.f8523b) {
                collectionUnmodifiableCollection = this.f8503c;
            } else if (this.f8503c.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(c3);
            } else {
                ArrayList arrayList = new ArrayList(this.f8503c);
                arrayList.add(c3);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = collectionUnmodifiableCollection;
            C c4 = this.f8506f;
            boolean z2 = c4 != null;
            List list = this.f8502b;
            if (z2) {
                AbstractC0829j.u(c4 == c3, "Another RPC attempt has already committed");
                list = null;
            }
            return new A(list, collection, this.f8504d, this.f8506f, this.f8507g, z2, this.f8508h, this.f8505e);
        }
    }

    private final class B implements InterfaceC0966s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C f8509a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1.Z f8511a;

            a(y1.Z z2) {
                this.f8511a = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                D0.this.f8495u.d(this.f8511a);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C f8513a;

            class a implements Runnable {
                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b bVar = b.this;
                    D0.this.g0(bVar.f8513a);
                }
            }

            b(C c3) {
                this.f8513a = c3;
            }

            @Override // java.lang.Runnable
            public void run() {
                D0.this.f8476b.execute(new a());
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                D0.this.f8500z = true;
                D0.this.f8495u.c(D0.this.f8493s.f8579a, D0.this.f8493s.f8580b, D0.this.f8493s.f8581c);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C f8517a;

            d(C c3) {
                this.f8517a = c3;
            }

            @Override // java.lang.Runnable
            public void run() {
                D0.this.g0(this.f8517a);
            }
        }

        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ R0.a f8519a;

            e(R0.a aVar) {
                this.f8519a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                D0.this.f8495u.a(this.f8519a);
            }
        }

        class f implements Runnable {
            f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (D0.this.f8500z) {
                    return;
                }
                D0.this.f8495u.b();
            }
        }

        B(C c3) {
            this.f8509a = c3;
        }

        private Integer e(y1.Z z2) {
            String str = (String) z2.g(D0.f8472B);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private v f(y1.l0 l0Var, y1.Z z2) {
            Integer numE = e(z2);
            boolean z3 = !D0.this.f8481g.f8727c.contains(l0Var.m());
            boolean z4 = (D0.this.f8487m == null || (z3 && (numE == null || numE.intValue() >= 0))) ? false : !D0.this.f8487m.b();
            if (!z3 && !z4 && !l0Var.o() && numE != null && numE.intValue() > 0) {
                numE = 0;
            }
            return new v((z3 || z4) ? false : true, numE);
        }

        private x g(y1.l0 l0Var, y1.Z z2) {
            D0 d02;
            long jMin;
            long nanos = 0;
            boolean z3 = false;
            if (D0.this.f8480f == null) {
                return new x(false, 0L);
            }
            boolean zContains = D0.this.f8480f.f8590f.contains(l0Var.m());
            Integer numE = e(z2);
            boolean z4 = (D0.this.f8487m == null || (!zContains && (numE == null || numE.intValue() >= 0))) ? false : !D0.this.f8487m.b();
            if (D0.this.f8480f.f8585a > this.f8509a.f8525d + 1 && !z4) {
                if (numE == null) {
                    if (zContains) {
                        nanos = (long) (D0.this.f8498x * D0.f8474D.nextDouble());
                        d02 = D0.this;
                        jMin = Math.min((long) (d02.f8498x * D0.this.f8480f.f8588d), D0.this.f8480f.f8587c);
                        d02.f8498x = jMin;
                        z3 = true;
                    }
                } else if (numE.intValue() >= 0) {
                    nanos = TimeUnit.MILLISECONDS.toNanos(numE.intValue());
                    d02 = D0.this;
                    jMin = d02.f8480f.f8586b;
                    d02.f8498x = jMin;
                    z3 = true;
                }
            }
            return new x(z3, nanos);
        }

        @Override // io.grpc.internal.R0
        public void a(R0.a aVar) {
            A a3 = D0.this.f8489o;
            AbstractC0829j.u(a3.f8506f != null, "Headers should be received prior to messages.");
            if (a3.f8506f != this.f8509a) {
                S.d(aVar);
            } else {
                D0.this.f8477c.execute(new e(aVar));
            }
        }

        @Override // io.grpc.internal.R0
        public void b() {
            if (D0.this.i()) {
                D0.this.f8477c.execute(new f());
            }
        }

        @Override // io.grpc.internal.InterfaceC0966s
        public void c(y1.l0 l0Var, InterfaceC0966s.a aVar, y1.Z z2) {
            u uVar;
            synchronized (D0.this.f8483i) {
                D0 d02 = D0.this;
                d02.f8489o = d02.f8489o.g(this.f8509a);
                D0.this.f8488n.a(l0Var.m());
            }
            if (D0.this.f8492r.decrementAndGet() == Integer.MIN_VALUE) {
                D0.this.f8477c.execute(new c());
                return;
            }
            C c3 = this.f8509a;
            if (c3.f8524c) {
                D0.this.d0(c3);
                if (D0.this.f8489o.f8506f == this.f8509a) {
                    D0.this.n0(l0Var, aVar, z2);
                    return;
                }
                return;
            }
            InterfaceC0966s.a aVar2 = InterfaceC0966s.a.MISCARRIED;
            if (aVar == aVar2 && D0.this.f8491q.incrementAndGet() > 1000) {
                D0.this.d0(this.f8509a);
                if (D0.this.f8489o.f8506f == this.f8509a) {
                    D0.this.n0(y1.l0.f11974s.q("Too many transparent retries. Might be a bug in gRPC").p(l0Var.d()), aVar, z2);
                    return;
                }
                return;
            }
            if (D0.this.f8489o.f8506f == null) {
                if (aVar == aVar2 || (aVar == InterfaceC0966s.a.REFUSED && D0.this.f8490p.compareAndSet(false, true))) {
                    C cE0 = D0.this.e0(this.f8509a.f8525d, true);
                    if (cE0 == null) {
                        return;
                    }
                    if (D0.this.f8482h) {
                        synchronized (D0.this.f8483i) {
                            D0 d03 = D0.this;
                            d03.f8489o = d03.f8489o.f(this.f8509a, cE0);
                        }
                    }
                    D0.this.f8476b.execute(new d(cE0));
                    return;
                }
                if (aVar != InterfaceC0966s.a.DROPPED) {
                    D0.this.f8490p.set(true);
                    if (D0.this.f8482h) {
                        v vVarF = f(l0Var, z2);
                        if (vVarF.f8571a) {
                            D0.this.m0(vVarF.f8572b);
                        }
                        synchronized (D0.this.f8483i) {
                            try {
                                D0 d04 = D0.this;
                                d04.f8489o = d04.f8489o.e(this.f8509a);
                                if (vVarF.f8571a) {
                                    D0 d05 = D0.this;
                                    if (!d05.i0(d05.f8489o)) {
                                        if (!D0.this.f8489o.f8504d.isEmpty()) {
                                        }
                                    }
                                    return;
                                }
                            } finally {
                            }
                        }
                    } else {
                        x xVarG = g(l0Var, z2);
                        if (xVarG.f8577a) {
                            C cE02 = D0.this.e0(this.f8509a.f8525d + 1, false);
                            if (cE02 == null) {
                                return;
                            }
                            synchronized (D0.this.f8483i) {
                                D0 d06 = D0.this;
                                uVar = new u(d06.f8483i);
                                d06.f8496v = uVar;
                            }
                            uVar.c(D0.this.f8478d.schedule(new b(cE02), xVarG.f8578b, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                } else if (D0.this.f8482h) {
                    D0.this.h0();
                }
            }
            D0.this.d0(this.f8509a);
            if (D0.this.f8489o.f8506f == this.f8509a) {
                D0.this.n0(l0Var, aVar, z2);
            }
        }

        @Override // io.grpc.internal.InterfaceC0966s
        public void d(y1.Z z2) {
            if (this.f8509a.f8525d > 0) {
                Z.g gVar = D0.f8471A;
                z2.e(gVar);
                z2.p(gVar, String.valueOf(this.f8509a.f8525d));
            }
            D0.this.d0(this.f8509a);
            if (D0.this.f8489o.f8506f == this.f8509a) {
                if (D0.this.f8487m != null) {
                    D0.this.f8487m.c();
                }
                D0.this.f8477c.execute(new a(z2));
            }
        }
    }

    private static final class C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        io.grpc.internal.r f8522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f8523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f8524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f8525d;

        C(int i3) {
            this.f8525d = i3;
        }
    }

    static final class D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f8526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f8527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f8528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f8529d;

        D(float f3, float f4) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f8529d = atomicInteger;
            this.f8528c = (int) (f4 * 1000.0f);
            int i3 = (int) (f3 * 1000.0f);
            this.f8526a = i3;
            this.f8527b = i3 / 2;
            atomicInteger.set(i3);
        }

        boolean a() {
            return this.f8529d.get() > this.f8527b;
        }

        boolean b() {
            int i3;
            int i4;
            do {
                i3 = this.f8529d.get();
                if (i3 == 0) {
                    return false;
                }
                i4 = i3 - 1000;
            } while (!this.f8529d.compareAndSet(i3, Math.max(i4, 0)));
            return i4 > this.f8527b;
        }

        void c() {
            int i3;
            int i4;
            do {
                i3 = this.f8529d.get();
                i4 = this.f8526a;
                if (i3 == i4) {
                    return;
                }
            } while (!this.f8529d.compareAndSet(i3, Math.min(this.f8528c + i3, i4)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof D)) {
                return false;
            }
            D d3 = (D) obj;
            return this.f8526a == d3.f8526a && this.f8528c == d3.f8528c;
        }

        public int hashCode() {
            return AbstractC0826g.b(Integer.valueOf(this.f8526a), Integer.valueOf(this.f8528c));
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.D0$a, reason: case insensitive filesystem */
    class C0927a implements Thread.UncaughtExceptionHandler {
        C0927a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            throw y1.l0.k(th).q("Uncaught exception in the SynchronizationContext. Re-thrown.").d();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.D0$b, reason: case insensitive filesystem */
    class C0928b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8531a;

        C0928b(String str) {
            this.f8531a = str;
        }

        @Override // io.grpc.internal.D0.r
        public void a(C c3) {
            c3.f8522a.k(this.f8531a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.D0$c, reason: case insensitive filesystem */
    class RunnableC0929c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f8533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f8534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Future f8535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Future f8536d;

        RunnableC0929c(Collection collection, C c3, Future future, Future future2) {
            this.f8533a = collection;
            this.f8534b = c3;
            this.f8535c = future;
            this.f8536d = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C c3 : this.f8533a) {
                if (c3 != this.f8534b) {
                    c3.f8522a.d(D0.f8473C);
                }
            }
            Future future = this.f8535c;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f8536d;
            if (future2 != null) {
                future2.cancel(false);
            }
            D0.this.k0();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.D0$d, reason: case insensitive filesystem */
    class C0930d implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1311n f8538a;

        C0930d(InterfaceC1311n interfaceC1311n) {
            this.f8538a = interfaceC1311n;
        }

        @Override // io.grpc.internal.D0.r
        public void a(C c3) {
            c3.f8522a.a(this.f8538a);
        }
    }

    class e implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1316t f8540a;

        e(C1316t c1316t) {
            this.f8540a = c1316t;
        }

        @Override // io.grpc.internal.D0.r
        public void a(C c3) {
            c3.f8522a.m(this.f8540a);
        }
    }

    class f implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1318v f8542a;

        f(C1318v c1318v) {
            this.f8542a = c1318v;
        }

        @Override // io.grpc.internal.D0.r
        public void a(C c3) {
            c3.f8522a.h(this.f8542a);
        }
    }

    class g implements r {
        g() {
        }

        @Override // io.grpc.internal.D0.r
        public void a(C c3) {
            c3.f8522a.flush();
        }
    }

    class h implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8545a;

        h(boolean z2) {
            this.f8545a = z2;
        }

        @Override // io.grpc.internal.D0.r
        public void a(C c3) {
            c3.f8522a.q(this.f8545a);
        }
    }

    class i implements r {
        i() {
        }

        @Override // io.grpc.internal.D0.r
        public void a(C c3) {
            c3.f8522a.o();
        }
    }

    class j implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8548a;

        j(int i3) {
            this.f8548a = i3;
        }

        @Override // io.grpc.internal.D0.r
        public void a(C c3) {
            c3.f8522a.c(this.f8548a);
        }
    }

    class k implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8550a;

        k(int i3) {
            this.f8550a = i3;
        }

        @Override // io.grpc.internal.D0.r
        public void a(C c3) {
            c3.f8522a.e(this.f8550a);
        }
    }

    class l implements r {
        l() {
        }

        @Override // io.grpc.internal.D0.r
        public void a(C c3) {
            c3.f8522a.n();
        }
    }

    class m implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8553a;

        m(int i3) {
            this.f8553a = i3;
        }

        @Override // io.grpc.internal.D0.r
        public void a(C c3) {
            c3.f8522a.b(this.f8553a);
        }
    }

    class n implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f8555a;

        n(Object obj) {
            this.f8555a = obj;
        }

        @Override // io.grpc.internal.D0.r
        public void a(C c3) {
            c3.f8522a.j(D0.this.f8475a.j(this.f8555a));
            c3.f8522a.flush();
        }
    }

    class o extends AbstractC1308k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1308k f8557a;

        o(AbstractC1308k abstractC1308k) {
            this.f8557a = abstractC1308k;
        }

        @Override // y1.AbstractC1308k.a
        public AbstractC1308k a(AbstractC1308k.b bVar, y1.Z z2) {
            return this.f8557a;
        }
    }

    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (D0.this.f8500z) {
                return;
            }
            D0.this.f8495u.b();
        }
    }

    class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y1.l0 f8560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0966s.a f8561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y1.Z f8562c;

        q(y1.l0 l0Var, InterfaceC0966s.a aVar, y1.Z z2) {
            this.f8560a = l0Var;
            this.f8561b = aVar;
            this.f8562c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            D0.this.f8500z = true;
            D0.this.f8495u.c(this.f8560a, this.f8561b, this.f8562c);
        }
    }

    private interface r {
        void a(C c3);
    }

    class s extends AbstractC1308k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C f8564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f8565c;

        s(C c3) {
            this.f8564b = c3;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0012, B:9:0x001c, B:12:0x0023, B:14:0x0032, B:18:0x0036, B:20:0x0043, B:21:0x0045, B:25:0x006f, B:27:0x0075, B:29:0x007d, B:22:0x0048, B:24:0x006c, B:33:0x0084), top: B:37:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        @Override // y1.o0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void h(long r6) {
            /*
                r5 = this;
                io.grpc.internal.D0 r0 = io.grpc.internal.D0.this
                io.grpc.internal.D0$A r0 = io.grpc.internal.D0.L(r0)
                io.grpc.internal.D0$C r0 = r0.f8506f
                if (r0 == 0) goto Lb
                return
            Lb:
                io.grpc.internal.D0 r0 = io.grpc.internal.D0.this
                java.lang.Object r0 = io.grpc.internal.D0.X(r0)
                monitor-enter(r0)
                io.grpc.internal.D0 r1 = io.grpc.internal.D0.this     // Catch: java.lang.Throwable -> L34
                io.grpc.internal.D0$A r1 = io.grpc.internal.D0.L(r1)     // Catch: java.lang.Throwable -> L34
                io.grpc.internal.D0$C r1 = r1.f8506f     // Catch: java.lang.Throwable -> L34
                if (r1 != 0) goto L84
                io.grpc.internal.D0$C r1 = r5.f8564b     // Catch: java.lang.Throwable -> L34
                boolean r1 = r1.f8523b     // Catch: java.lang.Throwable -> L34
                if (r1 == 0) goto L23
                goto L84
            L23:
                long r1 = r5.f8565c     // Catch: java.lang.Throwable -> L34
                long r1 = r1 + r6
                r5.f8565c = r1     // Catch: java.lang.Throwable -> L34
                io.grpc.internal.D0 r6 = io.grpc.internal.D0.this     // Catch: java.lang.Throwable -> L34
                long r6 = io.grpc.internal.D0.Q(r6)     // Catch: java.lang.Throwable -> L34
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 > 0) goto L36
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
                return
            L34:
                r6 = move-exception
                goto L86
            L36:
                long r6 = r5.f8565c     // Catch: java.lang.Throwable -> L34
                io.grpc.internal.D0 r1 = io.grpc.internal.D0.this     // Catch: java.lang.Throwable -> L34
                long r1 = io.grpc.internal.D0.S(r1)     // Catch: java.lang.Throwable -> L34
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                r7 = 1
                if (r6 <= 0) goto L48
                io.grpc.internal.D0$C r6 = r5.f8564b     // Catch: java.lang.Throwable -> L34
            L45:
                r6.f8524c = r7     // Catch: java.lang.Throwable -> L34
                goto L6f
            L48:
                io.grpc.internal.D0 r6 = io.grpc.internal.D0.this     // Catch: java.lang.Throwable -> L34
                io.grpc.internal.D0$t r6 = io.grpc.internal.D0.T(r6)     // Catch: java.lang.Throwable -> L34
                long r1 = r5.f8565c     // Catch: java.lang.Throwable -> L34
                io.grpc.internal.D0 r3 = io.grpc.internal.D0.this     // Catch: java.lang.Throwable -> L34
                long r3 = io.grpc.internal.D0.Q(r3)     // Catch: java.lang.Throwable -> L34
                long r1 = r1 - r3
                long r1 = r6.a(r1)     // Catch: java.lang.Throwable -> L34
                io.grpc.internal.D0 r6 = io.grpc.internal.D0.this     // Catch: java.lang.Throwable -> L34
                long r3 = r5.f8565c     // Catch: java.lang.Throwable -> L34
                io.grpc.internal.D0.R(r6, r3)     // Catch: java.lang.Throwable -> L34
                io.grpc.internal.D0 r6 = io.grpc.internal.D0.this     // Catch: java.lang.Throwable -> L34
                long r3 = io.grpc.internal.D0.U(r6)     // Catch: java.lang.Throwable -> L34
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 <= 0) goto L6f
                io.grpc.internal.D0$C r6 = r5.f8564b     // Catch: java.lang.Throwable -> L34
                goto L45
            L6f:
                io.grpc.internal.D0$C r6 = r5.f8564b     // Catch: java.lang.Throwable -> L34
                boolean r7 = r6.f8524c     // Catch: java.lang.Throwable -> L34
                if (r7 == 0) goto L7c
                io.grpc.internal.D0 r7 = io.grpc.internal.D0.this     // Catch: java.lang.Throwable -> L34
                java.lang.Runnable r6 = io.grpc.internal.D0.V(r7, r6)     // Catch: java.lang.Throwable -> L34
                goto L7d
            L7c:
                r6 = 0
            L7d:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
                if (r6 == 0) goto L83
                r6.run()
            L83:
                return
            L84:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
                return
            L86:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.D0.s.h(long):void");
        }
    }

    static final class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicLong f8567a = new AtomicLong();

        t() {
        }

        long a(long j3) {
            return this.f8567a.addAndGet(j3);
        }
    }

    private static final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f8568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Future f8569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f8570c;

        u(Object obj) {
            this.f8568a = obj;
        }

        boolean a() {
            return this.f8570c;
        }

        Future b() {
            this.f8570c = true;
            return this.f8569b;
        }

        void c(Future future) {
            synchronized (this.f8568a) {
                try {
                    if (!this.f8570c) {
                        this.f8569b = future;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f8571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Integer f8572b;

        public v(boolean z2, Integer num) {
            this.f8571a = z2;
            this.f8572b = num;
        }
    }

    private final class w implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final u f8573a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C f8575a;

            a(C c3) {
                this.f8575a = c3;
            }

            @Override // java.lang.Runnable
            public void run() {
                u uVar;
                D0 d02;
                boolean z2;
                synchronized (D0.this.f8483i) {
                    try {
                        uVar = null;
                        if (w.this.f8573a.a()) {
                            z2 = true;
                        } else {
                            D0 d03 = D0.this;
                            d03.f8489o = d03.f8489o.a(this.f8575a);
                            D0 d04 = D0.this;
                            if (d04.i0(d04.f8489o) && (D0.this.f8487m == null || D0.this.f8487m.a())) {
                                d02 = D0.this;
                                uVar = new u(d02.f8483i);
                            } else {
                                D0 d05 = D0.this;
                                d05.f8489o = d05.f8489o.d();
                                d02 = D0.this;
                            }
                            d02.f8497w = uVar;
                            z2 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z2) {
                    this.f8575a.f8522a.g(D0.this.new B(this.f8575a));
                    this.f8575a.f8522a.d(y1.l0.f11961f.q("Unneeded hedging"));
                } else {
                    if (uVar != null) {
                        uVar.c(D0.this.f8478d.schedule(D0.this.new w(uVar), D0.this.f8481g.f8726b, TimeUnit.NANOSECONDS));
                    }
                    D0.this.g0(this.f8575a);
                }
            }
        }

        w(u uVar) {
            this.f8573a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            D0 d02 = D0.this;
            C cE0 = d02.e0(d02.f8489o.f8505e, false);
            if (cE0 == null) {
                return;
            }
            D0.this.f8476b.execute(new a(cE0));
        }
    }

    private static final class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f8577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f8578b;

        x(boolean z2, long j3) {
            this.f8577a = z2;
            this.f8578b = j3;
        }
    }

    private static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y1.l0 f8579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC0966s.a f8580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y1.Z f8581c;

        y(y1.l0 l0Var, InterfaceC0966s.a aVar, y1.Z z2) {
            this.f8579a = l0Var;
            this.f8580b = aVar;
            this.f8581c = z2;
        }
    }

    class z implements r {
        z() {
        }

        @Override // io.grpc.internal.D0.r
        public void a(C c3) {
            c3.f8522a.g(D0.this.new B(c3));
        }
    }

    static {
        Z.d dVar = y1.Z.f11842e;
        f8471A = Z.g.e("grpc-previous-rpc-attempts", dVar);
        f8472B = Z.g.e("grpc-retry-pushback-ms", dVar);
        f8473C = y1.l0.f11961f.q("Stream thrown away because RetriableStream committed");
        f8474D = new Random();
    }

    D0(y1.a0 a0Var, y1.Z z2, t tVar, long j3, long j4, Executor executor, ScheduledExecutorService scheduledExecutorService, E0 e02, U u2, D d3) {
        this.f8475a = a0Var;
        this.f8484j = tVar;
        this.f8485k = j3;
        this.f8486l = j4;
        this.f8476b = executor;
        this.f8478d = scheduledExecutorService;
        this.f8479e = z2;
        this.f8480f = e02;
        if (e02 != null) {
            this.f8498x = e02.f8586b;
        }
        this.f8481g = u2;
        AbstractC0829j.e(e02 == null || u2 == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f8482h = u2 != null;
        this.f8487m = d3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable c0(C c3) {
        Future future;
        Future future2;
        synchronized (this.f8483i) {
            try {
                if (this.f8489o.f8506f != null) {
                    return null;
                }
                Collection collection = this.f8489o.f8503c;
                this.f8489o = this.f8489o.c(c3);
                this.f8484j.a(-this.f8494t);
                u uVar = this.f8496v;
                if (uVar != null) {
                    Future futureB = uVar.b();
                    this.f8496v = null;
                    future = futureB;
                } else {
                    future = null;
                }
                u uVar2 = this.f8497w;
                if (uVar2 != null) {
                    Future futureB2 = uVar2.b();
                    this.f8497w = null;
                    future2 = futureB2;
                } else {
                    future2 = null;
                }
                return new RunnableC0929c(collection, c3, future, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(C c3) {
        Runnable runnableC0 = c0(c3);
        if (runnableC0 != null) {
            this.f8476b.execute(runnableC0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C e0(int i3, boolean z2) {
        int i4;
        do {
            i4 = this.f8492r.get();
            if (i4 < 0) {
                return null;
            }
        } while (!this.f8492r.compareAndSet(i4, i4 + 1));
        C c3 = new C(i3);
        c3.f8522a = j0(p0(this.f8479e, i3), new o(new s(c3)), i3, z2);
        return c3;
    }

    private void f0(r rVar) {
        Collection collection;
        synchronized (this.f8483i) {
            try {
                if (!this.f8489o.f8501a) {
                    this.f8489o.f8502b.add(rVar);
                }
                collection = this.f8489o.f8503c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rVar.a((C) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
    
        r8.f8477c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r2 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r9.f8522a.g(new io.grpc.internal.D0.B(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        r0 = r9.f8522a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (r8.f8489o.f8506f != r9) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        r9 = r8.f8499y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r9 = io.grpc.internal.D0.f8473C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        r0.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        if (r0.hasNext() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0091, code lost:
    
        r4 = (io.grpc.internal.D0.r) r0.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        if ((r4 instanceof io.grpc.internal.D0.z) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        r4 = r8.f8489o;
        r5 = r4.f8506f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        if (r5 == r9) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00aa, code lost:
    
        if (r4.f8507g == false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g0(io.grpc.internal.D0.C r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.f8483i
            monitor-enter(r4)
            io.grpc.internal.D0$A r5 = r8.f8489o     // Catch: java.lang.Throwable -> L11
            io.grpc.internal.D0$C r6 = r5.f8506f     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L14
            if (r6 == r9) goto L14
        Lf:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L35
        L11:
            r9 = move-exception
            goto Laf
        L14:
            boolean r6 = r5.f8507g     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L19
            goto Lf
        L19:
            java.util.List r6 = r5.f8502b     // Catch: java.lang.Throwable -> L11
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L11
            if (r0 != r6) goto L5a
            io.grpc.internal.D0$A r0 = r5.h(r9)     // Catch: java.lang.Throwable -> L11
            r8.f8489o = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r8.i()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L2f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L2f:
            io.grpc.internal.D0$p r1 = new io.grpc.internal.D0$p     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            goto Lf
        L35:
            if (r1 == 0) goto L3d
            java.util.concurrent.Executor r9 = r8.f8477c
            r9.execute(r1)
            return
        L3d:
            if (r2 != 0) goto L49
            io.grpc.internal.r r0 = r9.f8522a
            io.grpc.internal.D0$B r1 = new io.grpc.internal.D0$B
            r1.<init>(r9)
            r0.g(r1)
        L49:
            io.grpc.internal.r r0 = r9.f8522a
            io.grpc.internal.D0$A r1 = r8.f8489o
            io.grpc.internal.D0$C r1 = r1.f8506f
            if (r1 != r9) goto L54
            y1.l0 r9 = r8.f8499y
            goto L56
        L54:
            y1.l0 r9 = io.grpc.internal.D0.f8473C
        L56:
            r0.d(r9)
            return
        L5a:
            boolean r6 = r9.f8523b     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L60
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L60:
            int r6 = r0 + 128
            java.util.List r7 = r5.f8502b     // Catch: java.lang.Throwable -> L11
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L11
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L7a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f8502b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L11
            goto L86
        L7a:
            r3.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f8502b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L11
        L86:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r3.iterator()
        L8b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lac
            java.lang.Object r4 = r0.next()
            io.grpc.internal.D0$r r4 = (io.grpc.internal.D0.r) r4
            r4.a(r9)
            boolean r4 = r4 instanceof io.grpc.internal.D0.z
            if (r4 == 0) goto L9f
            r2 = 1
        L9f:
            io.grpc.internal.D0$A r4 = r8.f8489o
            io.grpc.internal.D0$C r5 = r4.f8506f
            if (r5 == 0) goto La8
            if (r5 == r9) goto La8
            goto Lac
        La8:
            boolean r4 = r4.f8507g
            if (r4 == 0) goto L8b
        Lac:
            r0 = r6
            goto L4
        Laf:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.D0.g0(io.grpc.internal.D0$C):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        Future future;
        synchronized (this.f8483i) {
            try {
                u uVar = this.f8497w;
                future = null;
                if (uVar != null) {
                    Future futureB = uVar.b();
                    this.f8497w = null;
                    future = futureB;
                }
                this.f8489o = this.f8489o.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i0(A a3) {
        return a3.f8506f == null && a3.f8505e < this.f8481g.f8725a && !a3.f8508h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            h0();
            return;
        }
        synchronized (this.f8483i) {
            try {
                u uVar = this.f8497w;
                if (uVar == null) {
                    return;
                }
                Future futureB = uVar.b();
                u uVar2 = new u(this.f8483i);
                this.f8497w = uVar2;
                if (futureB != null) {
                    futureB.cancel(false);
                }
                uVar2.c(this.f8478d.schedule(new w(uVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(y1.l0 l0Var, InterfaceC0966s.a aVar, y1.Z z2) {
        this.f8493s = new y(l0Var, aVar, z2);
        if (this.f8492r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f8477c.execute(new q(l0Var, aVar, z2));
        }
    }

    @Override // io.grpc.internal.Q0
    public final void a(InterfaceC1311n interfaceC1311n) {
        f0(new C0930d(interfaceC1311n));
    }

    @Override // io.grpc.internal.Q0
    public final void b(int i3) {
        A a3 = this.f8489o;
        if (a3.f8501a) {
            a3.f8506f.f8522a.b(i3);
        } else {
            f0(new m(i3));
        }
    }

    @Override // io.grpc.internal.r
    public final void c(int i3) {
        f0(new j(i3));
    }

    @Override // io.grpc.internal.r
    public final void d(y1.l0 l0Var) {
        C c3;
        C c4 = new C(0);
        c4.f8522a = new C0962p0();
        Runnable runnableC0 = c0(c4);
        if (runnableC0 != null) {
            synchronized (this.f8483i) {
                this.f8489o = this.f8489o.h(c4);
            }
            runnableC0.run();
            n0(l0Var, InterfaceC0966s.a.PROCESSED, new y1.Z());
            return;
        }
        synchronized (this.f8483i) {
            try {
                if (this.f8489o.f8503c.contains(this.f8489o.f8506f)) {
                    c3 = this.f8489o.f8506f;
                } else {
                    this.f8499y = l0Var;
                    c3 = null;
                }
                this.f8489o = this.f8489o.b();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c3 != null) {
            c3.f8522a.d(l0Var);
        }
    }

    @Override // io.grpc.internal.r
    public final void e(int i3) {
        f0(new k(i3));
    }

    @Override // io.grpc.internal.Q0
    public final void flush() {
        A a3 = this.f8489o;
        if (a3.f8501a) {
            a3.f8506f.f8522a.flush();
        } else {
            f0(new g());
        }
    }

    @Override // io.grpc.internal.r
    public final void g(InterfaceC0966s interfaceC0966s) {
        u uVar;
        D d3;
        this.f8495u = interfaceC0966s;
        y1.l0 l0VarL0 = l0();
        if (l0VarL0 != null) {
            d(l0VarL0);
            return;
        }
        synchronized (this.f8483i) {
            this.f8489o.f8502b.add(new z());
        }
        C cE0 = e0(0, false);
        if (cE0 == null) {
            return;
        }
        if (this.f8482h) {
            synchronized (this.f8483i) {
                try {
                    this.f8489o = this.f8489o.a(cE0);
                    if (i0(this.f8489o) && ((d3 = this.f8487m) == null || d3.a())) {
                        uVar = new u(this.f8483i);
                        this.f8497w = uVar;
                    } else {
                        uVar = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (uVar != null) {
                uVar.c(this.f8478d.schedule(new w(uVar), this.f8481g.f8726b, TimeUnit.NANOSECONDS));
            }
        }
        g0(cE0);
    }

    @Override // io.grpc.internal.r
    public final void h(C1318v c1318v) {
        f0(new f(c1318v));
    }

    @Override // io.grpc.internal.Q0
    public final boolean i() {
        Iterator it = this.f8489o.f8503c.iterator();
        while (it.hasNext()) {
            if (((C) it.next()).f8522a.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.internal.Q0
    public final void j(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    abstract io.grpc.internal.r j0(y1.Z z2, AbstractC1308k.a aVar, int i3, boolean z3);

    @Override // io.grpc.internal.r
    public final void k(String str) {
        f0(new C0928b(str));
    }

    abstract void k0();

    @Override // io.grpc.internal.r
    public void l(Y y2) {
        A a3;
        Y y3;
        String str;
        synchronized (this.f8483i) {
            y2.b("closed", this.f8488n);
            a3 = this.f8489o;
        }
        if (a3.f8506f != null) {
            y3 = new Y();
            a3.f8506f.f8522a.l(y3);
            str = "committed";
        } else {
            y3 = new Y();
            for (C c3 : a3.f8503c) {
                Y y4 = new Y();
                c3.f8522a.l(y4);
                y3.a(y4);
            }
            str = "open";
        }
        y2.b(str, y3);
    }

    abstract y1.l0 l0();

    @Override // io.grpc.internal.r
    public final void m(C1316t c1316t) {
        f0(new e(c1316t));
    }

    @Override // io.grpc.internal.Q0
    public void n() {
        f0(new l());
    }

    @Override // io.grpc.internal.r
    public final void o() {
        f0(new i());
    }

    final void o0(Object obj) {
        A a3 = this.f8489o;
        if (a3.f8501a) {
            a3.f8506f.f8522a.j(this.f8475a.j(obj));
        } else {
            f0(new n(obj));
        }
    }

    final y1.Z p0(y1.Z z2, int i3) {
        y1.Z z3 = new y1.Z();
        z3.m(z2);
        if (i3 > 0) {
            z3.p(f8471A, String.valueOf(i3));
        }
        return z3;
    }

    @Override // io.grpc.internal.r
    public final void q(boolean z2) {
        f0(new h(z2));
    }
}
