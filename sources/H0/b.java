package H0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0806y implements W {
    private static final b DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private t0 readTime_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2112a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2112a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2112a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2112a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2112a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2112a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2112a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2112a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: H0.b$b, reason: collision with other inner class name */
    public static final class C0042b extends AbstractC0806y.a implements W {
        private C0042b() {
            super(b.DEFAULT_INSTANCE);
        }

        public C0042b w(String str) {
            q();
            ((b) this.f6988b).g0(str);
            return this;
        }

        public C0042b x(t0 t0Var) {
            q();
            ((b) this.f6988b).h0(t0Var);
            return this;
        }

        /* synthetic */ C0042b(a aVar) {
            this();
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        AbstractC0806y.V(b.class, bVar);
    }

    private b() {
    }

    public static b c0() {
        return DEFAULT_INSTANCE;
    }

    public static C0042b f0() {
        return (C0042b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(t0 t0Var) {
        t0Var.getClass();
        this.readTime_ = t0Var;
        this.bitField0_ |= 1;
    }

    public String d0() {
        return this.name_;
    }

    public t0 e0() {
        t0 t0Var = this.readTime_;
        return t0Var == null ? t0.c0() : t0Var;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2112a[dVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return new C0042b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "readTime_"});
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
