package m2;

import J1.AbstractC0406j;

/* JADX INFO: loaded from: classes.dex */
public final class q extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient byte[][] f9899f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final transient int[] f9900l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(byte[][] segments, int[] directory) {
        super(g.f9871e.i());
        kotlin.jvm.internal.m.e(segments, "segments");
        kotlin.jvm.internal.m.e(directory, "directory");
        this.f9899f = segments;
        this.f9900l = directory;
    }

    private final g C() {
        return new g(x());
    }

    public final int[] A() {
        return this.f9900l;
    }

    public final byte[][] B() {
        return this.f9899f;
    }

    @Override // m2.g
    public String c() {
        return C().c();
    }

    @Override // m2.g
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.u() == u() && q(0, gVar, 0, u())) {
                return true;
            }
        }
        return false;
    }

    @Override // m2.g
    public int hashCode() {
        int iJ = j();
        if (iJ != 0) {
            return iJ;
        }
        int length = B().length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            int i6 = A()[length + i3];
            int i7 = A()[i3];
            byte[] bArr = B()[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        s(i4);
        return i4;
    }

    @Override // m2.g
    public int k() {
        return A()[B().length - 1];
    }

    @Override // m2.g
    public String m() {
        return C().m();
    }

    @Override // m2.g
    public byte[] n() {
        return x();
    }

    @Override // m2.g
    public byte o(int i3) {
        b.b(A()[B().length - 1], i3, 1L);
        int iB = n2.c.b(this, i3);
        return B()[iB][(i3 - (iB == 0 ? 0 : A()[iB - 1])) + A()[B().length + iB]];
    }

    @Override // m2.g
    public boolean q(int i3, g other, int i4, int i5) {
        kotlin.jvm.internal.m.e(other, "other");
        if (i3 < 0 || i3 > u() - i5) {
            return false;
        }
        int i6 = i5 + i3;
        int iB = n2.c.b(this, i3);
        while (i3 < i6) {
            int i7 = iB == 0 ? 0 : A()[iB - 1];
            int i8 = A()[iB] - i7;
            int i9 = A()[B().length + iB];
            int iMin = Math.min(i6, i8 + i7) - i3;
            if (!other.r(i4, B()[iB], i9 + (i3 - i7), iMin)) {
                return false;
            }
            i4 += iMin;
            i3 += iMin;
            iB++;
        }
        return true;
    }

    @Override // m2.g
    public boolean r(int i3, byte[] other, int i4, int i5) {
        kotlin.jvm.internal.m.e(other, "other");
        if (i3 < 0 || i3 > u() - i5 || i4 < 0 || i4 > other.length - i5) {
            return false;
        }
        int i6 = i5 + i3;
        int iB = n2.c.b(this, i3);
        while (i3 < i6) {
            int i7 = iB == 0 ? 0 : A()[iB - 1];
            int i8 = A()[iB] - i7;
            int i9 = A()[B().length + iB];
            int iMin = Math.min(i6, i8 + i7) - i3;
            if (!b.a(B()[iB], i9 + (i3 - i7), other, i4, iMin)) {
                return false;
            }
            i4 += iMin;
            i3 += iMin;
            iB++;
        }
        return true;
    }

    @Override // m2.g
    public String toString() {
        return C().toString();
    }

    @Override // m2.g
    public g w() {
        return C().w();
    }

    @Override // m2.g
    public byte[] x() {
        byte[] bArr = new byte[u()];
        int length = B().length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int i6 = A()[length + i3];
            int i7 = A()[i3];
            int i8 = i7 - i4;
            AbstractC0406j.d(B()[i3], bArr, i5, i6, i6 + i8);
            i5 += i8;
            i3++;
            i4 = i7;
        }
        return bArr;
    }

    @Override // m2.g
    public void z(d buffer, int i3, int i4) {
        kotlin.jvm.internal.m.e(buffer, "buffer");
        int i5 = i3 + i4;
        int iB = n2.c.b(this, i3);
        while (i3 < i5) {
            int i6 = iB == 0 ? 0 : A()[iB - 1];
            int i7 = A()[iB] - i6;
            int i8 = A()[B().length + iB];
            int iMin = Math.min(i5, i7 + i6) - i3;
            int i9 = i8 + (i3 - i6);
            o oVar = new o(B()[iB], i9, i9 + iMin, true, false);
            o oVar2 = buffer.f9861a;
            if (oVar2 == null) {
                oVar.f9893g = oVar;
                oVar.f9892f = oVar;
                buffer.f9861a = oVar;
            } else {
                kotlin.jvm.internal.m.b(oVar2);
                o oVar3 = oVar2.f9893g;
                kotlin.jvm.internal.m.b(oVar3);
                oVar3.c(oVar);
            }
            i3 += iMin;
            iB++;
        }
        buffer.a0(buffer.b0() + ((long) i4));
    }
}
