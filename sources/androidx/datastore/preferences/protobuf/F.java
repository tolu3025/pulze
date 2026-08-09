package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class F implements E {
    F() {
    }

    private static int i(int i3, Object obj, Object obj2) {
        D d3 = (D) obj;
        C c3 = (C) obj2;
        int iA = 0;
        if (d3.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : d3.entrySet()) {
            iA += c3.a(i3, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static D j(Object obj, Object obj2) {
        D dL = (D) obj;
        D d3 = (D) obj2;
        if (!d3.isEmpty()) {
            if (!dL.i()) {
                dL = dL.l();
            }
            dL.k(d3);
        }
        return dL;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object b(Object obj) {
        return D.d().l();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public int c(int i3, Object obj, Object obj2) {
        return i(i3, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public boolean d(Object obj) {
        return !((D) obj).i();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object e(Object obj) {
        ((D) obj).j();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public C.a f(Object obj) {
        return ((C) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Map g(Object obj) {
        return (D) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Map h(Object obj) {
        return (D) obj;
    }
}
