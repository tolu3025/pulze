package g2;

import J1.x;
import c2.N;
import c2.O;
import c2.P;
import c2.S;
import e2.v;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M1.g f7349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2.a f7351c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f7353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f2.c f7354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f7355d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f2.c cVar, e eVar, M1.d dVar) {
            super(2, dVar);
            this.f7354c = cVar;
            this.f7355d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            a aVar = new a(this.f7354c, this.f7355d, dVar);
            aVar.f7353b = obj;
            return aVar;
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((a) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f7352a;
            if (i3 == 0) {
                I1.o.b(obj);
                N n3 = (N) this.f7353b;
                f2.c cVar = this.f7354c;
                v vVarJ = this.f7355d.j(n3);
                this.f7352a = 1;
                if (f2.d.e(cVar, vVarJ, this) == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return I1.u.f2419a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7357b;

        b(M1.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            b bVar = e.this.new b(dVar);
            bVar.f7357b = obj;
            return bVar;
        }

        @Override // U1.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e2.u uVar, M1.d dVar) {
            return ((b) create(uVar, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f7356a;
            if (i3 == 0) {
                I1.o.b(obj);
                e2.u uVar = (e2.u) this.f7357b;
                e eVar = e.this;
                this.f7356a = 1;
                if (eVar.f(uVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return I1.u.f2419a;
        }
    }

    public e(M1.g gVar, int i3, e2.a aVar) {
        this.f7349a = gVar;
        this.f7350b = i3;
        this.f7351c = aVar;
    }

    static /* synthetic */ Object e(e eVar, f2.c cVar, M1.d dVar) {
        Object objC = O.c(new a(cVar, eVar, null), dVar);
        return objC == N1.d.e() ? objC : I1.u.f2419a;
    }

    @Override // f2.b
    public Object a(f2.c cVar, M1.d dVar) {
        return e(this, cVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // g2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f2.b b(M1.g r2, int r3, e2.a r4) {
        /*
            r1 = this;
            M1.g r0 = r1.f7349a
            M1.g r2 = r2.plus(r0)
            e2.a r0 = e2.a.f7117a
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f7350b
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            e2.a r4 = r1.f7351c
        L25:
            M1.g r0 = r1.f7349a
            boolean r0 = kotlin.jvm.internal.m.a(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f7350b
            if (r3 != r0) goto L36
            e2.a r0 = r1.f7351c
            if (r4 != r0) goto L36
            return r1
        L36:
            g2.e r2 = r1.g(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.e.b(M1.g, int, e2.a):f2.b");
    }

    protected String c() {
        return null;
    }

    protected abstract Object f(e2.u uVar, M1.d dVar);

    protected abstract e g(M1.g gVar, int i3, e2.a aVar);

    public final U1.p h() {
        return new b(null);
    }

    public final int i() {
        int i3 = this.f7350b;
        if (i3 == -3) {
            return -2;
        }
        return i3;
    }

    public v j(N n3) {
        return e2.s.b(n3, this.f7349a, i(), this.f7351c, P.f5098c, null, h(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        if (this.f7349a != M1.h.f2707a) {
            arrayList.add("context=" + this.f7349a);
        }
        if (this.f7350b != -3) {
            arrayList.add("capacity=" + this.f7350b);
        }
        if (this.f7351c != e2.a.f7117a) {
            arrayList.add("onBufferOverflow=" + this.f7351c);
        }
        return S.a(this) + '[' + x.G(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
