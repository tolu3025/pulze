package C0;

import C0.C0254i1;
import C0.Z;
import H0.c;
import J0.AbstractC0386b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f801b;

    I1(SQLiteDatabase sQLiteDatabase, r rVar) {
        this.f800a = sQLiteDatabase;
        this.f801b = rVar;
    }

    private void A() {
        Q(new String[]{"data_migrations"}, new Runnable() { // from class: C0.C1
            @Override // java.lang.Runnable
            public final void run() {
                this.f774a.S();
            }
        });
    }

    private void B() {
        Q(new String[]{"index_configuration", "index_state", "index_entries"}, new Runnable() { // from class: C0.w1
            @Override // java.lang.Runnable
            public final void run() {
                this.f1113a.T();
            }
        });
    }

    private void C() {
        Q(new String[]{"globals"}, new Runnable() { // from class: C0.D1
            @Override // java.lang.Runnable
            public final void run() {
                this.f777a.U();
            }
        });
    }

    private void D() {
        Q(new String[]{"document_overlays"}, new Runnable() { // from class: C0.s1
            @Override // java.lang.Runnable
            public final void run() {
                this.f1089a.V();
            }
        });
    }

    private void E() {
        Q(new String[]{"mutation_queues", "mutations", "document_mutations"}, new Runnable() { // from class: C0.t1
            @Override // java.lang.Runnable
            public final void run() {
                this.f1093a.W();
            }
        });
    }

    private void F() {
        Q(new String[]{"remote_documents"}, new Runnable() { // from class: C0.F1
            @Override // java.lang.Runnable
            public final void run() {
                this.f785a.X();
            }
        });
    }

    private void G() {
        Q(new String[]{"targets", "target_globals", "target_documents"}, new Runnable() { // from class: C0.x1
            @Override // java.lang.Runnable
            public final void run() {
                this.f1118a.Y();
            }
        });
    }

    private void H() {
        Q(new String[]{"collection_parents"}, new Runnable() { // from class: C0.p1
            @Override // java.lang.Runnable
            public final void run() {
                this.f1075a.c0();
            }
        });
        final Z.a aVar = new Z.a();
        final SQLiteStatement sQLiteStatementCompileStatement = this.f800a.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)");
        final J0.n nVar = new J0.n() { // from class: C0.z1
            @Override // J0.n
            public final void accept(Object obj) {
                I1.Z(aVar, sQLiteStatementCompileStatement, (D0.u) obj);
            }
        };
        new C0254i1.d(this.f800a, "SELECT path FROM remote_documents").e(new J0.n() { // from class: C0.A1
            @Override // J0.n
            public final void accept(Object obj) {
                I1.a0(nVar, (Cursor) obj);
            }
        });
        new C0254i1.d(this.f800a, "SELECT path FROM document_mutations").e(new J0.n() { // from class: C0.B1
            @Override // J0.n
            public final void accept(Object obj) {
                I1.b0(nVar, (Cursor) obj);
            }
        });
    }

    private void I() {
        new C0254i1.d(this.f800a, "SELECT target_id, target_proto FROM targets").e(new J0.n() { // from class: C0.E1
            @Override // J0.n
            public final void accept(Object obj) {
                this.f780a.d0((Cursor) obj);
            }
        });
    }

    private void J() {
        if (q0("targets")) {
            this.f800a.execSQL("DROP TABLE targets");
        }
        if (q0("target_globals")) {
            this.f800a.execSQL("DROP TABLE target_globals");
        }
        if (q0("target_documents")) {
            this.f800a.execSQL("DROP TABLE target_documents");
        }
    }

    private void K() {
        C0254i1.d dVarB = new C0254i1.d(this.f800a, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?").b(100);
        final SQLiteStatement sQLiteStatementCompileStatement = this.f800a.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
        final boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            dVarB.e(new J0.n() { // from class: C0.H1
                @Override // J0.n
                public final void accept(Object obj) {
                    I1.e0(zArr, sQLiteStatementCompileStatement, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    private void L() {
        this.f800a.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
    }

    private void M() {
        Long l3 = (Long) new C0254i1.d(this.f800a, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").d(new J0.y() { // from class: C0.u1
            @Override // J0.y
            public final Object c(Object obj) {
                return I1.f0((Cursor) obj);
            }
        });
        AbstractC0386b.d(l3 != null, "Missing highest sequence number", new Object[0]);
        final long jLongValue = l3.longValue();
        final SQLiteStatement sQLiteStatementCompileStatement = this.f800a.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        C0254i1.d dVarB = new C0254i1.d(this.f800a, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").b(100);
        final boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            dVarB.e(new J0.n() { // from class: C0.v1
                @Override // J0.n
                public final void accept(Object obj) {
                    I1.g0(zArr, sQLiteStatementCompileStatement, jLongValue, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    private void N() {
        if (DatabaseUtils.queryNumEntries(this.f800a, "target_globals") == 1) {
            return;
        }
        this.f800a.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
    }

    private boolean P() {
        boolean zP0 = p0("remote_documents", "read_time_seconds");
        boolean zP02 = p0("remote_documents", "read_time_nanos");
        AbstractC0386b.d(zP0 == zP02, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        return zP0 && zP02;
    }

    private void Q(String[] strArr, Runnable runnable) {
        StringBuilder sb;
        String str;
        String str2 = "[" + TextUtils.join(", ", strArr) + "]";
        boolean z2 = false;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String str3 = strArr[i3];
            boolean zQ0 = q0(str3);
            if (i3 == 0) {
                z2 = zQ0;
            } else if (zQ0 != z2) {
                String str4 = "Expected all of " + str2 + " to either exist or not, but ";
                if (z2) {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(strArr[0]);
                    sb.append(" exists and ");
                    sb.append(str3);
                    str = " does not";
                } else {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(strArr[0]);
                    sb.append(" does not exist and ");
                    sb.append(str3);
                    str = " does";
                }
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (!z2) {
            runnable.run();
            return;
        }
        J0.A.a("SQLiteSchema", "Skipping migration because all of " + str2 + " already exist", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        this.f800a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        this.f800a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        this.f800a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T() {
        this.f800a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
        this.f800a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
        this.f800a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
        this.f800a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f800a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        this.f800a.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
        this.f800a.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
        this.f800a.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W() {
        this.f800a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        this.f800a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        this.f800a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X() {
        this.f800a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y() {
        this.f800a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        this.f800a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        this.f800a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        this.f800a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        this.f800a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z(Z.a aVar, SQLiteStatement sQLiteStatement, D0.u uVar) {
        if (aVar.a(uVar)) {
            String strS = uVar.s();
            D0.u uVar2 = (D0.u) uVar.y();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, strS);
            sQLiteStatement.bindString(2, AbstractC0243f.c(uVar2));
            sQLiteStatement.execute();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a0(J0.n nVar, Cursor cursor) {
        nVar.accept((D0.u) AbstractC0243f.b(cursor.getString(0)).y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b0(J0.n nVar, Cursor cursor) {
        nVar.accept((D0.u) AbstractC0243f.b(cursor.getString(0)).y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0() {
        this.f800a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(Cursor cursor) {
        int i3 = cursor.getInt(0);
        try {
            this.f800a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((H0.c) ((c.b) H0.c.u0(cursor.getBlob(1)).Y()).w().n()).i(), Integer.valueOf(i3)});
        } catch (com.google.protobuf.D unused) {
            throw AbstractC0386b.a("Failed to decode Query data for target %s", Integer.valueOf(i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e0(boolean[] zArr, SQLiteStatement sQLiteStatement, Cursor cursor) {
        zArr[0] = true;
        String string = cursor.getString(0);
        D0.u uVarB = AbstractC0243f.b(string);
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, uVarB.w());
        sQLiteStatement.bindString(2, string);
        AbstractC0386b.d(sQLiteStatement.executeUpdateDelete() != -1, "Failed to update document path", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long f0(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g0(boolean[] zArr, SQLiteStatement sQLiteStatement, long j3, Cursor cursor) {
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j3);
        AbstractC0386b.d(sQLiteStatement.executeInsert() != -1, "Failed to insert a sentinel row", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(String str, Cursor cursor) {
        l0(str, cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(Cursor cursor) {
        final String string = cursor.getString(0);
        new C0254i1.d(this.f800a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").b(string, Long.valueOf(cursor.getLong(1))).e(new J0.n() { // from class: C0.y1
            @Override // J0.n
            public final void accept(Object obj) {
                this.f1123a.h0(string, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(Cursor cursor) {
        int i3 = cursor.getInt(0);
        try {
            this.f800a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{this.f801b.h(H0.c.u0(cursor.getBlob(1))).g().a(), Integer.valueOf(i3)});
        } catch (com.google.protobuf.D unused) {
            throw AbstractC0386b.a("Failed to decode Query data for target %s", Integer.valueOf(i3));
        }
    }

    private void k0() {
        new C0254i1.d(this.f800a, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").e(new J0.n() { // from class: C0.r1
            @Override // J0.n
            public final void accept(Object obj) {
                this.f1087a.i0((Cursor) obj);
            }
        });
    }

    private void l0(String str, int i3) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f800a.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        sQLiteStatementCompileStatement.bindString(1, str);
        sQLiteStatementCompileStatement.bindLong(2, i3);
        AbstractC0386b.d(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i3));
        this.f800a.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i3)});
    }

    private void m0() {
        new C0254i1.d(this.f800a, "SELECT target_id, target_proto FROM targets").e(new J0.n() { // from class: C0.G1
            @Override // J0.n
            public final void accept(Object obj) {
                this.f790a.j0((Cursor) obj);
            }
        });
    }

    private boolean p0(String str, String str2) {
        return O(str).indexOf(str2) != -1;
    }

    private boolean q0(String str) {
        return !new C0254i1.d(this.f800a, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").b(str).f();
    }

    private void t() {
        if (p0("remote_documents", "document_type")) {
            return;
        }
        this.f800a.execSQL("ALTER TABLE remote_documents ADD COLUMN document_type INTEGER");
    }

    private void u() {
        if (p0("remote_documents", "path_length")) {
            return;
        }
        this.f800a.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
    }

    private void v(String str) {
        this.f800a.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{str});
    }

    private void w() {
        this.f800a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.f800a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    private void x() {
        if (p0("target_documents", "sequence_number")) {
            return;
        }
        this.f800a.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
    }

    private void y() {
        if (!p0("target_globals", "target_count")) {
            this.f800a.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long jQueryNumEntries = DatabaseUtils.queryNumEntries(this.f800a, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(jQueryNumEntries));
        this.f800a.update("target_globals", contentValues, null, null);
    }

    private void z() {
        Q(new String[]{"bundles", "named_queries"}, new Runnable() { // from class: C0.q1
            @Override // java.lang.Runnable
            public final void run() {
                this.f1081a.R();
            }
        });
    }

    List O(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.f800a.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursorRawQuery.getColumnIndex("name");
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    void n0(int i3) {
        o0(i3, 18);
    }

    void o0(int i3, int i4) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i3 < 1 && i4 >= 1) {
            E();
            G();
            F();
        }
        if (i3 < 3 && i4 >= 3 && i3 != 0) {
            J();
            G();
        }
        if (i3 < 4 && i4 >= 4) {
            N();
            y();
        }
        if (i3 < 5 && i4 >= 5) {
            x();
        }
        if (i3 < 6 && i4 >= 6) {
            k0();
        }
        if (i3 < 7 && i4 >= 7) {
            M();
        }
        if (i3 < 8 && i4 >= 8) {
            H();
        }
        if (i3 < 9 && i4 >= 9) {
            if (P()) {
                I();
            } else {
                w();
            }
        }
        if (i3 == 9 && i4 >= 10) {
            I();
        }
        if (i3 < 11 && i4 >= 11) {
            m0();
        }
        if (i3 < 12 && i4 >= 12) {
            z();
        }
        if (i3 < 13 && i4 >= 13) {
            u();
            K();
        }
        if (i3 < 14 && i4 >= 14) {
            D();
            A();
            v(AbstractC0262l0.f1021b);
        }
        if (i3 < 15 && i4 >= 15) {
            L();
        }
        if (i3 < 16 && i4 >= 16) {
            B();
        }
        if (i3 < 17 && i4 >= 17) {
            C();
        }
        if (i3 < 18 && i4 >= 18) {
            t();
        }
        J0.A.a("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }
}
