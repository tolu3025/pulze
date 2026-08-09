package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0806y implements W {
    private static final M DEFAULT_INSTANCE;
    private static volatile f0 PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private C.e transformResults_ = AbstractC0806y.A();
    private t0 updateTime_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2952a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2952a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2952a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2952a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2952a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2952a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2952a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2952a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(M.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        M m3 = new M();
        DEFAULT_INSTANCE = m3;
        AbstractC0806y.V(M.class, m3);
    }

    private M() {
    }

    public I a0(int i3) {
        return (I) this.transformResults_.get(i3);
    }

    public int b0() {
        return this.transformResults_.size();
    }

    public t0 c0() {
        t0 t0Var = this.updateTime_;
        return t0Var == null ? t0.c0() : t0Var;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2952a[dVar.ordinal()]) {
            case 1:
                return new M();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", I.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (M.class) {
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
