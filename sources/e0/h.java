package E0;

import D0.w;
import J0.AbstractC0386b;
import com.google.protobuf.AbstractC0791i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f1394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f1395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f1396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC0791i f1397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t0.c f1398e;

    private h(g gVar, w wVar, List list, AbstractC0791i abstractC0791i, t0.c cVar) {
        this.f1394a = gVar;
        this.f1395b = wVar;
        this.f1396c = list;
        this.f1397d = abstractC0791i;
        this.f1398e = cVar;
    }

    public static h a(g gVar, w wVar, List list, AbstractC0791i abstractC0791i) {
        AbstractC0386b.d(gVar.h().size() == list.size(), "Mutations sent %d must equal results received %d", Integer.valueOf(gVar.h().size()), Integer.valueOf(list.size()));
        t0.c cVarC = D0.j.c();
        List listH = gVar.h();
        t0.c cVarM = cVarC;
        for (int i3 = 0; i3 < listH.size(); i3++) {
            cVarM = cVarM.m(((f) listH.get(i3)).g(), ((i) list.get(i3)).b());
        }
        return new h(gVar, wVar, list, abstractC0791i, cVarM);
    }

    public g b() {
        return this.f1394a;
    }

    public w c() {
        return this.f1395b;
    }

    public t0.c d() {
        return this.f1398e;
    }

    public List e() {
        return this.f1396c;
    }

    public AbstractC0791i f() {
        return this.f1397d;
    }
}
