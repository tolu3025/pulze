package z0;

import D0.l;
import D0.s;
import J0.C;
import com.google.firebase.firestore.C0726f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1326a f12073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f12074b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f12078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f12079g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f12075c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t0.c f12077e = D0.j.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f12076d = new HashMap();

    public d(InterfaceC1326a interfaceC1326a, e eVar) {
        this.f12073a = interfaceC1326a;
        this.f12074b = eVar;
    }

    private Map c() {
        HashMap map = new HashMap();
        Iterator it = this.f12075c.iterator();
        while (it.hasNext()) {
            map.put(((j) it.next()).b(), l.h());
        }
        for (h hVar : this.f12076d.values()) {
            for (String str : hVar.c()) {
                map.put(str, ((t0.e) map.get(str)).d(hVar.b()));
            }
        }
        return map;
    }

    public C0726f0 a(c cVar, long j3) {
        t0.c cVar2;
        l lVarB;
        s sVarW;
        C.a(!(cVar instanceof e), "Unexpected bundle metadata element.", new Object[0]);
        int size = this.f12077e.size();
        if (cVar instanceof j) {
            this.f12075c.add((j) cVar);
        } else if (cVar instanceof h) {
            h hVar = (h) cVar;
            this.f12076d.put(hVar.b(), hVar);
            this.f12079g = hVar;
            if (!hVar.a()) {
                cVar2 = this.f12077e;
                lVarB = hVar.b();
                sVarW = s.s(hVar.b(), hVar.d()).w(hVar.d());
                this.f12077e = cVar2.m(lVarB, sVarW);
                this.f12079g = null;
            }
        } else if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f12079g == null || !bVar.b().equals(this.f12079g.b())) {
                throw new IllegalArgumentException("The document being added does not match the stored metadata.");
            }
            cVar2 = this.f12077e;
            lVarB = bVar.b();
            sVarW = bVar.a().w(this.f12079g.d());
            this.f12077e = cVar2.m(lVarB, sVarW);
            this.f12079g = null;
        }
        this.f12078f += j3;
        if (size != this.f12077e.size()) {
            return new C0726f0(this.f12077e.size(), this.f12074b.e(), this.f12078f, this.f12074b.d(), null, C0726f0.a.RUNNING);
        }
        return null;
    }

    public t0.c b() {
        C.a(this.f12079g == null, "Bundled documents end with a document metadata element instead of a document.", new Object[0]);
        C.a(this.f12074b.a() != null, "Bundle ID must be set", new Object[0]);
        C.a(this.f12077e.size() == this.f12074b.e(), "Expected %s documents, but loaded %s.", Integer.valueOf(this.f12074b.e()), Integer.valueOf(this.f12077e.size()));
        t0.c cVarB = this.f12073a.b(this.f12077e, this.f12074b.a());
        Map mapC = c();
        for (j jVar : this.f12075c) {
            this.f12073a.c(jVar, (t0.e) mapC.get(jVar.b()));
        }
        this.f12073a.a(this.f12074b);
        return cVarB;
    }
}
