package V0;

import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractC0806y implements W {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final G DEFAULT_INSTANCE;
    private static volatile f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private Z0.a cause_;
    private t0 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private C.d targetIds_ = AbstractC0806y.z();
    private AbstractC0791i resumeToken_ = AbstractC0791i.f6770b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2911a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2911a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2911a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2911a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2911a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2911a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2911a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2911a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(G.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public enum c implements C.a {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final C.b f2918m = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2920a;

        class a implements C.b {
            a() {
            }
        }

        c(int i3) {
            this.f2920a = i3;
        }

        public static c e(int i3) {
            if (i3 == 0) {
                return NO_CHANGE;
            }
            if (i3 == 1) {
                return ADD;
            }
            if (i3 == 2) {
                return REMOVE;
            }
            if (i3 == 3) {
                return CURRENT;
            }
            if (i3 != 4) {
                return null;
            }
            return RESET;
        }

        @Override // com.google.protobuf.C.a
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f2920a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        G g3 = new G();
        DEFAULT_INSTANCE = g3;
        AbstractC0806y.V(G.class, g3);
    }

    private G() {
    }

    public static G b0() {
        return DEFAULT_INSTANCE;
    }

    public Z0.a a0() {
        Z0.a aVar = this.cause_;
        return aVar == null ? Z0.a.b0() : aVar;
    }

    public t0 c0() {
        t0 t0Var = this.readTime_;
        return t0Var == null ? t0.c0() : t0Var;
    }

    public AbstractC0791i d0() {
        return this.resumeToken_;
    }

    public c e0() {
        c cVarE = c.e(this.targetChangeType_);
        return cVarE == null ? c.UNRECOGNIZED : cVarE;
    }

    public int f0() {
        return this.targetIds_.size();
    }

    public List g0() {
        return this.targetIds_;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2911a[dVar.ordinal()]) {
            case 1:
                return new G();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (G.class) {
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
