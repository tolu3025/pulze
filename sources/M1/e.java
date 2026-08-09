package M1;

import M1.g;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public interface e extends g.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f2704g = b.f2705a;

    public static final class a {
        public static g.b a(e eVar, g.c key) {
            m.e(key, "key");
            if (!(key instanceof M1.b)) {
                if (e.f2704g != key) {
                    return null;
                }
                m.c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
            M1.b bVar = (M1.b) key;
            if (!bVar.a(eVar.getKey())) {
                return null;
            }
            g.b bVarB = bVar.b(eVar);
            if (bVarB instanceof g.b) {
                return bVarB;
            }
            return null;
        }

        public static g b(e eVar, g.c key) {
            m.e(key, "key");
            if (!(key instanceof M1.b)) {
                return e.f2704g == key ? h.f2707a : eVar;
            }
            M1.b bVar = (M1.b) key;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f2707a;
        }
    }

    public static final class b implements g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f2705a = new b();

        private b() {
        }
    }

    void K(d dVar);

    d z(d dVar);
}
