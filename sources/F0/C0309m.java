package F0;

import com.google.firebase.firestore.V0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: F0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0309m extends O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f1483d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0309m(String collectionId, C0308l options) {
        this(collectionId, options.a());
        kotlin.jvm.internal.m.e(collectionId, "collectionId");
        kotlin.jvm.internal.m.e(options, "options");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.f(V0.I.J0().K("").n(), D0.z.G(this.f1483d));
    }

    @Override // F0.O
    public String b() {
        return d() + '(' + this.f1483d + ')';
    }

    @Override // F0.O
    public List c(G0.Q context, List inputs) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(inputs, "inputs");
        ArrayList arrayList = new ArrayList();
        for (Object obj : inputs) {
            D0.s sVar = (D0.s) obj;
            if (sVar.d() && kotlin.jvm.internal.m.a(sVar.getKey().m(), this.f1483d)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0309m)) {
            return false;
        }
        C0309m c0309m = (C0309m) obj;
        return kotlin.jvm.internal.m.a(this.f1483d, c0309m.f1483d) && kotlin.jvm.internal.m.a(e(), c0309m.e());
    }

    public final String g() {
        return this.f1483d;
    }

    public int hashCode() {
        return (this.f1483d.hashCode() * 31) + e().hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0309m(String collectionId, B options) {
        super("collection_group", options, null);
        kotlin.jvm.internal.m.e(collectionId, "collectionId");
        kotlin.jvm.internal.m.e(options, "options");
        this.f1483d = collectionId;
    }
}
