package k1;

import b1.C0524a;
import c1.C0543a;
import d1.InterfaceC0814a;
import java.util.HashMap;
import java.util.Map;
import l1.k;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1.k f9494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f9495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final k.c f9496c;

    class a implements k.c {
        a() {
        }

        @Override // l1.k.c
        public void a(l1.j jVar, k.d dVar) {
            g.a(g.this);
        }
    }

    public g(C0543a c0543a) {
        a aVar = new a();
        this.f9496c = aVar;
        l1.k kVar = new l1.k(c0543a, "flutter/deferredcomponent", l1.p.f9793b);
        this.f9494a = kVar;
        kVar.e(aVar);
        C0524a.e().a();
        this.f9495b = new HashMap();
    }

    static /* synthetic */ InterfaceC0814a a(g gVar) {
        gVar.getClass();
        return null;
    }
}
