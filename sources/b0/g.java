package B0;

import com.google.protobuf.AbstractC0791i;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[][] f549c = {new byte[]{0, 0}, new byte[]{-128, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, -128}, new byte[]{-1, -64}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f551b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f550a = new byte[1024];

    private void b(int i3) {
        int i4 = i3 + this.f551b;
        byte[] bArr = this.f550a;
        if (i4 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i4) {
            i4 = length;
        }
        this.f550a = Arrays.copyOf(bArr, i4);
    }

    private int d(long j3) {
        if (j3 < 0) {
            j3 = ~j3;
        }
        return f.a(65 - Long.numberOfLeadingZeros(j3), 7, RoundingMode.UP);
    }

    private int e(long j3) {
        return f.a(64 - Long.numberOfLeadingZeros(j3), 8, RoundingMode.UP);
    }

    private void f(byte b3) {
        if (b3 == 0) {
            l((byte) 0);
            l((byte) -1);
        } else if (b3 != -1) {
            l(b3);
        } else {
            l((byte) -1);
            l((byte) 0);
        }
    }

    private void g(byte b3) {
        if (b3 == 0) {
            m((byte) 0);
            m((byte) -1);
        } else if (b3 != -1) {
            m(b3);
        } else {
            m((byte) -1);
            m((byte) 0);
        }
    }

    private void l(byte b3) {
        b(1);
        byte[] bArr = this.f550a;
        int i3 = this.f551b;
        this.f551b = i3 + 1;
        bArr[i3] = b3;
    }

    private void m(byte b3) {
        b(1);
        byte[] bArr = this.f550a;
        int i3 = this.f551b;
        this.f551b = i3 + 1;
        bArr[i3] = (byte) (~b3);
    }

    private void p() {
        l((byte) 0);
        l((byte) 1);
    }

    private void q() {
        m((byte) 0);
        m((byte) 1);
    }

    public byte[] a() {
        return Arrays.copyOf(this.f550a, this.f551b);
    }

    public void c(byte[] bArr) {
        b(bArr.length);
        for (byte b3 : bArr) {
            byte[] bArr2 = this.f550a;
            int i3 = this.f551b;
            this.f551b = i3 + 1;
            bArr2[i3] = b3;
        }
    }

    public void h(AbstractC0791i abstractC0791i) {
        for (int i3 = 0; i3 < abstractC0791i.size(); i3++) {
            f(abstractC0791i.f(i3));
        }
        p();
    }

    public void i(AbstractC0791i abstractC0791i) {
        for (int i3 = 0; i3 < abstractC0791i.size(); i3++) {
            g(abstractC0791i.f(i3));
        }
        q();
    }

    public void j(double d3) {
        long jDoubleToLongBits = Double.doubleToLongBits(d3);
        t(jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public void k(double d3) {
        long jDoubleToLongBits = Double.doubleToLongBits(d3);
        u(jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public void n() {
        l((byte) -1);
        l((byte) -1);
    }

    public void o() {
        m((byte) -1);
        m((byte) -1);
    }

    public void r(long j3) {
        int i3;
        long j4 = j3 < 0 ? ~j3 : j3;
        if (j4 < 64) {
            b(1);
            byte[] bArr = this.f550a;
            int i4 = this.f551b;
            this.f551b = i4 + 1;
            bArr[i4] = (byte) (j3 ^ ((long) f549c[1][0]));
            return;
        }
        int iD = d(j4);
        b(iD);
        if (iD < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(iD)));
        }
        byte b3 = j3 < 0 ? (byte) -1 : (byte) 0;
        int i5 = this.f551b;
        if (iD == 10) {
            i3 = 2 + i5;
            byte[] bArr2 = this.f550a;
            bArr2[i5] = b3;
            bArr2[i5 + 1] = b3;
        } else if (iD == 9) {
            i3 = i5 + 1;
            this.f550a[i5] = b3;
        } else {
            i3 = i5;
        }
        for (int i6 = (iD - 1) + i5; i6 >= i3; i6--) {
            this.f550a[i6] = (byte) (255 & j3);
            j3 >>= 8;
        }
        byte[] bArr3 = this.f550a;
        int i7 = this.f551b;
        byte b4 = bArr3[i7];
        byte[] bArr4 = f549c[iD];
        bArr3[i7] = (byte) (b4 ^ bArr4[0]);
        int i8 = i7 + 1;
        bArr3[i8] = (byte) (bArr4[1] ^ bArr3[i8]);
        this.f551b = i7 + iD;
    }

    public void s(long j3) {
        r(~j3);
    }

    public void t(long j3) {
        int iE = e(j3);
        b(iE + 1);
        byte[] bArr = this.f550a;
        int i3 = this.f551b;
        int i4 = i3 + 1;
        this.f551b = i4;
        bArr[i3] = (byte) iE;
        int i5 = i4 + iE;
        while (true) {
            i5--;
            int i6 = this.f551b;
            if (i5 < i6) {
                this.f551b = i6 + iE;
                return;
            } else {
                this.f550a[i5] = (byte) (255 & j3);
                j3 >>>= 8;
            }
        }
    }

    public void u(long j3) {
        int iE = e(j3);
        b(iE + 1);
        byte[] bArr = this.f550a;
        int i3 = this.f551b;
        int i4 = i3 + 1;
        this.f551b = i4;
        bArr[i3] = (byte) (~iE);
        int i5 = i4 + iE;
        while (true) {
            i5--;
            int i6 = this.f551b;
            if (i5 < i6) {
                this.f551b = i6 + iE;
                return;
            } else {
                this.f550a[i5] = (byte) (~(255 & j3));
                j3 >>>= 8;
            }
        }
    }

    public void v(CharSequence charSequence) {
        int i3;
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length) {
            int iCharAt = charSequence.charAt(i4);
            if (iCharAt >= 128) {
                if (iCharAt < 2048) {
                    i3 = (iCharAt >>> 6) | 960;
                } else if (iCharAt < 55296 || 57343 < iCharAt) {
                    f((byte) ((iCharAt >>> 12) | 480));
                    i3 = ((iCharAt >>> 6) & 63) | 128;
                } else {
                    iCharAt = Character.codePointAt(charSequence, i4);
                    i4++;
                    f((byte) ((iCharAt >>> 18) | 240));
                    f((byte) (((iCharAt >>> 12) & 63) | 128));
                    f((byte) (((iCharAt >>> 6) & 63) | 128));
                    iCharAt = (iCharAt & 63) | 128;
                }
                f((byte) i3);
                iCharAt = (iCharAt & 63) | 128;
            }
            f((byte) iCharAt);
            i4++;
        }
        p();
    }

    public void w(CharSequence charSequence) {
        int i3;
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length) {
            int iCharAt = charSequence.charAt(i4);
            if (iCharAt >= 128) {
                if (iCharAt < 2048) {
                    i3 = (iCharAt >>> 6) | 960;
                } else if (iCharAt < 55296 || 57343 < iCharAt) {
                    g((byte) ((iCharAt >>> 12) | 480));
                    i3 = ((iCharAt >>> 6) & 63) | 128;
                } else {
                    iCharAt = Character.codePointAt(charSequence, i4);
                    i4++;
                    g((byte) ((iCharAt >>> 18) | 240));
                    g((byte) (((iCharAt >>> 12) & 63) | 128));
                    g((byte) (((iCharAt >>> 6) & 63) | 128));
                    iCharAt = (iCharAt & 63) | 128;
                }
                g((byte) i3);
                iCharAt = (iCharAt & 63) | 128;
            }
            g((byte) iCharAt);
            i4++;
        }
        q();
    }
}
