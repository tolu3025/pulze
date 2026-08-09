package m2;

import J1.AbstractC0406j;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class g implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9870d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f9871e = new g(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f9872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f9873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient String f9874c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final g a(String str) {
            kotlin.jvm.internal.m.e(str, "<this>");
            g gVar = new g(v.a(str));
            gVar.t(str);
            return gVar;
        }

        public final g b(byte... data) {
            kotlin.jvm.internal.m.e(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(this, size)");
            return new g(bArrCopyOf);
        }
    }

    public g(byte[] data) {
        kotlin.jvm.internal.m.e(data, "data");
        this.f9872a = data;
    }

    public static final g g(String str) {
        return f9870d.a(str);
    }

    public static final g p(byte... bArr) {
        return f9870d.b(bArr);
    }

    public String c() {
        return m2.a.b(i(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(m2.g r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.m.e(r10, r0)
            int r0 = r9.u()
            int r1 = r10.u()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.h(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.h(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g.compareTo(m2.g):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.u() == i().length && gVar.r(0, i(), 0, i().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte h(int i3) {
        return o(i3);
    }

    public int hashCode() {
        int iJ = j();
        if (iJ != 0) {
            return iJ;
        }
        int iHashCode = Arrays.hashCode(i());
        s(iHashCode);
        return iHashCode;
    }

    public final byte[] i() {
        return this.f9872a;
    }

    public final int j() {
        return this.f9873b;
    }

    public int k() {
        return i().length;
    }

    public final String l() {
        return this.f9874c;
    }

    public String m() {
        char[] cArr = new char[i().length * 2];
        int i3 = 0;
        for (byte b3 : i()) {
            int i4 = i3 + 1;
            cArr[i3] = n2.b.d()[(b3 >> 4) & 15];
            i3 += 2;
            cArr[i4] = n2.b.d()[b3 & 15];
        }
        return b2.o.h(cArr);
    }

    public byte[] n() {
        return i();
    }

    public byte o(int i3) {
        return i()[i3];
    }

    public boolean q(int i3, g other, int i4, int i5) {
        kotlin.jvm.internal.m.e(other, "other");
        return other.r(i4, i(), i3, i5);
    }

    public boolean r(int i3, byte[] other, int i4, int i5) {
        kotlin.jvm.internal.m.e(other, "other");
        return i3 >= 0 && i3 <= i().length - i5 && i4 >= 0 && i4 <= other.length - i5 && b.a(i(), i3, other, i4, i5);
    }

    public final void s(int i3) {
        this.f9873b = i3;
    }

    public final void t(String str) {
        this.f9874c = str;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (i().length != 0) {
            int iB = n2.b.b(i(), 64);
            if (iB != -1) {
                String strY = y();
                String strSubstring = strY.substring(0, iB);
                kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strN = b2.o.n(b2.o.n(b2.o.n(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (iB >= strY.length()) {
                    sb = new StringBuilder();
                    sb.append("[text=");
                    sb.append(strN);
                    sb.append(']');
                    return sb.toString();
                }
                sb = new StringBuilder();
                sb.append("[size=");
                sb.append(i().length);
                sb.append(" text=");
                sb.append(strN);
            } else if (i().length <= 64) {
                str = "[hex=" + m() + ']';
            } else {
                sb = new StringBuilder();
                sb.append("[size=");
                sb.append(i().length);
                sb.append(" hex=");
                int iC = b.c(this, 64);
                if (iC > i().length) {
                    throw new IllegalArgumentException(("endIndex > length(" + i().length + ')').toString());
                }
                if (iC < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
                sb.append((iC == i().length ? this : new g(AbstractC0406j.h(i(), 0, iC))).m());
            }
            sb.append("…]");
            return sb.toString();
        }
        str = "[size=0]";
        return str;
    }

    public final int u() {
        return k();
    }

    public final boolean v(g prefix) {
        kotlin.jvm.internal.m.e(prefix, "prefix");
        return q(0, prefix, 0, prefix.u());
    }

    public g w() {
        for (int i3 = 0; i3 < i().length; i3++) {
            byte b3 = i()[i3];
            if (b3 >= 65 && b3 <= 90) {
                byte[] bArrI = i();
                byte[] bArrCopyOf = Arrays.copyOf(bArrI, bArrI.length);
                kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i3] = (byte) (b3 + 32);
                for (int i4 = i3 + 1; i4 < bArrCopyOf.length; i4++) {
                    byte b4 = bArrCopyOf[i4];
                    if (b4 >= 65 && b4 <= 90) {
                        bArrCopyOf[i4] = (byte) (b4 + 32);
                    }
                }
                return new g(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] x() {
        byte[] bArrI = i();
        byte[] bArrCopyOf = Arrays.copyOf(bArrI, bArrI.length);
        kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public String y() {
        String strL = l();
        if (strL != null) {
            return strL;
        }
        String strB = v.b(n());
        t(strB);
        return strB;
    }

    public void z(d buffer, int i3, int i4) {
        kotlin.jvm.internal.m.e(buffer, "buffer");
        n2.b.c(this, buffer, i3, i4);
    }
}
