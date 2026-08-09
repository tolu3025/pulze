package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.l0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0496j implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0495i f4144a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4145a;

        static {
            int[] iArr = new int[k0.b.values().length];
            f4145a = iArr;
            try {
                iArr[k0.b.f4158o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4145a[k0.b.f4157n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4145a[k0.b.f4155l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4145a[k0.b.f4165v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4145a[k0.b.f4167x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4145a[k0.b.f4163t.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4145a[k0.b.f4156m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4145a[k0.b.f4153e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4145a[k0.b.f4166w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4145a[k0.b.f4168y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4145a[k0.b.f4154f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4145a[k0.b.f4159p.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C0496j(AbstractC0495i abstractC0495i) {
        AbstractC0495i abstractC0495i2 = (AbstractC0495i) AbstractC0506u.b(abstractC0495i, "output");
        this.f4144a = abstractC0495i2;
        abstractC0495i2.f4113a = this;
    }

    public static C0496j P(AbstractC0495i abstractC0495i) {
        C0496j c0496j = abstractC0495i.f4113a;
        return c0496j != null ? c0496j : new C0496j(abstractC0495i);
    }

    private void Q(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.a0(i3, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int iD = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iD += AbstractC0495i.d(((Boolean) list.get(i5)).booleanValue());
        }
        this.f4144a.O0(iD);
        while (i4 < list.size()) {
            this.f4144a.b0(((Boolean) list.get(i4)).booleanValue());
            i4++;
        }
    }

    private void R(int i3, boolean z2, Object obj, C.a aVar) {
        this.f4144a.M0(i3, 2);
        this.f4144a.O0(C.b(aVar, Boolean.valueOf(z2), obj));
        C.e(this.f4144a, aVar, Boolean.valueOf(z2), obj);
    }

    private void S(int i3, C.a aVar, Map map) {
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
            this.f4144a.M0(i3, 2);
            this.f4144a.O0(C.b(aVar, Integer.valueOf(i6), obj));
            C.e(this.f4144a, aVar, Integer.valueOf(i6), obj);
        }
    }

    private void T(int i3, C.a aVar, Map map) {
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
            this.f4144a.M0(i3, 2);
            this.f4144a.O0(C.b(aVar, Long.valueOf(j3), obj));
            C.e(this.f4144a, aVar, Long.valueOf(j3), obj);
        }
    }

    private void U(int i3, C.a aVar, Map map) {
        switch (a.f4145a[aVar.f3989a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    R(i3, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    R(i3, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                S(i3, aVar, map);
                return;
            case 7:
            case 8:
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
                T(i3, aVar, map);
                return;
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                V(i3, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f3989a);
        }
    }

    private void V(int i3, C.a aVar, Map map) {
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
            this.f4144a.M0(i3, 2);
            this.f4144a.O0(C.b(aVar, str, obj));
            C.e(this.f4144a, aVar, str, obj);
        }
    }

    private void W(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.g0(i3, ((Double) list.get(i4)).doubleValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0495i.i(((Double) list.get(i6)).doubleValue());
        }
        this.f4144a.O0(i5);
        while (i4 < list.size()) {
            this.f4144a.h0(((Double) list.get(i4)).doubleValue());
            i4++;
        }
    }

    private void X(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.i0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int iK = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iK += AbstractC0495i.k(((Integer) list.get(i5)).intValue());
        }
        this.f4144a.O0(iK);
        while (i4 < list.size()) {
            this.f4144a.j0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    private void Y(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.k0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int iM = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iM += AbstractC0495i.m(((Integer) list.get(i5)).intValue());
        }
        this.f4144a.O0(iM);
        while (i4 < list.size()) {
            this.f4144a.l0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    private void Z(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.m0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int iO = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iO += AbstractC0495i.o(((Long) list.get(i5)).longValue());
        }
        this.f4144a.O0(iO);
        while (i4 < list.size()) {
            this.f4144a.n0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    private void a0(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.o0(i3, ((Float) list.get(i4)).floatValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int iQ = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iQ += AbstractC0495i.q(((Float) list.get(i5)).floatValue());
        }
        this.f4144a.O0(iQ);
        while (i4 < list.size()) {
            this.f4144a.p0(((Float) list.get(i4)).floatValue());
            i4++;
        }
    }

    private void b0(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.u0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int iV = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iV += AbstractC0495i.v(((Integer) list.get(i5)).intValue());
        }
        this.f4144a.O0(iV);
        while (i4 < list.size()) {
            this.f4144a.v0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    private void c0(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.w0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int iX = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iX += AbstractC0495i.x(((Long) list.get(i5)).longValue());
        }
        this.f4144a.O0(iX);
        while (i4 < list.size()) {
            this.f4144a.x0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    private void d0(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.C0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int iF = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iF += AbstractC0495i.F(((Integer) list.get(i5)).intValue());
        }
        this.f4144a.O0(iF);
        while (i4 < list.size()) {
            this.f4144a.D0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    private void e0(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.E0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int iH = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iH += AbstractC0495i.H(((Long) list.get(i5)).longValue());
        }
        this.f4144a.O0(iH);
        while (i4 < list.size()) {
            this.f4144a.F0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    private void g0(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.I0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int iL = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iL += AbstractC0495i.L(((Long) list.get(i5)).longValue());
        }
        this.f4144a.O0(iL);
        while (i4 < list.size()) {
            this.f4144a.J0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    private void i0(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.P0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int iS = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iS += AbstractC0495i.S(((Long) list.get(i5)).longValue());
        }
        this.f4144a.O0(iS);
        while (i4 < list.size()) {
            this.f4144a.Q0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void A(int i3, String str) {
        this.f4144a.K0(i3, str);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void B(int i3, List list, boolean z2) {
        f0(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void C(int i3, long j3) {
        this.f4144a.P0(i3, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void D(int i3, int i4) {
        this.f4144a.i0(i3, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void E(int i3, List list, boolean z2) {
        c0(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void F(int i3, List list, boolean z2) {
        X(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void G(int i3, List list, boolean z2) {
        W(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void H(int i3, int i4) {
        this.f4144a.G0(i3, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void I(int i3, List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f4144a.e0(i3, (AbstractC0492f) list.get(i4));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void J(int i3, AbstractC0492f abstractC0492f) {
        this.f4144a.e0(i3, abstractC0492f);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void K(int i3, Object obj, Y y2) {
        this.f4144a.y0(i3, (J) obj, y2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void L(int i3, List list, Y y2) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            K(i3, list.get(i4), y2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void M(int i3, List list, Y y2) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            O(i3, list.get(i4), y2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void N(int i3, C.a aVar, Map map) {
        if (this.f4144a.X()) {
            U(i3, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f4144a.M0(i3, 2);
            this.f4144a.O0(C.b(aVar, entry.getKey(), entry.getValue()));
            C.e(this.f4144a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void O(int i3, Object obj, Y y2) {
        this.f4144a.r0(i3, (J) obj, y2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void a(int i3, List list, boolean z2) {
        b0(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void b(int i3, List list, boolean z2) {
        a0(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void c(int i3, long j3) {
        this.f4144a.w0(i3, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void d(int i3, boolean z2) {
        this.f4144a.a0(i3, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void e(int i3, int i4) {
        this.f4144a.N0(i3, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void f(int i3, Object obj) {
        if (obj instanceof AbstractC0492f) {
            this.f4144a.B0(i3, (AbstractC0492f) obj);
        } else {
            this.f4144a.A0(i3, (J) obj);
        }
    }

    public void f0(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.G0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int iJ = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iJ += AbstractC0495i.J(((Integer) list.get(i5)).intValue());
        }
        this.f4144a.O0(iJ);
        while (i4 < list.size()) {
            this.f4144a.H0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void g(int i3, int i4) {
        this.f4144a.C0(i3, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void h(int i3) {
        this.f4144a.M0(i3, 3);
    }

    public void h0(int i3, List list, boolean z2) {
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                this.f4144a.N0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f4144a.M0(i3, 2);
        int iQ = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iQ += AbstractC0495i.Q(((Integer) list.get(i5)).intValue());
        }
        this.f4144a.O0(iQ);
        while (i4 < list.size()) {
            this.f4144a.O0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void i(int i3, int i4) {
        this.f4144a.u0(i3, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void j(int i3, List list, boolean z2) {
        Z(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void k(int i3, List list, boolean z2) {
        d0(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void l(int i3, int i4) {
        this.f4144a.k0(i3, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void m(int i3, double d3) {
        this.f4144a.g0(i3, d3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void n(int i3, long j3) {
        this.f4144a.E0(i3, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void o(int i3, List list, boolean z2) {
        e0(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void p(int i3, List list, boolean z2) {
        Y(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void q(int i3, List list, boolean z2) {
        i0(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void r(int i3, List list, boolean z2) {
        Q(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void s(int i3, List list, boolean z2) {
        h0(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void t(int i3, List list, boolean z2) {
        g0(i3, list, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void u(int i3, long j3) {
        this.f4144a.m0(i3, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public l0.a v() {
        return l0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void w(int i3, long j3) {
        this.f4144a.I0(i3, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void x(int i3, float f3) {
        this.f4144a.o0(i3, f3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void y(int i3, List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f4144a.K0(i3, (String) list.get(i4));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void z(int i3) {
        this.f4144a.M0(i3, 4);
    }
}
