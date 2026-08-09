package k1;

import b1.AbstractC0525b;
import c1.C0543a;
import java.util.HashMap;
import l1.k;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.k f9526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k.c f9527b;

    class a implements k.c {
        a() {
        }

        @Override // l1.k.c
        public void a(l1.j jVar, k.d dVar) {
            dVar.a(null);
        }
    }

    public n(C0543a c0543a) {
        a aVar = new a();
        this.f9527b = aVar;
        l1.k kVar = new l1.k(c0543a, "flutter/navigation", l1.g.f9777a);
        this.f9526a = kVar;
        kVar.e(aVar);
    }

    public void a() {
        AbstractC0525b.f("NavigationChannel", "Sending message to pop route.");
        this.f9526a.c("popRoute", null);
    }

    public void b(String str) {
        AbstractC0525b.f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap map = new HashMap();
        map.put("location", str);
        this.f9526a.c("pushRouteInformation", map);
    }

    public void c(String str) {
        AbstractC0525b.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f9526a.c("setInitialRoute", str);
    }
}
