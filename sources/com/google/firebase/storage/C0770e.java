package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.E;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.firebase.storage.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0770e extends E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Uri f6539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f6540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p f6541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private P0.c f6542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f6543p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f6544q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile Exception f6545r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f6546s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f6547t;

    /* JADX INFO: renamed from: com.google.firebase.storage.e$a */
    public class a extends E.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f6548c;

        a(Exception exc, long j3) {
            super(exc);
            this.f6548c = j3;
        }

        public long d() {
            return this.f6548c;
        }

        public long e() {
            return C0770e.this.m0();
        }
    }

    C0770e(p pVar, Uri uri) {
        this.f6541n = pVar;
        this.f6539l = uri;
        C0771f c0771fS = pVar.s();
        this.f6542o = new P0.c(c0771fS.a().m(), c0771fS.c(), c0771fS.b(), c0771fS.i());
    }

    private int l0(InputStream inputStream, byte[] bArr) {
        int i3;
        int i4 = 0;
        boolean z2 = false;
        while (i4 != bArr.length && (i3 = inputStream.read(bArr, i4, bArr.length - i4)) != -1) {
            try {
                i4 += i3;
                z2 = true;
            } catch (IOException e3) {
                this.f6545r = e3;
            }
        }
        if (z2) {
            return i4;
        }
        return -1;
    }

    private boolean n0(int i3) {
        return i3 == 308 || (i3 >= 200 && i3 < 300);
    }

    private boolean o0(Q0.e eVar) throws IOException {
        FileOutputStream fileOutputStream;
        InputStream inputStreamT = eVar.t();
        if (inputStreamT == null) {
            this.f6545r = new IllegalStateException("Unable to open Firebase Storage stream.");
            return false;
        }
        File file = new File(this.f6539l.getPath());
        if (!file.exists()) {
            if (this.f6546s > 0) {
                throw new IOException("The file to download to has been deleted.");
            }
            if (!file.createNewFile()) {
                Log.w("FileDownloadTask", "unable to create file:" + file.getAbsolutePath());
            }
        }
        boolean z2 = true;
        if (this.f6546s > 0) {
            Log.d("FileDownloadTask", "Resuming download file " + file.getAbsolutePath() + " at " + this.f6546s);
            fileOutputStream = new FileOutputStream(file, true);
        } else {
            fileOutputStream = new FileOutputStream(file);
        }
        try {
            byte[] bArr = new byte[262144];
            while (z2) {
                int iL0 = l0(inputStreamT, bArr);
                if (iL0 == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, iL0);
                this.f6540m += (long) iL0;
                if (this.f6545r != null) {
                    Log.d("FileDownloadTask", "Exception occurred during file download. Retrying.", this.f6545r);
                    this.f6545r = null;
                    z2 = false;
                }
                if (!j0(4, false)) {
                    z2 = false;
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            inputStreamT.close();
            return z2;
        } catch (Throwable th) {
            fileOutputStream.flush();
            fileOutputStream.close();
            inputStreamT.close();
            throw th;
        }
    }

    @Override // com.google.firebase.storage.E
    p I() {
        return this.f6541n;
    }

    @Override // com.google.firebase.storage.E
    protected void U() {
        this.f6542o.a();
        this.f6545r = C0779n.c(Status.f5316o);
    }

    @Override // com.google.firebase.storage.E
    void e0() {
        String str;
        if (this.f6545r != null) {
            j0(64, false);
            return;
        }
        if (j0(4, false)) {
            do {
                this.f6540m = 0L;
                this.f6545r = null;
                this.f6542o.c();
                Q0.c cVar = new Q0.c(this.f6541n.t(), this.f6541n.i(), this.f6546s);
                this.f6542o.e(cVar, false);
                this.f6547t = cVar.o();
                this.f6545r = cVar.f() != null ? cVar.f() : this.f6545r;
                boolean zO0 = n0(this.f6547t) && this.f6545r == null && B() == 4;
                if (zO0) {
                    this.f6543p = ((long) cVar.r()) + this.f6546s;
                    String strQ = cVar.q("ETag");
                    if (!TextUtils.isEmpty(strQ) && (str = this.f6544q) != null && !str.equals(strQ)) {
                        Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                        this.f6546s = 0L;
                        this.f6544q = null;
                        cVar.C();
                        f0();
                        return;
                    }
                    this.f6544q = strQ;
                    try {
                        zO0 = o0(cVar);
                    } catch (IOException e3) {
                        Log.e("FileDownloadTask", "Exception occurred during file write.  Aborting.", e3);
                        this.f6545r = e3;
                    }
                }
                cVar.C();
                if (zO0 && this.f6545r == null && B() == 4) {
                    j0(128, false);
                    return;
                }
                File file = new File(this.f6539l.getPath());
                if (file.exists()) {
                    this.f6546s = file.length();
                } else {
                    this.f6546s = 0L;
                }
                if (B() == 8) {
                    j0(16, false);
                    return;
                }
                if (B() == 32) {
                    if (j0(256, false)) {
                        return;
                    }
                    Log.w("FileDownloadTask", "Unable to change download task to final state from " + B());
                    return;
                }
            } while (this.f6540m > 0);
            j0(64, false);
        }
    }

    @Override // com.google.firebase.storage.E
    protected void f0() {
        G.b().g(E());
    }

    long m0() {
        return this.f6543p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.E
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public a h0() {
        return new a(C0779n.e(this.f6545r, this.f6547t), this.f6540m + this.f6546s);
    }
}
