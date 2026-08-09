package V0;

import V0.E;
import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.C0807z;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0806y implements W {
    private static final F DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile f0 PARSER = null;
    public static final int PIPELINE_QUERY_FIELD_NUMBER = 13;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private C0807z expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2906a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2906a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2906a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2906a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2906a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2906a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2906a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2906a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(F.DEFAULT_INSTANCE);
        }

        public b A(t0 t0Var) {
            q();
            ((F) this.f6988b).m0(t0Var);
            return this;
        }

        public b B(AbstractC0791i abstractC0791i) {
            q();
            ((F) this.f6988b).n0(abstractC0791i);
            return this;
        }

        public b C(int i3) {
            q();
            ((F) this.f6988b).o0(i3);
            return this;
        }

        public b w(c cVar) {
            q();
            ((F) this.f6988b).i0(cVar);
            return this;
        }

        public b x(C0807z.b bVar) {
            q();
            ((F) this.f6988b).j0((C0807z) bVar.n());
            return this;
        }

        public b y(d.a aVar) {
            q();
            ((F) this.f6988b).k0((d) aVar.n());
            return this;
        }

        public b z(e eVar) {
            q();
            ((F) this.f6988b).l0(eVar);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c extends AbstractC0806y implements W {
        private static final c DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile f0 PARSER;
        private C.e documents_ = AbstractC0806y.A();

        public static final class a extends AbstractC0806y.a implements W {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            public a w(String str) {
                q();
                ((c) this.f6988b).b0(str);
                return this;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void b0(String str) {
            str.getClass();
            c0();
            this.documents_.add(str);
        }

        private void c0() {
            C.e eVar = this.documents_;
            if (eVar.g()) {
                return;
            }
            this.documents_ = AbstractC0806y.L(eVar);
        }

        public static c d0() {
            return DEFAULT_INSTANCE;
        }

        public static a g0() {
            return (a) DEFAULT_INSTANCE.u();
        }

        public String e0(int i3) {
            return (String) this.documents_.get(i3);
        }

        public int f0() {
            return this.documents_.size();
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f2906a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
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
        private static volatile f0 PARSER = null;
        public static final int STRUCTURED_PIPELINE_FIELD_NUMBER = 1;
        private int pipelineTypeCase_ = 0;
        private Object pipelineType_;

        public static final class a extends AbstractC0806y.a implements W {
            private a() {
                super(d.DEFAULT_INSTANCE);
            }

            public a w(D d3) {
                q();
                ((d) this.f6988b).f0(d3);
                return this;
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        public enum b {
            STRUCTURED_PIPELINE(1),
            PIPELINETYPE_NOT_SET(0);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f2910a;

            b(int i3) {
                this.f2910a = i3;
            }

            public static b e(int i3) {
                if (i3 == 0) {
                    return PIPELINETYPE_NOT_SET;
                }
                if (i3 != 1) {
                    return null;
                }
                return STRUCTURED_PIPELINE;
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            AbstractC0806y.V(d.class, dVar);
        }

        private d() {
        }

        public static d b0() {
            return DEFAULT_INSTANCE;
        }

        public static a e0() {
            return (a) DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f0(D d3) {
            d3.getClass();
            this.pipelineType_ = d3;
            this.pipelineTypeCase_ = 1;
        }

        public b c0() {
            return b.e(this.pipelineTypeCase_);
        }

        public D d0() {
            return this.pipelineTypeCase_ == 1 ? (D) this.pipelineType_ : D.c0();
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f2906a[dVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"pipelineType_", "pipelineTypeCase_", D.class});
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

    public static final class e extends AbstractC0806y implements W {
        private static final e DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile f0 PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = "";

        public static final class a extends AbstractC0806y.a implements W {
            private a() {
                super(e.DEFAULT_INSTANCE);
            }

            public a w(String str) {
                q();
                ((e) this.f6988b).g0(str);
                return this;
            }

            public a x(E.b bVar) {
                q();
                ((e) this.f6988b).h0((E) bVar.n());
                return this;
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        static {
            e eVar = new e();
            DEFAULT_INSTANCE = eVar;
            AbstractC0806y.V(e.class, eVar);
        }

        private e() {
        }

        public static e c0() {
            return DEFAULT_INSTANCE;
        }

        public static a f0() {
            return (a) DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(String str) {
            str.getClass();
            this.parent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h0(E e3) {
            e3.getClass();
            this.queryType_ = e3;
            this.queryTypeCase_ = 2;
        }

        public String d0() {
            return this.parent_;
        }

        public E e0() {
            return this.queryTypeCase_ == 2 ? (E) this.queryType_ : E.k0();
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f2906a[dVar.ordinal()]) {
                case 1:
                    return new e();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", E.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f0 bVar = PARSER;
                    if (bVar == null) {
                        synchronized (e.class) {
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
        F f3 = new F();
        DEFAULT_INSTANCE = f3;
        AbstractC0806y.V(F.class, f3);
    }

    private F() {
    }

    public static b h0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(C0807z c0807z) {
        c0807z.getClass();
        this.expectedCount_ = c0807z;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(e eVar) {
        eVar.getClass();
        this.targetType_ = eVar;
        this.targetTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(t0 t0Var) {
        t0Var.getClass();
        this.resumeType_ = t0Var;
        this.resumeTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(AbstractC0791i abstractC0791i) {
        abstractC0791i.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = abstractC0791i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(int i3) {
        this.targetId_ = i3;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2906a[dVar.ordinal()]) {
            case 1:
                return new F();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\b\u0002\u0001\u0002\r\b\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000\r<\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", e.class, c.class, "targetId_", "once_", t0.class, "expectedCount_", d.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (F.class) {
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
