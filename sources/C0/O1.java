package C0;

import J0.AbstractC0386b;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import java.util.Iterator;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
final class O1 implements Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0254i1 f863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private D0.w f867e = D0.w.f1302b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f868f;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        t0.e f869a;

        private b() {
            this.f869a = D0.l.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        R1 f870a;

        private c() {
        }
    }

    O1(C0254i1 c0254i1, r rVar) {
        this.f863a = c0254i1;
        this.f864b = rVar;
    }

    private void A(R1 r12) {
        int iH = r12.h();
        String strA = r12.g().a();
        C1004r c1004rE = r12.f().e();
        this.f863a.w("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(iH), strA, Long.valueOf(c1004rE.l()), Integer.valueOf(c1004rE.i()), r12.d().F(), Long.valueOf(r12.e()), this.f864b.q(r12).i());
    }

    private boolean C(R1 r12) {
        boolean z2;
        if (r12.h() > this.f865c) {
            this.f865c = r12.h();
            z2 = true;
        } else {
            z2 = false;
        }
        if (r12.e() <= this.f866d) {
            return z2;
        }
        this.f866d = r12.e();
        return true;
    }

    private void D() {
        this.f863a.w("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f865c), Long.valueOf(this.f866d), Long.valueOf(this.f867e.e().l()), Integer.valueOf(this.f867e.e().i()), Long.valueOf(this.f868f));
    }

    private R1 p(byte[] bArr) {
        try {
            return this.f864b.h(H0.c.u0(bArr));
        } catch (com.google.protobuf.D e3) {
            throw AbstractC0386b.a("TargetData failed to parse: %s", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(J0.n nVar, Cursor cursor) {
        nVar.accept(p(cursor.getBlob(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(b bVar, Cursor cursor) {
        bVar.f869a = bVar.f869a.d(D0.l.j(AbstractC0243f.b(cursor.getString(0))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(A0.n0 n0Var, c cVar, Cursor cursor) {
        R1 r1P = p(cursor.getBlob(0));
        if (n0Var.equals(r1P.g())) {
            cVar.f870a = r1P;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(SparseArray sparseArray, int[] iArr, Cursor cursor) {
        int i3 = cursor.getInt(0);
        if (sparseArray.get(i3) == null) {
            z(i3);
            iArr[0] = iArr[0] + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Cursor cursor) {
        this.f865c = cursor.getInt(0);
        this.f866d = cursor.getInt(1);
        this.f867e = new D0.w(new C1004r(cursor.getLong(2), cursor.getInt(3)));
        this.f868f = cursor.getLong(4);
    }

    private void z(int i3) {
        d(i3);
        this.f863a.w("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i3));
        this.f868f--;
    }

    void B() {
        AbstractC0386b.d(this.f863a.F("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").c(new J0.n() { // from class: C0.J1
            @Override // J0.n
            public final void accept(Object obj) {
                this.f806a.x((Cursor) obj);
            }
        }) == 1, "Missing target_globals entry", new Object[0]);
    }

    @Override // C0.Q1
    public void a(D0.w wVar) {
        this.f867e = wVar;
        D();
    }

    @Override // C0.Q1
    public t0.e b(int i3) {
        final b bVar = new b();
        this.f863a.F("SELECT path FROM target_documents WHERE target_id = ?").b(Integer.valueOf(i3)).e(new J0.n() { // from class: C0.K1
            @Override // J0.n
            public final void accept(Object obj) {
                O1.u(bVar, (Cursor) obj);
            }
        });
        return bVar.f869a;
    }

    @Override // C0.Q1
    public D0.w c() {
        return this.f867e;
    }

    @Override // C0.Q1
    public void d(int i3) {
        this.f863a.w("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i3));
    }

    @Override // C0.Q1
    public void e(t0.e eVar, int i3) {
        SQLiteStatement sQLiteStatementE = this.f863a.E("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        Q0 q0A = this.f863a.g();
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            D0.l lVar = (D0.l) it.next();
            this.f863a.v(sQLiteStatementE, Integer.valueOf(i3), AbstractC0243f.c(lVar.p()));
            q0A.f(lVar);
        }
    }

    @Override // C0.Q1
    public void f(R1 r12) {
        A(r12);
        if (C(r12)) {
            D();
        }
    }

    @Override // C0.Q1
    public void g(t0.e eVar, int i3) {
        SQLiteStatement sQLiteStatementE = this.f863a.E("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        Q0 q0A = this.f863a.g();
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            D0.l lVar = (D0.l) it.next();
            this.f863a.v(sQLiteStatementE, Integer.valueOf(i3), AbstractC0243f.c(lVar.p()));
            q0A.g(lVar);
        }
    }

    @Override // C0.Q1
    public void h(R1 r12) {
        A(r12);
        C(r12);
        this.f868f++;
        D();
    }

    @Override // C0.Q1
    public int i() {
        return this.f865c;
    }

    @Override // C0.Q1
    public R1 j(final A0.n0 n0Var) {
        String strA = n0Var.a();
        final c cVar = new c();
        this.f863a.F("SELECT target_proto FROM targets WHERE canonical_id = ?").b(strA).e(new J0.n() { // from class: C0.L1
            @Override // J0.n
            public final void accept(Object obj) {
                this.f815a.v(n0Var, cVar, (Cursor) obj);
            }
        });
        return cVar.f870a;
    }

    public void q(final J0.n nVar) {
        this.f863a.F("SELECT target_proto FROM targets").e(new J0.n() { // from class: C0.N1
            @Override // J0.n
            public final void accept(Object obj) {
                this.f861a.t(nVar, (Cursor) obj);
            }
        });
    }

    public long r() {
        return this.f866d;
    }

    public long s() {
        return this.f868f;
    }

    int y(long j3, final SparseArray sparseArray) {
        final int[] iArr = new int[1];
        this.f863a.F("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?").b(Long.valueOf(j3)).e(new J0.n() { // from class: C0.M1
            @Override // J0.n
            public final void accept(Object obj) {
                this.f849a.w(sparseArray, iArr, (Cursor) obj);
            }
        });
        D();
        return iArr[0];
    }
}
