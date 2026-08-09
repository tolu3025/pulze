package io.grpc.internal;

import e0.AbstractC0829j;
import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes.dex */
class T implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8700f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Inflater f8701l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f8704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8705p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f8706q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0972v f8695a = new C0972v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CRC32 f8696b = new CRC32();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f8697c = new b(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f8698d = new byte[512];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f8702m = c.HEADER;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8703n = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f8707r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8708s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8709t = true;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8710a;

        static {
            int[] iArr = new int[c.values().length];
            f8710a = iArr;
            try {
                iArr[c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8710a[c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8710a[c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8710a[c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8710a[c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8710a[c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8710a[c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8710a[c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8710a[c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8710a[c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            while (k() > 0) {
                if (h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h() {
            int unsignedByte;
            if (T.this.f8700f - T.this.f8699e > 0) {
                unsignedByte = T.this.f8698d[T.this.f8699e] & 255;
                T.f(T.this, 1);
            } else {
                unsignedByte = T.this.f8695a.readUnsignedByte();
            }
            T.this.f8696b.update(unsignedByte);
            T.u(T.this, 1);
            return unsignedByte;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return ((long) j()) | (((long) j()) << 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int j() {
            return h() | (h() << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int k() {
            return (T.this.f8700f - T.this.f8699e) + T.this.f8695a.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(int i3) {
            int i4;
            int i5 = T.this.f8700f - T.this.f8699e;
            if (i5 > 0) {
                int iMin = Math.min(i5, i3);
                T.this.f8696b.update(T.this.f8698d, T.this.f8699e, iMin);
                T.f(T.this, iMin);
                i4 = i3 - iMin;
            } else {
                i4 = i3;
            }
            if (i4 > 0) {
                byte[] bArr = new byte[512];
                int i6 = 0;
                while (i6 < i4) {
                    int iMin2 = Math.min(i4 - i6, 512);
                    T.this.f8695a.S(bArr, 0, iMin2);
                    T.this.f8696b.update(bArr, 0, iMin2);
                    i6 += iMin2;
                }
            }
            T.u(T.this, i3);
        }

        /* synthetic */ b(T t2, a aVar) {
            this();
        }
    }

    private enum c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    T() {
    }

    private boolean B() {
        AbstractC0829j.u(this.f8701l != null, "inflater is null");
        AbstractC0829j.u(this.f8699e == this.f8700f, "inflaterInput has unconsumed bytes");
        int iMin = Math.min(this.f8695a.a(), 512);
        if (iMin == 0) {
            return false;
        }
        this.f8699e = 0;
        this.f8700f = iMin;
        this.f8695a.S(this.f8698d, 0, iMin);
        this.f8701l.setInput(this.f8698d, this.f8699e, iMin);
        this.f8702m = c.INFLATING;
        return true;
    }

    private int R(byte[] bArr, int i3, int i4) throws DataFormatException {
        c cVar;
        AbstractC0829j.u(this.f8701l != null, "inflater is null");
        try {
            int totalIn = this.f8701l.getTotalIn();
            int iInflate = this.f8701l.inflate(bArr, i3, i4);
            int totalIn2 = this.f8701l.getTotalIn() - totalIn;
            this.f8707r += totalIn2;
            this.f8708s += totalIn2;
            this.f8699e += totalIn2;
            this.f8696b.update(bArr, i3, iInflate);
            if (!this.f8701l.finished()) {
                if (this.f8701l.needsInput()) {
                    cVar = c.INFLATER_NEEDS_INPUT;
                }
                return iInflate;
            }
            this.f8706q = this.f8701l.getBytesWritten() & 4294967295L;
            cVar = c.TRAILER;
            this.f8702m = cVar;
            return iInflate;
        } catch (DataFormatException e3) {
            throw new DataFormatException("Inflater data format exception: " + e3.getMessage());
        }
    }

    private boolean V() {
        c cVar;
        Inflater inflater = this.f8701l;
        if (inflater == null) {
            this.f8701l = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f8696b.reset();
        int i3 = this.f8700f;
        int i4 = this.f8699e;
        int i5 = i3 - i4;
        if (i5 > 0) {
            this.f8701l.setInput(this.f8698d, i4, i5);
            cVar = c.INFLATING;
        } else {
            cVar = c.INFLATER_NEEDS_INPUT;
        }
        this.f8702m = cVar;
        return true;
    }

    private boolean X() throws ZipException {
        if (this.f8697c.k() < 10) {
            return false;
        }
        if (this.f8697c.j() != 35615) {
            throw new ZipException("Not in GZIP format");
        }
        if (this.f8697c.h() != 8) {
            throw new ZipException("Unsupported compression method");
        }
        this.f8704o = this.f8697c.h();
        this.f8697c.l(6);
        this.f8702m = c.HEADER_EXTRA_LEN;
        return true;
    }

    private boolean Y() {
        if ((this.f8704o & 16) == 16 && !this.f8697c.g()) {
            return false;
        }
        this.f8702m = c.HEADER_CRC;
        return true;
    }

    private boolean Z() throws ZipException {
        if ((this.f8704o & 2) == 2) {
            if (this.f8697c.k() < 2) {
                return false;
            }
            if ((((int) this.f8696b.getValue()) & 65535) != this.f8697c.j()) {
                throw new ZipException("Corrupt GZIP header");
            }
        }
        this.f8702m = c.INITIALIZE_INFLATER;
        return true;
    }

    private boolean a0() {
        int iK = this.f8697c.k();
        int i3 = this.f8705p;
        if (iK < i3) {
            return false;
        }
        this.f8697c.l(i3);
        this.f8702m = c.HEADER_NAME;
        return true;
    }

    private boolean b0() {
        c cVar;
        if ((this.f8704o & 4) != 4) {
            cVar = c.HEADER_NAME;
        } else {
            if (this.f8697c.k() < 2) {
                return false;
            }
            this.f8705p = this.f8697c.j();
            cVar = c.HEADER_EXTRA;
        }
        this.f8702m = cVar;
        return true;
    }

    private boolean c0() {
        if ((this.f8704o & 8) == 8 && !this.f8697c.g()) {
            return false;
        }
        this.f8702m = c.HEADER_COMMENT;
        return true;
    }

    private boolean d0() throws ZipException {
        if (this.f8701l != null && this.f8697c.k() <= 18) {
            this.f8701l.end();
            this.f8701l = null;
        }
        if (this.f8697c.k() < 8) {
            return false;
        }
        if (this.f8696b.getValue() != this.f8697c.i() || this.f8706q != this.f8697c.i()) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        this.f8696b.reset();
        this.f8702m = c.HEADER;
        return true;
    }

    static /* synthetic */ int f(T t2, int i3) {
        int i4 = t2.f8699e + i3;
        t2.f8699e = i4;
        return i4;
    }

    static /* synthetic */ int u(T t2, int i3) {
        int i4 = t2.f8707r + i3;
        t2.f8707r = i4;
        return i4;
    }

    int K() {
        int i3 = this.f8707r;
        this.f8707r = 0;
        return i3;
    }

    int L() {
        int i3 = this.f8708s;
        this.f8708s = 0;
        return i3;
    }

    boolean P() {
        AbstractC0829j.u(!this.f8703n, "GzipInflatingBuffer is closed");
        return (this.f8697c.k() == 0 && this.f8702m == c.HEADER) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r6.f8702m != io.grpc.internal.T.c.f8712a) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r6.f8697c.k() >= 10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        r6.f8709t = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    int U(byte[] r7, int r8, int r9) throws java.util.zip.ZipException {
        /*
            r6 = this;
            boolean r0 = r6.f8703n
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "GzipInflatingBuffer is closed"
            e0.AbstractC0829j.u(r0, r2)
            r0 = 0
            r3 = r0
        Lb:
            r2 = r1
        Lc:
            if (r2 == 0) goto L73
            int r4 = r9 - r3
            if (r4 <= 0) goto L73
            int[] r2 = io.grpc.internal.T.a.f8710a
            io.grpc.internal.T$c r5 = r6.f8702m
            int r5 = r5.ordinal()
            r2 = r2[r5]
            switch(r2) {
                case 1: goto L6e;
                case 2: goto L69;
                case 3: goto L64;
                case 4: goto L5f;
                case 5: goto L5a;
                case 6: goto L55;
                case 7: goto L50;
                case 8: goto L42;
                case 9: goto L3d;
                case 10: goto L38;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Invalid state: "
            r8.append(r9)
            io.grpc.internal.T$c r9 = r6.f8702m
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L38:
            boolean r2 = r6.d0()
            goto Lc
        L3d:
            boolean r2 = r6.B()
            goto Lc
        L42:
            int r2 = r8 + r3
            int r2 = r6.R(r7, r2, r4)
            int r3 = r3 + r2
            io.grpc.internal.T$c r2 = r6.f8702m
            io.grpc.internal.T$c r4 = io.grpc.internal.T.c.TRAILER
            if (r2 != r4) goto Lb
            goto L38
        L50:
            boolean r2 = r6.V()
            goto Lc
        L55:
            boolean r2 = r6.Z()
            goto Lc
        L5a:
            boolean r2 = r6.Y()
            goto Lc
        L5f:
            boolean r2 = r6.c0()
            goto Lc
        L64:
            boolean r2 = r6.a0()
            goto Lc
        L69:
            boolean r2 = r6.b0()
            goto Lc
        L6e:
            boolean r2 = r6.X()
            goto Lc
        L73:
            if (r2 == 0) goto L87
            io.grpc.internal.T$c r7 = r6.f8702m
            io.grpc.internal.T$c r8 = io.grpc.internal.T.c.HEADER
            if (r7 != r8) goto L86
            io.grpc.internal.T$b r7 = r6.f8697c
            int r7 = io.grpc.internal.T.b.d(r7)
            r8 = 10
            if (r7 >= r8) goto L86
            goto L87
        L86:
            r1 = r0
        L87:
            r6.f8709t = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.T.U(byte[], int, int):int");
    }

    boolean W() {
        AbstractC0829j.u(!this.f8703n, "GzipInflatingBuffer is closed");
        return this.f8709t;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f8703n) {
            return;
        }
        this.f8703n = true;
        this.f8695a.close();
        Inflater inflater = this.f8701l;
        if (inflater != null) {
            inflater.end();
            this.f8701l = null;
        }
    }

    void z(z0 z0Var) {
        AbstractC0829j.u(!this.f8703n, "GzipInflatingBuffer is closed");
        this.f8695a.f(z0Var);
        this.f8709t = false;
    }
}
