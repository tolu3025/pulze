package M;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class F extends E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f2642b;

    F(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f2642b = bArr;
    }

    @Override // M.E
    final byte[] a() {
        return this.f2642b;
    }
}
