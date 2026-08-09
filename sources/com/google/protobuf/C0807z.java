package com.google.protobuf;

import com.google.protobuf.AbstractC0806y;

/* JADX INFO: renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0807z extends AbstractC0806y implements W {
    private static final C0807z DEFAULT_INSTANCE;
    private static volatile f0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* JADX INFO: renamed from: com.google.protobuf.z$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7004a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f7004a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7004a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7004a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7004a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7004a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7004a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7004a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.z$b */
    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(C0807z.DEFAULT_INSTANCE);
        }

        public b w(int i3) {
            q();
            ((C0807z) this.f6988b).e0(i3);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        C0807z c0807z = new C0807z();
        DEFAULT_INSTANCE = c0807z;
        AbstractC0806y.V(C0807z.class, c0807z);
    }

    private C0807z() {
    }

    public static C0807z b0() {
        return DEFAULT_INSTANCE;
    }

    public static b d0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int i3) {
        this.value_ = i3;
    }

    public int c0() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f7004a[dVar.ordinal()]) {
            case 1:
                return new C0807z();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0807z.class) {
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
