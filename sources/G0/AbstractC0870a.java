package g0;

import e0.AbstractC0829j;
import h0.AbstractC0878c;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: g0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0870a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC0870a f7319a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC0870a f7320b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC0870a f7321c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC0870a f7322d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC0870a f7323e = new b("base16()", "0123456789ABCDEF");

    /* JADX INFO: renamed from: g0.a$a, reason: collision with other inner class name */
    private static final class C0126a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char[] f7325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f7326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f7327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f7328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f7329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f7330g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean[] f7331h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f7332i;

        C0126a(String str, char[] cArr) {
            this(str, cArr, b(cArr), false);
        }

        private static byte[] b(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i3 = 0; i3 < cArr.length; i3++) {
                char c3 = cArr[i3];
                boolean z2 = true;
                AbstractC0829j.f(c3 < 128, "Non-ASCII character: %s", c3);
                if (bArr[c3] != -1) {
                    z2 = false;
                }
                AbstractC0829j.f(z2, "Duplicate character: %s", c3);
                bArr[c3] = (byte) i3;
            }
            return bArr;
        }

        int c(char c3) throws d {
            if (c3 > 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c3));
            }
            byte b3 = this.f7330g[c3];
            if (b3 != -1) {
                return b3;
            }
            if (c3 <= ' ' || c3 == 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c3));
            }
            throw new d("Unrecognized character: " + c3);
        }

        char d(int i3) {
            return this.f7325b[i3];
        }

        boolean e(int i3) {
            return this.f7331h[i3 % this.f7328e];
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0126a)) {
                return false;
            }
            C0126a c0126a = (C0126a) obj;
            return this.f7332i == c0126a.f7332i && Arrays.equals(this.f7325b, c0126a.f7325b);
        }

        public boolean f(char c3) {
            byte[] bArr = this.f7330g;
            return c3 < bArr.length && bArr[c3] != -1;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f7325b) + (this.f7332i ? 1231 : 1237);
        }

        public String toString() {
            return this.f7324a;
        }

        private C0126a(String str, char[] cArr, byte[] bArr, boolean z2) {
            this.f7324a = (String) AbstractC0829j.n(str);
            this.f7325b = (char[]) AbstractC0829j.n(cArr);
            try {
                int iD = AbstractC0878c.d(cArr.length, RoundingMode.UNNECESSARY);
                this.f7327d = iD;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iD);
                int i3 = 1 << (3 - iNumberOfTrailingZeros);
                this.f7328e = i3;
                this.f7329f = iD >> iNumberOfTrailingZeros;
                this.f7326c = cArr.length - 1;
                this.f7330g = bArr;
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < this.f7329f; i4++) {
                    zArr[AbstractC0878c.a(i4 * 8, this.f7327d, RoundingMode.CEILING)] = true;
                }
                this.f7331h = zArr;
                this.f7332i = z2;
            } catch (ArithmeticException e3) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e3);
            }
        }
    }

    /* JADX INFO: renamed from: g0.a$b */
    static final class b extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final char[] f7333h;

        private b(C0126a c0126a) {
            super(c0126a, null);
            this.f7333h = new char[512];
            AbstractC0829j.d(c0126a.f7325b.length == 16);
            for (int i3 = 0; i3 < 256; i3++) {
                this.f7333h[i3] = c0126a.d(i3 >>> 4);
                this.f7333h[i3 | 256] = c0126a.d(i3 & 15);
            }
        }

        @Override // g0.AbstractC0870a.e, g0.AbstractC0870a
        int d(byte[] bArr, CharSequence charSequence) throws d {
            AbstractC0829j.n(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new d("Invalid input length " + charSequence.length());
            }
            int i3 = 0;
            int i4 = 0;
            while (i3 < charSequence.length()) {
                bArr[i4] = (byte) ((this.f7334f.c(charSequence.charAt(i3)) << 4) | this.f7334f.c(charSequence.charAt(i3 + 1)));
                i3 += 2;
                i4++;
            }
            return i4;
        }

        @Override // g0.AbstractC0870a.e, g0.AbstractC0870a
        void g(Appendable appendable, byte[] bArr, int i3, int i4) throws IOException {
            AbstractC0829j.n(appendable);
            AbstractC0829j.s(i3, i3 + i4, bArr.length);
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = bArr[i3 + i5] & 255;
                appendable.append(this.f7333h[i6]);
                appendable.append(this.f7333h[i6 | 256]);
            }
        }

        @Override // g0.AbstractC0870a.e
        AbstractC0870a n(C0126a c0126a, Character ch) {
            return new b(c0126a);
        }

        b(String str, String str2) {
            this(new C0126a(str, str2.toCharArray()));
        }
    }

    /* JADX INFO: renamed from: g0.a$c */
    static final class c extends e {
        private c(C0126a c0126a, Character ch) {
            super(c0126a, ch);
            AbstractC0829j.d(c0126a.f7325b.length == 64);
        }

        @Override // g0.AbstractC0870a.e, g0.AbstractC0870a
        int d(byte[] bArr, CharSequence charSequence) throws d {
            AbstractC0829j.n(bArr);
            CharSequence charSequenceL = l(charSequence);
            if (!this.f7334f.e(charSequenceL.length())) {
                throw new d("Invalid input length " + charSequenceL.length());
            }
            int i3 = 0;
            int i4 = 0;
            while (i3 < charSequenceL.length()) {
                int i5 = i3 + 2;
                int iC = (this.f7334f.c(charSequenceL.charAt(i3)) << 18) | (this.f7334f.c(charSequenceL.charAt(i3 + 1)) << 12);
                int i6 = i4 + 1;
                bArr[i4] = (byte) (iC >>> 16);
                if (i5 < charSequenceL.length()) {
                    int i7 = i3 + 3;
                    int iC2 = iC | (this.f7334f.c(charSequenceL.charAt(i5)) << 6);
                    int i8 = i4 + 2;
                    bArr[i6] = (byte) ((iC2 >>> 8) & 255);
                    if (i7 < charSequenceL.length()) {
                        i3 += 4;
                        i4 += 3;
                        bArr[i8] = (byte) ((iC2 | this.f7334f.c(charSequenceL.charAt(i7))) & 255);
                    } else {
                        i4 = i8;
                        i3 = i7;
                    }
                } else {
                    i4 = i6;
                    i3 = i5;
                }
            }
            return i4;
        }

        @Override // g0.AbstractC0870a.e, g0.AbstractC0870a
        void g(Appendable appendable, byte[] bArr, int i3, int i4) throws IOException {
            AbstractC0829j.n(appendable);
            int i5 = i3 + i4;
            AbstractC0829j.s(i3, i5, bArr.length);
            while (i4 >= 3) {
                int i6 = i3 + 2;
                int i7 = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16);
                i3 += 3;
                int i8 = i7 | (bArr[i6] & 255);
                appendable.append(this.f7334f.d(i8 >>> 18));
                appendable.append(this.f7334f.d((i8 >>> 12) & 63));
                appendable.append(this.f7334f.d((i8 >>> 6) & 63));
                appendable.append(this.f7334f.d(i8 & 63));
                i4 -= 3;
            }
            if (i3 < i5) {
                m(appendable, bArr, i3, i5 - i3);
            }
        }

        @Override // g0.AbstractC0870a.e
        AbstractC0870a n(C0126a c0126a, Character ch) {
            return new c(c0126a, ch);
        }

        c(String str, String str2, Character ch) {
            this(new C0126a(str, str2.toCharArray()), ch);
        }
    }

    /* JADX INFO: renamed from: g0.a$d */
    public static final class d extends IOException {
        d(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: g0.a$e */
    static class e extends AbstractC0870a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final C0126a f7334f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Character f7335g;

        e(C0126a c0126a, Character ch) {
            this.f7334f = (C0126a) AbstractC0829j.n(c0126a);
            AbstractC0829j.j(ch == null || !c0126a.f(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f7335g = ch;
        }

        @Override // g0.AbstractC0870a
        int d(byte[] bArr, CharSequence charSequence) throws d {
            C0126a c0126a;
            AbstractC0829j.n(bArr);
            CharSequence charSequenceL = l(charSequence);
            if (!this.f7334f.e(charSequenceL.length())) {
                throw new d("Invalid input length " + charSequenceL.length());
            }
            int i3 = 0;
            int i4 = 0;
            while (i3 < charSequenceL.length()) {
                long jC = 0;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    c0126a = this.f7334f;
                    if (i5 >= c0126a.f7328e) {
                        break;
                    }
                    jC <<= c0126a.f7327d;
                    if (i3 + i5 < charSequenceL.length()) {
                        jC |= (long) this.f7334f.c(charSequenceL.charAt(i6 + i3));
                        i6++;
                    }
                    i5++;
                }
                int i7 = c0126a.f7329f;
                int i8 = (i7 * 8) - (i6 * c0126a.f7327d);
                int i9 = (i7 - 1) * 8;
                while (i9 >= i8) {
                    bArr[i4] = (byte) ((jC >>> i9) & 255);
                    i9 -= 8;
                    i4++;
                }
                i3 += this.f7334f.f7328e;
            }
            return i4;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f7334f.equals(eVar.f7334f) && Objects.equals(this.f7335g, eVar.f7335g);
        }

        @Override // g0.AbstractC0870a
        void g(Appendable appendable, byte[] bArr, int i3, int i4) throws IOException {
            AbstractC0829j.n(appendable);
            AbstractC0829j.s(i3, i3 + i4, bArr.length);
            int i5 = 0;
            while (i5 < i4) {
                m(appendable, bArr, i3 + i5, Math.min(this.f7334f.f7329f, i4 - i5));
                i5 += this.f7334f.f7329f;
            }
        }

        public int hashCode() {
            return this.f7334f.hashCode() ^ Objects.hashCode(this.f7335g);
        }

        @Override // g0.AbstractC0870a
        int i(int i3) {
            return (int) (((((long) this.f7334f.f7327d) * ((long) i3)) + 7) / 8);
        }

        @Override // g0.AbstractC0870a
        int j(int i3) {
            C0126a c0126a = this.f7334f;
            return c0126a.f7328e * AbstractC0878c.a(i3, c0126a.f7329f, RoundingMode.CEILING);
        }

        @Override // g0.AbstractC0870a
        public AbstractC0870a k() {
            return this.f7335g == null ? this : n(this.f7334f, null);
        }

        @Override // g0.AbstractC0870a
        CharSequence l(CharSequence charSequence) {
            AbstractC0829j.n(charSequence);
            Character ch = this.f7335g;
            if (ch == null) {
                return charSequence;
            }
            char cCharValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        void m(Appendable appendable, byte[] bArr, int i3, int i4) throws IOException {
            AbstractC0829j.n(appendable);
            AbstractC0829j.s(i3, i3 + i4, bArr.length);
            int i5 = 0;
            AbstractC0829j.d(i4 <= this.f7334f.f7329f);
            long j3 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                j3 = (j3 | ((long) (bArr[i3 + i6] & 255))) << 8;
            }
            int i7 = ((i4 + 1) * 8) - this.f7334f.f7327d;
            while (i5 < i4 * 8) {
                C0126a c0126a = this.f7334f;
                appendable.append(c0126a.d(((int) (j3 >>> (i7 - i5))) & c0126a.f7326c));
                i5 += this.f7334f.f7327d;
            }
            if (this.f7335g != null) {
                while (i5 < this.f7334f.f7329f * 8) {
                    appendable.append(this.f7335g.charValue());
                    i5 += this.f7334f.f7327d;
                }
            }
        }

        AbstractC0870a n(C0126a c0126a, Character ch) {
            return new e(c0126a, ch);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f7334f);
            if (8 % this.f7334f.f7327d != 0) {
                if (this.f7335g == null) {
                    str = ".omitPadding()";
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f7335g);
                    str = "')";
                }
                sb.append(str);
            }
            return sb.toString();
        }

        e(String str, String str2, Character ch) {
            this(new C0126a(str, str2.toCharArray()), ch);
        }
    }

    AbstractC0870a() {
    }

    public static AbstractC0870a a() {
        return f7319a;
    }

    private static byte[] h(byte[] bArr, int i3) {
        if (i3 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        return bArr2;
    }

    public final byte[] b(CharSequence charSequence) {
        try {
            return c(charSequence);
        } catch (d e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    final byte[] c(CharSequence charSequence) {
        CharSequence charSequenceL = l(charSequence);
        byte[] bArr = new byte[i(charSequenceL.length())];
        return h(bArr, d(bArr, charSequenceL));
    }

    abstract int d(byte[] bArr, CharSequence charSequence);

    public String e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public final String f(byte[] bArr, int i3, int i4) {
        AbstractC0829j.s(i3, i3 + i4, bArr.length);
        StringBuilder sb = new StringBuilder(j(i4));
        try {
            g(sb, bArr, i3, i4);
            return sb.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    abstract void g(Appendable appendable, byte[] bArr, int i3, int i4);

    abstract int i(int i3);

    abstract int j(int i3);

    public abstract AbstractC0870a k();

    abstract CharSequence l(CharSequence charSequence);
}
