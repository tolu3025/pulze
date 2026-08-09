package io.grpc.internal;

import e0.AbstractC0829j;
import g0.AbstractC0871b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import y1.InterfaceC1309l;
import y1.InterfaceC1311n;
import y1.InterfaceC1319w;

/* JADX INFO: renamed from: io.grpc.internal.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0958n0 implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f9210a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private W0 f9212c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final X0 f9217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final P0 f9218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f9220k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f9222m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9211b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC1311n f9213d = InterfaceC1309l.b.f11958a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9214e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f9215f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ByteBuffer f9216g = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f9221l = -1;

    /* JADX INFO: renamed from: io.grpc.internal.n0$b */
    private final class b extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f9223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private W0 f9224b;

        private b() {
            this.f9223a = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            Iterator it = this.f9223a.iterator();
            int iA = 0;
            while (it.hasNext()) {
                iA += ((W0) it.next()).a();
            }
            return iA;
        }

        @Override // java.io.OutputStream
        public void write(int i3) {
            W0 w02 = this.f9224b;
            if (w02 == null || w02.c() <= 0) {
                write(new byte[]{(byte) i3}, 0, 1);
            } else {
                this.f9224b.d((byte) i3);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i4) {
            if (this.f9224b == null) {
                W0 w0A = C0958n0.this.f9217h.a(i4);
                this.f9224b = w0A;
                this.f9223a.add(w0A);
            }
            while (i4 > 0) {
                int iMin = Math.min(i4, this.f9224b.c());
                if (iMin == 0) {
                    W0 w0A2 = C0958n0.this.f9217h.a(Math.max(i4, this.f9224b.a() * 2));
                    this.f9224b = w0A2;
                    this.f9223a.add(w0A2);
                } else {
                    this.f9224b.b(bArr, i3, iMin);
                    i3 += iMin;
                    i4 -= iMin;
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.n0$c */
    private class c extends OutputStream {
        private c() {
        }

        @Override // java.io.OutputStream
        public void write(int i3) {
            write(new byte[]{(byte) i3}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i4) {
            C0958n0.this.o(bArr, i3, i4);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.n0$d */
    public interface d {
        void p(W0 w02, boolean z2, boolean z3, int i3);
    }

    public C0958n0(d dVar, X0 x02, P0 p02) {
        this.f9210a = (d) AbstractC0829j.o(dVar, "sink");
        this.f9217h = (X0) AbstractC0829j.o(x02, "bufferAllocator");
        this.f9218i = (P0) AbstractC0829j.o(p02, "statsTraceCtx");
    }

    private void g(boolean z2, boolean z3) {
        W0 w02 = this.f9212c;
        this.f9212c = null;
        this.f9210a.p(w02, z2, z3, this.f9220k);
        this.f9220k = 0;
    }

    private int h(InputStream inputStream) {
        if ((inputStream instanceof y1.Q) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    private void i() {
        W0 w02 = this.f9212c;
        if (w02 != null) {
            w02.release();
            this.f9212c = null;
        }
    }

    private void k() {
        if (b()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    private void l(b bVar, boolean z2) {
        int iA = bVar.a();
        int i3 = this.f9211b;
        if (i3 >= 0 && iA > i3) {
            throw y1.l0.f11969n.q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(this.f9211b))).d();
        }
        this.f9216g.clear();
        this.f9216g.put(z2 ? (byte) 1 : (byte) 0).putInt(iA);
        W0 w0A = this.f9217h.a(5);
        w0A.b(this.f9216g.array(), 0, this.f9216g.position());
        if (iA == 0) {
            this.f9212c = w0A;
            return;
        }
        this.f9210a.p(w0A, false, false, this.f9220k - 1);
        this.f9220k = 1;
        List list = bVar.f9223a;
        for (int i4 = 0; i4 < list.size() - 1; i4++) {
            this.f9210a.p((W0) list.get(i4), false, false, 0);
        }
        this.f9212c = (W0) list.get(list.size() - 1);
        this.f9222m = iA;
    }

    private int m(InputStream inputStream, int i3) throws IOException {
        b bVar = new b();
        OutputStream outputStreamC = this.f9213d.c(bVar);
        try {
            int iP = p(inputStream, outputStreamC);
            outputStreamC.close();
            int i4 = this.f9211b;
            if (i4 >= 0 && iP > i4) {
                throw y1.l0.f11969n.q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iP), Integer.valueOf(this.f9211b))).d();
            }
            l(bVar, true);
            return iP;
        } catch (Throwable th) {
            outputStreamC.close();
            throw th;
        }
    }

    private int n(InputStream inputStream, int i3) {
        int i4 = this.f9211b;
        if (i4 >= 0 && i3 > i4) {
            throw y1.l0.f11969n.q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i3), Integer.valueOf(this.f9211b))).d();
        }
        this.f9216g.clear();
        this.f9216g.put((byte) 0).putInt(i3);
        if (this.f9212c == null) {
            this.f9212c = this.f9217h.a(this.f9216g.position() + i3);
        }
        o(this.f9216g.array(), 0, this.f9216g.position());
        return p(inputStream, this.f9215f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(byte[] bArr, int i3, int i4) {
        while (i4 > 0) {
            W0 w02 = this.f9212c;
            if (w02 != null && w02.c() == 0) {
                g(false, false);
            }
            if (this.f9212c == null) {
                this.f9212c = this.f9217h.a(i4);
            }
            int iMin = Math.min(i4, this.f9212c.c());
            this.f9212c.b(bArr, i3, iMin);
            i3 += iMin;
            i4 -= iMin;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int p(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof InterfaceC1319w) {
            return ((InterfaceC1319w) inputStream).b(outputStream);
        }
        long jB = AbstractC0871b.b(inputStream, outputStream);
        AbstractC0829j.i(jB <= 2147483647L, "Message size overflow: %s", jB);
        return (int) jB;
    }

    private int q(InputStream inputStream, int i3) throws IOException {
        if (i3 != -1) {
            this.f9222m = i3;
            return n(inputStream, i3);
        }
        b bVar = new b();
        int iP = p(inputStream, bVar);
        l(bVar, false);
        return iP;
    }

    @Override // io.grpc.internal.P
    public boolean b() {
        return this.f9219j;
    }

    @Override // io.grpc.internal.P
    public void c(InputStream inputStream) {
        k();
        this.f9220k++;
        int i3 = this.f9221l + 1;
        this.f9221l = i3;
        this.f9222m = 0L;
        this.f9218i.i(i3);
        boolean z2 = this.f9214e && this.f9213d != InterfaceC1309l.b.f11958a;
        try {
            int iH = h(inputStream);
            int iQ = (iH == 0 || !z2) ? q(inputStream, iH) : m(inputStream, iH);
            if (iH != -1 && iQ != iH) {
                throw y1.l0.f11974s.q(String.format("Message length inaccurate %s != %s", Integer.valueOf(iQ), Integer.valueOf(iH))).d();
            }
            long j3 = iQ;
            this.f9218i.k(j3);
            this.f9218i.l(this.f9222m);
            this.f9218i.j(this.f9221l, this.f9222m, j3);
        } catch (IOException e3) {
            throw y1.l0.f11974s.q("Failed to frame message").p(e3).d();
        } catch (y1.n0 e4) {
            throw e4;
        } catch (RuntimeException e5) {
            throw y1.l0.f11974s.q("Failed to frame message").p(e5).d();
        }
    }

    @Override // io.grpc.internal.P
    public void close() {
        if (b()) {
            return;
        }
        this.f9219j = true;
        W0 w02 = this.f9212c;
        if (w02 != null && w02.a() == 0) {
            i();
        }
        g(true, true);
    }

    @Override // io.grpc.internal.P
    public void e(int i3) {
        AbstractC0829j.u(this.f9211b == -1, "max size already set");
        this.f9211b = i3;
    }

    @Override // io.grpc.internal.P
    public void flush() {
        W0 w02 = this.f9212c;
        if (w02 == null || w02.a() <= 0) {
            return;
        }
        g(false, true);
    }

    @Override // io.grpc.internal.P
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0958n0 a(InterfaceC1311n interfaceC1311n) {
        this.f9213d = (InterfaceC1311n) AbstractC0829j.o(interfaceC1311n, "Can't pass an empty compressor");
        return this;
    }
}
