package O0;

import java.util.Iterator;
import java.util.Set;
import r0.C1200c;
import r0.InterfaceC1202e;
import r0.r;

/* JADX INFO: loaded from: classes.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f2733b;

    c(Set set, d dVar) {
        this.f2732a = e(set);
        this.f2733b = dVar;
    }

    public static C1200c c() {
        return C1200c.c(i.class).b(r.m(f.class)).e(new r0.h() { // from class: O0.b
            @Override // r0.h
            public final Object a(InterfaceC1202e interfaceC1202e) {
                return c.d(interfaceC1202e);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(InterfaceC1202e interfaceC1202e) {
        return new c(interfaceC1202e.d(f.class), d.a());
    }

    private static String e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb.append(fVar.b());
            sb.append('/');
            sb.append(fVar.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // O0.i
    public String a() {
        if (this.f2733b.b().isEmpty()) {
            return this.f2732a;
        }
        return this.f2732a + ' ' + e(this.f2733b.b());
    }
}
