package y1;

import e0.AbstractC0829j;
import y1.C1298a;
import y1.S;

/* JADX INFO: renamed from: y1.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1295G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1298a.c f11791a = C1298a.c.a("internal:io.grpc.config-selector");

    /* JADX INFO: renamed from: y1.G$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l0 f11792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f11793b;

        /* JADX INFO: renamed from: y1.G$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Object f11794a;

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b a() {
                AbstractC0829j.u(this.f11794a != null, "config is not set");
                return new b(l0.f11960e, this.f11794a, null);
            }

            public a b(Object obj) {
                this.f11794a = AbstractC0829j.o(obj, "config");
                return this;
            }
        }

        private b(l0 l0Var, Object obj, InterfaceC1305h interfaceC1305h) {
            this.f11792a = (l0) AbstractC0829j.o(l0Var, "status");
            this.f11793b = obj;
        }

        public static a d() {
            return new a();
        }

        public Object a() {
            return this.f11793b;
        }

        public InterfaceC1305h b() {
            return null;
        }

        public l0 c() {
            return this.f11792a;
        }
    }

    public abstract b a(S.g gVar);
}
