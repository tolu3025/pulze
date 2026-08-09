package y1;

import e0.AbstractC0825f;
import e0.AbstractC0829j;
import y1.C1300c;

/* JADX INFO: renamed from: y1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1308k extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1300c.C0193c f11950a = C1300c.C0193c.b("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED");

    /* JADX INFO: renamed from: y1.k$a */
    public static abstract class a {
        public abstract AbstractC1308k a(b bVar, Z z2);
    }

    /* JADX INFO: renamed from: y1.k$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1300c f11951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f11953c;

        /* JADX INFO: renamed from: y1.k$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private C1300c f11954a = C1300c.f11885k;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f11955b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f11956c;

            a() {
            }

            public b a() {
                return new b(this.f11954a, this.f11955b, this.f11956c);
            }

            public a b(C1300c c1300c) {
                this.f11954a = (C1300c) AbstractC0829j.o(c1300c, "callOptions cannot be null");
                return this;
            }

            public a c(boolean z2) {
                this.f11956c = z2;
                return this;
            }

            public a d(int i3) {
                this.f11955b = i3;
                return this;
            }
        }

        b(C1300c c1300c, int i3, boolean z2) {
            this.f11951a = (C1300c) AbstractC0829j.o(c1300c, "callOptions");
            this.f11952b = i3;
            this.f11953c = z2;
        }

        public static a a() {
            return new a();
        }

        public String toString() {
            return AbstractC0825f.b(this).d("callOptions", this.f11951a).b("previousAttempts", this.f11952b).e("isTransparentRetry", this.f11953c).toString();
        }
    }

    public void l(Z z2) {
    }

    public void j() {
    }

    public void k() {
    }

    public void m() {
    }

    public void n(C1298a c1298a, Z z2) {
    }
}
