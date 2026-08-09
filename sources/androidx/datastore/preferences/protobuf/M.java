package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0506u;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.l0;
import c.AbstractC0527b;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class M implements Y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f3998r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f3999s = i0.A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f4000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f4001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final J f4004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f4005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f4006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final T f4007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f4008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f4009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f4010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f4011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final O f4012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0510y f4013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final f0 f4014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AbstractC0500n f4015p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final E f4016q;

    private M(int[] iArr, Object[] objArr, int i3, int i4, J j3, T t2, boolean z2, int[] iArr2, int i5, int i6, O o2, InterfaceC0510y interfaceC0510y, f0 f0Var, AbstractC0500n abstractC0500n, E e3) {
        this.f4000a = iArr;
        this.f4001b = objArr;
        this.f4002c = i3;
        this.f4003d = i4;
        this.f4006g = j3 instanceof AbstractC0505t;
        this.f4007h = t2;
        this.f4005f = abstractC0500n != null && abstractC0500n.e(j3);
        this.f4008i = z2;
        this.f4009j = iArr2;
        this.f4010k = i5;
        this.f4011l = i6;
        this.f4012m = o2;
        this.f4013n = interfaceC0510y;
        this.f4014o = f0Var;
        this.f4015p = abstractC0500n;
        this.f4004e = j3;
        this.f4016q = e3;
    }

    private boolean A(Object obj, int i3, int i4) {
        Map mapG = this.f4016q.g(i0.z(obj, R(i3)));
        if (mapG.isEmpty()) {
            return true;
        }
        if (this.f4016q.f(r(i4)).f3991c.c() != k0.c.MESSAGE) {
            return true;
        }
        Y yC = null;
        for (Object obj2 : mapG.values()) {
            if (yC == null) {
                yC = U.a().c(obj2.getClass());
            }
            if (!yC.c(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean B(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0505t) {
            return ((AbstractC0505t) obj).C();
        }
        return true;
    }

    private boolean C(Object obj, Object obj2, int i3) {
        long jY = Y(i3) & 1048575;
        return i0.w(obj, jY) == i0.w(obj2, jY);
    }

    private boolean D(Object obj, int i3, int i4) {
        return i0.w(obj, (long) (Y(i4) & 1048575)) == i3;
    }

    private static boolean E(int i3) {
        return (i3 & 268435456) != 0;
    }

    private static long F(Object obj, long j3) {
        return i0.x(obj, j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
    
        r0 = r19.f4010k;
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        if (r0 >= r19.f4011l) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
    
        r5 = o(r22, r19.f4009j[r0], r5, r20, r22);
        r0 = r0 + 1;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        if (r5 == null) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
    
        r7.o(r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0566 A[Catch: all -> 0x025f, TRY_LEAVE, TryCatch #10 {all -> 0x025f, blocks: (B:179:0x0560, B:181:0x0566, B:191:0x058f, B:110:0x025a, B:113:0x0262, B:114:0x026e, B:115:0x0273, B:116:0x027f, B:117:0x0284, B:118:0x0290, B:119:0x0295, B:120:0x02a1, B:121:0x02a6, B:122:0x02b8, B:123:0x02c7, B:124:0x02d3, B:125:0x02d8, B:126:0x02e4, B:127:0x02e9, B:128:0x02f5, B:129:0x02fa, B:130:0x0306, B:131:0x030b, B:132:0x0317, B:133:0x031c, B:134:0x0328, B:135:0x032d, B:136:0x0339, B:137:0x033e, B:138:0x034a, B:139:0x034f, B:140:0x035b, B:141:0x0360, B:142:0x036e, B:143:0x037c, B:144:0x038a, B:145:0x0398, B:146:0x03ac, B:147:0x03ba, B:148:0x03cb, B:149:0x03df, B:150:0x03e6, B:151:0x03f4, B:152:0x0402, B:153:0x0410, B:154:0x041e, B:155:0x042c, B:156:0x043a, B:157:0x0448, B:158:0x0456, B:159:0x0465, B:160:0x046a, B:161:0x0477, B:162:0x047c, B:163:0x048a, B:164:0x0498, B:165:0x04a6, B:166:0x04b7, B:167:0x04c5, B:168:0x04d3, B:169:0x04e3, B:170:0x04e9, B:171:0x04f7, B:172:0x0506, B:173:0x0515, B:174:0x0524, B:175:0x0533, B:176:0x0542, B:177:0x0551), top: B:234:0x0560 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05cf A[LOOP:4: B:208:0x05cb->B:210:0x05cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void G(androidx.datastore.preferences.protobuf.f0 r20, androidx.datastore.preferences.protobuf.AbstractC0500n r21, java.lang.Object r22, androidx.datastore.preferences.protobuf.X r23, androidx.datastore.preferences.protobuf.C0499m r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.G(androidx.datastore.preferences.protobuf.f0, androidx.datastore.preferences.protobuf.n, java.lang.Object, androidx.datastore.preferences.protobuf.X, androidx.datastore.preferences.protobuf.m):void");
    }

    private final void H(Object obj, int i3, Object obj2, C0499m c0499m, X x2) {
        long jR = R(k0(i3));
        Object objZ = i0.z(obj, jR);
        if (objZ == null) {
            objZ = this.f4016q.b(obj2);
            i0.O(obj, jR, objZ);
        } else if (this.f4016q.d(objZ)) {
            Object objB = this.f4016q.b(obj2);
            this.f4016q.a(objB, objZ);
            i0.O(obj, jR, objB);
            objZ = objB;
        }
        x2.J(this.f4016q.h(objZ), this.f4016q.f(obj2), c0499m);
    }

    private void I(Object obj, Object obj2, int i3) {
        if (w(obj2, i3)) {
            long jR = R(k0(i3));
            Unsafe unsafe = f3999s;
            Object object = unsafe.getObject(obj2, jR);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + Q(i3) + " is present but null: " + obj2);
            }
            Y yS = s(i3);
            if (!w(obj, i3)) {
                if (B(object)) {
                    Object objF = yS.f();
                    yS.a(objF, object);
                    unsafe.putObject(obj, jR, objF);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                e0(obj, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!B(object2)) {
                Object objF2 = yS.f();
                yS.a(objF2, object2);
                unsafe.putObject(obj, jR, objF2);
                object2 = objF2;
            }
            yS.a(object2, object);
        }
    }

    private void J(Object obj, Object obj2, int i3) {
        int iQ = Q(i3);
        if (D(obj2, iQ, i3)) {
            long jR = R(k0(i3));
            Unsafe unsafe = f3999s;
            Object object = unsafe.getObject(obj2, jR);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + Q(i3) + " is present but null: " + obj2);
            }
            Y yS = s(i3);
            if (!D(obj, iQ, i3)) {
                if (B(object)) {
                    Object objF = yS.f();
                    yS.a(objF, object);
                    unsafe.putObject(obj, jR, objF);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                f0(obj, iQ, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!B(object2)) {
                Object objF2 = yS.f();
                yS.a(objF2, object2);
                unsafe.putObject(obj, jR, objF2);
                object2 = objF2;
            }
            yS.a(object2, object);
        }
    }

    private void K(Object obj, Object obj2, int i3) {
        int iK0 = k0(i3);
        long jR = R(iK0);
        int iQ = Q(i3);
        switch (j0(iK0)) {
            case 0:
                if (w(obj2, i3)) {
                    i0.K(obj, jR, i0.u(obj2, jR));
                    e0(obj, i3);
                }
                break;
            case 1:
                if (w(obj2, i3)) {
                    i0.L(obj, jR, i0.v(obj2, jR));
                    e0(obj, i3);
                }
                break;
            case 2:
                if (!w(obj2, i3)) {
                }
                i0.N(obj, jR, i0.x(obj2, jR));
                e0(obj, i3);
                break;
            case 3:
                if (!w(obj2, i3)) {
                }
                i0.N(obj, jR, i0.x(obj2, jR));
                e0(obj, i3);
                break;
            case 4:
                if (!w(obj2, i3)) {
                }
                i0.M(obj, jR, i0.w(obj2, jR));
                e0(obj, i3);
                break;
            case 5:
                if (!w(obj2, i3)) {
                }
                i0.N(obj, jR, i0.x(obj2, jR));
                e0(obj, i3);
                break;
            case 6:
                if (!w(obj2, i3)) {
                }
                i0.M(obj, jR, i0.w(obj2, jR));
                e0(obj, i3);
                break;
            case 7:
                if (w(obj2, i3)) {
                    i0.E(obj, jR, i0.p(obj2, jR));
                    e0(obj, i3);
                }
                break;
            case 8:
                if (!w(obj2, i3)) {
                }
                i0.O(obj, jR, i0.z(obj2, jR));
                e0(obj, i3);
                break;
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                I(obj, obj2, i3);
                break;
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                if (!w(obj2, i3)) {
                }
                i0.O(obj, jR, i0.z(obj2, jR));
                e0(obj, i3);
                break;
            case 11:
                if (!w(obj2, i3)) {
                }
                i0.M(obj, jR, i0.w(obj2, jR));
                e0(obj, i3);
                break;
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (!w(obj2, i3)) {
                }
                i0.M(obj, jR, i0.w(obj2, jR));
                e0(obj, i3);
                break;
            case 13:
                if (!w(obj2, i3)) {
                }
                i0.M(obj, jR, i0.w(obj2, jR));
                e0(obj, i3);
                break;
            case 14:
                if (!w(obj2, i3)) {
                }
                i0.N(obj, jR, i0.x(obj2, jR));
                e0(obj, i3);
                break;
            case 15:
                if (!w(obj2, i3)) {
                }
                i0.M(obj, jR, i0.w(obj2, jR));
                e0(obj, i3);
                break;
            case 16:
                if (!w(obj2, i3)) {
                }
                i0.N(obj, jR, i0.x(obj2, jR));
                e0(obj, i3);
                break;
            case V0.I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case V0.I.FIELD_REFERENCE_VALUE_FIELD_NUMBER /* 19 */:
            case V0.I.FUNCTION_VALUE_FIELD_NUMBER /* 20 */:
            case V0.I.PIPELINE_VALUE_FIELD_NUMBER /* 21 */:
            case V0.I.VARIABLE_REFERENCE_VALUE_FIELD_NUMBER /* 22 */:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f4013n.c(obj, obj2, jR);
                break;
            case 50:
                a0.E(this.f4016q, obj, obj2, jR);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (!D(obj2, iQ, i3)) {
                }
                i0.O(obj, jR, i0.z(obj2, jR));
                f0(obj, iQ, i3);
                break;
            case 60:
            case 68:
                J(obj, obj2, i3);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!D(obj2, iQ, i3)) {
                }
                i0.O(obj, jR, i0.z(obj2, jR));
                f0(obj, iQ, i3);
                break;
        }
    }

    private Object L(Object obj, int i3) {
        Y yS = s(i3);
        long jR = R(k0(i3));
        if (!w(obj, i3)) {
            return yS.f();
        }
        Object object = f3999s.getObject(obj, jR);
        if (B(object)) {
            return object;
        }
        Object objF = yS.f();
        if (object != null) {
            yS.a(objF, object);
        }
        return objF;
    }

    private Object M(Object obj, int i3, int i4) {
        Y yS = s(i4);
        if (!D(obj, i3, i4)) {
            return yS.f();
        }
        Object object = f3999s.getObject(obj, R(k0(i4)));
        if (B(object)) {
            return object;
        }
        Object objF = yS.f();
        if (object != null) {
            yS.a(objF, object);
        }
        return objF;
    }

    static M N(Class cls, H h3, O o2, InterfaceC0510y interfaceC0510y, f0 f0Var, AbstractC0500n abstractC0500n, E e3) {
        if (h3 instanceof W) {
            return P((W) h3, o2, interfaceC0510y, f0Var, abstractC0500n, e3);
        }
        AbstractC0527b.a(h3);
        return O(null, o2, interfaceC0510y, f0Var, abstractC0500n, e3);
    }

    static M O(c0 c0Var, O o2, InterfaceC0510y interfaceC0510y, f0 f0Var, AbstractC0500n abstractC0500n, E e3) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.datastore.preferences.protobuf.M P(androidx.datastore.preferences.protobuf.W r31, androidx.datastore.preferences.protobuf.O r32, androidx.datastore.preferences.protobuf.InterfaceC0510y r33, androidx.datastore.preferences.protobuf.f0 r34, androidx.datastore.preferences.protobuf.AbstractC0500n r35, androidx.datastore.preferences.protobuf.E r36) {
        /*
            Method dump skipped, instruction units count: 993
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.P(androidx.datastore.preferences.protobuf.W, androidx.datastore.preferences.protobuf.O, androidx.datastore.preferences.protobuf.y, androidx.datastore.preferences.protobuf.f0, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.E):androidx.datastore.preferences.protobuf.M");
    }

    private int Q(int i3) {
        return this.f4000a[i3];
    }

    private static long R(int i3) {
        return i3 & 1048575;
    }

    private static boolean S(Object obj, long j3) {
        return ((Boolean) i0.z(obj, j3)).booleanValue();
    }

    private static double T(Object obj, long j3) {
        return ((Double) i0.z(obj, j3)).doubleValue();
    }

    private static float U(Object obj, long j3) {
        return ((Float) i0.z(obj, j3)).floatValue();
    }

    private static int V(Object obj, long j3) {
        return ((Integer) i0.z(obj, j3)).intValue();
    }

    private static long W(Object obj, long j3) {
        return ((Long) i0.z(obj, j3)).longValue();
    }

    private int X(int i3) {
        if (i3 < this.f4002c || i3 > this.f4003d) {
            return -1;
        }
        return g0(i3, 0);
    }

    private int Y(int i3) {
        return this.f4000a[i3 + 2];
    }

    private void Z(Object obj, long j3, X x2, Y y2, C0499m c0499m) {
        x2.L(this.f4013n.b(obj, j3), y2, c0499m);
    }

    private void a0(Object obj, int i3, X x2, Y y2, C0499m c0499m) {
        x2.M(this.f4013n.b(obj, R(i3)), y2, c0499m);
    }

    private void b0(Object obj, int i3, X x2) {
        long jR;
        Object objU;
        if (v(i3)) {
            jR = R(i3);
            objU = x2.F();
        } else if (this.f4006g) {
            jR = R(i3);
            objU = x2.m();
        } else {
            jR = R(i3);
            objU = x2.u();
        }
        i0.O(obj, jR, objU);
    }

    private void c0(Object obj, int i3, X x2) {
        if (v(i3)) {
            x2.t(this.f4013n.b(obj, R(i3)));
        } else {
            x2.q(this.f4013n.b(obj, R(i3)));
        }
    }

    private static Field d0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void e0(Object obj, int i3) {
        int iY = Y(i3);
        long j3 = 1048575 & iY;
        if (j3 == 1048575) {
            return;
        }
        i0.M(obj, j3, (1 << (iY >>> 20)) | i0.w(obj, j3));
    }

    private void f0(Object obj, int i3, int i4) {
        i0.M(obj, Y(i4) & 1048575, i3);
    }

    private int g0(int i3, int i4) {
        int length = (this.f4000a.length / 3) - 1;
        while (i4 <= length) {
            int i5 = (length + i4) >>> 1;
            int i6 = i5 * 3;
            int iQ = Q(i6);
            if (i3 == iQ) {
                return i6;
            }
            if (i3 < iQ) {
                length = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        return -1;
    }

    private void h0(Object obj, int i3, Object obj2) {
        f3999s.putObject(obj, R(k0(i3)), obj2);
        e0(obj, i3);
    }

    private void i0(Object obj, int i3, int i4, Object obj2) {
        f3999s.putObject(obj, R(k0(i4)), obj2);
        f0(obj, i3, i4);
    }

    private boolean j(Object obj, Object obj2, int i3) {
        return w(obj, i3) == w(obj2, i3);
    }

    private static int j0(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    private static boolean k(Object obj, long j3) {
        return i0.p(obj, j3);
    }

    private int k0(int i3) {
        return this.f4000a[i3 + 1];
    }

    private static void l(Object obj) {
        if (B(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void l0(java.lang.Object r22, androidx.datastore.preferences.protobuf.l0 r23) {
        /*
            Method dump skipped, instruction units count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.l0(java.lang.Object, androidx.datastore.preferences.protobuf.l0):void");
    }

    private static double m(Object obj, long j3) {
        return i0.u(obj, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m0(java.lang.Object r11, androidx.datastore.preferences.protobuf.l0 r12) {
        /*
            Method dump skipped, instruction units count: 1498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.m0(java.lang.Object, androidx.datastore.preferences.protobuf.l0):void");
    }

    private boolean n(Object obj, Object obj2, int i3) {
        int iK0 = k0(i3);
        long jR = R(iK0);
        switch (j0(iK0)) {
            case 0:
                if (j(obj, obj2, i3) && Double.doubleToLongBits(i0.u(obj, jR)) == Double.doubleToLongBits(i0.u(obj2, jR))) {
                    break;
                }
                break;
            case 1:
                if (j(obj, obj2, i3) && Float.floatToIntBits(i0.v(obj, jR)) == Float.floatToIntBits(i0.v(obj2, jR))) {
                    break;
                }
                break;
            case 2:
                if (j(obj, obj2, i3) && i0.x(obj, jR) == i0.x(obj2, jR)) {
                    break;
                }
                break;
            case 3:
                if (j(obj, obj2, i3) && i0.x(obj, jR) == i0.x(obj2, jR)) {
                    break;
                }
                break;
            case 4:
                if (j(obj, obj2, i3) && i0.w(obj, jR) == i0.w(obj2, jR)) {
                    break;
                }
                break;
            case 5:
                if (j(obj, obj2, i3) && i0.x(obj, jR) == i0.x(obj2, jR)) {
                    break;
                }
                break;
            case 6:
                if (j(obj, obj2, i3) && i0.w(obj, jR) == i0.w(obj2, jR)) {
                    break;
                }
                break;
            case 7:
                if (j(obj, obj2, i3) && i0.p(obj, jR) == i0.p(obj2, jR)) {
                    break;
                }
                break;
            case 8:
                if (j(obj, obj2, i3) && a0.H(i0.z(obj, jR), i0.z(obj2, jR))) {
                    break;
                }
                break;
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                if (j(obj, obj2, i3) && a0.H(i0.z(obj, jR), i0.z(obj2, jR))) {
                    break;
                }
                break;
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                if (j(obj, obj2, i3) && a0.H(i0.z(obj, jR), i0.z(obj2, jR))) {
                    break;
                }
                break;
            case 11:
                if (j(obj, obj2, i3) && i0.w(obj, jR) == i0.w(obj2, jR)) {
                    break;
                }
                break;
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (j(obj, obj2, i3) && i0.w(obj, jR) == i0.w(obj2, jR)) {
                    break;
                }
                break;
            case 13:
                if (j(obj, obj2, i3) && i0.w(obj, jR) == i0.w(obj2, jR)) {
                    break;
                }
                break;
            case 14:
                if (j(obj, obj2, i3) && i0.x(obj, jR) == i0.x(obj2, jR)) {
                    break;
                }
                break;
            case 15:
                if (j(obj, obj2, i3) && i0.w(obj, jR) == i0.w(obj2, jR)) {
                    break;
                }
                break;
            case 16:
                if (j(obj, obj2, i3) && i0.x(obj, jR) == i0.x(obj2, jR)) {
                    break;
                }
                break;
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                if (j(obj, obj2, i3) && a0.H(i0.z(obj, jR), i0.z(obj2, jR))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (C(obj, obj2, i3) && a0.H(i0.z(obj, jR), i0.z(obj2, jR))) {
                    break;
                }
                break;
        }
        return true;
    }

    private void n0(l0 l0Var, int i3, Object obj, int i4) {
        if (obj != null) {
            l0Var.N(i3, this.f4016q.f(r(i4)), this.f4016q.g(obj));
        }
    }

    private Object o(Object obj, int i3, Object obj2, f0 f0Var, Object obj3) {
        Q(i3);
        if (i0.z(obj, R(k0(i3))) == null) {
            return obj2;
        }
        q(i3);
        return obj2;
    }

    private void o0(int i3, Object obj, l0 l0Var) {
        if (obj instanceof String) {
            l0Var.A(i3, (String) obj);
        } else {
            l0Var.J(i3, (AbstractC0492f) obj);
        }
    }

    private static float p(Object obj, long j3) {
        return i0.v(obj, j3);
    }

    private void p0(f0 f0Var, Object obj, l0 l0Var) {
        f0Var.t(f0Var.g(obj), l0Var);
    }

    private AbstractC0506u.a q(int i3) {
        AbstractC0527b.a(this.f4001b[((i3 / 3) * 2) + 1]);
        return null;
    }

    private Object r(int i3) {
        return this.f4001b[(i3 / 3) * 2];
    }

    private Y s(int i3) {
        int i4 = (i3 / 3) * 2;
        Y y2 = (Y) this.f4001b[i4];
        if (y2 != null) {
            return y2;
        }
        Y yC = U.a().c((Class) this.f4001b[i4 + 1]);
        this.f4001b[i4] = yC;
        return yC;
    }

    private int t(f0 f0Var, Object obj) {
        return f0Var.h(f0Var.g(obj));
    }

    private static int u(Object obj, long j3) {
        return i0.w(obj, j3);
    }

    private static boolean v(int i3) {
        return (i3 & 536870912) != 0;
    }

    private boolean w(Object obj, int i3) {
        int iY = Y(i3);
        long j3 = 1048575 & iY;
        if (j3 != 1048575) {
            return (i0.w(obj, j3) & (1 << (iY >>> 20))) != 0;
        }
        int iK0 = k0(i3);
        long jR = R(iK0);
        switch (j0(iK0)) {
            case 0:
                return Double.doubleToRawLongBits(i0.u(obj, jR)) != 0;
            case 1:
                return Float.floatToRawIntBits(i0.v(obj, jR)) != 0;
            case 2:
                return i0.x(obj, jR) != 0;
            case 3:
                return i0.x(obj, jR) != 0;
            case 4:
                return i0.w(obj, jR) != 0;
            case 5:
                return i0.x(obj, jR) != 0;
            case 6:
                return i0.w(obj, jR) != 0;
            case 7:
                return i0.p(obj, jR);
            case 8:
                Object objZ = i0.z(obj, jR);
                if (objZ instanceof String) {
                    return !((String) objZ).isEmpty();
                }
                if (objZ instanceof AbstractC0492f) {
                    return !AbstractC0492f.f4066b.equals(objZ);
                }
                throw new IllegalArgumentException();
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return i0.z(obj, jR) != null;
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return !AbstractC0492f.f4066b.equals(i0.z(obj, jR));
            case 11:
                return i0.w(obj, jR) != 0;
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return i0.w(obj, jR) != 0;
            case 13:
                return i0.w(obj, jR) != 0;
            case 14:
                return i0.x(obj, jR) != 0;
            case 15:
                return i0.w(obj, jR) != 0;
            case 16:
                return i0.x(obj, jR) != 0;
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return i0.z(obj, jR) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean x(Object obj, int i3, int i4, int i5, int i6) {
        return i4 == 1048575 ? w(obj, i3) : (i5 & i6) != 0;
    }

    private static boolean y(Object obj, int i3, Y y2) {
        return y2.c(i0.z(obj, R(i3)));
    }

    private boolean z(Object obj, int i3, int i4) {
        List list = (List) i0.z(obj, R(i3));
        if (list.isEmpty()) {
            return true;
        }
        Y yS = s(i4);
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!yS.c(list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        for (int i3 = 0; i3 < this.f4000a.length; i3 += 3) {
            K(obj, obj2, i3);
        }
        a0.F(this.f4014o, obj, obj2);
        if (this.f4005f) {
            a0.D(this.f4015p, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // androidx.datastore.preferences.protobuf.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.b(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // androidx.datastore.preferences.protobuf.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = r8
            r1 = r9
            r10 = r1
        Lb:
            int r2 = r6.f4010k
            r3 = 1
            if (r10 >= r2) goto Lb1
            int[] r2 = r6.f4009j
            r11 = r2[r10]
            int r12 = r6.Q(r11)
            int r13 = r6.k0(r11)
            int[] r2 = r6.f4000a
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L37
            if (r4 == r8) goto L33
            sun.misc.Unsafe r0 = androidx.datastore.preferences.protobuf.M.f3999s
            long r1 = (long) r4
            int r1 = r0.getInt(r7, r1)
        L33:
            r16 = r1
            r15 = r4
            goto L3a
        L37:
            r15 = r0
            r16 = r1
        L3a:
            boolean r0 = E(r13)
            if (r0 == 0) goto L50
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L50
            return r9
        L50:
            int r0 = j0(r13)
            r1 = 9
            if (r0 == r1) goto L90
            r1 = 17
            if (r0 == r1) goto L90
            r1 = 27
            if (r0 == r1) goto L89
            r1 = 60
            if (r0 == r1) goto L78
            r1 = 68
            if (r0 == r1) goto L78
            r1 = 49
            if (r0 == r1) goto L89
            r1 = 50
            if (r0 == r1) goto L71
            goto Laa
        L71:
            boolean r0 = r6.A(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L78:
            boolean r0 = r6.D(r7, r12, r11)
            if (r0 == 0) goto Laa
            androidx.datastore.preferences.protobuf.Y r0 = r6.s(r11)
            boolean r0 = y(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        L89:
            boolean r0 = r6.z(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L90:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Laa
            androidx.datastore.preferences.protobuf.Y r0 = r6.s(r11)
            boolean r0 = y(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        Laa:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Lb
        Lb1:
            boolean r0 = r6.f4005f
            if (r0 == 0) goto Lc2
            androidx.datastore.preferences.protobuf.n r0 = r6.f4015p
            androidx.datastore.preferences.protobuf.q r0 = r0.c(r7)
            boolean r0 = r0.k()
            if (r0 != 0) goto Lc2
            return r9
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.c(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public boolean d(Object obj, Object obj2) {
        int length = this.f4000a.length;
        for (int i3 = 0; i3 < length; i3 += 3) {
            if (!n(obj, obj2, i3)) {
                return false;
            }
        }
        if (!this.f4014o.g(obj).equals(this.f4014o.g(obj2))) {
            return false;
        }
        if (this.f4005f) {
            return this.f4015p.c(obj).equals(this.f4015p.c(obj2));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03ab, code lost:
    
        if (x(r19, r11, r14, r16, r17) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03bd, code lost:
    
        if (x(r19, r11, r14, r16, r17) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0454, code lost:
    
        if (x(r19, r11, r14, r16, r17) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (D(r19, r13, r11) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        r0 = androidx.datastore.preferences.protobuf.AbstractC0495i.G(r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if (D(r19, r13, r11) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        r1 = androidx.datastore.preferences.protobuf.AbstractC0495i.E(r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
    
        if (D(r19, r13, r11) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0118, code lost:
    
        r0 = androidx.datastore.preferences.protobuf.AbstractC0495i.c(r13, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b0 A[PHI: r0
      0x01b0: PHI (r0v154 int) = 
      (r0v116 int)
      (r0v119 int)
      (r0v122 int)
      (r0v125 int)
      (r0v128 int)
      (r0v131 int)
      (r0v134 int)
      (r0v137 int)
      (r0v140 int)
      (r0v143 int)
      (r0v146 int)
      (r0v149 int)
      (r0v152 int)
      (r0v157 int)
     binds: [B:161:0x02a0, B:156:0x028e, B:151:0x027c, B:146:0x026a, B:141:0x0258, B:136:0x0246, B:131:0x0234, B:126:0x0223, B:121:0x0212, B:116:0x0201, B:111:0x01f0, B:106:0x01df, B:101:0x01ce, B:95:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int e(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.e(java.lang.Object):int");
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public Object f() {
        return this.f4012m.a(this.f4004e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f2 A[PHI: r3
      0x00f2: PHI (r3v8 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:74:0x010e, B:68:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int g(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.g(java.lang.Object):int");
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void h(Object obj, X x2, C0499m c0499m) throws Throwable {
        c0499m.getClass();
        l(obj);
        G(this.f4014o, this.f4015p, obj, x2, c0499m);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void i(Object obj, l0 l0Var) {
        if (l0Var.v() == l0.a.DESCENDING) {
            m0(obj, l0Var);
        } else {
            l0(obj, l0Var);
        }
    }
}
