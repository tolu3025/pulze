package C0;

import C0.C0254i1;
import J0.AbstractC0386b;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.protobuf.AbstractC0791i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k0.C1004r;
import y0.C1288j;

/* JADX INFO: renamed from: C0.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0233b1 implements InterfaceC0253i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0254i1 f937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0264m f939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AbstractC0791i f942f;

    /* JADX INFO: renamed from: C0.b1$a */
    private static class a implements J0.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList f943a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f944b = true;

        a(byte[] bArr) {
            c(bArr);
        }

        private void c(byte[] bArr) {
            this.f943a.add(AbstractC0791i.p(bArr));
        }

        @Override // J0.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            c(blob);
            if (blob.length < 1000000) {
                this.f944b = false;
            }
        }

        int d() {
            return this.f943a.size();
        }

        AbstractC0791i e() {
            return AbstractC0791i.o(this.f943a);
        }
    }

    C0233b1(C0254i1 c0254i1, r rVar, C1288j c1288j, InterfaceC0264m interfaceC0264m) {
        this.f937a = c0254i1;
        this.f938b = rVar;
        this.f940d = c1288j.b() ? c1288j.a() : "";
        this.f942f = I0.d0.f2299v;
        this.f939c = interfaceC0264m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer A(Cursor cursor) {
        return Integer.valueOf(cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ E0.g B(Cursor cursor) {
        return v(cursor.getInt(0), cursor.getBlob(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(List list, Cursor cursor) {
        list.add(cursor.getString(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Cursor cursor) {
        this.f941e = Math.max(this.f941e, cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ E0.g E(int i3, Cursor cursor) {
        return v(i3, cursor.getBlob(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(List list, Cursor cursor) {
        list.add(AbstractC0243f.b(cursor.getString(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Cursor cursor) {
        this.f942f = AbstractC0791i.p(cursor.getBlob(0));
    }

    private void H() {
        final ArrayList arrayList = new ArrayList();
        this.f937a.F("SELECT uid FROM mutation_queues").e(new J0.n() { // from class: C0.X0
            @Override // J0.n
            public final void accept(Object obj) {
                C0233b1.C(arrayList, (Cursor) obj);
            }
        });
        this.f941e = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f937a.F("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").b((String) it.next()).e(new J0.n() { // from class: C0.Y0
                @Override // J0.n
                public final void accept(Object obj) {
                    this.f924a.D((Cursor) obj);
                }
            });
        }
        this.f941e++;
    }

    private void I() {
        this.f937a.w("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.f940d, -1, this.f942f.F());
    }

    private E0.g v(int i3, byte[] bArr) {
        try {
            if (bArr.length < 1000000) {
                return this.f938b.f(H0.e.q0(bArr));
            }
            a aVar = new a(bArr);
            while (aVar.f944b) {
                this.f937a.F("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").b(Integer.valueOf((aVar.d() * 1000000) + 1), 1000000, this.f940d, Integer.valueOf(i3)).c(aVar);
            }
            return this.f938b.f(H0.e.p0(aVar.e()));
        } catch (com.google.protobuf.D e3) {
            throw AbstractC0386b.a("MutationBatch failed to parse: %s", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(List list, Cursor cursor) {
        list.add(v(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Set set, List list, Cursor cursor) {
        int i3 = cursor.getInt(0);
        if (set.contains(Integer.valueOf(i3))) {
            return;
        }
        set.add(Integer.valueOf(i3));
        list.add(v(i3, cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int z(E0.g gVar, E0.g gVar2) {
        return Integer.compare(gVar.e(), gVar2.e());
    }

    @Override // C0.InterfaceC0253i0
    public void a() {
        if (w()) {
            final ArrayList arrayList = new ArrayList();
            this.f937a.F("SELECT path FROM document_mutations WHERE uid = ?").b(this.f940d).e(new J0.n() { // from class: C0.W0
                @Override // J0.n
                public final void accept(Object obj) {
                    C0233b1.F(arrayList, (Cursor) obj);
                }
            });
            AbstractC0386b.d(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    @Override // C0.InterfaceC0253i0
    public void b(E0.g gVar, AbstractC0791i abstractC0791i) {
        this.f942f = (AbstractC0791i) J0.C.b(abstractC0791i);
        I();
    }

    @Override // C0.InterfaceC0253i0
    public E0.g c(int i3) {
        return (E0.g) this.f937a.F("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").b(1000000, this.f940d, Integer.valueOf(i3 + 1)).d(new J0.y() { // from class: C0.R0
            @Override // J0.y
            public final Object c(Object obj) {
                return this.f879a.B((Cursor) obj);
            }
        });
    }

    @Override // C0.InterfaceC0253i0
    public int d() {
        return ((Integer) this.f937a.F("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?").b(-1, this.f940d).d(new J0.y() { // from class: C0.a1
            @Override // J0.y
            public final Object c(Object obj) {
                return C0233b1.A((Cursor) obj);
            }
        })).intValue();
    }

    @Override // C0.InterfaceC0253i0
    public List e(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0243f.c(((D0.l) it.next()).p()));
        }
        C0254i1.b bVar = new C0254i1.b(this.f937a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, this.f940d), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        final ArrayList arrayList2 = new ArrayList();
        final HashSet hashSet = new HashSet();
        while (bVar.d()) {
            bVar.e().e(new J0.n() { // from class: C0.U0
                @Override // J0.n
                public final void accept(Object obj) {
                    this.f911a.y(hashSet, arrayList2, (Cursor) obj);
                }
            });
        }
        if (bVar.c() > 1) {
            Collections.sort(arrayList2, new Comparator() { // from class: C0.V0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C0233b1.z((E0.g) obj, (E0.g) obj2);
                }
            });
        }
        return arrayList2;
    }

    @Override // C0.InterfaceC0253i0
    public void f(E0.g gVar) {
        SQLiteStatement sQLiteStatementE = this.f937a.E("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement sQLiteStatementE2 = this.f937a.E("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int iE = gVar.e();
        AbstractC0386b.d(this.f937a.v(sQLiteStatementE, this.f940d, Integer.valueOf(iE)) != 0, "Mutation batch (%s, %d) did not exist", this.f940d, Integer.valueOf(gVar.e()));
        Iterator it = gVar.h().iterator();
        while (it.hasNext()) {
            D0.l lVarG = ((E0.f) it.next()).g();
            this.f937a.v(sQLiteStatementE2, this.f940d, AbstractC0243f.c(lVarG.p()), Integer.valueOf(iE));
            this.f937a.g().d(lVarG);
        }
    }

    @Override // C0.InterfaceC0253i0
    public E0.g g(final int i3) {
        return (E0.g) this.f937a.F("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").b(1000000, this.f940d, Integer.valueOf(i3)).d(new J0.y() { // from class: C0.Z0
            @Override // J0.y
            public final Object c(Object obj) {
                return this.f927a.E(i3, (Cursor) obj);
            }
        });
    }

    @Override // C0.InterfaceC0253i0
    public E0.g h(C1004r c1004r, List list, List list2) {
        int i3 = this.f941e;
        this.f941e = i3 + 1;
        E0.g gVar = new E0.g(i3, c1004r, list, list2);
        this.f937a.w("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", this.f940d, Integer.valueOf(i3), this.f938b.o(gVar).i());
        HashSet hashSet = new HashSet();
        SQLiteStatement sQLiteStatementE = this.f937a.E("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            D0.l lVarG = ((E0.f) it.next()).g();
            if (hashSet.add(lVarG)) {
                this.f937a.v(sQLiteStatementE, this.f940d, AbstractC0243f.c(lVarG.p()), Integer.valueOf(i3));
                this.f939c.f(lVarG.n());
            }
        }
        return gVar;
    }

    @Override // C0.InterfaceC0253i0
    public AbstractC0791i i() {
        return this.f942f;
    }

    @Override // C0.InterfaceC0253i0
    public void j(AbstractC0791i abstractC0791i) {
        this.f942f = (AbstractC0791i) J0.C.b(abstractC0791i);
        I();
    }

    @Override // C0.InterfaceC0253i0
    public List k() {
        final ArrayList arrayList = new ArrayList();
        this.f937a.F("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").b(1000000, this.f940d).e(new J0.n() { // from class: C0.T0
            @Override // J0.n
            public final void accept(Object obj) {
                this.f909a.x(arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // C0.InterfaceC0253i0
    public void start() {
        H();
        if (this.f937a.F("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").b(this.f940d).c(new J0.n() { // from class: C0.S0
            @Override // J0.n
            public final void accept(Object obj) {
                this.f889a.G((Cursor) obj);
            }
        }) == 0) {
            I();
        }
    }

    public boolean w() {
        return this.f937a.F("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").b(this.f940d).f();
    }
}
