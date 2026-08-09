package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class M implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U f6706b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U f6707a;

    class a implements U {
        a() {
        }

        @Override // com.google.protobuf.U
        public T a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.U
        public boolean b(Class cls) {
            return false;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6708a;

        static {
            int[] iArr = new int[h0.values().length];
            f6708a = iArr;
            try {
                iArr[h0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements U {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private U[] f6709a;

        c(U... uArr) {
            this.f6709a = uArr;
        }

        @Override // com.google.protobuf.U
        public T a(Class cls) {
            for (U u2 : this.f6709a) {
                if (u2.b(cls)) {
                    return u2.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.U
        public boolean b(Class cls) {
            for (U u2 : this.f6709a) {
                if (u2.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public M() {
        this(c());
    }

    private static boolean b(T t2) {
        return b.f6708a[t2.b().ordinal()] != 1;
    }

    private static U c() {
        return new c(C0805x.c(), d());
    }

    private static U d() {
        try {
            return (U) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f6706b;
        }
    }

    private static n0 e(Class cls, T t2) {
        return AbstractC0806y.class.isAssignableFrom(cls) ? b(t2) ? Y.S(cls, t2, AbstractC0785c0.b(), K.b(), p0.K(), AbstractC0801t.b(), S.b()) : Y.S(cls, t2, AbstractC0785c0.b(), K.b(), p0.K(), null, S.b()) : b(t2) ? Y.S(cls, t2, AbstractC0785c0.a(), K.a(), p0.J(), AbstractC0801t.a(), S.a()) : Y.S(cls, t2, AbstractC0785c0.a(), K.a(), p0.J(), null, S.a());
    }

    @Override // com.google.protobuf.o0
    public n0 a(Class cls) {
        v0 v0VarJ;
        r rVarA;
        p0.G(cls);
        T tA = this.f6707a.a(cls);
        if (!tA.a()) {
            return e(cls, tA);
        }
        if (AbstractC0806y.class.isAssignableFrom(cls)) {
            v0VarJ = p0.K();
            rVarA = AbstractC0801t.b();
        } else {
            v0VarJ = p0.J();
            rVarA = AbstractC0801t.a();
        }
        return Z.m(v0VarJ, rVarA, tA.c());
    }

    private M(U u2) {
        this.f6707a = (U) C.b(u2, "messageInfoFactory");
    }
}
