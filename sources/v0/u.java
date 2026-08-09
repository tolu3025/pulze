package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.B0;
import com.google.protobuf.C;
import com.google.protobuf.N;
import com.google.protobuf.O;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC0806y implements W {
    public static final int ARGS_FIELD_NUMBER = 2;
    private static final u DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile f0 PARSER;
    private O options_ = O.d();
    private String name_ = "";
    private C.e args_ = AbstractC0806y.A();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2999a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2999a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2999a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2999a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2999a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2999a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2999a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2999a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(u.DEFAULT_INSTANCE);
        }

        public b w(I i3) {
            q();
            ((u) this.f6988b).d0(i3);
            return this;
        }

        public b x(String str, I i3) {
            str.getClass();
            i3.getClass();
            q();
            ((u) this.f6988b).h0().put(str, i3);
            return this;
        }

        public b y(String str) {
            q();
            ((u) this.f6988b).l0(str);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final N f3000a = N.d(B0.b.f6641p, "", B0.b.f6643r, I.r0());
    }

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        AbstractC0806y.V(u.class, uVar);
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(I i3) {
        i3.getClass();
        e0();
        this.args_.add(i3);
    }

    private void e0() {
        C.e eVar = this.args_;
        if (eVar.g()) {
            return;
        }
        this.args_ = AbstractC0806y.L(eVar);
    }

    public static u g0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map h0() {
        return j0();
    }

    private O j0() {
        if (!this.options_.i()) {
            this.options_ = this.options_.l();
        }
        return this.options_;
    }

    public static b k0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.name_ = str;
    }

    public List f0() {
        return this.args_;
    }

    public String i0() {
        return this.name_;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2999a[dVar.ordinal()]) {
            case 1:
                return new u();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0001\u0000\u0001Ȉ\u0002\u001b\u00032", new Object[]{"name_", "args_", I.class, "options_", c.f3000a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (u.class) {
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
