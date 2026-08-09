package E0;

import D0.z;
import J0.AbstractC0386b;
import V0.I;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private I f1401a;

    public j(I i3) {
        AbstractC0386b.d(z.X(i3), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.f1401a = i3;
    }

    private double e() {
        if (z.R(this.f1401a)) {
            return this.f1401a.s0();
        }
        if (z.S(this.f1401a)) {
            return this.f1401a.w0();
        }
        throw AbstractC0386b.a("Expected 'operand' to be of Number type, but was " + this.f1401a.getClass().getCanonicalName(), new Object[0]);
    }

    private long f() {
        if (z.R(this.f1401a)) {
            return (long) this.f1401a.s0();
        }
        if (z.S(this.f1401a)) {
            return this.f1401a.w0();
        }
        throw AbstractC0386b.a("Expected 'operand' to be of Number type, but was " + this.f1401a.getClass().getCanonicalName(), new Object[0]);
    }

    private long g(long j3, long j4) {
        long j5 = j3 + j4;
        return ((j3 ^ j5) & (j4 ^ j5)) >= 0 ? j5 : j5 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    @Override // E0.p
    public I a(I i3) {
        return z.X(i3) ? i3 : (I) I.J0().F(0L).n();
    }

    @Override // E0.p
    public I c(I i3, C1004r c1004r) {
        double dS0;
        I.b bVarB;
        I iA = a(i3);
        if (z.S(iA) && z.S(this.f1401a)) {
            bVarB = I.J0().F(g(iA.w0(), f()));
        } else {
            if (z.S(iA)) {
                dS0 = iA.w0();
            } else {
                AbstractC0386b.d(z.R(iA), "Expected NumberValue to be of type DoubleValue, but was ", i3.getClass().getCanonicalName());
                dS0 = iA.s0();
            }
            bVarB = I.J0().B(dS0 + e());
        }
        return (I) bVarB.n();
    }

    public I d() {
        return this.f1401a;
    }

    @Override // E0.p
    public I b(I i3, I i4) {
        return i4;
    }
}
