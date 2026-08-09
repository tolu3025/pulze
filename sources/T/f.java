package t;

import J1.G;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11284a;

        public a(String name) {
            m.e(name, "name");
            this.f11284a = name;
        }

        public final String a() {
            return this.f11284a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return m.a(this.f11284a, ((a) obj).f11284a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11284a.hashCode();
        }

        public String toString() {
            return this.f11284a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final C1221c c() {
        return new C1221c(G.o(a()), false);
    }

    public final f d() {
        return new C1221c(G.o(a()), true);
    }
}
