package a1;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.W;
import com.google.protobuf.f0;

/* JADX INFO: renamed from: a1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0473a extends AbstractC0806y implements W {
    private static final C0473a DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile f0 PARSER;
    private double latitude_;
    private double longitude_;

    /* JADX INFO: renamed from: a1.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0074a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3587a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f3587a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3587a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3587a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3587a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3587a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3587a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3587a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: a1.a$b */
    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(C0473a.DEFAULT_INSTANCE);
        }

        public b w(double d3) {
            q();
            ((C0473a) this.f6988b).g0(d3);
            return this;
        }

        public b x(double d3) {
            q();
            ((C0473a) this.f6988b).h0(d3);
            return this;
        }

        /* synthetic */ b(C0074a c0074a) {
            this();
        }
    }

    static {
        C0473a c0473a = new C0473a();
        DEFAULT_INSTANCE = c0473a;
        AbstractC0806y.V(C0473a.class, c0473a);
    }

    private C0473a() {
    }

    public static C0473a c0() {
        return DEFAULT_INSTANCE;
    }

    public static b f0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(double d3) {
        this.latitude_ = d3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(double d3) {
        this.longitude_ = d3;
    }

    public double d0() {
        return this.latitude_;
    }

    public double e0() {
        return this.longitude_;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        C0074a c0074a = null;
        switch (C0074a.f3587a[dVar.ordinal()]) {
            case 1:
                return new C0473a();
            case 2:
                return new b(c0074a);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0473a.class) {
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
