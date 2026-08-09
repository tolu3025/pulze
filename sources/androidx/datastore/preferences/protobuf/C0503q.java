package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;
import c.AbstractC0527b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0503q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C0503q f4194d = new C0503q(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f4195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4197c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4199b;

        static {
            int[] iArr = new int[k0.b.values().length];
            f4199b = iArr;
            try {
                iArr[k0.b.f4151c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4199b[k0.b.f4152d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4199b[k0.b.f4153e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4199b[k0.b.f4154f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4199b[k0.b.f4155l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4199b[k0.b.f4156m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4199b[k0.b.f4157n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4199b[k0.b.f4158o.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4199b[k0.b.f4160q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4199b[k0.b.f4161r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4199b[k0.b.f4159p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4199b[k0.b.f4162s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4199b[k0.b.f4163t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4199b[k0.b.f4165v.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4199b[k0.b.f4166w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4199b[k0.b.f4167x.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4199b[k0.b.f4168y.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4199b[k0.b.f4164u.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[k0.c.values().length];
            f4198a = iArr2;
            try {
                iArr2[k0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f4198a[k0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f4198a[k0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f4198a[k0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f4198a[k0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f4198a[k0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f4198a[k0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4198a[k0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f4198a[k0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$b */
    public interface b extends Comparable {
        int a();

        boolean b();

        k0.b d();

        boolean f();
    }

    private C0503q() {
        this.f4195a = b0.q();
    }

    static int b(k0.b bVar, int i3, Object obj) {
        int iO = AbstractC0495i.O(i3);
        if (bVar == k0.b.f4160q) {
            iO *= 2;
        }
        return iO + c(bVar, obj);
    }

    static int c(k0.b bVar, Object obj) {
        switch (a.f4199b[bVar.ordinal()]) {
            case 1:
                return AbstractC0495i.i(((Double) obj).doubleValue());
            case 2:
                return AbstractC0495i.q(((Float) obj).floatValue());
            case 3:
                return AbstractC0495i.x(((Long) obj).longValue());
            case 4:
                return AbstractC0495i.S(((Long) obj).longValue());
            case 5:
                return AbstractC0495i.v(((Integer) obj).intValue());
            case 6:
                return AbstractC0495i.o(((Long) obj).longValue());
            case 7:
                return AbstractC0495i.m(((Integer) obj).intValue());
            case 8:
                return AbstractC0495i.d(((Boolean) obj).booleanValue());
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return AbstractC0495i.s((J) obj);
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return AbstractC0495i.A((J) obj);
            case 11:
                return obj instanceof AbstractC0492f ? AbstractC0495i.g((AbstractC0492f) obj) : AbstractC0495i.N((String) obj);
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return obj instanceof AbstractC0492f ? AbstractC0495i.g((AbstractC0492f) obj) : AbstractC0495i.e((byte[]) obj);
            case 13:
                return AbstractC0495i.Q(((Integer) obj).intValue());
            case 14:
                return AbstractC0495i.F(((Integer) obj).intValue());
            case 15:
                return AbstractC0495i.H(((Long) obj).longValue());
            case 16:
                return AbstractC0495i.J(((Integer) obj).intValue());
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return AbstractC0495i.L(((Long) obj).longValue());
            case V0.I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return AbstractC0495i.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        k0.b bVarD = bVar.d();
        int iA = bVar.a();
        if (!bVar.b()) {
            return b(bVarD, iA, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i3 = 0;
        if (!bVar.f()) {
            int iB = 0;
            while (i3 < size) {
                iB += b(bVarD, iA, list.get(i3));
                i3++;
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iC = 0;
        while (i3 < size) {
            iC += c(bVarD, list.get(i3));
            i3++;
        }
        return AbstractC0495i.O(iA) + iC + AbstractC0495i.Q(iC);
    }

    private int g(Map.Entry entry) {
        AbstractC0527b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(k0.b bVar, boolean z2) {
        if (z2) {
            return 2;
        }
        return bVar.e();
    }

    private static boolean l(Map.Entry entry) {
        AbstractC0527b.a(entry.getKey());
        throw null;
    }

    private static boolean m(k0.b bVar, Object obj) {
        AbstractC0506u.a(obj);
        switch (a.f4198a[bVar.c().ordinal()]) {
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
                return (obj instanceof AbstractC0492f) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return obj instanceof J;
            default:
                return false;
        }
    }

    private void q(Map.Entry entry) {
        AbstractC0527b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static C0503q r() {
        return new C0503q();
    }

    private void t(b bVar, Object obj) {
        if (!m(bVar.d(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.a()), bVar.d().c(), obj.getClass().getName()));
        }
    }

    static void u(AbstractC0495i abstractC0495i, k0.b bVar, int i3, Object obj) {
        if (bVar == k0.b.f4160q) {
            abstractC0495i.q0(i3, (J) obj);
        } else {
            abstractC0495i.M0(i3, i(bVar, false));
            v(abstractC0495i, bVar, obj);
        }
    }

    static void v(AbstractC0495i abstractC0495i, k0.b bVar, Object obj) {
        switch (a.f4199b[bVar.ordinal()]) {
            case 1:
                abstractC0495i.h0(((Double) obj).doubleValue());
                return;
            case 2:
                abstractC0495i.p0(((Float) obj).floatValue());
                return;
            case 3:
                abstractC0495i.x0(((Long) obj).longValue());
                return;
            case 4:
                abstractC0495i.Q0(((Long) obj).longValue());
                return;
            case 5:
                abstractC0495i.v0(((Integer) obj).intValue());
                return;
            case 6:
                abstractC0495i.n0(((Long) obj).longValue());
                return;
            case 7:
                abstractC0495i.l0(((Integer) obj).intValue());
                return;
            case 8:
                abstractC0495i.b0(((Boolean) obj).booleanValue());
                return;
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                abstractC0495i.s0((J) obj);
                return;
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                abstractC0495i.z0((J) obj);
                return;
            case 11:
                if (!(obj instanceof AbstractC0492f)) {
                    abstractC0495i.L0((String) obj);
                    return;
                }
                break;
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (!(obj instanceof AbstractC0492f)) {
                    abstractC0495i.c0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                abstractC0495i.O0(((Integer) obj).intValue());
                return;
            case 14:
                abstractC0495i.D0(((Integer) obj).intValue());
                return;
            case 15:
                abstractC0495i.F0(((Long) obj).longValue());
                return;
            case 16:
                abstractC0495i.H0(((Integer) obj).intValue());
                return;
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                abstractC0495i.J0(((Long) obj).longValue());
                return;
            case V0.I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                abstractC0495i.j0(((Integer) obj).intValue());
                return;
            default:
                return;
        }
        abstractC0495i.f0((AbstractC0492f) obj);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0503q clone() {
        C0503q c0503qR = r();
        int iK = this.f4195a.k();
        for (int i3 = 0; i3 < iK; i3++) {
            Map.Entry entryJ = this.f4195a.j(i3);
            AbstractC0527b.a(entryJ.getKey());
            c0503qR.s(null, entryJ.getValue());
        }
        for (Map.Entry entry : this.f4195a.m()) {
            AbstractC0527b.a(entry.getKey());
            c0503qR.s(null, entry.getValue());
        }
        c0503qR.f4197c = this.f4197c;
        return c0503qR;
    }

    Iterator e() {
        return j() ? Collections.emptyIterator() : this.f4197c ? new C0509x(this.f4195a.h().iterator()) : this.f4195a.h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0503q) {
            return this.f4195a.equals(((C0503q) obj).f4195a);
        }
        return false;
    }

    public int f() {
        int iK = this.f4195a.k();
        int iG = 0;
        for (int i3 = 0; i3 < iK; i3++) {
            iG += g(this.f4195a.j(i3));
        }
        Iterator it = this.f4195a.m().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public int h() {
        int iK = this.f4195a.k();
        int iD = 0;
        for (int i3 = 0; i3 < iK; i3++) {
            Map.Entry entryJ = this.f4195a.j(i3);
            AbstractC0527b.a(entryJ.getKey());
            iD += d(null, entryJ.getValue());
        }
        for (Map.Entry entry : this.f4195a.m()) {
            AbstractC0527b.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public int hashCode() {
        return this.f4195a.hashCode();
    }

    boolean j() {
        return this.f4195a.isEmpty();
    }

    public boolean k() {
        int iK = this.f4195a.k();
        for (int i3 = 0; i3 < iK; i3++) {
            if (!l(this.f4195a.j(i3))) {
                return false;
            }
        }
        Iterator it = this.f4195a.m().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return j() ? Collections.emptyIterator() : this.f4197c ? new C0509x(this.f4195a.entrySet().iterator()) : this.f4195a.entrySet().iterator();
    }

    public void o() {
        if (this.f4196b) {
            return;
        }
        int iK = this.f4195a.k();
        for (int i3 = 0; i3 < iK; i3++) {
            Map.Entry entryJ = this.f4195a.j(i3);
            if (entryJ.getValue() instanceof AbstractC0505t) {
                ((AbstractC0505t) entryJ.getValue()).D();
            }
        }
        this.f4195a.p();
        this.f4196b = true;
    }

    public void p(C0503q c0503q) {
        int iK = c0503q.f4195a.k();
        for (int i3 = 0; i3 < iK; i3++) {
            q(c0503q.f4195a.j(i3));
        }
        Iterator it = c0503q.f4195a.m().iterator();
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
        this.f4195a.r(bVar, obj);
    }

    private C0503q(b0 b0Var) {
        this.f4195a = b0Var;
        o();
    }

    private C0503q(boolean z2) {
        this(b0.q());
        o();
    }
}
