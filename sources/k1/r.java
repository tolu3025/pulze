package k1;

import android.content.pm.PackageManager;
import c1.C0543a;
import java.util.ArrayList;
import java.util.Map;
import l1.k;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.k f9618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PackageManager f9619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f9620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k.c f9621d;

    class a implements k.c {
        a() {
        }

        @Override // l1.k.c
        public void a(l1.j jVar, k.d dVar) {
            if (r.this.f9620c == null) {
                return;
            }
            String str = jVar.f9778a;
            Object obj = jVar.f9779b;
            str.hashCode();
            try {
                if (str.equals("ProcessText.processTextAction")) {
                    ArrayList arrayList = (ArrayList) obj;
                    r.this.f9620c.c((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), dVar);
                } else {
                    if (!str.equals("ProcessText.queryTextActions")) {
                        dVar.c();
                        return;
                    }
                    dVar.a(r.this.f9620c.b());
                }
            } catch (IllegalStateException e3) {
                dVar.b("error", e3.getMessage(), null);
            }
        }
    }

    public interface b {
        Map b();

        void c(String str, String str2, boolean z2, k.d dVar);
    }

    public r(C0543a c0543a, PackageManager packageManager) {
        a aVar = new a();
        this.f9621d = aVar;
        this.f9619b = packageManager;
        l1.k kVar = new l1.k(c0543a, "flutter/processtext", l1.p.f9793b);
        this.f9618a = kVar;
        kVar.e(aVar);
    }

    public void b(b bVar) {
        this.f9620c = bVar;
    }
}
