package V0;

import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0806y implements W {
    private static final B DEFAULT_INSTANCE;
    private static volatile f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private t0 readTime_;
    private C0422a result_;
    private AbstractC0791i transaction_ = AbstractC0791i.f6770b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2857a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2857a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2857a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2857a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2857a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2857a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2857a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2857a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(B.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        B b3 = new B();
        DEFAULT_INSTANCE = b3;
        AbstractC0806y.V(B.class, b3);
    }

    private B() {
    }

    public static B a0() {
        return DEFAULT_INSTANCE;
    }

    public C0422a b0() {
        C0422a c0422a = this.result_;
        return c0422a == null ? C0422a.b0() : c0422a;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2857a[dVar.ordinal()]) {
            case 1:
                return new B();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001", new Object[]{"bitField0_", "result_", "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (B.class) {
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
