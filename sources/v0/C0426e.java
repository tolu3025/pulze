package V0;

import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;

/* JADX INFO: renamed from: V0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0426e extends AbstractC0806y implements W {
    private static final C0426e DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private t0 readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private AbstractC0791i transaction_ = AbstractC0791i.f6770b;

    /* JADX INFO: renamed from: V0.e$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2957a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2957a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2957a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2957a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2957a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2957a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2957a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2957a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: V0.e$b */
    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(C0426e.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: V0.e$c */
    public enum c {
        FOUND(1),
        MISSING(2),
        RESULT_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2962a;

        c(int i3) {
            this.f2962a = i3;
        }

        public static c e(int i3) {
            if (i3 == 0) {
                return RESULT_NOT_SET;
            }
            if (i3 == 1) {
                return FOUND;
            }
            if (i3 != 2) {
                return null;
            }
            return MISSING;
        }
    }

    static {
        C0426e c0426e = new C0426e();
        DEFAULT_INSTANCE = c0426e;
        AbstractC0806y.V(C0426e.class, c0426e);
    }

    private C0426e() {
    }

    public static C0426e a0() {
        return DEFAULT_INSTANCE;
    }

    public C0432k b0() {
        return this.resultCase_ == 1 ? (C0432k) this.result_ : C0432k.e0();
    }

    public String c0() {
        return this.resultCase_ == 2 ? (String) this.result_ : "";
    }

    public t0 d0() {
        t0 t0Var = this.readTime_;
        return t0Var == null ? t0.c0() : t0Var;
    }

    public c e0() {
        return c.e(this.resultCase_);
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2957a[dVar.ordinal()]) {
            case 1:
                return new C0426e();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", C0432k.class, "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0426e.class) {
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
