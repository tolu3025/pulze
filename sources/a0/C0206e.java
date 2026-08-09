package A0;

import A0.C0218p;
import J0.AbstractC0386b;
import java.util.Iterator;

/* JADX INFO: renamed from: A0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0206e extends C0218p {
    C0206e(D0.r rVar, V0.I i3) {
        super(rVar, C0218p.b.ARRAY_CONTAINS_ANY, i3);
        AbstractC0386b.d(D0.z.Q(i3), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    @Override // A0.C0218p, A0.AbstractC0219q
    public boolean d(D0.i iVar) {
        V0.I iE = iVar.e(f());
        if (!D0.z.Q(iE)) {
            return false;
        }
        Iterator it = iE.o0().g().iterator();
        while (it.hasNext()) {
            if (D0.z.s(h().o0(), (V0.I) it.next())) {
                return true;
            }
        }
        return false;
    }
}
