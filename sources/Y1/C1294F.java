package y1;

import e0.AbstractC0825f;
import e0.AbstractC0826g;
import e0.AbstractC0829j;

/* JADX INFO: renamed from: y1.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1294F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f11777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P f11779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P f11780e;

    /* JADX INFO: renamed from: y1.F$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f11781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f11782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f11783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private P f11784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private P f11785e;

        public C1294F a() {
            AbstractC0829j.o(this.f11781a, "description");
            AbstractC0829j.o(this.f11782b, "severity");
            AbstractC0829j.o(this.f11783c, "timestampNanos");
            AbstractC0829j.u(this.f11784d == null || this.f11785e == null, "at least one of channelRef and subchannelRef must be null");
            return new C1294F(this.f11781a, this.f11782b, this.f11783c.longValue(), this.f11784d, this.f11785e);
        }

        public a b(String str) {
            this.f11781a = str;
            return this;
        }

        public a c(b bVar) {
            this.f11782b = bVar;
            return this;
        }

        public a d(P p2) {
            this.f11785e = p2;
            return this;
        }

        public a e(long j3) {
            this.f11783c = Long.valueOf(j3);
            return this;
        }
    }

    /* JADX INFO: renamed from: y1.F$b */
    public enum b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    private C1294F(String str, b bVar, long j3, P p2, P p3) {
        this.f11776a = str;
        this.f11777b = (b) AbstractC0829j.o(bVar, "severity");
        this.f11778c = j3;
        this.f11779d = p2;
        this.f11780e = p3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1294F)) {
            return false;
        }
        C1294F c1294f = (C1294F) obj;
        return AbstractC0826g.a(this.f11776a, c1294f.f11776a) && AbstractC0826g.a(this.f11777b, c1294f.f11777b) && this.f11778c == c1294f.f11778c && AbstractC0826g.a(this.f11779d, c1294f.f11779d) && AbstractC0826g.a(this.f11780e, c1294f.f11780e);
    }

    public int hashCode() {
        return AbstractC0826g.b(this.f11776a, this.f11777b, Long.valueOf(this.f11778c), this.f11779d, this.f11780e);
    }

    public String toString() {
        return AbstractC0825f.b(this).d("description", this.f11776a).d("severity", this.f11777b).c("timestampNanos", this.f11778c).d("channelRef", this.f11779d).d("subchannelRef", this.f11780e).toString();
    }
}
