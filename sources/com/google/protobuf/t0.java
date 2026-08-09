package com.google.protobuf;

import com.google.protobuf.AbstractC0806y;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends AbstractC0806y implements W {
    private static final t0 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile f0 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6904a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f6904a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6904a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6904a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6904a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6904a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6904a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6904a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(t0.DEFAULT_INSTANCE);
        }

        public b w(int i3) {
            q();
            ((t0) this.f6988b).g0(i3);
            return this;
        }

        public b x(long j3) {
            q();
            ((t0) this.f6988b).h0(j3);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        t0 t0Var = new t0();
        DEFAULT_INSTANCE = t0Var;
        AbstractC0806y.V(t0.class, t0Var);
    }

    private t0() {
    }

    public static t0 c0() {
        return DEFAULT_INSTANCE;
    }

    public static b f0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i3) {
        this.nanos_ = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(long j3) {
        this.seconds_ = j3;
    }

    public int d0() {
        return this.nanos_;
    }

    public long e0() {
        return this.seconds_;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f6904a[dVar.ordinal()]) {
            case 1:
                return new t0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (t0.class) {
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
