package C0;

import C0.InterfaceC0264m;
import D0.q;
import J0.AbstractC0386b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class Z implements InterfaceC0264m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f925a = new a();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f926a = new HashMap();

        a() {
        }

        boolean a(D0.u uVar) {
            AbstractC0386b.d(uVar.w() % 2 == 1, "Expected a collection path.", new Object[0]);
            String strS = uVar.s();
            D0.u uVar2 = (D0.u) uVar.y();
            HashSet hashSet = (HashSet) this.f926a.get(strS);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f926a.put(strS, hashSet);
            }
            return hashSet.add(uVar2);
        }

        List b(String str) {
            HashSet hashSet = (HashSet) this.f926a.get(str);
            return hashSet != null ? new ArrayList(hashSet) : Collections.emptyList();
        }
    }

    @Override // C0.InterfaceC0264m
    public List b(String str) {
        return this.f925a.b(str);
    }

    @Override // C0.InterfaceC0264m
    public InterfaceC0264m.a d(A0.l0 l0Var) {
        return InterfaceC0264m.a.NONE;
    }

    @Override // C0.InterfaceC0264m
    public void f(D0.u uVar) {
        this.f925a.a(uVar);
    }

    @Override // C0.InterfaceC0264m
    public q.a h(String str) {
        return q.a.f1271a;
    }

    @Override // C0.InterfaceC0264m
    public q.a i(A0.l0 l0Var) {
        return q.a.f1271a;
    }

    @Override // C0.InterfaceC0264m
    public Collection k() {
        return Collections.emptyList();
    }

    @Override // C0.InterfaceC0264m
    public List l(A0.l0 l0Var) {
        return null;
    }

    @Override // C0.InterfaceC0264m
    public String m() {
        return null;
    }

    @Override // C0.InterfaceC0264m
    public void a(D0.q qVar) {
    }

    @Override // C0.InterfaceC0264m
    public void g(A0.l0 l0Var) {
    }

    @Override // C0.InterfaceC0264m
    public void j(t0.c cVar) {
    }

    @Override // C0.InterfaceC0264m
    public void n(D0.q qVar) {
    }

    @Override // C0.InterfaceC0264m
    public void c() {
    }

    @Override // C0.InterfaceC0264m
    public void start() {
    }

    @Override // C0.InterfaceC0264m
    public void e(String str, q.a aVar) {
    }
}
