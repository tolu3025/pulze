package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class k0 implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f6839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f6841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6842d;

    k0(V v2, String str, Object[] objArr) {
        char cCharAt;
        this.f6839a = v2;
        this.f6840b = str;
        this.f6841c = objArr;
        int iCharAt = str.charAt(0);
        if (iCharAt >= 55296) {
            int i3 = iCharAt & 8191;
            int i4 = 13;
            int i5 = 1;
            while (true) {
                int i6 = i5 + 1;
                cCharAt = str.charAt(i5);
                if (cCharAt < 55296) {
                    break;
                }
                i3 |= (cCharAt & 8191) << i4;
                i4 += 13;
                i5 = i6;
            }
            iCharAt = i3 | (cCharAt << i4);
        }
        this.f6842d = iCharAt;
    }

    @Override // com.google.protobuf.T
    public boolean a() {
        return (this.f6842d & 2) == 2;
    }

    @Override // com.google.protobuf.T
    public h0 b() {
        int i3 = this.f6842d;
        return (i3 & 1) != 0 ? h0.PROTO2 : (i3 & 4) == 4 ? h0.EDITIONS : h0.PROTO3;
    }

    @Override // com.google.protobuf.T
    public V c() {
        return this.f6839a;
    }

    Object[] d() {
        return this.f6841c;
    }

    String e() {
        return this.f6840b;
    }
}
