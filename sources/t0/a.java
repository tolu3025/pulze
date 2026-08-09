package T0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0806y implements W {
    private static final a DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f0 PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private C.e fields_ = AbstractC0806y.A();

    /* JADX INFO: renamed from: T0.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0056a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2820a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2820a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2820a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2820a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2820a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2820a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2820a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2820a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        public b w(c.b bVar) {
            q();
            ((a) this.f6988b).c0((c) bVar.n());
            return this;
        }

        public b x(d dVar) {
            q();
            ((a) this.f6988b).h0(dVar);
            return this;
        }

        /* synthetic */ b(C0056a c0056a) {
            this();
        }
    }

    public static final class c extends AbstractC0806y implements W {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        private static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile f0 PARSER;
        private Object valueMode_;
        private int valueModeCase_ = 0;
        private String fieldPath_ = "";

        /* JADX INFO: renamed from: T0.a$c$a, reason: collision with other inner class name */
        public enum EnumC0057a implements C.a {
            ARRAY_CONFIG_UNSPECIFIED(0),
            CONTAINS(1),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final C.b f2824e = new C0058a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f2826a;

            /* JADX INFO: renamed from: T0.a$c$a$a, reason: collision with other inner class name */
            class C0058a implements C.b {
                C0058a() {
                }
            }

            EnumC0057a(int i3) {
                this.f2826a = i3;
            }

            @Override // com.google.protobuf.C.a
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f2826a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        public static final class b extends AbstractC0806y.a implements W {
            private b() {
                super(c.DEFAULT_INSTANCE);
            }

            public b w(EnumC0057a enumC0057a) {
                q();
                ((c) this.f6988b).h0(enumC0057a);
                return this;
            }

            public b x(String str) {
                q();
                ((c) this.f6988b).i0(str);
                return this;
            }

            public b y(EnumC0059c enumC0059c) {
                q();
                ((c) this.f6988b).j0(enumC0059c);
                return this;
            }

            /* synthetic */ b(C0056a c0056a) {
                this();
            }
        }

        /* JADX INFO: renamed from: T0.a$c$c, reason: collision with other inner class name */
        public enum EnumC0059c implements C.a {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final C.b f2831f = new C0060a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f2833a;

            /* JADX INFO: renamed from: T0.a$c$c$a, reason: collision with other inner class name */
            class C0060a implements C.b {
                C0060a() {
                }
            }

            EnumC0059c(int i3) {
                this.f2833a = i3;
            }

            public static EnumC0059c e(int i3) {
                if (i3 == 0) {
                    return ORDER_UNSPECIFIED;
                }
                if (i3 == 1) {
                    return ASCENDING;
                }
                if (i3 != 2) {
                    return null;
                }
                return DESCENDING;
            }

            @Override // com.google.protobuf.C.a
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f2833a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        public enum d {
            ORDER(2),
            ARRAY_CONFIG(3),
            VALUEMODE_NOT_SET(0);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f2838a;

            d(int i3) {
                this.f2838a = i3;
            }

            public static d e(int i3) {
                if (i3 == 0) {
                    return VALUEMODE_NOT_SET;
                }
                if (i3 == 2) {
                    return ORDER;
                }
                if (i3 != 3) {
                    return null;
                }
                return ARRAY_CONFIG;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC0806y.V(c.class, cVar);
        }

        private c() {
        }

        public static b g0() {
            return (b) DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h0(EnumC0057a enumC0057a) {
            this.valueMode_ = Integer.valueOf(enumC0057a.a());
            this.valueModeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j0(EnumC0059c enumC0059c) {
            this.valueMode_ = Integer.valueOf(enumC0059c.a());
            this.valueModeCase_ = 2;
        }

        public String d0() {
            return this.fieldPath_;
        }

        public EnumC0059c e0() {
            if (this.valueModeCase_ != 2) {
                return EnumC0059c.ORDER_UNSPECIFIED;
            }
            EnumC0059c enumC0059cE = EnumC0059c.e(((Integer) this.valueMode_).intValue());
            return enumC0059cE == null ? EnumC0059c.UNRECOGNIZED : enumC0059cE;
        }

        public d f0() {
            return d.e(this.valueModeCase_);
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            C0056a c0056a = null;
            switch (C0056a.f2820a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new b(c0056a);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
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

    public enum d implements C.a {
        QUERY_SCOPE_UNSPECIFIED(0),
        COLLECTION(1),
        COLLECTION_GROUP(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final C.b f2843f = new C0061a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2845a;

        /* JADX INFO: renamed from: T0.a$d$a, reason: collision with other inner class name */
        class C0061a implements C.b {
            C0061a() {
            }
        }

        d(int i3) {
            this.f2845a = i3;
        }

        @Override // com.google.protobuf.C.a
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f2845a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        AbstractC0806y.V(a.class, aVar);
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(c cVar) {
        cVar.getClass();
        d0();
        this.fields_.add(cVar);
    }

    private void d0() {
        C.e eVar = this.fields_;
        if (eVar.g()) {
            return;
        }
        this.fields_ = AbstractC0806y.L(eVar);
    }

    public static b f0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public static a g0(byte[] bArr) {
        return (a) AbstractC0806y.R(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(d dVar) {
        this.queryScope_ = dVar.a();
    }

    public List e0() {
        return this.fields_;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        C0056a c0056a = null;
        switch (C0056a.f2820a[dVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0056a);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", c.class, "state_"});
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
