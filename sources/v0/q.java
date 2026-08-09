package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC0806y implements W {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final q DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 6;
    private static volatile f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int STRUCTURED_PIPELINE_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 5;
    private Object consistencySelector_;
    private Object pipelineType_;
    private int pipelineTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String database_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2990a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2990a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2990a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2990a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2990a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2990a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2990a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2990a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(q.DEFAULT_INSTANCE);
        }

        public b w(String str) {
            q();
            ((q) this.f6988b).e0(str);
            return this;
        }

        public b x(D d3) {
            q();
            ((q) this.f6988b).f0(d3);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        AbstractC0806y.V(q.class, qVar);
    }

    private q() {
    }

    public static q c0() {
        return DEFAULT_INSTANCE;
    }

    public static b d0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(D d3) {
        d3.getClass();
        this.pipelineType_ = d3;
        this.pipelineTypeCase_ = 2;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2990a[dVar.ordinal()]) {
            case 1:
                return new q();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0005=\u0001\u0006<\u0001\u0007<\u0001", new Object[]{"pipelineType_", "pipelineTypeCase_", "consistencySelector_", "consistencySelectorCase_", "database_", D.class, H.class, t0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (q.class) {
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
