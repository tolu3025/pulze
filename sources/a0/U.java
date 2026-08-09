package A0;

import A0.C0218p;
import J0.AbstractC0386b;

/* JADX INFO: loaded from: classes.dex */
public class U extends C0218p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D0.l f91d;

    U(D0.r rVar, C0218p.b bVar, V0.I i3) {
        super(rVar, bVar, i3);
        AbstractC0386b.d(D0.z.Y(i3), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.f91d = D0.l.i(h().y0());
    }

    @Override // A0.C0218p, A0.AbstractC0219q
    public boolean d(D0.i iVar) {
        return j(iVar.getKey().compareTo(this.f91d));
    }
}
