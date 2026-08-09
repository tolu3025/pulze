package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class W implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f4034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f4036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4037d;

    W(J j3, String str, Object[] objArr) {
        char cCharAt;
        this.f4034a = j3;
        this.f4035b = str;
        this.f4036c = objArr;
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
        this.f4037d = iCharAt;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public boolean a() {
        return (this.f4037d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public T b() {
        int i3 = this.f4037d;
        return (i3 & 1) != 0 ? T.PROTO2 : (i3 & 4) == 4 ? T.EDITIONS : T.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public J c() {
        return this.f4034a;
    }

    Object[] d() {
        return this.f4036c;
    }

    String e() {
        return this.f4035b;
    }
}
