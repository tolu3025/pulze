package F0;

import com.google.firebase.firestore.V0;

/* JADX INFO: loaded from: classes.dex */
public final class y extends O {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f1504g = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC0315t f1505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC0315t f1506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f1507f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public static /* synthetic */ y c(a aVar, w wVar, double[] dArr, b bVar, x xVar, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                xVar = new x();
            }
            return aVar.a(wVar, dArr, bVar, xVar);
        }

        public final y a(w vectorField, double[] vectorValue, b distanceMeasure, x options) {
            kotlin.jvm.internal.m.e(vectorField, "vectorField");
            kotlin.jvm.internal.m.e(vectorValue, "vectorValue");
            kotlin.jvm.internal.m.e(distanceMeasure, "distanceMeasure");
            kotlin.jvm.internal.m.e(options, "options");
            return new y(vectorField, AbstractC0315t.f1490a.w0(vectorValue), distanceMeasure, options, null);
        }

        public final y b(String vectorField, AbstractC0315t vectorValue, b distanceMeasure, x options) {
            kotlin.jvm.internal.m.e(vectorField, "vectorField");
            kotlin.jvm.internal.m.e(vectorValue, "vectorValue");
            kotlin.jvm.internal.m.e(distanceMeasure, "distanceMeasure");
            kotlin.jvm.internal.m.e(options, "options");
            return new y(AbstractC0315t.f1490a.O(vectorField), vectorValue, distanceMeasure, options, null);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f1508b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f1509c = new b("euclidean");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f1510d = new b("cosine");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f1511e = new b("dot_product");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V0.I f1512a;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
                this();
            }
        }

        private b(V0.I i3) {
            this.f1512a = i3;
        }

        public final V0.I a() {
            return this.f1512a;
        }

        private b(String str) {
            this(D0.z.G(str));
        }
    }

    private y(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2, b bVar, x xVar) {
        this(abstractC0315t, abstractC0315t2, bVar, xVar.a());
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.f(this.f1505d.w0(userDataReader), this.f1506e.w0(userDataReader), this.f1507f.a());
    }

    @Override // F0.O
    public String b() {
        throw new I1.l("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.m.a(this.f1505d, yVar.f1505d) && kotlin.jvm.internal.m.a(this.f1506e, yVar.f1506e) && kotlin.jvm.internal.m.a(this.f1507f, yVar.f1507f) && kotlin.jvm.internal.m.a(e(), yVar.e());
    }

    public int hashCode() {
        return (((((this.f1505d.hashCode() * 31) + this.f1506e.hashCode()) * 31) + this.f1507f.hashCode()) * 31) + e().hashCode();
    }

    public /* synthetic */ y(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2, b bVar, x xVar, kotlin.jvm.internal.h hVar) {
        this(abstractC0315t, abstractC0315t2, bVar, xVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(AbstractC0315t property, AbstractC0315t vector, b distanceMeasure, B options) {
        super("find_nearest", options, null);
        kotlin.jvm.internal.m.e(property, "property");
        kotlin.jvm.internal.m.e(vector, "vector");
        kotlin.jvm.internal.m.e(distanceMeasure, "distanceMeasure");
        kotlin.jvm.internal.m.e(options, "options");
        this.f1505d = property;
        this.f1506e = vector;
        this.f1507f = distanceMeasure;
    }
}
