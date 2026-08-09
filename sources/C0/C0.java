package C0;

import C0.C0254i1;
import J0.AbstractC0386b;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import y0.C1288j;

/* JADX INFO: loaded from: classes.dex */
public class C0 implements InterfaceC0231b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0254i1 f771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f773c;

    public C0(C0254i1 c0254i1, r rVar, C1288j c1288j) {
        this.f771a = c0254i1;
        this.f772b = rVar;
        this.f773c = c1288j.b() ? c1288j.a() : "";
    }

    private E0.k m(byte[] bArr, int i3) {
        try {
            return E0.k.a(i3, this.f772b.e(V0.J.w0(bArr)));
        } catch (com.google.protobuf.D e3) {
            throw AbstractC0386b.a("Overlay failed to parse: %s", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ E0.k n(Cursor cursor) {
        return m(cursor.getBlob(0), cursor.getInt(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(int[] iArr, String[] strArr, String[] strArr2, J0.m mVar, Map map, Cursor cursor) {
        iArr[0] = cursor.getInt(1);
        strArr[0] = cursor.getString(2);
        strArr2[0] = cursor.getString(3);
        s(mVar, map, cursor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(byte[] bArr, int i3, Map map) {
        E0.k kVarM = m(bArr, i3);
        synchronized (map) {
            map.put(kVarM.b(), kVarM);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void s(J0.m mVar, final Map map, Cursor cursor) {
        final byte[] blob = cursor.getBlob(0);
        final int i3 = cursor.getInt(1);
        Runnable runnable = new Runnable() { // from class: C0.z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f1128a.r(blob, i3, map);
            }
        };
        if (cursor.isFirst() && cursor.isLast()) {
            runnable.run();
        } else {
            mVar.c(runnable);
        }
    }

    private void u(final Map map, final J0.m mVar, D0.u uVar, List list) {
        if (list.isEmpty()) {
            return;
        }
        C0254i1.b bVar = new C0254i1.b(this.f771a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(this.f773c, AbstractC0243f.c(uVar)), list, ")");
        while (bVar.d()) {
            bVar.e().e(new J0.n() { // from class: C0.x0
                @Override // J0.n
                public final void accept(Object obj) {
                    this.f1115a.s(mVar, map, (Cursor) obj);
                }
            });
        }
    }

    private void v(int i3, D0.l lVar, E0.f fVar) {
        this.f771a.w("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.f773c, lVar.m(), AbstractC0243f.c((D0.u) lVar.p().y()), lVar.p().s(), Integer.valueOf(i3), this.f772b.n(fVar).i());
    }

    @Override // C0.InterfaceC0231b
    public Map a(SortedSet sortedSet) throws InterruptedException {
        AbstractC0386b.d(sortedSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        HashMap map = new HashMap();
        J0.m mVar = new J0.m();
        D0.u uVarN = D0.u.f1301b;
        ArrayList arrayList = new ArrayList();
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            D0.l lVar = (D0.l) it.next();
            if (!uVarN.equals(lVar.n())) {
                u(map, mVar, uVarN, arrayList);
                uVarN = lVar.n();
                arrayList.clear();
            }
            arrayList.add(lVar.o());
        }
        u(map, mVar, uVarN, arrayList);
        mVar.b();
        return map;
    }

    @Override // C0.InterfaceC0231b
    public void b(int i3) {
        this.f771a.w("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.f773c, Integer.valueOf(i3));
    }

    @Override // C0.InterfaceC0231b
    public Map c(D0.u uVar, int i3) throws InterruptedException {
        final HashMap map = new HashMap();
        final J0.m mVar = new J0.m();
        this.f771a.F("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?").b(this.f773c, AbstractC0243f.c(uVar), Integer.valueOf(i3)).e(new J0.n() { // from class: C0.y0
            @Override // J0.n
            public final void accept(Object obj) {
                this.f1120a.o(mVar, map, (Cursor) obj);
            }
        });
        mVar.b();
        return map;
    }

    @Override // C0.InterfaceC0231b
    public E0.k d(D0.l lVar) {
        return (E0.k) this.f771a.F("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?").b(this.f773c, AbstractC0243f.c((D0.u) lVar.p().y()), lVar.p().s()).d(new J0.y() { // from class: C0.w0
            @Override // J0.y
            public final Object c(Object obj) {
                return this.f1112a.n((Cursor) obj);
            }
        });
    }

    @Override // C0.InterfaceC0231b
    public void e(int i3, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            D0.l lVar = (D0.l) entry.getKey();
            v(i3, lVar, (E0.f) J0.C.d((E0.f) entry.getValue(), "null value for key: %s", lVar));
        }
    }

    @Override // C0.InterfaceC0231b
    public Map f(String str, int i3, int i4) throws InterruptedException {
        final HashMap map = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final J0.m mVar = new J0.m();
        this.f771a.F("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?").b(this.f773c, str, Integer.valueOf(i3), Integer.valueOf(i4)).e(new J0.n() { // from class: C0.A0
            @Override // J0.n
            public final void accept(Object obj) {
                this.f756a.p(iArr, strArr, strArr2, mVar, map, (Cursor) obj);
            }
        });
        if (strArr[0] == null) {
            return map;
        }
        C0254i1.d dVarF = this.f771a.F("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str2 = this.f773c;
        String str3 = strArr[0];
        dVarF.b(str2, str, str3, str3, strArr2[0], Integer.valueOf(iArr[0])).e(new J0.n() { // from class: C0.B0
            @Override // J0.n
            public final void accept(Object obj) {
                this.f765a.q(mVar, map, (Cursor) obj);
            }
        });
        mVar.b();
        return map;
    }
}
