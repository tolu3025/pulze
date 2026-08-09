package io.grpc.internal;

import e0.AbstractC0829j;
import io.grpc.internal.R0;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;
import y1.InterfaceC1309l;
import y1.InterfaceC1317u;

/* JADX INFO: renamed from: io.grpc.internal.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0956m0 implements Closeable, InterfaceC0979z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f9175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P0 f9177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V0 f9178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC1317u f9179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private T f9180f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f9181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f9182m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f9185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C0972v f9186q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f9188s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f9191v;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f9183n = e.HEADER;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f9184o = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C0972v f9187r = new C0972v();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f9189t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f9190u = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f9192w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile boolean f9193x = false;

    /* JADX INFO: renamed from: io.grpc.internal.m0$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9194a;

        static {
            int[] iArr = new int[e.values().length];
            f9194a = iArr;
            try {
                iArr[e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9194a[e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.m0$b */
    public interface b {
        void a(R0.a aVar);

        void b(Throwable th);

        void e(boolean z2);

        void f(int i3);
    }

    /* JADX INFO: renamed from: io.grpc.internal.m0$c */
    private static class c implements R0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InputStream f9195a;

        private c(InputStream inputStream) {
            this.f9195a = inputStream;
        }

        @Override // io.grpc.internal.R0.a
        public InputStream next() {
            InputStream inputStream = this.f9195a;
            this.f9195a = null;
            return inputStream;
        }

        /* synthetic */ c(InputStream inputStream, a aVar) {
            this(inputStream);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.m0$d */
    static final class d extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final P0 f9197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f9198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f9199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f9200e;

        d(InputStream inputStream, int i3, P0 p02) {
            super(inputStream);
            this.f9200e = -1L;
            this.f9196a = i3;
            this.f9197b = p02;
        }

        private void b() {
            long j3 = this.f9199d;
            long j4 = this.f9198c;
            if (j3 > j4) {
                this.f9197b.f(j3 - j4);
                this.f9198c = this.f9199d;
            }
        }

        private void c() {
            if (this.f9199d <= this.f9196a) {
                return;
            }
            throw y1.l0.f11969n.q("Decompressed gRPC message exceeds maximum size " + this.f9196a).d();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i3) {
            ((FilterInputStream) this).in.mark(i3);
            this.f9200e = this.f9199d;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i3 = ((FilterInputStream) this).in.read();
            if (i3 != -1) {
                this.f9199d++;
            }
            c();
            b();
            return i3;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f9200e == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f9199d = this.f9200e;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j3) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(j3);
            this.f9199d += jSkip;
            c();
            b();
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i3, int i4) throws IOException {
            int i5 = ((FilterInputStream) this).in.read(bArr, i3, i4);
            if (i5 != -1) {
                this.f9199d += (long) i5;
            }
            c();
            b();
            return i5;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.m0$e */
    private enum e {
        HEADER,
        BODY
    }

    public C0956m0(b bVar, InterfaceC1317u interfaceC1317u, int i3, P0 p02, V0 v02) {
        this.f9175a = (b) AbstractC0829j.o(bVar, "sink");
        this.f9179e = (InterfaceC1317u) AbstractC0829j.o(interfaceC1317u, "decompressor");
        this.f9176b = i3;
        this.f9177c = (P0) AbstractC0829j.o(p02, "statsTraceCtx");
        this.f9178d = (V0) AbstractC0829j.o(v02, "transportTracer");
    }

    private boolean K() {
        return B() || this.f9192w;
    }

    private boolean L() {
        T t2 = this.f9180f;
        return t2 != null ? t2.W() : this.f9187r.a() == 0;
    }

    private void P() {
        this.f9177c.e(this.f9190u, this.f9191v, -1L);
        this.f9191v = 0;
        InputStream inputStreamU = this.f9185p ? u() : z();
        this.f9186q.c();
        this.f9186q = null;
        this.f9175a.a(new c(inputStreamU, null));
        this.f9183n = e.HEADER;
        this.f9184o = 5;
    }

    private void R() {
        int unsignedByte = this.f9186q.readUnsignedByte();
        if ((unsignedByte & 254) != 0) {
            throw y1.l0.f11974s.q("gRPC frame header malformed: reserved bits not zero").d();
        }
        this.f9185p = (unsignedByte & 1) != 0;
        int i3 = this.f9186q.readInt();
        this.f9184o = i3;
        if (i3 < 0 || i3 > this.f9176b) {
            throw y1.l0.f11969n.q(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f9176b), Integer.valueOf(this.f9184o))).d();
        }
        int i4 = this.f9190u + 1;
        this.f9190u = i4;
        this.f9177c.d(i4);
        this.f9178d.d();
        this.f9183n = e.BODY;
    }

    private boolean U() throws Throwable {
        int iL;
        int i3;
        int i4 = 0;
        try {
            if (this.f9186q == null) {
                this.f9186q = new C0972v();
            }
            int iK = 0;
            iL = 0;
            while (true) {
                try {
                    int iA = this.f9184o - this.f9186q.a();
                    if (iA <= 0) {
                        if (iK <= 0) {
                            return true;
                        }
                        this.f9175a.f(iK);
                        if (this.f9183n != e.BODY) {
                            return true;
                        }
                        if (this.f9180f != null) {
                            this.f9177c.g(iL);
                            i3 = this.f9191v + iL;
                        } else {
                            this.f9177c.g(iK);
                            i3 = this.f9191v + iK;
                        }
                        this.f9191v = i3;
                        return true;
                    }
                    if (this.f9180f != null) {
                        try {
                            byte[] bArr = this.f9181l;
                            if (bArr == null || this.f9182m == bArr.length) {
                                this.f9181l = new byte[Math.min(iA, 2097152)];
                                this.f9182m = 0;
                            }
                            int iU = this.f9180f.U(this.f9181l, this.f9182m, Math.min(iA, this.f9181l.length - this.f9182m));
                            iK += this.f9180f.K();
                            iL += this.f9180f.L();
                            if (iU == 0) {
                                if (iK > 0) {
                                    this.f9175a.f(iK);
                                    if (this.f9183n == e.BODY) {
                                        if (this.f9180f != null) {
                                            this.f9177c.g(iL);
                                            this.f9191v += iL;
                                        } else {
                                            this.f9177c.g(iK);
                                            this.f9191v += iK;
                                        }
                                    }
                                }
                                return false;
                            }
                            this.f9186q.f(A0.f(this.f9181l, this.f9182m, iU));
                            this.f9182m += iU;
                        } catch (IOException e3) {
                            throw new RuntimeException(e3);
                        } catch (DataFormatException e4) {
                            throw new RuntimeException(e4);
                        }
                    } else {
                        if (this.f9187r.a() == 0) {
                            if (iK > 0) {
                                this.f9175a.f(iK);
                                if (this.f9183n == e.BODY) {
                                    if (this.f9180f != null) {
                                        this.f9177c.g(iL);
                                        this.f9191v += iL;
                                    } else {
                                        this.f9177c.g(iK);
                                        this.f9191v += iK;
                                    }
                                }
                            }
                            return false;
                        }
                        int iMin = Math.min(iA, this.f9187r.a());
                        iK += iMin;
                        this.f9186q.f(this.f9187r.p(iMin));
                    }
                } catch (Throwable th) {
                    int i5 = iK;
                    th = th;
                    i4 = i5;
                    if (i4 > 0) {
                        this.f9175a.f(i4);
                        if (this.f9183n == e.BODY) {
                            if (this.f9180f != null) {
                                this.f9177c.g(iL);
                                this.f9191v += iL;
                            } else {
                                this.f9177c.g(i4);
                                this.f9191v += i4;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            iL = 0;
        }
    }

    private void r() {
        if (this.f9189t) {
            return;
        }
        this.f9189t = true;
        while (!this.f9193x && this.f9188s > 0 && U()) {
            try {
                int i3 = a.f9194a[this.f9183n.ordinal()];
                if (i3 == 1) {
                    R();
                } else {
                    if (i3 != 2) {
                        throw new AssertionError("Invalid state: " + this.f9183n);
                    }
                    P();
                    this.f9188s--;
                }
            } catch (Throwable th) {
                this.f9189t = false;
                throw th;
            }
        }
        if (this.f9193x) {
            close();
            this.f9189t = false;
        } else {
            if (this.f9192w && L()) {
                close();
            }
            this.f9189t = false;
        }
    }

    private InputStream u() {
        InterfaceC1317u interfaceC1317u = this.f9179e;
        if (interfaceC1317u == InterfaceC1309l.b.f11958a) {
            throw y1.l0.f11974s.q("Can't decode compressed gRPC message as compression not configured").d();
        }
        try {
            return new d(interfaceC1317u.b(A0.c(this.f9186q, true)), this.f9176b, this.f9177c);
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    private InputStream z() {
        this.f9177c.f(this.f9186q.a());
        return A0.c(this.f9186q, true);
    }

    public boolean B() {
        return this.f9187r == null && this.f9180f == null;
    }

    public void V(T t2) {
        AbstractC0829j.u(this.f9179e == InterfaceC1309l.b.f11958a, "per-message decompressor already set");
        AbstractC0829j.u(this.f9180f == null, "full stream decompressor already set");
        this.f9180f = (T) AbstractC0829j.o(t2, "Can't pass a null full stream decompressor");
        this.f9187r = null;
    }

    void W(b bVar) {
        this.f9175a = bVar;
    }

    void X() {
        this.f9193x = true;
    }

    @Override // io.grpc.internal.InterfaceC0979z
    public void b(int i3) {
        AbstractC0829j.e(i3 > 0, "numMessages must be > 0");
        if (B()) {
            return;
        }
        this.f9188s += (long) i3;
        r();
    }

    @Override // io.grpc.internal.InterfaceC0979z
    public void c(int i3) {
        this.f9176b = i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.InterfaceC0979z
    public void close() {
        if (B()) {
            return;
        }
        C0972v c0972v = this.f9186q;
        boolean z2 = c0972v != null && c0972v.a() > 0;
        try {
            T t2 = this.f9180f;
            if (t2 != null) {
                boolean z3 = z2 || t2.P();
                this.f9180f.close();
                z2 = z3;
            }
            C0972v c0972v2 = this.f9187r;
            if (c0972v2 != null) {
                c0972v2.close();
            }
            C0972v c0972v3 = this.f9186q;
            if (c0972v3 != null) {
                c0972v3.close();
            }
            this.f9180f = null;
            this.f9187r = null;
            this.f9186q = null;
            this.f9175a.e(z2);
        } catch (Throwable th) {
            this.f9180f = null;
            this.f9187r = null;
            this.f9186q = null;
            throw th;
        }
    }

    @Override // io.grpc.internal.InterfaceC0979z
    public void f(InterfaceC1317u interfaceC1317u) {
        AbstractC0829j.u(this.f9180f == null, "Already set full stream decompressor");
        this.f9179e = (InterfaceC1317u) AbstractC0829j.o(interfaceC1317u, "Can't pass an empty decompressor");
    }

    @Override // io.grpc.internal.InterfaceC0979z
    public void l() {
        if (B()) {
            return;
        }
        if (L()) {
            close();
        } else {
            this.f9192w = true;
        }
    }

    @Override // io.grpc.internal.InterfaceC0979z
    public void q(z0 z0Var) throws Throwable {
        AbstractC0829j.o(z0Var, "data");
        boolean z2 = true;
        try {
            if (K()) {
                z0Var.close();
                return;
            }
            T t2 = this.f9180f;
            if (t2 != null) {
                t2.z(z0Var);
            } else {
                this.f9187r.f(z0Var);
            }
            try {
                r();
            } catch (Throwable th) {
                th = th;
                z2 = false;
                if (z2) {
                    z0Var.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
