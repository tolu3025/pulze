package C0;

import C0.T;
import J0.AbstractC0386b;
import android.database.Cursor;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class Q0 implements InterfaceC0277q0, O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0254i1 f874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private A0.Y f875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f876c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final T f877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C0279r0 f878e;

    Q0(C0254i1 c0254i1, T.b bVar) {
        this.f874a = c0254i1;
        this.f877d = new T(this, bVar);
    }

    private void A(D0.l lVar) {
        this.f874a.w("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", AbstractC0243f.c(lVar.p()), Long.valueOf(o()));
    }

    private boolean t(D0.l lVar) {
        if (this.f878e.c(lVar)) {
            return true;
        }
        return x(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(J0.n nVar, Cursor cursor) {
        nVar.accept(Long.valueOf(cursor.getLong(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long v(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(int[] iArr, List list, D0.u[] uVarArr, Cursor cursor) {
        D0.u uVarB = AbstractC0243f.b(cursor.getString(0));
        D0.l lVarJ = D0.l.j(uVarB);
        if (!t(lVarJ)) {
            iArr[0] = iArr[0] + 1;
            list.add(lVarJ);
            y(lVarJ);
        }
        uVarArr[0] = uVarB;
    }

    private boolean x(D0.l lVar) {
        return !this.f874a.F("SELECT 1 FROM document_mutations WHERE path = ?").b(AbstractC0243f.c(lVar.p())).f();
    }

    private void y(D0.l lVar) {
        this.f874a.w("DELETE FROM target_documents WHERE path = ? AND target_id = 0", AbstractC0243f.c(lVar.p()));
    }

    @Override // C0.InterfaceC0277q0
    public void a(R1 r12) {
        this.f874a.i().f(r12.l(o()));
    }

    @Override // C0.O
    public long b() {
        return this.f874a.i().s() + ((Long) this.f874a.F("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").d(new J0.y() { // from class: C0.O0
            @Override // J0.y
            public final Object c(Object obj) {
                return Q0.v((Cursor) obj);
            }
        })).longValue();
    }

    @Override // C0.O
    public int c(long j3, SparseArray sparseArray) {
        return this.f874a.i().y(j3, sparseArray);
    }

    @Override // C0.InterfaceC0277q0
    public void d(D0.l lVar) {
        A(lVar);
    }

    @Override // C0.O
    public int e(long j3) {
        final int[] iArr = new int[1];
        final ArrayList arrayList = new ArrayList();
        final D0.u[] uVarArr = {D0.u.f1301b};
        while (this.f874a.F("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?").b(Long.valueOf(j3), AbstractC0243f.c(uVarArr[0]), 100).e(new J0.n() { // from class: C0.N0
            @Override // J0.n
            public final void accept(Object obj) {
                this.f857a.w(iArr, arrayList, uVarArr, (Cursor) obj);
            }
        }) == 100) {
        }
        this.f874a.h().removeAll(arrayList);
        return iArr[0];
    }

    @Override // C0.InterfaceC0277q0
    public void f(D0.l lVar) {
        A(lVar);
    }

    @Override // C0.InterfaceC0277q0
    public void g(D0.l lVar) {
        A(lVar);
    }

    @Override // C0.InterfaceC0277q0
    public void h() {
        AbstractC0386b.d(this.f876c != -1, "Committing a transaction without having started one", new Object[0]);
        this.f876c = -1L;
    }

    @Override // C0.InterfaceC0277q0
    public void i(D0.l lVar) {
        A(lVar);
    }

    @Override // C0.O
    public T j() {
        return this.f877d;
    }

    @Override // C0.InterfaceC0277q0
    public void k() {
        AbstractC0386b.d(this.f876c == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f876c = this.f875b.a();
    }

    @Override // C0.O
    public long l() {
        return this.f874a.x();
    }

    @Override // C0.O
    public void m(final J0.n nVar) {
        this.f874a.F("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").e(new J0.n() { // from class: C0.P0
            @Override // J0.n
            public final void accept(Object obj) {
                Q0.u(nVar, (Cursor) obj);
            }
        });
    }

    @Override // C0.O
    public void n(J0.n nVar) {
        this.f874a.i().q(nVar);
    }

    @Override // C0.InterfaceC0277q0
    public long o() {
        AbstractC0386b.d(this.f876c != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f876c;
    }

    @Override // C0.InterfaceC0277q0
    public void p(C0279r0 c0279r0) {
        this.f878e = c0279r0;
    }

    void z(long j3) {
        this.f875b = new A0.Y(j3);
    }
}
