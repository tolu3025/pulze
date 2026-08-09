package F0;

import J1.AbstractC0407k;
import com.google.firebase.firestore.V0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: F0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0314s extends O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D0.u[] f1488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I1.g f1489e;

    /* JADX INFO: renamed from: F0.s$a */
    /* synthetic */ class a extends kotlin.jvm.internal.k implements U1.l {
        a(Object obj) {
            super(1, obj, D0.z.class, "encodeValue", "encodeValue(Lcom/google/firebase/firestore/model/ResourcePath;)Lcom/google/firestore/v1/Value;", 0);
        }

        @Override // U1.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final V0.I invoke(D0.u p02) {
            kotlin.jvm.internal.m.e(p02, "p0");
            return D0.z.y(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0314s(D0.u[] documents, B options) {
        super("documents", options, null);
        kotlin.jvm.internal.m.e(documents, "documents");
        kotlin.jvm.internal.m.e(options, "options");
        this.f1488d = documents;
        this.f1489e = I1.i.a(new U1.a() { // from class: F0.r
            @Override // U1.a
            public final Object invoke() {
                return C0314s.h(this.f1487a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashSet h(C0314s c0314s) {
        D0.u[] uVarArr = c0314s.f1488d;
        ArrayList arrayList = new ArrayList(uVarArr.length);
        for (D0.u uVar : uVarArr) {
            arrayList.add(uVar.n());
        }
        return J1.x.T(arrayList);
    }

    private final HashSet i() {
        return (HashSet) this.f1489e.getValue();
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.k.h(AbstractC0407k.n(this.f1488d), new a(D0.z.f1308a));
    }

    @Override // F0.O
    public String b() {
        return d() + '(' + J1.x.G(AbstractC0407k.R(this.f1488d), ",", null, null, 0, null, null, 62, null) + ')';
    }

    @Override // F0.O
    public List c(G0.Q context, List inputs) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(inputs, "inputs");
        ArrayList arrayList = new ArrayList();
        for (Object obj : inputs) {
            D0.s sVar = (D0.s) obj;
            if (sVar.d() && i().contains(sVar.getKey().p().n())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0314s)) {
            return false;
        }
        C0314s c0314s = (C0314s) obj;
        return Arrays.equals(this.f1488d, c0314s.f1488d) && kotlin.jvm.internal.m.a(e(), c0314s.e());
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f1488d) * 31) + e().hashCode();
    }

    public final D0.u[] j() {
        return this.f1488d;
    }

    public /* synthetic */ C0314s(D0.u[] uVarArr, B b3, int i3, kotlin.jvm.internal.h hVar) {
        this(uVarArr, (i3 & 2) != 0 ? B.f1420c : b3);
    }
}
