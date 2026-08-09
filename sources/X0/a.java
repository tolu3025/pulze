package X0;

import V0.F;
import V0.I;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f3057a;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f3065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f3066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f3067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f3068q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String[] f3070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int[] f3071t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3058b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f3059c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3060d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3061e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3062f = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f3063l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f3064m = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f3069r = 1;

    /* JADX INFO: renamed from: X0.a$a, reason: collision with other inner class name */
    class C0070a extends W0.a {
        C0070a() {
        }
    }

    static {
        W0.a.f3051a = new C0070a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f3068q = iArr;
        iArr[0] = 6;
        this.f3070s = new String[32];
        this.f3071t = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f3057a = reader;
    }

    private String K(boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i3 = 0;
        while (true) {
            int i4 = this.f3069r;
            if (i3 >= i4) {
                return sb.toString();
            }
            int i5 = this.f3068q[i3];
            if (i5 == 1 || i5 == 2) {
                int i6 = this.f3071t[i3];
                if (z2 && i6 > 0 && i3 == i4 - 1) {
                    i6--;
                }
                sb.append('[');
                sb.append(i6);
                sb.append(']');
            } else if (i5 == 3 || i5 == 4 || i5 == 5) {
                sb.append('.');
                String str = this.f3070s[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
            i3++;
        }
    }

    private boolean P(char c3) throws IOException {
        if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
            return false;
        }
        if (c3 != '#') {
            if (c3 == ',') {
                return false;
            }
            if (c3 != '/' && c3 != '=') {
                if (c3 == '{' || c3 == '}' || c3 == ':') {
                    return false;
                }
                if (c3 != ';') {
                    switch (c3) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        f();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r5 != '/') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        r8.f3060d = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r4 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        r8.f3060d = r1;
        r1 = z(2);
        r8.f3060d++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r1 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        f();
        r1 = r8.f3060d;
        r2 = r0[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r2 == '*') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r2 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        r8.f3060d = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        r8.f3060d = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (h0("*\/") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
    
        throw j0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        r8.f3060d = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (r5 != '#') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int X(boolean r9) throws java.io.IOException {
        /*
            r8 = this;
            char[] r0 = r8.f3059c
        L2:
            int r1 = r8.f3060d
        L4:
            int r2 = r8.f3061e
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r8.f3060d = r1
            boolean r1 = r8.z(r3)
            if (r1 != 0) goto L30
            if (r9 != 0) goto L15
            r9 = -1
            return r9
        L15:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r8.R()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L30:
            int r1 = r8.f3060d
            int r2 = r8.f3061e
        L34:
            int r4 = r1 + 1
            char r5 = r0[r1]
            r6 = 10
            if (r5 != r6) goto L44
            int r1 = r8.f3062f
            int r1 = r1 + r3
            r8.f3062f = r1
            r8.f3063l = r4
            goto La1
        L44:
            r6 = 32
            if (r5 == r6) goto La1
            r6 = 13
            if (r5 == r6) goto La1
            r6 = 9
            if (r5 != r6) goto L51
            goto La1
        L51:
            r6 = 47
            if (r5 != r6) goto L96
            r8.f3060d = r4
            r7 = 2
            if (r4 != r2) goto L68
            r8.f3060d = r1
            boolean r1 = r8.z(r7)
            int r2 = r8.f3060d
            int r2 = r2 + r3
            r8.f3060d = r2
            if (r1 != 0) goto L68
            return r5
        L68:
            r8.f()
            int r1 = r8.f3060d
            char r2 = r0[r1]
            r3 = 42
            if (r2 == r3) goto L7e
            if (r2 == r6) goto L76
            return r5
        L76:
            int r1 = r1 + 1
            r8.f3060d = r1
        L7a:
            r8.i0()
            goto L2
        L7e:
            int r1 = r1 + 1
            r8.f3060d = r1
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r8.h0(r1)
            if (r1 == 0) goto L8f
            int r1 = r8.f3060d
            int r1 = r1 + r7
            goto L4
        L8f:
            java.lang.String r9 = "Unterminated comment"
            java.io.IOException r9 = r8.j0(r9)
            throw r9
        L96:
            r1 = 35
            r8.f3060d = r4
            if (r5 != r1) goto La0
            r8.f()
            goto L7a
        La0:
            return r5
        La1:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.a.X(boolean):int");
    }

    private String Z(char c3) throws IOException {
        char[] cArr = this.f3059c;
        StringBuilder sb = null;
        while (true) {
            int i3 = this.f3060d;
            int i4 = this.f3061e;
            while (true) {
                if (i3 < i4) {
                    int i5 = i3 + 1;
                    char c4 = cArr[i3];
                    if (c4 == c3) {
                        this.f3060d = i5;
                        int i6 = (i5 - i3) - 1;
                        if (sb == null) {
                            return new String(cArr, i3, i6);
                        }
                        sb.append(cArr, i3, i6);
                        return sb.toString();
                    }
                    if (c4 == '\\') {
                        this.f3060d = i5;
                        int i7 = i5 - i3;
                        int i8 = i7 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i7 * 2, 16));
                        }
                        sb.append(cArr, i3, i8);
                        sb.append(g0());
                    } else {
                        if (c4 == '\n') {
                            this.f3062f++;
                            this.f3063l = i5;
                        }
                        i3 = i5;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i3 - i3) * 2, 16));
                    }
                    sb.append(cArr, i3, i3 - i3);
                    this.f3060d = i3;
                    if (!z(1)) {
                        throw j0("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        f();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String b0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f3060d
            int r4 = r3 + r2
            int r5 = r6.f3061e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f3059c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.f()
            goto L5c
        L4e:
            char[] r3 = r6.f3059c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.z(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f3059c
            int r4 = r6.f3060d
            r0.append(r3, r4, r2)
            int r3 = r6.f3060d
            int r3 = r3 + r2
            r6.f3060d = r3
            r2 = 1
            boolean r2 = r6.z(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f3059c
            int r3 = r6.f3060d
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f3059c
            int r3 = r6.f3060d
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f3060d
            int r2 = r2 + r1
            r6.f3060d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.a.b0():java.lang.String");
    }

    private int d0() {
        String str;
        String str2;
        int i3;
        char c3 = this.f3059c[this.f3060d];
        if (c3 == 't' || c3 == 'T') {
            str = "true";
            str2 = "TRUE";
            i3 = 5;
        } else if (c3 == 'f' || c3 == 'F') {
            str = "false";
            str2 = "FALSE";
            i3 = 6;
        } else {
            if (c3 != 'n' && c3 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i3 = 7;
        }
        int length = str.length();
        for (int i4 = 1; i4 < length; i4++) {
            if (this.f3060d + i4 >= this.f3061e && !z(i4 + 1)) {
                return 0;
            }
            char c4 = this.f3059c[this.f3060d + i4];
            if (c4 != str.charAt(i4) && c4 != str2.charAt(i4)) {
                return 0;
            }
        }
        if ((this.f3060d + length < this.f3061e || z(length + 1)) && P(this.f3059c[this.f3060d + length])) {
            return 0;
        }
        this.f3060d += length;
        this.f3064m = i3;
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        if (P(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
    
        if (r9 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        if (r10 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
    
        if (r13 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        if (r13 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
    
        r18.f3065n = r11;
        r18.f3060d += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b4, code lost:
    
        r18.f3064m = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
    
        if (r9 == 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ba, code lost:
    
        if (r9 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bd, code lost:
    
        if (r9 != 7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c2, code lost:
    
        r18.f3066o = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c7, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e0() {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.a.e0():int");
    }

    private void f() throws IOException {
        if (!this.f3058b) {
            throw j0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void f0(int i3) {
        int i4 = this.f3069r;
        int[] iArr = this.f3068q;
        if (i4 == iArr.length) {
            int i5 = i4 * 2;
            this.f3068q = Arrays.copyOf(iArr, i5);
            this.f3071t = Arrays.copyOf(this.f3071t, i5);
            this.f3070s = (String[]) Arrays.copyOf(this.f3070s, i5);
        }
        int[] iArr2 = this.f3068q;
        int i6 = this.f3069r;
        this.f3069r = i6 + 1;
        iArr2[i6] = i3;
    }

    private char g0() throws IOException {
        int i3;
        if (this.f3060d == this.f3061e && !z(1)) {
            throw j0("Unterminated escape sequence");
        }
        char[] cArr = this.f3059c;
        int i4 = this.f3060d;
        int i5 = i4 + 1;
        this.f3060d = i5;
        char c3 = cArr[i4];
        if (c3 == '\n') {
            this.f3062f++;
            this.f3063l = i5;
        } else if (c3 != '\"' && c3 != '\'' && c3 != '/' && c3 != '\\') {
            if (c3 == 'b') {
                return '\b';
            }
            if (c3 == 'f') {
                return '\f';
            }
            if (c3 == 'n') {
                return '\n';
            }
            if (c3 == 'r') {
                return '\r';
            }
            if (c3 == 't') {
                return '\t';
            }
            if (c3 != 'u') {
                throw j0("Invalid escape sequence");
            }
            if (i4 + 5 > this.f3061e && !z(4)) {
                throw j0("Unterminated escape sequence");
            }
            int i6 = this.f3060d;
            int i7 = i6 + 4;
            char c4 = 0;
            while (i6 < i7) {
                char c5 = this.f3059c[i6];
                char c6 = (char) (c4 << 4);
                if (c5 >= '0' && c5 <= '9') {
                    i3 = c5 - '0';
                } else if (c5 >= 'a' && c5 <= 'f') {
                    i3 = c5 - 'W';
                } else {
                    if (c5 < 'A' || c5 > 'F') {
                        throw new NumberFormatException("\\u" + new String(this.f3059c, this.f3060d, 4));
                    }
                    i3 = c5 - '7';
                }
                c4 = (char) (c6 + i3);
                i6++;
            }
            this.f3060d += 4;
            return c4;
        }
        return c3;
    }

    private boolean h0(String str) {
        int length = str.length();
        while (true) {
            if (this.f3060d + length > this.f3061e && !z(length)) {
                return false;
            }
            char[] cArr = this.f3059c;
            int i3 = this.f3060d;
            if (cArr[i3] != '\n') {
                for (int i4 = 0; i4 < length; i4++) {
                    if (this.f3059c[this.f3060d + i4] != str.charAt(i4)) {
                        break;
                    }
                }
                return true;
            }
            this.f3062f++;
            this.f3063l = i3 + 1;
            this.f3060d++;
        }
    }

    private void i0() {
        char c3;
        do {
            if (this.f3060d >= this.f3061e && !z(1)) {
                return;
            }
            char[] cArr = this.f3059c;
            int i3 = this.f3060d;
            int i4 = i3 + 1;
            this.f3060d = i4;
            c3 = cArr[i3];
            if (c3 == '\n') {
                this.f3062f++;
                this.f3063l = i4;
                return;
            }
        } while (c3 != '\r');
    }

    private IOException j0(String str) throws c {
        throw new c(str + R());
    }

    private void l() throws IOException {
        X(true);
        int i3 = this.f3060d;
        this.f3060d = i3 - 1;
        if (i3 + 4 <= this.f3061e || z(5)) {
            int i4 = this.f3060d;
            char[] cArr = this.f3059c;
            if (cArr[i4] == ')' && cArr[i4 + 1] == ']' && cArr[i4 + 2] == '}' && cArr[i4 + 3] == '\'' && cArr[i4 + 4] == '\n') {
                this.f3060d = i4 + 5;
            }
        }
    }

    private boolean z(int i3) throws IOException {
        int i4;
        int i5;
        char[] cArr = this.f3059c;
        int i6 = this.f3063l;
        int i7 = this.f3060d;
        this.f3063l = i6 - i7;
        int i8 = this.f3061e;
        if (i8 != i7) {
            int i9 = i8 - i7;
            this.f3061e = i9;
            System.arraycopy(cArr, i7, cArr, 0, i9);
        } else {
            this.f3061e = 0;
        }
        this.f3060d = 0;
        do {
            Reader reader = this.f3057a;
            int i10 = this.f3061e;
            int i11 = reader.read(cArr, i10, cArr.length - i10);
            if (i11 == -1) {
                return false;
            }
            i4 = this.f3061e + i11;
            this.f3061e = i4;
            if (this.f3062f == 0 && (i5 = this.f3063l) == 0 && i4 > 0 && cArr[0] == 65279) {
                this.f3060d++;
                this.f3063l = i5 + 1;
                i3++;
            }
        } while (i4 < i3);
        return true;
    }

    public String B() {
        return K(false);
    }

    public boolean L() throws IOException {
        int iQ = this.f3064m;
        if (iQ == 0) {
            iQ = q();
        }
        return (iQ == 2 || iQ == 4 || iQ == 17) ? false : true;
    }

    String R() {
        return " at line " + (this.f3062f + 1) + " column " + ((this.f3060d - this.f3063l) + 1) + " path " + B();
    }

    public boolean U() throws IOException {
        int iQ = this.f3064m;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 5) {
            this.f3064m = 0;
            int[] iArr = this.f3071t;
            int i3 = this.f3069r - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        }
        if (iQ == 6) {
            this.f3064m = 0;
            int[] iArr2 = this.f3071t;
            int i4 = this.f3069r - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + c0() + R());
    }

    public double V() throws IOException {
        String strZ;
        int iQ = this.f3064m;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 15) {
            this.f3064m = 0;
            int[] iArr = this.f3071t;
            int i3 = this.f3069r - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f3065n;
        }
        if (iQ == 16) {
            this.f3067p = new String(this.f3059c, this.f3060d, this.f3066o);
            this.f3060d += this.f3066o;
        } else {
            if (iQ == 8 || iQ == 9) {
                strZ = Z(iQ == 8 ? '\'' : '\"');
            } else if (iQ == 10) {
                strZ = b0();
            } else if (iQ != 11) {
                throw new IllegalStateException("Expected a double but was " + c0() + R());
            }
            this.f3067p = strZ;
        }
        this.f3064m = 11;
        double d3 = Double.parseDouble(this.f3067p);
        if (!this.f3058b && (Double.isNaN(d3) || Double.isInfinite(d3))) {
            throw new c("JSON forbids NaN and infinities: " + d3 + R());
        }
        this.f3067p = null;
        this.f3064m = 0;
        int[] iArr2 = this.f3071t;
        int i4 = this.f3069r - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return d3;
    }

    public String W() throws IOException {
        char c3;
        String strZ;
        int iQ = this.f3064m;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 14) {
            strZ = b0();
        } else {
            if (iQ == 12) {
                c3 = '\'';
            } else {
                if (iQ != 13) {
                    throw new IllegalStateException("Expected a name but was " + c0() + R());
                }
                c3 = '\"';
            }
            strZ = Z(c3);
        }
        this.f3064m = 0;
        this.f3070s[this.f3069r - 1] = strZ;
        return strZ;
    }

    public void Y() throws IOException {
        int iQ = this.f3064m;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 7) {
            this.f3064m = 0;
            int[] iArr = this.f3071t;
            int i3 = this.f3069r - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + c0() + R());
    }

    public String a0() throws IOException {
        String str;
        char c3;
        int iQ = this.f3064m;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 10) {
            str = b0();
        } else {
            if (iQ == 8) {
                c3 = '\'';
            } else if (iQ == 9) {
                c3 = '\"';
            } else if (iQ == 11) {
                str = this.f3067p;
                this.f3067p = null;
            } else if (iQ == 15) {
                str = Long.toString(this.f3065n);
            } else {
                if (iQ != 16) {
                    throw new IllegalStateException("Expected a string but was " + c0() + R());
                }
                str = new String(this.f3059c, this.f3060d, this.f3066o);
                this.f3060d += this.f3066o;
            }
            str = Z(c3);
        }
        this.f3064m = 0;
        int[] iArr = this.f3071t;
        int i3 = this.f3069r - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public void b() throws IOException {
        int iQ = this.f3064m;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 3) {
            f0(1);
            this.f3071t[this.f3069r - 1] = 0;
            this.f3064m = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + c0() + R());
        }
    }

    public void c() throws IOException {
        int iQ = this.f3064m;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 1) {
            f0(3);
            this.f3064m = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + c0() + R());
        }
    }

    public b c0() throws IOException {
        int iQ = this.f3064m;
        if (iQ == 0) {
            iQ = q();
        }
        switch (iQ) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
                return b.STRING;
            case F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3064m = 0;
        this.f3068q[0] = 8;
        this.f3069r = 1;
        this.f3057a.close();
    }

    int q() throws IOException {
        int i3;
        int iX;
        int[] iArr = this.f3068q;
        int i4 = this.f3069r;
        int i5 = iArr[i4 - 1];
        if (i5 == 1) {
            iArr[i4 - 1] = 2;
        } else {
            if (i5 != 2) {
                if (i5 == 3 || i5 == 5) {
                    iArr[i4 - 1] = 4;
                    if (i5 == 5 && (iX = X(true)) != 44) {
                        if (iX != 59) {
                            if (iX != 125) {
                                throw j0("Unterminated object");
                            }
                            this.f3064m = 2;
                            return 2;
                        }
                        f();
                    }
                    int iX2 = X(true);
                    if (iX2 == 34) {
                        i3 = 13;
                    } else if (iX2 == 39) {
                        f();
                        i3 = 12;
                    } else {
                        if (iX2 == 125) {
                            if (i5 == 5) {
                                throw j0("Expected name");
                            }
                            this.f3064m = 2;
                            return 2;
                        }
                        f();
                        this.f3060d--;
                        if (!P((char) iX2)) {
                            throw j0("Expected name");
                        }
                        i3 = 14;
                    }
                } else if (i5 == 4) {
                    iArr[i4 - 1] = 5;
                    int iX3 = X(true);
                    if (iX3 != 58) {
                        if (iX3 != 61) {
                            throw j0("Expected ':'");
                        }
                        f();
                        if (this.f3060d < this.f3061e || z(1)) {
                            char[] cArr = this.f3059c;
                            int i6 = this.f3060d;
                            if (cArr[i6] == '>') {
                                this.f3060d = i6 + 1;
                            }
                        }
                    }
                } else if (i5 == 6) {
                    if (this.f3058b) {
                        l();
                    }
                    this.f3068q[this.f3069r - 1] = 7;
                } else if (i5 == 7) {
                    if (X(false) == -1) {
                        i3 = 17;
                    } else {
                        f();
                        this.f3060d--;
                    }
                } else if (i5 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.f3064m = i3;
                return i3;
            }
            int iX4 = X(true);
            if (iX4 != 44) {
                if (iX4 != 59) {
                    if (iX4 != 93) {
                        throw j0("Unterminated array");
                    }
                    this.f3064m = 4;
                    return 4;
                }
                f();
            }
        }
        int iX5 = X(true);
        if (iX5 != 34) {
            if (iX5 == 39) {
                f();
                this.f3064m = 8;
                return 8;
            }
            if (iX5 != 44 && iX5 != 59) {
                if (iX5 == 91) {
                    this.f3064m = 3;
                    return 3;
                }
                if (iX5 != 93) {
                    if (iX5 == 123) {
                        this.f3064m = 1;
                        return 1;
                    }
                    this.f3060d--;
                    int iD0 = d0();
                    if (iD0 != 0) {
                        return iD0;
                    }
                    int iE0 = e0();
                    if (iE0 != 0) {
                        return iE0;
                    }
                    if (!P(this.f3059c[this.f3060d])) {
                        throw j0("Expected value");
                    }
                    f();
                    i3 = 10;
                } else if (i5 == 1) {
                    this.f3064m = 4;
                    return 4;
                }
            }
            if (i5 != 1 && i5 != 2) {
                throw j0("Unexpected value");
            }
            f();
            this.f3060d--;
            this.f3064m = 7;
            return 7;
        }
        i3 = 9;
        this.f3064m = i3;
        return i3;
    }

    public void r() throws IOException {
        int iQ = this.f3064m;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + c0() + R());
        }
        int i3 = this.f3069r;
        this.f3069r = i3 - 1;
        int[] iArr = this.f3071t;
        int i4 = i3 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.f3064m = 0;
    }

    public String toString() {
        return getClass().getSimpleName() + R();
    }

    public void u() throws IOException {
        int iQ = this.f3064m;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + c0() + R());
        }
        int i3 = this.f3069r;
        int i4 = i3 - 1;
        this.f3069r = i4;
        this.f3070s[i4] = null;
        int[] iArr = this.f3071t;
        int i5 = i3 - 2;
        iArr[i5] = iArr[i5] + 1;
        this.f3064m = 0;
    }
}
