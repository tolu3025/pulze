package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.B0;
import com.google.protobuf.N;
import com.google.protobuf.O;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AbstractC0806y implements W {
    private static final x DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile f0 PARSER;
    private O fields_ = O.d();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3012a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f3012a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3012a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3012a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3012a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3012a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3012a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3012a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(x.DEFAULT_INSTANCE);
        }

        public boolean w(String str) {
            str.getClass();
            return ((x) this.f6988b).d0().containsKey(str);
        }

        public b x(Map map) {
            q();
            ((x) this.f6988b).g0().putAll(map);
            return this;
        }

        public b y(String str, I i3) {
            str.getClass();
            i3.getClass();
            q();
            ((x) this.f6988b).g0().put(str, i3);
            return this;
        }

        public b z(String str) {
            str.getClass();
            q();
            ((x) this.f6988b).g0().remove(str);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final N f3013a = N.d(B0.b.f6641p, "", B0.b.f6643r, I.r0());
    }

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        AbstractC0806y.V(x.class, xVar);
    }

    private x() {
    }

    public static x b0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map g0() {
        return i0();
    }

    private O h0() {
        return this.fields_;
    }

    private O i0() {
        if (!this.fields_.i()) {
            this.fields_ = this.fields_.l();
        }
        return this.fields_;
    }

    public static b j0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    public int c0() {
        return h0().size();
    }

    public Map d0() {
        return Collections.unmodifiableMap(h0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I e0(String str, I i3) {
        str.getClass();
        O oH0 = h0();
        return oH0.containsKey(str) ? (I) oH0.get(str) : i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I f0(String str) {
        str.getClass();
        O oH0 = h0();
        if (oH0.containsKey(str)) {
            return (I) oH0.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3012a[dVar.ordinal()]) {
            case 1:
                return new x();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.f3013a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (x.class) {
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
