package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class B implements Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final I f3982b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I f3983a;

    class a implements I {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public H a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public boolean b(Class cls) {
            return false;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3984a;

        static {
            int[] iArr = new int[T.values().length];
            f3984a = iArr;
            try {
                iArr[T.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private I[] f3985a;

        c(I... iArr) {
            this.f3985a = iArr;
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public H a(Class cls) {
            for (I i3 : this.f3985a) {
                if (i3.b(cls)) {
                    return i3.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public boolean b(Class cls) {
            for (I i3 : this.f3985a) {
                if (i3.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public B() {
        this(c());
    }

    private static boolean b(H h3) {
        return b.f3984a[h3.b().ordinal()] != 1;
    }

    private static I c() {
        return new c(C0504s.c(), d());
    }

    private static I d() {
        if (U.f4028d) {
            return f3982b;
        }
        try {
            return (I) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f3982b;
        }
    }

    private static Y e(Class cls, H h3) {
        if (f(cls)) {
            return M.N(cls, h3, Q.b(), A.b(), a0.K(), b(h3) ? AbstractC0502p.b() : null, G.b());
        }
        return M.N(cls, h3, Q.a(), A.a(), a0.J(), b(h3) ? AbstractC0502p.a() : null, G.a());
    }

    private static boolean f(Class cls) {
        return U.f4028d || AbstractC0505t.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public Y a(Class cls) {
        f0 f0VarJ;
        AbstractC0500n abstractC0500nA;
        a0.G(cls);
        H hA = this.f3983a.a(cls);
        if (!hA.a()) {
            return e(cls, hA);
        }
        if (f(cls)) {
            f0VarJ = a0.K();
            abstractC0500nA = AbstractC0502p.b();
        } else {
            f0VarJ = a0.J();
            abstractC0500nA = AbstractC0502p.a();
        }
        return N.l(f0VarJ, abstractC0500nA, hA.c());
    }

    private B(I i3) {
        this.f3983a = (I) AbstractC0506u.b(i3, "messageInfoFactory");
    }
}
