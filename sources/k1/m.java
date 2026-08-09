package k1;

import b1.AbstractC0525b;
import c1.C0543a;
import java.util.HashMap;
import l1.k;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.k f9522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f9523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k.c f9524c;

    class a implements k.c {
        a() {
        }

        @Override // l1.k.c
        public void a(l1.j jVar, k.d dVar) {
            if (m.this.f9523b == null) {
                return;
            }
            String str = jVar.f9778a;
            AbstractC0525b.f("MouseCursorChannel", "Received '" + str + "' message.");
            try {
                if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                    try {
                        m.this.f9523b.a((String) ((HashMap) jVar.f9779b).get("kind"));
                        dVar.a(Boolean.TRUE);
                    } catch (Exception e3) {
                        dVar.b("error", "Error when setting cursors: " + e3.getMessage(), null);
                    }
                }
            } catch (Exception e4) {
                dVar.b("error", "Unhandled error: " + e4.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public m(C0543a c0543a) {
        a aVar = new a();
        this.f9524c = aVar;
        l1.k kVar = new l1.k(c0543a, "flutter/mousecursor", l1.p.f9793b);
        this.f9522a = kVar;
        kVar.e(aVar);
    }

    public void b(b bVar) {
        this.f9523b = bVar;
    }
}
