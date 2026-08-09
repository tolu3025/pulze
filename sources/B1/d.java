package B1;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char[] f677g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f671a = name;
        this.f672b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r2 = r8.f674d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        return new java.lang.String(r1, r2, r8.f675e - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a() {
        /*
            r8 = this;
            int r0 = r8.f673c
            r8.f674d = r0
            r8.f675e = r0
        L6:
            int r0 = r8.f673c
            int r1 = r8.f672b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f677g
            int r2 = r8.f674d
            int r3 = r8.f675e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f677g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L58
            if (r2 == r5) goto L4d
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L4d
            if (r2 == r3) goto L4d
            int r3 = r8.f675e
            int r4 = r3 + 1
            r8.f675e = r4
            r1[r3] = r2
        L39:
            int r0 = r0 + 1
            r8.f673c = r0
            goto L6
        L3e:
            int r0 = r8.f675e
            int r2 = r0 + 1
            r8.f675e = r2
            char r2 = r8.d()
            r1[r0] = r2
            int r0 = r8.f673c
            goto L39
        L4d:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f674d
            int r3 = r8.f675e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L58:
            int r2 = r8.f675e
            r8.f676f = r2
            int r0 = r0 + 1
            r8.f673c = r0
            int r0 = r2 + 1
            r8.f675e = r0
            r1[r2] = r6
        L66:
            int r0 = r8.f673c
            int r1 = r8.f672b
            if (r0 >= r1) goto L7f
            char[] r2 = r8.f677g
            char r7 = r2[r0]
            if (r7 != r6) goto L7f
            int r1 = r8.f675e
            int r7 = r1 + 1
            r8.f675e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f673c = r0
            goto L66
        L7f:
            if (r0 == r1) goto L8b
            char[] r1 = r8.f677g
            char r0 = r1[r0]
            if (r0 == r3) goto L8b
            if (r0 == r4) goto L8b
            if (r0 != r5) goto L6
        L8b:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f677g
            int r2 = r8.f674d
            int r3 = r8.f676f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.d.a():java.lang.String");
    }

    private int c(int i3) {
        int i4;
        int i5;
        int i6 = i3 + 1;
        if (i6 >= this.f672b) {
            throw new IllegalStateException("Malformed DN: " + this.f671a);
        }
        char[] cArr = this.f677g;
        char c3 = cArr[i3];
        if (c3 >= '0' && c3 <= '9') {
            i4 = c3 - '0';
        } else if (c3 >= 'a' && c3 <= 'f') {
            i4 = c3 - 'W';
        } else {
            if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f671a);
            }
            i4 = c3 - '7';
        }
        char c4 = cArr[i6];
        if (c4 >= '0' && c4 <= '9') {
            i5 = c4 - '0';
        } else if (c4 >= 'a' && c4 <= 'f') {
            i5 = c4 - 'W';
        } else {
            if (c4 < 'A' || c4 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f671a);
            }
            i5 = c4 - '7';
        }
        return (i4 << 4) + i5;
    }

    private char d() {
        int i3 = this.f673c + 1;
        this.f673c = i3;
        if (i3 == this.f672b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f671a);
        }
        char c3 = this.f677g[i3];
        if (c3 == ' ' || c3 == '%' || c3 == '\\' || c3 == '_' || c3 == '\"' || c3 == '#') {
            return c3;
        }
        switch (c3) {
            case '*':
            case '+':
            case ',':
                return c3;
            default:
                switch (c3) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c3;
                    default:
                        return e();
                }
        }
    }

    private char e() {
        int i3;
        int i4;
        int iC = c(this.f673c);
        this.f673c++;
        if (iC < 128) {
            return (char) iC;
        }
        if (iC < 192 || iC > 247) {
            return '?';
        }
        if (iC <= 223) {
            i3 = iC & 31;
            i4 = 1;
        } else if (iC <= 239) {
            i3 = iC & 15;
            i4 = 2;
        } else {
            i3 = iC & 7;
            i4 = 3;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.f673c;
            int i7 = i6 + 1;
            this.f673c = i7;
            if (i7 == this.f672b || this.f677g[i7] != '\\') {
                return '?';
            }
            int i8 = i6 + 2;
            this.f673c = i8;
            int iC2 = c(i8);
            this.f673c++;
            if ((iC2 & 192) != 128) {
                return '?';
            }
            i3 = (i3 << 6) + (iC2 & 63);
        }
        return (char) i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        r6.f675e = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String f() {
        /*
            r6 = this;
            int r0 = r6.f673c
            int r1 = r0 + 4
            int r2 = r6.f672b
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r2) goto L90
            r6.f674d = r0
        Lc:
            int r0 = r0 + 1
            r6.f673c = r0
            int r0 = r6.f673c
            int r1 = r6.f672b
            if (r0 == r1) goto L4c
            char[] r1 = r6.f677g
            char r2 = r1[r0]
            r4 = 43
            if (r2 == r4) goto L4c
            r4 = 44
            if (r2 == r4) goto L4c
            r4 = 59
            if (r2 != r4) goto L27
            goto L4c
        L27:
            r4 = 32
            if (r2 != r4) goto L3e
            r6.f675e = r0
        L2d:
            int r0 = r0 + 1
            r6.f673c = r0
            int r0 = r6.f673c
            int r1 = r6.f672b
            if (r0 >= r1) goto L4e
            char[] r1 = r6.f677g
            char r1 = r1[r0]
            if (r1 != r4) goto L4e
            goto L2d
        L3e:
            r4 = 65
            if (r2 < r4) goto Lc
            r4 = 70
            if (r2 > r4) goto Lc
            int r2 = r2 + 32
            char r2 = (char) r2
            r1[r0] = r2
            goto Lc
        L4c:
            r6.f675e = r0
        L4e:
            int r0 = r6.f675e
            int r1 = r6.f674d
            int r0 = r0 - r1
            r2 = 5
            if (r0 < r2) goto L79
            r2 = r0 & 1
            if (r2 == 0) goto L79
            int r2 = r0 / 2
            byte[] r3 = new byte[r2]
            int r1 = r1 + 1
            r4 = 0
        L61:
            if (r4 >= r2) goto L6f
            int r5 = r6.c(r1)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L61
        L6f:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f677g
            int r3 = r6.f674d
            r1.<init>(r2, r3, r0)
            return r1
        L79:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f671a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L90:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f671a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.d.f():java.lang.String");
    }

    private String g() {
        int i3;
        int i4;
        int i5;
        char c3;
        int i6;
        int i7;
        char c4;
        char c5;
        while (true) {
            i3 = this.f673c;
            i4 = this.f672b;
            if (i3 >= i4 || this.f677g[i3] != ' ') {
                break;
            }
            this.f673c = i3 + 1;
        }
        if (i3 == i4) {
            return null;
        }
        this.f674d = i3;
        do {
            this.f673c = i3 + 1;
            i3 = this.f673c;
            i5 = this.f672b;
            if (i3 >= i5 || (c5 = this.f677g[i3]) == '=') {
                break;
            }
        } while (c5 != ' ');
        if (i3 >= i5) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f671a);
        }
        this.f675e = i3;
        if (this.f677g[i3] == ' ') {
            while (true) {
                i6 = this.f673c;
                i7 = this.f672b;
                if (i6 >= i7 || (c4 = this.f677g[i6]) == '=' || c4 != ' ') {
                    break;
                }
                this.f673c = i6 + 1;
            }
            if (this.f677g[i6] != '=' || i6 == i7) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f671a);
            }
        }
        int i8 = this.f673c;
        do {
            this.f673c = i8 + 1;
            i8 = this.f673c;
            if (i8 >= this.f672b) {
                break;
            }
        } while (this.f677g[i8] == ' ');
        int i9 = this.f675e;
        int i10 = this.f674d;
        if (i9 - i10 > 4) {
            char[] cArr = this.f677g;
            if (cArr[i10 + 3] == '.' && (((c3 = cArr[i10]) == 'O' || c3 == 'o') && ((cArr[i10 + 1] == 'I' || cArr[i10 + 1] == 'i') && (cArr[i10 + 2] == 'D' || cArr[i10 + 2] == 'd')))) {
                this.f674d = i10 + 4;
            }
        }
        char[] cArr2 = this.f677g;
        int i11 = this.f674d;
        return new String(cArr2, i11, i9 - i11);
    }

    private String h() {
        int i3 = this.f673c + 1;
        this.f673c = i3;
        this.f674d = i3;
        while (true) {
            this.f675e = i3;
            int i4 = this.f673c;
            if (i4 == this.f672b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f671a);
            }
            char[] cArr = this.f677g;
            char c3 = cArr[i4];
            if (c3 == '\"') {
                do {
                    this.f673c = i4 + 1;
                    i4 = this.f673c;
                    if (i4 >= this.f672b) {
                        break;
                    }
                } while (this.f677g[i4] == ' ');
                char[] cArr2 = this.f677g;
                int i5 = this.f674d;
                return new String(cArr2, i5, this.f675e - i5);
            }
            if (c3 == '\\') {
                cArr[this.f675e] = d();
            } else {
                cArr[this.f675e] = c3;
            }
            this.f673c++;
            i3 = this.f675e + 1;
        }
    }

    public String b(String str) {
        this.f673c = 0;
        this.f674d = 0;
        this.f675e = 0;
        this.f676f = 0;
        this.f677g = this.f671a.toCharArray();
        String strG = g();
        if (strG == null) {
            return null;
        }
        do {
            int i3 = this.f673c;
            if (i3 == this.f672b) {
                return null;
            }
            char c3 = this.f677g[i3];
            String strA = c3 != '\"' ? c3 != '#' ? (c3 == '+' || c3 == ',' || c3 == ';') ? "" : a() : f() : h();
            if (str.equalsIgnoreCase(strG)) {
                return strA;
            }
            int i4 = this.f673c;
            if (i4 >= this.f672b) {
                return null;
            }
            char c4 = this.f677g[i4];
            if (c4 != ',' && c4 != ';' && c4 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f671a);
            }
            this.f673c = i4 + 1;
            strG = g();
        } while (strG != null);
        throw new IllegalStateException("Malformed DN: " + this.f671a);
    }
}
