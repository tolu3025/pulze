package C0;

import A0.AbstractC0207e0;
import C0.C0254i1;
import D0.q;
import J0.AbstractC0386b;
import android.database.Cursor;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k0.C1004r;

/* JADX INFO: renamed from: C0.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0272o1 implements InterfaceC0282s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0254i1 f1055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f1056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0264m f1057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f1058d = new c();

    /* JADX INFO: renamed from: C0.o1$b */
    private enum b {
        NO_DOCUMENT(1),
        FOUND_DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        INVALID_DOCUMENT(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f1064a;

        b(int i3) {
            this.f1064a = i3;
        }

        static b e(D0.s sVar) {
            if (sVar.j()) {
                return NO_DOCUMENT;
            }
            if (sVar.d()) {
                return FOUND_DOCUMENT;
            }
            if (sVar.k()) {
                return UNKNOWN_DOCUMENT;
            }
            AbstractC0386b.d(!sVar.p(), "MutableDocument has an unknown type", new Object[0]);
            return INVALID_DOCUMENT;
        }
    }

    /* JADX INFO: renamed from: C0.o1$c */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ConcurrentHashMap f1065a;

        /* JADX INFO: renamed from: C0.o1$c$a */
        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final String f1066a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final int f1067b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final int f1068c;

            a(String str, int i3, int i4) {
                this.f1066a = str;
                this.f1067b = i3;
                this.f1068c = i4;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f1067b == aVar.f1067b && this.f1068c == aVar.f1068c && Objects.equals(this.f1066a, aVar.f1066a);
            }

            public int hashCode() {
                return Objects.hash(this.f1066a, Integer.valueOf(this.f1067b), Integer.valueOf(this.f1068c));
            }

            public String toString() {
                return "DocumentTypeBackfiller.BackfillKey(path=" + this.f1066a + ", readTimeSeconds=" + this.f1067b + ", readTimeNanos=" + this.f1068c + ")";
            }
        }

        /* JADX INFO: renamed from: C0.o1$c$b */
        private static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final String f1069a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Object[] f1070b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final int f1071c;

            b(String str, Object[] objArr, int i3) {
                this.f1069a = str;
                this.f1070b = objArr;
                this.f1071c = i3;
            }
        }

        private c() {
            this.f1065a = new ConcurrentHashMap();
        }

        void a(C0254i1 c0254i1) {
            while (true) {
                b bVarB = b();
                if (bVarB == null) {
                    return;
                } else {
                    c0254i1.w(bVarB.f1069a, bVarB.f1070b);
                }
            }
        }

        b b() {
            if (this.f1065a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f1065a.keySet().iterator();
            int i3 = 0;
            while (it.hasNext() && arrayList.size() < 900) {
                a aVar = (a) it.next();
                b bVar = (b) this.f1065a.remove(aVar);
                if (bVar != null) {
                    i3++;
                    arrayList.add(aVar.f1066a);
                    int size = arrayList.size();
                    arrayList.add(Integer.valueOf(aVar.f1067b));
                    int size2 = arrayList.size();
                    arrayList.add(Integer.valueOf(aVar.f1068c));
                    int size3 = arrayList.size();
                    arrayList.add(Integer.valueOf(bVar.f1064a));
                    int size4 = arrayList.size();
                    sb.append(" WHEN path=?");
                    sb.append(size);
                    sb.append(" AND read_time_seconds=?");
                    sb.append(size2);
                    sb.append(" AND read_time_nanos=?");
                    sb.append(size3);
                    sb.append(" THEN ?");
                    sb.append(size4);
                    if (sb2.length() > 0) {
                        sb2.append(" OR");
                    }
                    sb2.append(" (path=?");
                    sb2.append(size);
                    sb2.append(" AND read_time_seconds=?");
                    sb2.append(size2);
                    sb2.append(" AND read_time_nanos=?");
                    sb2.append(size3);
                    sb2.append(')');
                }
            }
            if (i3 == 0) {
                return null;
            }
            return new b("UPDATE remote_documents SET document_type = CASE" + ((Object) sb) + " ELSE NULL END WHERE" + ((Object) sb2), arrayList.toArray(), i3);
        }

        void c(String str, int i3, int i4, D0.s sVar) {
            this.f1065a.putIfAbsent(new a(str, i3, i4), b.e(sVar));
        }
    }

    C0272o1(C0254i1 c0254i1, r rVar) {
        this.f1055a = c0254i1;
        this.f1056b = rVar;
    }

    private D0.s k(byte[] bArr, int i3, int i4) {
        try {
            return this.f1056b.d(H0.a.k0(bArr)).w(new D0.w(new C1004r(i3, i4)));
        } catch (com.google.protobuf.D e3) {
            throw AbstractC0386b.a("MaybeDocument failed to parse: %s", e3);
        }
    }

    private Map l(List list, q.a aVar, int i3, b bVar, final J0.y yVar, C0265m0 c0265m0) throws InterruptedException {
        C1004r c1004rE = aVar.l().e();
        D0.l lVarJ = aVar.j();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT contents, read_time_seconds, read_time_nanos, document_type, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? ");
        sb.append(bVar == null ? "" : " AND (document_type IS NULL OR document_type = ?) ");
        sb.append("AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ");
        StringBuilder sbU = J0.L.u(sb.toString(), list.size(), " UNION ");
        sbU.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        int i4 = 0;
        Object[] objArr = new Object[(((bVar != null ? 1 : 0) + 9) * list.size()) + 1];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            D0.u uVar = (D0.u) it.next();
            String strC = AbstractC0243f.c(uVar);
            objArr[i4] = strC;
            objArr[i4 + 1] = AbstractC0243f.f(strC);
            int i5 = i4 + 3;
            objArr[i4 + 2] = Integer.valueOf(uVar.w() + 1);
            if (bVar != null) {
                objArr[i5] = Integer.valueOf(bVar.f1064a);
                i5 = i4 + 4;
            }
            objArr[i5] = Long.valueOf(c1004rE.l());
            objArr[i5 + 1] = Long.valueOf(c1004rE.l());
            objArr[i5 + 2] = Integer.valueOf(c1004rE.i());
            objArr[i5 + 3] = Long.valueOf(c1004rE.l());
            objArr[i5 + 4] = Integer.valueOf(c1004rE.i());
            objArr[i5 + 5] = AbstractC0243f.c(lVarJ.p());
            i4 = i5 + 6;
        }
        objArr[i4] = Integer.valueOf(i3);
        final J0.m mVar = new J0.m();
        final HashMap map = new HashMap();
        int iE = this.f1055a.F(sbU.toString()).b(objArr).e(new J0.n() { // from class: C0.n1
            @Override // J0.n
            public final void accept(Object obj) {
                this.f1045a.o(mVar, map, yVar, (Cursor) obj);
            }
        });
        if (c0265m0 != null) {
            c0265m0.b(iE);
        }
        mVar.b();
        this.f1058d.a(this.f1055a);
        synchronized (map) {
        }
        return map;
    }

    private Map m(List list, q.a aVar, int i3, J0.y yVar) {
        return l(list, aVar, i3, null, yVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(J0.m mVar, Map map, Cursor cursor) {
        o(mVar, map, cursor, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean p(A0.h0 h0Var, Set set, D0.s sVar) {
        return Boolean.valueOf(h0Var.e(sVar) || set.contains(sVar.getKey()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(byte[] bArr, int i3, int i4, boolean z2, String str, J0.y yVar, Map map) {
        D0.s sVarK = k(bArr, i3, i4);
        if (z2) {
            this.f1058d.c(str, i3, i4, sVarK);
        }
        if (yVar == null || ((Boolean) yVar.c(sVarK)).booleanValue()) {
            synchronized (map) {
                map.put(sVarK.getKey(), sVarK);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void o(J0.m mVar, final Map map, Cursor cursor, final J0.y yVar) {
        final byte[] blob = cursor.getBlob(0);
        final int i3 = cursor.getInt(1);
        final int i4 = cursor.getInt(2);
        final boolean zIsNull = cursor.isNull(3);
        final String string = cursor.getString(4);
        Runnable runnable = new Runnable() { // from class: C0.l1
            @Override // java.lang.Runnable
            public final void run() {
                this.f1022a.q(blob, i3, i4, zIsNull, string, yVar, map);
            }
        };
        if (cursor.isFirst() && cursor.isLast()) {
            runnable.run();
        } else {
            mVar.c(runnable);
        }
    }

    @Override // C0.InterfaceC0282s0
    public void a(InterfaceC0264m interfaceC0264m) {
        this.f1057c = interfaceC0264m;
    }

    @Override // C0.InterfaceC0282s0
    public void b(D0.s sVar, D0.w wVar) {
        AbstractC0386b.d(!wVar.equals(D0.w.f1302b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        D0.l key = sVar.getKey();
        C1004r c1004rE = wVar.e();
        this.f1055a.w("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, document_type, contents) VALUES (?, ?, ?, ?, ?, ?)", AbstractC0243f.c(key.p()), Integer.valueOf(key.p().w()), Long.valueOf(c1004rE.l()), Integer.valueOf(c1004rE.i()), Integer.valueOf(b.e(sVar).f1064a), this.f1056b.m(sVar).i());
        this.f1057c.f(sVar.getKey().n());
    }

    @Override // C0.InterfaceC0282s0
    public Map c(String str, q.a aVar, int i3) {
        List listB = this.f1057c.b(str);
        ArrayList arrayList = new ArrayList(listB.size());
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add((D0.u) ((D0.u) it.next()).m(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        if (arrayList.size() * 9 < 900) {
            return m(arrayList, aVar, i3, null);
        }
        HashMap map = new HashMap();
        int i4 = 0;
        while (i4 < arrayList.size()) {
            int i5 = i4 + 100;
            map.putAll(m(arrayList.subList(i4, Math.min(arrayList.size(), i5)), aVar, i3, null));
            i4 = i5;
        }
        return J0.L.p(map, i3, q.a.f1272b);
    }

    @Override // C0.InterfaceC0282s0
    public Map d(final A0.h0 h0Var, q.a aVar, final Set set, C0265m0 c0265m0) {
        D0.u uVarB;
        D0.u uVar = D0.u.f1301b;
        if (h0Var.d()) {
            uVarB = h0Var.h().n();
        } else {
            String strC = AbstractC0207e0.c(h0Var.g());
            AbstractC0386b.d(strC != null, "SQLiteRemoteDocumentCache.getDocumentsMatchingQuery receives pipeline without collection source.", new Object[0]);
            uVarB = D0.u.B(strC);
        }
        return l(Collections.singletonList(uVarB), aVar, a.e.API_PRIORITY_OTHER, b.FOUND_DOCUMENT, new J0.y() { // from class: C0.m1
            @Override // J0.y
            public final Object c(Object obj) {
                return C0272o1.p(h0Var, set, (D0.s) obj);
            }
        }, c0265m0);
    }

    @Override // C0.InterfaceC0282s0
    public Map e(Iterable iterable) throws InterruptedException {
        final HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            D0.l lVar = (D0.l) it.next();
            arrayList.add(AbstractC0243f.c(lVar.p()));
            map.put(lVar, D0.s.r(lVar));
        }
        C0254i1.b bVar = new C0254i1.b(this.f1055a, "SELECT contents, read_time_seconds, read_time_nanos, document_type, path FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        final J0.m mVar = new J0.m();
        while (bVar.d()) {
            bVar.e().e(new J0.n() { // from class: C0.k1
                @Override // J0.n
                public final void accept(Object obj) {
                    this.f1007a.n(mVar, map, (Cursor) obj);
                }
            });
        }
        mVar.b();
        this.f1058d.a(this.f1055a);
        synchronized (map) {
        }
        return map;
    }

    @Override // C0.InterfaceC0282s0
    public D0.s f(D0.l lVar) {
        return (D0.s) e(Collections.singletonList(lVar)).get(lVar);
    }

    @Override // C0.InterfaceC0282s0
    public void removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        t0.c cVarA = D0.j.a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            D0.l lVar = (D0.l) it.next();
            arrayList.add(AbstractC0243f.c(lVar.p()));
            cVarA = cVarA.m(lVar, D0.s.s(lVar, D0.w.f1302b));
        }
        C0254i1.b bVar = new C0254i1.b(this.f1055a, "DELETE FROM remote_documents WHERE path IN (", arrayList, ")");
        while (bVar.d()) {
            bVar.a();
        }
        this.f1057c.j(cVarA);
    }
}
