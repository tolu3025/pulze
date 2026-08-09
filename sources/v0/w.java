package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.W;
import com.google.protobuf.f0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC0806y implements W {
    private static final w DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile f0 PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3003a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f3003a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3003a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3003a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3003a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3003a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3003a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3003a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(w.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public enum c {
        TARGET_CHANGE(2),
        DOCUMENT_CHANGE(3),
        DOCUMENT_DELETE(4),
        DOCUMENT_REMOVE(6),
        FILTER(5),
        RESPONSETYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3011a;

        c(int i3) {
            this.f3011a = i3;
        }

        public static c e(int i3) {
            if (i3 == 0) {
                return RESPONSETYPE_NOT_SET;
            }
            if (i3 == 2) {
                return TARGET_CHANGE;
            }
            if (i3 == 3) {
                return DOCUMENT_CHANGE;
            }
            if (i3 == 4) {
                return DOCUMENT_DELETE;
            }
            if (i3 == 5) {
                return FILTER;
            }
            if (i3 != 6) {
                return null;
            }
            return DOCUMENT_REMOVE;
        }
    }

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        AbstractC0806y.V(w.class, wVar);
    }

    private w() {
    }

    public static w a0() {
        return DEFAULT_INSTANCE;
    }

    public C0433l b0() {
        return this.responseTypeCase_ == 3 ? (C0433l) this.responseType_ : C0433l.a0();
    }

    public C0434m c0() {
        return this.responseTypeCase_ == 4 ? (C0434m) this.responseType_ : C0434m.a0();
    }

    public o d0() {
        return this.responseTypeCase_ == 6 ? (o) this.responseType_ : o.a0();
    }

    public s e0() {
        return this.responseTypeCase_ == 5 ? (s) this.responseType_ : s.b0();
    }

    public c f0() {
        return c.e(this.responseTypeCase_);
    }

    public G g0() {
        return this.responseTypeCase_ == 2 ? (G) this.responseType_ : G.b0();
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3003a[dVar.ordinal()]) {
            case 1:
                return new w();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", G.class, C0433l.class, C0434m.class, s.class, o.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (w.class) {
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
