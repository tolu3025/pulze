package H0;

import V0.J;
import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0806y implements W {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile f0 PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private int bitField0_;
    private t0 localWriteTime_;
    private C.e writes_ = AbstractC0806y.A();
    private C.e baseWrites_ = AbstractC0806y.A();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2121a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2121a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2121a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2121a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2121a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2121a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2121a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2121a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(e.DEFAULT_INSTANCE);
        }

        public b w(J j3) {
            q();
            ((e) this.f6988b).e0(j3);
            return this;
        }

        public b x(J j3) {
            q();
            ((e) this.f6988b).f0(j3);
            return this;
        }

        public b y(int i3) {
            q();
            ((e) this.f6988b).r0(i3);
            return this;
        }

        public b z(t0 t0Var) {
            q();
            ((e) this.f6988b).s0(t0Var);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0806y.V(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(J j3) {
        j3.getClass();
        g0();
        this.baseWrites_.add(j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(J j3) {
        j3.getClass();
        h0();
        this.writes_.add(j3);
    }

    private void g0() {
        C.e eVar = this.baseWrites_;
        if (eVar.g()) {
            return;
        }
        this.baseWrites_ = AbstractC0806y.L(eVar);
    }

    private void h0() {
        C.e eVar = this.writes_;
        if (eVar.g()) {
            return;
        }
        this.writes_ = AbstractC0806y.L(eVar);
    }

    public static b o0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public static e p0(AbstractC0791i abstractC0791i) {
        return (e) AbstractC0806y.P(DEFAULT_INSTANCE, abstractC0791i);
    }

    public static e q0(byte[] bArr) {
        return (e) AbstractC0806y.R(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(int i3) {
        this.batchId_ = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(t0 t0Var) {
        t0Var.getClass();
        this.localWriteTime_ = t0Var;
        this.bitField0_ |= 1;
    }

    public J i0(int i3) {
        return (J) this.baseWrites_.get(i3);
    }

    public int j0() {
        return this.baseWrites_.size();
    }

    public int k0() {
        return this.batchId_;
    }

    public t0 l0() {
        t0 t0Var = this.localWriteTime_;
        return t0Var == null ? t0.c0() : t0Var;
    }

    public J m0(int i3) {
        return (J) this.writes_.get(i3);
    }

    public int n0() {
        return this.writes_.size();
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2121a[dVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", J.class, "localWriteTime_", "baseWrites_", J.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (e.class) {
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
