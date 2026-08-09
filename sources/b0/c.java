package B0;

import D0.u;
import D0.z;
import V0.C0423b;
import V0.I;
import V0.x;
import a1.C0473a;
import com.google.android.gms.common.api.a;
import com.google.protobuf.t0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f541a = new c();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f542a;

        static {
            int[] iArr = new int[I.c.values().length];
            f542a = iArr;
            try {
                iArr[I.c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f542a[I.c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f542a[I.c.DOUBLE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f542a[I.c.INTEGER_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f542a[I.c.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f542a[I.c.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f542a[I.c.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f542a[I.c.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f542a[I.c.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f542a[I.c.MAP_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f542a[I.c.ARRAY_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private c() {
    }

    private void a(C0423b c0423b, b bVar) {
        j(bVar, 50);
        Iterator it = c0423b.g().iterator();
        while (it.hasNext()) {
            f((I) it.next(), bVar);
        }
    }

    private void b(String str, b bVar) {
        j(bVar, 37);
        u uVarB = u.B(str);
        int iW = uVarB.w();
        for (int i3 = 5; i3 < iW; i3++) {
            String strT = uVarB.t(i3);
            j(bVar, 60);
            i(strT, bVar);
        }
    }

    private void c(x xVar, b bVar) {
        j(bVar, 55);
        for (Map.Entry entry : xVar.d0().entrySet()) {
            String str = (String) entry.getKey();
            I i3 = (I) entry.getValue();
            d(str, bVar);
            f(i3, bVar);
        }
    }

    private void d(String str, b bVar) {
        j(bVar, 25);
        i(str, bVar);
    }

    private void f(I i3, b bVar) {
        int i4;
        long jD0;
        double dW0;
        switch (a.f542a[i3.B0().ordinal()]) {
            case 1:
                i4 = 5;
                j(bVar, i4);
                return;
            case 2:
                j(bVar, 10);
                jD0 = i3.p0() ? 1L : 0L;
                bVar.d(jD0);
                return;
            case 3:
                double dS0 = i3.s0();
                if (Double.isNaN(dS0)) {
                    i4 = 13;
                    j(bVar, i4);
                    return;
                }
                j(bVar, 15);
                if (dS0 != -0.0d) {
                    bVar.b(dS0);
                    return;
                } else {
                    dW0 = 0.0d;
                    bVar.b(dW0);
                    return;
                }
            case 4:
                j(bVar, 15);
                dW0 = i3.w0();
                bVar.b(dW0);
                return;
            case 5:
                t0 t0VarA0 = i3.A0();
                j(bVar, 20);
                bVar.d(t0VarA0.e0());
                jD0 = t0VarA0.d0();
                bVar.d(jD0);
                return;
            case 6:
                d(i3.z0(), bVar);
                h(bVar);
                return;
            case 7:
                j(bVar, 30);
                bVar.a(i3.q0());
                h(bVar);
                return;
            case 8:
                b(i3.y0(), bVar);
                return;
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                C0473a c0473aV0 = i3.v0();
                j(bVar, 45);
                bVar.b(c0473aV0.d0());
                dW0 = c0473aV0.e0();
                bVar.b(dW0);
                return;
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                if (z.U(i3)) {
                    i4 = a.e.API_PRIORITY_OTHER;
                    j(bVar, i4);
                    return;
                }
                boolean Z2 = z.Z(i3);
                x xVarX0 = i3.x0();
                if (Z2) {
                    g(xVarX0, bVar);
                    return;
                } else {
                    c(xVarX0, bVar);
                    h(bVar);
                    return;
                }
            case 11:
                a(i3.o0(), bVar);
                h(bVar);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type " + i3.B0());
        }
    }

    private void g(x xVar, b bVar) {
        Map mapD0 = xVar.d0();
        j(bVar, 53);
        int iI0 = ((I) mapD0.get("value")).o0().i0();
        j(bVar, 15);
        bVar.d(iI0);
        d("value", bVar);
        f((I) mapD0.get("value"), bVar);
    }

    private void h(b bVar) {
        bVar.d(2L);
    }

    private void i(String str, b bVar) {
        bVar.e(str);
    }

    private void j(b bVar, int i3) {
        bVar.d(i3);
    }

    public void e(I i3, b bVar) {
        f(i3, bVar);
        bVar.c();
    }
}
