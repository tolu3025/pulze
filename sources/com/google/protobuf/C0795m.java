package com.google.protobuf;

import com.google.protobuf.B0;
import com.google.protobuf.C0;
import com.google.protobuf.N;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0795m implements C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0794l f6856a;

    /* JADX INFO: renamed from: com.google.protobuf.m$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6857a;

        static {
            int[] iArr = new int[B0.b.values().length];
            f6857a = iArr;
            try {
                iArr[B0.b.f6640o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6857a[B0.b.f6639n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6857a[B0.b.f6637l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6857a[B0.b.f6647v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6857a[B0.b.f6649x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6857a[B0.b.f6645t.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6857a[B0.b.f6638m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6857a[B0.b.f6635e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6857a[B0.b.f6648w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6857a[B0.b.f6650y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6857a[B0.b.f6636f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6857a[B0.b.f6641p.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C0795m(AbstractC0794l abstractC0794l) {
        AbstractC0794l abstractC0794l2 = (AbstractC0794l) C.b(abstractC0794l, "output");
        this.f6856a = abstractC0794l2;
        abstractC0794l2.f6845a = this;
    }

    public static C0795m P(AbstractC0794l abstractC0794l) {
        C0795m c0795m = abstractC0794l.f6845a;
        return c0795m != null ? c0795m : new C0795m(abstractC0794l);
    }

    private void Q(int i3, boolean z2, Object obj, N.a aVar) {
        this.f6856a.R0(i3, 2);
        this.f6856a.T0(N.b(aVar, Boolean.valueOf(z2), obj));
        N.e(this.f6856a, aVar, Boolean.valueOf(z2), obj);
    }

    private void R(int i3, N.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            iArr[i4] = ((Integer) it.next()).intValue();
            i4++;
        }
        Arrays.sort(iArr);
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = iArr[i5];
            Object obj = map.get(Integer.valueOf(i6));
            this.f6856a.R0(i3, 2);
            this.f6856a.T0(N.b(aVar, Integer.valueOf(i6), obj));
            N.e(this.f6856a, aVar, Integer.valueOf(i6), obj);
        }
    }

    private void S(int i3, N.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            jArr[i4] = ((Long) it.next()).longValue();
            i4++;
        }
        Arrays.sort(jArr);
        for (int i5 = 0; i5 < size; i5++) {
            long j3 = jArr[i5];
            Object obj = map.get(Long.valueOf(j3));
            this.f6856a.R0(i3, 2);
            this.f6856a.T0(N.b(aVar, Long.valueOf(j3), obj));
            N.e(this.f6856a, aVar, Long.valueOf(j3), obj);
        }
    }

    private void T(int i3, N.a aVar, Map map) {
        switch (a.f6857a[aVar.f6713a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i3, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i3, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i3, aVar, map);
                return;
            case 7:
            case 8:
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
                S(i3, aVar, map);
                return;
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                U(i3, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f6713a);
        }
    }

    private void U(int i3, N.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            strArr[i4] = (String) it.next();
            i4++;
        }
        Arrays.sort(strArr);
        for (int i5 = 0; i5 < size; i5++) {
            String str = strArr[i5];
            Object obj = map.get(str);
            this.f6856a.R0(i3, 2);
            this.f6856a.T0(N.b(aVar, str, obj));
            N.e(this.f6856a, aVar, str, obj);
        }
    }

    private void V(int i3, Object obj) {
        if (obj instanceof String) {
            this.f6856a.P0(i3, (String) obj);
        } else {
            this.f6856a.j0(i3, (AbstractC0791i) obj);
        }
    }

    @Override // com.google.protobuf.C0
    public void A(int i3, String str) {
        this.f6856a.P0(i3, str);
    }

    @Override // com.google.protobuf.C0
    public void B(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.L0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iL = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iL += AbstractC0794l.L(((Integer) list.get(i5)).intValue());
        }
        this.f6856a.T0(iL);
        while (i4 < list.size()) {
            this.f6856a.M0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void C(int i3, long j3) {
        this.f6856a.U0(i3, j3);
    }

    @Override // com.google.protobuf.C0
    public void D(int i3, int i4) {
        this.f6856a.n0(i3, i4);
    }

    @Override // com.google.protobuf.C0
    public void E(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.B0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iZ = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iZ += AbstractC0794l.z(((Long) list.get(i5)).longValue());
        }
        this.f6856a.T0(iZ);
        while (i4 < list.size()) {
            this.f6856a.C0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void F(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.n0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iM = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iM += AbstractC0794l.m(((Integer) list.get(i5)).intValue());
        }
        this.f6856a.T0(iM);
        while (i4 < list.size()) {
            this.f6856a.o0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void G(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.l0(i3, ((Double) list.get(i4)).doubleValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iK = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iK += AbstractC0794l.k(((Double) list.get(i5)).doubleValue());
        }
        this.f6856a.T0(iK);
        while (i4 < list.size()) {
            this.f6856a.m0(((Double) list.get(i4)).doubleValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void H(int i3, int i4) {
        this.f6856a.L0(i3, i4);
    }

    @Override // com.google.protobuf.C0
    public void I(int i3, List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f6856a.j0(i3, (AbstractC0791i) list.get(i4));
        }
    }

    @Override // com.google.protobuf.C0
    public void J(int i3, List list, n0 n0Var) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            N(i3, list.get(i4), n0Var);
        }
    }

    @Override // com.google.protobuf.C0
    public void K(int i3, List list, n0 n0Var) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            L(i3, list.get(i4), n0Var);
        }
    }

    @Override // com.google.protobuf.C0
    public void L(int i3, Object obj, n0 n0Var) {
        this.f6856a.w0(i3, (V) obj, n0Var);
    }

    @Override // com.google.protobuf.C0
    public void M(int i3, AbstractC0791i abstractC0791i) {
        this.f6856a.j0(i3, abstractC0791i);
    }

    @Override // com.google.protobuf.C0
    public void N(int i3, Object obj, n0 n0Var) {
        this.f6856a.D0(i3, (V) obj, n0Var);
    }

    @Override // com.google.protobuf.C0
    public void O(int i3, N.a aVar, Map map) {
        if (this.f6856a.Z()) {
            T(i3, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f6856a.R0(i3, 2);
            this.f6856a.T0(N.b(aVar, entry.getKey(), entry.getValue()));
            N.e(this.f6856a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.C0
    public void a(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.z0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iX = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iX += AbstractC0794l.x(((Integer) list.get(i5)).intValue());
        }
        this.f6856a.T0(iX);
        while (i4 < list.size()) {
            this.f6856a.A0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void b(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.t0(i3, ((Float) list.get(i4)).floatValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iS = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iS += AbstractC0794l.s(((Float) list.get(i5)).floatValue());
        }
        this.f6856a.T0(iS);
        while (i4 < list.size()) {
            this.f6856a.u0(((Float) list.get(i4)).floatValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void c(int i3, long j3) {
        this.f6856a.B0(i3, j3);
    }

    @Override // com.google.protobuf.C0
    public void d(int i3, boolean z2) {
        this.f6856a.f0(i3, z2);
    }

    @Override // com.google.protobuf.C0
    public void e(int i3, int i4) {
        this.f6856a.S0(i3, i4);
    }

    @Override // com.google.protobuf.C0
    public final void f(int i3, Object obj) {
        if (obj instanceof AbstractC0791i) {
            this.f6856a.G0(i3, (AbstractC0791i) obj);
        } else {
            this.f6856a.F0(i3, (V) obj);
        }
    }

    @Override // com.google.protobuf.C0
    public void g(int i3, int i4) {
        this.f6856a.H0(i3, i4);
    }

    @Override // com.google.protobuf.C0
    public void h(int i3) {
        this.f6856a.R0(i3, 3);
    }

    @Override // com.google.protobuf.C0
    public void i(int i3, int i4) {
        this.f6856a.z0(i3, i4);
    }

    @Override // com.google.protobuf.C0
    public void j(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.r0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iQ = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iQ += AbstractC0794l.q(((Long) list.get(i5)).longValue());
        }
        this.f6856a.T0(iQ);
        while (i4 < list.size()) {
            this.f6856a.s0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void k(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.H0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iH = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iH += AbstractC0794l.H(((Integer) list.get(i5)).intValue());
        }
        this.f6856a.T0(iH);
        while (i4 < list.size()) {
            this.f6856a.I0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void l(int i3, int i4) {
        this.f6856a.p0(i3, i4);
    }

    @Override // com.google.protobuf.C0
    public void m(int i3, double d3) {
        this.f6856a.l0(i3, d3);
    }

    @Override // com.google.protobuf.C0
    public void n(int i3, long j3) {
        this.f6856a.J0(i3, j3);
    }

    @Override // com.google.protobuf.C0
    public void o(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.J0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iJ = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iJ += AbstractC0794l.J(((Long) list.get(i5)).longValue());
        }
        this.f6856a.T0(iJ);
        while (i4 < list.size()) {
            this.f6856a.K0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void p(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.p0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iO = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iO += AbstractC0794l.o(((Integer) list.get(i5)).intValue());
        }
        this.f6856a.T0(iO);
        while (i4 < list.size()) {
            this.f6856a.q0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void q(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.U0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iU = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iU += AbstractC0794l.U(((Long) list.get(i5)).longValue());
        }
        this.f6856a.T0(iU);
        while (i4 < list.size()) {
            this.f6856a.V0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void r(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.f0(i3, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iF = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iF += AbstractC0794l.f(((Boolean) list.get(i5)).booleanValue());
        }
        this.f6856a.T0(iF);
        while (i4 < list.size()) {
            this.f6856a.g0(((Boolean) list.get(i4)).booleanValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void s(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.S0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iS = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iS += AbstractC0794l.S(((Integer) list.get(i5)).intValue());
        }
        this.f6856a.T0(iS);
        while (i4 < list.size()) {
            this.f6856a.T0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void t(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f6856a.N0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f6856a.R0(i3, 2);
        int iN = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iN += AbstractC0794l.N(((Long) list.get(i5)).longValue());
        }
        this.f6856a.T0(iN);
        while (i4 < list.size()) {
            this.f6856a.O0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // com.google.protobuf.C0
    public void u(int i3, long j3) {
        this.f6856a.r0(i3, j3);
    }

    @Override // com.google.protobuf.C0
    public C0.a v() {
        return C0.a.ASCENDING;
    }

    @Override // com.google.protobuf.C0
    public void w(int i3, long j3) {
        this.f6856a.N0(i3, j3);
    }

    @Override // com.google.protobuf.C0
    public void x(int i3, float f3) {
        this.f6856a.t0(i3, f3);
    }

    @Override // com.google.protobuf.C0
    public void y(int i3, List list) {
        int i4 = 0;
        if (!(list instanceof J)) {
            while (i4 < list.size()) {
                this.f6856a.P0(i3, (String) list.get(i4));
                i4++;
            }
        } else {
            J j3 = (J) list;
            while (i4 < list.size()) {
                V(i3, j3.j(i4));
                i4++;
            }
        }
    }

    @Override // com.google.protobuf.C0
    public void z(int i3) {
        this.f6856a.R0(i3, 4);
    }
}
