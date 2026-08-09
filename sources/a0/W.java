package A0;

import A0.C0218p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class W extends C0218p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f93d;

    /* JADX WARN: Illegal instructions before constructor call */
    W(D0.r rVar, V0.I i3) {
        C0218p.b bVar = C0218p.b.NOT_IN;
        super(rVar, bVar, i3);
        ArrayList arrayList = new ArrayList();
        this.f93d = arrayList;
        arrayList.addAll(V.k(bVar, i3));
    }

    @Override // A0.C0218p, A0.AbstractC0219q
    public boolean d(D0.i iVar) {
        return !this.f93d.contains(iVar.getKey());
    }
}
