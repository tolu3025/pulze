package k1;

import java.util.HashMap;
import java.util.Map;
import l1.InterfaceC1017c;
import l1.k;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.k f9502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f9503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.c f9504c;

    class a implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Map f9505a = new HashMap();

        a() {
        }

        @Override // l1.k.c
        public void a(l1.j jVar, k.d dVar) {
            if (j.this.f9503b != null) {
                String str = jVar.f9778a;
                str.hashCode();
                if (!str.equals("getKeyboardState")) {
                    dVar.c();
                    return;
                } else {
                    try {
                        this.f9505a = j.this.f9503b.a();
                    } catch (IllegalStateException e3) {
                        dVar.b("error", e3.getMessage(), null);
                    }
                }
            }
            dVar.a(this.f9505a);
        }
    }

    public interface b {
        Map a();
    }

    public j(InterfaceC1017c interfaceC1017c) {
        a aVar = new a();
        this.f9504c = aVar;
        l1.k kVar = new l1.k(interfaceC1017c, "flutter/keyboard", l1.p.f9793b);
        this.f9502a = kVar;
        kVar.e(aVar);
    }

    public void b(b bVar) {
        this.f9503b = bVar;
    }
}
