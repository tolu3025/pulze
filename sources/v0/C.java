package V0;

import V0.E;
import com.google.protobuf.AbstractC0780a;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0806y implements W {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    private static final C DEFAULT_INSTANCE;
    private static volatile f0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private C.e aggregations_ = AbstractC0806y.A();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2858a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2858a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2858a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2858a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2858a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2858a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2858a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2858a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y implements W {
        public static final int ALIAS_FIELD_NUMBER = 7;
        public static final int AVG_FIELD_NUMBER = 3;
        public static final int COUNT_FIELD_NUMBER = 1;
        private static final b DEFAULT_INSTANCE;
        private static volatile f0 PARSER = null;
        public static final int SUM_FIELD_NUMBER = 2;
        private Object operator_;
        private int operatorCase_ = 0;
        private String alias_ = "";

        public static final class a extends AbstractC0806y implements W {
            private static final a DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile f0 PARSER;
            private int bitField0_;
            private E.g field_;

            /* JADX INFO: renamed from: V0.C$b$a$a, reason: collision with other inner class name */
            public static final class C0065a extends AbstractC0806y.a implements W {
                private C0065a() {
                    super(a.DEFAULT_INSTANCE);
                }

                public C0065a w(E.g gVar) {
                    q();
                    ((a) this.f6988b).c0(gVar);
                    return this;
                }

                /* synthetic */ C0065a(a aVar) {
                    this();
                }
            }

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                AbstractC0806y.V(a.class, aVar);
            }

            private a() {
            }

            public static C0065a b0() {
                return (C0065a) DEFAULT_INSTANCE.u();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void c0(E.g gVar) {
                gVar.getClass();
                this.field_ = gVar;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.AbstractC0806y
            protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
                a aVar = null;
                switch (a.f2858a[dVar.ordinal()]) {
                    case 1:
                        return new a();
                    case 2:
                        return new C0065a(aVar);
                    case 3:
                        return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        f0 bVar = PARSER;
                        if (bVar == null) {
                            synchronized (a.class) {
                                try {
                                    bVar = PARSER;
                                    if (bVar == null) {
                                        bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                        PARSER = bVar;
                                    }
                                } finally {
                                }
                                break;
                            }
                        }
                        return bVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* JADX INFO: renamed from: V0.C$b$b, reason: collision with other inner class name */
        public static final class C0066b extends AbstractC0806y.a implements W {
            private C0066b() {
                super(b.DEFAULT_INSTANCE);
            }

            public C0066b w(String str) {
                q();
                ((b) this.f6988b).f0(str);
                return this;
            }

            public C0066b x(a aVar) {
                q();
                ((b) this.f6988b).g0(aVar);
                return this;
            }

            public C0066b y(c cVar) {
                q();
                ((b) this.f6988b).h0(cVar);
                return this;
            }

            public C0066b z(d dVar) {
                q();
                ((b) this.f6988b).i0(dVar);
                return this;
            }

            /* synthetic */ C0066b(a aVar) {
                this();
            }
        }

        public static final class c extends AbstractC0806y implements W {
            private static final c DEFAULT_INSTANCE;
            private static volatile f0 PARSER = null;
            public static final int UP_TO_FIELD_NUMBER = 1;
            private int bitField0_;
            private com.google.protobuf.A upTo_;

            public static final class a extends AbstractC0806y.a implements W {
                private a() {
                    super(c.DEFAULT_INSTANCE);
                }

                /* synthetic */ a(a aVar) {
                    this();
                }
            }

            static {
                c cVar = new c();
                DEFAULT_INSTANCE = cVar;
                AbstractC0806y.V(c.class, cVar);
            }

            private c() {
            }

            public static c a0() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC0806y
            protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
                a aVar = null;
                switch (a.f2858a[dVar.ordinal()]) {
                    case 1:
                        return new c();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "upTo_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        f0 bVar = PARSER;
                        if (bVar == null) {
                            synchronized (c.class) {
                                try {
                                    bVar = PARSER;
                                    if (bVar == null) {
                                        bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                        PARSER = bVar;
                                    }
                                } finally {
                                }
                                break;
                            }
                        }
                        return bVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class d extends AbstractC0806y implements W {
            private static final d DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile f0 PARSER;
            private int bitField0_;
            private E.g field_;

            public static final class a extends AbstractC0806y.a implements W {
                private a() {
                    super(d.DEFAULT_INSTANCE);
                }

                public a w(E.g gVar) {
                    q();
                    ((d) this.f6988b).c0(gVar);
                    return this;
                }

                /* synthetic */ a(a aVar) {
                    this();
                }
            }

            static {
                d dVar = new d();
                DEFAULT_INSTANCE = dVar;
                AbstractC0806y.V(d.class, dVar);
            }

            private d() {
            }

            public static a b0() {
                return (a) DEFAULT_INSTANCE.u();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void c0(E.g gVar) {
                gVar.getClass();
                this.field_ = gVar;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.AbstractC0806y
            protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
                a aVar = null;
                switch (a.f2858a[dVar.ordinal()]) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        f0 bVar = PARSER;
                        if (bVar == null) {
                            synchronized (d.class) {
                                try {
                                    bVar = PARSER;
                                    if (bVar == null) {
                                        bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                        PARSER = bVar;
                                    }
                                } finally {
                                }
                                break;
                            }
                        }
                        return bVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            AbstractC0806y.V(b.class, bVar);
        }

        private b() {
        }

        public static C0066b e0() {
            return (C0066b) DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f0(String str) {
            str.getClass();
            this.alias_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(a aVar) {
            aVar.getClass();
            this.operator_ = aVar;
            this.operatorCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h0(c cVar) {
            cVar.getClass();
            this.operator_ = cVar;
            this.operatorCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i0(d dVar) {
            dVar.getClass();
            this.operator_ = dVar;
            this.operatorCase_ = 2;
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f2858a[dVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new C0066b(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", c.class, d.class, a.class, "alias_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f0 bVar = PARSER;
                    if (bVar == null) {
                        synchronized (b.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class c extends AbstractC0806y.a implements W {
        private c() {
            super(C.DEFAULT_INSTANCE);
        }

        public c w(Iterable iterable) {
            q();
            ((C) this.f6988b).c0(iterable);
            return this;
        }

        public c x(E e3) {
            q();
            ((C) this.f6988b).f0(e3);
            return this;
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        C c3 = new C();
        DEFAULT_INSTANCE = c3;
        AbstractC0806y.V(C.class, c3);
    }

    private C() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(Iterable iterable) {
        d0();
        AbstractC0780a.k(iterable, this.aggregations_);
    }

    private void d0() {
        C.e eVar = this.aggregations_;
        if (eVar.g()) {
            return;
        }
        this.aggregations_ = AbstractC0806y.L(eVar);
    }

    public static c e0() {
        return (c) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(E e3) {
        e3.getClass();
        this.queryType_ = e3;
        this.queryTypeCase_ = 1;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2858a[dVar.ordinal()]) {
            case 1:
                return new C();
            case 2:
                return new c(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", E.class, "aggregations_", b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
