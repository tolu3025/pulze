package A0;

import A0.C0218p;
import J0.AbstractC0386b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class V extends C0218p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f92d;

    /* JADX WARN: Illegal instructions before constructor call */
    V(D0.r rVar, V0.I i3) {
        C0218p.b bVar = C0218p.b.IN;
        super(rVar, bVar, i3);
        ArrayList arrayList = new ArrayList();
        this.f92d = arrayList;
        arrayList.addAll(k(bVar, i3));
    }

    static List k(C0218p.b bVar, V0.I i3) {
        AbstractC0386b.d(bVar == C0218p.b.IN || bVar == C0218p.b.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        AbstractC0386b.d(D0.z.Q(i3), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (V0.I i4 : i3.o0().g()) {
            AbstractC0386b.d(D0.z.Y(i4), "Comparing on key with " + bVar.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(D0.l.i(i4.y0()));
        }
        return arrayList;
    }

    @Override // A0.C0218p, A0.AbstractC0219q
    public boolean d(D0.i iVar) {
        return this.f92d.contains(iVar.getKey());
    }
}
