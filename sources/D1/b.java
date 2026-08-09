package D1;

import B1.e;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D1.a f1344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f1345b;

    /* JADX INFO: renamed from: D1.b$b, reason: collision with other inner class name */
    public static class C0009b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private D1.a f1346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e.b f1347b = new e.b();

        public b c() {
            if (this.f1346a != null) {
                return new b(this);
            }
            throw new IllegalStateException("url == null");
        }

        public C0009b d(String str, String str2) {
            this.f1347b.f(str, str2);
            return this;
        }

        public C0009b e(D1.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f1346a = aVar;
            return this;
        }
    }

    private b(C0009b c0009b) {
        this.f1344a = c0009b.f1346a;
        this.f1345b = c0009b.f1347b.c();
    }

    public e a() {
        return this.f1345b;
    }

    public D1.a b() {
        return this.f1344a;
    }

    public String toString() {
        return "Request{url=" + this.f1344a + '}';
    }
}
