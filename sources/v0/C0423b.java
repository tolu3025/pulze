package V0;

import com.google.protobuf.AbstractC0780a;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.f0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: V0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0423b extends AbstractC0806y implements InterfaceC0424c {
    private static final C0423b DEFAULT_INSTANCE;
    private static volatile f0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private C.e values_ = AbstractC0806y.A();

    /* JADX INFO: renamed from: V0.b$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2955a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2955a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2955a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2955a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2955a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2955a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2955a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2955a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: V0.b$b, reason: collision with other inner class name */
    public static final class C0068b extends AbstractC0806y.a implements InterfaceC0424c {
        private C0068b() {
            super(C0423b.DEFAULT_INSTANCE);
        }

        public C0068b A(int i3) {
            q();
            ((C0423b) this.f6988b).k0(i3);
            return this;
        }

        @Override // V0.InterfaceC0424c
        public List g() {
            return Collections.unmodifiableList(((C0423b) this.f6988b).g());
        }

        public C0068b w(Iterable iterable) {
            q();
            ((C0423b) this.f6988b).d0(iterable);
            return this;
        }

        public C0068b x(I i3) {
            q();
            ((C0423b) this.f6988b).e0(i3);
            return this;
        }

        public I y(int i3) {
            return ((C0423b) this.f6988b).h0(i3);
        }

        public int z() {
            return ((C0423b) this.f6988b).i0();
        }

        /* synthetic */ C0068b(a aVar) {
            this();
        }
    }

    static {
        C0423b c0423b = new C0423b();
        DEFAULT_INSTANCE = c0423b;
        AbstractC0806y.V(C0423b.class, c0423b);
    }

    private C0423b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(Iterable iterable) {
        f0();
        AbstractC0780a.k(iterable, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(I i3) {
        i3.getClass();
        f0();
        this.values_.add(i3);
    }

    private void f0() {
        C.e eVar = this.values_;
        if (eVar.g()) {
            return;
        }
        this.values_ = AbstractC0806y.L(eVar);
    }

    public static C0423b g0() {
        return DEFAULT_INSTANCE;
    }

    public static C0068b j0() {
        return (C0068b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(int i3) {
        f0();
        this.values_.remove(i3);
    }

    @Override // V0.InterfaceC0424c
    public List g() {
        return this.values_;
    }

    public I h0(int i3) {
        return (I) this.values_.get(i3);
    }

    public int i0() {
        return this.values_.size();
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2955a[dVar.ordinal()]) {
            case 1:
                return new C0423b();
            case 2:
                return new C0068b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", I.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0423b.class) {
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
