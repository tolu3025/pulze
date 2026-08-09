package V0;

import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import java.util.List;

/* JADX INFO: renamed from: V0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0433l extends AbstractC0806y implements W {
    private static final C0433l DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile f0 PARSER = null;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private C0432k document_;
    private int targetIdsMemoizedSerializedSize = -1;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private C.d targetIds_ = AbstractC0806y.z();
    private C.d removedTargetIds_ = AbstractC0806y.z();

    /* JADX INFO: renamed from: V0.l$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2970a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2970a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2970a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2970a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2970a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2970a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2970a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2970a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: V0.l$b */
    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(C0433l.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        C0433l c0433l = new C0433l();
        DEFAULT_INSTANCE = c0433l;
        AbstractC0806y.V(C0433l.class, c0433l);
    }

    private C0433l() {
    }

    public static C0433l a0() {
        return DEFAULT_INSTANCE;
    }

    public C0432k b0() {
        C0432k c0432k = this.document_;
        return c0432k == null ? C0432k.e0() : c0432k;
    }

    public List c0() {
        return this.removedTargetIds_;
    }

    public List d0() {
        return this.targetIds_;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2970a[dVar.ordinal()]) {
            case 1:
                return new C0433l();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0005'\u0006'", new Object[]{"bitField0_", "document_", "targetIds_", "removedTargetIds_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0433l.class) {
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
