package C0;

import A0.AbstractC0219q;
import A0.C0203c0;
import A0.C0211i;
import A0.C0213k;
import A0.C0218p;
import C0.C0254i1;
import C0.InterfaceC0264m;
import C0.Z;
import D0.q;
import J0.AbstractC0386b;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;
import k0.C1004r;
import y0.C1288j;

/* JADX INFO: loaded from: classes.dex */
final class M0 implements InterfaceC0264m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f837k = "M0";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f838l = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0254i1 f839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f842d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Z.a f843e = new Z.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f844f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Queue f845g = new PriorityQueue(10, new Comparator() { // from class: C0.E0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return M0.R((D0.q) obj, (D0.q) obj2);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f846h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f847i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f848j = -1;

    M0(C0254i1 c0254i1, r rVar, C1288j c1288j) {
        this.f839a = c0254i1;
        this.f840b = rVar;
        this.f841c = c1288j.b() ? c1288j.a() : "";
    }

    private byte[] A(D0.q qVar, D0.i iVar) {
        B0.d dVar = new B0.d();
        for (q.c cVar : qVar.e()) {
            V0.I iE = iVar.e(cVar.g());
            if (iE == null) {
                return null;
            }
            B0.c.f541a.e(iE, dVar.b(cVar.h()));
        }
        return dVar.c();
    }

    private byte[] B(D0.q qVar) {
        return this.f840b.l(qVar.h()).i();
    }

    private byte[] C(V0.I i3) {
        B0.d dVar = new B0.d();
        B0.c.f541a.e(i3, dVar.b(q.c.a.ASCENDING));
        return dVar.c();
    }

    private Object[] D(D0.q qVar, A0.l0 l0Var, Collection collection) {
        if (collection == null) {
            return null;
        }
        List<B0.d> arrayList = new ArrayList();
        arrayList.add(new B0.d());
        Iterator it = collection.iterator();
        for (q.c cVar : qVar.e()) {
            V0.I i3 = (V0.I) it.next();
            for (B0.d dVar : arrayList) {
                if (N(l0Var, cVar.g()) && D0.z.Q(i3)) {
                    arrayList = E(arrayList, cVar, i3);
                } else {
                    B0.c.f541a.e(i3, dVar.b(cVar.h()));
                }
            }
        }
        return H(arrayList);
    }

    private List E(List list, q.c cVar, V0.I i3) {
        ArrayList<B0.d> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        for (V0.I i4 : i3.o0().g()) {
            for (B0.d dVar : arrayList) {
                B0.d dVar2 = new B0.d();
                dVar2.d(dVar.c());
                B0.c.f541a.e(i4, dVar2.b(cVar.h()));
                arrayList2.add(dVar2);
            }
        }
        return arrayList2;
    }

    private Object[] F(int i3, int i4, List list, Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = i3 / (list != null ? list.size() : 1);
        int i5 = 0;
        Object[] objArr4 = new Object[(i3 * 5) + (objArr3 != null ? objArr3.length : 0)];
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            objArr4[i6] = Integer.valueOf(i4);
            int i8 = i6 + 2;
            objArr4[i6 + 1] = this.f841c;
            int i9 = i6 + 3;
            objArr4[i8] = list != null ? C((V0.I) list.get(i7 / size)) : f838l;
            int i10 = i6 + 4;
            int i11 = i7 % size;
            objArr4[i9] = objArr[i11];
            i6 += 5;
            objArr4[i10] = objArr2[i11];
        }
        if (objArr3 != null) {
            int length = objArr3.length;
            while (i5 < length) {
                objArr4[i6] = objArr3[i5];
                i5++;
                i6++;
            }
        }
        return objArr4;
    }

    private Object[] G(A0.l0 l0Var, int i3, List list, Object[] objArr, String str, Object[] objArr2, String str2, Object[] objArr3) {
        StringBuilder sb;
        int iMax = Math.max(objArr.length, objArr2.length) * (list != null ? list.size() : 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT document_key, directional_value FROM index_entries ");
        sb2.append("WHERE index_id = ? AND uid = ? ");
        sb2.append("AND array_value = ? ");
        sb2.append("AND directional_value ");
        sb2.append(str);
        sb2.append(" ? ");
        sb2.append("AND directional_value ");
        sb2.append(str2);
        sb2.append(" ? ");
        CharSequence charSequenceU = J0.L.u(sb2, iMax, " UNION ");
        if (objArr3 != null) {
            StringBuilder sb3 = new StringBuilder("SELECT document_key, directional_value FROM (");
            sb3.append(charSequenceU);
            sb3.append(") WHERE directional_value NOT IN (");
            sb3.append((CharSequence) J0.L.u("?", objArr3.length, ", "));
            sb3.append(")");
            sb = sb3;
        } else {
            sb = charSequenceU;
        }
        Object[] objArrF = F(iMax, i3, list, objArr, objArr2, objArr3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sb.toString());
        arrayList.addAll(Arrays.asList(objArrF));
        return arrayList.toArray();
    }

    private Object[] H(List list) {
        Object[] objArr = new Object[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            objArr[i3] = ((B0.d) list.get(i3)).c();
        }
        return objArr;
    }

    private SortedSet I(final D0.l lVar, final D0.q qVar) {
        final TreeSet treeSet = new TreeSet();
        this.f839a.F("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?").b(Integer.valueOf(qVar.f()), lVar.toString(), this.f841c).e(new J0.n() { // from class: C0.J0
            @Override // J0.n
            public final void accept(Object obj) {
                M0.Q(treeSet, qVar, lVar, (Cursor) obj);
            }
        });
        return treeSet;
    }

    private D0.q J(A0.l0 l0Var) {
        AbstractC0386b.d(this.f846h, "IndexManager not started", new Object[0]);
        D0.y yVar = new D0.y(l0Var);
        Collection<D0.q> collectionK = K(l0Var.d() != null ? l0Var.d() : l0Var.n().s());
        D0.q qVar = null;
        if (collectionK.isEmpty()) {
            return null;
        }
        for (D0.q qVar2 : collectionK) {
            if (yVar.h(qVar2) && (qVar == null || qVar2.h().size() > qVar.h().size())) {
                qVar = qVar2;
            }
        }
        return qVar;
    }

    private q.a L(Collection collection) {
        AbstractC0386b.d(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator it = collection.iterator();
        q.a aVarC = ((D0.q) it.next()).g().c();
        int iK = aVarC.k();
        while (it.hasNext()) {
            q.a aVarC2 = ((D0.q) it.next()).g().c();
            if (aVarC2.compareTo(aVarC) < 0) {
                aVarC = aVarC2;
            }
            iK = Math.max(aVarC2.k(), iK);
        }
        return q.a.g(aVarC.l(), aVarC.j(), iK);
    }

    private List M(A0.l0 l0Var) {
        if (this.f842d.containsKey(l0Var)) {
            return (List) this.f842d.get(l0Var);
        }
        ArrayList arrayList = new ArrayList();
        if (l0Var.h().isEmpty()) {
            arrayList.add(l0Var);
        } else {
            Iterator it = J0.B.i(new C0213k(l0Var.h(), C0213k.a.AND)).iterator();
            while (it.hasNext()) {
                arrayList.add(new A0.l0(l0Var.n(), l0Var.d(), ((AbstractC0219q) it.next()).b(), l0Var.m(), l0Var.j(), l0Var.p(), l0Var.f()));
            }
        }
        this.f842d.put(l0Var, arrayList);
        return arrayList;
    }

    private boolean N(A0.l0 l0Var, D0.r rVar) {
        for (AbstractC0219q abstractC0219q : l0Var.h()) {
            if (abstractC0219q instanceof C0218p) {
                C0218p c0218p = (C0218p) abstractC0219q;
                if (c0218p.f().equals(rVar)) {
                    C0218p.b bVarG = c0218p.g();
                    if (bVarG.equals(C0218p.b.IN) || bVarG.equals(C0218p.b.NOT_IN)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(ArrayList arrayList, Cursor cursor) {
        arrayList.add(AbstractC0243f.b(cursor.getString(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(List list, Cursor cursor) {
        list.add(D0.l.j(D0.u.B(cursor.getString(0))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(SortedSet sortedSet, D0.q qVar, D0.l lVar, Cursor cursor) {
        sortedSet.add(B0.e.e(qVar.f(), lVar, cursor.getBlob(0), cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int R(D0.q qVar, D0.q qVar2) {
        int iCompare = Long.compare(qVar.g().d(), qVar2.g().d());
        return iCompare == 0 ? qVar.d().compareTo(qVar2.d()) : iCompare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S(Map map, Cursor cursor) {
        map.put(Integer.valueOf(cursor.getInt(0)), q.b.b(cursor.getLong(1), new D0.w(new C1004r(cursor.getLong(2), cursor.getInt(3))), D0.l.j(AbstractC0243f.b(cursor.getString(4))), cursor.getInt(5)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(Map map, Cursor cursor) {
        try {
            int i3 = cursor.getInt(0);
            W(D0.q.b(i3, cursor.getString(1), this.f840b.c(T0.a.g0(cursor.getBlob(2))), map.containsKey(Integer.valueOf(i3)) ? (q.b) map.get(Integer.valueOf(i3)) : D0.q.f1269a));
        } catch (com.google.protobuf.D e3) {
            throw AbstractC0386b.a("Failed to decode index: " + e3, new Object[0]);
        }
    }

    private void W(D0.q qVar) {
        Map map = (Map) this.f844f.get(qVar.d());
        if (map == null) {
            map = new HashMap();
            this.f844f.put(qVar.d(), map);
        }
        D0.q qVar2 = (D0.q) map.get(Integer.valueOf(qVar.f()));
        if (qVar2 != null) {
            this.f845g.remove(qVar2);
        }
        map.put(Integer.valueOf(qVar.f()), qVar);
        this.f845g.add(qVar);
        this.f847i = Math.max(this.f847i, qVar.f());
        this.f848j = Math.max(this.f848j, qVar.g().d());
    }

    private void X(final D0.i iVar, SortedSet sortedSet, SortedSet sortedSet2) {
        J0.A.a(f837k, "Updating index entries for document '%s'", iVar.getKey());
        J0.L.n(sortedSet, sortedSet2, new J0.n() { // from class: C0.F0
            @Override // J0.n
            public final void accept(Object obj) {
                this.f783a.U(iVar, (B0.e) obj);
            }
        }, new J0.n() { // from class: C0.G0
            @Override // J0.n
            public final void accept(Object obj) {
                this.f788a.V(iVar, (B0.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void U(D0.i iVar, B0.e eVar) {
        this.f839a.w("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(eVar.j()), this.f841c, eVar.g(), eVar.h(), iVar.getKey().toString());
    }

    private SortedSet x(D0.i iVar, D0.q qVar) {
        TreeSet treeSet = new TreeSet();
        byte[] bArrA = A(qVar, iVar);
        if (bArrA == null) {
            return treeSet;
        }
        q.c cVarC = qVar.c();
        if (cVarC != null) {
            V0.I iE = iVar.e(cVarC.g());
            if (D0.z.Q(iE)) {
                Iterator it = iE.o0().g().iterator();
                while (it.hasNext()) {
                    treeSet.add(B0.e.e(qVar.f(), iVar.getKey(), C((V0.I) it.next()), bArrA));
                }
            }
        } else {
            treeSet.add(B0.e.e(qVar.f(), iVar.getKey(), new byte[0], bArrA));
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void V(D0.i iVar, B0.e eVar) {
        this.f839a.w("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(eVar.j()), this.f841c, eVar.g(), eVar.h(), iVar.getKey().toString());
    }

    private Object[] z(D0.q qVar, A0.l0 l0Var, C0211i c0211i) {
        return D(qVar, l0Var, c0211i.b());
    }

    public Collection K(String str) {
        AbstractC0386b.d(this.f846h, "IndexManager not started", new Object[0]);
        Map map = (Map) this.f844f.get(str);
        return map == null ? Collections.emptyList() : map.values();
    }

    @Override // C0.InterfaceC0264m
    public void a(D0.q qVar) {
        this.f839a.w("DELETE FROM index_configuration WHERE index_id = ?", Integer.valueOf(qVar.f()));
        this.f839a.w("DELETE FROM index_entries WHERE index_id = ?", Integer.valueOf(qVar.f()));
        this.f839a.w("DELETE FROM index_state WHERE index_id = ?", Integer.valueOf(qVar.f()));
        this.f845g.remove(qVar);
        Map map = (Map) this.f844f.get(qVar.d());
        if (map != null) {
            map.remove(Integer.valueOf(qVar.f()));
        }
    }

    @Override // C0.InterfaceC0264m
    public List b(String str) {
        AbstractC0386b.d(this.f846h, "IndexManager not started", new Object[0]);
        final ArrayList arrayList = new ArrayList();
        this.f839a.F("SELECT parent FROM collection_parents WHERE collection_id = ?").b(str).e(new J0.n() { // from class: C0.H0
            @Override // J0.n
            public final void accept(Object obj) {
                M0.O(arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // C0.InterfaceC0264m
    public void c() {
        this.f839a.w("DELETE FROM index_configuration", new Object[0]);
        this.f839a.w("DELETE FROM index_entries", new Object[0]);
        this.f839a.w("DELETE FROM index_state", new Object[0]);
        this.f845g.clear();
        this.f844f.clear();
    }

    @Override // C0.InterfaceC0264m
    public InterfaceC0264m.a d(A0.l0 l0Var) {
        InterfaceC0264m.a aVar = InterfaceC0264m.a.FULL;
        List listM = M(l0Var);
        Iterator it = listM.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            A0.l0 l0Var2 = (A0.l0) it.next();
            D0.q qVarJ = J(l0Var2);
            if (qVarJ == null) {
                aVar = InterfaceC0264m.a.NONE;
                break;
            }
            if (qVarJ.h().size() < l0Var2.o()) {
                aVar = InterfaceC0264m.a.PARTIAL;
            }
        }
        return (l0Var.r() && listM.size() > 1 && aVar == InterfaceC0264m.a.FULL) ? InterfaceC0264m.a.PARTIAL : aVar;
    }

    @Override // C0.InterfaceC0264m
    public void e(String str, q.a aVar) {
        AbstractC0386b.d(this.f846h, "IndexManager not started", new Object[0]);
        this.f848j++;
        for (D0.q qVar : K(str)) {
            D0.q qVarB = D0.q.b(qVar.f(), qVar.d(), qVar.h(), q.b.a(this.f848j, aVar));
            this.f839a.w("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(qVar.f()), this.f841c, Long.valueOf(this.f848j), Long.valueOf(aVar.l().e().l()), Integer.valueOf(aVar.l().e().i()), AbstractC0243f.c(aVar.j().p()), Integer.valueOf(aVar.k()));
            W(qVarB);
        }
    }

    @Override // C0.InterfaceC0264m
    public void f(D0.u uVar) {
        AbstractC0386b.d(this.f846h, "IndexManager not started", new Object[0]);
        AbstractC0386b.d(uVar.w() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.f843e.a(uVar)) {
            this.f839a.w("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", uVar.s(), AbstractC0243f.c((D0.u) uVar.y()));
        }
    }

    @Override // C0.InterfaceC0264m
    public void g(A0.l0 l0Var) {
        AbstractC0386b.d(this.f846h, "IndexManager not started", new Object[0]);
        for (A0.l0 l0Var2 : M(l0Var)) {
            InterfaceC0264m.a aVarD = d(l0Var2);
            if (aVarD == InterfaceC0264m.a.NONE || aVarD == InterfaceC0264m.a.PARTIAL) {
                D0.q qVarB = new D0.y(l0Var2).b();
                if (qVarB != null) {
                    n(qVarB);
                }
            }
        }
    }

    @Override // C0.InterfaceC0264m
    public q.a h(String str) {
        Collection collectionK = K(str);
        AbstractC0386b.d(!collectionK.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return L(collectionK);
    }

    @Override // C0.InterfaceC0264m
    public q.a i(A0.l0 l0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = M(l0Var).iterator();
        while (it.hasNext()) {
            D0.q qVarJ = J((A0.l0) it.next());
            if (qVarJ != null) {
                arrayList.add(qVarJ);
            }
        }
        return L(arrayList);
    }

    @Override // C0.InterfaceC0264m
    public void j(t0.c cVar) {
        AbstractC0386b.d(this.f846h, "IndexManager not started", new Object[0]);
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            for (D0.q qVar : K(((D0.l) entry.getKey()).m())) {
                SortedSet sortedSetI = I((D0.l) entry.getKey(), qVar);
                SortedSet sortedSetX = x((D0.i) entry.getValue(), qVar);
                if (!sortedSetI.equals(sortedSetX)) {
                    X((D0.i) entry.getValue(), sortedSetI, sortedSetX);
                }
            }
        }
    }

    @Override // C0.InterfaceC0264m
    public Collection k() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f844f.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Map) it.next()).values());
        }
        return arrayList;
    }

    @Override // C0.InterfaceC0264m
    public List l(A0.l0 l0Var) {
        AbstractC0386b.d(this.f846h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<Pair> arrayList3 = new ArrayList();
        for (A0.l0 l0Var2 : M(l0Var)) {
            D0.q qVarJ = J(l0Var2);
            if (qVarJ == null) {
                return null;
            }
            arrayList3.add(Pair.create(l0Var2, qVarJ));
        }
        for (Pair pair : arrayList3) {
            A0.l0 l0Var3 = (A0.l0) pair.first;
            D0.q qVar = (D0.q) pair.second;
            List listA = l0Var3.a(qVar);
            Collection collectionL = l0Var3.l(qVar);
            C0211i c0211iK = l0Var3.k(qVar);
            C0211i c0211iQ = l0Var3.q(qVar);
            if (J0.A.c()) {
                J0.A.a(f837k, "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", qVar, l0Var3, listA, c0211iK, c0211iQ);
            }
            Object[] objArrG = G(l0Var3, qVar.f(), listA, z(qVar, l0Var3, c0211iK), c0211iK.c() ? ">=" : ">", z(qVar, l0Var3, c0211iQ), c0211iQ.c() ? "<=" : "<", D(qVar, l0Var3, collectionL));
            arrayList.add(String.valueOf(objArrG[0]));
            arrayList2.addAll(Arrays.asList(objArrG).subList(1, objArrG.length));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.join(" UNION ", arrayList));
        sb.append("ORDER BY directional_value, document_key ");
        sb.append(l0Var.i().equals(C0203c0.a.ASCENDING) ? "asc " : "desc ");
        String str = "SELECT DISTINCT document_key FROM (" + sb.toString() + ")";
        if (l0Var.r()) {
            str = str + " LIMIT " + l0Var.j();
        }
        AbstractC0386b.d(arrayList2.size() < 1000, "Cannot perform query with more than 999 bind elements", new Object[0]);
        C0254i1.d dVarB = this.f839a.F(str).b(arrayList2.toArray());
        final ArrayList arrayList4 = new ArrayList();
        dVarB.e(new J0.n() { // from class: C0.I0
            @Override // J0.n
            public final void accept(Object obj) {
                M0.P(arrayList4, (Cursor) obj);
            }
        });
        J0.A.a(f837k, "Index scan returned %s documents", Integer.valueOf(arrayList4.size()));
        return arrayList4;
    }

    @Override // C0.InterfaceC0264m
    public String m() {
        AbstractC0386b.d(this.f846h, "IndexManager not started", new Object[0]);
        D0.q qVar = (D0.q) this.f845g.peek();
        if (qVar != null) {
            return qVar.d();
        }
        return null;
    }

    @Override // C0.InterfaceC0264m
    public void n(D0.q qVar) {
        AbstractC0386b.d(this.f846h, "IndexManager not started", new Object[0]);
        int i3 = this.f847i + 1;
        D0.q qVarB = D0.q.b(i3, qVar.d(), qVar.h(), qVar.g());
        this.f839a.w("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", Integer.valueOf(i3), qVarB.d(), B(qVarB));
        W(qVarB);
    }

    @Override // C0.InterfaceC0264m
    public void start() {
        final HashMap map = new HashMap();
        this.f839a.F("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?").b(this.f841c).e(new J0.n() { // from class: C0.K0
            @Override // J0.n
            public final void accept(Object obj) {
                M0.S(map, (Cursor) obj);
            }
        });
        this.f839a.F("SELECT index_id, collection_group, index_proto FROM index_configuration").e(new J0.n() { // from class: C0.L0
            @Override // J0.n
            public final void accept(Object obj) {
                this.f813a.T(map, (Cursor) obj);
            }
        });
        this.f846h = true;
    }
}
