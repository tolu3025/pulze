package s;

import androidx.datastore.preferences.protobuf.AbstractC0487a;
import androidx.datastore.preferences.protobuf.AbstractC0505t;
import androidx.datastore.preferences.protobuf.AbstractC0506u;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0505t implements K {
    private static final g DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC0506u.b strings_ = AbstractC0505t.t();

    public static final class a extends AbstractC0505t.a implements K {
        private a() {
            super(g.DEFAULT_INSTANCE);
        }

        public a q(Iterable iterable) {
            l();
            ((g) this.f4269b).Q(iterable);
            return this;
        }

        /* synthetic */ a(e eVar) {
            this();
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0505t.L(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(Iterable iterable) {
        R();
        AbstractC0487a.e(iterable, this.strings_);
    }

    private void R() {
        AbstractC0506u.b bVar = this.strings_;
        if (bVar.g()) {
            return;
        }
        this.strings_ = AbstractC0505t.F(bVar);
    }

    public static g S() {
        return DEFAULT_INSTANCE;
    }

    public static a U() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public List T() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0505t
    protected final Object s(AbstractC0505t.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f11224a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0505t.H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                S bVar = PARSER;
                if (bVar == null) {
                    synchronized (g.class) {
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
