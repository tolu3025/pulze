package V0;

import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0806y implements W {
    private static final r DEFAULT_INSTANCE;
    public static final int EXECUTION_TIME_FIELD_NUMBER = 3;
    private static volatile f0 PARSER = null;
    public static final int RESULTS_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 1;
    private int bitField0_;
    private t0 executionTime_;
    private AbstractC0791i transaction_ = AbstractC0791i.f6770b;
    private C.e results_ = AbstractC0806y.A();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2991a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2991a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2991a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2991a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2991a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2991a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2991a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2991a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(r.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        AbstractC0806y.V(r.class, rVar);
    }

    private r() {
    }

    public static r a0() {
        return DEFAULT_INSTANCE;
    }

    public t0 b0() {
        t0 t0Var = this.executionTime_;
        return t0Var == null ? t0.c0() : t0Var;
    }

    public List c0() {
        return this.results_;
    }

    public boolean d0() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2991a[dVar.ordinal()]) {
            case 1:
                return new r();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\n\u0002\u001b\u0003ဉ\u0000", new Object[]{"bitField0_", "transaction_", "results_", C0432k.class, "executionTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (r.class) {
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
