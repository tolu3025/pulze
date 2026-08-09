package V0;

import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.B0;
import com.google.protobuf.C;
import com.google.protobuf.N;
import com.google.protobuf.O;
import com.google.protobuf.W;
import com.google.protobuf.f0;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC0806y implements W {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final K DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile f0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private O labels_ = O.d();
    private String database_ = "";
    private String streamId_ = "";
    private C.e writes_ = AbstractC0806y.A();
    private AbstractC0791i streamToken_ = AbstractC0791i.f6770b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2949a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2949a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2949a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2949a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2949a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2949a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2949a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2949a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(K.DEFAULT_INSTANCE);
        }

        public b w(J j3) {
            q();
            ((K) this.f6988b).d0(j3);
            return this;
        }

        public b x(String str) {
            q();
            ((K) this.f6988b).h0(str);
            return this;
        }

        public b y(AbstractC0791i abstractC0791i) {
            q();
            ((K) this.f6988b).i0(abstractC0791i);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final N f2950a;

        static {
            B0.b bVar = B0.b.f6641p;
            f2950a = N.d(bVar, "", bVar, "");
        }
    }

    static {
        K k3 = new K();
        DEFAULT_INSTANCE = k3;
        AbstractC0806y.V(K.class, k3);
    }

    private K() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(J j3) {
        j3.getClass();
        e0();
        this.writes_.add(j3);
    }

    private void e0() {
        C.e eVar = this.writes_;
        if (eVar.g()) {
            return;
        }
        this.writes_ = AbstractC0806y.L(eVar);
    }

    public static K f0() {
        return DEFAULT_INSTANCE;
    }

    public static b g0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(AbstractC0791i abstractC0791i) {
        abstractC0791i.getClass();
        this.streamToken_ = abstractC0791i;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2949a[dVar.ordinal()]) {
            case 1:
                return new K();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", J.class, "streamToken_", "labels_", c.f2950a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (K.class) {
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
