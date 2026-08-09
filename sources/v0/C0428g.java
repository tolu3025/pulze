package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.W;
import com.google.protobuf.f0;

/* JADX INFO: renamed from: V0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0428g extends AbstractC0806y implements W {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final C0428g DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile f0 PARSER;
    private int bitField0_;
    private C0427f bits_;
    private int hashCount_;

    /* JADX INFO: renamed from: V0.g$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2964a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2964a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2964a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2964a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2964a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2964a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2964a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2964a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: V0.g$b */
    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(C0428g.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        C0428g c0428g = new C0428g();
        DEFAULT_INSTANCE = c0428g;
        AbstractC0806y.V(C0428g.class, c0428g);
    }

    private C0428g() {
    }

    public static C0428g b0() {
        return DEFAULT_INSTANCE;
    }

    public C0427f a0() {
        C0427f c0427f = this.bits_;
        return c0427f == null ? C0427f.b0() : c0427f;
    }

    public int c0() {
        return this.hashCount_;
    }

    public boolean d0() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2964a[dVar.ordinal()]) {
            case 1:
                return new C0428g();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "bits_", "hashCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0428g.class) {
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
