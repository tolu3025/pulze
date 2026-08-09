package F0;

import com.google.firebase.firestore.V0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class V extends O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC0315t f1465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(AbstractC0315t condition, B options) {
        super("where", options, null);
        kotlin.jvm.internal.m.e(condition, "condition");
        kotlin.jvm.internal.m.e(options, "options");
        this.f1465d = condition;
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.f(this.f1465d.w0(userDataReader));
    }

    @Override // F0.O
    public String b() {
        return d() + '(' + this.f1465d.x() + ')';
    }

    @Override // F0.O
    public List c(G0.Q context, List inputs) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(inputs, "inputs");
        U1.l lVarS = this.f1465d.S(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj : inputs) {
            V0.I iF = ((G0.M) lVarS.invoke((D0.s) obj)).f();
            if (iF != null && iF.p0()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v2 = (V) obj;
        return kotlin.jvm.internal.m.a(this.f1465d, v2.f1465d) && kotlin.jvm.internal.m.a(e(), v2.e());
    }

    public final AbstractC0315t g() {
        return this.f1465d;
    }

    public int hashCode() {
        return (this.f1465d.hashCode() * 31) + e().hashCode();
    }

    public /* synthetic */ V(AbstractC0315t abstractC0315t, B b3, int i3, kotlin.jvm.internal.h hVar) {
        this(abstractC0315t, (i3 & 2) != 0 ? B.f1420c : b3);
    }
}
