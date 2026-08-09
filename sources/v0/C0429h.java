package V0;

import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;

/* JADX INFO: renamed from: V0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0429h extends AbstractC0806y implements W {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0429h DEFAULT_INSTANCE;
    private static volatile f0 PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = "";
    private C.e writes_ = AbstractC0806y.A();
    private AbstractC0791i transaction_ = AbstractC0791i.f6770b;

    /* JADX INFO: renamed from: V0.h$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2965a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2965a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2965a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2965a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2965a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2965a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2965a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2965a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: V0.h$b */
    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(C0429h.DEFAULT_INSTANCE);
        }

        public b w(J j3) {
            q();
            ((C0429h) this.f6988b).c0(j3);
            return this;
        }

        public b x(String str) {
            q();
            ((C0429h) this.f6988b).g0(str);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        C0429h c0429h = new C0429h();
        DEFAULT_INSTANCE = c0429h;
        AbstractC0806y.V(C0429h.class, c0429h);
    }

    private C0429h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(J j3) {
        j3.getClass();
        d0();
        this.writes_.add(j3);
    }

    private void d0() {
        C.e eVar = this.writes_;
        if (eVar.g()) {
            return;
        }
        this.writes_ = AbstractC0806y.L(eVar);
    }

    public static C0429h e0() {
        return DEFAULT_INSTANCE;
    }

    public static b f0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(String str) {
        str.getClass();
        this.database_ = str;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2965a[dVar.ordinal()]) {
            case 1:
                return new C0429h();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\n", new Object[]{"database_", "writes_", J.class, "transaction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0429h.class) {
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
