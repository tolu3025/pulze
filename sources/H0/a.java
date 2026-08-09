package H0;

import V0.C0432k;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.W;
import com.google.protobuf.f0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0806y implements W {
    private static final a DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile f0 PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* JADX INFO: renamed from: H0.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0041a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2105a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2105a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2105a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2105a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2105a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2105a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2105a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2105a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        public b w(C0432k c0432k) {
            q();
            ((a) this.f6988b).l0(c0432k);
            return this;
        }

        public b x(boolean z2) {
            q();
            ((a) this.f6988b).m0(z2);
            return this;
        }

        public b y(H0.b bVar) {
            q();
            ((a) this.f6988b).n0(bVar);
            return this;
        }

        public b z(d dVar) {
            q();
            ((a) this.f6988b).o0(dVar);
            return this;
        }

        /* synthetic */ b(C0041a c0041a) {
            this();
        }
    }

    public enum c {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2111a;

        c(int i3) {
            this.f2111a = i3;
        }

        public static c e(int i3) {
            if (i3 == 0) {
                return DOCUMENTTYPE_NOT_SET;
            }
            if (i3 == 1) {
                return NO_DOCUMENT;
            }
            if (i3 == 2) {
                return DOCUMENT;
            }
            if (i3 != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        AbstractC0806y.V(a.class, aVar);
    }

    private a() {
    }

    public static b j0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public static a k0(byte[] bArr) {
        return (a) AbstractC0806y.R(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(C0432k c0432k) {
        c0432k.getClass();
        this.documentType_ = c0432k;
        this.documentTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(boolean z2) {
        this.hasCommittedMutations_ = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(H0.b bVar) {
        bVar.getClass();
        this.documentType_ = bVar;
        this.documentTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(d dVar) {
        dVar.getClass();
        this.documentType_ = dVar;
        this.documentTypeCase_ = 3;
    }

    public C0432k e0() {
        return this.documentTypeCase_ == 2 ? (C0432k) this.documentType_ : C0432k.e0();
    }

    public c f0() {
        return c.e(this.documentTypeCase_);
    }

    public boolean g0() {
        return this.hasCommittedMutations_;
    }

    public H0.b h0() {
        return this.documentTypeCase_ == 1 ? (H0.b) this.documentType_ : H0.b.c0();
    }

    public d i0() {
        return this.documentTypeCase_ == 3 ? (d) this.documentType_ : d.c0();
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        C0041a c0041a = null;
        switch (C0041a.f2105a[dVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0041a);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", H0.b.class, C0432k.class, d.class, "hasCommittedMutations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (a.class) {
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
