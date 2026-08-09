package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.B0;
import com.google.protobuf.N;
import com.google.protobuf.O;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0806y implements W {
    private static final D DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile f0 PARSER = null;
    public static final int PIPELINE_FIELD_NUMBER = 1;
    private int bitField0_;
    private O options_ = O.d();
    private y pipeline_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2859a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2859a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2859a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2859a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2859a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2859a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2859a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2859a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(D.DEFAULT_INSTANCE);
        }

        public b w(String str, I i3) {
            str.getClass();
            i3.getClass();
            q();
            ((D) this.f6988b).d0().put(str, i3);
            return this;
        }

        public b x(y yVar) {
            q();
            ((D) this.f6988b).h0(yVar);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final N f2860a = N.d(B0.b.f6641p, "", B0.b.f6643r, I.r0());
    }

    static {
        D d3 = new D();
        DEFAULT_INSTANCE = d3;
        AbstractC0806y.V(D.class, d3);
    }

    private D() {
    }

    public static D c0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map d0() {
        return f0();
    }

    private O f0() {
        if (!this.options_.i()) {
            this.options_ = this.options_.l();
        }
        return this.options_;
    }

    public static b g0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(y yVar) {
        yVar.getClass();
        this.pipeline_ = yVar;
        this.bitField0_ |= 1;
    }

    public y e0() {
        y yVar = this.pipeline_;
        return yVar == null ? y.d0() : yVar;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2859a[dVar.ordinal()]) {
            case 1:
                return new D();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"bitField0_", "pipeline_", "options_", c.f2860a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (D.class) {
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
