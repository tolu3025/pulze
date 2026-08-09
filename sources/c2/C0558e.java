package c2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: c2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0558e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5126b = AtomicIntegerFieldUpdater.newUpdater(C0558e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V[] f5127a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: c2.e$a */
    private final class a extends E0 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f5128m = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC0576n f5129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC0561f0 f5130f;

        public a(InterfaceC0576n interfaceC0576n) {
            this.f5129e = interfaceC0576n;
        }

        public final void B(b bVar) {
            f5128m.set(this, bVar);
        }

        public final void C(InterfaceC0561f0 interfaceC0561f0) {
            this.f5130f = interfaceC0561f0;
        }

        @Override // c2.E0
        public boolean v() {
            return false;
        }

        @Override // c2.E0
        public void w(Throwable th) {
            if (th != null) {
                Object objM = this.f5129e.m(th);
                if (objM != null) {
                    this.f5129e.n(objM);
                    b bVarY = y();
                    if (bVarY != null) {
                        bVarY.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C0558e.d().decrementAndGet(C0558e.this) == 0) {
                InterfaceC0576n interfaceC0576n = this.f5129e;
                V[] vArr = C0558e.this.f5127a;
                ArrayList arrayList = new ArrayList(vArr.length);
                for (V v2 : vArr) {
                    arrayList.add(v2.getCompleted());
                }
                interfaceC0576n.resumeWith(I1.n.b(arrayList));
            }
        }

        public final b y() {
            return (b) f5128m.get(this);
        }

        public final InterfaceC0561f0 z() {
            InterfaceC0561f0 interfaceC0561f0 = this.f5130f;
            if (interfaceC0561f0 != null) {
                return interfaceC0561f0;
            }
            kotlin.jvm.internal.m.p("handle");
            return null;
        }
    }

    /* JADX INFO: renamed from: c2.e$b */
    private final class b implements InterfaceC0574m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a[] f5132a;

        public b(a[] aVarArr) {
            this.f5132a = aVarArr;
        }

        @Override // c2.InterfaceC0574m
        public void a(Throwable th) {
            b();
        }

        public final void b() {
            for (a aVar : this.f5132a) {
                aVar.z().e();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f5132a + ']';
        }
    }

    public C0558e(V[] vArr) {
        this.f5127a = vArr;
        this.notCompletedCount$volatile = vArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f5126b;
    }

    public final Object c(M1.d dVar) {
        C0580p c0580p = new C0580p(N1.c.c(dVar), 1);
        c0580p.F();
        int length = this.f5127a.length;
        a[] aVarArr = new a[length];
        for (int i3 = 0; i3 < length; i3++) {
            V v2 = this.f5127a[i3];
            v2.start();
            a aVar = new a(c0580p);
            aVar.C(D0.l(v2, false, aVar, 1, null));
            I1.u uVar = I1.u.f2419a;
            aVarArr[i3] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i4 = 0; i4 < length; i4++) {
            aVarArr[i4].B(bVar);
        }
        if (c0580p.isCompleted()) {
            bVar.b();
        } else {
            r.c(c0580p, bVar);
        }
        Object objZ = c0580p.z();
        if (objZ == N1.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objZ;
    }
}
