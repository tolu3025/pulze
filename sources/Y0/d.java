package Y0;

import V0.F;
import V0.I;
import Y0.o;

/* JADX INFO: loaded from: classes.dex */
class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f3271b = {0, 9, 11, 1114111};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f3272c = {0, 1114111};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f3273a = new m();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3274a;

        static {
            int[] iArr = new int[o.b.values().length];
            f3274a = iArr;
            try {
                iArr[o.b.NO_MATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3274a[o.b.EMPTY_MATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3274a[o.b.LITERAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3274a[o.b.CHAR_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3274a[o.b.ANY_CHAR_NOT_NL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3274a[o.b.ANY_CHAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3274a[o.b.BEGIN_LINE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3274a[o.b.END_LINE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3274a[o.b.BEGIN_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3274a[o.b.END_TEXT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3274a[o.b.WORD_BOUNDARY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3274a[o.b.NO_WORD_BOUNDARY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3274a[o.b.CAPTURE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3274a[o.b.STAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3274a[o.b.PLUS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3274a[o.b.QUEST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3274a[o.b.CONCAT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3274a[o.b.ALTERNATE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f3275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3276b;

        b() {
            this(0, 0);
        }

        b(int i3) {
            this(i3, 0);
        }

        b(int i3, int i4) {
            this.f3275a = i3;
            this.f3276b = i4;
        }
    }

    private d() {
        h(5);
    }

    private b a(b bVar, b bVar2) {
        if (bVar.f3275a == 0) {
            return bVar2;
        }
        if (bVar2.f3275a == 0) {
            return bVar;
        }
        b bVarH = h(1);
        e eVarC = this.f3273a.c(bVarH.f3275a);
        eVarC.f3278b = bVar.f3275a;
        eVarC.f3279c = bVar2.f3275a;
        bVarH.f3276b = this.f3273a.b(bVar.f3276b, bVar2.f3276b);
        return bVarH;
    }

    private b b(int i3) {
        b bVarH = h(3);
        int i4 = bVarH.f3275a;
        bVarH.f3276b = i4 << 1;
        this.f3273a.c(i4).f3279c = i3;
        m mVar = this.f3273a;
        int i5 = i3 + 1;
        if (mVar.f3336d < i5) {
            mVar.f3336d = i5;
        }
        return bVarH;
    }

    private b c(b bVar, b bVar2) {
        int i3;
        if (bVar.f3275a == 0 || (i3 = bVar2.f3275a) == 0) {
            return g();
        }
        this.f3273a.f(bVar.f3276b, i3);
        return new b(bVar.f3275a, bVar2.f3276b);
    }

    private b d(o oVar) {
        b bVarC = null;
        int i3 = 0;
        switch (a.f3274a[oVar.f3349a.ordinal()]) {
            case 1:
                return g();
            case 2:
                return i();
            case 3:
                int[] iArr = oVar.f3352d;
                if (iArr.length == 0) {
                    return i();
                }
                int length = iArr.length;
                while (i3 < length) {
                    b bVarL = l(iArr[i3], oVar.f3350b);
                    bVarC = bVarC == null ? bVarL : c(bVarC, bVarL);
                    i3++;
                }
                return bVarC;
            case 4:
                return m(oVar.f3352d, oVar.f3350b);
            case 5:
                return m(f3271b, 0);
            case 6:
                return m(f3272c, 0);
            case 7:
                return f(1);
            case 8:
                return f(2);
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return f(4);
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return f(8);
            case 11:
                return f(16);
            case F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return f(32);
            case 13:
                return c(c(b(oVar.f3355g << 1), d(oVar.f3351c[0])), b((oVar.f3355g << 1) | 1));
            case 14:
                return n(d(oVar.f3351c[0]), (oVar.f3350b & 32) != 0);
            case 15:
                return j(d(oVar.f3351c[0]), (oVar.f3350b & 32) != 0);
            case 16:
                return k(d(oVar.f3351c[0]), (oVar.f3350b & 32) != 0);
            case I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                o[] oVarArr = oVar.f3351c;
                if (oVarArr.length == 0) {
                    return i();
                }
                int length2 = oVarArr.length;
                while (i3 < length2) {
                    b bVarD = d(oVarArr[i3]);
                    bVarC = bVarC == null ? bVarD : c(bVarC, bVarD);
                    i3++;
                }
                return bVarC;
            case I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                o[] oVarArr2 = oVar.f3351c;
                if (oVarArr2.length == 0) {
                    return i();
                }
                int length3 = oVarArr2.length;
                while (i3 < length3) {
                    b bVarD2 = d(oVarArr2[i3]);
                    bVarC = bVarC == null ? bVarD2 : a(bVarC, bVarD2);
                    i3++;
                }
                return bVarC;
            default:
                throw new IllegalStateException("regexp: unhandled case in compile");
        }
    }

    static m e(o oVar) {
        d dVar = new d();
        b bVarD = dVar.d(oVar);
        dVar.f3273a.f(bVarD.f3276b, dVar.h(6).f3275a);
        m mVar = dVar.f3273a;
        mVar.f3335c = bVarD.f3275a;
        return mVar;
    }

    private b f(int i3) {
        b bVarH = h(4);
        this.f3273a.c(bVarH.f3275a).f3279c = i3;
        bVarH.f3276b = bVarH.f3275a << 1;
        return bVarH;
    }

    private b g() {
        return new b();
    }

    private b h(int i3) {
        this.f3273a.a(i3);
        return new b(this.f3273a.e() - 1);
    }

    private b i() {
        b bVarH = h(7);
        bVarH.f3276b = bVarH.f3275a << 1;
        return bVarH;
    }

    private b j(b bVar, boolean z2) {
        return new b(bVar.f3275a, n(bVar, z2).f3276b);
    }

    private b k(b bVar, boolean z2) {
        int i3;
        b bVarH = h(1);
        e eVarC = this.f3273a.c(bVarH.f3275a);
        if (z2) {
            eVarC.f3279c = bVar.f3275a;
            i3 = bVarH.f3275a << 1;
        } else {
            eVarC.f3278b = bVar.f3275a;
            i3 = (bVarH.f3275a << 1) | 1;
        }
        bVarH.f3276b = i3;
        bVarH.f3276b = this.f3273a.b(bVarH.f3276b, bVar.f3276b);
        return bVarH;
    }

    private b l(int i3, int i4) {
        return m(new int[]{i3}, i4);
    }

    private b m(int[] iArr, int i3) {
        b bVarH = h(8);
        e eVarC = this.f3273a.c(bVarH.f3275a);
        eVarC.f3280d = iArr;
        int i4 = i3 & 1;
        if (iArr.length != 1 || q.d(iArr[0]) == iArr[0]) {
            i4 = 0;
        }
        eVarC.f3279c = i4;
        bVarH.f3276b = bVarH.f3275a << 1;
        if (((i4 & 1) == 0 && iArr.length == 1) || (iArr.length == 2 && iArr[0] == iArr[1])) {
            eVarC.f3277a = 9;
        } else if (iArr.length == 2 && iArr[0] == 0 && iArr[1] == 1114111) {
            eVarC.f3277a = 10;
        } else if (iArr.length == 4 && iArr[0] == 0 && iArr[1] == 9 && iArr[2] == 11 && iArr[3] == 1114111) {
            eVarC.f3277a = 11;
        }
        return bVarH;
    }

    private b n(b bVar, boolean z2) {
        int i3;
        b bVarH = h(1);
        e eVarC = this.f3273a.c(bVarH.f3275a);
        if (z2) {
            eVarC.f3279c = bVar.f3275a;
            i3 = bVarH.f3275a << 1;
        } else {
            eVarC.f3278b = bVar.f3275a;
            i3 = (bVarH.f3275a << 1) | 1;
        }
        bVarH.f3276b = i3;
        this.f3273a.f(bVar.f3276b, bVarH.f3275a);
        return bVarH;
    }
}
