package I1;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2402e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f2403f = f.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2407d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public e(int i3, int i4, int i5) {
        this.f2404a = i3;
        this.f2405b = i4;
        this.f2406c = i5;
        this.f2407d = e(i3, i4, i5);
    }

    private final int e(int i3, int i4, int i5) {
        if (i3 >= 0 && i3 < 256 && i4 >= 0 && i4 < 256 && i5 >= 0 && i5 < 256) {
            return (i3 << 16) + (i4 << 8) + i5;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i3 + '.' + i4 + '.' + i5).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(e other) {
        kotlin.jvm.internal.m.e(other, "other");
        return this.f2407d - other.f2407d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return eVar != null && this.f2407d == eVar.f2407d;
    }

    public int hashCode() {
        return this.f2407d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2404a);
        sb.append('.');
        sb.append(this.f2405b);
        sb.append('.');
        sb.append(this.f2406c);
        return sb.toString();
    }
}
