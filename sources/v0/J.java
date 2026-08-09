package V0;

import V0.p;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0806y implements W {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final J DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile f0 PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private z currentDocument_;
    private Object operation_;
    private n updateMask_;
    private int operationCase_ = 0;
    private C.e updateTransforms_ = AbstractC0806y.A();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2941a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2941a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2941a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2941a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2941a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2941a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2941a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2941a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(J.DEFAULT_INSTANCE);
        }

        public b A(n nVar) {
            q();
            ((J) this.f6988b).A0(nVar);
            return this;
        }

        public b B(String str) {
            q();
            ((J) this.f6988b).B0(str);
            return this;
        }

        public b w(p.c cVar) {
            q();
            ((J) this.f6988b).g0(cVar);
            return this;
        }

        public b x(z zVar) {
            q();
            ((J) this.f6988b).x0(zVar);
            return this;
        }

        public b y(String str) {
            q();
            ((J) this.f6988b).y0(str);
            return this;
        }

        public b z(C0432k c0432k) {
            q();
            ((J) this.f6988b).z0(c0432k);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public enum c {
        UPDATE(1),
        DELETE(2),
        VERIFY(5),
        TRANSFORM(6),
        OPERATION_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2948a;

        c(int i3) {
            this.f2948a = i3;
        }

        public static c e(int i3) {
            if (i3 == 0) {
                return OPERATION_NOT_SET;
            }
            if (i3 == 1) {
                return UPDATE;
            }
            if (i3 == 2) {
                return DELETE;
            }
            if (i3 == 5) {
                return VERIFY;
            }
            if (i3 != 6) {
                return null;
            }
            return TRANSFORM;
        }
    }

    static {
        J j3 = new J();
        DEFAULT_INSTANCE = j3;
        AbstractC0806y.V(J.class, j3);
    }

    private J() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(n nVar) {
        nVar.getClass();
        this.updateMask_ = nVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(String str) {
        str.getClass();
        this.operationCase_ = 5;
        this.operation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(p.c cVar) {
        cVar.getClass();
        h0();
        this.updateTransforms_.add(cVar);
    }

    private void h0() {
        C.e eVar = this.updateTransforms_;
        if (eVar.g()) {
            return;
        }
        this.updateTransforms_ = AbstractC0806y.L(eVar);
    }

    public static b u0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public static b v0(J j3) {
        return (b) DEFAULT_INSTANCE.v(j3);
    }

    public static J w0(byte[] bArr) {
        return (J) AbstractC0806y.R(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(z zVar) {
        zVar.getClass();
        this.currentDocument_ = zVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(String str) {
        str.getClass();
        this.operationCase_ = 2;
        this.operation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(C0432k c0432k) {
        c0432k.getClass();
        this.operation_ = c0432k;
        this.operationCase_ = 1;
    }

    public z i0() {
        z zVar = this.currentDocument_;
        return zVar == null ? z.d0() : zVar;
    }

    public String j0() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    public c k0() {
        return c.e(this.operationCase_);
    }

    public p l0() {
        return this.operationCase_ == 6 ? (p) this.operation_ : p.a0();
    }

    public C0432k m0() {
        return this.operationCase_ == 1 ? (C0432k) this.operation_ : C0432k.e0();
    }

    public n n0() {
        n nVar = this.updateMask_;
        return nVar == null ? n.d0() : nVar;
    }

    public List o0() {
        return this.updateTransforms_;
    }

    public String p0() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    public boolean q0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean r0() {
        return this.operationCase_ == 6;
    }

    public boolean s0() {
        return this.operationCase_ == 1;
    }

    public boolean t0() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2941a[dVar.ordinal()]) {
            case 1:
                return new J();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", C0432k.class, "updateMask_", "currentDocument_", p.class, "updateTransforms_", p.c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (J.class) {
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
