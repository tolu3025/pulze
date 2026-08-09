package V0;

import V0.C0423b;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC0806y implements W {
    private static final p DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile f0 PARSER;
    private String document_ = "";
    private C.e fieldTransforms_ = AbstractC0806y.A();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2974a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2974a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2974a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2974a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2974a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2974a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2974a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2974a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(p.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c extends AbstractC0806y implements W {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile f0 PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private Object transformType_;
        private int transformTypeCase_ = 0;
        private String fieldPath_ = "";

        public static final class a extends AbstractC0806y.a implements W {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            public a A(b bVar) {
                q();
                ((c) this.f6988b).q0(bVar);
                return this;
            }

            public a w(C0423b.C0068b c0068b) {
                q();
                ((c) this.f6988b).m0((C0423b) c0068b.n());
                return this;
            }

            public a x(String str) {
                q();
                ((c) this.f6988b).n0(str);
                return this;
            }

            public a y(I i3) {
                q();
                ((c) this.f6988b).o0(i3);
                return this;
            }

            public a z(C0423b.C0068b c0068b) {
                q();
                ((c) this.f6988b).p0((C0423b) c0068b.n());
                return this;
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        public enum b implements C.a {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final C.b f2978e = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f2980a;

            class a implements C.b {
                a() {
                }
            }

            b(int i3) {
                this.f2980a = i3;
            }

            public static b e(int i3) {
                if (i3 == 0) {
                    return SERVER_VALUE_UNSPECIFIED;
                }
                if (i3 != 1) {
                    return null;
                }
                return REQUEST_TIME;
            }

            @Override // com.google.protobuf.C.a
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f2980a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* JADX INFO: renamed from: V0.p$c$c, reason: collision with other inner class name */
        public enum EnumC0069c {
            SET_TO_SERVER_VALUE(2),
            INCREMENT(3),
            MAXIMUM(4),
            MINIMUM(5),
            APPEND_MISSING_ELEMENTS(6),
            REMOVE_ALL_FROM_ARRAY(7),
            TRANSFORMTYPE_NOT_SET(0);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f2989a;

            EnumC0069c(int i3) {
                this.f2989a = i3;
            }

            public static EnumC0069c e(int i3) {
                if (i3 == 0) {
                    return TRANSFORMTYPE_NOT_SET;
                }
                switch (i3) {
                    case 2:
                        return SET_TO_SERVER_VALUE;
                    case 3:
                        return INCREMENT;
                    case 4:
                        return MAXIMUM;
                    case 5:
                        return MINIMUM;
                    case 6:
                        return APPEND_MISSING_ELEMENTS;
                    case 7:
                        return REMOVE_ALL_FROM_ARRAY;
                    default:
                        return null;
                }
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC0806y.V(c.class, cVar);
        }

        private c() {
        }

        public static a l0() {
            return (a) DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m0(C0423b c0423b) {
            c0423b.getClass();
            this.transformType_ = c0423b;
            this.transformTypeCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o0(I i3) {
            i3.getClass();
            this.transformType_ = i3;
            this.transformTypeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p0(C0423b c0423b) {
            c0423b.getClass();
            this.transformType_ = c0423b;
            this.transformTypeCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q0(b bVar) {
            this.transformType_ = Integer.valueOf(bVar.a());
            this.transformTypeCase_ = 2;
        }

        public C0423b f0() {
            return this.transformTypeCase_ == 6 ? (C0423b) this.transformType_ : C0423b.g0();
        }

        public String g0() {
            return this.fieldPath_;
        }

        public I h0() {
            return this.transformTypeCase_ == 3 ? (I) this.transformType_ : I.r0();
        }

        public C0423b i0() {
            return this.transformTypeCase_ == 7 ? (C0423b) this.transformType_ : C0423b.g0();
        }

        public b j0() {
            if (this.transformTypeCase_ != 2) {
                return b.SERVER_VALUE_UNSPECIFIED;
            }
            b bVarE = b.e(((Integer) this.transformType_).intValue());
            return bVarE == null ? b.UNRECOGNIZED : bVarE;
        }

        public EnumC0069c k0() {
            return EnumC0069c.e(this.transformTypeCase_);
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f2974a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", I.class, I.class, I.class, C0423b.class, C0423b.class});
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

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        AbstractC0806y.V(p.class, pVar);
    }

    private p() {
    }

    public static p a0() {
        return DEFAULT_INSTANCE;
    }

    public List b0() {
        return this.fieldTransforms_;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2974a[dVar.ordinal()]) {
            case 1:
                return new p();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (p.class) {
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
