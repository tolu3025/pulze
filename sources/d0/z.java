package D0;

import J0.AbstractC0386b;
import J0.L;
import V0.C0423b;
import V0.I;
import V0.InterfaceC0424c;
import a1.C0473a;
import com.google.android.gms.common.api.a;
import com.google.firebase.firestore.C0727g;
import com.google.firebase.firestore.C0752t;
import com.google.firebase.firestore.X0;
import com.google.firebase.firestore.Z;
import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.e0;
import com.google.protobuf.t0;
import d0.AbstractC0813a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import k0.C1004r;
import kotlin.jvm.internal.C;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f1308a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f1309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I f1310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I f1311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final I f1312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final I f1313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final I f1314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final I f1315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final I f1316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final I f1317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final I f1318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final I f1319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final I f1320m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final I f1321n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final I f1322o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final I f1323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final I f1324q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final I f1325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final I f1326s;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1327a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Z1.e f1328b = new b(z.f1308a);

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: D0.z$a$a, reason: collision with other inner class name */
        public static final class EnumC0007a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final EnumC0007a f1329a = new EnumC0007a("LESS_THAN", 0);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final EnumC0007a f1330b = new EnumC0007a("EQUAL", 1);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final EnumC0007a f1331c = new EnumC0007a("GREATER_THAN", 2);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final EnumC0007a f1332d = new EnumC0007a("TYPE_MISMATCH", 3);

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ EnumC0007a[] f1333e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ O1.a f1334f;

            static {
                EnumC0007a[] enumC0007aArrC = c();
                f1333e = enumC0007aArrC;
                f1334f = O1.b.a(enumC0007aArrC);
            }

            private EnumC0007a(String str, int i3) {
            }

            private static final /* synthetic */ EnumC0007a[] c() {
                return new EnumC0007a[]{f1329a, f1330b, f1331c, f1332d};
            }

            public static EnumC0007a valueOf(String str) {
                return (EnumC0007a) Enum.valueOf(EnumC0007a.class, str);
            }

            public static EnumC0007a[] values() {
                return (EnumC0007a[]) f1333e.clone();
            }
        }

        /* synthetic */ class b extends kotlin.jvm.internal.k implements U1.p {
            b(Object obj) {
                super(2, obj, z.class, "compare", "compare(Lcom/google/firestore/v1/Value;Lcom/google/firestore/v1/Value;)I", 0);
            }

            @Override // U1.p
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(I i3, I i4) {
                return Integer.valueOf(z.j(i3, i4));
            }
        }

        private a() {
        }

        public final boolean a(I i3, I i4) {
            return z.N(i3, i4);
        }

        public final Z1.e b() {
            return f1328b;
        }

        public final EnumC0007a c(I i3, I i4) {
            if (i3 == null && i4 == null) {
                return EnumC0007a.f1330b;
            }
            if (i3 == null || i4 == null) {
                return EnumC0007a.f1332d;
            }
            int iF0 = z.f0(i3);
            if (iF0 != z.f0(i4)) {
                return EnumC0007a.f1332d;
            }
            int iM = z.f1308a.m(iF0, i3, i4);
            return iM < 0 ? EnumC0007a.f1329a : iM > 0 ? EnumC0007a.f1331c : EnumC0007a.f1330b;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1335a;

        static {
            int[] iArr = new int[I.c.values().length];
            try {
                iArr[I.c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I.c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I.c.INTEGER_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[I.c.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[I.c.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[I.c.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[I.c.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[I.c.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[I.c.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[I.c.ARRAY_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[I.c.MAP_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f1335a = iArr;
        }
    }

    static {
        AbstractC0806y abstractC0806yN = I.J0().B(Double.NaN).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        f1309b = (I) abstractC0806yN;
        AbstractC0806y abstractC0806yN2 = I.J0().I(e0.NULL_VALUE).n();
        kotlin.jvm.internal.m.d(abstractC0806yN2, "build(...)");
        I i3 = (I) abstractC0806yN2;
        f1310c = i3;
        f1311d = i3;
        AbstractC0806y abstractC0806yN3 = I.J0().L("__max__").n();
        kotlin.jvm.internal.m.d(abstractC0806yN3, "build(...)");
        I i4 = (I) abstractC0806yN3;
        f1312e = i4;
        AbstractC0806y abstractC0806yN4 = I.J0().G(V0.x.j0().y("__type__", i4)).n();
        kotlin.jvm.internal.m.d(abstractC0806yN4, "build(...)");
        f1313f = (I) abstractC0806yN4;
        AbstractC0806y abstractC0806yN5 = I.J0().L("__vector__").n();
        kotlin.jvm.internal.m.d(abstractC0806yN5, "build(...)");
        I i5 = (I) abstractC0806yN5;
        f1314g = i5;
        AbstractC0806y abstractC0806yN6 = I.J0().G(V0.x.j0().y("__type__", i5).y("value", (I) I.J0().x(C0423b.j0()).n())).n();
        kotlin.jvm.internal.m.d(abstractC0806yN6, "build(...)");
        f1315h = (I) abstractC0806yN6;
        AbstractC0806y abstractC0806yN7 = I.J0().z(false).n();
        kotlin.jvm.internal.m.d(abstractC0806yN7, "build(...)");
        f1316i = (I) abstractC0806yN7;
        AbstractC0806y abstractC0806yN8 = I.J0().B(Double.NaN).n();
        kotlin.jvm.internal.m.d(abstractC0806yN8, "build(...)");
        f1317j = (I) abstractC0806yN8;
        AbstractC0806y abstractC0806yN9 = I.J0().M(t0.f0().x(Long.MIN_VALUE)).n();
        kotlin.jvm.internal.m.d(abstractC0806yN9, "build(...)");
        f1318k = (I) abstractC0806yN9;
        AbstractC0806y abstractC0806yN10 = I.J0().L("").n();
        kotlin.jvm.internal.m.d(abstractC0806yN10, "build(...)");
        f1319l = (I) abstractC0806yN10;
        AbstractC0806y abstractC0806yN11 = I.J0().A(AbstractC0791i.f6770b).n();
        kotlin.jvm.internal.m.d(abstractC0806yN11, "build(...)");
        f1320m = (I) abstractC0806yN11;
        f EMPTY = f.f1258c;
        kotlin.jvm.internal.m.d(EMPTY, "EMPTY");
        l lVarG = l.g();
        kotlin.jvm.internal.m.d(lVarG, "empty(...)");
        f1321n = d0(EMPTY, lVarG);
        AbstractC0806y abstractC0806yN12 = I.J0().E(C0473a.f0().w(-90.0d).x(-180.0d)).n();
        kotlin.jvm.internal.m.d(abstractC0806yN12, "build(...)");
        f1322o = (I) abstractC0806yN12;
        AbstractC0806y abstractC0806yN13 = I.J0().y(C0423b.g0()).n();
        kotlin.jvm.internal.m.d(abstractC0806yN13, "build(...)");
        f1323p = (I) abstractC0806yN13;
        AbstractC0806y abstractC0806yN14 = I.J0().H(V0.x.b0()).n();
        kotlin.jvm.internal.m.d(abstractC0806yN14, "build(...)");
        f1324q = (I) abstractC0806yN14;
        AbstractC0806y abstractC0806yN15 = I.J0().z(true).n();
        kotlin.jvm.internal.m.d(abstractC0806yN15, "build(...)");
        f1325r = (I) abstractC0806yN15;
        AbstractC0806y abstractC0806yN16 = I.J0().z(false).n();
        kotlin.jvm.internal.m.d(abstractC0806yN16, "build(...)");
        f1326s = (I) abstractC0806yN16;
    }

    private z() {
    }

    public static final I A(C0752t docRef) {
        kotlin.jvm.internal.m.e(docRef, "docRef");
        AbstractC0806y abstractC0806yN = I.J0().K(docRef.q()).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }

    public static final I B(Z geoPoint) {
        kotlin.jvm.internal.m.e(geoPoint, "geoPoint");
        AbstractC0806y abstractC0806yN = I.J0().E(C0473a.f0().w(geoPoint.e()).x(geoPoint.g())).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }

    public static final I C(X0 vector) {
        kotlin.jvm.internal.m.e(vector, "vector");
        double[] dArrA = vector.a();
        kotlin.jvm.internal.m.d(dArrA, "toArray(...)");
        return M(dArrA);
    }

    public static final I D(t0 value) {
        kotlin.jvm.internal.m.e(value, "value");
        AbstractC0806y abstractC0806yN = I.J0().N(value).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }

    public static final I E(Iterable values) {
        kotlin.jvm.internal.m.e(values, "values");
        AbstractC0806y abstractC0806yN = I.J0().x(C0423b.j0().w(values)).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }

    public static final I F(Number value) {
        kotlin.jvm.internal.m.e(value, "value");
        if (value instanceof Long) {
            return x(value.longValue());
        }
        if (value instanceof Integer) {
            return w(value.intValue());
        }
        if (value instanceof Double) {
            return u(value.doubleValue());
        }
        if (value instanceof Float) {
            return v(value.floatValue());
        }
        throw new IllegalArgumentException("Unexpected number type: " + value);
    }

    public static final I G(String value) {
        kotlin.jvm.internal.m.e(value, "value");
        AbstractC0806y abstractC0806yN = I.J0().L(value).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }

    public static final I H(Date date) {
        kotlin.jvm.internal.m.e(date, "date");
        return J(new C1004r(date));
    }

    public static final I I(Map map) {
        kotlin.jvm.internal.m.e(map, "map");
        AbstractC0806y abstractC0806yN = I.J0().G(V0.x.j0().x(map)).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }

    public static final I J(C1004r timestamp) {
        kotlin.jvm.internal.m.e(timestamp, "timestamp");
        return D(e0(timestamp.l(), timestamp.i()));
    }

    public static final I K(boolean z2) {
        return z2 ? f1325r : f1326s;
    }

    public static final I L(byte[] value) {
        kotlin.jvm.internal.m.e(value, "value");
        AbstractC0806y abstractC0806yN = I.J0().A(AbstractC0791i.p(value)).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }

    public static final I M(double[] vector) {
        kotlin.jvm.internal.m.e(vector, "vector");
        C0423b.C0068b c0068bJ0 = C0423b.j0();
        for (double d3 : vector) {
            c0068bJ0.x(u(d3));
        }
        AbstractC0806y abstractC0806yN = I.J0().G(V0.x.j0().y("__type__", f1314g).y("value", (I) I.J0().x(c0068bJ0).n())).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }

    public static final boolean N(I i3, I i4) {
        int iF0;
        Object objA;
        Object objA2;
        if (i3 == i4) {
            return true;
        }
        if (i3 == null || i4 == null || (iF0 = f0(i3)) != f0(i4)) {
            return false;
        }
        if (iF0 == 3 || iF0 == 4) {
            return f1308a.b0(i3, i4);
        }
        if (iF0 != 6) {
            objA2 = i3;
            objA = i4;
            if (iF0 == Integer.MAX_VALUE) {
                return true;
            }
            switch (iF0) {
                case 15:
                    return f1308a.b(i3, i4);
                case 16:
                case I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    return f1308a.c0(i3, i4);
            }
        }
        objA2 = v.a(i3);
        objA = v.a(i4);
        return kotlin.jvm.internal.m.a(objA2, objA);
    }

    public static final I O(I value) {
        kotlin.jvm.internal.m.e(value, "value");
        I.c cVarB0 = value.B0();
        switch (cVarB0 == null ? -1 : b.f1335a[cVarB0.ordinal()]) {
            case 1:
                return f1310c;
            case 2:
                return f1316i;
            case 3:
            case 4:
                return f1317j;
            case 5:
                return f1318k;
            case 6:
                return f1319l;
            case 7:
                return f1320m;
            case 8:
                return f1321n;
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return f1322o;
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return f1323p;
            case 11:
                return Z(value) ? f1315h : f1324q;
            default:
                throw new IllegalArgumentException("Unknown value type: " + value.B0());
        }
    }

    public static final I P(I value) {
        kotlin.jvm.internal.m.e(value, "value");
        I.c cVarB0 = value.B0();
        switch (cVarB0 == null ? -1 : b.f1335a[cVarB0.ordinal()]) {
            case 1:
                return f1316i;
            case 2:
                return f1317j;
            case 3:
            case 4:
                return f1318k;
            case 5:
                return f1319l;
            case 6:
                return f1320m;
            case 7:
                return f1321n;
            case 8:
                return f1322o;
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return f1323p;
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return f1315h;
            case 11:
                return Z(value) ? f1324q : f1313f;
            default:
                throw new IllegalArgumentException("Unknown value type: " + value.B0());
        }
    }

    public static final boolean Q(I i3) {
        return i3 != null && i3.C0();
    }

    public static final boolean R(I i3) {
        return i3 != null && i3.D0();
    }

    public static final boolean S(I i3) {
        return i3 != null && i3.E0();
    }

    public static final boolean T(I i3) {
        return i3 != null && i3.F0();
    }

    public static final boolean U(I value) {
        kotlin.jvm.internal.m.e(value, "value");
        return kotlin.jvm.internal.m.a(f1312e, value.x0().d0().get("__type__"));
    }

    public static final boolean V(I i3) {
        return i3 != null && Double.isNaN(i3.s0());
    }

    public static final boolean W(I i3) {
        return i3 != null && i3.G0();
    }

    public static final boolean X(I i3) {
        return S(i3) || R(i3);
    }

    public static final boolean Y(I i3) {
        return i3 != null && i3.H0();
    }

    public static final boolean Z(I value) {
        kotlin.jvm.internal.m.e(value, "value");
        return kotlin.jvm.internal.m.a(f1314g, value.x0().d0().get("__type__"));
    }

    public static final int a0(I left, boolean z2, I right, boolean z3) {
        kotlin.jvm.internal.m.e(left, "left");
        kotlin.jvm.internal.m.e(right, "right");
        int iJ = j(left, right);
        if (iJ != 0) {
            return iJ;
        }
        if (!z2 || z3) {
            return (z2 || !z3) ? 0 : 1;
        }
        return -1;
    }

    private final boolean b(I i3, I i4) {
        C0423b c0423bO0 = i3.o0();
        C0423b c0423bO02 = i4.o0();
        if (c0423bO0.i0() != c0423bO02.i0()) {
            return false;
        }
        int iI0 = c0423bO0.i0();
        for (int i5 = 0; i5 < iI0; i5++) {
            if (!N(c0423bO0.h0(i5), c0423bO02.h0(i5))) {
                return false;
            }
        }
        return true;
    }

    private final boolean b0(I i3, I i4) {
        int i5;
        I.c cVarB0 = i3.B0();
        int i6 = cVarB0 == null ? -1 : b.f1335a[cVarB0.ordinal()];
        if (i6 == 3) {
            I.c cVarB02 = i4.B0();
            i5 = cVarB02 != null ? b.f1335a[cVarB02.ordinal()] : -1;
            if (i5 != 3) {
                if (i5 == 4 && AbstractC0813a.a(i4.s0(), i3.w0()) == 0) {
                    return true;
                }
            } else if (i3.w0() == i4.w0()) {
                return true;
            }
        } else if (i6 == 4) {
            I.c cVarB03 = i4.B0();
            i5 = cVarB03 != null ? b.f1335a[cVarB03.ordinal()] : -1;
            if (i5 != 3) {
                if (i5 == 4 && AbstractC0813a.b(i3.s0(), i4.s0()) == 0) {
                    return true;
                }
            } else if (AbstractC0813a.a(i3.s0(), i4.w0()) == 0) {
                return true;
            }
        }
        return false;
    }

    public static final String c(I value) {
        kotlin.jvm.internal.m.e(value, "value");
        StringBuilder sb = new StringBuilder();
        f1308a.i(sb, value);
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    private final boolean c0(I i3, I i4) {
        V0.x xVarX0 = i3.x0();
        V0.x xVarX02 = i4.x0();
        if (xVarX0.c0() != xVarX02.c0()) {
            return false;
        }
        Map mapD0 = xVarX0.d0();
        kotlin.jvm.internal.m.d(mapD0, "getFieldsMap(...)");
        for (Map.Entry entry : mapD0.entrySet()) {
            String str = (String) entry.getKey();
            I i5 = (I) entry.getValue();
            I i6 = (I) xVarX02.d0().get(str);
            if (i6 == null || !N(i5, i6)) {
                return false;
            }
        }
        return true;
    }

    private final void d(StringBuilder sb, C0423b c0423b) {
        sb.append("[");
        if (c0423b.i0() > 0) {
            I iH0 = c0423b.h0(0);
            kotlin.jvm.internal.m.d(iH0, "getValues(...)");
            i(sb, iH0);
            int iI0 = c0423b.i0();
            for (int i3 = 1; i3 < iI0; i3++) {
                sb.append(",");
                I iH02 = c0423b.h0(i3);
                kotlin.jvm.internal.m.d(iH02, "getValues(...)");
                i(sb, iH02);
            }
        }
        sb.append("]");
    }

    public static final I d0(f databaseId, l key) {
        kotlin.jvm.internal.m.e(databaseId, "databaseId");
        kotlin.jvm.internal.m.e(key, "key");
        I.b bVarJ0 = I.J0();
        C c3 = C.f9726a;
        String str = String.format("projects/%s/databases/%s/documents/%s", Arrays.copyOf(new Object[]{databaseId.i(), databaseId.h(), key.toString()}, 3));
        kotlin.jvm.internal.m.d(str, "format(...)");
        I i3 = (I) bVarJ0.K(str).n();
        kotlin.jvm.internal.m.b(i3);
        return i3;
    }

    private final void e(StringBuilder sb, C0473a c0473a) {
        C c3 = C.f9726a;
        String str = String.format("geo(%s,%s)", Arrays.copyOf(new Object[]{Double.valueOf(c0473a.d0()), Double.valueOf(c0473a.e0())}, 2));
        kotlin.jvm.internal.m.d(str, "format(...)");
        sb.append(str);
    }

    public static final t0 e0(long j3, int i3) {
        f1308a.h0(j3, i3);
        AbstractC0806y abstractC0806yN = t0.f0().x(j3).w((i3 / 1000) * 1000).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (t0) abstractC0806yN;
    }

    private final void f(StringBuilder sb, V0.x xVar) {
        ArrayList arrayList = new ArrayList(xVar.d0().keySet());
        J1.t.p(arrayList);
        sb.append("{");
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(":");
            I iF0 = xVar.f0(str);
            kotlin.jvm.internal.m.d(iF0, "getFieldsOrThrow(...)");
            i(sb, iF0);
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        sb.append("}");
    }

    public static final int f0(I i3) {
        I.c cVarB0 = i3 != null ? i3.B0() : null;
        switch (cVarB0 == null ? -1 : b.f1335a[cVarB0.ordinal()]) {
            case -1:
            case 1:
                return 0;
            case 0:
            default:
                throw AbstractC0386b.a("Invalid value type: " + i3.B0(), new Object[0]);
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return Double.isNaN(i3.s0()) ? 3 : 4;
            case 5:
                return 5;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 10;
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return 13;
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return 15;
            case 11:
                if (v.c(i3)) {
                    return 6;
                }
                return U(i3) ? a.e.API_PRIORITY_OTHER : Z(i3) ? 16 : 17;
        }
    }

    private final void g(StringBuilder sb, I i3) {
        AbstractC0386b.d(Y(i3), "Value should be a ReferenceValue", new Object[0]);
        sb.append(l.i(i3.y0()));
    }

    public static final int g0(I left, boolean z2, I right, boolean z3) {
        kotlin.jvm.internal.m.e(left, "left");
        kotlin.jvm.internal.m.e(right, "right");
        int iJ = j(left, right);
        if (iJ != 0) {
            return iJ;
        }
        if (!z2 || z3) {
            return (z2 || !z3) ? 0 : -1;
        }
        return 1;
    }

    private final void h(StringBuilder sb, t0 t0Var) {
        C c3 = C.f9726a;
        String str = String.format("time(%s,%s)", Arrays.copyOf(new Object[]{Long.valueOf(t0Var.e0()), Integer.valueOf(t0Var.d0())}, 2));
        kotlin.jvm.internal.m.d(str, "format(...)");
        sb.append(str);
    }

    private final void h0(long j3, int i3) {
        if (i3 < 0 || i3 >= 1000000000) {
            throw new IllegalArgumentException(("Timestamp nanoseconds out of range: " + i3).toString());
        }
        if (-62135596800L > j3 || j3 >= 253402300800L) {
            throw new IllegalArgumentException(("Timestamp seconds out of range: " + j3).toString());
        }
    }

    private final void i(StringBuilder sb, I i3) {
        String strZ0;
        I.c cVarB0 = i3.B0();
        switch (cVarB0 == null ? -1 : b.f1335a[cVarB0.ordinal()]) {
            case 1:
                strZ0 = "null";
                sb.append(strZ0);
                return;
            case 2:
                sb.append(i3.p0());
                return;
            case 3:
                sb.append(i3.w0());
                return;
            case 4:
                sb.append(i3.s0());
                return;
            case 5:
                t0 t0VarA0 = i3.A0();
                kotlin.jvm.internal.m.d(t0VarA0, "getTimestampValue(...)");
                h(sb, t0VarA0);
                I1.u uVar = I1.u.f2419a;
                return;
            case 6:
                strZ0 = i3.z0();
                sb.append(strZ0);
                return;
            case 7:
                strZ0 = L.v(i3.q0());
                sb.append(strZ0);
                return;
            case 8:
                g(sb, i3);
                I1.u uVar2 = I1.u.f2419a;
                return;
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                C0473a c0473aV0 = i3.v0();
                kotlin.jvm.internal.m.d(c0473aV0, "getGeoPointValue(...)");
                e(sb, c0473aV0);
                I1.u uVar22 = I1.u.f2419a;
                return;
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                C0423b c0423bO0 = i3.o0();
                kotlin.jvm.internal.m.d(c0423bO0, "getArrayValue(...)");
                d(sb, c0423bO0);
                I1.u uVar222 = I1.u.f2419a;
                return;
            case 11:
                V0.x xVarX0 = i3.x0();
                kotlin.jvm.internal.m.d(xVarX0, "getMapValue(...)");
                f(sb, xVarX0);
                I1.u uVar2222 = I1.u.f2419a;
                return;
            default:
                throw AbstractC0386b.a("Invalid value type: " + i3.B0(), new Object[0]);
        }
    }

    public static final int j(I i3, I i4) {
        int iF0 = f0(i3);
        int iF02 = f0(i4);
        if (iF0 != iF02) {
            return kotlin.jvm.internal.m.f(iF0, iF02);
        }
        z zVar = f1308a;
        if (i3 == null) {
            i3 = f1310c;
        }
        if (i4 == null) {
            i4 = f1310c;
        }
        return zVar.m(iF0, i3, i4);
    }

    private final int k(C0423b c0423b, C0423b c0423b2) {
        int iMin = (int) Math.min(c0423b.i0(), c0423b2.i0());
        for (int i3 = 0; i3 < iMin; i3++) {
            int iJ = j(c0423b.h0(i3), c0423b2.h0(i3));
            if (iJ != 0) {
                return iJ;
            }
        }
        return kotlin.jvm.internal.m.f(c0423b.i0(), c0423b2.i0());
    }

    private final int l(C0473a c0473a, C0473a c0473a2) {
        int iB = AbstractC0813a.b(c0473a.d0(), c0473a2.d0());
        return iB == 0 ? AbstractC0813a.b(c0473a.e0(), c0473a2.e0()) : iB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m(int i3, I i4, I i5) {
        t0 t0VarA0;
        String str;
        t0 t0VarA02;
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 10) {
            String strY0 = i4.y0();
            kotlin.jvm.internal.m.d(strY0, "getReferenceValue(...)");
            String strY02 = i5.y0();
            kotlin.jvm.internal.m.d(strY02, "getReferenceValue(...)");
            return p(strY0, strY02);
        }
        if (i3 == 13) {
            C0473a c0473aV0 = i4.v0();
            kotlin.jvm.internal.m.d(c0473aV0, "getGeoPointValue(...)");
            C0473a c0473aV02 = i5.v0();
            kotlin.jvm.internal.m.d(c0473aV02, "getGeoPointValue(...)");
            return l(c0473aV0, c0473aV02);
        }
        if (i3 == Integer.MAX_VALUE) {
            return 0;
        }
        switch (i3) {
            case 2:
                return Boolean.compare(i4.p0(), i5.p0());
            case 3:
                return 0;
            case 4:
                return o(i4, i5);
            case 5:
                t0VarA0 = i4.A0();
                str = "getTimestampValue(...)";
                kotlin.jvm.internal.m.d(t0VarA0, "getTimestampValue(...)");
                t0VarA02 = i5.A0();
                break;
            case 6:
                t0VarA0 = v.a(i4);
                str = "getLocalWriteTime(...)";
                kotlin.jvm.internal.m.d(t0VarA0, "getLocalWriteTime(...)");
                t0VarA02 = v.a(i5);
                break;
            case 7:
                return L.i(i4.z0(), i5.z0());
            case 8:
                return L.h(i4.q0(), i5.q0());
            default:
                switch (i3) {
                    case 15:
                        C0423b c0423bO0 = i4.o0();
                        kotlin.jvm.internal.m.d(c0423bO0, "getArrayValue(...)");
                        C0423b c0423bO02 = i5.o0();
                        kotlin.jvm.internal.m.d(c0423bO02, "getArrayValue(...)");
                        return k(c0423bO0, c0423bO02);
                    case 16:
                        V0.x xVarX0 = i4.x0();
                        kotlin.jvm.internal.m.d(xVarX0, "getMapValue(...)");
                        V0.x xVarX02 = i5.x0();
                        kotlin.jvm.internal.m.d(xVarX02, "getMapValue(...)");
                        return r(xVarX0, xVarX02);
                    case I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        V0.x xVarX03 = i4.x0();
                        kotlin.jvm.internal.m.d(xVarX03, "getMapValue(...)");
                        V0.x xVarX04 = i5.x0();
                        kotlin.jvm.internal.m.d(xVarX04, "getMapValue(...)");
                        return n(xVarX03, xVarX04);
                    default:
                        throw AbstractC0386b.a("Invalid value type: " + i3, new Object[0]);
                }
        }
        kotlin.jvm.internal.m.d(t0VarA02, str);
        return q(t0VarA0, t0VarA02);
    }

    private final int n(V0.x xVar, V0.x xVar2) {
        Iterator it = new TreeMap(xVar.d0()).entrySet().iterator();
        Iterator it2 = new TreeMap(xVar2.d0()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int i3 = L.i((String) entry.getKey(), (String) entry2.getKey());
            if (i3 != 0) {
                return i3;
            }
            int iJ = j((I) entry.getValue(), (I) entry2.getValue());
            if (iJ != 0) {
                return iJ;
            }
        }
        return Boolean.compare(it.hasNext(), it2.hasNext());
    }

    private final int o(I i3, I i4) {
        if (i3.D0()) {
            if (i4.D0()) {
                return AbstractC0813a.b(i3.s0(), i4.s0());
            }
            if (i4.E0()) {
                return AbstractC0813a.a(i3.s0(), i4.w0());
            }
        } else if (i3.E0()) {
            if (i4.E0()) {
                return Long.compare(i3.w0(), i4.w0());
            }
            if (i4.D0()) {
                return AbstractC0813a.a(i4.s0(), i3.w0()) * (-1);
            }
        }
        throw AbstractC0386b.a("Unexpected values: %s vs %s", i3, i4);
    }

    private final int p(String str, String str2) {
        String[] strArr = (String[]) new b2.e("/").b(str, 0).toArray(new String[0]);
        String[] strArr2 = (String[]) new b2.e("/").b(str2, 0).toArray(new String[0]);
        int iMin = (int) Math.min(strArr.length, strArr2.length);
        for (int i3 = 0; i3 < iMin; i3++) {
            int iCompareTo = strArr[i3].compareTo(strArr2[i3]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return kotlin.jvm.internal.m.f(strArr.length, strArr2.length);
    }

    private final int q(t0 t0Var, t0 t0Var2) {
        int iG = kotlin.jvm.internal.m.g(t0Var.e0(), t0Var2.e0());
        return iG != 0 ? iG : kotlin.jvm.internal.m.f(t0Var.d0(), t0Var2.d0());
    }

    private final int r(V0.x xVar, V0.x xVar2) {
        Map mapD0 = xVar.d0();
        Map mapD02 = xVar2.d0();
        Object obj = mapD0.get("value");
        kotlin.jvm.internal.m.b(obj);
        C0423b c0423bO0 = ((I) obj).o0();
        Object obj2 = mapD02.get("value");
        kotlin.jvm.internal.m.b(obj2);
        C0423b c0423bO02 = ((I) obj2).o0();
        int iF = kotlin.jvm.internal.m.f(c0423bO0.i0(), c0423bO02.i0());
        if (iF != 0) {
            return iF;
        }
        kotlin.jvm.internal.m.b(c0423bO0);
        kotlin.jvm.internal.m.b(c0423bO02);
        return k(c0423bO0, c0423bO02);
    }

    public static final boolean s(InterfaceC0424c haystack, I i3) {
        kotlin.jvm.internal.m.e(haystack, "haystack");
        Iterator it = haystack.g().iterator();
        while (it.hasNext()) {
            if (N((I) it.next(), i3)) {
                return true;
            }
        }
        return false;
    }

    public static final I t(Object obj) {
        if (obj == null) {
            return f1310c;
        }
        if (obj instanceof String) {
            return G((String) obj);
        }
        if (obj instanceof Number) {
            return F((Number) obj);
        }
        if (obj instanceof Date) {
            return H((Date) obj);
        }
        if (obj instanceof C1004r) {
            return J((C1004r) obj);
        }
        if (obj instanceof Boolean) {
            return K(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Z) {
            return B((Z) obj);
        }
        if (obj instanceof C0727g) {
            return z((C0727g) obj);
        }
        if (obj instanceof X0) {
            return C((X0) obj);
        }
        throw new IllegalArgumentException("Unexpected type: " + obj);
    }

    public static final I u(double d3) {
        AbstractC0806y abstractC0806yN = I.J0().B(d3).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }

    public static final I v(float f3) {
        AbstractC0806y abstractC0806yN = I.J0().B(f3).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }

    public static final I w(int i3) {
        AbstractC0806y abstractC0806yN = I.J0().F(i3).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }

    public static final I x(long j3) {
        AbstractC0806y abstractC0806yN = I.J0().F(j3).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }

    public static final I y(u value) {
        kotlin.jvm.internal.m.e(value, "value");
        AbstractC0806y abstractC0806yN = I.J0().K('/' + value.n()).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }

    public static final I z(C0727g value) {
        kotlin.jvm.internal.m.e(value, "value");
        AbstractC0806y abstractC0806yN = I.J0().A(value.h()).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (I) abstractC0806yN;
    }
}
