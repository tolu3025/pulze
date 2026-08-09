package F0;

import V0.u;
import com.google.firebase.firestore.V0;
import com.google.protobuf.AbstractC0806y;
import kotlin.jvm.internal.AbstractC1007a;

/* JADX INFO: renamed from: F0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0299c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1468d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC0315t[] f1470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B f1471c;

    /* JADX INFO: renamed from: F0.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final C0299c a(AbstractC0315t expression) {
            kotlin.jvm.internal.m.e(expression, "expression");
            return new C0299c("average", expression, (kotlin.jvm.internal.h) null);
        }

        public final C0299c b(AbstractC0315t expression) {
            kotlin.jvm.internal.m.e(expression, "expression");
            return new C0299c("count", expression, (kotlin.jvm.internal.h) null);
        }

        public final C0299c c() {
            return new C0299c("count", (kotlin.jvm.internal.h) null);
        }

        public final C0299c d(AbstractC0315t expression) {
            kotlin.jvm.internal.m.e(expression, "expression");
            return new C0299c("count_distinct", expression, (kotlin.jvm.internal.h) null);
        }

        public final C0299c e(AbstractC0315t expression) {
            kotlin.jvm.internal.m.e(expression, "expression");
            return new C0299c("maximum", expression, (kotlin.jvm.internal.h) null);
        }

        public final C0299c f(AbstractC0315t expression) {
            kotlin.jvm.internal.m.e(expression, "expression");
            return new C0299c("minimum", expression, (kotlin.jvm.internal.h) null);
        }

        public final C0299c g(AbstractC0315t expression) {
            kotlin.jvm.internal.m.e(expression, "expression");
            return new C0299c("sum", expression, (kotlin.jvm.internal.h) null);
        }
    }

    /* JADX INFO: renamed from: F0.c$b */
    /* synthetic */ class b extends AbstractC1007a implements U1.p {
        b(Object obj) {
            super(2, obj, u.b.class, "putOptions", "putOptions(Ljava/lang/String;Lcom/google/firestore/v1/Value;)Lcom/google/firestore/v1/Function$Builder;", 8);
        }

        public final void b(String str, V0.I i3) {
            ((u.b) this.f9727a).x(str, i3);
        }

        @Override // U1.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (V0.I) obj2);
            return I1.u.f2419a;
        }
    }

    private C0299c(String str) {
        this(str, new AbstractC0315t[0], null, 4, null);
    }

    public static final C0299c b(AbstractC0315t abstractC0315t) {
        return f1468d.a(abstractC0315t);
    }

    public static final C0299c c(AbstractC0315t abstractC0315t) {
        return f1468d.b(abstractC0315t);
    }

    public static final C0299c d() {
        return f1468d.c();
    }

    public static final C0299c e(AbstractC0315t abstractC0315t) {
        return f1468d.d(abstractC0315t);
    }

    public static final C0299c f(AbstractC0315t abstractC0315t) {
        return f1468d.e(abstractC0315t);
    }

    public static final C0299c g(AbstractC0315t abstractC0315t) {
        return f1468d.f(abstractC0315t);
    }

    public static final C0299c h(AbstractC0315t abstractC0315t) {
        return f1468d.g(abstractC0315t);
    }

    public final C0302f a(String alias) {
        kotlin.jvm.internal.m.e(alias, "alias");
        return new C0302f(alias, this);
    }

    public final V0.I i(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        u.b bVarK0 = V0.u.k0();
        bVarK0.y(this.f1469a);
        for (AbstractC0315t abstractC0315t : this.f1470b) {
            bVarK0.w(abstractC0315t.w0(userDataReader));
        }
        this.f1471c.a(new b(bVarK0));
        AbstractC0806y abstractC0806yN = V0.I.J0().D(bVarK0).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (V0.I) abstractC0806yN;
    }

    private C0299c(String str, AbstractC0315t abstractC0315t) {
        this(str, new AbstractC0315t[]{abstractC0315t}, null, 4, null);
    }

    public /* synthetic */ C0299c(String str, AbstractC0315t abstractC0315t, kotlin.jvm.internal.h hVar) {
        this(str, abstractC0315t);
    }

    public /* synthetic */ C0299c(String str, kotlin.jvm.internal.h hVar) {
        this(str);
    }

    private C0299c(String str, AbstractC0315t[] abstractC0315tArr, B b3) {
        this.f1469a = str;
        this.f1470b = abstractC0315tArr;
        this.f1471c = b3;
    }

    /* synthetic */ C0299c(String str, AbstractC0315t[] abstractC0315tArr, B b3, int i3, kotlin.jvm.internal.h hVar) {
        this(str, abstractC0315tArr, (i3 & 4) != 0 ? B.f1420c : b3);
    }
}
