package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0506u;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0511z implements InterfaceC0510y {
    C0511z() {
    }

    static AbstractC0506u.b d(Object obj, long j3) {
        return (AbstractC0506u.b) i0.z(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0510y
    public void a(Object obj, long j3) {
        d(obj, j3).c();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0510y
    public List b(Object obj, long j3) {
        AbstractC0506u.b bVarD = d(obj, j3);
        if (bVarD.g()) {
            return bVarD;
        }
        int size = bVarD.size();
        AbstractC0506u.b bVarE = bVarD.e(size == 0 ? 10 : size * 2);
        i0.O(obj, j3, bVarE);
        return bVarE;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0510y
    public void c(Object obj, Object obj2, long j3) {
        AbstractC0506u.b bVarD = d(obj, j3);
        AbstractC0506u.b bVarD2 = d(obj2, j3);
        int size = bVarD.size();
        int size2 = bVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!bVarD.g()) {
                bVarD = bVarD.e(size2 + size);
            }
            bVarD.addAll(bVarD2);
        }
        if (size > 0) {
            bVarD2 = bVarD;
        }
        i0.O(obj, j3, bVarD2);
    }
}
