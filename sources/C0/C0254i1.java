package C0;

import C0.C0254i1;
import C0.T;
import J0.AbstractC0386b;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import com.google.firebase.firestore.T;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import y0.C1288j;

/* JADX INFO: renamed from: C0.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0254i1 extends AbstractC0262l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final O1 f983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0288v0 f984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0272o1 f985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Q0 f986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SQLiteTransactionListener f987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SQLiteDatabase f988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f989k;

    /* JADX INFO: renamed from: C0.i1$b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0254i1 f991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f994d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f995e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Iterator f996f;

        b(C0254i1 c0254i1, String str, List list, String str2) {
            this.f995e = 0;
            this.f991a = c0254i1;
            this.f992b = str;
            this.f994d = Collections.emptyList();
            this.f993c = str2;
            this.f996f = list.iterator();
        }

        private Object[] b() {
            ArrayList arrayList = new ArrayList(this.f994d);
            for (int i3 = 0; this.f996f.hasNext() && i3 < 900 - this.f994d.size(); i3++) {
                arrayList.add(this.f996f.next());
            }
            return arrayList.toArray();
        }

        void a() {
            this.f995e++;
            Object[] objArrB = b();
            this.f991a.w(this.f992b + ((Object) J0.L.u("?", objArrB.length, ", ")) + this.f993c, objArrB);
        }

        int c() {
            return this.f995e;
        }

        boolean d() {
            return this.f996f.hasNext();
        }

        d e() {
            this.f995e++;
            Object[] objArrB = b();
            return this.f991a.F(this.f992b + ((Object) J0.L.u("?", objArrB.length, ", ")) + this.f993c).b(objArrB);
        }

        b(C0254i1 c0254i1, String str, List list, List list2, String str2) {
            this.f995e = 0;
            this.f991a = c0254i1;
            this.f992b = str;
            this.f994d = list;
            this.f993c = str2;
            this.f996f = list2.iterator();
        }
    }

    /* JADX INFO: renamed from: C0.i1$c */
    static class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f998b;

        private c(Context context, r rVar, String str) {
            this(context, rVar, str, 18);
        }

        private void b(SQLiteDatabase sQLiteDatabase) {
            if (this.f998b) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f998b = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            b(sQLiteDatabase);
            new I1(sQLiteDatabase, this.f997a).n0(0);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
            b(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            b(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
            b(sQLiteDatabase);
            new I1(sQLiteDatabase, this.f997a).n0(i3);
        }

        c(Context context, r rVar, String str, int i3) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i3);
            this.f997a = rVar;
        }

        /* synthetic */ c(Context context, r rVar, String str, a aVar) {
            this(context, rVar, str);
        }
    }

    /* JADX INFO: renamed from: C0.i1$d */
    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SQLiteDatabase f999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f1000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SQLiteDatabase.CursorFactory f1001c;

        d(SQLiteDatabase sQLiteDatabase, String str) {
            this.f999a = sQLiteDatabase;
            this.f1000b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Cursor g(Object[] objArr, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            C0254i1.s(sQLiteQuery, objArr);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        private Cursor h() {
            SQLiteDatabase.CursorFactory cursorFactory = this.f1001c;
            return cursorFactory != null ? this.f999a.rawQueryWithFactory(cursorFactory, this.f1000b, null, null) : this.f999a.rawQuery(this.f1000b, null);
        }

        d b(final Object... objArr) {
            this.f1001c = new SQLiteDatabase.CursorFactory() { // from class: C0.j1
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return C0254i1.d.g(objArr, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            };
            return this;
        }

        int c(J0.n nVar) {
            Cursor cursorH = h();
            try {
                if (!cursorH.moveToFirst()) {
                    cursorH.close();
                    return 0;
                }
                nVar.accept(cursorH);
                cursorH.close();
                return 1;
            } catch (Throwable th) {
                if (cursorH != null) {
                    try {
                        cursorH.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        Object d(J0.y yVar) {
            Cursor cursorH = h();
            try {
                if (!cursorH.moveToFirst()) {
                    cursorH.close();
                    return null;
                }
                Object objC = yVar.c(cursorH);
                cursorH.close();
                return objC;
            } catch (Throwable th) {
                if (cursorH != null) {
                    try {
                        cursorH.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        int e(J0.n nVar) {
            Cursor cursorH = h();
            int i3 = 0;
            while (cursorH.moveToNext()) {
                try {
                    i3++;
                    nVar.accept(cursorH);
                } catch (Throwable th) {
                    if (cursorH != null) {
                        try {
                            cursorH.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorH.close();
            return i3;
        }

        boolean f() {
            Cursor cursorH = h();
            try {
                boolean z2 = !cursorH.moveToFirst();
                cursorH.close();
                return z2;
            } catch (Throwable th) {
                if (cursorH != null) {
                    try {
                        cursorH.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    public C0254i1(r rVar, T.b bVar, c cVar) {
        this.f987i = new a();
        this.f981c = cVar;
        this.f982d = rVar;
        this.f983e = new O1(this, rVar);
        this.f984f = new C0288v0(this, rVar);
        this.f985g = new C0272o1(this, rVar);
        this.f986h = new Q0(this, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long C(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long D(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(SQLiteProgram sQLiteProgram, Object[] objArr) {
        int i3;
        long jLongValue;
        for (int i4 = 0; i4 < objArr.length; i4++) {
            Object obj = objArr[i4];
            if (obj == null) {
                sQLiteProgram.bindNull(i4 + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i4 + 1, (String) obj);
            } else {
                if (obj instanceof Integer) {
                    i3 = i4 + 1;
                    jLongValue = ((Integer) obj).intValue();
                } else if (obj instanceof Long) {
                    i3 = i4 + 1;
                    jLongValue = ((Long) obj).longValue();
                } else if (obj instanceof Double) {
                    sQLiteProgram.bindDouble(i4 + 1, ((Double) obj).doubleValue());
                } else {
                    if (!(obj instanceof byte[])) {
                        throw AbstractC0386b.a("Unknown argument %s of type %s", obj, obj.getClass());
                    }
                    sQLiteProgram.bindBlob(i4 + 1, (byte[]) obj);
                }
                sQLiteProgram.bindLong(i3, jLongValue);
            }
        }
    }

    public static void t(Context context, D0.f fVar, String str) {
        String path = context.getDatabasePath(u(str, fVar)).getPath();
        String str2 = path + "-wal";
        File file = new File(path);
        File file2 = new File(path + "-journal");
        File file3 = new File(str2);
        try {
            J0.x.a(file);
            J0.x.a(file2);
            J0.x.a(file3);
        } catch (IOException e3) {
            throw new com.google.firebase.firestore.T("Failed to clear persistence." + e3, T.a.UNKNOWN);
        }
    }

    public static String u(String str, D0.f fVar) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(fVar.i(), "utf-8") + "." + URLEncoder.encode(fVar.h(), "utf-8");
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }

    private long y() {
        return ((Long) F("PRAGMA page_count").d(new J0.y() { // from class: C0.g1
            @Override // J0.y
            public final Object c(Object obj) {
                return C0254i1.C((Cursor) obj);
            }
        })).longValue();
    }

    private long z() {
        return ((Long) F("PRAGMA page_size").d(new J0.y() { // from class: C0.h1
            @Override // J0.y
            public final Object c(Object obj) {
                return C0254i1.D((Cursor) obj);
            }
        })).longValue();
    }

    @Override // C0.AbstractC0262l0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Q0 g() {
        return this.f986h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // C0.AbstractC0262l0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public O1 i() {
        return this.f983e;
    }

    SQLiteStatement E(String str) {
        return this.f988j.compileStatement(str);
    }

    d F(String str) {
        return new d(this.f988j, str);
    }

    @Override // C0.AbstractC0262l0
    InterfaceC0228a a() {
        return this.f984f;
    }

    @Override // C0.AbstractC0262l0
    InterfaceC0231b b(C1288j c1288j) {
        return new C0(this, this.f982d, c1288j);
    }

    @Override // C0.AbstractC0262l0
    InterfaceC0246g c() {
        return new D0(this);
    }

    @Override // C0.AbstractC0262l0
    InterfaceC0264m d(C1288j c1288j) {
        return new M0(this, this.f982d, c1288j);
    }

    @Override // C0.AbstractC0262l0
    InterfaceC0253i0 e(C1288j c1288j, InterfaceC0264m interfaceC0264m) {
        return new C0233b1(this, this.f982d, c1288j, interfaceC0264m);
    }

    @Override // C0.AbstractC0262l0
    InterfaceC0256j0 f() {
        return new C0245f1(this);
    }

    @Override // C0.AbstractC0262l0
    InterfaceC0282s0 h() {
        return this.f985g;
    }

    @Override // C0.AbstractC0262l0
    public boolean j() {
        return this.f989k;
    }

    @Override // C0.AbstractC0262l0
    Object k(String str, J0.E e3) {
        J0.A.a(AbstractC0262l0.f1020a, "Starting transaction: %s", str);
        this.f988j.beginTransactionWithListener(this.f987i);
        try {
            Object obj = e3.get();
            this.f988j.setTransactionSuccessful();
            return obj;
        } finally {
            this.f988j.endTransaction();
        }
    }

    @Override // C0.AbstractC0262l0
    void l(String str, Runnable runnable) {
        J0.A.a(AbstractC0262l0.f1020a, "Starting transaction: %s", str);
        this.f988j.beginTransactionWithListener(this.f987i);
        try {
            runnable.run();
            this.f988j.setTransactionSuccessful();
        } finally {
            this.f988j.endTransaction();
        }
    }

    @Override // C0.AbstractC0262l0
    public void m() {
        AbstractC0386b.d(this.f989k, "SQLitePersistence shutdown without start!", new Object[0]);
        this.f989k = false;
        this.f988j.close();
        this.f988j = null;
    }

    @Override // C0.AbstractC0262l0
    public void n() {
        AbstractC0386b.d(!this.f989k, "SQLitePersistence double-started!", new Object[0]);
        this.f989k = true;
        try {
            this.f988j = this.f981c.getWritableDatabase();
            this.f983e.B();
            this.f986h.z(this.f983e.r());
        } catch (SQLiteDatabaseLockedException e3) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e3);
        }
    }

    int v(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        s(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    void w(String str, Object... objArr) {
        this.f988j.execSQL(str, objArr);
    }

    long x() {
        return y() * z();
    }

    public C0254i1(Context context, String str, D0.f fVar, r rVar, T.b bVar) {
        this(rVar, bVar, new c(context, rVar, u(str, fVar), (a) null));
    }

    /* JADX INFO: renamed from: C0.i1$a */
    class a implements SQLiteTransactionListener {
        a() {
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onBegin() {
            C0254i1.this.f986h.k();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onCommit() {
            C0254i1.this.f986h.h();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onRollback() {
        }
    }
}
