package s;

import androidx.datastore.preferences.protobuf.AbstractC0492f;
import androidx.datastore.preferences.protobuf.AbstractC0505t;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;
import s.g;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0505t implements K {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile S PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC0505t.a implements K {
        private a() {
            super(h.DEFAULT_INSTANCE);
        }

        public a q(boolean z2) {
            l();
            ((h) this.f4269b).i0(z2);
            return this;
        }

        public a r(AbstractC0492f abstractC0492f) {
            l();
            ((h) this.f4269b).j0(abstractC0492f);
            return this;
        }

        public a s(double d3) {
            l();
            ((h) this.f4269b).k0(d3);
            return this;
        }

        public a t(float f3) {
            l();
            ((h) this.f4269b).l0(f3);
            return this;
        }

        public a u(int i3) {
            l();
            ((h) this.f4269b).m0(i3);
            return this;
        }

        public a v(long j3) {
            l();
            ((h) this.f4269b).n0(j3);
            return this;
        }

        public a w(String str) {
            l();
            ((h) this.f4269b).o0(str);
            return this;
        }

        public a x(g.a aVar) {
            l();
            ((h) this.f4269b).p0((g) aVar.i());
            return this;
        }

        /* synthetic */ a(e eVar) {
            this();
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11236a;

        b(int i3) {
            this.f11236a = i3;
        }

        public static b e(int i3) {
            switch (i3) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0505t.L(h.class, hVar);
    }

    private h() {
    }

    public static h Z() {
        return DEFAULT_INSTANCE;
    }

    public static a h0() {
        return (a) DEFAULT_INSTANCE.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(boolean z2) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(AbstractC0492f abstractC0492f) {
        abstractC0492f.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC0492f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(double d3) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(float f3) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(int i3) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(long j3) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    public boolean X() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public AbstractC0492f Y() {
        return this.valueCase_ == 8 ? (AbstractC0492f) this.value_ : AbstractC0492f.f4066b;
    }

    public double a0() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float b0() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int c0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long d0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String e0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g f0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.S();
    }

    public b g0() {
        return b.e(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0505t
    protected final Object s(AbstractC0505t.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f11224a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0505t.H(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                S bVar = PARSER;
                if (bVar == null) {
                    synchronized (h.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC0505t.b(DEFAULT_INSTANCE);
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
