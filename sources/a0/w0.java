package A0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0 f299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f300b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f301c = new ArrayList();

    public w0(A0 a02) {
        this.f299a = a02;
    }

    void b(D0.r rVar) {
        this.f300b.add(rVar);
    }

    void c(D0.r rVar, E0.p pVar) {
        this.f301c.add(new E0.e(rVar, pVar));
    }

    public boolean d(D0.r rVar) {
        Iterator it = this.f300b.iterator();
        while (it.hasNext()) {
            if (rVar.v((D0.r) it.next())) {
                return true;
            }
        }
        Iterator it2 = this.f301c.iterator();
        while (it2.hasNext()) {
            if (rVar.v(((E0.e) it2.next()).a())) {
                return true;
            }
        }
        return false;
    }

    public List e() {
        return this.f301c;
    }

    public x0 f() {
        return new x0(this, D0.r.f1280e, false, null);
    }

    public y0 g(D0.t tVar) {
        return new y0(tVar, E0.d.b(this.f300b), Collections.unmodifiableList(this.f301c));
    }

    public y0 h(D0.t tVar, E0.d dVar) {
        ArrayList arrayList = new ArrayList();
        for (E0.e eVar : this.f301c) {
            if (dVar.a(eVar.a())) {
                arrayList.add(eVar);
            }
        }
        return new y0(tVar, dVar, Collections.unmodifiableList(arrayList));
    }

    public y0 i(D0.t tVar) {
        return new y0(tVar, null, Collections.unmodifiableList(this.f301c));
    }

    public z0 j(D0.t tVar) {
        return new z0(tVar, E0.d.b(this.f300b), Collections.unmodifiableList(this.f301c));
    }
}
