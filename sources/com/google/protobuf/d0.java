package com.google.protobuf;

import com.google.protobuf.AbstractC0791i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
final class d0 extends AbstractC0791i.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ByteBuffer f6753e;

    d0(ByteBuffer byteBuffer) {
        C.b(byteBuffer, "buffer");
        this.f6753e = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private ByteBuffer Q(int i3, int i4) {
        if (i3 < this.f6753e.position() || i4 > this.f6753e.limit() || i3 > i4) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i3), Integer.valueOf(i4)));
        }
        ByteBuffer byteBufferSlice = this.f6753e.slice();
        F.b(byteBufferSlice, i3 - this.f6753e.position());
        F.a(byteBufferSlice, i4 - this.f6753e.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.AbstractC0791i
    protected int A(int i3, int i4, int i5) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            i3 = (i3 * 31) + this.f6753e.get(i6);
        }
        return i3;
    }

    @Override // com.google.protobuf.AbstractC0791i
    protected int B(int i3, int i4, int i5) {
        return A0.u(i3, this.f6753e, i4, i5 + i4);
    }

    @Override // com.google.protobuf.AbstractC0791i
    public AbstractC0791i E(int i3, int i4) {
        try {
            return new d0(Q(i3, i4));
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw e3;
        } catch (IndexOutOfBoundsException e4) {
            throw new ArrayIndexOutOfBoundsException(e4.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC0791i
    protected String I(Charset charset) {
        byte[] bArrF;
        int length;
        int iArrayOffset;
        if (this.f6753e.hasArray()) {
            bArrF = this.f6753e.array();
            iArrayOffset = this.f6753e.arrayOffset() + this.f6753e.position();
            length = this.f6753e.remaining();
        } else {
            bArrF = F();
            length = bArrF.length;
            iArrayOffset = 0;
        }
        return new String(bArrF, iArrayOffset, length, charset);
    }

    @Override // com.google.protobuf.AbstractC0791i
    void O(AbstractC0790h abstractC0790h) {
        abstractC0790h.a(this.f6753e.slice());
    }

    @Override // com.google.protobuf.AbstractC0791i.h
    boolean P(AbstractC0791i abstractC0791i, int i3, int i4) {
        return E(0, i4).equals(abstractC0791i.E(i3, i4 + i3));
    }

    @Override // com.google.protobuf.AbstractC0791i
    public ByteBuffer b() {
        return this.f6753e.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC0791i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0791i)) {
            return false;
        }
        AbstractC0791i abstractC0791i = (AbstractC0791i) obj;
        if (size() != abstractC0791i.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof d0 ? this.f6753e.equals(((d0) obj).f6753e) : obj instanceof m0 ? obj.equals(this) : this.f6753e.equals(abstractC0791i.b());
    }

    @Override // com.google.protobuf.AbstractC0791i
    public byte f(int i3) {
        try {
            return this.f6753e.get(i3);
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw e3;
        } catch (IndexOutOfBoundsException e4) {
            throw new ArrayIndexOutOfBoundsException(e4.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC0791i
    public int size() {
        return this.f6753e.remaining();
    }

    @Override // com.google.protobuf.AbstractC0791i
    protected void t(byte[] bArr, int i3, int i4, int i5) {
        ByteBuffer byteBufferSlice = this.f6753e.slice();
        F.b(byteBufferSlice, i3);
        byteBufferSlice.get(bArr, i4, i5);
    }

    @Override // com.google.protobuf.AbstractC0791i
    public byte v(int i3) {
        return f(i3);
    }

    @Override // com.google.protobuf.AbstractC0791i
    public boolean x() {
        return A0.r(this.f6753e);
    }

    @Override // com.google.protobuf.AbstractC0791i
    public AbstractC0792j z() {
        return AbstractC0792j.j(this.f6753e, true);
    }
}
