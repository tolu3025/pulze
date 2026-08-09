package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC0806y implements W {
    private static final n DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile f0 PARSER;
    private C.e fieldPaths_ = AbstractC0806y.A();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2972a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2972a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2972a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2972a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2972a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2972a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2972a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2972a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(n.DEFAULT_INSTANCE);
        }

        public b w(String str) {
            q();
            ((n) this.f6988b).b0(str);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        AbstractC0806y.V(n.class, nVar);
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(String str) {
        str.getClass();
        c0();
        this.fieldPaths_.add(str);
    }

    private void c0() {
        C.e eVar = this.fieldPaths_;
        if (eVar.g()) {
            return;
        }
        this.fieldPaths_ = AbstractC0806y.L(eVar);
    }

    public static n d0() {
        return DEFAULT_INSTANCE;
    }

    public static b g0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public String e0(int i3) {
        return (String) this.fieldPaths_.get(i3);
    }

    public int f0() {
        return this.fieldPaths_.size();
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2972a[dVar.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (n.class) {
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
