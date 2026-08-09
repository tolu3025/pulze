package com.google.firebase.storage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.storage.E;
import com.google.firebase.storage.o;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import p0.InterfaceC1059b;
import q0.InterfaceC1136b;

/* JADX INFO: loaded from: classes.dex */
public class N extends E {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Random f6508E = new Random();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static P0.e f6509F = new P0.f();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    static com.google.android.gms.common.util.d f6510G = com.google.android.gms.common.util.f.c();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private volatile String f6511A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private volatile long f6512B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f6513C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f6514D;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p f6515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Uri f6516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f6517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final P0.b f6518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicLong f6519p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC1136b f6520q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC1059b f6521r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f6522s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private P0.c f6523t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f6524u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile o f6525v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile Uri f6526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile Exception f6527x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile Exception f6528y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile int f6529z;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q0.e f6530a;

        a(Q0.e eVar) {
            this.f6530a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6530a.B(P0.i.c(N.this.f6520q), P0.i.b(N.this.f6521r), N.this.f6515l.i().m());
        }
    }

    public class b extends E.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f6532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f6533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final o f6534e;

        b(Exception exc, long j3, Uri uri, o oVar) {
            super(exc);
            this.f6532c = j3;
            this.f6533d = uri;
            this.f6534e = oVar;
        }

        public long d() {
            return this.f6532c;
        }

        public o e() {
            return this.f6534e;
        }

        public long f() {
            return N.this.q0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [long] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    N(p pVar, o oVar, Uri uri, Uri uri2) {
        ?? r5;
        ?? r3;
        long statSize;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        this.f6519p = new AtomicLong(0L);
        this.f6522s = 262144;
        InputStream inputStreamOpenInputStream = null;
        this.f6526w = null;
        this.f6527x = null;
        this.f6528y = null;
        this.f6529z = 0;
        this.f6513C = 0;
        this.f6514D = 1000;
        AbstractC0643s.k(pVar);
        AbstractC0643s.k(uri);
        C0771f c0771fS = pVar.s();
        this.f6515l = pVar;
        this.f6525v = oVar;
        InterfaceC1136b interfaceC1136bC = c0771fS.c();
        this.f6520q = interfaceC1136bC;
        InterfaceC1059b interfaceC1059bB = c0771fS.b();
        this.f6521r = interfaceC1059bB;
        this.f6516m = uri;
        this.f6512B = c0771fS.h();
        ?? M2 = pVar.i().m();
        this.f6523t = new P0.c(M2, interfaceC1136bC, interfaceC1059bB, c0771fS.k());
        ?? r32 = -1;
        try {
            try {
                ContentResolver contentResolver = pVar.s().a().m().getContentResolver();
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                } catch (IOException e3) {
                    e = e3;
                    statSize = -1;
                } catch (NullPointerException e4) {
                    e = e4;
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        M2 = statSize;
                    } catch (IOException e5) {
                        e = e5;
                        Log.w("UploadTask", "could not retrieve file size for upload " + this.f6516m.toString(), e);
                        M2 = statSize;
                    } catch (NullPointerException e6) {
                        e = e6;
                        Log.w("UploadTask", "NullPointerException during file size calculation.", e);
                        M2 = -1;
                    }
                } else {
                    M2 = -1;
                }
                inputStreamOpenInputStream = contentResolver.openInputStream(this.f6516m);
                r5 = M2;
            } catch (FileNotFoundException e7) {
                e = e7;
                r32 = M2;
                Log.e("UploadTask", "could not locate file for uploading:" + this.f6516m.toString());
                this.f6527x = e;
                r3 = r32;
                r5 = r3;
                this.f6517n = r5;
                this.f6518o = new P0.b(inputStreamOpenInputStream, 262144);
                this.f6524u = true;
                this.f6526w = uri2;
            }
        } catch (FileNotFoundException e8) {
            e = e8;
            Log.e("UploadTask", "could not locate file for uploading:" + this.f6516m.toString());
            this.f6527x = e;
            r3 = r32;
            r5 = r3;
            this.f6517n = r5;
            this.f6518o = new P0.b(inputStreamOpenInputStream, 262144);
            this.f6524u = true;
            this.f6526w = uri2;
        }
        if (inputStreamOpenInputStream != null) {
            if (M2 == -1) {
                try {
                    int iAvailable = inputStreamOpenInputStream.available();
                    if (iAvailable >= 0) {
                        M2 = iAvailable;
                    }
                } catch (IOException unused) {
                }
            }
            r32 = M2;
            inputStreamOpenInputStream = new BufferedInputStream(inputStreamOpenInputStream);
            r3 = r32;
            r5 = r3;
        }
        this.f6517n = r5;
        this.f6518o = new P0.b(inputStreamOpenInputStream, 262144);
        this.f6524u = true;
        this.f6526w = uri2;
    }

    private void o0() {
        String strW = this.f6525v != null ? this.f6525v.w() : null;
        if (this.f6516m != null && TextUtils.isEmpty(strW)) {
            strW = this.f6515l.s().a().m().getContentResolver().getType(this.f6516m);
        }
        if (TextUtils.isEmpty(strW)) {
            strW = "application/octet-stream";
        }
        Q0.j jVar = new Q0.j(this.f6515l.t(), this.f6515l.i(), this.f6525v != null ? this.f6525v.q() : null, strW);
        if (v0(jVar)) {
            String strQ = jVar.q("X-Goog-Upload-URL");
            if (TextUtils.isEmpty(strQ)) {
                return;
            }
            this.f6526w = Uri.parse(strQ);
        }
    }

    private boolean p0(Q0.e eVar) {
        try {
            Log.d("UploadTask", "Waiting " + this.f6513C + " milliseconds");
            f6509F.a(this.f6513C + f6508E.nextInt(250));
            boolean zU0 = u0(eVar);
            if (zU0) {
                this.f6513C = 0;
            }
            return zU0;
        } catch (InterruptedException e3) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.f6528y = e3;
            return false;
        }
    }

    private boolean r0(int i3) {
        return i3 == 308 || (i3 >= 200 && i3 < 300);
    }

    private boolean s0(Q0.e eVar) {
        int iO = eVar.o();
        if (this.f6523t.b(iO)) {
            iO = -2;
        }
        this.f6529z = iO;
        this.f6528y = eVar.f();
        this.f6511A = eVar.q("X-Goog-Upload-Status");
        return r0(this.f6529z) && this.f6528y == null;
    }

    private boolean t0(boolean z2) {
        Q0.i iVar = new Q0.i(this.f6515l.t(), this.f6515l.i(), this.f6526w);
        if ("final".equals(this.f6511A)) {
            return false;
        }
        if (z2) {
            if (!v0(iVar)) {
                return false;
            }
        } else if (!u0(iVar)) {
            return false;
        }
        if ("final".equals(iVar.q("X-Goog-Upload-Status"))) {
            e = new IOException("The server has terminated the upload session");
        } else {
            String strQ = iVar.q("X-Goog-Upload-Size-Received");
            long j3 = !TextUtils.isEmpty(strQ) ? Long.parseLong(strQ) : 0L;
            long j4 = this.f6519p.get();
            if (j4 > j3) {
                e = new IOException("Unexpected error. The server lost a chunk update.");
            } else {
                if (j4 >= j3) {
                    return true;
                }
                try {
                    if (this.f6518o.a((int) r7) != j3 - j4) {
                        this.f6527x = new IOException("Unexpected end of stream encountered.");
                        return false;
                    }
                    if (this.f6519p.compareAndSet(j4, j3)) {
                        return true;
                    }
                    Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                    this.f6527x = new IllegalStateException("uploaded bytes changed unexpectedly.");
                    return false;
                } catch (IOException e3) {
                    e = e3;
                    Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e);
                }
            }
        }
        this.f6527x = e;
        return false;
    }

    private boolean u0(Q0.e eVar) {
        eVar.B(P0.i.c(this.f6520q), P0.i.b(this.f6521r), this.f6515l.i().m());
        return s0(eVar);
    }

    private boolean v0(Q0.e eVar) {
        this.f6523t.d(eVar);
        return s0(eVar);
    }

    private boolean w0() {
        if (!"final".equals(this.f6511A)) {
            return true;
        }
        if (this.f6527x == null) {
            this.f6527x = new IOException("The server has terminated the upload session", this.f6528y);
        }
        j0(64, false);
        return false;
    }

    private boolean x0() {
        if (B() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f6527x = new InterruptedException();
            j0(64, false);
            return false;
        }
        if (B() == 32) {
            j0(256, false);
            return false;
        }
        if (B() == 8) {
            j0(16, false);
            return false;
        }
        if (!w0()) {
            return false;
        }
        if (this.f6526w == null) {
            if (this.f6527x == null) {
                this.f6527x = new IllegalStateException("Unable to obtain an upload URL.");
            }
            j0(64, false);
            return false;
        }
        if (this.f6527x != null) {
            j0(64, false);
            return false;
        }
        boolean z2 = this.f6528y != null || this.f6529z < 200 || this.f6529z >= 300;
        long jB = f6510G.b() + this.f6512B;
        long jB2 = f6510G.b() + ((long) this.f6513C);
        if (z2) {
            if (jB2 > jB || !t0(true)) {
                if (w0()) {
                    j0(64, false);
                }
                return false;
            }
            this.f6513C = Math.max(this.f6513C * 2, 1000);
        }
        return true;
    }

    private void z0() {
        try {
            this.f6518o.d(this.f6522s);
            int iMin = Math.min(this.f6522s, this.f6518o.b());
            Q0.g gVar = new Q0.g(this.f6515l.t(), this.f6515l.i(), this.f6526w, this.f6518o.e(), this.f6519p.get(), iMin, this.f6518o.f());
            if (!p0(gVar)) {
                this.f6522s = 262144;
                Log.d("UploadTask", "Resetting chunk size to " + this.f6522s);
                return;
            }
            this.f6519p.getAndAdd(iMin);
            if (!this.f6518o.f()) {
                this.f6518o.a(iMin);
                int i3 = this.f6522s;
                if (i3 < 33554432) {
                    this.f6522s = i3 * 2;
                    Log.d("UploadTask", "Increasing chunk size to " + this.f6522s);
                    return;
                }
                return;
            }
            try {
                this.f6525v = new o.b(gVar.n(), this.f6515l).a();
                j0(4, false);
                j0(128, false);
            } catch (JSONException e3) {
                Log.e("UploadTask", "Unable to parse resulting metadata from upload:" + gVar.m(), e3);
                this.f6527x = e3;
            }
        } catch (IOException e4) {
            Log.e("UploadTask", "Unable to read bytes for uploading", e4);
            this.f6527x = e4;
        }
    }

    @Override // com.google.firebase.storage.E
    p I() {
        return this.f6515l;
    }

    @Override // com.google.firebase.storage.E
    protected void U() {
        this.f6523t.a();
        Q0.h hVar = this.f6526w != null ? new Q0.h(this.f6515l.t(), this.f6515l.i(), this.f6526w) : null;
        if (hVar != null) {
            G.b().f(new a(hVar));
        }
        this.f6527x = C0779n.c(Status.f5316o);
        super.U();
    }

    @Override // com.google.firebase.storage.E
    protected void c0() {
        this.f6527x = null;
        this.f6528y = null;
        this.f6529z = 0;
        this.f6511A = null;
    }

    @Override // com.google.firebase.storage.E
    void e0() {
        this.f6523t.c();
        if (!j0(4, false)) {
            Log.d("UploadTask", "The upload cannot continue as it is not in a valid state.");
            return;
        }
        if (this.f6515l.p() == null) {
            this.f6527x = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.f6527x != null) {
            return;
        }
        if (this.f6526w == null) {
            o0();
        } else {
            t0(false);
        }
        boolean zX0 = x0();
        while (zX0) {
            z0();
            zX0 = x0();
            if (zX0) {
                j0(4, false);
            }
        }
        if (!this.f6524u || B() == 16) {
            return;
        }
        try {
            this.f6518o.c();
        } catch (IOException e3) {
            Log.e("UploadTask", "Unable to close stream.", e3);
        }
    }

    @Override // com.google.firebase.storage.E
    protected void f0() {
        G.b().h(E());
    }

    long q0() {
        return this.f6517n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.E
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public b h0() {
        return new b(C0779n.e(this.f6527x != null ? this.f6527x : this.f6528y, this.f6529z), this.f6519p.get(), this.f6526w, this.f6525v);
    }

    N(p pVar, o oVar, byte[] bArr) {
        this.f6519p = new AtomicLong(0L);
        this.f6522s = 262144;
        this.f6526w = null;
        this.f6527x = null;
        this.f6528y = null;
        this.f6529z = 0;
        this.f6513C = 0;
        this.f6514D = 1000;
        AbstractC0643s.k(pVar);
        AbstractC0643s.k(bArr);
        C0771f c0771fS = pVar.s();
        this.f6517n = bArr.length;
        this.f6515l = pVar;
        this.f6525v = oVar;
        InterfaceC1136b interfaceC1136bC = c0771fS.c();
        this.f6520q = interfaceC1136bC;
        InterfaceC1059b interfaceC1059bB = c0771fS.b();
        this.f6521r = interfaceC1059bB;
        this.f6516m = null;
        this.f6518o = new P0.b(new ByteArrayInputStream(bArr), 262144);
        this.f6524u = true;
        this.f6512B = c0771fS.h();
        this.f6523t = new P0.c(c0771fS.a().m(), interfaceC1136bC, interfaceC1059bB, c0771fS.k());
    }
}
