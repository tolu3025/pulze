package l1;

import b1.AbstractC0525b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l1.InterfaceC1017c;

/* JADX INFO: renamed from: l1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1018d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1017c f9765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f9767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1017c.InterfaceC0146c f9768d;

    /* JADX INFO: renamed from: l1.d$b */
    public interface b {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    /* JADX INFO: renamed from: l1.d$c */
    private final class c implements InterfaceC1017c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0147d f9769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference f9770b = new AtomicReference(null);

        /* JADX INFO: renamed from: l1.d$c$a */
        private final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final AtomicBoolean f9772a;

            private a() {
                this.f9772a = new AtomicBoolean(false);
            }

            @Override // l1.C1018d.b
            public void a(Object obj) {
                if (this.f9772a.get() || c.this.f9770b.get() != this) {
                    return;
                }
                C1018d.this.f9765a.e(C1018d.this.f9766b, C1018d.this.f9767c.a(obj));
            }

            @Override // l1.C1018d.b
            public void b(String str, String str2, Object obj) {
                if (this.f9772a.get() || c.this.f9770b.get() != this) {
                    return;
                }
                C1018d.this.f9765a.e(C1018d.this.f9766b, C1018d.this.f9767c.c(str, str2, obj));
            }

            @Override // l1.C1018d.b
            public void c() {
                if (this.f9772a.getAndSet(true) || c.this.f9770b.get() != this) {
                    return;
                }
                C1018d.this.f9765a.e(C1018d.this.f9766b, null);
            }
        }

        c(InterfaceC0147d interfaceC0147d) {
            this.f9769a = interfaceC0147d;
        }

        private void c(Object obj, InterfaceC1017c.b bVar) {
            ByteBuffer byteBufferC;
            if (((b) this.f9770b.getAndSet(null)) != null) {
                try {
                    this.f9769a.b(obj);
                    bVar.a(C1018d.this.f9767c.a(null));
                    return;
                } catch (RuntimeException e3) {
                    AbstractC0525b.c("EventChannel#" + C1018d.this.f9766b, "Failed to close event stream", e3);
                    byteBufferC = C1018d.this.f9767c.c("error", e3.getMessage(), null);
                }
            } else {
                byteBufferC = C1018d.this.f9767c.c("error", "No active stream to cancel", null);
            }
            bVar.a(byteBufferC);
        }

        private void d(Object obj, InterfaceC1017c.b bVar) {
            a aVar = new a();
            if (((b) this.f9770b.getAndSet(aVar)) != null) {
                try {
                    this.f9769a.b(null);
                } catch (RuntimeException e3) {
                    AbstractC0525b.c("EventChannel#" + C1018d.this.f9766b, "Failed to close existing event stream", e3);
                }
            }
            try {
                this.f9769a.c(obj, aVar);
                bVar.a(C1018d.this.f9767c.a(null));
            } catch (RuntimeException e4) {
                this.f9770b.set(null);
                AbstractC0525b.c("EventChannel#" + C1018d.this.f9766b, "Failed to open event stream", e4);
                bVar.a(C1018d.this.f9767c.c("error", e4.getMessage(), null));
            }
        }

        @Override // l1.InterfaceC1017c.a
        public void a(ByteBuffer byteBuffer, InterfaceC1017c.b bVar) {
            j jVarE = C1018d.this.f9767c.e(byteBuffer);
            if (jVarE.f9778a.equals("listen")) {
                d(jVarE.f9779b, bVar);
            } else if (jVarE.f9778a.equals("cancel")) {
                c(jVarE.f9779b, bVar);
            } else {
                bVar.a(null);
            }
        }
    }

    /* JADX INFO: renamed from: l1.d$d, reason: collision with other inner class name */
    public interface InterfaceC0147d {
        void b(Object obj);

        void c(Object obj, b bVar);
    }

    public C1018d(InterfaceC1017c interfaceC1017c, String str) {
        this(interfaceC1017c, str, p.f9793b);
    }

    public void d(InterfaceC0147d interfaceC0147d) {
        if (this.f9768d != null) {
            this.f9765a.h(this.f9766b, interfaceC0147d != null ? new c(interfaceC0147d) : null, this.f9768d);
        } else {
            this.f9765a.b(this.f9766b, interfaceC0147d != null ? new c(interfaceC0147d) : null);
        }
    }

    public C1018d(InterfaceC1017c interfaceC1017c, String str, l lVar) {
        this(interfaceC1017c, str, lVar, null);
    }

    public C1018d(InterfaceC1017c interfaceC1017c, String str, l lVar, InterfaceC1017c.InterfaceC0146c interfaceC0146c) {
        this.f9765a = interfaceC1017c;
        this.f9766b = str;
        this.f9767c = lVar;
        this.f9768d = interfaceC0146c;
    }
}
