package C0;

import J0.AbstractC0386b;
import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import y0.C1288j;

/* JADX INFO: renamed from: C0.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0245f1 implements InterfaceC0256j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0254i1 f967a;

    public C0245f1(C0254i1 c0254i1) {
        this.f967a = c0254i1;
    }

    private void d() {
        this.f967a.l("build overlays", new Runnable() { // from class: C0.c1
            @Override // java.lang.Runnable
            public final void run() {
                this.f945a.g();
            }
        });
    }

    private Set e() {
        final HashSet hashSet = new HashSet();
        this.f967a.F("SELECT DISTINCT uid FROM mutation_queues").e(new J0.n() { // from class: C0.e1
            @Override // J0.n
            public final void accept(Object obj) {
                C0245f1.h(hashSet, (Cursor) obj);
            }
        });
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        if (f()) {
            Set setE = e();
            InterfaceC0282s0 interfaceC0282s0H = this.f967a.h();
            Iterator it = setE.iterator();
            while (it.hasNext()) {
                C1288j c1288j = new C1288j((String) it.next());
                C0254i1 c0254i1 = this.f967a;
                InterfaceC0253i0 interfaceC0253i0E = c0254i1.e(c1288j, c0254i1.d(c1288j));
                HashSet hashSet = new HashSet();
                Iterator it2 = interfaceC0253i0E.k().iterator();
                while (it2.hasNext()) {
                    hashSet.addAll(((E0.g) it2.next()).f());
                }
                new C0276q(interfaceC0282s0H, interfaceC0253i0E, this.f967a.b(c1288j), this.f967a.d(c1288j)).q(hashSet);
            }
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Set set, Cursor cursor) {
        set.add(cursor.getString(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Boolean[] boolArr, Cursor cursor) {
        try {
            if (AbstractC0262l0.f1021b.equals(cursor.getString(0))) {
                boolArr[0] = Boolean.TRUE;
            }
        } catch (IllegalArgumentException e3) {
            throw AbstractC0386b.a("SQLitePersistence.DataMigration failed to parse: %s", e3);
        }
    }

    private void j() {
        this.f967a.w("DELETE FROM data_migrations WHERE migration_name = ?", AbstractC0262l0.f1021b);
    }

    boolean f() {
        final Boolean[] boolArr = {Boolean.FALSE};
        this.f967a.F("SELECT migration_name FROM data_migrations").e(new J0.n() { // from class: C0.d1
            @Override // J0.n
            public final void accept(Object obj) {
                C0245f1.i(boolArr, (Cursor) obj);
            }
        });
        return boolArr[0].booleanValue();
    }

    @Override // C0.InterfaceC0256j0
    public void run() {
        d();
    }
}
