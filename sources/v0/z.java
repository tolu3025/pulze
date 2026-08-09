package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC0806y implements W {
    private static final z DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile f0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3016a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f3016a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3016a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3016a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3016a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3016a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3016a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3016a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(z.DEFAULT_INSTANCE);
        }

        public b w(boolean z2) {
            q();
            ((z) this.f6988b).h0(z2);
            return this;
        }

        public b x(t0 t0Var) {
            q();
            ((z) this.f6988b).i0(t0Var);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public enum c {
        EXISTS(1),
        UPDATE_TIME(2),
        CONDITIONTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3021a;

        c(int i3) {
            this.f3021a = i3;
        }

        public static c e(int i3) {
            if (i3 == 0) {
                return CONDITIONTYPE_NOT_SET;
            }
            if (i3 == 1) {
                return EXISTS;
            }
            if (i3 != 2) {
                return null;
            }
            return UPDATE_TIME;
        }
    }

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        AbstractC0806y.V(z.class, zVar);
    }

    private z() {
    }

    public static z d0() {
        return DEFAULT_INSTANCE;
    }

    public static b g0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(boolean z2) {
        this.conditionTypeCase_ = 1;
        this.conditionType_ = Boolean.valueOf(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(t0 t0Var) {
        t0Var.getClass();
        this.conditionType_ = t0Var;
        this.conditionTypeCase_ = 2;
    }

    public c c0() {
        return c.e(this.conditionTypeCase_);
    }

    public boolean e0() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    public t0 f0() {
        return this.conditionTypeCase_ == 2 ? (t0) this.conditionType_ : t0.c0();
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3016a[dVar.ordinal()]) {
            case 1:
                return new z();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", t0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (z.class) {
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
