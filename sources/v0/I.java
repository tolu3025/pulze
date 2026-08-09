package V0;

import V0.C0423b;
import V0.u;
import V0.x;
import a1.C0473a;
import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.W;
import com.google.protobuf.e0;
import com.google.protobuf.f0;
import com.google.protobuf.t0;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC0806y implements W {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final I DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int FIELD_REFERENCE_VALUE_FIELD_NUMBER = 19;
    public static final int FUNCTION_VALUE_FIELD_NUMBER = 20;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile f0 PARSER = null;
    public static final int PIPELINE_VALUE_FIELD_NUMBER = 21;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    public static final int VARIABLE_REFERENCE_VALUE_FIELD_NUMBER = 22;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2922a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2922a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2922a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2922a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2922a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2922a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2922a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2922a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(I.DEFAULT_INSTANCE);
        }

        public b A(AbstractC0791i abstractC0791i) {
            q();
            ((I) this.f6988b).M0(abstractC0791i);
            return this;
        }

        public b B(double d3) {
            q();
            ((I) this.f6988b).N0(d3);
            return this;
        }

        public b C(String str) {
            q();
            ((I) this.f6988b).O0(str);
            return this;
        }

        public b D(u.b bVar) {
            q();
            ((I) this.f6988b).P0((u) bVar.n());
            return this;
        }

        public b E(C0473a.b bVar) {
            q();
            ((I) this.f6988b).Q0((C0473a) bVar.n());
            return this;
        }

        public b F(long j3) {
            q();
            ((I) this.f6988b).R0(j3);
            return this;
        }

        public b G(x.b bVar) {
            q();
            ((I) this.f6988b).S0((x) bVar.n());
            return this;
        }

        public b H(x xVar) {
            q();
            ((I) this.f6988b).S0(xVar);
            return this;
        }

        public b I(e0 e0Var) {
            q();
            ((I) this.f6988b).T0(e0Var);
            return this;
        }

        public b J(y yVar) {
            q();
            ((I) this.f6988b).U0(yVar);
            return this;
        }

        public b K(String str) {
            q();
            ((I) this.f6988b).V0(str);
            return this;
        }

        public b L(String str) {
            q();
            ((I) this.f6988b).W0(str);
            return this;
        }

        public b M(t0.b bVar) {
            q();
            ((I) this.f6988b).X0((t0) bVar.n());
            return this;
        }

        public b N(t0 t0Var) {
            q();
            ((I) this.f6988b).X0(t0Var);
            return this;
        }

        public x w() {
            return ((I) this.f6988b).x0();
        }

        public b x(C0423b.C0068b c0068b) {
            q();
            ((I) this.f6988b).K0((C0423b) c0068b.n());
            return this;
        }

        public b y(C0423b c0423b) {
            q();
            ((I) this.f6988b).K0(c0423b);
            return this;
        }

        public b z(boolean z2) {
            q();
            ((I) this.f6988b).L0(z2);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public enum c {
        NULL_VALUE(11),
        BOOLEAN_VALUE(1),
        INTEGER_VALUE(2),
        DOUBLE_VALUE(3),
        TIMESTAMP_VALUE(10),
        STRING_VALUE(17),
        BYTES_VALUE(18),
        REFERENCE_VALUE(5),
        GEO_POINT_VALUE(8),
        ARRAY_VALUE(9),
        MAP_VALUE(6),
        FIELD_REFERENCE_VALUE(19),
        VARIABLE_REFERENCE_VALUE(22),
        FUNCTION_VALUE(20),
        PIPELINE_VALUE(21),
        VALUETYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2940a;

        c(int i3) {
            this.f2940a = i3;
        }

        public static c e(int i3) {
            if (i3 == 0) {
                return VALUETYPE_NOT_SET;
            }
            if (i3 == 1) {
                return BOOLEAN_VALUE;
            }
            if (i3 == 2) {
                return INTEGER_VALUE;
            }
            if (i3 == 3) {
                return DOUBLE_VALUE;
            }
            if (i3 == 5) {
                return REFERENCE_VALUE;
            }
            if (i3 == 6) {
                return MAP_VALUE;
            }
            switch (i3) {
                case 8:
                    return GEO_POINT_VALUE;
                case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    return ARRAY_VALUE;
                case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    return TIMESTAMP_VALUE;
                case 11:
                    return NULL_VALUE;
                default:
                    switch (i3) {
                        case I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            return STRING_VALUE;
                        case I.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            return BYTES_VALUE;
                        case I.FIELD_REFERENCE_VALUE_FIELD_NUMBER /* 19 */:
                            return FIELD_REFERENCE_VALUE;
                        case I.FUNCTION_VALUE_FIELD_NUMBER /* 20 */:
                            return FUNCTION_VALUE;
                        case I.PIPELINE_VALUE_FIELD_NUMBER /* 21 */:
                            return PIPELINE_VALUE;
                        case I.VARIABLE_REFERENCE_VALUE_FIELD_NUMBER /* 22 */:
                            return VARIABLE_REFERENCE_VALUE;
                        default:
                            return null;
                    }
            }
        }
    }

    static {
        I i3 = new I();
        DEFAULT_INSTANCE = i3;
        AbstractC0806y.V(I.class, i3);
    }

    private I() {
    }

    public static b J0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0(C0423b c0423b) {
        c0423b.getClass();
        this.valueType_ = c0423b;
        this.valueTypeCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(boolean z2) {
        this.valueTypeCase_ = 1;
        this.valueType_ = Boolean.valueOf(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(AbstractC0791i abstractC0791i) {
        abstractC0791i.getClass();
        this.valueTypeCase_ = 18;
        this.valueType_ = abstractC0791i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(double d3) {
        this.valueTypeCase_ = 3;
        this.valueType_ = Double.valueOf(d3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(String str) {
        str.getClass();
        this.valueTypeCase_ = 19;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0(u uVar) {
        uVar.getClass();
        this.valueType_ = uVar;
        this.valueTypeCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(C0473a c0473a) {
        c0473a.getClass();
        this.valueType_ = c0473a;
        this.valueTypeCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(long j3) {
        this.valueTypeCase_ = 2;
        this.valueType_ = Long.valueOf(j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0(x xVar) {
        xVar.getClass();
        this.valueType_ = xVar;
        this.valueTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0(e0 e0Var) {
        this.valueType_ = Integer.valueOf(e0Var.a());
        this.valueTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0(y yVar) {
        yVar.getClass();
        this.valueType_ = yVar;
        this.valueTypeCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(String str) {
        str.getClass();
        this.valueTypeCase_ = 5;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0(String str) {
        str.getClass();
        this.valueTypeCase_ = 17;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(t0 t0Var) {
        t0Var.getClass();
        this.valueType_ = t0Var;
        this.valueTypeCase_ = 10;
    }

    public static I r0() {
        return DEFAULT_INSTANCE;
    }

    public t0 A0() {
        return this.valueTypeCase_ == 10 ? (t0) this.valueType_ : t0.c0();
    }

    public c B0() {
        return c.e(this.valueTypeCase_);
    }

    public boolean C0() {
        return this.valueTypeCase_ == 9;
    }

    public boolean D0() {
        return this.valueTypeCase_ == 3;
    }

    public boolean E0() {
        return this.valueTypeCase_ == 2;
    }

    public boolean F0() {
        return this.valueTypeCase_ == 6;
    }

    public boolean G0() {
        return this.valueTypeCase_ == 11;
    }

    public boolean H0() {
        return this.valueTypeCase_ == 5;
    }

    public boolean I0() {
        return this.valueTypeCase_ == 17;
    }

    public C0423b o0() {
        return this.valueTypeCase_ == 9 ? (C0423b) this.valueType_ : C0423b.g0();
    }

    public boolean p0() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public AbstractC0791i q0() {
        return this.valueTypeCase_ == 18 ? (AbstractC0791i) this.valueType_ : AbstractC0791i.f6770b;
    }

    public double s0() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public String t0() {
        return this.valueTypeCase_ == 19 ? (String) this.valueType_ : "";
    }

    public u u0() {
        return this.valueTypeCase_ == 20 ? (u) this.valueType_ : u.g0();
    }

    public C0473a v0() {
        return this.valueTypeCase_ == 8 ? (C0473a) this.valueType_ : C0473a.c0();
    }

    public long w0() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public x x0() {
        return this.valueTypeCase_ == 6 ? (x) this.valueType_ : x.b0();
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2922a[dVar.ordinal()]) {
            case 1:
                return new I();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u000f\u0001\u0000\u0001\u0016\u000f\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000\u0013Ȼ\u0000\u0014<\u0000\u0015<\u0000\u0016Ȼ\u0000", new Object[]{"valueType_", "valueTypeCase_", x.class, C0473a.class, C0423b.class, t0.class, u.class, y.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (I.class) {
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

    public String y0() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    public String z0() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }
}
