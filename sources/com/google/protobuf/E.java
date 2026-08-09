package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class E extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f6676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f6677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6678c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6681f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f6682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f6683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f6684n;

    E(Iterable iterable) {
        this.f6676a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f6678c++;
        }
        this.f6679d = -1;
        if (b()) {
            return;
        }
        this.f6677b = C.f6669e;
        this.f6679d = 0;
        this.f6680e = 0;
        this.f6684n = 0L;
    }

    private boolean b() {
        this.f6679d++;
        if (!this.f6676a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f6676a.next();
        this.f6677b = byteBuffer;
        this.f6680e = byteBuffer.position();
        if (this.f6677b.hasArray()) {
            this.f6681f = true;
            this.f6682l = this.f6677b.array();
            this.f6683m = this.f6677b.arrayOffset();
        } else {
            this.f6681f = false;
            this.f6684n = z0.k(this.f6677b);
            this.f6682l = null;
        }
        return true;
    }

    private void c(int i3) {
        int i4 = this.f6680e + i3;
        this.f6680e = i4;
        if (i4 == this.f6677b.limit()) {
            b();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f6679d == this.f6678c) {
            return -1;
        }
        int iW = (this.f6681f ? this.f6682l[this.f6680e + this.f6683m] : z0.w(((long) this.f6680e) + this.f6684n)) & 255;
        c(1);
        return iW;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i3, int i4) {
        if (this.f6679d == this.f6678c) {
            return -1;
        }
        int iLimit = this.f6677b.limit();
        int i5 = this.f6680e;
        int i6 = iLimit - i5;
        if (i4 > i6) {
            i4 = i6;
        }
        if (this.f6681f) {
            System.arraycopy(this.f6682l, i5 + this.f6683m, bArr, i3, i4);
        } else {
            int iPosition = this.f6677b.position();
            F.b(this.f6677b, this.f6680e);
            this.f6677b.get(bArr, i3, i4);
            F.b(this.f6677b, iPosition);
        }
        c(i4);
        return i4;
    }
}
