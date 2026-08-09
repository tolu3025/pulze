package F0;

import com.google.firebase.firestore.C0751s0;
import com.google.firebase.firestore.V0;
import com.google.protobuf.AbstractC0806y;

/* JADX INFO: loaded from: classes.dex */
final class F extends AbstractC0315t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0751s0 f1432c;

    static final class a implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1433a = new a();

        a() {
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(D0.s sVar) {
            kotlin.jvm.internal.m.e(sVar, "<unused var>");
            throw new I1.l("Pipeline evaluation not implemented");
        }
    }

    public F(C0751s0 pipeline) {
        kotlin.jvm.internal.m.e(pipeline, "pipeline");
        this.f1432c = pipeline;
    }

    @Override // F0.AbstractC0315t
    public U1.l S(G0.Q context) {
        kotlin.jvm.internal.m.e(context, "context");
        return a.f1433a;
    }

    public String toString() {
        return "Pipeline(...)";
    }

    @Override // F0.AbstractC0315t
    public V0.I w0(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        AbstractC0806y abstractC0806yN = V0.I.J0().J(this.f1432c.w(userDataReader)).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (V0.I) abstractC0806yN;
    }

    @Override // F0.AbstractC0315t
    public String x() {
        return "pipeline(${pipeline.hashCode()})";
    }
}
