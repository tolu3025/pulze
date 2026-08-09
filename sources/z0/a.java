package Z0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.C0787e;
import com.google.protobuf.W;
import com.google.protobuf.f0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0806y implements W {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final a DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile f0 PARSER;
    private int code_;
    private String message_ = "";
    private C.e details_ = AbstractC0806y.A();

    /* JADX INFO: renamed from: Z0.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0073a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3575a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f3575a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3575a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3575a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3575a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3575a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3575a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3575a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(C0073a c0073a) {
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

    public static a b0() {
        return DEFAULT_INSTANCE;
    }

    public int a0() {
        return this.code_;
    }

    public String c0() {
        return this.message_;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        C0073a c0073a = null;
        switch (C0073a.f3575a[dVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0073a);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", C0787e.class});
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
