package C0;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: C0.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0279r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t0.e f1085a = new t0.e(Collections.emptyList(), C0240e.f953c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t0.e f1086b = new t0.e(Collections.emptyList(), C0240e.f954d);

    private void e(C0240e c0240e) {
        this.f1085a = this.f1085a.l(c0240e);
        this.f1086b = this.f1086b.l(c0240e);
    }

    public void a(D0.l lVar, int i3) {
        C0240e c0240e = new C0240e(lVar, i3);
        this.f1085a = this.f1085a.d(c0240e);
        this.f1086b = this.f1086b.d(c0240e);
    }

    public void b(t0.e eVar, int i3) {
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            a((D0.l) it.next(), i3);
        }
    }

    public boolean c(D0.l lVar) {
        Iterator itF = this.f1085a.f(new C0240e(lVar, 0));
        if (itF.hasNext()) {
            return ((C0240e) itF.next()).d().equals(lVar);
        }
        return false;
    }

    public t0.e d(int i3) {
        Iterator itF = this.f1086b.f(new C0240e(D0.l.g(), i3));
        t0.e eVarH = D0.l.h();
        while (itF.hasNext()) {
            C0240e c0240e = (C0240e) itF.next();
            if (c0240e.c() != i3) {
                break;
            }
            eVarH = eVarH.d(c0240e.d());
        }
        return eVarH;
    }

    public void f(D0.l lVar, int i3) {
        e(new C0240e(lVar, i3));
    }

    public void g(t0.e eVar, int i3) {
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            f((D0.l) it.next(), i3);
        }
    }

    public t0.e h(int i3) {
        Iterator itF = this.f1086b.f(new C0240e(D0.l.g(), i3));
        t0.e eVarH = D0.l.h();
        while (itF.hasNext()) {
            C0240e c0240e = (C0240e) itF.next();
            if (c0240e.c() != i3) {
                break;
            }
            eVarH = eVarH.d(c0240e.d());
            e(c0240e);
        }
        return eVarH;
    }
}
