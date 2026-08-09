package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;

/* JADX INFO: renamed from: V0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0430i extends AbstractC0806y implements W {
    public static final int COMMIT_TIME_FIELD_NUMBER = 2;
    private static final C0430i DEFAULT_INSTANCE;
    private static volatile f0 PARSER = null;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private t0 commitTime_;
    private C.e writeResults_ = AbstractC0806y.A();

    /* JADX INFO: renamed from: V0.i$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2966a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2966a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2966a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2966a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2966a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2966a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2966a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2966a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: V0.i$b */
    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(C0430i.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        C0430i c0430i = new C0430i();
        DEFAULT_INSTANCE = c0430i;
        AbstractC0806y.V(C0430i.class, c0430i);
    }

    private C0430i() {
    }

    public static C0430i b0() {
        return DEFAULT_INSTANCE;
    }

    public t0 a0() {
        t0 t0Var = this.commitTime_;
        return t0Var == null ? t0.c0() : t0Var;
    }

    public M c0(int i3) {
        return (M) this.writeResults_.get(i3);
    }

    public int d0() {
        return this.writeResults_.size();
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2966a[dVar.ordinal()]) {
            case 1:
                return new C0430i();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "writeResults_", M.class, "commitTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0430i.class) {
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
