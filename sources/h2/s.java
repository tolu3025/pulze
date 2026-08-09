package h2;

import c2.J0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f7474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J0 f7475b;

    static {
        s sVar = new s();
        f7474a = sVar;
        E.f("kotlinx.coroutines.fast.service.loader", true);
        f7475b = sVar.a();
    }

    private s() {
    }

    private final J0 a() {
        Object next;
        J0 j0E;
        try {
            List listI = a2.k.i(a2.i.c(ServiceLoader.load(r.class, r.class.getClassLoader()).iterator()));
            Iterator it = listI.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((r) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((r) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            r rVar = (r) next;
            if (rVar != null && (j0E = t.e(rVar, listI)) != null) {
                return j0E;
            }
            return t.b(null, null, 3, null);
        } catch (Throwable th) {
            return t.b(th, null, 2, null);
        }
    }
}
