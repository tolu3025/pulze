package y1;

import c.AbstractC0527b;
import e0.AbstractC0829j;
import java.util.Iterator;
import java.util.List;
import y1.AbstractC1304g;

/* JADX INFO: renamed from: y1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1307j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1304g f11948a = new a();

    /* JADX INFO: renamed from: y1.j$b */
    private static class b extends AbstractC1301d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1301d f11949a;

        private b(AbstractC1301d abstractC1301d, InterfaceC1305h interfaceC1305h) {
            this.f11949a = abstractC1301d;
            AbstractC0527b.a(AbstractC0829j.o(interfaceC1305h, "interceptor"));
        }

        @Override // y1.AbstractC1301d
        public String a() {
            return this.f11949a.a();
        }

        @Override // y1.AbstractC1301d
        public AbstractC1304g e(a0 a0Var, C1300c c1300c) {
            throw null;
        }

        /* synthetic */ b(AbstractC1301d abstractC1301d, InterfaceC1305h interfaceC1305h, AbstractC1306i abstractC1306i) {
            this(abstractC1301d, interfaceC1305h);
        }
    }

    public static AbstractC1301d a(AbstractC1301d abstractC1301d, List list) {
        AbstractC0829j.o(abstractC1301d, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0527b.a(it.next());
            AbstractC1306i abstractC1306i = null;
            abstractC1301d = new b(abstractC1301d, abstractC1306i, abstractC1306i);
        }
        return abstractC1301d;
    }

    /* JADX INFO: renamed from: y1.j$a */
    class a extends AbstractC1304g {
        a() {
        }

        @Override // y1.AbstractC1304g
        public void c(int i3) {
        }

        @Override // y1.AbstractC1304g
        public void d(Object obj) {
        }

        @Override // y1.AbstractC1304g
        public void b() {
        }

        @Override // y1.AbstractC1304g
        public void a(String str, Throwable th) {
        }

        @Override // y1.AbstractC1304g
        public void e(AbstractC1304g.a aVar, Z z2) {
        }
    }
}
