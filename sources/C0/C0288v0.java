package C0;

import J0.AbstractC0386b;
import android.database.Cursor;
import k0.C1004r;

/* JADX INFO: renamed from: C0.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0288v0 implements InterfaceC0228a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0254i1 f1103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f1104b;

    C0288v0(C0254i1 c0254i1, r rVar) {
        this.f1103a = c0254i1;
        this.f1104b = rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z0.e g(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new z0.e(str, cursor.getInt(0), new D0.w(new C1004r(cursor.getLong(1), cursor.getInt(2))), cursor.getInt(3), cursor.getLong(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ z0.j h(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            return new z0.j(str, this.f1104b.a(U0.a.h0(cursor.getBlob(2))), new D0.w(new C1004r(cursor.getLong(0), cursor.getInt(1))));
        } catch (com.google.protobuf.D e3) {
            throw AbstractC0386b.a("NamedQuery failed to parse: %s", e3);
        }
    }

    @Override // C0.InterfaceC0228a
    public void a(z0.e eVar) {
        this.f1103a.w("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", eVar.a(), Integer.valueOf(eVar.c()), Long.valueOf(eVar.b().e().l()), Integer.valueOf(eVar.b().e().i()), Integer.valueOf(eVar.e()), Long.valueOf(eVar.d()));
    }

    @Override // C0.InterfaceC0228a
    public z0.e b(final String str) {
        return (z0.e) this.f1103a.F("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?").b(str).d(new J0.y() { // from class: C0.t0
            @Override // J0.y
            public final Object c(Object obj) {
                return C0288v0.g(str, (Cursor) obj);
            }
        });
    }

    @Override // C0.InterfaceC0228a
    public z0.j c(final String str) {
        return (z0.j) this.f1103a.F("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?").b(str).d(new J0.y() { // from class: C0.u0
            @Override // J0.y
            public final Object c(Object obj) {
                return this.f1099a.h(str, (Cursor) obj);
            }
        });
    }

    @Override // C0.InterfaceC0228a
    public void d(z0.j jVar) {
        this.f1103a.w("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", jVar.b(), Long.valueOf(jVar.c().e().l()), Integer.valueOf(jVar.c().e().i()), this.f1104b.j(jVar.a()).i());
    }
}
