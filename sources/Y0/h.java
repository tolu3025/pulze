package Y0;

import Y0.i;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f3302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f3303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f3304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f3306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f3309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3311j;

    private h(k kVar) {
        if (kVar == null) {
            throw new NullPointerException("pattern is null");
        }
        this.f3302a = kVar;
        n nVarE = kVar.e();
        int iE = nVarE.e();
        this.f3305d = iE;
        this.f3303b = new int[(iE * 2) + 2];
        this.f3304c = nVarE.f3347k;
    }

    private boolean c(int i3, int i4) {
        if (!this.f3302a.e().d(this.f3306e, i3, this.f3307f, i4, this.f3303b, 1)) {
            return false;
        }
        this.f3309h = true;
        this.f3310i = false;
        this.f3311j = i4;
        return true;
    }

    private void g(int i3) {
        if (i3 < 0 || i3 > this.f3305d) {
            throw new IndexOutOfBoundsException("Group index out of bounds: " + i3);
        }
        if (!this.f3309h) {
            throw new IllegalStateException("perhaps no match attempted");
        }
        if (i3 == 0 || this.f3310i) {
            return;
        }
        int i4 = this.f3303b[1] + 1;
        int i5 = this.f3307f;
        int i6 = i4 > i5 ? i5 : i4;
        n nVarE = this.f3302a.e();
        i iVar = this.f3306e;
        int[] iArr = this.f3303b;
        if (!nVarE.d(iVar, iArr[0], i6, this.f3311j, iArr, this.f3305d + 1)) {
            throw new IllegalStateException("inconsistency in matching group data");
        }
        this.f3310i = true;
    }

    private h j(i iVar) {
        if (iVar == null) {
            throw new NullPointerException("input is null");
        }
        this.f3306e = iVar;
        i();
        return this;
    }

    public int a(int i3) {
        g(i3);
        return this.f3303b[(i3 * 2) + 1];
    }

    public boolean b() {
        int i3;
        if (this.f3309h) {
            int[] iArr = this.f3303b;
            i3 = iArr[1];
            if (iArr[0] == i3) {
                i3++;
            }
        } else {
            i3 = 0;
        }
        return c(i3, 0);
    }

    public String d() {
        return e(0);
    }

    public String e(int i3) {
        int iL = l(i3);
        int iA = a(i3);
        if (iL >= 0 || iA >= 0) {
            return m(iL, iA);
        }
        return null;
    }

    public int f() {
        return this.f3305d;
    }

    public boolean h() {
        return c(0, 2);
    }

    public h i() {
        this.f3307f = this.f3306e.d();
        this.f3308g = 0;
        this.f3309h = false;
        this.f3310i = false;
        return this;
    }

    public h k(CharSequence charSequence) {
        return j(i.e(charSequence));
    }

    public int l(int i3) {
        g(i3);
        return this.f3303b[i3 * 2];
    }

    String m(int i3, int i4) {
        return this.f3306e.c() == i.a.UTF_8 ? new String(this.f3306e.a(), i3, i4 - i3) : this.f3306e.b().subSequence(i3, i4).toString();
    }

    h(k kVar, CharSequence charSequence) {
        this(kVar);
        k(charSequence);
    }
}
