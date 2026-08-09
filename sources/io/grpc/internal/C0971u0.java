package io.grpc.internal;

import e0.AbstractC0825f;
import e0.AbstractC0829j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import y1.C1314q;
import y1.EnumC1313p;
import y1.S;

/* JADX INFO: renamed from: io.grpc.internal.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0971u0 extends y1.S {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final S.e f9334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private S.i f9335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EnumC1313p f9336i = EnumC1313p.IDLE;

    /* JADX INFO: renamed from: io.grpc.internal.u0$a */
    class a implements S.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ S.i f9337a;

        a(S.i iVar) {
            this.f9337a = iVar;
        }

        @Override // y1.S.k
        public void a(C1314q c1314q) {
            C0971u0.this.i(this.f9337a, c1314q);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.u0$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9339a;

        static {
            int[] iArr = new int[EnumC1313p.values().length];
            f9339a = iArr;
            try {
                iArr[EnumC1313p.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9339a[EnumC1313p.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9339a[EnumC1313p.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9339a[EnumC1313p.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.u0$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f9340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Long f9341b;

        public c(Boolean bool) {
            this(bool, null);
        }

        c(Boolean bool, Long l3) {
            this.f9340a = bool;
            this.f9341b = l3;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.u0$d */
    private static final class d extends S.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S.f f9342a;

        d(S.f fVar) {
            this.f9342a = (S.f) AbstractC0829j.o(fVar, "result");
        }

        @Override // y1.S.j
        public S.f a(S.g gVar) {
            return this.f9342a;
        }

        public String toString() {
            return AbstractC0825f.a(d.class).d("result", this.f9342a).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.u0$e */
    private final class e extends S.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S.i f9343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f9344b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: io.grpc.internal.u0$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f9343a.f();
            }
        }

        e(S.i iVar) {
            this.f9343a = (S.i) AbstractC0829j.o(iVar, "subchannel");
        }

        @Override // y1.S.j
        public S.f a(S.g gVar) {
            if (this.f9344b.compareAndSet(false, true)) {
                C0971u0.this.f9334g.d().execute(new a());
            }
            return S.f.g();
        }
    }

    C0971u0(S.e eVar) {
        this.f9334g = (S.e) AbstractC0829j.o(eVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(S.i iVar, C1314q c1314q) {
        S.j eVar;
        S.j dVar;
        EnumC1313p enumC1313pC = c1314q.c();
        if (enumC1313pC == EnumC1313p.SHUTDOWN) {
            return;
        }
        EnumC1313p enumC1313p = EnumC1313p.TRANSIENT_FAILURE;
        if (enumC1313pC == enumC1313p || enumC1313pC == EnumC1313p.IDLE) {
            this.f9334g.e();
        }
        if (this.f9336i == enumC1313p) {
            if (enumC1313pC == EnumC1313p.CONNECTING) {
                return;
            }
            if (enumC1313pC == EnumC1313p.IDLE) {
                e();
                return;
            }
        }
        int i3 = b.f9339a[enumC1313pC.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                dVar = new d(S.f.g());
            } else if (i3 == 3) {
                eVar = new d(S.f.h(iVar));
            } else {
                if (i3 != 4) {
                    throw new IllegalArgumentException("Unsupported state:" + enumC1313pC);
                }
                dVar = new d(S.f.f(c1314q.d()));
            }
            j(enumC1313pC, dVar);
        }
        eVar = new e(iVar);
        dVar = eVar;
        j(enumC1313pC, dVar);
    }

    private void j(EnumC1313p enumC1313p, S.j jVar) {
        this.f9336i = enumC1313p;
        this.f9334g.f(enumC1313p, jVar);
    }

    @Override // y1.S
    public y1.l0 a(S.h hVar) {
        c cVar;
        Boolean bool;
        List listA = hVar.a();
        if (listA.isEmpty()) {
            y1.l0 l0VarQ = y1.l0.f11975t.q("NameResolver returned no usable address. addrs=" + hVar.a() + ", attrs=" + hVar.b());
            c(l0VarQ);
            return l0VarQ;
        }
        if ((hVar.c() instanceof c) && (bool = (cVar = (c) hVar.c()).f9340a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(listA);
            Collections.shuffle(arrayList, cVar.f9341b != null ? new Random(cVar.f9341b.longValue()) : new Random());
            listA = arrayList;
        }
        S.i iVar = this.f9335h;
        if (iVar == null) {
            S.i iVarA = this.f9334g.a(S.b.d().e(listA).c());
            iVarA.h(new a(iVarA));
            this.f9335h = iVarA;
            j(EnumC1313p.CONNECTING, new d(S.f.h(iVarA)));
            iVarA.f();
        } else {
            iVar.i(listA);
        }
        return y1.l0.f11960e;
    }

    @Override // y1.S
    public void c(y1.l0 l0Var) {
        S.i iVar = this.f9335h;
        if (iVar != null) {
            iVar.g();
            this.f9335h = null;
        }
        j(EnumC1313p.TRANSIENT_FAILURE, new d(S.f.f(l0Var)));
    }

    @Override // y1.S
    public void e() {
        S.i iVar = this.f9335h;
        if (iVar != null) {
            iVar.f();
        }
    }

    @Override // y1.S
    public void f() {
        S.i iVar = this.f9335h;
        if (iVar != null) {
            iVar.g();
        }
    }
}
