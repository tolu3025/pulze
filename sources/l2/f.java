package l2;

import I1.u;
import U1.l;
import U1.q;
import c.AbstractC0527b;
import c2.C0580p;
import c2.InterfaceC0576n;
import c2.K;
import c2.S;
import c2.c1;
import c2.r;
import h2.A;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l2.f;

/* JADX INFO: loaded from: classes.dex */
public class f extends i implements l2.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9804i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q f9805h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements InterfaceC0576n, c1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0580p f9806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f9807b;

        public a(C0580p c0580p, Object obj) {
            this.f9806a = c0580p;
            this.f9807b = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u h(f fVar, a aVar, Throwable th) {
            fVar.a(aVar.f9807b);
            return u.f2419a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u l(f fVar, a aVar, Throwable th, u uVar, M1.g gVar) {
            f.w().set(fVar, aVar.f9807b);
            fVar.a(aVar.f9807b);
            return u.f2419a;
        }

        @Override // c2.c1
        public void a(A a3, int i3) {
            this.f9806a.a(a3, i3);
        }

        @Override // c2.InterfaceC0576n
        public void c(l lVar) {
            this.f9806a.c(lVar);
        }

        @Override // c2.InterfaceC0576n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void g(u uVar, q qVar) {
            f.w().set(f.this, this.f9807b);
            C0580p c0580p = this.f9806a;
            final f fVar = f.this;
            c0580p.P(uVar, new l() { // from class: l2.d
                @Override // U1.l
                public final Object invoke(Object obj) {
                    return f.a.h(fVar, this, (Throwable) obj);
                }
            });
        }

        @Override // M1.d
        public M1.g getContext() {
            return this.f9806a.getContext();
        }

        @Override // c2.InterfaceC0576n
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void k(K k3, u uVar) {
            this.f9806a.k(k3, uVar);
        }

        @Override // c2.InterfaceC0576n
        public boolean isCompleted() {
            return this.f9806a.isCompleted();
        }

        @Override // c2.InterfaceC0576n
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Object b(u uVar, Object obj, q qVar) {
            final f fVar = f.this;
            Object objB = this.f9806a.b(uVar, obj, new q() { // from class: l2.e
                @Override // U1.q
                public final Object e(Object obj2, Object obj3, Object obj4) {
                    return f.a.l(fVar, this, (Throwable) obj2, (u) obj3, (M1.g) obj4);
                }
            });
            if (objB != null) {
                f.w().set(f.this, this.f9807b);
            }
            return objB;
        }

        @Override // c2.InterfaceC0576n
        public Object m(Throwable th) {
            return this.f9806a.m(th);
        }

        @Override // c2.InterfaceC0576n
        public void n(Object obj) {
            this.f9806a.n(obj);
        }

        @Override // M1.d
        public void resumeWith(Object obj) {
            this.f9806a.resumeWith(obj);
        }
    }

    public f(boolean z2) {
        super(1, z2 ? 1 : 0);
        this.owner$volatile = z2 ? null : g.f9809a;
        this.f9805h = new q() { // from class: l2.b
            @Override // U1.q
            public final Object e(Object obj, Object obj2, Object obj3) {
                f fVar = this.f9797a;
                AbstractC0527b.a(obj);
                return f.B(fVar, null, obj2, obj3);
            }
        };
    }

    private final Object A(Object obj, M1.d dVar) {
        C0580p c0580pB = r.b(N1.c.c(dVar));
        try {
            e(new a(c0580pB, obj));
            Object objZ = c0580pB.z();
            if (objZ == N1.d.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objZ == N1.d.e() ? objZ : u.f2419a;
        } catch (Throwable th) {
            c0580pB.N();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q B(final f fVar, k2.e eVar, final Object obj, Object obj2) {
        return new q() { // from class: l2.c
            @Override // U1.q
            public final Object e(Object obj3, Object obj4, Object obj5) {
                return f.C(this.f9798a, obj, (Throwable) obj3, obj4, (M1.g) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u C(f fVar, Object obj, Throwable th, Object obj2, M1.g gVar) {
        fVar.a(obj);
        return u.f2419a;
    }

    private final int D(Object obj) {
        while (!q()) {
            if (obj == null) {
                return 1;
            }
            int iX = x(obj);
            if (iX == 1) {
                return 2;
            }
            if (iX == 2) {
                return 1;
            }
        }
        f9804i.set(this, obj);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater w() {
        return f9804i;
    }

    private final int x(Object obj) {
        while (y()) {
            Object obj2 = f9804i.get(this);
            if (obj2 != g.f9809a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object z(f fVar, Object obj, M1.d dVar) {
        if (fVar.b(obj)) {
            return u.f2419a;
        }
        Object objA = fVar.A(obj, dVar);
        return objA == N1.d.e() ? objA : u.f2419a;
    }

    @Override // l2.a
    public void a(Object obj) {
        while (y()) {
            Object obj2 = f9804i.get(this);
            if (obj2 != g.f9809a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(f9804i, this, obj2, g.f9809a)) {
                    p();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @Override // l2.a
    public boolean b(Object obj) {
        int iD = D(obj);
        if (iD == 0) {
            return true;
        }
        if (iD == 1) {
            return false;
        }
        if (iD != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // l2.a
    public Object c(Object obj, M1.d dVar) {
        return z(this, obj, dVar);
    }

    public String toString() {
        return "Mutex@" + S.b(this) + "[isLocked=" + y() + ",owner=" + f9804i.get(this) + ']';
    }

    public boolean y() {
        return i() == 0;
    }
}
