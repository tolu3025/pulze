package s;

import androidx.datastore.preferences.protobuf.AbstractC0505t;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.k0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0505t implements K {
    private static final f DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private D preferences_ = D.d();

    public static final class a extends AbstractC0505t.a implements K {
        private a() {
            super(f.DEFAULT_INSTANCE);
        }

        public a q(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            l();
            ((f) this.f4269b).Q().put(str, hVar);
            return this;
        }

        /* synthetic */ a(e eVar) {
            this();
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C f11225a = C.d(k0.b.f4159p, "", k0.b.f4161r, h.Z());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0505t.L(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map Q() {
        return S();
    }

    private D S() {
        if (!this.preferences_.i()) {
            this.preferences_ = this.preferences_.l();
        }
        return this.preferences_;
    }

    private D T() {
        return this.preferences_;
    }

    public static a U() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static f V(InputStream inputStream) {
        return (f) AbstractC0505t.J(DEFAULT_INSTANCE, inputStream);
    }

    public Map R() {
        return Collections.unmodifiableMap(T());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0505t
    protected final Object s(AbstractC0505t.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f11224a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0505t.H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f11225a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                S bVar = PARSER;
                if (bVar == null) {
                    synchronized (f.class) {
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
