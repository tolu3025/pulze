package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.B0;
import com.google.protobuf.N;
import com.google.protobuf.O;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: V0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0432k extends AbstractC0806y implements W {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final C0432k DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private t0 createTime_;
    private O fields_ = O.d();
    private String name_ = "";
    private t0 updateTime_;

    /* JADX INFO: renamed from: V0.k$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2968a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2968a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2968a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2968a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2968a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2968a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2968a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2968a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: V0.k$b */
    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(C0432k.DEFAULT_INSTANCE);
        }

        public b w(Map map) {
            q();
            ((C0432k) this.f6988b).g0().putAll(map);
            return this;
        }

        public b x(String str) {
            q();
            ((C0432k) this.f6988b).o0(str);
            return this;
        }

        public b y(t0 t0Var) {
            q();
            ((C0432k) this.f6988b).p0(t0Var);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: V0.k$c */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final N f2969a = N.d(B0.b.f6641p, "", B0.b.f6643r, I.r0());
    }

    static {
        C0432k c0432k = new C0432k();
        DEFAULT_INSTANCE = c0432k;
        AbstractC0806y.V(C0432k.class, c0432k);
    }

    private C0432k() {
    }

    public static C0432k e0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map g0() {
        return m0();
    }

    private O l0() {
        return this.fields_;
    }

    private O m0() {
        if (!this.fields_.i()) {
            this.fields_ = this.fields_.l();
        }
        return this.fields_;
    }

    public static b n0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(t0 t0Var) {
        t0Var.getClass();
        this.updateTime_ = t0Var;
        this.bitField0_ |= 2;
    }

    public t0 d0() {
        t0 t0Var = this.createTime_;
        return t0Var == null ? t0.c0() : t0Var;
    }

    public Map f0() {
        return Collections.unmodifiableMap(l0());
    }

    public String h0() {
        return this.name_;
    }

    public t0 i0() {
        t0 t0Var = this.updateTime_;
        return t0Var == null ? t0.c0() : t0Var;
    }

    public boolean j0() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean k0() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2968a[dVar.ordinal()]) {
            case 1:
                return new C0432k();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "name_", "fields_", c.f2969a, "createTime_", "updateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0432k.class) {
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
