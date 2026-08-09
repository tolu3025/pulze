package com.google.protobuf;

import c.AbstractC0527b;
import com.google.protobuf.B0;
import com.google.protobuf.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0802u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C0802u f6905d = new C0802u(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q0 f6906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6908c;

    /* JADX INFO: renamed from: com.google.protobuf.u$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f6910b;

        static {
            int[] iArr = new int[B0.b.values().length];
            f6910b = iArr;
            try {
                iArr[B0.b.f6633c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6910b[B0.b.f6634d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6910b[B0.b.f6635e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6910b[B0.b.f6636f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6910b[B0.b.f6637l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6910b[B0.b.f6638m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6910b[B0.b.f6639n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6910b[B0.b.f6640o.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6910b[B0.b.f6642q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6910b[B0.b.f6643r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6910b[B0.b.f6641p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6910b[B0.b.f6644s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6910b[B0.b.f6645t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6910b[B0.b.f6647v.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6910b[B0.b.f6648w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6910b[B0.b.f6649x.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6910b[B0.b.f6650y.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f6910b[B0.b.f6646u.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[B0.c.values().length];
            f6909a = iArr2;
            try {
                iArr2[B0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f6909a[B0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f6909a[B0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f6909a[B0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f6909a[B0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f6909a[B0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f6909a[B0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f6909a[B0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f6909a[B0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.u$b */
    public interface b extends Comparable {
        int a();

        boolean b();

        B0.b d();

        boolean f();
    }

    private C0802u() {
        this.f6906a = q0.q(16);
    }

    static int b(B0.b bVar, int i3, Object obj) {
        int iQ = AbstractC0794l.Q(i3);
        if (bVar == B0.b.f6642q) {
            iQ *= 2;
        }
        return iQ + c(bVar, obj);
    }

    static int c(B0.b bVar, Object obj) {
        switch (a.f6910b[bVar.ordinal()]) {
            case 1:
                return AbstractC0794l.k(((Double) obj).doubleValue());
            case 2:
                return AbstractC0794l.s(((Float) obj).floatValue());
            case 3:
                return AbstractC0794l.z(((Long) obj).longValue());
            case 4:
                return AbstractC0794l.U(((Long) obj).longValue());
            case 5:
                return AbstractC0794l.x(((Integer) obj).intValue());
            case 6:
                return AbstractC0794l.q(((Long) obj).longValue());
            case 7:
                return AbstractC0794l.o(((Integer) obj).intValue());
            case 8:
                return AbstractC0794l.f(((Boolean) obj).booleanValue());
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return AbstractC0794l.u((V) obj);
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return AbstractC0794l.C((V) obj);
            case 11:
                return obj instanceof AbstractC0791i ? AbstractC0794l.i((AbstractC0791i) obj) : AbstractC0794l.P((String) obj);
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return obj instanceof AbstractC0791i ? AbstractC0794l.i((AbstractC0791i) obj) : AbstractC0794l.g((byte[]) obj);
            case 13:
                return AbstractC0794l.S(((Integer) obj).intValue());
            case 14:
                return AbstractC0794l.H(((Integer) obj).intValue());
            case 15:
                return AbstractC0794l.J(((Long) obj).longValue());
            case 16:
                return AbstractC0794l.L(((Integer) obj).intValue());
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return AbstractC0794l.N(((Long) obj).longValue());
            case V0.I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return obj instanceof C.a ? AbstractC0794l.m(((C.a) obj).a()) : AbstractC0794l.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        B0.b bVarD = bVar.d();
        int iA = bVar.a();
        if (!bVar.b()) {
            return b(bVarD, iA, obj);
        }
        List list = (List) obj;
        int iB = 0;
        if (!bVar.f()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iB += b(bVarD, iA, it.next());
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iB += c(bVarD, it2.next());
        }
        return AbstractC0794l.Q(iA) + iB + AbstractC0794l.S(iB);
    }

    private int g(Map.Entry entry) {
        AbstractC0527b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(B0.b bVar, boolean z2) {
        if (z2) {
            return 2;
        }
        return bVar.e();
    }

    private static boolean l(Map.Entry entry) {
        AbstractC0527b.a(entry.getKey());
        throw null;
    }

    private static boolean m(B0.b bVar, Object obj) {
        C.a(obj);
        switch (a.f6909a[bVar.c().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC0791i) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof C.a);
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return obj instanceof V;
            default:
                return false;
        }
    }

    private void q(Map.Entry entry) {
        AbstractC0527b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static C0802u r() {
        return new C0802u();
    }

    private void t(b bVar, Object obj) {
        if (!m(bVar.d(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.a()), bVar.d().c(), obj.getClass().getName()));
        }
    }

    static void u(AbstractC0794l abstractC0794l, B0.b bVar, int i3, Object obj) {
        if (bVar == B0.b.f6642q) {
            abstractC0794l.v0(i3, (V) obj);
        } else {
            abstractC0794l.R0(i3, i(bVar, false));
            v(abstractC0794l, bVar, obj);
        }
    }

    static void v(AbstractC0794l abstractC0794l, B0.b bVar, Object obj) {
        switch (a.f6910b[bVar.ordinal()]) {
            case 1:
                abstractC0794l.m0(((Double) obj).doubleValue());
                return;
            case 2:
                abstractC0794l.u0(((Float) obj).floatValue());
                return;
            case 3:
                abstractC0794l.C0(((Long) obj).longValue());
                return;
            case 4:
                abstractC0794l.V0(((Long) obj).longValue());
                return;
            case 5:
                abstractC0794l.A0(((Integer) obj).intValue());
                return;
            case 6:
                abstractC0794l.s0(((Long) obj).longValue());
                return;
            case 7:
                abstractC0794l.q0(((Integer) obj).intValue());
                return;
            case 8:
                abstractC0794l.g0(((Boolean) obj).booleanValue());
                return;
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                abstractC0794l.x0((V) obj);
                return;
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                abstractC0794l.E0((V) obj);
                return;
            case 11:
                if (!(obj instanceof AbstractC0791i)) {
                    abstractC0794l.Q0((String) obj);
                    return;
                }
                break;
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (!(obj instanceof AbstractC0791i)) {
                    abstractC0794l.h0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                abstractC0794l.T0(((Integer) obj).intValue());
                return;
            case 14:
                abstractC0794l.I0(((Integer) obj).intValue());
                return;
            case 15:
                abstractC0794l.K0(((Long) obj).longValue());
                return;
            case 16:
                abstractC0794l.M0(((Integer) obj).intValue());
                return;
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                abstractC0794l.O0(((Long) obj).longValue());
                return;
            case V0.I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                abstractC0794l.o0(obj instanceof C.a ? ((C.a) obj).a() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        abstractC0794l.k0((AbstractC0791i) obj);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0802u clone() {
        C0802u c0802uR = r();
        for (int i3 = 0; i3 < this.f6906a.k(); i3++) {
            Map.Entry entryJ = this.f6906a.j(i3);
            AbstractC0527b.a(entryJ.getKey());
            c0802uR.s(null, entryJ.getValue());
        }
        for (Map.Entry entry : this.f6906a.m()) {
            AbstractC0527b.a(entry.getKey());
            c0802uR.s(null, entry.getValue());
        }
        c0802uR.f6908c = this.f6908c;
        return c0802uR;
    }

    Iterator e() {
        return this.f6908c ? new H(this.f6906a.h().iterator()) : this.f6906a.h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0802u) {
            return this.f6906a.equals(((C0802u) obj).f6906a);
        }
        return false;
    }

    public int f() {
        int iG = 0;
        for (int i3 = 0; i3 < this.f6906a.k(); i3++) {
            iG += g(this.f6906a.j(i3));
        }
        Iterator it = this.f6906a.m().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public int h() {
        int iD = 0;
        for (int i3 = 0; i3 < this.f6906a.k(); i3++) {
            Map.Entry entryJ = this.f6906a.j(i3);
            AbstractC0527b.a(entryJ.getKey());
            iD += d(null, entryJ.getValue());
        }
        for (Map.Entry entry : this.f6906a.m()) {
            AbstractC0527b.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public int hashCode() {
        return this.f6906a.hashCode();
    }

    boolean j() {
        return this.f6906a.isEmpty();
    }

    public boolean k() {
        for (int i3 = 0; i3 < this.f6906a.k(); i3++) {
            if (!l(this.f6906a.j(i3))) {
                return false;
            }
        }
        Iterator it = this.f6906a.m().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return this.f6908c ? new H(this.f6906a.entrySet().iterator()) : this.f6906a.entrySet().iterator();
    }

    public void o() {
        if (this.f6907b) {
            return;
        }
        for (int i3 = 0; i3 < this.f6906a.k(); i3++) {
            Map.Entry entryJ = this.f6906a.j(i3);
            if (entryJ.getValue() instanceof AbstractC0806y) {
                ((AbstractC0806y) entryJ.getValue()).J();
            }
        }
        this.f6906a.p();
        this.f6907b = true;
    }

    public void p(C0802u c0802u) {
        for (int i3 = 0; i3 < c0802u.f6906a.k(); i3++) {
            q(c0802u.f6906a.j(i3));
        }
        Iterator it = c0802u.f6906a.m().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public void s(b bVar, Object obj) {
        if (!bVar.b()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f6906a.r(bVar, obj);
    }

    private C0802u(q0 q0Var) {
        this.f6906a = q0Var;
        o();
    }

    private C0802u(boolean z2) {
        this(q0.q(0));
        o();
    }
}
