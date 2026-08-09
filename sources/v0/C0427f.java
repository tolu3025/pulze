package V0;

import com.google.protobuf.AbstractC0791i;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.W;
import com.google.protobuf.f0;

/* JADX INFO: renamed from: V0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0427f extends AbstractC0806y implements W {
    public static final int BITMAP_FIELD_NUMBER = 1;
    private static final C0427f DEFAULT_INSTANCE;
    public static final int PADDING_FIELD_NUMBER = 2;
    private static volatile f0 PARSER;
    private AbstractC0791i bitmap_ = AbstractC0791i.f6770b;
    private int padding_;

    /* JADX INFO: renamed from: V0.f$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2963a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2963a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2963a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2963a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2963a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2963a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2963a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2963a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: V0.f$b */
    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(C0427f.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        C0427f c0427f = new C0427f();
        DEFAULT_INSTANCE = c0427f;
        AbstractC0806y.V(C0427f.class, c0427f);
    }

    private C0427f() {
    }

    public static C0427f b0() {
        return DEFAULT_INSTANCE;
    }

    public AbstractC0791i a0() {
        return this.bitmap_;
    }

    public int c0() {
        return this.padding_;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2963a[dVar.ordinal()]) {
            case 1:
                return new C0427f();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"bitmap_", "padding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0427f.class) {
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
