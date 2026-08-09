package A0;

import A0.n0;
import com.google.firebase.firestore.J0;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    public static final class a extends h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final J0 f155a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J0 pipeline) {
            super(null);
            kotlin.jvm.internal.m.e(pipeline, "pipeline");
            this.f155a = pipeline;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.m.a(this.f155a, ((a) obj).f155a);
        }

        public int hashCode() {
            return this.f155a.hashCode();
        }

        public final J0 j() {
            return this.f155a;
        }

        @Override // A0.h0
        public String toString() {
            return "PipelineWrapper(pipeline=" + this.f155a + ')';
        }
    }

    public static final class b extends h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f0 f156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f0 query) {
            super(null);
            kotlin.jvm.internal.m.e(query, "query");
            this.f156a = query;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.m.a(this.f156a, ((b) obj).f156a);
        }

        public int hashCode() {
            return this.f156a.hashCode();
        }

        public final f0 j() {
            return this.f156a;
        }

        @Override // A0.h0
        public String toString() {
            return "QueryWrapper(query=" + this.f156a + ')';
        }
    }

    private h0() {
    }

    public /* synthetic */ h0(kotlin.jvm.internal.h hVar) {
        this();
    }

    public final Comparator a() {
        if (this instanceof a) {
            return ((a) this).j().e();
        }
        if (!(this instanceof b)) {
            throw new I1.k();
        }
        Comparator comparatorC = ((b) this).j().c();
        kotlin.jvm.internal.m.d(comparatorC, "comparator(...)");
        return comparatorC;
    }

    public final boolean b() {
        if (this instanceof a) {
            return ((a) this).j().o();
        }
        if (this instanceof b) {
            return ((b) this).j().p();
        }
        throw new I1.k();
    }

    public final boolean c() {
        return this instanceof a;
    }

    public final boolean d() {
        return this instanceof b;
    }

    public final boolean e(D0.i doc) {
        kotlin.jvm.internal.m.e(doc, "doc");
        if (this instanceof a) {
            return ((a) this).j().p(doc);
        }
        if (this instanceof b) {
            return ((b) this).j().u(doc);
        }
        throw new I1.k();
    }

    public final boolean f() {
        if (this instanceof a) {
            return ((a) this).j().q();
        }
        if (this instanceof b) {
            return ((b) this).j().v();
        }
        throw new I1.k();
    }

    public final J0 g() {
        kotlin.jvm.internal.m.c(this, "null cannot be cast to non-null type com.google.firebase.firestore.core.QueryOrPipeline.PipelineWrapper");
        return ((a) this).j();
    }

    public final f0 h() {
        kotlin.jvm.internal.m.c(this, "null cannot be cast to non-null type com.google.firebase.firestore.core.QueryOrPipeline.QueryWrapper");
        return ((b) this).j();
    }

    public final n0 i() {
        if (this instanceof a) {
            return new n0.a(((a) this).j());
        }
        if (!(this instanceof b)) {
            throw new I1.k();
        }
        l0 l0VarD = ((b) this).j().D();
        kotlin.jvm.internal.m.d(l0VarD, "toTarget(...)");
        return new n0.b(l0VarD);
    }

    public abstract String toString();
}
