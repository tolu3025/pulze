package g2;

import I1.n;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d[] f7345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7347c;

    protected final d c() {
        d dVarE;
        synchronized (this) {
            try {
                d[] dVarArrF = this.f7345a;
                if (dVarArrF == null) {
                    dVarArrF = f(2);
                    this.f7345a = dVarArrF;
                } else if (this.f7346b >= dVarArrF.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrF, dVarArrF.length * 2);
                    kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                    this.f7345a = (d[]) objArrCopyOf;
                    dVarArrF = (d[]) objArrCopyOf;
                }
                int i3 = this.f7347c;
                do {
                    dVarE = dVarArrF[i3];
                    if (dVarE == null) {
                        dVarE = e();
                        dVarArrF[i3] = dVarE;
                    }
                    i3++;
                    if (i3 >= dVarArrF.length) {
                        i3 = 0;
                    }
                    kotlin.jvm.internal.m.c(dVarE, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarE.a(this));
                this.f7347c = i3;
                this.f7346b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarE;
    }

    protected abstract d e();

    protected abstract d[] f(int i3);

    protected final void g(d dVar) {
        int i3;
        M1.d[] dVarArrB;
        synchronized (this) {
            try {
                int i4 = this.f7346b - 1;
                this.f7346b = i4;
                if (i4 == 0) {
                    this.f7347c = 0;
                }
                kotlin.jvm.internal.m.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                dVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (M1.d dVar2 : dVarArrB) {
            if (dVar2 != null) {
                n.a aVar = I1.n.f2411b;
                dVar2.resumeWith(I1.n.b(I1.u.f2419a));
            }
        }
    }

    protected final d[] h() {
        return this.f7345a;
    }
}
