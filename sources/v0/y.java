package V0;

import com.google.protobuf.AbstractC0780a;
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
public final class y extends AbstractC0806y implements W {
    private static final y DEFAULT_INSTANCE;
    private static volatile f0 PARSER = null;
    public static final int STAGES_FIELD_NUMBER = 1;
    private C.e stages_ = AbstractC0806y.A();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3014a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f3014a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3014a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3014a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3014a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3014a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3014a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3014a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(y.DEFAULT_INSTANCE);
        }

        public b w(Iterable iterable) {
            q();
            ((y) this.f6988b).b0(iterable);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c extends AbstractC0806y implements W {
        public static final int ARGS_FIELD_NUMBER = 2;
        private static final c DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile f0 PARSER;
        private O options_ = O.d();
        private String name_ = "";
        private C.e args_ = AbstractC0806y.A();

        public static final class a extends AbstractC0806y.a implements W {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            public a w(I i3) {
                q();
                ((c) this.f6988b).d0(i3);
                return this;
            }

            public a x(String str, I i3) {
                str.getClass();
                i3.getClass();
                q();
                ((c) this.f6988b).g0().put(str, i3);
                return this;
            }

            public a y(String str) {
                q();
                ((c) this.f6988b).k0(str);
                return this;
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        private static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final N f3015a = N.d(B0.b.f6641p, "", B0.b.f6643r, I.r0());
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC0806y.V(c.class, cVar);
        }

        private c() {
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

        /* JADX INFO: Access modifiers changed from: private */
        public Map g0() {
            return i0();
        }

        private O i0() {
            if (!this.options_.i()) {
                this.options_ = this.options_.l();
            }
            return this.options_;
        }

        public static a j0() {
            return (a) DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k0(String str) {
            str.getClass();
            this.name_ = str;
        }

        public List f0() {
            return this.args_;
        }

        public String h0() {
            return this.name_;
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f3014a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0001\u0000\u0001Ȉ\u0002\u001b\u00032", new Object[]{"name_", "args_", I.class, "options_", b.f3015a});
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

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        AbstractC0806y.V(y.class, yVar);
    }

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(Iterable iterable) {
        c0();
        AbstractC0780a.k(iterable, this.stages_);
    }

    private void c0() {
        C.e eVar = this.stages_;
        if (eVar.g()) {
            return;
        }
        this.stages_ = AbstractC0806y.L(eVar);
    }

    public static y d0() {
        return DEFAULT_INSTANCE;
    }

    public static b f0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public List e0() {
        return this.stages_;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3014a[dVar.ordinal()]) {
            case 1:
                return new y();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"stages_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (y.class) {
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
