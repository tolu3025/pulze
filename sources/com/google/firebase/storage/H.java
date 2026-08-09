package com.google.firebase.storage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.storage.E;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class H extends E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p f6469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private P0.c f6470m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f6473p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f6475r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f6476s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InputStream f6477t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Q0.e f6478u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f6479v;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Exception f6471n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile int f6472o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f6474q = -1;

    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InputStream call() {
            return H.this.o0();
        }
    }

    public interface b {
        void a(d dVar, InputStream inputStream);
    }

    static class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private H f6481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InputStream f6482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Callable f6483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private IOException f6484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f6485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f6486f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f6487l;

        c(Callable callable, H h3) {
            this.f6481a = h3;
            this.f6483c = callable;
        }

        private void c() throws C0766a {
            H h3 = this.f6481a;
            if (h3 != null && h3.B() == 32) {
                throw new C0766a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f() throws IOException {
            c();
            if (this.f6484d != null) {
                try {
                    InputStream inputStream = this.f6482b;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                this.f6482b = null;
                if (this.f6486f == this.f6485e) {
                    Log.i("StreamDownloadTask", "Encountered exception during stream operation. Aborting.", this.f6484d);
                    return false;
                }
                Log.i("StreamDownloadTask", "Encountered exception during stream operation. Retrying at " + this.f6485e, this.f6484d);
                this.f6486f = this.f6485e;
                this.f6484d = null;
            }
            if (this.f6487l) {
                throw new IOException("Can't perform operation on closed stream");
            }
            if (this.f6482b != null) {
                return true;
            }
            try {
                this.f6482b = (InputStream) this.f6483c.call();
                return true;
            } catch (Exception e3) {
                if (e3 instanceof IOException) {
                    throw ((IOException) e3);
                }
                throw new IOException("Unable to open stream", e3);
            }
        }

        private void l(long j3) {
            H h3 = this.f6481a;
            if (h3 != null) {
                h3.q0(j3);
            }
            this.f6485e += j3;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            while (f()) {
                try {
                    return this.f6482b.available();
                } catch (IOException e3) {
                    this.f6484d = e3;
                }
            }
            throw this.f6484d;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStream = this.f6482b;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f6487l = true;
            H h3 = this.f6481a;
            if (h3 != null && h3.f6478u != null) {
                this.f6481a.f6478u.C();
                this.f6481a.f6478u = null;
            }
            c();
        }

        @Override // java.io.InputStream
        public void mark(int i3) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            while (f()) {
                try {
                    int i3 = this.f6482b.read();
                    if (i3 != -1) {
                        l(1L);
                    }
                    return i3;
                } catch (IOException e3) {
                    this.f6484d = e3;
                }
            }
            throw this.f6484d;
        }

        @Override // java.io.InputStream
        public long skip(long j3) throws IOException {
            long j4 = 0;
            while (f()) {
                while (j3 > 262144) {
                    try {
                        long jSkip = this.f6482b.skip(262144L);
                        if (jSkip < 0) {
                            if (j4 == 0) {
                                return -1L;
                            }
                            return j4;
                        }
                        j4 += jSkip;
                        j3 -= jSkip;
                        l(jSkip);
                        c();
                    } catch (IOException e3) {
                        this.f6484d = e3;
                    }
                }
                if (j3 > 0) {
                    long jSkip2 = this.f6482b.skip(j3);
                    if (jSkip2 < 0) {
                        if (j4 == 0) {
                            return -1L;
                        }
                        return j4;
                    }
                    j4 += jSkip2;
                    j3 -= jSkip2;
                    l(jSkip2);
                }
                if (j3 == 0) {
                    return j4;
                }
            }
            throw this.f6484d;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i3, int i4) throws IOException {
            int i5 = 0;
            while (f()) {
                while (i4 > 262144) {
                    try {
                        int i6 = this.f6482b.read(bArr, i3, 262144);
                        if (i6 == -1) {
                            if (i5 == 0) {
                                return -1;
                            }
                            return i5;
                        }
                        i5 += i6;
                        i3 += i6;
                        i4 -= i6;
                        l(i6);
                        c();
                    } catch (IOException e3) {
                        this.f6484d = e3;
                    }
                }
                if (i4 > 0) {
                    int i7 = this.f6482b.read(bArr, i3, i4);
                    if (i7 == -1) {
                        if (i5 == 0) {
                            return -1;
                        }
                        return i5;
                    }
                    i3 += i7;
                    i5 += i7;
                    i4 -= i7;
                    l(i7);
                }
                if (i4 == 0) {
                    return i5;
                }
            }
            throw this.f6484d;
        }
    }

    public class d extends E.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f6488c;

        d(Exception exc, long j3) {
            super(exc);
            this.f6488c = j3;
        }
    }

    H(p pVar) {
        this.f6469l = pVar;
        C0771f c0771fS = pVar.s();
        this.f6470m = new P0.c(c0771fS.a().m(), c0771fS.c(), c0771fS.b(), c0771fS.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream o0() throws IOException {
        String str;
        this.f6470m.c();
        Q0.e eVar = this.f6478u;
        if (eVar != null) {
            eVar.C();
        }
        Q0.c cVar = new Q0.c(this.f6469l.t(), this.f6469l.i(), this.f6475r);
        this.f6478u = cVar;
        this.f6470m.e(cVar, false);
        this.f6472o = this.f6478u.o();
        this.f6471n = this.f6478u.f() != null ? this.f6478u.f() : this.f6471n;
        if (!p0(this.f6472o) || this.f6471n != null || B() != 4) {
            throw new IOException("Could not open resulting stream.");
        }
        String strQ = this.f6478u.q("ETag");
        if (!TextUtils.isEmpty(strQ) && (str = this.f6479v) != null && !str.equals(strQ)) {
            this.f6472o = 409;
            throw new IOException("The ETag on the server changed.");
        }
        this.f6479v = strQ;
        this.f6474q = ((long) this.f6478u.r()) + this.f6475r;
        return this.f6478u.t();
    }

    private boolean p0(int i3) {
        return i3 == 308 || (i3 >= 200 && i3 < 300);
    }

    @Override // com.google.firebase.storage.E
    p I() {
        return this.f6469l;
    }

    @Override // com.google.firebase.storage.E
    protected void U() {
        this.f6470m.a();
        this.f6471n = C0779n.c(Status.f5316o);
    }

    @Override // com.google.firebase.storage.E
    protected void X() {
        this.f6476s = this.f6475r;
    }

    @Override // com.google.firebase.storage.E
    public boolean a0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.E
    public boolean d0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.E
    void e0() {
        if (this.f6471n != null) {
            j0(64, false);
            return;
        }
        if (j0(4, false)) {
            c cVar = new c(new a(), this);
            this.f6477t = new BufferedInputStream(cVar);
            try {
                cVar.f();
                b bVar = this.f6473p;
                if (bVar != null) {
                    try {
                        bVar.a((d) g0(), this.f6477t);
                    } catch (Exception e3) {
                        Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e3);
                        this.f6471n = e3;
                    }
                }
            } catch (IOException e4) {
                Log.d("StreamDownloadTask", "Initial opening of Stream failed", e4);
                this.f6471n = e4;
            }
            if (this.f6477t == null) {
                this.f6478u.C();
                this.f6478u = null;
            }
            if (this.f6471n == null && B() == 4) {
                j0(4, false);
                j0(128, false);
                return;
            }
            if (j0(B() == 32 ? 256 : 64, false)) {
                return;
            }
            Log.w("StreamDownloadTask", "Unable to change download task to final state from " + B());
        }
    }

    @Override // com.google.firebase.storage.E
    protected void f0() {
        G.b().g(E());
    }

    void q0(long j3) {
        long j4 = this.f6475r + j3;
        this.f6475r = j4;
        if (this.f6476s + 262144 <= j4) {
            if (B() == 4) {
                j0(4, false);
            } else {
                this.f6476s = this.f6475r;
            }
        }
    }

    H r0(b bVar) {
        AbstractC0643s.k(bVar);
        AbstractC0643s.m(this.f6473p == null);
        this.f6473p = bVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.E
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public d h0() {
        return new d(C0779n.e(this.f6471n, this.f6472o), this.f6476s);
    }
}
