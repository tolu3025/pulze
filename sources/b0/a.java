package B0;

import D0.l;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f540d;

    a(int i3, l lVar, byte[] bArr, byte[] bArr2) {
        this.f537a = i3;
        if (lVar == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f538b = lVar;
        if (bArr == null) {
            throw new NullPointerException("Null arrayValue");
        }
        this.f539c = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Null directionalValue");
        }
        this.f540d = bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f537a == eVar.j() && this.f538b.equals(eVar.i())) {
            boolean z2 = eVar instanceof a;
            if (Arrays.equals(this.f539c, z2 ? ((a) eVar).f539c : eVar.g())) {
                if (Arrays.equals(this.f540d, z2 ? ((a) eVar).f540d : eVar.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // B0.e
    public byte[] g() {
        return this.f539c;
    }

    @Override // B0.e
    public byte[] h() {
        return this.f540d;
    }

    public int hashCode() {
        return ((((((this.f537a ^ 1000003) * 1000003) ^ this.f538b.hashCode()) * 1000003) ^ Arrays.hashCode(this.f539c)) * 1000003) ^ Arrays.hashCode(this.f540d);
    }

    @Override // B0.e
    public l i() {
        return this.f538b;
    }

    @Override // B0.e
    public int j() {
        return this.f537a;
    }

    public String toString() {
        return "IndexEntry{indexId=" + this.f537a + ", documentKey=" + this.f538b + ", arrayValue=" + Arrays.toString(this.f539c) + ", directionalValue=" + Arrays.toString(this.f540d) + "}";
    }
}
