package com.google.protobuf;

import c.AbstractC0527b;
import com.google.protobuf.AbstractC0788f;
import com.google.protobuf.B0;
import com.google.protobuf.C;
import com.google.protobuf.C0;
import com.google.protobuf.N;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class Y implements n0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f6722r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f6723s = z0.H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f6724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f6725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V f6728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f6729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f6730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h0 f6731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f6732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f6733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f6734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f6735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC0781a0 f6736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final K f6737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final v0 f6738o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r f6739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final P f6740q;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6741a;

        static {
            int[] iArr = new int[B0.b.values().length];
            f6741a = iArr;
            try {
                iArr[B0.b.f6640o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6741a[B0.b.f6644s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6741a[B0.b.f6633c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6741a[B0.b.f6639n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6741a[B0.b.f6647v.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6741a[B0.b.f6638m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6741a[B0.b.f6648w.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6741a[B0.b.f6634d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6741a[B0.b.f6646u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6741a[B0.b.f6637l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6741a[B0.b.f6645t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6741a[B0.b.f6635e.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6741a[B0.b.f6636f.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6741a[B0.b.f6643r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6741a[B0.b.f6649x.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6741a[B0.b.f6650y.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6741a[B0.b.f6641p.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private Y(int[] iArr, Object[] objArr, int i3, int i4, V v2, h0 h0Var, boolean z2, int[] iArr2, int i5, int i6, InterfaceC0781a0 interfaceC0781a0, K k3, v0 v0Var, r rVar, P p2) {
        this.f6724a = iArr;
        this.f6725b = objArr;
        this.f6726c = i3;
        this.f6727d = i4;
        this.f6730g = v2 instanceof AbstractC0806y;
        this.f6731h = h0Var;
        this.f6729f = rVar != null && rVar.e(v2);
        this.f6732i = z2;
        this.f6733j = iArr2;
        this.f6734k = i5;
        this.f6735l = i6;
        this.f6736m = interfaceC0781a0;
        this.f6737n = k3;
        this.f6738o = v0Var;
        this.f6739p = rVar;
        this.f6728e = v2;
        this.f6740q = p2;
    }

    private boolean A(Object obj, int i3) {
        int iI0 = i0(i3);
        long j3 = 1048575 & iI0;
        if (j3 != 1048575) {
            return (z0.C(obj, j3) & (1 << (iI0 >>> 20))) != 0;
        }
        int iU0 = u0(i3);
        long jW = W(iU0);
        switch (t0(iU0)) {
            case 0:
                return Double.doubleToRawLongBits(z0.A(obj, jW)) != 0;
            case 1:
                return Float.floatToRawIntBits(z0.B(obj, jW)) != 0;
            case 2:
                return z0.E(obj, jW) != 0;
            case 3:
                return z0.E(obj, jW) != 0;
            case 4:
                return z0.C(obj, jW) != 0;
            case 5:
                return z0.E(obj, jW) != 0;
            case 6:
                return z0.C(obj, jW) != 0;
            case 7:
                return z0.t(obj, jW);
            case 8:
                Object objG = z0.G(obj, jW);
                if (objG instanceof String) {
                    return !((String) objG).isEmpty();
                }
                if (objG instanceof AbstractC0791i) {
                    return !AbstractC0791i.f6770b.equals(objG);
                }
                throw new IllegalArgumentException();
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return z0.G(obj, jW) != null;
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return !AbstractC0791i.f6770b.equals(z0.G(obj, jW));
            case 11:
                return z0.C(obj, jW) != 0;
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return z0.C(obj, jW) != 0;
            case 13:
                return z0.C(obj, jW) != 0;
            case 14:
                return z0.E(obj, jW) != 0;
            case 15:
                return z0.C(obj, jW) != 0;
            case 16:
                return z0.E(obj, jW) != 0;
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return z0.G(obj, jW) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean B(Object obj, int i3, int i4, int i5, int i6) {
        return i4 == 1048575 ? A(obj, i3) : (i5 & i6) != 0;
    }

    private static boolean C(Object obj, int i3, n0 n0Var) {
        return n0Var.c(z0.G(obj, W(i3)));
    }

    private static boolean D(int i3) {
        return (i3 & Integer.MIN_VALUE) != 0;
    }

    private boolean E(Object obj, int i3, int i4) {
        List list = (List) z0.G(obj, W(i3));
        if (list.isEmpty()) {
            return true;
        }
        n0 n0VarV = v(i4);
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!n0VarV.c(list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    private boolean F(Object obj, int i3, int i4) {
        Map mapG = this.f6740q.g(z0.G(obj, W(i3)));
        if (mapG.isEmpty()) {
            return true;
        }
        if (this.f6740q.f(u(i4)).f6715c.c() != B0.c.MESSAGE) {
            return true;
        }
        n0 n0VarC = null;
        for (Object obj2 : mapG.values()) {
            if (n0VarC == null) {
                n0VarC = i0.a().c(obj2.getClass());
            }
            if (!n0VarC.c(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0806y) {
            return ((AbstractC0806y) obj).I();
        }
        return true;
    }

    private boolean H(Object obj, Object obj2, int i3) {
        long jI0 = i0(i3) & 1048575;
        return z0.C(obj, jI0) == z0.C(obj2, jI0);
    }

    private boolean I(Object obj, int i3, int i4) {
        return z0.C(obj, (long) (i0(i4) & 1048575)) == i3;
    }

    private static boolean J(int i3) {
        return (i3 & 268435456) != 0;
    }

    private static long K(Object obj, long j3) {
        return z0.E(obj, j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
    
        r0 = r19.f6734k;
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        if (r0 >= r19.f6735l) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
    
        r5 = r(r22, r19.f6733j[r0], r5, r20, r22);
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
    /* JADX WARN: Removed duplicated region for block: B:181:0x0566 A[Catch: all -> 0x025f, TRY_LEAVE, TryCatch #9 {all -> 0x025f, blocks: (B:179:0x0560, B:181:0x0566, B:191:0x058f, B:110:0x025a, B:113:0x0262, B:114:0x026e, B:115:0x0273, B:116:0x027f, B:117:0x0284, B:118:0x0290, B:119:0x0295, B:120:0x02a1, B:121:0x02a6, B:122:0x02b8, B:123:0x02c7, B:124:0x02d3, B:125:0x02d8, B:126:0x02e4, B:127:0x02e9, B:128:0x02f5, B:129:0x02fa, B:130:0x0306, B:131:0x030b, B:132:0x0317, B:133:0x031c, B:134:0x0328, B:135:0x032d, B:136:0x0339, B:137:0x033e, B:138:0x034a, B:139:0x034f, B:140:0x035b, B:141:0x0360, B:142:0x036e, B:143:0x037c, B:144:0x038a, B:145:0x0398, B:146:0x03ac, B:147:0x03ba, B:148:0x03cb, B:149:0x03df, B:150:0x03e6, B:151:0x03f4, B:152:0x0402, B:153:0x0410, B:154:0x041e, B:155:0x042c, B:156:0x043a, B:157:0x0448, B:158:0x0456, B:159:0x0465, B:160:0x046a, B:161:0x0477, B:162:0x047c, B:163:0x048a, B:164:0x0498, B:165:0x04a6, B:166:0x04b7, B:167:0x04c5, B:168:0x04d3, B:169:0x04e3, B:170:0x04e9, B:171:0x04f7, B:172:0x0506, B:173:0x0515, B:174:0x0524, B:175:0x0533, B:176:0x0542, B:177:0x0551), top: B:233:0x0560 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05cf A[LOOP:4: B:208:0x05cb->B:210:0x05cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void L(com.google.protobuf.v0 r20, com.google.protobuf.r r21, java.lang.Object r22, com.google.protobuf.l0 r23, com.google.protobuf.C0799q r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Y.L(com.google.protobuf.v0, com.google.protobuf.r, java.lang.Object, com.google.protobuf.l0, com.google.protobuf.q):void");
    }

    private final void M(Object obj, int i3, Object obj2, C0799q c0799q, l0 l0Var) {
        long jW = W(u0(i3));
        Object objG = z0.G(obj, jW);
        if (objG == null) {
            objG = this.f6740q.b(obj2);
            z0.V(obj, jW, objG);
        } else if (this.f6740q.d(objG)) {
            Object objB = this.f6740q.b(obj2);
            this.f6740q.a(objB, objG);
            z0.V(obj, jW, objB);
            objG = objB;
        }
        l0Var.N(this.f6740q.h(objG), this.f6740q.f(obj2), c0799q);
    }

    private void N(Object obj, Object obj2, int i3) {
        if (A(obj2, i3)) {
            long jW = W(u0(i3));
            Unsafe unsafe = f6723s;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + V(i3) + " is present but null: " + obj2);
            }
            n0 n0VarV = v(i3);
            if (!A(obj, i3)) {
                if (G(object)) {
                    Object objF = n0VarV.f();
                    n0VarV.a(objF, object);
                    unsafe.putObject(obj, jW, objF);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                o0(obj, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!G(object2)) {
                Object objF2 = n0VarV.f();
                n0VarV.a(objF2, object2);
                unsafe.putObject(obj, jW, objF2);
                object2 = objF2;
            }
            n0VarV.a(object2, object);
        }
    }

    private void O(Object obj, Object obj2, int i3) {
        int iV = V(i3);
        if (I(obj2, iV, i3)) {
            long jW = W(u0(i3));
            Unsafe unsafe = f6723s;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + V(i3) + " is present but null: " + obj2);
            }
            n0 n0VarV = v(i3);
            if (!I(obj, iV, i3)) {
                if (G(object)) {
                    Object objF = n0VarV.f();
                    n0VarV.a(objF, object);
                    unsafe.putObject(obj, jW, objF);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                p0(obj, iV, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!G(object2)) {
                Object objF2 = n0VarV.f();
                n0VarV.a(objF2, object2);
                unsafe.putObject(obj, jW, objF2);
                object2 = objF2;
            }
            n0VarV.a(object2, object);
        }
    }

    private void P(Object obj, Object obj2, int i3) {
        int iU0 = u0(i3);
        long jW = W(iU0);
        int iV = V(i3);
        switch (t0(iU0)) {
            case 0:
                if (A(obj2, i3)) {
                    z0.R(obj, jW, z0.A(obj2, jW));
                    o0(obj, i3);
                }
                break;
            case 1:
                if (A(obj2, i3)) {
                    z0.S(obj, jW, z0.B(obj2, jW));
                    o0(obj, i3);
                }
                break;
            case 2:
                if (!A(obj2, i3)) {
                }
                z0.U(obj, jW, z0.E(obj2, jW));
                o0(obj, i3);
                break;
            case 3:
                if (!A(obj2, i3)) {
                }
                z0.U(obj, jW, z0.E(obj2, jW));
                o0(obj, i3);
                break;
            case 4:
                if (!A(obj2, i3)) {
                }
                z0.T(obj, jW, z0.C(obj2, jW));
                o0(obj, i3);
                break;
            case 5:
                if (!A(obj2, i3)) {
                }
                z0.U(obj, jW, z0.E(obj2, jW));
                o0(obj, i3);
                break;
            case 6:
                if (!A(obj2, i3)) {
                }
                z0.T(obj, jW, z0.C(obj2, jW));
                o0(obj, i3);
                break;
            case 7:
                if (A(obj2, i3)) {
                    z0.L(obj, jW, z0.t(obj2, jW));
                    o0(obj, i3);
                }
                break;
            case 8:
                if (!A(obj2, i3)) {
                }
                z0.V(obj, jW, z0.G(obj2, jW));
                o0(obj, i3);
                break;
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                N(obj, obj2, i3);
                break;
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                if (!A(obj2, i3)) {
                }
                z0.V(obj, jW, z0.G(obj2, jW));
                o0(obj, i3);
                break;
            case 11:
                if (!A(obj2, i3)) {
                }
                z0.T(obj, jW, z0.C(obj2, jW));
                o0(obj, i3);
                break;
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (!A(obj2, i3)) {
                }
                z0.T(obj, jW, z0.C(obj2, jW));
                o0(obj, i3);
                break;
            case 13:
                if (!A(obj2, i3)) {
                }
                z0.T(obj, jW, z0.C(obj2, jW));
                o0(obj, i3);
                break;
            case 14:
                if (!A(obj2, i3)) {
                }
                z0.U(obj, jW, z0.E(obj2, jW));
                o0(obj, i3);
                break;
            case 15:
                if (!A(obj2, i3)) {
                }
                z0.T(obj, jW, z0.C(obj2, jW));
                o0(obj, i3);
                break;
            case 16:
                if (!A(obj2, i3)) {
                }
                z0.U(obj, jW, z0.E(obj2, jW));
                o0(obj, i3);
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
                this.f6737n.d(obj, obj2, jW);
                break;
            case 50:
                p0.E(this.f6740q, obj, obj2, jW);
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
                if (!I(obj2, iV, i3)) {
                }
                z0.V(obj, jW, z0.G(obj2, jW));
                p0(obj, iV, i3);
                break;
            case 60:
            case 68:
                O(obj, obj2, i3);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!I(obj2, iV, i3)) {
                }
                z0.V(obj, jW, z0.G(obj2, jW));
                p0(obj, iV, i3);
                break;
        }
    }

    private Object Q(Object obj, int i3) {
        n0 n0VarV = v(i3);
        long jW = W(u0(i3));
        if (!A(obj, i3)) {
            return n0VarV.f();
        }
        Object object = f6723s.getObject(obj, jW);
        if (G(object)) {
            return object;
        }
        Object objF = n0VarV.f();
        if (object != null) {
            n0VarV.a(objF, object);
        }
        return objF;
    }

    private Object R(Object obj, int i3, int i4) {
        n0 n0VarV = v(i4);
        if (!I(obj, i3, i4)) {
            return n0VarV.f();
        }
        Object object = f6723s.getObject(obj, W(u0(i4)));
        if (G(object)) {
            return object;
        }
        Object objF = n0VarV.f();
        if (object != null) {
            n0VarV.a(objF, object);
        }
        return objF;
    }

    static Y S(Class cls, T t2, InterfaceC0781a0 interfaceC0781a0, K k3, v0 v0Var, r rVar, P p2) {
        if (t2 instanceof k0) {
            return U((k0) t2, interfaceC0781a0, k3, v0Var, rVar, p2);
        }
        AbstractC0527b.a(t2);
        return T(null, interfaceC0781a0, k3, v0Var, rVar, p2);
    }

    static Y T(r0 r0Var, InterfaceC0781a0 interfaceC0781a0, K k3, v0 v0Var, r rVar, P p2) {
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
    static com.google.protobuf.Y U(com.google.protobuf.k0 r31, com.google.protobuf.InterfaceC0781a0 r32, com.google.protobuf.K r33, com.google.protobuf.v0 r34, com.google.protobuf.r r35, com.google.protobuf.P r36) {
        /*
            Method dump skipped, instruction units count: 993
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Y.U(com.google.protobuf.k0, com.google.protobuf.a0, com.google.protobuf.K, com.google.protobuf.v0, com.google.protobuf.r, com.google.protobuf.P):com.google.protobuf.Y");
    }

    private int V(int i3) {
        return this.f6724a[i3];
    }

    private static long W(int i3) {
        return i3 & 1048575;
    }

    private static boolean X(Object obj, long j3) {
        return ((Boolean) z0.G(obj, j3)).booleanValue();
    }

    private static double Y(Object obj, long j3) {
        return ((Double) z0.G(obj, j3)).doubleValue();
    }

    private static float Z(Object obj, long j3) {
        return ((Float) z0.G(obj, j3)).floatValue();
    }

    private static int a0(Object obj, long j3) {
        return ((Integer) z0.G(obj, j3)).intValue();
    }

    private static long b0(Object obj, long j3) {
        return ((Long) z0.G(obj, j3)).longValue();
    }

    private int c0(Object obj, byte[] bArr, int i3, int i4, int i5, long j3, AbstractC0788f.a aVar) {
        Unsafe unsafe = f6723s;
        Object objU = u(i5);
        Object object = unsafe.getObject(obj, j3);
        if (this.f6740q.d(object)) {
            Object objB = this.f6740q.b(objU);
            this.f6740q.a(objB, object);
            unsafe.putObject(obj, j3, objB);
            object = objB;
        }
        return n(bArr, i3, i4, this.f6740q.f(objU), this.f6740q.h(object), aVar);
    }

    private int e0(Object obj, byte[] bArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j3, int i10, AbstractC0788f.a aVar) throws D {
        Object objValueOf;
        Object objValueOf2;
        int iL;
        long jD;
        int iC;
        Object objValueOf3;
        Object objR;
        int iO;
        Unsafe unsafe = f6723s;
        long j4 = this.f6724a[i10 + 2] & 1048575;
        switch (i9) {
            case 51:
                if (i7 != 1) {
                    return i3;
                }
                objValueOf = Double.valueOf(AbstractC0788f.e(bArr, i3));
                unsafe.putObject(obj, j3, objValueOf);
                iL = i3 + 8;
                unsafe.putInt(obj, j4, i6);
                return iL;
            case 52:
                if (i7 != 5) {
                    return i3;
                }
                objValueOf2 = Float.valueOf(AbstractC0788f.l(bArr, i3));
                unsafe.putObject(obj, j3, objValueOf2);
                iL = i3 + 4;
                unsafe.putInt(obj, j4, i6);
                return iL;
            case 53:
            case 54:
                if (i7 != 0) {
                    return i3;
                }
                iL = AbstractC0788f.L(bArr, i3, aVar);
                jD = aVar.f6762b;
                objValueOf3 = Long.valueOf(jD);
                unsafe.putObject(obj, j3, objValueOf3);
                unsafe.putInt(obj, j4, i6);
                return iL;
            case 55:
            case 62:
                if (i7 != 0) {
                    return i3;
                }
                iL = AbstractC0788f.I(bArr, i3, aVar);
                iC = aVar.f6761a;
                objValueOf3 = Integer.valueOf(iC);
                unsafe.putObject(obj, j3, objValueOf3);
                unsafe.putInt(obj, j4, i6);
                return iL;
            case 56:
            case 65:
                if (i7 != 1) {
                    return i3;
                }
                objValueOf = Long.valueOf(AbstractC0788f.j(bArr, i3));
                unsafe.putObject(obj, j3, objValueOf);
                iL = i3 + 8;
                unsafe.putInt(obj, j4, i6);
                return iL;
            case 57:
            case 64:
                if (i7 != 5) {
                    return i3;
                }
                objValueOf2 = Integer.valueOf(AbstractC0788f.h(bArr, i3));
                unsafe.putObject(obj, j3, objValueOf2);
                iL = i3 + 4;
                unsafe.putInt(obj, j4, i6);
                return iL;
            case 58:
                if (i7 != 0) {
                    return i3;
                }
                iL = AbstractC0788f.L(bArr, i3, aVar);
                objValueOf3 = Boolean.valueOf(aVar.f6762b != 0);
                unsafe.putObject(obj, j3, objValueOf3);
                unsafe.putInt(obj, j4, i6);
                return iL;
            case 59:
                if (i7 != 2) {
                    return i3;
                }
                iL = AbstractC0788f.I(bArr, i3, aVar);
                int i11 = aVar.f6761a;
                if (i11 == 0) {
                    objValueOf3 = "";
                    unsafe.putObject(obj, j3, objValueOf3);
                    unsafe.putInt(obj, j4, i6);
                    return iL;
                }
                if ((i8 & 536870912) != 0 && !A0.t(bArr, iL, iL + i11)) {
                    throw D.d();
                }
                unsafe.putObject(obj, j3, new String(bArr, iL, i11, C.f6666b));
                iL += i11;
                unsafe.putInt(obj, j4, i6);
                return iL;
            case 60:
                if (i7 != 2) {
                    return i3;
                }
                objR = R(obj, i6, i10);
                iO = AbstractC0788f.O(objR, v(i10), bArr, i3, i4, aVar);
                s0(obj, i6, i10, objR);
                return iO;
            case 61:
                if (i7 != 2) {
                    return i3;
                }
                iL = AbstractC0788f.c(bArr, i3, aVar);
                objValueOf3 = aVar.f6763c;
                unsafe.putObject(obj, j3, objValueOf3);
                unsafe.putInt(obj, j4, i6);
                return iL;
            case 63:
                if (i7 != 0) {
                    return i3;
                }
                iL = AbstractC0788f.I(bArr, i3, aVar);
                iC = aVar.f6761a;
                t(i10);
                objValueOf3 = Integer.valueOf(iC);
                unsafe.putObject(obj, j3, objValueOf3);
                unsafe.putInt(obj, j4, i6);
                return iL;
            case 66:
                if (i7 != 0) {
                    return i3;
                }
                iL = AbstractC0788f.I(bArr, i3, aVar);
                iC = AbstractC0792j.c(aVar.f6761a);
                objValueOf3 = Integer.valueOf(iC);
                unsafe.putObject(obj, j3, objValueOf3);
                unsafe.putInt(obj, j4, i6);
                return iL;
            case 67:
                if (i7 != 0) {
                    return i3;
                }
                iL = AbstractC0788f.L(bArr, i3, aVar);
                jD = AbstractC0792j.d(aVar.f6762b);
                objValueOf3 = Long.valueOf(jD);
                unsafe.putObject(obj, j3, objValueOf3);
                unsafe.putInt(obj, j4, i6);
                return iL;
            case 68:
                if (i7 != 3) {
                    return i3;
                }
                objR = R(obj, i6, i10);
                iO = AbstractC0788f.N(objR, v(i10), bArr, i3, i4, (i5 & (-8)) | 4, aVar);
                s0(obj, i6, i10, objR);
                return iO;
            default:
                return i3;
        }
    }

    private int f0(Object obj, byte[] bArr, int i3, int i4, int i5, int i6, int i7, int i8, long j3, int i9, long j4, AbstractC0788f.a aVar) throws D {
        int iJ;
        Unsafe unsafe = f6723s;
        C.e eVarE = (C.e) unsafe.getObject(obj, j4);
        if (!eVarE.g()) {
            int size = eVarE.size();
            eVarE = eVarE.e(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j4, eVarE);
        }
        switch (i9) {
            case V0.I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 35:
                return i7 == 2 ? AbstractC0788f.s(bArr, i3, eVarE, aVar) : i7 == 1 ? AbstractC0788f.f(i5, bArr, i3, i4, eVarE, aVar) : i3;
            case V0.I.FIELD_REFERENCE_VALUE_FIELD_NUMBER /* 19 */:
            case 36:
                return i7 == 2 ? AbstractC0788f.v(bArr, i3, eVarE, aVar) : i7 == 5 ? AbstractC0788f.m(i5, bArr, i3, i4, eVarE, aVar) : i3;
            case V0.I.FUNCTION_VALUE_FIELD_NUMBER /* 20 */:
            case V0.I.PIPELINE_VALUE_FIELD_NUMBER /* 21 */:
            case 37:
            case 38:
                return i7 == 2 ? AbstractC0788f.z(bArr, i3, eVarE, aVar) : i7 == 0 ? AbstractC0788f.M(i5, bArr, i3, i4, eVarE, aVar) : i3;
            case V0.I.VARIABLE_REFERENCE_VALUE_FIELD_NUMBER /* 22 */:
            case 29:
            case 39:
            case 43:
                return i7 == 2 ? AbstractC0788f.y(bArr, i3, eVarE, aVar) : i7 == 0 ? AbstractC0788f.J(i5, bArr, i3, i4, eVarE, aVar) : i3;
            case 23:
            case 32:
            case 40:
            case 46:
                return i7 == 2 ? AbstractC0788f.u(bArr, i3, eVarE, aVar) : i7 == 1 ? AbstractC0788f.k(i5, bArr, i3, i4, eVarE, aVar) : i3;
            case 24:
            case 31:
            case 41:
            case 45:
                return i7 == 2 ? AbstractC0788f.t(bArr, i3, eVarE, aVar) : i7 == 5 ? AbstractC0788f.i(i5, bArr, i3, i4, eVarE, aVar) : i3;
            case 25:
            case 42:
                return i7 == 2 ? AbstractC0788f.r(bArr, i3, eVarE, aVar) : i7 == 0 ? AbstractC0788f.b(i5, bArr, i3, i4, eVarE, aVar) : i3;
            case 26:
                if (i7 != 2) {
                    return i3;
                }
                long j5 = j3 & 536870912;
                C.e eVar = eVarE;
                return j5 == 0 ? AbstractC0788f.D(i5, bArr, i3, i4, eVar, aVar) : AbstractC0788f.E(i5, bArr, i3, i4, eVar, aVar);
            case 27:
                return i7 == 2 ? AbstractC0788f.q(v(i8), i5, bArr, i3, i4, eVarE, aVar) : i3;
            case 28:
                return i7 == 2 ? AbstractC0788f.d(i5, bArr, i3, i4, eVarE, aVar) : i3;
            case 30:
            case 44:
                if (i7 == 2) {
                    iJ = AbstractC0788f.y(bArr, i3, eVarE, aVar);
                } else {
                    if (i7 != 0) {
                        return i3;
                    }
                    iJ = AbstractC0788f.J(i5, bArr, i3, i4, eVarE, aVar);
                }
                t(i8);
                p0.z(obj, i6, eVarE, null, null, this.f6738o);
                return iJ;
            case 33:
            case 47:
                return i7 == 2 ? AbstractC0788f.w(bArr, i3, eVarE, aVar) : i7 == 0 ? AbstractC0788f.A(i5, bArr, i3, i4, eVarE, aVar) : i3;
            case 34:
            case 48:
                return i7 == 2 ? AbstractC0788f.x(bArr, i3, eVarE, aVar) : i7 == 0 ? AbstractC0788f.B(i5, bArr, i3, i4, eVarE, aVar) : i3;
            case 49:
                return i7 == 3 ? AbstractC0788f.o(v(i8), i5, bArr, i3, i4, eVarE, aVar) : i3;
            default:
                return i3;
        }
    }

    private int g0(int i3) {
        if (i3 < this.f6726c || i3 > this.f6727d) {
            return -1;
        }
        return q0(i3, 0);
    }

    private int h0(int i3, int i4) {
        if (i3 < this.f6726c || i3 > this.f6727d) {
            return -1;
        }
        return q0(i3, i4);
    }

    private int i0(int i3) {
        return this.f6724a[i3 + 2];
    }

    private void j0(Object obj, long j3, l0 l0Var, n0 n0Var, C0799q c0799q) {
        l0Var.J(this.f6737n.e(obj, j3), n0Var, c0799q);
    }

    private boolean k(Object obj, Object obj2, int i3) {
        return A(obj, i3) == A(obj2, i3);
    }

    private void k0(Object obj, int i3, l0 l0Var, n0 n0Var, C0799q c0799q) {
        l0Var.L(this.f6737n.e(obj, W(i3)), n0Var, c0799q);
    }

    private static boolean l(Object obj, long j3) {
        return z0.t(obj, j3);
    }

    private void l0(Object obj, int i3, l0 l0Var) {
        long jW;
        Object objU;
        if (z(i3)) {
            jW = W(i3);
            objU = l0Var.F();
        } else if (this.f6730g) {
            jW = W(i3);
            objU = l0Var.m();
        } else {
            jW = W(i3);
            objU = l0Var.u();
        }
        z0.V(obj, jW, objU);
    }

    private static void m(Object obj) {
        if (G(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private void m0(Object obj, int i3, l0 l0Var) {
        if (z(i3)) {
            l0Var.t(this.f6737n.e(obj, W(i3)));
        } else {
            l0Var.q(this.f6737n.e(obj, W(i3)));
        }
    }

    private int n(byte[] bArr, int i3, int i4, N.a aVar, Map map, AbstractC0788f.a aVar2) throws D {
        int iH;
        int I2 = AbstractC0788f.I(bArr, i3, aVar2);
        int i5 = aVar2.f6761a;
        if (i5 < 0 || i5 > i4 - I2) {
            throw D.m();
        }
        int i6 = I2 + i5;
        Object obj = aVar.f6714b;
        Object obj2 = aVar.f6716d;
        while (I2 < i6) {
            int i7 = I2 + 1;
            int i8 = bArr[I2];
            if (i8 < 0) {
                iH = AbstractC0788f.H(i8, bArr, i7, aVar2);
                i8 = aVar2.f6761a;
            } else {
                iH = i7;
            }
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i9 != 1) {
                if (i9 == 2 && i10 == aVar.f6715c.e()) {
                    I2 = o(bArr, iH, i4, aVar.f6715c, aVar.f6716d.getClass(), aVar2);
                    obj2 = aVar2.f6763c;
                } else {
                    I2 = AbstractC0788f.P(i8, bArr, iH, i4, aVar2);
                }
            } else if (i10 == aVar.f6713a.e()) {
                I2 = o(bArr, iH, i4, aVar.f6713a, null, aVar2);
                obj = aVar2.f6763c;
            } else {
                I2 = AbstractC0788f.P(i8, bArr, iH, i4, aVar2);
            }
        }
        if (I2 != i6) {
            throw D.h();
        }
        map.put(obj, obj2);
        return i6;
    }

    private static Field n0(Class cls, String str) {
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

    private int o(byte[] bArr, int i3, int i4, B0.b bVar, Class cls, AbstractC0788f.a aVar) {
        int iL;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        int iC;
        long jD;
        switch (a.f6741a[bVar.ordinal()]) {
            case 1:
                iL = AbstractC0788f.L(bArr, i3, aVar);
                objValueOf = Boolean.valueOf(aVar.f6762b != 0);
                aVar.f6763c = objValueOf;
                return iL;
            case 2:
                return AbstractC0788f.c(bArr, i3, aVar);
            case 3:
                objValueOf2 = Double.valueOf(AbstractC0788f.e(bArr, i3));
                aVar.f6763c = objValueOf2;
                return i3 + 8;
            case 4:
            case 5:
                objValueOf3 = Integer.valueOf(AbstractC0788f.h(bArr, i3));
                aVar.f6763c = objValueOf3;
                return i3 + 4;
            case 6:
            case 7:
                objValueOf2 = Long.valueOf(AbstractC0788f.j(bArr, i3));
                aVar.f6763c = objValueOf2;
                return i3 + 8;
            case 8:
                objValueOf3 = Float.valueOf(AbstractC0788f.l(bArr, i3));
                aVar.f6763c = objValueOf3;
                return i3 + 4;
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
                iL = AbstractC0788f.I(bArr, i3, aVar);
                iC = aVar.f6761a;
                objValueOf = Integer.valueOf(iC);
                aVar.f6763c = objValueOf;
                return iL;
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
                iL = AbstractC0788f.L(bArr, i3, aVar);
                jD = aVar.f6762b;
                objValueOf = Long.valueOf(jD);
                aVar.f6763c = objValueOf;
                return iL;
            case 14:
                return AbstractC0788f.p(i0.a().c(cls), bArr, i3, i4, aVar);
            case 15:
                iL = AbstractC0788f.I(bArr, i3, aVar);
                iC = AbstractC0792j.c(aVar.f6761a);
                objValueOf = Integer.valueOf(iC);
                aVar.f6763c = objValueOf;
                return iL;
            case 16:
                iL = AbstractC0788f.L(bArr, i3, aVar);
                jD = AbstractC0792j.d(aVar.f6762b);
                objValueOf = Long.valueOf(jD);
                aVar.f6763c = objValueOf;
                return iL;
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return AbstractC0788f.F(bArr, i3, aVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private void o0(Object obj, int i3) {
        int iI0 = i0(i3);
        long j3 = 1048575 & iI0;
        if (j3 == 1048575) {
            return;
        }
        z0.T(obj, j3, (1 << (iI0 >>> 20)) | z0.C(obj, j3));
    }

    private static double p(Object obj, long j3) {
        return z0.A(obj, j3);
    }

    private void p0(Object obj, int i3, int i4) {
        z0.T(obj, i0(i4) & 1048575, i3);
    }

    private boolean q(Object obj, Object obj2, int i3) {
        int iU0 = u0(i3);
        long jW = W(iU0);
        switch (t0(iU0)) {
            case 0:
                if (k(obj, obj2, i3) && Double.doubleToLongBits(z0.A(obj, jW)) == Double.doubleToLongBits(z0.A(obj2, jW))) {
                    break;
                }
                break;
            case 1:
                if (k(obj, obj2, i3) && Float.floatToIntBits(z0.B(obj, jW)) == Float.floatToIntBits(z0.B(obj2, jW))) {
                    break;
                }
                break;
            case 2:
                if (k(obj, obj2, i3) && z0.E(obj, jW) == z0.E(obj2, jW)) {
                    break;
                }
                break;
            case 3:
                if (k(obj, obj2, i3) && z0.E(obj, jW) == z0.E(obj2, jW)) {
                    break;
                }
                break;
            case 4:
                if (k(obj, obj2, i3) && z0.C(obj, jW) == z0.C(obj2, jW)) {
                    break;
                }
                break;
            case 5:
                if (k(obj, obj2, i3) && z0.E(obj, jW) == z0.E(obj2, jW)) {
                    break;
                }
                break;
            case 6:
                if (k(obj, obj2, i3) && z0.C(obj, jW) == z0.C(obj2, jW)) {
                    break;
                }
                break;
            case 7:
                if (k(obj, obj2, i3) && z0.t(obj, jW) == z0.t(obj2, jW)) {
                    break;
                }
                break;
            case 8:
                if (k(obj, obj2, i3) && p0.H(z0.G(obj, jW), z0.G(obj2, jW))) {
                    break;
                }
                break;
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                if (k(obj, obj2, i3) && p0.H(z0.G(obj, jW), z0.G(obj2, jW))) {
                    break;
                }
                break;
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                if (k(obj, obj2, i3) && p0.H(z0.G(obj, jW), z0.G(obj2, jW))) {
                    break;
                }
                break;
            case 11:
                if (k(obj, obj2, i3) && z0.C(obj, jW) == z0.C(obj2, jW)) {
                    break;
                }
                break;
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (k(obj, obj2, i3) && z0.C(obj, jW) == z0.C(obj2, jW)) {
                    break;
                }
                break;
            case 13:
                if (k(obj, obj2, i3) && z0.C(obj, jW) == z0.C(obj2, jW)) {
                    break;
                }
                break;
            case 14:
                if (k(obj, obj2, i3) && z0.E(obj, jW) == z0.E(obj2, jW)) {
                    break;
                }
                break;
            case 15:
                if (k(obj, obj2, i3) && z0.C(obj, jW) == z0.C(obj2, jW)) {
                    break;
                }
                break;
            case 16:
                if (k(obj, obj2, i3) && z0.E(obj, jW) == z0.E(obj2, jW)) {
                    break;
                }
                break;
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                if (k(obj, obj2, i3) && p0.H(z0.G(obj, jW), z0.G(obj2, jW))) {
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
                if (H(obj, obj2, i3) && p0.H(z0.G(obj, jW), z0.G(obj2, jW))) {
                    break;
                }
                break;
        }
        return true;
    }

    private int q0(int i3, int i4) {
        int length = (this.f6724a.length / 3) - 1;
        while (i4 <= length) {
            int i5 = (length + i4) >>> 1;
            int i6 = i5 * 3;
            int iV = V(i6);
            if (i3 == iV) {
                return i6;
            }
            if (i3 < iV) {
                length = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        return -1;
    }

    private Object r(Object obj, int i3, Object obj2, v0 v0Var, Object obj3) {
        V(i3);
        if (z0.G(obj, W(u0(i3))) == null) {
            return obj2;
        }
        t(i3);
        return obj2;
    }

    private void r0(Object obj, int i3, Object obj2) {
        f6723s.putObject(obj, W(u0(i3)), obj2);
        o0(obj, i3);
    }

    private static float s(Object obj, long j3) {
        return z0.B(obj, j3);
    }

    private void s0(Object obj, int i3, int i4, Object obj2) {
        f6723s.putObject(obj, W(u0(i4)), obj2);
        p0(obj, i3, i4);
    }

    private C.c t(int i3) {
        AbstractC0527b.a(this.f6725b[((i3 / 3) * 2) + 1]);
        return null;
    }

    private static int t0(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    private Object u(int i3) {
        return this.f6725b[(i3 / 3) * 2];
    }

    private int u0(int i3) {
        return this.f6724a[i3 + 1];
    }

    private n0 v(int i3) {
        int i4 = (i3 / 3) * 2;
        n0 n0Var = (n0) this.f6725b[i4];
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0VarC = i0.a().c((Class) this.f6725b[i4 + 1]);
        this.f6725b[i4] = n0VarC;
        return n0VarC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void v0(java.lang.Object r22, com.google.protobuf.C0 r23) {
        /*
            Method dump skipped, instruction units count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Y.v0(java.lang.Object, com.google.protobuf.C0):void");
    }

    static w0 w(Object obj) {
        AbstractC0806y abstractC0806y = (AbstractC0806y) obj;
        w0 w0Var = abstractC0806y.unknownFields;
        if (w0Var != w0.c()) {
            return w0Var;
        }
        w0 w0VarK = w0.k();
        abstractC0806y.unknownFields = w0VarK;
        return w0VarK;
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
    private void w0(java.lang.Object r11, com.google.protobuf.C0 r12) {
        /*
            Method dump skipped, instruction units count: 1498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Y.w0(java.lang.Object, com.google.protobuf.C0):void");
    }

    private int x(v0 v0Var, Object obj) {
        return v0Var.h(v0Var.g(obj));
    }

    private void x0(C0 c02, int i3, Object obj, int i4) {
        if (obj != null) {
            c02.O(i3, this.f6740q.f(u(i4)), this.f6740q.g(obj));
        }
    }

    private static int y(Object obj, long j3) {
        return z0.C(obj, j3);
    }

    private void y0(int i3, Object obj, C0 c02) {
        if (obj instanceof String) {
            c02.A(i3, (String) obj);
        } else {
            c02.M(i3, (AbstractC0791i) obj);
        }
    }

    private static boolean z(int i3) {
        return (i3 & 536870912) != 0;
    }

    private void z0(v0 v0Var, Object obj, C0 c02) {
        v0Var.t(v0Var.g(obj), c02);
    }

    @Override // com.google.protobuf.n0
    public void a(Object obj, Object obj2) {
        m(obj);
        obj2.getClass();
        for (int i3 = 0; i3 < this.f6724a.length; i3 += 3) {
            P(obj, obj2, i3);
        }
        p0.F(this.f6738o, obj, obj2);
        if (this.f6729f) {
            p0.D(this.f6739p, obj, obj2);
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
    @Override // com.google.protobuf.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Y.b(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // com.google.protobuf.n0
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
            int r2 = r6.f6734k
            r3 = 1
            if (r10 >= r2) goto Lb1
            int[] r2 = r6.f6733j
            r11 = r2[r10]
            int r12 = r6.V(r11)
            int r13 = r6.u0(r11)
            int[] r2 = r6.f6724a
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L37
            if (r4 == r8) goto L33
            sun.misc.Unsafe r0 = com.google.protobuf.Y.f6723s
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
            boolean r0 = J(r13)
            if (r0 == 0) goto L50
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.B(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L50
            return r9
        L50:
            int r0 = t0(r13)
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
            boolean r0 = r6.F(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L78:
            boolean r0 = r6.I(r7, r12, r11)
            if (r0 == 0) goto Laa
            com.google.protobuf.n0 r0 = r6.v(r11)
            boolean r0 = C(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        L89:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L90:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.B(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Laa
            com.google.protobuf.n0 r0 = r6.v(r11)
            boolean r0 = C(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        Laa:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Lb
        Lb1:
            boolean r0 = r6.f6729f
            if (r0 == 0) goto Lc2
            com.google.protobuf.r r0 = r6.f6739p
            com.google.protobuf.u r0 = r0.c(r7)
            boolean r0 = r0.k()
            if (r0 != 0) goto Lc2
            return r9
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Y.c(java.lang.Object):boolean");
    }

    @Override // com.google.protobuf.n0
    public boolean d(Object obj, Object obj2) {
        int length = this.f6724a.length;
        for (int i3 = 0; i3 < length; i3 += 3) {
            if (!q(obj, obj2, i3)) {
                return false;
            }
        }
        if (!this.f6738o.g(obj).equals(this.f6738o.g(obj2))) {
            return false;
        }
        if (this.f6729f) {
            return this.f6739p.c(obj).equals(this.f6739p.c(obj2));
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009a. Please report as an issue. */
    /* JADX WARN: Type update failed for variable: r30v0 'this'  ??, new type: com.google.protobuf.Y
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 10601. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:72)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    int d0(Object obj, byte[] bArr, int i3, int i4, int i5, AbstractC0788f.a aVar) {
        Unsafe unsafe;
        int i6;
        Y y2;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        byte b3;
        byte[] bArr2;
        byte[] bArr3;
        long j3;
        int iL;
        Unsafe unsafe2;
        Object obj3;
        long jD;
        int iC;
        long j4;
        long j5;
        int i19;
        Y y3 = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i20 = i4;
        int i21 = i5;
        AbstractC0788f.a aVar2 = aVar;
        m(obj);
        Unsafe unsafe3 = f6723s;
        int iG = i3;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = -1;
        int i26 = 1048575;
        while (true) {
            if (iG < i20) {
                int i27 = iG + 1;
                byte b4 = bArr4[iG];
                if (b4 < 0) {
                    int iH = AbstractC0788f.H(b4, bArr4, i27, aVar2);
                    i11 = aVar2.f6761a;
                    i27 = iH;
                } else {
                    i11 = b4;
                }
                int i28 = i11 >>> 3;
                int i29 = i11 & 7;
                int iH0 = i28 > i25 ? y3.h0(i28, i22 / 3) : y3.g0(i28);
                if (iH0 == -1) {
                    i12 = i28;
                    i13 = i27;
                    i8 = i11;
                    i14 = i24;
                    i15 = i26;
                    unsafe = unsafe3;
                    i6 = i21;
                    i16 = 0;
                } else {
                    int i30 = y3.f6724a[iH0 + 1];
                    int iT0 = t0(i30);
                    long jW = W(i30);
                    int i31 = i11;
                    if (iT0 <= 17) {
                        int i32 = y3.f6724a[iH0 + 2];
                        int i33 = 1 << (i32 >>> 20);
                        int i34 = 1048575;
                        int i35 = i32 & 1048575;
                        if (i35 != i26) {
                            if (i26 != 1048575) {
                                unsafe3.putInt(obj4, i26, i24);
                                i34 = 1048575;
                            }
                            i15 = i35;
                            i17 = i35 == i34 ? 0 : unsafe3.getInt(obj4, i35);
                        } else {
                            i17 = i24;
                            i15 = i26;
                        }
                        switch (iT0) {
                            case 0:
                                bArr2 = bArr;
                                i12 = i28;
                                i18 = iH0;
                                b3 = -1;
                                if (i29 == 1) {
                                    z0.R(obj4, jW, AbstractC0788f.e(bArr2, i27));
                                    iG = i27 + 8;
                                    i24 = i17 | i33;
                                    i21 = i5;
                                    i22 = i18;
                                    bArr4 = bArr2;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            case 1:
                                bArr2 = bArr;
                                i12 = i28;
                                i18 = iH0;
                                b3 = -1;
                                if (i29 == 5) {
                                    z0.S(obj4, jW, AbstractC0788f.l(bArr2, i27));
                                    iG = i27 + 4;
                                    i24 = i17 | i33;
                                    i21 = i5;
                                    i22 = i18;
                                    bArr4 = bArr2;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i12 = i28;
                                i18 = iH0;
                                j3 = jW;
                                b3 = -1;
                                if (i29 == 0) {
                                    iL = AbstractC0788f.L(bArr3, i27, aVar2);
                                    unsafe2 = unsafe3;
                                    obj3 = obj;
                                    jD = aVar2.f6762b;
                                    unsafe2.putLong(obj3, j3, jD);
                                    i24 = i17 | i33;
                                    i21 = i5;
                                    i22 = i18;
                                    bArr4 = bArr3;
                                    iG = iL;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i12 = i28;
                                i18 = iH0;
                                b3 = -1;
                                if (i29 == 0) {
                                    iG = AbstractC0788f.I(bArr2, i27, aVar2);
                                    iC = aVar2.f6761a;
                                    j4 = jW;
                                    unsafe3.putInt(obj4, j4, iC);
                                    i24 = i17 | i33;
                                    i21 = i5;
                                    i22 = i18;
                                    bArr4 = bArr2;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i12 = i28;
                                i18 = iH0;
                                b3 = -1;
                                if (i29 == 1) {
                                    unsafe3.putLong(obj, jW, AbstractC0788f.j(bArr2, i27));
                                    iG = i27 + 8;
                                    i24 = i17 | i33;
                                    i21 = i5;
                                    i22 = i18;
                                    bArr4 = bArr2;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i12 = i28;
                                i18 = iH0;
                                b3 = -1;
                                if (i29 == 5) {
                                    unsafe3.putInt(obj4, jW, AbstractC0788f.h(bArr2, i27));
                                    iG = i27 + 4;
                                    i24 = i17 | i33;
                                    i21 = i5;
                                    i22 = i18;
                                    bArr4 = bArr2;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i12 = i28;
                                i18 = iH0;
                                b3 = -1;
                                if (i29 == 0) {
                                    iG = AbstractC0788f.L(bArr2, i27, aVar2);
                                    z0.L(obj4, jW, aVar2.f6762b != 0);
                                    i24 = i17 | i33;
                                    i21 = i5;
                                    i22 = i18;
                                    bArr4 = bArr2;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i12 = i28;
                                i18 = iH0;
                                j5 = jW;
                                b3 = -1;
                                if (i29 == 2) {
                                    iG = z(i30) ? AbstractC0788f.F(bArr2, i27, aVar2) : AbstractC0788f.C(bArr2, i27, aVar2);
                                    unsafe3.putObject(obj4, j5, aVar2.f6763c);
                                    i24 = i17 | i33;
                                    i21 = i5;
                                    i22 = i18;
                                    bArr4 = bArr2;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                                bArr2 = bArr;
                                i12 = i28;
                                i18 = iH0;
                                b3 = -1;
                                if (i29 == 2) {
                                    Object objQ = y3.Q(obj4, i18);
                                    iG = AbstractC0788f.O(objQ, y3.v(i18), bArr, i27, i4, aVar);
                                    y3.r0(obj4, i18, objQ);
                                    i24 = i17 | i33;
                                    i21 = i5;
                                    i22 = i18;
                                    bArr4 = bArr2;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                                bArr2 = bArr;
                                i12 = i28;
                                i18 = iH0;
                                j5 = jW;
                                b3 = -1;
                                if (i29 == 2) {
                                    iG = AbstractC0788f.c(bArr2, i27, aVar2);
                                    unsafe3.putObject(obj4, j5, aVar2.f6763c);
                                    i24 = i17 | i33;
                                    i21 = i5;
                                    i22 = i18;
                                    bArr4 = bArr2;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                bArr2 = bArr;
                                i12 = i28;
                                i18 = iH0;
                                b3 = -1;
                                if (i29 == 0) {
                                    iG = AbstractC0788f.I(bArr2, i27, aVar2);
                                    int i36 = aVar2.f6761a;
                                    y3.t(i18);
                                    D(i30);
                                    unsafe3.putInt(obj4, jW, i36);
                                    i24 = i17 | i33;
                                    i21 = i5;
                                    i22 = i18;
                                    bArr4 = bArr2;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i12 = i28;
                                i18 = iH0;
                                j4 = jW;
                                b3 = -1;
                                if (i29 == 0) {
                                    iG = AbstractC0788f.I(bArr2, i27, aVar2);
                                    iC = AbstractC0792j.c(aVar2.f6761a);
                                    unsafe3.putInt(obj4, j4, iC);
                                    i24 = i17 | i33;
                                    i21 = i5;
                                    i22 = i18;
                                    bArr4 = bArr2;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            case 16:
                                i12 = i28;
                                i18 = iH0;
                                b3 = -1;
                                bArr3 = bArr;
                                if (i29 == 0) {
                                    j3 = jW;
                                    iL = AbstractC0788f.L(bArr3, i27, aVar2);
                                    jD = AbstractC0792j.d(aVar2.f6762b);
                                    unsafe2 = unsafe3;
                                    obj3 = obj;
                                    unsafe2.putLong(obj3, j3, jD);
                                    i24 = i17 | i33;
                                    i21 = i5;
                                    i22 = i18;
                                    bArr4 = bArr3;
                                    iG = iL;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (i29 == 3) {
                                    Object objQ2 = y3.Q(obj4, iH0);
                                    i12 = i28;
                                    iG = AbstractC0788f.N(objQ2, y3.v(iH0), bArr, i27, i4, (i28 << 3) | 4, aVar);
                                    y3.r0(obj4, iH0, objQ2);
                                    i24 = i17 | i33;
                                    bArr4 = bArr;
                                    i21 = i5;
                                    i22 = iH0;
                                    i23 = i31;
                                    i26 = i15;
                                    i25 = i12;
                                } else {
                                    i12 = i28;
                                    b3 = -1;
                                    i18 = iH0;
                                    i6 = i5;
                                    i13 = i27;
                                    unsafe = unsafe3;
                                    i14 = i17;
                                    i8 = i31;
                                    i16 = i18;
                                }
                                break;
                            default:
                                i12 = i28;
                                i18 = iH0;
                                b3 = -1;
                                i6 = i5;
                                i13 = i27;
                                unsafe = unsafe3;
                                i14 = i17;
                                i8 = i31;
                                i16 = i18;
                                break;
                        }
                    } else {
                        i12 = i28;
                        int i37 = i26;
                        i14 = i24;
                        if (iT0 != 27) {
                            i15 = i37;
                            if (iT0 <= 49) {
                                int i38 = i27;
                                unsafe = unsafe3;
                                i16 = iH0;
                                iG = f0(obj, bArr, i27, i4, i31, i12, i29, iH0, i30, iT0, jW, aVar);
                                if (iG != i38) {
                                    y3 = this;
                                    obj4 = obj;
                                    bArr4 = bArr;
                                    i20 = i4;
                                    i21 = i5;
                                    aVar2 = aVar;
                                    i22 = i16;
                                    i23 = i31;
                                    i24 = i14;
                                    i26 = i15;
                                    i25 = i12;
                                    unsafe3 = unsafe;
                                } else {
                                    i6 = i5;
                                    i13 = iG;
                                }
                            } else {
                                i19 = i27;
                                unsafe = unsafe3;
                                i16 = iH0;
                                if (iT0 != 50) {
                                    iG = e0(obj, bArr, i19, i4, i31, i12, i29, i30, iT0, jW, i16, aVar);
                                    if (iG != i19) {
                                        y3 = this;
                                        obj4 = obj;
                                        bArr4 = bArr;
                                        i20 = i4;
                                        i21 = i5;
                                        aVar2 = aVar;
                                        i22 = i16;
                                        i23 = i31;
                                        i24 = i14;
                                        i26 = i15;
                                        i25 = i12;
                                        unsafe3 = unsafe;
                                    } else {
                                        i6 = i5;
                                        i13 = iG;
                                    }
                                } else if (i29 == 2) {
                                    iG = c0(obj, bArr, i19, i4, i16, jW, aVar);
                                    if (iG != i19) {
                                        y3 = this;
                                        obj4 = obj;
                                        bArr4 = bArr;
                                        i20 = i4;
                                        i21 = i5;
                                        aVar2 = aVar;
                                        i22 = i16;
                                        i23 = i31;
                                        i24 = i14;
                                        i26 = i15;
                                        i25 = i12;
                                        unsafe3 = unsafe;
                                    } else {
                                        i6 = i5;
                                        i13 = iG;
                                    }
                                } else {
                                    i6 = i5;
                                    i13 = i19;
                                }
                            }
                        } else if (i29 == 2) {
                            C.e eVarE = (C.e) unsafe3.getObject(obj4, jW);
                            if (!eVarE.g()) {
                                int size = eVarE.size();
                                eVarE = eVarE.e(size == 0 ? 10 : size * 2);
                                unsafe3.putObject(obj4, jW, eVarE);
                            }
                            iG = AbstractC0788f.q(y3.v(iH0), i31, bArr, i27, i4, eVarE, aVar);
                            i21 = i5;
                            i22 = iH0;
                            i23 = i31;
                            i24 = i14;
                            i26 = i37;
                            i25 = i12;
                            bArr4 = bArr;
                        } else {
                            i15 = i37;
                            i19 = i27;
                            unsafe = unsafe3;
                            i16 = iH0;
                            i6 = i5;
                            i13 = i19;
                        }
                        i8 = i31;
                    }
                }
                if (i8 != i6 || i6 == 0) {
                    iG = (!this.f6729f || aVar.f6764d == C0799q.b()) ? AbstractC0788f.G(i8, bArr, i13, i4, w(obj), aVar) : AbstractC0788f.g(i8, bArr, i13, i4, obj, this.f6728e, this.f6738o, aVar);
                    obj4 = obj;
                    bArr4 = bArr;
                    i20 = i4;
                    i23 = i8;
                    y3 = this;
                    aVar2 = aVar;
                    i22 = i16;
                    i24 = i14;
                    i26 = i15;
                    i25 = i12;
                    unsafe3 = unsafe;
                    i21 = i6;
                } else {
                    i10 = 1048575;
                    y2 = this;
                    i7 = i13;
                    i24 = i14;
                    i9 = i15;
                }
            } else {
                int i39 = i26;
                unsafe = unsafe3;
                i6 = i21;
                y2 = y3;
                i7 = iG;
                i8 = i23;
                i9 = i39;
                i10 = 1048575;
            }
        }
        if (i9 != i10) {
            obj2 = obj;
            unsafe.putInt(obj2, i9, i24);
        } else {
            obj2 = obj;
        }
        w0 w0Var = null;
        for (int i40 = y2.f6734k; i40 < y2.f6735l; i40++) {
            w0Var = (w0) r(obj, y2.f6733j[i40], w0Var, y2.f6738o, obj);
        }
        if (w0Var != null) {
            y2.f6738o.o(obj2, w0Var);
        }
        if (i6 == 0) {
            if (i7 != i4) {
                throw D.h();
            }
        } else if (i7 > i4 || i8 != i6) {
            throw D.h();
        }
        return i7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03ab, code lost:
    
        if (B(r19, r11, r14, r16, r17) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03bd, code lost:
    
        if (B(r19, r11, r14, r16, r17) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0454, code lost:
    
        if (B(r19, r11, r14, r16, r17) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (I(r19, r13, r11) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        r0 = com.google.protobuf.AbstractC0794l.I(r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if (I(r19, r13, r11) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        r1 = com.google.protobuf.AbstractC0794l.G(r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
    
        if (I(r19, r13, r11) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0118, code lost:
    
        r0 = com.google.protobuf.AbstractC0794l.e(r13, true);
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
    @Override // com.google.protobuf.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int e(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Y.e(java.lang.Object):int");
    }

    @Override // com.google.protobuf.n0
    public Object f() {
        return this.f6736m.a(this.f6728e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f2 A[PHI: r3
      0x00f2: PHI (r3v8 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:74:0x010e, B:68:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int g(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Y.g(java.lang.Object):int");
    }

    @Override // com.google.protobuf.n0
    public void h(Object obj, C0 c02) {
        if (c02.v() == C0.a.DESCENDING) {
            w0(obj, c02);
        } else {
            v0(obj, c02);
        }
    }

    @Override // com.google.protobuf.n0
    public void i(Object obj, l0 l0Var, C0799q c0799q) throws Throwable {
        c0799q.getClass();
        m(obj);
        L(this.f6738o, this.f6739p, obj, l0Var, c0799q);
    }

    @Override // com.google.protobuf.n0
    public void j(Object obj, byte[] bArr, int i3, int i4, AbstractC0788f.a aVar) {
        d0(obj, bArr, i3, i4, 0, aVar);
    }
}
