package Y0;

import V0.I;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f3277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f3279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f3280d;

    e(int i3) {
        this.f3277a = i3;
    }

    private static String a(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        for (int i3 : iArr) {
            s.b(sb, i3);
        }
        sb.append('\"');
        return sb.toString();
    }

    static boolean b(int i3) {
        return 8 <= i3 && i3 <= 11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        r0 = r1.length / 2;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        if (r1 >= r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
    
        r4 = ((r0 - r1) / 2) + r1;
        r5 = r8.f3280d;
        r6 = r4 * 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
    
        if (r5[r6] > r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        if (r9 > r5[r6 + 1]) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
    
        r1 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean c(int r9) {
        /*
            r8 = this;
            int[] r0 = r8.f3280d
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L20
            r0 = r0[r2]
            if (r9 != r0) goto Lc
            return r3
        Lc:
            int r1 = r8.f3279c
            r1 = r1 & r3
            if (r1 == 0) goto L1f
            int r1 = Y0.q.d(r0)
        L15:
            if (r1 == r0) goto L1f
            if (r9 != r1) goto L1a
            return r3
        L1a:
            int r1 = Y0.q.d(r1)
            goto L15
        L1f:
            return r2
        L20:
            r0 = r2
        L21:
            int[] r1 = r8.f3280d
            int r4 = r1.length
            if (r0 >= r4) goto L39
            r4 = 8
            if (r0 > r4) goto L39
            r4 = r1[r0]
            if (r9 >= r4) goto L2f
            return r2
        L2f:
            int r4 = r0 + 1
            r1 = r1[r4]
            if (r9 > r1) goto L36
            return r3
        L36:
            int r0 = r0 + 2
            goto L21
        L39:
            int r0 = r1.length
            int r0 = r0 / 2
            r1 = r2
        L3d:
            if (r1 >= r0) goto L58
            int r4 = r0 - r1
            int r4 = r4 / 2
            int r4 = r4 + r1
            int[] r5 = r8.f3280d
            int r6 = r4 * 2
            r7 = r5[r6]
            if (r7 > r9) goto L56
            int r6 = r6 + 1
            r1 = r5[r6]
            if (r9 > r1) goto L53
            return r3
        L53:
            int r1 = r4 + 1
            goto L3d
        L56:
            r0 = r4
            goto L3d
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.e.c(int):boolean");
    }

    public String toString() {
        StringBuilder sb;
        String str;
        int i3;
        String str2;
        String str3;
        String strA;
        switch (this.f3277a) {
            case 1:
                sb = new StringBuilder();
                str = "alt -> ";
                sb.append(str);
                sb.append(this.f3278b);
                sb.append(", ");
                i3 = this.f3279c;
                sb.append(i3);
                return sb.toString();
            case 2:
                sb = new StringBuilder();
                str = "altmatch -> ";
                sb.append(str);
                sb.append(this.f3278b);
                sb.append(", ");
                i3 = this.f3279c;
                sb.append(i3);
                return sb.toString();
            case 3:
                sb = new StringBuilder();
                str2 = "cap ";
                sb.append(str2);
                sb.append(this.f3279c);
                sb.append(" -> ");
                i3 = this.f3278b;
                sb.append(i3);
                return sb.toString();
            case 4:
                sb = new StringBuilder();
                str2 = "empty ";
                sb.append(str2);
                sb.append(this.f3279c);
                sb.append(" -> ");
                i3 = this.f3278b;
                sb.append(i3);
                return sb.toString();
            case 5:
                return "fail";
            case 6:
                return "match";
            case 7:
                sb = new StringBuilder();
                str3 = "nop -> ";
                sb.append(str3);
                i3 = this.f3278b;
                sb.append(i3);
                return sb.toString();
            case 8:
                if (this.f3280d == null) {
                    return "rune <null>";
                }
                sb = new StringBuilder();
                sb.append("rune ");
                sb.append(a(this.f3280d));
                strA = (this.f3279c & 1) != 0 ? "/i" : "";
                sb.append(strA);
                sb.append(" -> ");
                i3 = this.f3278b;
                sb.append(i3);
                return sb.toString();
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                sb = new StringBuilder();
                sb.append("rune1 ");
                strA = a(this.f3280d);
                sb.append(strA);
                sb.append(" -> ");
                i3 = this.f3278b;
                sb.append(i3);
                return sb.toString();
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                sb = new StringBuilder();
                str3 = "any -> ";
                sb.append(str3);
                i3 = this.f3278b;
                sb.append(i3);
                return sb.toString();
            case 11:
                sb = new StringBuilder();
                str3 = "anynotnl -> ";
                sb.append(str3);
                i3 = this.f3278b;
                sb.append(i3);
                return sb.toString();
            default:
                throw new IllegalStateException("unhandled case in Inst.toString");
        }
    }
}
