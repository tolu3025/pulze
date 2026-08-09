package F0;

import com.google.firebase.firestore.V0;

/* JADX INFO: loaded from: classes.dex */
public final class H extends O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC0315t f1436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f1437e;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0011a f1438b = new C0011a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final a f1439c = new a("full_replace");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final a f1440d = new a("merge_prefer_nest");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final a f1441e = new a("merge_prefer_parent");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V0.I f1442a;

        /* JADX INFO: renamed from: F0.H$a$a, reason: collision with other inner class name */
        public static final class C0011a {
            private C0011a() {
            }

            public /* synthetic */ C0011a(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final a a() {
                return a.f1439c;
            }
        }

        private a(V0.I i3) {
            this.f1442a = i3;
        }

        public final V0.I b() {
            return this.f1442a;
        }

        private a(String str) {
            this(D0.z.G(str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(AbstractC0315t mapValue, a mode, B options) {
        super("replace_with", options, null);
        kotlin.jvm.internal.m.e(mapValue, "mapValue");
        kotlin.jvm.internal.m.e(mode, "mode");
        kotlin.jvm.internal.m.e(options, "options");
        this.f1436d = mapValue;
        this.f1437e = mode;
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.f(this.f1436d.w0(userDataReader), this.f1437e.b());
    }

    @Override // F0.O
    public String b() {
        throw new I1.l("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h3 = (H) obj;
        return kotlin.jvm.internal.m.a(this.f1436d, h3.f1436d) && kotlin.jvm.internal.m.a(this.f1437e, h3.f1437e) && kotlin.jvm.internal.m.a(e(), h3.e());
    }

    public int hashCode() {
        return (((this.f1436d.hashCode() * 31) + this.f1437e.hashCode()) * 31) + e().hashCode();
    }

    public /* synthetic */ H(AbstractC0315t abstractC0315t, a aVar, B b3, int i3, kotlin.jvm.internal.h hVar) {
        this(abstractC0315t, aVar, (i3 & 4) != 0 ? B.f1420c : b3);
    }
}
