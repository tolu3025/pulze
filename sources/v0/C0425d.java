package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;

/* JADX INFO: renamed from: V0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0425d extends AbstractC0806y implements W {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0425d DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object consistencySelector_;
    private n mask_;
    private int consistencySelectorCase_ = 0;
    private String database_ = "";
    private C.e documents_ = AbstractC0806y.A();

    /* JADX INFO: renamed from: V0.d$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2956a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2956a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2956a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2956a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2956a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2956a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2956a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2956a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: V0.d$b */
    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(C0425d.DEFAULT_INSTANCE);
        }

        public b w(String str) {
            q();
            ((C0425d) this.f6988b).c0(str);
            return this;
        }

        public b x(String str) {
            q();
            ((C0425d) this.f6988b).g0(str);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        C0425d c0425d = new C0425d();
        DEFAULT_INSTANCE = c0425d;
        AbstractC0806y.V(C0425d.class, c0425d);
    }

    private C0425d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(String str) {
        str.getClass();
        d0();
        this.documents_.add(str);
    }

    private void d0() {
        C.e eVar = this.documents_;
        if (eVar.g()) {
            return;
        }
        this.documents_ = AbstractC0806y.L(eVar);
    }

    public static C0425d e0() {
        return DEFAULT_INSTANCE;
    }

    public static b f0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(String str) {
        str.getClass();
        this.database_ = str;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2956a[dVar.ordinal()]) {
            case 1:
                return new C0425d();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003ဉ\u0000\u0004=\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "database_", "documents_", "mask_", H.class, t0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0425d.class) {
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
