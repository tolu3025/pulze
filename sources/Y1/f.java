package Y1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3546e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f3547f = new f(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final f a() {
            return f.f3547f;
        }
    }

    public f(int i3, int i4) {
        super(i3, i4, 1);
    }

    @Override // Y1.d
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (a() != fVar.a() || b() != fVar.b()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Y1.d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    @Override // Y1.d
    public boolean isEmpty() {
        return a() > b();
    }

    public Integer m() {
        return Integer.valueOf(b());
    }

    public Integer n() {
        return Integer.valueOf(a());
    }

    @Override // Y1.d
    public String toString() {
        return a() + ".." + b();
    }
}
