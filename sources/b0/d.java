package B0;

import D0.q;
import com.google.protobuf.AbstractC0791i;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f543a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f544b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f545c = new b();

    class a extends B0.b {
        a() {
        }

        @Override // B0.b
        public void a(AbstractC0791i abstractC0791i) {
            d.this.f543a.h(abstractC0791i);
        }

        @Override // B0.b
        public void b(double d3) {
            d.this.f543a.j(d3);
        }

        @Override // B0.b
        public void c() {
            d.this.f543a.n();
        }

        @Override // B0.b
        public void d(long j3) {
            d.this.f543a.r(j3);
        }

        @Override // B0.b
        public void e(String str) {
            d.this.f543a.v(str);
        }
    }

    class b extends B0.b {
        b() {
        }

        @Override // B0.b
        public void a(AbstractC0791i abstractC0791i) {
            d.this.f543a.i(abstractC0791i);
        }

        @Override // B0.b
        public void b(double d3) {
            d.this.f543a.k(d3);
        }

        @Override // B0.b
        public void c() {
            d.this.f543a.o();
        }

        @Override // B0.b
        public void d(long j3) {
            d.this.f543a.s(j3);
        }

        @Override // B0.b
        public void e(String str) {
            d.this.f543a.w(str);
        }
    }

    public B0.b b(q.c.a aVar) {
        return aVar.equals(q.c.a.DESCENDING) ? this.f545c : this.f544b;
    }

    public byte[] c() {
        return this.f543a.a();
    }

    public void d(byte[] bArr) {
        this.f543a.c(bArr);
    }
}
