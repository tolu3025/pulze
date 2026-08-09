package U0;

import V0.E;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0806y implements W {
    private static final a DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile f0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    /* JADX INFO: renamed from: U0.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0063a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2847a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2847a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2847a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2847a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2847a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2847a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2847a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2847a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        public b w(c cVar) {
            q();
            ((a) this.f6988b).i0(cVar);
            return this;
        }

        public b x(String str) {
            q();
            ((a) this.f6988b).j0(str);
            return this;
        }

        public b y(E e3) {
            q();
            ((a) this.f6988b).k0(e3);
            return this;
        }

        /* synthetic */ b(C0063a c0063a) {
            this();
        }
    }

    public enum c implements C.a {
        FIRST(0),
        LAST(1),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final C.b f2851e = new C0064a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2853a;

        /* JADX INFO: renamed from: U0.a$c$a, reason: collision with other inner class name */
        class C0064a implements C.b {
            C0064a() {
            }
        }

        c(int i3) {
            this.f2853a = i3;
        }

        public static c e(int i3) {
            if (i3 == 0) {
                return FIRST;
            }
            if (i3 != 1) {
                return null;
            }
            return LAST;
        }

        @Override // com.google.protobuf.C.a
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f2853a;
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

    public static b g0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public static a h0(byte[] bArr) {
        return (a) AbstractC0806y.R(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(c cVar) {
        this.limitType_ = cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(E e3) {
        e3.getClass();
        this.queryType_ = e3;
        this.queryTypeCase_ = 2;
    }

    public c d0() {
        c cVarE = c.e(this.limitType_);
        return cVarE == null ? c.UNRECOGNIZED : cVarE;
    }

    public String e0() {
        return this.parent_;
    }

    public E f0() {
        return this.queryTypeCase_ == 2 ? (E) this.queryType_ : E.k0();
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        C0063a c0063a = null;
        switch (C0063a.f2847a[dVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0063a);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", E.class, "limitType_"});
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
