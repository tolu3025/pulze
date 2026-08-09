package A0;

import com.google.firebase.firestore.J0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    public static final class a extends n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final J0 f227a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J0 pipeline) {
            super(null);
            kotlin.jvm.internal.m.e(pipeline, "pipeline");
            this.f227a = pipeline;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.m.a(this.f227a, ((a) obj).f227a);
        }

        public final J0 g() {
            return this.f227a;
        }

        public int hashCode() {
            return this.f227a.hashCode();
        }

        public String toString() {
            return "PipelineWrapper(pipeline=" + this.f227a + ')';
        }
    }

    public static final class b extends n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l0 f228a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0 target) {
            super(null);
            kotlin.jvm.internal.m.e(target, "target");
            this.f228a = target;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.m.a(this.f228a, ((b) obj).f228a);
        }

        public final l0 g() {
            return this.f228a;
        }

        public int hashCode() {
            return this.f228a.hashCode();
        }

        public String toString() {
            return "TargetWrapper(target=" + this.f228a + ')';
        }
    }

    private n0() {
    }

    public /* synthetic */ n0(kotlin.jvm.internal.h hVar) {
        this();
    }

    public final String a() {
        if (this instanceof a) {
            return ((a) this).g().c();
        }
        if (!(this instanceof b)) {
            throw new I1.k();
        }
        String strC = ((b) this).g().c();
        kotlin.jvm.internal.m.d(strC, "getCanonicalId(...)");
        return strC;
    }

    public final D0.u b() {
        String[] strArrE;
        if (this instanceof a) {
            a aVar = (a) this;
            if (AbstractC0207e0.f(aVar.g()) == EnumC0205d0.f122d && (strArrE = AbstractC0207e0.e(aVar.g())) != null && strArrE.length == 1) {
                return D0.u.B(strArrE[0]);
            }
            return null;
        }
        if (!(this instanceof b)) {
            throw new I1.k();
        }
        b bVar = (b) this;
        if (bVar.g().s()) {
            return bVar.g().n();
        }
        return null;
    }

    public final boolean c() {
        return this instanceof a;
    }

    public final boolean d() {
        return this instanceof b;
    }

    public final J0 e() {
        kotlin.jvm.internal.m.c(this, "null cannot be cast to non-null type com.google.firebase.firestore.core.TargetOrPipeline.PipelineWrapper");
        return ((a) this).g();
    }

    public final l0 f() {
        kotlin.jvm.internal.m.c(this, "null cannot be cast to non-null type com.google.firebase.firestore.core.TargetOrPipeline.TargetWrapper");
        return ((b) this).g();
    }
}
