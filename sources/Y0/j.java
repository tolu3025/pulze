package Y0;

import Y0.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[][] f3316g = {new int[]{0, 1114111, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3318b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f3320d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f3319c = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3321e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f3322f = new HashMap();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3323a;

        static {
            int[] iArr = new int[o.b.values().length];
            f3323a = iArr;
            try {
                iArr[o.b.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3323a[o.b.CHAR_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3323a[o.b.ANY_CHAR_NOT_NL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3323a[o.b.ANY_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f3324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f3325b;

        b(Object obj, Object obj2) {
            this.f3324a = obj;
            this.f3325b = obj2;
        }

        static b a(Object obj, Object obj2) {
            return new b(obj, obj2);
        }
    }

    private static class c extends ArrayList {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // java.util.ArrayList, java.util.AbstractList
        public void removeRange(int i3, int i4) {
            super.removeRange(i3, i4);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f3326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3327b = 0;

        d(String str) {
            this.f3326a = str;
        }

        String a(int i3) {
            return this.f3326a.substring(i3, this.f3327b);
        }

        boolean b(char c3) {
            return this.f3326a.charAt(this.f3327b) == c3;
        }

        boolean c(String str) {
            return h().startsWith(str);
        }

        boolean d() {
            return this.f3327b < this.f3326a.length();
        }

        int e() {
            return this.f3326a.codePointAt(this.f3327b);
        }

        int f() {
            int iCodePointAt = this.f3326a.codePointAt(this.f3327b);
            this.f3327b += Character.charCount(iCodePointAt);
            return iCodePointAt;
        }

        int g() {
            return this.f3327b;
        }

        String h() {
            return this.f3326a.substring(this.f3327b);
        }

        void i(int i3) {
            this.f3327b = i3;
        }

        void j(int i3) {
            this.f3327b += i3;
        }

        void k(String str) {
            this.f3327b += str.length();
        }

        public String toString() {
            return h();
        }
    }

    j(String str, int i3) {
        this.f3317a = str;
        this.f3318b = i3;
    }

    private void A(d dVar) {
        int iG = dVar.g();
        String strH = dVar.h();
        if (strH.startsWith("(?P<")) {
            int iIndexOf = strH.indexOf(62);
            if (iIndexOf < 0) {
                throw new l("invalid named capture", strH);
            }
            String strSubstring = strH.substring(4, iIndexOf);
            dVar.k(strSubstring);
            dVar.j(5);
            if (!h(strSubstring)) {
                throw new l("invalid named capture", strH.substring(0, iIndexOf));
            }
            o oVarR = r(o.b.LEFT_PAREN);
            int i3 = this.f3321e + 1;
            this.f3321e = i3;
            oVarR.f3355g = i3;
            if (this.f3322f.put(strSubstring, Integer.valueOf(i3)) != null) {
                throw new l("duplicate capture group name", strSubstring);
            }
            oVarR.f3356h = strSubstring;
            return;
        }
        dVar.j(2);
        int i4 = this.f3318b;
        boolean z2 = false;
        byte b3 = 1;
        while (dVar.d()) {
            int iF = dVar.f();
            if (iF != 41) {
                if (iF == 45) {
                    if (b3 < 0) {
                        break;
                    }
                    i4 = ~i4;
                    b3 = -1;
                    z2 = false;
                } else if (iF != 58) {
                    if (iF == 85) {
                        i4 |= 32;
                    } else if (iF == 105) {
                        i4 |= 1;
                    } else if (iF == 109) {
                        i4 &= -17;
                    } else if (iF != 115) {
                        break;
                    } else {
                        i4 |= 8;
                    }
                    z2 = true;
                }
            }
            if (b3 < 0) {
                if (z2) {
                    i4 = ~i4;
                }
            }
            if (iF == 58) {
                r(o.b.LEFT_PAREN);
            }
            this.f3318b = i4;
            return;
        }
        throw new l("invalid or unsupported Perl syntax", dVar.a(iG));
    }

    private static int B(d dVar) {
        int iW;
        int iG = dVar.g();
        if (dVar.d() && dVar.b('{')) {
            dVar.j(1);
            int iW2 = w(dVar);
            if (iW2 == -1 || !dVar.d()) {
                return -1;
            }
            if (dVar.b(',')) {
                dVar.j(1);
                if (!dVar.d()) {
                    return -1;
                }
                if (dVar.b('}')) {
                    iW = -1;
                } else {
                    iW = w(dVar);
                    if (iW == -1) {
                        return -1;
                    }
                }
            } else {
                iW = iW2;
            }
            if (dVar.d() && dVar.b('}')) {
                dVar.j(1);
                if (iW2 < 0 || iW2 > 1000 || iW == -2 || iW > 1000 || (iW >= 0 && iW2 > iW)) {
                    throw new l("invalid repeat count", dVar.a(iG));
                }
                return (iW2 << 16) | (65535 & iW);
            }
        }
        return -1;
    }

    private void C() {
        d();
        if (N()) {
            F();
        }
        a();
        if (this.f3319c.size() < 2) {
            throw new l("regexp/syntax: internal error", "stack underflow");
        }
        o oVarF = F();
        o oVarF2 = F();
        if (oVarF2.f3349a != o.b.LEFT_PAREN) {
            throw new l("missing closing )", this.f3317a);
        }
        this.f3318b = oVarF2.f3350b;
        if (oVarF2.f3355g == 0) {
            H(oVarF);
            return;
        }
        oVarF2.f3349a = o.b.CAPTURE;
        oVarF2.f3351c = new o[]{oVarF};
        H(oVarF2);
    }

    private boolean D(d dVar, Y0.a aVar) {
        String strSubstring;
        int iG = dVar.g();
        if ((this.f3318b & 128) == 0 || !(dVar.c("\\p") || dVar.c("\\P"))) {
            return false;
        }
        dVar.j(1);
        int i3 = dVar.f() == 80 ? -1 : 1;
        if (!dVar.d()) {
            dVar.i(iG);
            throw new l("invalid character class range", dVar.h());
        }
        int iF = dVar.f();
        if (iF != 123) {
            strSubstring = s.f(iF);
        } else {
            String strH = dVar.h();
            int iIndexOf = strH.indexOf(125);
            if (iIndexOf < 0) {
                dVar.i(iG);
                throw new l("invalid character class range", dVar.h());
            }
            strSubstring = strH.substring(0, iIndexOf);
            dVar.k(strSubstring);
            dVar.j(1);
        }
        if (!strSubstring.isEmpty() && strSubstring.charAt(0) == '^') {
            i3 = -i3;
            strSubstring = strSubstring.substring(1);
        }
        b bVarO = O(strSubstring);
        if (bVarO == null) {
            throw new l("invalid character class range", dVar.a(iG));
        }
        int[][] iArr = (int[][]) bVarO.f3324a;
        int[][] iArr2 = (int[][]) bVarO.f3325b;
        if ((this.f3318b & 1) == 0 || iArr2 == null) {
            aVar.k(iArr, i3);
        } else {
            aVar.b(new Y0.a().j(iArr).j(iArr2).m().r(), i3);
        }
        return true;
    }

    private void E() {
        d();
        if (N()) {
            return;
        }
        r(o.b.VERTICAL_BAR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private o F() {
        return (o) this.f3319c.remove(r0.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private o[] G() {
        int size = this.f3319c.size();
        int i3 = size;
        while (i3 > 0 && !((o) this.f3319c.get(i3 - 1)).f3349a.c()) {
            i3--;
        }
        o[] oVarArr = (o[]) this.f3319c.subList(i3, size).toArray(new o[size - i3]);
        this.f3319c.removeRange(i3, size);
        return oVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (Y0.q.d(r1) == r10.f3352d[0]) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private Y0.o H(Y0.o r10) {
        /*
            r9 = this;
            Y0.o$b r0 = r10.f3349a
            Y0.o$b r1 = Y0.o.b.CHAR_CLASS
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 != r1) goto L36
            int[] r6 = r10.f3352d
            int r7 = r6.length
            if (r7 != r3) goto L36
            r7 = r6[r5]
            r6 = r6[r4]
            if (r7 != r6) goto L36
            int r0 = r9.f3318b
            r0 = r0 & (-2)
            boolean r0 = r9.m(r7, r0)
            if (r0 == 0) goto L20
            return r2
        L20:
            Y0.o$b r0 = Y0.o.b.LITERAL
            r10.f3349a = r0
            int[] r0 = r10.f3352d
            r0 = r0[r5]
            int[] r0 = new int[]{r0}
            r10.f3352d = r0
            int r0 = r9.f3318b
            r0 = r0 & (-2)
        L32:
            r10.f3350b = r0
            goto La8
        L36:
            if (r0 != r1) goto L5f
            int[] r0 = r10.f3352d
            int r6 = r0.length
            r7 = 4
            if (r6 != r7) goto L5f
            r6 = r0[r5]
            r7 = r0[r4]
            if (r6 != r7) goto L5f
            r7 = r0[r3]
            r8 = 3
            r0 = r0[r8]
            if (r7 != r0) goto L5f
            int r0 = Y0.q.d(r6)
            int[] r6 = r10.f3352d
            r6 = r6[r3]
            if (r0 != r6) goto L5f
            int r0 = Y0.q.d(r6)
            int[] r6 = r10.f3352d
            r6 = r6[r5]
            if (r0 == r6) goto L84
        L5f:
            Y0.o$b r0 = r10.f3349a
            if (r0 != r1) goto La4
            int[] r0 = r10.f3352d
            int r1 = r0.length
            if (r1 != r3) goto La4
            r1 = r0[r5]
            int r3 = r1 + 1
            r0 = r0[r4]
            if (r3 != r0) goto La4
            int r0 = Y0.q.d(r1)
            int[] r1 = r10.f3352d
            r1 = r1[r4]
            if (r0 != r1) goto La4
            int r0 = Y0.q.d(r1)
            int[] r1 = r10.f3352d
            r1 = r1[r5]
            if (r0 != r1) goto La4
        L84:
            int[] r0 = r10.f3352d
            r0 = r0[r5]
            int r1 = r9.f3318b
            r1 = r1 | r4
            boolean r0 = r9.m(r0, r1)
            if (r0 == 0) goto L92
            return r2
        L92:
            Y0.o$b r0 = Y0.o.b.LITERAL
            r10.f3349a = r0
            int[] r0 = r10.f3352d
            r0 = r0[r5]
            int[] r0 = new int[]{r0}
            r10.f3352d = r0
            int r0 = r9.f3318b
            r0 = r0 | r4
            goto L32
        La4:
            r0 = -1
            r9.m(r0, r5)
        La8:
            Y0.j$c r0 = r9.f3319c
            r0.add(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.j.H(Y0.o):Y0.o");
    }

    private o I(o oVar, boolean z2) {
        if (oVar.f3349a == o.b.CONCAT) {
            o[] oVarArr = oVar.f3351c;
            if (oVarArr.length > 0) {
                if (z2) {
                    L(oVarArr[0]);
                }
                o[] oVarArr2 = oVar.f3351c;
                o[] oVarArrM = M(oVarArr2, 1, oVarArr2.length);
                oVar.f3351c = oVarArrM;
                int length = oVarArrM.length;
                if (length == 0) {
                    oVar.f3349a = o.b.EMPTY_MATCH;
                    oVar.f3351c = o.f3348j;
                    return oVar;
                }
                if (length != 1) {
                    return oVar;
                }
                o oVar2 = oVarArrM[0];
                L(oVar);
                return oVar2;
            }
        }
        if (z2) {
            L(oVar);
        }
        return q(o.b.EMPTY_MATCH);
    }

    private o J(o oVar, int i3) {
        o.b bVar = oVar.f3349a;
        if (bVar == o.b.CONCAT) {
            o[] oVarArr = oVar.f3351c;
            if (oVarArr.length > 0) {
                o oVarJ = J(oVarArr[0], i3);
                oVar.f3351c[0] = oVarJ;
                o.b bVar2 = oVarJ.f3349a;
                o.b bVar3 = o.b.EMPTY_MATCH;
                if (bVar2 != bVar3) {
                    return oVar;
                }
                L(oVarJ);
                o[] oVarArr2 = oVar.f3351c;
                int length = oVarArr2.length;
                if (length == 0 || length == 1) {
                    oVar.f3349a = bVar3;
                    oVar.f3351c = null;
                    return oVar;
                }
                if (length != 2) {
                    oVar.f3351c = M(oVarArr2, 1, oVarArr2.length);
                    return oVar;
                }
                o oVar2 = oVarArr2[1];
                L(oVar);
                return oVar2;
            }
        }
        if (bVar == o.b.LITERAL) {
            int[] iArr = oVar.f3352d;
            int[] iArrH = s.h(iArr, i3, iArr.length);
            oVar.f3352d = iArrH;
            if (iArrH.length == 0) {
                oVar.f3349a = o.b.EMPTY_MATCH;
            }
        }
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K(o.b bVar, int i3, int i4, int i5, d dVar, int i6) {
        int i7 = this.f3318b;
        if ((i7 & 64) != 0) {
            if (dVar.d() && dVar.b('?')) {
                dVar.j(1);
                i7 ^= 32;
            }
            if (i6 != -1) {
                throw new l("invalid nested repetition operator", dVar.a(i6));
            }
        }
        int size = this.f3319c.size();
        if (size == 0) {
            throw new l("missing argument to repetition operator", dVar.a(i5));
        }
        int i8 = size - 1;
        o oVar = (o) this.f3319c.get(i8);
        if (oVar.f3349a.c()) {
            throw new l("missing argument to repetition operator", dVar.a(i5));
        }
        o oVarQ = q(bVar);
        oVarQ.f3353e = i3;
        oVarQ.f3354f = i4;
        oVarQ.f3350b = i7;
        oVarQ.f3351c = new o[]{oVar};
        this.f3319c.set(i8, oVarQ);
    }

    private void L(o oVar) {
        o[] oVarArr = oVar.f3351c;
        if (oVarArr != null && oVarArr.length > 0) {
            oVarArr[0] = this.f3320d;
        }
        this.f3320d = oVar;
    }

    static o[] M(o[] oVarArr, int i3, int i4) {
        o[] oVarArr2 = new o[i4 - i3];
        for (int i5 = i3; i5 < i4; i5++) {
            oVarArr2[i5 - i3] = oVarArr[i5];
        }
        return oVarArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean N() {
        int size = this.f3319c.size();
        if (size >= 3 && ((o) this.f3319c.get(size - 2)).f3349a == o.b.VERTICAL_BAR) {
            int i3 = size - 1;
            if (g((o) this.f3319c.get(i3))) {
                int i4 = size - 3;
                if (g((o) this.f3319c.get(i4))) {
                    o oVar = (o) this.f3319c.get(i3);
                    o oVar2 = (o) this.f3319c.get(i4);
                    if (oVar.f3349a.ordinal() > oVar2.f3349a.ordinal()) {
                        this.f3319c.set(i4, oVar);
                    } else {
                        oVar2 = oVar;
                        oVar = oVar2;
                    }
                    n(oVar, oVar2);
                    L(oVar2);
                    F();
                    return true;
                }
            }
        }
        if (size < 2) {
            return false;
        }
        int i5 = size - 1;
        o oVar3 = (o) this.f3319c.get(i5);
        int i6 = size - 2;
        o oVar4 = (o) this.f3319c.get(i6);
        if (oVar4.f3349a != o.b.VERTICAL_BAR) {
            return false;
        }
        if (size >= 3) {
            b((o) this.f3319c.get(size - 3));
        }
        this.f3319c.set(i6, oVar3);
        this.f3319c.set(i5, oVar4);
        return true;
    }

    private static b O(String str) {
        if (str.equals("Any")) {
            int[][] iArr = f3316g;
            return b.a(iArr, iArr);
        }
        int[][] iArr2 = (int[][]) r.f3396E1.get(str);
        if (iArr2 != null) {
            return b.a(iArr2, r.f3426O1.get(str));
        }
        int[][] iArr3 = (int[][]) r.f3399F1.get(str);
        if (iArr3 != null) {
            return b.a(iArr3, r.f3411J1.get(str));
        }
        return null;
    }

    private o a() {
        o[] oVarArrG = G();
        if (oVarArrG.length > 0) {
            b(oVarArrG[oVarArrG.length - 1]);
        }
        return H(oVarArrG.length == 0 ? q(o.b.NO_MATCH) : c(oVarArrG, o.b.ALTERNATE));
    }

    private void b(o oVar) {
        o.b bVar;
        if (oVar.f3349a == o.b.CHAR_CLASS) {
            int[] iArrR = new Y0.a(oVar.f3352d).m().r();
            oVar.f3352d = iArrR;
            if (iArrR.length == 2 && iArrR[0] == 0 && iArrR[1] == 1114111) {
                oVar.f3352d = null;
                bVar = o.b.ANY_CHAR;
            } else {
                if (iArrR.length != 4 || iArrR[0] != 0 || iArrR[1] != 9 || iArrR[2] != 11 || iArrR[3] != 1114111) {
                    return;
                }
                oVar.f3352d = null;
                bVar = o.b.ANY_CHAR_NOT_NL;
            }
            oVar.f3349a = bVar;
        }
    }

    private o c(o[] oVarArr, o.b bVar) {
        if (oVarArr.length == 1) {
            return oVarArr[0];
        }
        int length = 0;
        for (o oVar : oVarArr) {
            length += oVar.f3349a == bVar ? oVar.f3351c.length : 1;
        }
        o[] oVarArr2 = new o[length];
        int length2 = 0;
        for (o oVar2 : oVarArr) {
            if (oVar2.f3349a == bVar) {
                o[] oVarArr3 = oVar2.f3351c;
                System.arraycopy(oVarArr3, 0, oVarArr2, length2, oVarArr3.length);
                length2 += oVar2.f3351c.length;
                L(oVar2);
            } else {
                oVarArr2[length2] = oVar2;
                length2++;
            }
        }
        o oVarQ = q(bVar);
        oVarQ.f3351c = oVarArr2;
        if (bVar != o.b.ALTERNATE) {
            return oVarQ;
        }
        o[] oVarArrF = f(oVarArr2, oVarQ.f3350b);
        oVarQ.f3351c = oVarArrF;
        if (oVarArrF.length != 1) {
            return oVarQ;
        }
        o oVar3 = oVarArrF[0];
        L(oVarQ);
        return oVar3;
    }

    private o d() {
        m(-1, 0);
        o[] oVarArrG = G();
        return H(oVarArrG.length == 0 ? q(o.b.EMPTY_MATCH) : c(oVarArrG, o.b.CONCAT));
    }

    private static int[] e(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private Y0.o[] f(Y0.o[] r17, int r18) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.j.f(Y0.o[], int):Y0.o[]");
    }

    private static boolean g(o oVar) {
        o.b bVar = oVar.f3349a;
        return (bVar == o.b.LITERAL && oVar.f3352d.length == 1) || bVar == o.b.CHAR_CLASS || bVar == o.b.ANY_CHAR_NOT_NL || bVar == o.b.ANY_CHAR;
    }

    private static boolean h(String str) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '_' && !s.e(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    private static o i(o oVar) {
        o.b bVar = oVar.f3349a;
        o.b bVar2 = o.b.EMPTY_MATCH;
        if (bVar == bVar2) {
            return null;
        }
        if (bVar == o.b.CONCAT) {
            o[] oVarArr = oVar.f3351c;
            if (oVarArr.length > 0) {
                oVar = oVarArr[0];
                if (oVar.f3349a == bVar2) {
                    return null;
                }
            }
        }
        return oVar;
    }

    private void j(int i3) {
        H(p(i3, this.f3318b));
    }

    private static o k(String str, int i3) {
        o oVar = new o(o.b.LITERAL);
        oVar.f3350b = i3;
        oVar.f3352d = s.g(str);
        return oVar;
    }

    private static boolean l(o oVar, int i3) {
        int i4 = a.f3323a[oVar.f3349a.ordinal()];
        if (i4 == 1) {
            int[] iArr = oVar.f3352d;
            return iArr.length == 1 && iArr[0] == i3;
        }
        if (i4 != 2) {
            return i4 != 3 ? i4 == 4 : i3 != 10;
        }
        int i5 = 0;
        while (true) {
            int[] iArr2 = oVar.f3352d;
            if (i5 >= iArr2.length) {
                return false;
            }
            if (iArr2[i5] <= i3 && i3 <= iArr2[i5 + 1]) {
                return true;
            }
            i5 += 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean m(int i3, int i4) {
        int size = this.f3319c.size();
        if (size < 2) {
            return false;
        }
        o oVar = (o) this.f3319c.get(size - 1);
        o oVar2 = (o) this.f3319c.get(size - 2);
        o.b bVar = oVar.f3349a;
        o.b bVar2 = o.b.LITERAL;
        if (bVar == bVar2 && oVar2.f3349a == bVar2 && (oVar.f3350b & 1) == (oVar2.f3350b & 1)) {
            oVar2.f3352d = e(oVar2.f3352d, oVar.f3352d);
            if (i3 >= 0) {
                oVar.f3352d = new int[]{i3};
                oVar.f3350b = i4;
                return true;
            }
            F();
            L(oVar);
        }
        return false;
    }

    private static void n(o oVar, o oVar2) {
        int i3 = a.f3323a[oVar.f3349a.ordinal()];
        if (i3 == 1) {
            if (oVar2.f3352d[0] == oVar.f3352d[0] && oVar2.f3350b == oVar.f3350b) {
                return;
            }
            oVar.f3349a = o.b.CHAR_CLASS;
            oVar.f3352d = new Y0.a().f(oVar.f3352d[0], oVar.f3350b).f(oVar2.f3352d[0], oVar2.f3350b).r();
            return;
        }
        if (i3 != 2) {
            if (i3 == 3 && l(oVar2, 10)) {
                oVar.f3349a = o.b.ANY_CHAR;
                return;
            }
            return;
        }
        if (oVar2.f3349a == o.b.LITERAL) {
            oVar.f3352d = new Y0.a(oVar.f3352d).f(oVar2.f3352d[0], oVar2.f3350b).r();
        } else {
            oVar.f3352d = new Y0.a(oVar.f3352d).a(oVar2.f3352d).r();
        }
    }

    private static int o(int i3) {
        if (i3 < 65 || i3 > 66639) {
            return i3;
        }
        int i4 = i3;
        for (int iD = q.d(i3); iD != i3; iD = q.d(iD)) {
            if (i4 > iD) {
                i4 = iD;
            }
        }
        return i4;
    }

    private o p(int i3, int i4) {
        o oVarQ = q(o.b.LITERAL);
        oVarQ.f3350b = i4;
        if ((i4 & 1) != 0) {
            i3 = o(i3);
        }
        oVarQ.f3352d = new int[]{i3};
        return oVarQ;
    }

    private o q(o.b bVar) {
        o[] oVarArr;
        o oVar = this.f3320d;
        if (oVar == null || (oVarArr = oVar.f3351c) == null || oVarArr.length <= 0) {
            return new o(bVar);
        }
        this.f3320d = oVarArr[0];
        oVar.d();
        oVar.f3349a = bVar;
        return oVar;
    }

    private o r(o.b bVar) {
        o oVarQ = q(bVar);
        oVarQ.f3350b = this.f3318b;
        return H(oVarQ);
    }

    static o s(String str, int i3) {
        return new j(str, i3).x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        r13.i(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        throw new Y0.l("invalid character class range", r13.h());
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void t(Y0.j.d r13) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.j.t(Y0.j$d):void");
    }

    private static int u(d dVar, int i3) {
        if (dVar.d()) {
            return dVar.b('\\') ? v(dVar) : dVar.f();
        }
        throw new l("missing closing ]", dVar.a(i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r6.e() <= 55) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int v(Y0.j.d r6) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.j.v(Y0.j$d):int");
    }

    private static int w(d dVar) {
        int iE;
        int iG = dVar.g();
        while (dVar.d() && (iE = dVar.e()) >= 48 && iE <= 57) {
            dVar.j(1);
        }
        String strA = dVar.a(iG);
        if (strA.isEmpty()) {
            return -1;
        }
        if (strA.length() > 1 && strA.charAt(0) == '0') {
            return -1;
        }
        if (strA.length() > 8) {
            return -2;
        }
        return Integer.valueOf(strA, 10).intValue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0044. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private Y0.o x() {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.j.x():Y0.o");
    }

    private boolean y(d dVar, Y0.a aVar) {
        String strH = dVar.h();
        int iIndexOf = strH.indexOf(":]");
        if (iIndexOf < 0) {
            return false;
        }
        String strSubstring = strH.substring(0, iIndexOf + 2);
        dVar.k(strSubstring);
        Y0.b bVar = (Y0.b) Y0.b.f3268u.get(strSubstring);
        if (bVar == null) {
            throw new l("invalid character class range", strSubstring);
        }
        aVar.e(bVar, (this.f3318b & 1) != 0);
        return true;
    }

    private boolean z(d dVar, Y0.a aVar) {
        int iG = dVar.g();
        if ((this.f3318b & 64) == 0 || !dVar.d() || dVar.f() != 92 || !dVar.d()) {
            return false;
        }
        dVar.f();
        Y0.b bVar = (Y0.b) Y0.b.f3253f.get(dVar.a(iG));
        if (bVar == null) {
            return false;
        }
        aVar.e(bVar, (this.f3318b & 1) != 0);
        return true;
    }
}
