package C0;

import J0.AbstractC0386b;
import com.google.protobuf.AbstractC0791i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k0.C1004r;
import y0.C1288j;

/* JADX INFO: renamed from: C0.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0238d0 implements InterfaceC0253i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f946a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t0.e f947b = new t0.e(Collections.emptyList(), C0240e.f953c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f948c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC0791i f949d = I0.d0.f2299v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0244f0 f950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Z f951f;

    C0238d0(C0244f0 c0244f0, C1288j c1288j) {
        this.f950e = c0244f0;
        this.f951f = c0244f0.d(c1288j);
    }

    private int n(int i3) {
        if (this.f946a.isEmpty()) {
            return 0;
        }
        return i3 - ((E0.g) this.f946a.get(0)).e();
    }

    private int o(int i3, String str) {
        int iN = n(i3);
        AbstractC0386b.d(iN >= 0 && iN < this.f946a.size(), "Batches must exist to be %s", str);
        return iN;
    }

    private List q(t0.e eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            E0.g gVarG = g(((Integer) it.next()).intValue());
            if (gVarG != null) {
                arrayList.add(gVarG);
            }
        }
        return arrayList;
    }

    @Override // C0.InterfaceC0253i0
    public void a() {
        if (this.f946a.isEmpty()) {
            AbstractC0386b.d(this.f947b.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    @Override // C0.InterfaceC0253i0
    public void b(E0.g gVar, AbstractC0791i abstractC0791i) {
        int iE = gVar.e();
        int iO = o(iE, "acknowledged");
        AbstractC0386b.d(iO == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        E0.g gVar2 = (E0.g) this.f946a.get(iO);
        AbstractC0386b.d(iE == gVar2.e(), "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(iE), Integer.valueOf(gVar2.e()));
        this.f949d = (AbstractC0791i) J0.C.b(abstractC0791i);
    }

    @Override // C0.InterfaceC0253i0
    public E0.g c(int i3) {
        int iN = n(i3 + 1);
        if (iN < 0) {
            iN = 0;
        }
        if (this.f946a.size() > iN) {
            return (E0.g) this.f946a.get(iN);
        }
        return null;
    }

    @Override // C0.InterfaceC0253i0
    public int d() {
        if (this.f946a.isEmpty()) {
            return -1;
        }
        return this.f948c - 1;
    }

    @Override // C0.InterfaceC0253i0
    public List e(Iterable iterable) {
        t0.e eVar = new t0.e(Collections.emptyList(), new Comparator() { // from class: C0.c0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Integer) obj).compareTo((Integer) obj2);
            }
        });
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            D0.l lVar = (D0.l) it.next();
            Iterator itF = this.f947b.f(new C0240e(lVar, 0));
            while (itF.hasNext()) {
                C0240e c0240e = (C0240e) itF.next();
                if (!lVar.equals(c0240e.d())) {
                    break;
                }
                eVar = eVar.d(Integer.valueOf(c0240e.c()));
            }
        }
        return q(eVar);
    }

    @Override // C0.InterfaceC0253i0
    public void f(E0.g gVar) {
        AbstractC0386b.d(o(gVar.e(), "removed") == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        this.f946a.remove(0);
        t0.e eVarL = this.f947b;
        Iterator it = gVar.h().iterator();
        while (it.hasNext()) {
            D0.l lVarG = ((E0.f) it.next()).g();
            this.f950e.g().d(lVarG);
            eVarL = eVarL.l(new C0240e(lVarG, gVar.e()));
        }
        this.f947b = eVarL;
    }

    @Override // C0.InterfaceC0253i0
    public E0.g g(int i3) {
        int iN = n(i3);
        if (iN < 0 || iN >= this.f946a.size()) {
            return null;
        }
        E0.g gVar = (E0.g) this.f946a.get(iN);
        AbstractC0386b.d(gVar.e() == i3, "If found batch must match", new Object[0]);
        return gVar;
    }

    @Override // C0.InterfaceC0253i0
    public E0.g h(C1004r c1004r, List list, List list2) {
        AbstractC0386b.d(!list2.isEmpty(), "Mutation batches should not be empty", new Object[0]);
        int i3 = this.f948c;
        this.f948c = i3 + 1;
        int size = this.f946a.size();
        if (size > 0) {
            AbstractC0386b.d(((E0.g) this.f946a.get(size - 1)).e() < i3, "Mutation batchIds must be monotonically increasing order", new Object[0]);
        }
        E0.g gVar = new E0.g(i3, c1004r, list, list2);
        this.f946a.add(gVar);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            E0.f fVar = (E0.f) it.next();
            this.f947b = this.f947b.d(new C0240e(fVar.g(), i3));
            this.f951f.f(fVar.g().n());
        }
        return gVar;
    }

    @Override // C0.InterfaceC0253i0
    public AbstractC0791i i() {
        return this.f949d;
    }

    @Override // C0.InterfaceC0253i0
    public void j(AbstractC0791i abstractC0791i) {
        this.f949d = (AbstractC0791i) J0.C.b(abstractC0791i);
    }

    @Override // C0.InterfaceC0253i0
    public List k() {
        return Collections.unmodifiableList(this.f946a);
    }

    boolean l(D0.l lVar) {
        Iterator itF = this.f947b.f(new C0240e(lVar, 0));
        if (itF.hasNext()) {
            return ((C0240e) itF.next()).d().equals(lVar);
        }
        return false;
    }

    long m(r rVar) {
        Iterator it = this.f946a.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += (long) rVar.o((E0.g) it.next()).a();
        }
        return jA;
    }

    public boolean p() {
        return this.f946a.isEmpty();
    }

    @Override // C0.InterfaceC0253i0
    public void start() {
        if (p()) {
            this.f948c = 1;
        }
    }
}
