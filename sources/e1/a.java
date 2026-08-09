package E1;

import com.google.protobuf.AbstractC0794l;
import com.google.protobuf.V;
import com.google.protobuf.f0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import y1.InterfaceC1319w;
import y1.Q;

/* JADX INFO: loaded from: classes.dex */
final class a extends InputStream implements InterfaceC1319w, Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private V f1409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f1410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteArrayInputStream f1411c;

    a(V v2, f0 f0Var) {
        this.f1409a = v2;
        this.f1410b = f0Var;
    }

    @Override // java.io.InputStream
    public int available() {
        V v2 = this.f1409a;
        if (v2 != null) {
            return v2.a();
        }
        ByteArrayInputStream byteArrayInputStream = this.f1411c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // y1.InterfaceC1319w
    public int b(OutputStream outputStream) {
        V v2 = this.f1409a;
        if (v2 != null) {
            int iA = v2.a();
            this.f1409a.e(outputStream);
            this.f1409a = null;
            return iA;
        }
        ByteArrayInputStream byteArrayInputStream = this.f1411c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int iA2 = (int) b.a(byteArrayInputStream, outputStream);
        this.f1411c = null;
        return iA2;
    }

    V c() {
        V v2 = this.f1409a;
        if (v2 != null) {
            return v2;
        }
        throw new IllegalStateException("message not available");
    }

    f0 f() {
        return this.f1410b;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f1409a != null) {
            this.f1411c = new ByteArrayInputStream(this.f1409a.i());
            this.f1409a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f1411c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i3, int i4) {
        V v2 = this.f1409a;
        if (v2 != null) {
            int iA = v2.a();
            if (iA == 0) {
                this.f1409a = null;
                this.f1411c = null;
                return -1;
            }
            if (i4 >= iA) {
                AbstractC0794l abstractC0794lC0 = AbstractC0794l.c0(bArr, i3, iA);
                this.f1409a.h(abstractC0794lC0);
                abstractC0794lC0.X();
                abstractC0794lC0.d();
                this.f1409a = null;
                this.f1411c = null;
                return iA;
            }
            this.f1411c = new ByteArrayInputStream(this.f1409a.i());
            this.f1409a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f1411c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i3, i4);
        }
        return -1;
    }
}
