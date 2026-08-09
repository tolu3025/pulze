package Y0;

import V0.I;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f3281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f3282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f3283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f3284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b[] f3285e = new b[10];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f3287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f3288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3289i;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b[] f3290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int[] f3291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int[] f3292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3293d;

        a(int i3) {
            this.f3292c = new int[i3];
            this.f3291b = new int[i3];
            this.f3290a = new b[i3];
        }

        int a(int i3) {
            int i4 = this.f3293d;
            this.f3293d = i4 + 1;
            this.f3292c[i3] = i4;
            this.f3290a[i4] = null;
            this.f3291b[i4] = i3;
            return i4;
        }

        void b() {
            this.f3293d = 0;
        }

        boolean c(int i3) {
            int i4 = this.f3292c[i3];
            return i4 < this.f3293d && this.f3291b[i4] == i3;
        }

        boolean d() {
            return this.f3293d == 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('{');
            for (int i3 = 0; i3 < this.f3293d; i3++) {
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(this.f3291b[i3]);
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f3294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f3295b;

        b(int i3) {
            this.f3294a = new int[i3];
        }
    }

    f(n nVar) {
        m mVar = nVar.f3338b;
        this.f3282b = mVar;
        this.f3281a = nVar;
        this.f3283c = new a(mVar.e());
        this.f3284d = new a(mVar.e());
        int i3 = mVar.f3336d;
        this.f3288h = new int[i3 < 2 ? 2 : i3];
    }

    private b a(a aVar, int i3, int i4, int[] iArr, int i5, b bVar) {
        int[] iArr2;
        b bVarB = bVar;
        if (i3 == 0 || aVar.c(i3)) {
            return bVarB;
        }
        int iA = aVar.a(i3);
        e eVar = this.f3282b.f3333a[i3];
        switch (eVar.f3277a) {
            case 1:
            case 2:
                return a(aVar, eVar.f3279c, i4, iArr, i5, a(aVar, eVar.f3278b, i4, iArr, i5, bVar));
            case 3:
                int i6 = eVar.f3279c;
                if (i6 >= this.f3289i) {
                    return a(aVar, eVar.f3278b, i4, iArr, i5, bVar);
                }
                int i7 = iArr[i6];
                iArr[i6] = i4;
                a(aVar, eVar.f3278b, i4, iArr, i5, null);
                iArr[eVar.f3279c] = i7;
                break;
                break;
            case 4:
                if ((eVar.f3279c & (~i5)) == 0) {
                    return a(aVar, eVar.f3278b, i4, iArr, i5, bVar);
                }
                break;
            case 5:
                break;
            case 6:
            case 8:
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
                if (bVarB == null) {
                    bVarB = b(eVar);
                } else {
                    bVarB.f3295b = eVar;
                }
                int i8 = this.f3289i;
                if (i8 > 0 && (iArr2 = bVarB.f3294a) != iArr) {
                    System.arraycopy(iArr, 0, iArr2, 0, i8);
                }
                aVar.f3290a[iA] = bVarB;
                return null;
            case 7:
                return a(aVar, eVar.f3278b, i4, iArr, i5, bVar);
            default:
                throw new IllegalStateException("unhandled");
        }
        return bVarB;
    }

    private b b(e eVar) {
        b bVar;
        int i3 = this.f3286f;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f3286f = i4;
            bVar = this.f3285e[i4];
        } else {
            bVar = new b(this.f3288h.length);
        }
        bVar.f3295b = eVar;
        return bVar;
    }

    private void c(a aVar) {
        d(aVar, 0);
    }

    private void d(a aVar, int i3) {
        int i4 = this.f3286f + (aVar.f3293d - i3);
        b[] bVarArr = this.f3285e;
        if (bVarArr.length < i4) {
            this.f3285e = (b[]) Arrays.copyOf(bVarArr, Math.max(bVarArr.length * 2, i4));
        }
        while (i3 < aVar.f3293d) {
            b bVar = aVar.f3290a[i3];
            if (bVar != null) {
                b[] bVarArr2 = this.f3285e;
                int i5 = this.f3286f;
                bVarArr2[i5] = bVar;
                this.f3286f = i5 + 1;
            }
            i3++;
        }
        aVar.b();
    }

    private void e(b bVar) {
        b[] bVarArr = this.f3285e;
        if (bVarArr.length <= this.f3286f) {
            this.f3285e = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
        }
        b[] bVarArr2 = this.f3285e;
        int i3 = this.f3286f;
        bVarArr2[i3] = bVar;
        this.f3286f = i3 + 1;
    }

    private void g(int i3) {
        for (int i4 = 0; i4 < this.f3286f; i4++) {
            this.f3285e[i4].f3294a = new int[i3];
        }
        this.f3288h = new int[i3];
    }

    private void i(int i3) {
        for (int i4 = 0; i4 < this.f3286f; i4++) {
            Arrays.fill(this.f3285e[i4].f3294a, 0, i3, 0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j(Y0.f.a r15, Y0.f.a r16, int r17, int r18, int r19, int r20, int r21, boolean r22) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r17
            r10 = r19
            Y0.n r0 = r7.f3281a
            boolean r11 = r0.f3341e
            r12 = 0
            r13 = r12
        Lc:
            int r0 = r8.f3293d
            if (r13 >= r0) goto L9e
            Y0.f$b[] r0 = r8.f3290a
            r6 = r0[r13]
            if (r6 != 0) goto L1a
        L16:
            r1 = r21
            goto L9a
        L1a:
            if (r11 == 0) goto L32
            boolean r0 = r7.f3287g
            if (r0 == 0) goto L32
            int r0 = r7.f3289i
            if (r0 <= 0) goto L32
            int[] r0 = r7.f3288h
            r0 = r0[r12]
            int[] r1 = r6.f3294a
            r1 = r1[r12]
            if (r0 >= r1) goto L32
            r14.e(r6)
            goto L16
        L32:
            Y0.e r0 = r6.f3295b
            int r1 = r0.f3277a
            switch(r1) {
                case 6: goto L65;
                case 7: goto L39;
                case 8: goto L4d;
                case 9: goto L46;
                case 10: goto L53;
                case 11: goto L41;
                default: goto L39;
            }
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "bad inst"
            r0.<init>(r1)
            throw r0
        L41:
            r1 = 10
            if (r10 == r1) goto L62
            goto L53
        L46:
            int[] r1 = r0.f3280d
            r1 = r1[r12]
            if (r10 != r1) goto L62
            goto L53
        L4d:
            boolean r1 = r0.c(r10)
            if (r1 == 0) goto L62
        L53:
            int r2 = r0.f3278b
            int[] r4 = r6.f3294a
            r0 = r14
            r1 = r16
            r3 = r18
            r5 = r20
            Y0.f$b r6 = r0.a(r1, r2, r3, r4, r5, r6)
        L62:
            r1 = r21
            goto L90
        L65:
            r0 = 2
            r1 = r21
            if (r1 != r0) goto L6d
            if (r22 != 0) goto L6d
            goto L90
        L6d:
            int r0 = r7.f3289i
            r2 = 1
            if (r0 <= 0) goto L87
            if (r11 == 0) goto L7e
            boolean r3 = r7.f3287g
            if (r3 == 0) goto L7e
            int[] r3 = r7.f3288h
            r3 = r3[r2]
            if (r3 >= r9) goto L87
        L7e:
            int[] r3 = r6.f3294a
            r3[r2] = r9
            int[] r4 = r7.f3288h
            java.lang.System.arraycopy(r3, r12, r4, r12, r0)
        L87:
            if (r11 != 0) goto L8e
            int r0 = r13 + 1
            r14.d(r15, r0)
        L8e:
            r7.f3287g = r2
        L90:
            if (r6 == 0) goto L9a
            r14.e(r6)
            Y0.f$b[] r0 = r8.f3290a
            r2 = 0
            r0[r13] = r2
        L9a:
            int r13 = r13 + 1
            goto Lc
        L9e:
            r15.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.f.j(Y0.f$a, Y0.f$a, int, int, int, int, int, boolean):void");
    }

    void f(int i3) {
        this.f3289i = i3;
        if (i3 > this.f3288h.length) {
            g(i3);
        } else {
            i(i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r15 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean h(Y0.g r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.f.h(Y0.g, int, int):boolean");
    }

    int[] k() {
        int i3 = this.f3289i;
        return i3 == 0 ? s.f3527a : Arrays.copyOf(this.f3288h, i3);
    }
}
