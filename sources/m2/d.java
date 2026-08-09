package m2;

import J1.AbstractC0406j;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class d implements f, e, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f9861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f9862b;

    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f9863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o f9864b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f9866d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f9865c = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9867e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9868f = -1;

        public final void b(o oVar) {
            this.f9864b = oVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f9863a == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f9863a = null;
            b(null);
            this.f9865c = -1L;
            this.f9866d = null;
            this.f9867e = -1;
            this.f9868f = -1;
        }
    }

    public static final class b extends OutputStream {
        b() {
        }

        public String toString() {
            return d.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i3) {
            d.this.v(i3);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i3, int i4) {
            kotlin.jvm.internal.m.e(data, "data");
            d.this.h0(data, i3, i4);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    @Override // m2.t
    public long A(d sink, long j3) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (b0() == 0) {
            return -1L;
        }
        if (j3 > b0()) {
            j3 = b0();
        }
        sink.T(this, j3);
        return j3;
    }

    public long B(byte b3, long j3, long j4) {
        o oVar;
        int i3;
        long jB0 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + b0() + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        if (j4 > b0()) {
            j4 = b0();
        }
        if (j3 == j4 || (oVar = this.f9861a) == null) {
            return -1L;
        }
        if (b0() - j3 < j3) {
            jB0 = b0();
            while (jB0 > j3) {
                oVar = oVar.f9893g;
                kotlin.jvm.internal.m.b(oVar);
                jB0 -= (long) (oVar.f9889c - oVar.f9888b);
            }
            while (jB0 < j4) {
                byte[] bArr = oVar.f9887a;
                int iMin = (int) Math.min(oVar.f9889c, (((long) oVar.f9888b) + j4) - jB0);
                i3 = (int) ((((long) oVar.f9888b) + j3) - jB0);
                while (i3 < iMin) {
                    if (bArr[i3] != b3) {
                        i3++;
                    }
                }
                jB0 += (long) (oVar.f9889c - oVar.f9888b);
                oVar = oVar.f9892f;
                kotlin.jvm.internal.m.b(oVar);
                j3 = jB0;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (oVar.f9889c - oVar.f9888b)) + jB0;
            if (j5 > j3) {
                break;
            }
            oVar = oVar.f9892f;
            kotlin.jvm.internal.m.b(oVar);
            jB0 = j5;
        }
        while (jB0 < j4) {
            byte[] bArr2 = oVar.f9887a;
            int iMin2 = (int) Math.min(oVar.f9889c, (((long) oVar.f9888b) + j4) - jB0);
            i3 = (int) ((((long) oVar.f9888b) + j3) - jB0);
            while (i3 < iMin2) {
                if (bArr2[i3] != b3) {
                    i3++;
                }
            }
            jB0 += (long) (oVar.f9889c - oVar.f9888b);
            oVar = oVar.f9892f;
            kotlin.jvm.internal.m.b(oVar);
            j3 = jB0;
        }
        return -1L;
        return ((long) (i3 - oVar.f9888b)) + jB0;
    }

    public OutputStream K() {
        return new b();
    }

    public int L(byte[] sink, int i3, int i4) {
        kotlin.jvm.internal.m.e(sink, "sink");
        m2.b.b(sink.length, i3, i4);
        o oVar = this.f9861a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(i4, oVar.f9889c - oVar.f9888b);
        byte[] bArr = oVar.f9887a;
        int i5 = oVar.f9888b;
        AbstractC0406j.d(bArr, sink, i3, i5, i5 + iMin);
        oVar.f9888b += iMin;
        a0(b0() - ((long) iMin));
        if (oVar.f9888b == oVar.f9889c) {
            this.f9861a = oVar.b();
            p.b(oVar);
        }
        return iMin;
    }

    @Override // m2.f
    public void M(long j3) throws EOFException {
        if (this.f9862b < j3) {
            throw new EOFException();
        }
    }

    public byte[] P() {
        return x(b0());
    }

    public g R() {
        return h(b0());
    }

    @Override // m2.r
    public void T(d source, long j3) {
        o oVar;
        kotlin.jvm.internal.m.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        m2.b.b(source.b0(), 0L, j3);
        while (j3 > 0) {
            o oVar2 = source.f9861a;
            kotlin.jvm.internal.m.b(oVar2);
            int i3 = oVar2.f9889c;
            kotlin.jvm.internal.m.b(source.f9861a);
            if (j3 < i3 - r1.f9888b) {
                o oVar3 = this.f9861a;
                if (oVar3 != null) {
                    kotlin.jvm.internal.m.b(oVar3);
                    oVar = oVar3.f9893g;
                } else {
                    oVar = null;
                }
                if (oVar != null && oVar.f9891e) {
                    if ((((long) oVar.f9889c) + j3) - ((long) (oVar.f9890d ? 0 : oVar.f9888b)) <= 8192) {
                        o oVar4 = source.f9861a;
                        kotlin.jvm.internal.m.b(oVar4);
                        oVar4.f(oVar, (int) j3);
                        source.a0(source.b0() - j3);
                        a0(b0() + j3);
                        return;
                    }
                }
                o oVar5 = source.f9861a;
                kotlin.jvm.internal.m.b(oVar5);
                source.f9861a = oVar5.e((int) j3);
            }
            o oVar6 = source.f9861a;
            kotlin.jvm.internal.m.b(oVar6);
            long j4 = oVar6.f9889c - oVar6.f9888b;
            source.f9861a = oVar6.b();
            o oVar7 = this.f9861a;
            if (oVar7 == null) {
                this.f9861a = oVar6;
                oVar6.f9893g = oVar6;
                oVar6.f9892f = oVar6;
            } else {
                kotlin.jvm.internal.m.b(oVar7);
                o oVar8 = oVar7.f9893g;
                kotlin.jvm.internal.m.b(oVar8);
                oVar8.c(oVar6).a();
            }
            source.a0(source.b0() - j4);
            a0(b0() + j4);
            j3 -= j4;
        }
    }

    public void U(byte[] sink) throws EOFException {
        kotlin.jvm.internal.m.e(sink, "sink");
        int i3 = 0;
        while (i3 < sink.length) {
            int iL = L(sink, i3, sink.length - i3);
            if (iL == -1) {
                throw new EOFException();
            }
            i3 += iL;
        }
    }

    public String V(long j3, Charset charset) throws EOFException {
        kotlin.jvm.internal.m.e(charset, "charset");
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (this.f9862b < j3) {
            throw new EOFException();
        }
        if (j3 == 0) {
            return "";
        }
        o oVar = this.f9861a;
        kotlin.jvm.internal.m.b(oVar);
        int i3 = oVar.f9888b;
        if (((long) i3) + j3 > oVar.f9889c) {
            return new String(x(j3), charset);
        }
        int i4 = (int) j3;
        String str = new String(oVar.f9887a, i3, i4, charset);
        int i5 = oVar.f9888b + i4;
        oVar.f9888b = i5;
        this.f9862b -= j3;
        if (i5 == oVar.f9889c) {
            this.f9861a = oVar.b();
            p.b(oVar);
        }
        return str;
    }

    public String W() {
        return V(this.f9862b, b2.c.f4952b);
    }

    public String X(long j3) {
        return V(j3, b2.c.f4952b);
    }

    public String Y() {
        return Z(Long.MAX_VALUE);
    }

    public String Z(long j3) throws EOFException {
        if (j3 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j3).toString());
        }
        long j4 = j3 != Long.MAX_VALUE ? j3 + 1 : Long.MAX_VALUE;
        long jB = B((byte) 10, 0L, j4);
        if (jB != -1) {
            return n2.a.b(this, jB);
        }
        if (j4 < b0() && z(j4 - 1) == 13 && z(j4) == 10) {
            return n2.a.b(this, j4);
        }
        d dVar = new d();
        u(dVar, 0L, Math.min(32, b0()));
        throw new EOFException("\\n not found: limit=" + Math.min(b0(), j3) + " content=" + dVar.R().m() + (char) 8230);
    }

    public final void a0(long j3) {
        this.f9862b = j3;
    }

    public final long b0() {
        return this.f9862b;
    }

    public final void c() throws EOFException {
        k(b0());
    }

    public final g c0() {
        if (b0() <= 2147483647L) {
            return d0((int) b0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + b0()).toString());
    }

    public final g d0(int i3) {
        if (i3 == 0) {
            return g.f9871e;
        }
        m2.b.b(b0(), 0L, i3);
        o oVar = this.f9861a;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            kotlin.jvm.internal.m.b(oVar);
            int i7 = oVar.f9889c;
            int i8 = oVar.f9888b;
            if (i7 == i8) {
                throw new AssertionError("s.limit == s.pos");
            }
            i5 += i7 - i8;
            i6++;
            oVar = oVar.f9892f;
        }
        byte[][] bArr = new byte[i6][];
        int[] iArr = new int[i6 * 2];
        o oVar2 = this.f9861a;
        int i9 = 0;
        while (i4 < i3) {
            kotlin.jvm.internal.m.b(oVar2);
            bArr[i9] = oVar2.f9887a;
            i4 += oVar2.f9889c - oVar2.f9888b;
            iArr[i9] = Math.min(i4, i3);
            iArr[i9 + i6] = oVar2.f9888b;
            oVar2.f9890d = true;
            i9++;
            oVar2 = oVar2.f9892f;
        }
        return new q(bArr, iArr);
    }

    public final o e0(int i3) {
        if (i3 < 1 || i3 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        o oVar = this.f9861a;
        if (oVar != null) {
            kotlin.jvm.internal.m.b(oVar);
            o oVar2 = oVar.f9893g;
            kotlin.jvm.internal.m.b(oVar2);
            return (oVar2.f9889c + i3 > 8192 || !oVar2.f9891e) ? oVar2.c(p.c()) : oVar2;
        }
        o oVarC = p.c();
        this.f9861a = oVarC;
        oVarC.f9893g = oVarC;
        oVarC.f9892f = oVarC;
        return oVarC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (b0() == dVar.b0()) {
                if (b0() == 0) {
                    return true;
                }
                o oVar = this.f9861a;
                kotlin.jvm.internal.m.b(oVar);
                o oVar2 = dVar.f9861a;
                kotlin.jvm.internal.m.b(oVar2);
                int i3 = oVar.f9888b;
                int i4 = oVar2.f9888b;
                long j3 = 0;
                while (j3 < b0()) {
                    long jMin = Math.min(oVar.f9889c - i3, oVar2.f9889c - i4);
                    long j4 = 0;
                    while (j4 < jMin) {
                        int i5 = i3 + 1;
                        int i6 = i4 + 1;
                        if (oVar.f9887a[i3] == oVar2.f9887a[i4]) {
                            j4++;
                            i3 = i5;
                            i4 = i6;
                        }
                    }
                    if (i3 == oVar.f9889c) {
                        oVar = oVar.f9892f;
                        kotlin.jvm.internal.m.b(oVar);
                        i3 = oVar.f9888b;
                    }
                    if (i4 == oVar2.f9889c) {
                        oVar2 = oVar2.f9892f;
                        kotlin.jvm.internal.m.b(oVar2);
                        i4 = oVar2.f9888b;
                    }
                    j3 += jMin;
                }
                return true;
            }
        }
        return false;
    }

    public d f0(g byteString) {
        kotlin.jvm.internal.m.e(byteString, "byteString");
        byteString.z(this, 0, byteString.u());
        return this;
    }

    @Override // m2.e
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public d y(byte[] source) {
        kotlin.jvm.internal.m.e(source, "source");
        return h0(source, 0, source.length);
    }

    @Override // m2.f
    public g h(long j3) throws EOFException {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (b0() < j3) {
            throw new EOFException();
        }
        if (j3 < 4096) {
            return new g(x(j3));
        }
        g gVarD0 = d0((int) j3);
        k(j3);
        return gVarD0;
    }

    public d h0(byte[] source, int i3, int i4) {
        kotlin.jvm.internal.m.e(source, "source");
        long j3 = i4;
        m2.b.b(source.length, i3, j3);
        int i5 = i4 + i3;
        while (i3 < i5) {
            o oVarE0 = e0(1);
            int iMin = Math.min(i5 - i3, 8192 - oVarE0.f9889c);
            int i6 = i3 + iMin;
            AbstractC0406j.d(source, oVarE0.f9887a, oVarE0.f9889c, i3, i6);
            oVarE0.f9889c += iMin;
            i3 = i6;
        }
        a0(b0() + j3);
        return this;
    }

    public int hashCode() {
        o oVar = this.f9861a;
        if (oVar == null) {
            return 0;
        }
        int i3 = 1;
        do {
            int i4 = oVar.f9889c;
            for (int i5 = oVar.f9888b; i5 < i4; i5++) {
                i3 = (i3 * 31) + oVar.f9887a[i5];
            }
            oVar = oVar.f9892f;
            kotlin.jvm.internal.m.b(oVar);
        } while (oVar != this.f9861a);
        return i3;
    }

    @Override // m2.e
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public d v(int i3) {
        o oVarE0 = e0(1);
        byte[] bArr = oVarE0.f9887a;
        int i4 = oVarE0.f9889c;
        oVarE0.f9889c = i4 + 1;
        bArr[i4] = (byte) i3;
        a0(b0() + 1);
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public d j0(long j3) {
        if (j3 == 0) {
            return v(48);
        }
        long j4 = (j3 >>> 1) | j3;
        long j5 = j4 | (j4 >>> 2);
        long j6 = j5 | (j5 >>> 4);
        long j7 = j6 | (j6 >>> 8);
        long j8 = j7 | (j7 >>> 16);
        long j9 = j8 | (j8 >>> 32);
        long j10 = j9 - ((j9 >>> 1) & 6148914691236517205L);
        long j11 = ((j10 >>> 2) & 3689348814741910323L) + (j10 & 3689348814741910323L);
        long j12 = ((j11 >>> 4) + j11) & 1085102592571150095L;
        long j13 = j12 + (j12 >>> 8);
        long j14 = j13 + (j13 >>> 16);
        int i3 = (int) ((((j14 & 63) + ((j14 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        o oVarE0 = e0(i3);
        byte[] bArr = oVarE0.f9887a;
        int i4 = oVarE0.f9889c;
        for (int i5 = (i4 + i3) - 1; i5 >= i4; i5--) {
            bArr[i5] = n2.a.a()[(int) (15 & j3)];
            j3 >>>= 4;
        }
        oVarE0.f9889c += i3;
        a0(b0() + ((long) i3));
        return this;
    }

    @Override // m2.f
    public void k(long j3) throws EOFException {
        while (j3 > 0) {
            o oVar = this.f9861a;
            if (oVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j3, oVar.f9889c - oVar.f9888b);
            long j4 = iMin;
            a0(b0() - j4);
            j3 -= j4;
            int i3 = oVar.f9888b + iMin;
            oVar.f9888b = i3;
            if (i3 == oVar.f9889c) {
                this.f9861a = oVar.b();
                p.b(oVar);
            }
        }
    }

    @Override // m2.e
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public d o(int i3) {
        o oVarE0 = e0(4);
        byte[] bArr = oVarE0.f9887a;
        int i4 = oVarE0.f9889c;
        bArr[i4] = (byte) ((i3 >>> 24) & 255);
        bArr[i4 + 1] = (byte) ((i3 >>> 16) & 255);
        bArr[i4 + 2] = (byte) ((i3 >>> 8) & 255);
        bArr[i4 + 3] = (byte) (i3 & 255);
        oVarE0.f9889c = i4 + 4;
        a0(b0() + 4);
        return this;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d clone() {
        return r();
    }

    @Override // m2.e
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public d m(int i3) {
        o oVarE0 = e0(2);
        byte[] bArr = oVarE0.f9887a;
        int i4 = oVarE0.f9889c;
        bArr[i4] = (byte) ((i3 >>> 8) & 255);
        bArr[i4 + 1] = (byte) (i3 & 255);
        oVarE0.f9889c = i4 + 2;
        a0(b0() + 2);
        return this;
    }

    public final d m0(OutputStream out, long j3) throws IOException {
        kotlin.jvm.internal.m.e(out, "out");
        m2.b.b(this.f9862b, 0L, j3);
        o oVar = this.f9861a;
        while (j3 > 0) {
            kotlin.jvm.internal.m.b(oVar);
            int iMin = (int) Math.min(j3, oVar.f9889c - oVar.f9888b);
            out.write(oVar.f9887a, oVar.f9888b, iMin);
            int i3 = oVar.f9888b + iMin;
            oVar.f9888b = i3;
            long j4 = iMin;
            this.f9862b -= j4;
            j3 -= j4;
            if (i3 == oVar.f9889c) {
                o oVarB = oVar.b();
                this.f9861a = oVarB;
                p.b(oVar);
                oVar = oVarB;
            }
        }
        return this;
    }

    @Override // m2.e
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public d O(String string) {
        kotlin.jvm.internal.m.e(string, "string");
        return o0(string, 0, string.length());
    }

    public d o0(String string, int i3, int i4) {
        char cCharAt;
        long jB0;
        long j3;
        kotlin.jvm.internal.m.e(string, "string");
        if (i3 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i3).toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i4 + " < " + i3).toString());
        }
        if (i4 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i4 + " > " + string.length()).toString());
        }
        while (i3 < i4) {
            char cCharAt2 = string.charAt(i3);
            if (cCharAt2 < 128) {
                o oVarE0 = e0(1);
                byte[] bArr = oVarE0.f9887a;
                int i5 = oVarE0.f9889c - i3;
                int iMin = Math.min(i4, 8192 - i5);
                int i6 = i3 + 1;
                bArr[i3 + i5] = (byte) cCharAt2;
                while (true) {
                    i3 = i6;
                    if (i3 >= iMin || (cCharAt = string.charAt(i3)) >= 128) {
                        break;
                    }
                    i6 = i3 + 1;
                    bArr[i3 + i5] = (byte) cCharAt;
                }
                int i7 = oVarE0.f9889c;
                int i8 = (i5 + i3) - i7;
                oVarE0.f9889c = i7 + i8;
                a0(b0() + ((long) i8));
            } else {
                if (cCharAt2 < 2048) {
                    o oVarE02 = e0(2);
                    byte[] bArr2 = oVarE02.f9887a;
                    int i9 = oVarE02.f9889c;
                    bArr2[i9] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i9 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    oVarE02.f9889c = i9 + 2;
                    jB0 = b0();
                    j3 = 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    o oVarE03 = e0(3);
                    byte[] bArr3 = oVarE03.f9887a;
                    int i10 = oVarE03.f9889c;
                    bArr3[i10] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i10 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i10 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    oVarE03.f9889c = i10 + 3;
                    jB0 = b0();
                    j3 = 3;
                } else {
                    int i11 = i3 + 1;
                    char cCharAt3 = i11 < i4 ? string.charAt(i11) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        v(63);
                        i3 = i11;
                    } else {
                        int i12 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        o oVarE04 = e0(4);
                        byte[] bArr4 = oVarE04.f9887a;
                        int i13 = oVarE04.f9889c;
                        bArr4[i13] = (byte) ((i12 >> 18) | 240);
                        bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                        bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                        bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                        oVarE04.f9889c = i13 + 4;
                        a0(b0() + 4);
                        i3 += 2;
                    }
                }
                a0(jB0 + j3);
                i3++;
            }
        }
        return this;
    }

    public d p0(int i3) {
        long jB0;
        long j3;
        if (i3 < 128) {
            v(i3);
        } else {
            if (i3 < 2048) {
                o oVarE0 = e0(2);
                byte[] bArr = oVarE0.f9887a;
                int i4 = oVarE0.f9889c;
                bArr[i4] = (byte) ((i3 >> 6) | 192);
                bArr[i4 + 1] = (byte) ((i3 & 63) | 128);
                oVarE0.f9889c = i4 + 2;
                jB0 = b0();
                j3 = 2;
            } else if (55296 <= i3 && i3 < 57344) {
                v(63);
            } else if (i3 < 65536) {
                o oVarE02 = e0(3);
                byte[] bArr2 = oVarE02.f9887a;
                int i5 = oVarE02.f9889c;
                bArr2[i5] = (byte) ((i3 >> 12) | 224);
                bArr2[i5 + 1] = (byte) (((i3 >> 6) & 63) | 128);
                bArr2[i5 + 2] = (byte) ((i3 & 63) | 128);
                oVarE02.f9889c = i5 + 3;
                jB0 = b0();
                j3 = 3;
            } else {
                if (i3 > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: 0x" + m2.b.d(i3));
                }
                o oVarE03 = e0(4);
                byte[] bArr3 = oVarE03.f9887a;
                int i6 = oVarE03.f9889c;
                bArr3[i6] = (byte) ((i3 >> 18) | 240);
                bArr3[i6 + 1] = (byte) (((i3 >> 12) & 63) | 128);
                bArr3[i6 + 2] = (byte) (((i3 >> 6) & 63) | 128);
                bArr3[i6 + 3] = (byte) ((i3 & 63) | 128);
                oVarE03.f9889c = i6 + 4;
                jB0 = b0();
                j3 = 4;
            }
            a0(jB0 + j3);
        }
        return this;
    }

    public final long q() {
        long jB0 = b0();
        if (jB0 == 0) {
            return 0L;
        }
        o oVar = this.f9861a;
        kotlin.jvm.internal.m.b(oVar);
        o oVar2 = oVar.f9893g;
        kotlin.jvm.internal.m.b(oVar2);
        int i3 = oVar2.f9889c;
        if (i3 < 8192 && oVar2.f9891e) {
            jB0 -= (long) (i3 - oVar2.f9888b);
        }
        return jB0;
    }

    public final d r() {
        d dVar = new d();
        if (b0() != 0) {
            o oVar = this.f9861a;
            kotlin.jvm.internal.m.b(oVar);
            o oVarD = oVar.d();
            dVar.f9861a = oVarD;
            oVarD.f9893g = oVarD;
            oVarD.f9892f = oVarD;
            for (o oVar2 = oVar.f9892f; oVar2 != oVar; oVar2 = oVar2.f9892f) {
                o oVar3 = oVarD.f9893g;
                kotlin.jvm.internal.m.b(oVar3);
                kotlin.jvm.internal.m.b(oVar2);
                oVar3.c(oVar2.d());
            }
            dVar.a0(b0());
        }
        return dVar;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        o oVar = this.f9861a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), oVar.f9889c - oVar.f9888b);
        sink.put(oVar.f9887a, oVar.f9888b, iMin);
        int i3 = oVar.f9888b + iMin;
        oVar.f9888b = i3;
        this.f9862b -= (long) iMin;
        if (i3 == oVar.f9889c) {
            this.f9861a = oVar.b();
            p.b(oVar);
        }
        return iMin;
    }

    @Override // m2.f
    public byte readByte() throws EOFException {
        if (b0() == 0) {
            throw new EOFException();
        }
        o oVar = this.f9861a;
        kotlin.jvm.internal.m.b(oVar);
        int i3 = oVar.f9888b;
        int i4 = oVar.f9889c;
        int i5 = i3 + 1;
        byte b3 = oVar.f9887a[i3];
        a0(b0() - 1);
        if (i5 == i4) {
            this.f9861a = oVar.b();
            p.b(oVar);
        } else {
            oVar.f9888b = i5;
        }
        return b3;
    }

    @Override // m2.f
    public int readInt() throws EOFException {
        if (b0() < 4) {
            throw new EOFException();
        }
        o oVar = this.f9861a;
        kotlin.jvm.internal.m.b(oVar);
        int i3 = oVar.f9888b;
        int i4 = oVar.f9889c;
        if (i4 - i3 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = oVar.f9887a;
        int i5 = i3 + 3;
        int i6 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 2] & 255) << 8);
        int i7 = i3 + 4;
        int i8 = (bArr[i5] & 255) | i6;
        a0(b0() - 4);
        if (i7 == i4) {
            this.f9861a = oVar.b();
            p.b(oVar);
        } else {
            oVar.f9888b = i7;
        }
        return i8;
    }

    @Override // m2.f
    public short readShort() throws EOFException {
        if (b0() < 2) {
            throw new EOFException();
        }
        o oVar = this.f9861a;
        kotlin.jvm.internal.m.b(oVar);
        int i3 = oVar.f9888b;
        int i4 = oVar.f9889c;
        if (i4 - i3 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = oVar.f9887a;
        int i5 = i3 + 1;
        int i6 = (bArr[i3] & 255) << 8;
        int i7 = i3 + 2;
        int i8 = (bArr[i5] & 255) | i6;
        a0(b0() - 2);
        if (i7 == i4) {
            this.f9861a = oVar.b();
            p.b(oVar);
        } else {
            oVar.f9888b = i7;
        }
        return (short) i8;
    }

    @Override // m2.f
    public boolean t() {
        return this.f9862b == 0;
    }

    public String toString() {
        return c0().toString();
    }

    public final d u(d out, long j3, long j4) {
        kotlin.jvm.internal.m.e(out, "out");
        m2.b.b(b0(), j3, j4);
        if (j4 != 0) {
            out.a0(out.b0() + j4);
            o oVar = this.f9861a;
            while (true) {
                kotlin.jvm.internal.m.b(oVar);
                int i3 = oVar.f9889c;
                int i4 = oVar.f9888b;
                if (j3 < i3 - i4) {
                    break;
                }
                j3 -= (long) (i3 - i4);
                oVar = oVar.f9892f;
            }
            while (j4 > 0) {
                kotlin.jvm.internal.m.b(oVar);
                o oVarD = oVar.d();
                int i5 = oVarD.f9888b + ((int) j3);
                oVarD.f9888b = i5;
                oVarD.f9889c = Math.min(i5 + ((int) j4), oVarD.f9889c);
                o oVar2 = out.f9861a;
                if (oVar2 == null) {
                    oVarD.f9893g = oVarD;
                    oVarD.f9892f = oVarD;
                    out.f9861a = oVarD;
                } else {
                    kotlin.jvm.internal.m.b(oVar2);
                    o oVar3 = oVar2.f9893g;
                    kotlin.jvm.internal.m.b(oVar3);
                    oVar3.c(oVarD);
                }
                j4 -= (long) (oVarD.f9889c - oVarD.f9888b);
                oVar = oVar.f9892f;
                j3 = 0;
            }
        }
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.m.e(source, "source");
        int iRemaining = source.remaining();
        int i3 = iRemaining;
        while (i3 > 0) {
            o oVarE0 = e0(1);
            int iMin = Math.min(i3, 8192 - oVarE0.f9889c);
            source.get(oVarE0.f9887a, oVarE0.f9889c, iMin);
            i3 -= iMin;
            oVarE0.f9889c += iMin;
        }
        this.f9862b += (long) iRemaining;
        return iRemaining;
    }

    @Override // m2.f
    public byte[] x(long j3) throws EOFException {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (b0() < j3) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j3];
        U(bArr);
        return bArr;
    }

    public final byte z(long j3) {
        m2.b.b(b0(), j3, 1L);
        o oVar = this.f9861a;
        if (oVar == null) {
            kotlin.jvm.internal.m.b(null);
            throw null;
        }
        if (b0() - j3 < j3) {
            long jB0 = b0();
            while (jB0 > j3) {
                oVar = oVar.f9893g;
                kotlin.jvm.internal.m.b(oVar);
                jB0 -= (long) (oVar.f9889c - oVar.f9888b);
            }
            kotlin.jvm.internal.m.b(oVar);
            return oVar.f9887a[(int) ((((long) oVar.f9888b) + j3) - jB0)];
        }
        long j4 = 0;
        while (true) {
            long j5 = ((long) (oVar.f9889c - oVar.f9888b)) + j4;
            if (j5 > j3) {
                kotlin.jvm.internal.m.b(oVar);
                return oVar.f9887a[(int) ((((long) oVar.f9888b) + j3) - j4)];
            }
            oVar = oVar.f9892f;
            kotlin.jvm.internal.m.b(oVar);
            j4 = j5;
        }
    }

    public d b() {
        return this;
    }

    @Override // m2.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // m2.e, m2.r, java.io.Flushable
    public void flush() {
    }

    @Override // m2.f
    public d s() {
        return this;
    }
}
