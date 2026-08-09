package V0;

import com.google.protobuf.AbstractC0780a;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import java.util.List;

/* JADX INFO: renamed from: V0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0431j extends AbstractC0806y implements W {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final C0431j DEFAULT_INSTANCE;
    private static volatile f0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private C.e values_ = AbstractC0806y.A();

    /* JADX INFO: renamed from: V0.j$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2967a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2967a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2967a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2967a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2967a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2967a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2967a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2967a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: V0.j$b */
    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(C0431j.DEFAULT_INSTANCE);
        }

        public b w(Iterable iterable) {
            q();
            ((C0431j) this.f6988b).c0(iterable);
            return this;
        }

        public b x(boolean z2) {
            q();
            ((C0431j) this.f6988b).h0(z2);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        C0431j c0431j = new C0431j();
        DEFAULT_INSTANCE = c0431j;
        AbstractC0806y.V(C0431j.class, c0431j);
    }

    private C0431j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(Iterable iterable) {
        d0();
        AbstractC0780a.k(iterable, this.values_);
    }

    private void d0() {
        C.e eVar = this.values_;
        if (eVar.g()) {
            return;
        }
        this.values_ = AbstractC0806y.L(eVar);
    }

    public static C0431j f0() {
        return DEFAULT_INSTANCE;
    }

    public static b g0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(boolean z2) {
        this.before_ = z2;
    }

    public boolean e0() {
        return this.before_;
    }

    public List g() {
        return this.values_;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2967a[dVar.ordinal()]) {
            case 1:
                return new C0431j();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", I.class, "before_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0431j.class) {
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
