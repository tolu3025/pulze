package f0;

/* JADX INFO: renamed from: f0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0863v extends AbstractC0853l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object[] f7237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final C0863v f7238n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f7239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f7240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f7241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f7242f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final transient int f7243l;

    static {
        Object[] objArr = new Object[0];
        f7237m = objArr;
        f7238n = new C0863v(objArr, 0, objArr, 0, 0);
    }

    C0863v(Object[] objArr, int i3, Object[] objArr2, int i4, int i5) {
        this.f7239c = objArr;
        this.f7240d = i3;
        this.f7241e = objArr2;
        this.f7242f = i4;
        this.f7243l = i5;
    }

    @Override // f0.AbstractC0850i
    int b(Object[] objArr, int i3) {
        System.arraycopy(this.f7239c, 0, objArr, i3, this.f7243l);
        return i3 + this.f7243l;
    }

    @Override // f0.AbstractC0850i, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f7241e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iB = AbstractC0849h.b(obj);
        while (true) {
            int i3 = iB & this.f7242f;
            Object obj2 = objArr[i3];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iB = i3 + 1;
        }
    }

    @Override // f0.AbstractC0850i
    Object[] d() {
        return this.f7239c;
    }

    @Override // f0.AbstractC0850i
    int f() {
        return this.f7243l;
    }

    @Override // f0.AbstractC0853l, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f7240d;
    }

    @Override // f0.AbstractC0850i
    int l() {
        return 0;
    }

    @Override // f0.AbstractC0850i
    boolean m() {
        return false;
    }

    @Override // f0.AbstractC0853l
    AbstractC0851j q() {
        return AbstractC0851j.o(this.f7239c, this.f7243l);
    }

    @Override // f0.AbstractC0853l
    boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public AbstractC0867z iterator() {
        return a().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f7243l;
    }
}
