package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import com.google.protobuf.t0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0806y implements W {
    private static final o DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private t0 readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private String document_ = "";
    private C.d removedTargetIds_ = AbstractC0806y.z();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2973a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2973a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2973a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2973a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2973a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2973a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2973a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2973a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(o.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        AbstractC0806y.V(o.class, oVar);
    }

    private o() {
    }

    public static o a0() {
        return DEFAULT_INSTANCE;
    }

    public String b0() {
        return this.document_;
    }

    public List c0() {
        return this.removedTargetIds_;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2973a[dVar.ordinal()]) {
            case 1:
                return new o();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0002'\u0004ဉ\u0000", new Object[]{"bitField0_", "document_", "removedTargetIds_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (o.class) {
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
