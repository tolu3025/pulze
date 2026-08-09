package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.B0;
import com.google.protobuf.N;
import com.google.protobuf.O;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: V0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0422a extends AbstractC0806y implements W {
    public static final int AGGREGATE_FIELDS_FIELD_NUMBER = 2;
    private static final C0422a DEFAULT_INSTANCE;
    private static volatile f0 PARSER;
    private O aggregateFields_ = O.d();

    /* JADX INFO: renamed from: V0.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0067a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2953a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2953a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2953a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2953a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2953a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2953a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2953a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2953a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: V0.a$b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final N f2954a = N.d(B0.b.f6641p, "", B0.b.f6643r, I.r0());
    }

    /* JADX INFO: renamed from: V0.a$c */
    public static final class c extends AbstractC0806y.a implements W {
        private c() {
            super(C0422a.DEFAULT_INSTANCE);
        }

        /* synthetic */ c(C0067a c0067a) {
            this();
        }
    }

    static {
        C0422a c0422a = new C0422a();
        DEFAULT_INSTANCE = c0422a;
        AbstractC0806y.V(C0422a.class, c0422a);
    }

    private C0422a() {
    }

    public static C0422a b0() {
        return DEFAULT_INSTANCE;
    }

    private O c0() {
        return this.aggregateFields_;
    }

    public Map a0() {
        return Collections.unmodifiableMap(c0());
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        C0067a c0067a = null;
        switch (C0067a.f2953a[dVar.ordinal()]) {
            case 1:
                return new C0422a();
            case 2:
                return new c(c0067a);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"aggregateFields_", b.f2954a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0422a.class) {
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
