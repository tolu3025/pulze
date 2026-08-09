package C1;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f1223d = new int[10];

    public int a(int i3) {
        return this.f1223d[i3];
    }

    int b() {
        if ((this.f1220a & 2) != 0) {
            return this.f1223d[1];
        }
        return -1;
    }

    int c(int i3) {
        return (this.f1220a & 32) != 0 ? this.f1223d[5] : i3;
    }

    public boolean d(int i3) {
        return ((1 << i3) & this.f1220a) != 0;
    }

    public i e(int i3, int i4, int i5) {
        int[] iArr = this.f1223d;
        if (i3 >= iArr.length) {
            return this;
        }
        int i6 = 1 << i3;
        this.f1220a |= i6;
        this.f1221b = (i4 & 1) != 0 ? this.f1221b | i6 : this.f1221b & (~i6);
        this.f1222c = (i4 & 2) != 0 ? this.f1222c | i6 : this.f1222c & (~i6);
        iArr[i3] = i5;
        return this;
    }

    int f() {
        return Integer.bitCount(this.f1220a);
    }
}
