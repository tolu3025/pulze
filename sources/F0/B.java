package F0;

import f0.AbstractC0852k;
import f0.AbstractC0853l;
import f0.AbstractC0867z;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1419b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B f1420c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0852k f1421a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    static {
        AbstractC0852k abstractC0852kJ = AbstractC0852k.j();
        kotlin.jvm.internal.m.d(abstractC0852kJ, "of(...)");
        f1420c = new B(abstractC0852kJ);
    }

    public B(AbstractC0852k options) {
        kotlin.jvm.internal.m.e(options, "options");
        this.f1421a = options;
    }

    public final void a(U1.p f3) {
        kotlin.jvm.internal.m.e(f3, "f");
        AbstractC0867z it = ((AbstractC0853l) this.f1421a.entrySet()).iterator();
        kotlin.jvm.internal.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            kotlin.jvm.internal.m.d(key, "<get-key>(...)");
            Object value = entry.getValue();
            kotlin.jvm.internal.m.d(value, "<get-value>(...)");
            f3.invoke(key, value);
        }
    }

    public final B b(String key, V0.I value) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        AbstractC0852k.a aVarA = AbstractC0852k.a(this.f1421a.size() + 1);
        aVarA.j(this.f1421a);
        aVarA.g(key, value);
        AbstractC0852k abstractC0852kC = aVarA.c();
        kotlin.jvm.internal.m.d(abstractC0852kC, "buildKeepingLast(...)");
        return new B(abstractC0852kC);
    }
}
