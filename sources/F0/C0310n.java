package F0;

import com.google.firebase.firestore.V0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: F0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0310n extends O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D0.u f1484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I0.P f1485e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0310n(D0.u path, I0.P serializer, C0311o options) {
        this(path, serializer, options.a());
        kotlin.jvm.internal.m.e(path, "path");
        kotlin.jvm.internal.m.e(serializer, "serializer");
        kotlin.jvm.internal.m.e(options, "options");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.f(V0.I.J0().K('/' + this.f1484d.n()).n());
    }

    @Override // F0.O
    public String b() {
        return d() + '(' + this.f1484d.n() + ')';
    }

    @Override // F0.O
    public List c(G0.Q context, List inputs) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(inputs, "inputs");
        ArrayList arrayList = new ArrayList();
        for (Object obj : inputs) {
            D0.s sVar = (D0.s) obj;
            if (sVar.d() && kotlin.jvm.internal.m.a(sVar.getKey().n(), this.f1484d)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0310n)) {
            return false;
        }
        C0310n c0310n = (C0310n) obj;
        return kotlin.jvm.internal.m.a(this.f1484d, c0310n.f1484d) && kotlin.jvm.internal.m.a(this.f1485e.a(), c0310n.f1485e.a()) && kotlin.jvm.internal.m.a(e(), c0310n.e());
    }

    public final D0.u g() {
        return this.f1484d;
    }

    public int hashCode() {
        return (((this.f1484d.hashCode() * 31) + this.f1485e.a().hashCode()) * 31) + e().hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0310n(D0.u path, I0.P serializer, B options) {
        super("collection", options, null);
        kotlin.jvm.internal.m.e(path, "path");
        kotlin.jvm.internal.m.e(serializer, "serializer");
        kotlin.jvm.internal.m.e(options, "options");
        this.f1484d = path;
        this.f1485e = serializer;
    }
}
