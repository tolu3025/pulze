package l1;

import b1.AbstractC0525b;
import java.nio.ByteBuffer;
import l1.InterfaceC1017c;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1017c f9780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f9782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1017c.InterfaceC0146c f9783d;

    private final class a implements InterfaceC1017c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f9784a;

        /* JADX INFO: renamed from: l1.k$a$a, reason: collision with other inner class name */
        class C0148a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC1017c.b f9786a;

            C0148a(InterfaceC1017c.b bVar) {
                this.f9786a = bVar;
            }

            @Override // l1.k.d
            public void a(Object obj) {
                this.f9786a.a(k.this.f9782c.a(obj));
            }

            @Override // l1.k.d
            public void b(String str, String str2, Object obj) {
                this.f9786a.a(k.this.f9782c.c(str, str2, obj));
            }

            @Override // l1.k.d
            public void c() {
                this.f9786a.a(null);
            }
        }

        a(c cVar) {
            this.f9784a = cVar;
        }

        @Override // l1.InterfaceC1017c.a
        public void a(ByteBuffer byteBuffer, InterfaceC1017c.b bVar) {
            try {
                this.f9784a.a(k.this.f9782c.e(byteBuffer), new C0148a(bVar));
            } catch (RuntimeException e3) {
                AbstractC0525b.c("MethodChannel#" + k.this.f9781b, "Failed to handle method call", e3);
                bVar.a(k.this.f9782c.b("error", e3.getMessage(), null, AbstractC0525b.d(e3)));
            }
        }
    }

    private final class b implements InterfaceC1017c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f9788a;

        b(d dVar) {
            this.f9788a = dVar;
        }

        @Override // l1.InterfaceC1017c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f9788a.c();
                } else {
                    try {
                        this.f9788a.a(k.this.f9782c.f(byteBuffer));
                    } catch (e e3) {
                        this.f9788a.b(e3.f9774a, e3.getMessage(), e3.f9775b);
                    }
                }
            } catch (RuntimeException e4) {
                AbstractC0525b.c("MethodChannel#" + k.this.f9781b, "Failed to handle method call result", e4);
            }
        }
    }

    public interface c {
        void a(j jVar, d dVar);
    }

    public interface d {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public k(InterfaceC1017c interfaceC1017c, String str) {
        this(interfaceC1017c, str, p.f9793b);
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f9780a.c(this.f9781b, this.f9782c.d(new j(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        if (this.f9783d != null) {
            this.f9780a.h(this.f9781b, cVar != null ? new a(cVar) : null, this.f9783d);
        } else {
            this.f9780a.b(this.f9781b, cVar != null ? new a(cVar) : null);
        }
    }

    public k(InterfaceC1017c interfaceC1017c, String str, l lVar) {
        this(interfaceC1017c, str, lVar, null);
    }

    public k(InterfaceC1017c interfaceC1017c, String str, l lVar, InterfaceC1017c.InterfaceC0146c interfaceC0146c) {
        this.f9780a = interfaceC1017c;
        this.f9781b = str;
        this.f9782c = lVar;
        this.f9783d = interfaceC0146c;
    }
}
