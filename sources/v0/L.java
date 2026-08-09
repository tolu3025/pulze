package V0;

import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC0806y implements W {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final L DEFAULT_INSTANCE;
    private static volatile f0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private t0 commitTime_;
    private String streamId_ = "";
    private AbstractC0791i streamToken_ = AbstractC0791i.f6770b;
    private C.e writeResults_ = AbstractC0806y.A();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2951a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2951a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2951a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2951a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2951a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2951a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2951a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2951a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(L.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        L l3 = new L();
        DEFAULT_INSTANCE = l3;
        AbstractC0806y.V(L.class, l3);
    }

    private L() {
    }

    public static L b0() {
        return DEFAULT_INSTANCE;
    }

    public t0 a0() {
        t0 t0Var = this.commitTime_;
        return t0Var == null ? t0.c0() : t0Var;
    }

    public AbstractC0791i c0() {
        return this.streamToken_;
    }

    public M d0(int i3) {
        return (M) this.writeResults_.get(i3);
    }

    public int e0() {
        return this.writeResults_.size();
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2951a[dVar.ordinal()]) {
            case 1:
                return new L();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "streamId_", "streamToken_", "writeResults_", M.class, "commitTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (L.class) {
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
