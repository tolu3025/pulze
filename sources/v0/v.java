package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.B0;
import com.google.protobuf.N;
import com.google.protobuf.O;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractC0806y implements W {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final v DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile f0 PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private O labels_ = O.d();
    private String database_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3001a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f3001a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3001a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3001a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3001a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3001a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3001a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3001a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(v.DEFAULT_INSTANCE);
        }

        public b w(Map map) {
            q();
            ((v) this.f6988b).f0().putAll(map);
            return this;
        }

        public b x(F f3) {
            q();
            ((v) this.f6988b).i0(f3);
            return this;
        }

        public b y(String str) {
            q();
            ((v) this.f6988b).j0(str);
            return this;
        }

        public b z(int i3) {
            q();
            ((v) this.f6988b).k0(i3);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final N f3002a;

        static {
            B0.b bVar = B0.b.f6641p;
            f3002a = N.d(bVar, "", bVar, "");
        }
    }

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        AbstractC0806y.V(v.class, vVar);
    }

    private v() {
    }

    public static v e0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map f0() {
        return g0();
    }

    private O g0() {
        if (!this.labels_.i()) {
            this.labels_ = this.labels_.l();
        }
        return this.labels_;
    }

    public static b h0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(F f3) {
        f3.getClass();
        this.targetChange_ = f3;
        this.targetChangeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(int i3) {
        this.targetChangeCase_ = 3;
        this.targetChange_ = Integer.valueOf(i3);
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3001a[dVar.ordinal()]) {
            case 1:
                return new v();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", F.class, "labels_", c.f3002a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (v.class) {
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
