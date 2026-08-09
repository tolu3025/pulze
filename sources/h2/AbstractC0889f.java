package h2;

import java.util.Iterator;

/* JADX INFO: renamed from: h2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0889f {
    public static final void a(M1.g gVar, Throwable th) {
        Iterator it = AbstractC0888e.a().iterator();
        while (it.hasNext()) {
            try {
                ((c2.L) it.next()).P(gVar, th);
            } catch (Throwable th2) {
                AbstractC0888e.b(c2.M.b(th, th2));
            }
        }
        try {
            I1.b.a(th, new C0890g(gVar));
        } catch (Throwable unused) {
        }
        AbstractC0888e.b(th);
    }
}
