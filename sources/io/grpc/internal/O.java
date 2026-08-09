package io.grpc.internal;

import e0.AbstractC0825f;
import e0.AbstractC0829j;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class O implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0 f8643a;

    protected O(z0 z0Var) {
        this.f8643a = (z0) AbstractC0829j.o(z0Var, "buf");
    }

    @Override // io.grpc.internal.z0
    public void E(OutputStream outputStream, int i3) {
        this.f8643a.E(outputStream, i3);
    }

    @Override // io.grpc.internal.z0
    public void N(ByteBuffer byteBuffer) {
        this.f8643a.N(byteBuffer);
    }

    @Override // io.grpc.internal.z0
    public void S(byte[] bArr, int i3, int i4) {
        this.f8643a.S(bArr, i3, i4);
    }

    @Override // io.grpc.internal.z0
    public int a() {
        return this.f8643a.a();
    }

    @Override // io.grpc.internal.z0
    public void i() {
        this.f8643a.i();
    }

    @Override // io.grpc.internal.z0
    public boolean markSupported() {
        return this.f8643a.markSupported();
    }

    @Override // io.grpc.internal.z0
    public z0 p(int i3) {
        return this.f8643a.p(i3);
    }

    @Override // io.grpc.internal.z0
    public int readUnsignedByte() {
        return this.f8643a.readUnsignedByte();
    }

    @Override // io.grpc.internal.z0
    public void reset() {
        this.f8643a.reset();
    }

    @Override // io.grpc.internal.z0
    public void skipBytes(int i3) {
        this.f8643a.skipBytes(i3);
    }

    public String toString() {
        return AbstractC0825f.b(this).d("delegate", this.f8643a).toString();
    }
}
