package H0;

import V0.F;
import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0806y implements W {
    private static final c DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile f0 PARSER = null;
    public static final int PIPELINE_QUERY_FIELD_NUMBER = 13;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private t0 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private t0 snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private AbstractC0791i resumeToken_ = AbstractC0791i.f6770b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2113a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2113a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2113a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2113a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2113a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2113a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2113a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2113a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(c.DEFAULT_INSTANCE);
        }

        public b A(F.d.a aVar) {
            q();
            ((c) this.f6988b).y0((F.d) aVar.n());
            return this;
        }

        public b B(F.e eVar) {
            q();
            ((c) this.f6988b).z0(eVar);
            return this;
        }

        public b C(AbstractC0791i abstractC0791i) {
            q();
            ((c) this.f6988b).A0(abstractC0791i);
            return this;
        }

        public b D(t0 t0Var) {
            q();
            ((c) this.f6988b).B0(t0Var);
            return this;
        }

        public b E(int i3) {
            q();
            ((c) this.f6988b).C0(i3);
            return this;
        }

        public b w() {
            q();
            ((c) this.f6988b).j0();
            return this;
        }

        public b x(F.c cVar) {
            q();
            ((c) this.f6988b).v0(cVar);
            return this;
        }

        public b y(t0 t0Var) {
            q();
            ((c) this.f6988b).w0(t0Var);
            return this;
        }

        public b z(long j3) {
            q();
            ((c) this.f6988b).x0(j3);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: H0.c$c, reason: collision with other inner class name */
    public enum EnumC0043c {
        QUERY(5),
        DOCUMENTS(6),
        PIPELINE_QUERY(13),
        TARGETTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2119a;

        EnumC0043c(int i3) {
            this.f2119a = i3;
        }

        public static EnumC0043c e(int i3) {
            if (i3 == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i3 == 13) {
                return PIPELINE_QUERY;
            }
            if (i3 == 5) {
                return QUERY;
            }
            if (i3 != 6) {
                return null;
            }
            return DOCUMENTS;
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        AbstractC0806y.V(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(AbstractC0791i abstractC0791i) {
        abstractC0791i.getClass();
        this.resumeToken_ = abstractC0791i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(t0 t0Var) {
        t0Var.getClass();
        this.snapshotVersion_ = t0Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(int i3) {
        this.targetId_ = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        this.lastLimboFreeSnapshotVersion_ = null;
        this.bitField0_ &= -3;
    }

    public static b t0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public static c u0(byte[] bArr) {
        return (c) AbstractC0806y.R(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(F.c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(t0 t0Var) {
        t0Var.getClass();
        this.lastLimboFreeSnapshotVersion_ = t0Var;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(long j3) {
        this.lastListenSequenceNumber_ = j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(F.d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(F.e eVar) {
        eVar.getClass();
        this.targetType_ = eVar;
        this.targetTypeCase_ = 5;
    }

    public F.c k0() {
        return this.targetTypeCase_ == 6 ? (F.c) this.targetType_ : F.c.d0();
    }

    public t0 l0() {
        t0 t0Var = this.lastLimboFreeSnapshotVersion_;
        return t0Var == null ? t0.c0() : t0Var;
    }

    public long m0() {
        return this.lastListenSequenceNumber_;
    }

    public F.d n0() {
        return this.targetTypeCase_ == 13 ? (F.d) this.targetType_ : F.d.b0();
    }

    public F.e o0() {
        return this.targetTypeCase_ == 5 ? (F.e) this.targetType_ : F.e.c0();
    }

    public AbstractC0791i p0() {
        return this.resumeToken_;
    }

    public t0 q0() {
        t0 t0Var = this.snapshotVersion_;
        return t0Var == null ? t0.c0() : t0Var;
    }

    public int r0() {
        return this.targetId_;
    }

    public EnumC0043c s0() {
        return EnumC0043c.e(this.targetTypeCase_);
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2113a[dVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\r\b\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007ဉ\u0001\r<\u0000", new Object[]{"targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", F.e.class, F.c.class, "lastLimboFreeSnapshotVersion_", F.d.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (c.class) {
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
