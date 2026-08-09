package F0;

import F0.E;
import com.google.firebase.firestore.V0;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map d(K[] kArr, V0 v02) {
        HashMap map = new HashMap();
        for (K k3 : kArr) {
            if (map.containsKey(k3.B0())) {
                throw new IllegalArgumentException("Duplicate alias: '" + k3.B0() + '\'');
            }
            map.put(k3.B0(), k3.w0(v02));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparator e(final G0.Q q2, final E[] eArr) {
        return new Comparator() { // from class: F0.P
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Q.f(eArr, q2, (D0.i) obj, (D0.i) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(E[] eArr, G0.Q q2, D0.i iVar, D0.i iVar2) {
        V0.I iF;
        V0.I iF2;
        for (E e3 : eArr) {
            AbstractC0315t abstractC0315tC = e3.c();
            U1.l lVarS = abstractC0315tC.S(q2);
            kotlin.jvm.internal.m.c(iVar, "null cannot be cast to non-null type com.google.firebase.firestore.model.MutableDocument");
            G0.M m3 = (G0.M) lVarS.invoke((D0.s) iVar);
            U1.l lVarS2 = abstractC0315tC.S(q2);
            kotlin.jvm.internal.m.c(iVar2, "null cannot be cast to non-null type com.google.firebase.firestore.model.MutableDocument");
            G0.M m4 = (G0.M) lVarS2.invoke((D0.s) iVar2);
            if (m3.g() || m3.i()) {
                iF = D0.z.f1310c;
            } else {
                iF = m3.f();
                kotlin.jvm.internal.m.b(iF);
            }
            if (m4.g() || m4.i()) {
                iF2 = D0.z.f1310c;
            } else {
                iF2 = m4.f();
                kotlin.jvm.internal.m.b(iF2);
            }
            int iJ = D0.z.j(iF, iF2);
            if (iJ != 0) {
                return e3.b() == E.b.f1427b ? iJ : -iJ;
            }
        }
        return 0;
    }
}
