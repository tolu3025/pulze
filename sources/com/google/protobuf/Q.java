package com.google.protobuf;

import com.google.protobuf.N;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class Q implements P {
    Q() {
    }

    private static int i(int i3, Object obj, Object obj2) {
        O o2 = (O) obj;
        N n3 = (N) obj2;
        int iA = 0;
        if (o2.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : o2.entrySet()) {
            iA += n3.a(i3, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static O j(Object obj, Object obj2) {
        O oL = (O) obj;
        O o2 = (O) obj2;
        if (!o2.isEmpty()) {
            if (!oL.i()) {
                oL = oL.l();
            }
            oL.k(o2);
        }
        return oL;
    }

    @Override // com.google.protobuf.P
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.P
    public Object b(Object obj) {
        return O.d().l();
    }

    @Override // com.google.protobuf.P
    public int c(int i3, Object obj, Object obj2) {
        return i(i3, obj, obj2);
    }

    @Override // com.google.protobuf.P
    public boolean d(Object obj) {
        return !((O) obj).i();
    }

    @Override // com.google.protobuf.P
    public Object e(Object obj) {
        ((O) obj).j();
        return obj;
    }

    @Override // com.google.protobuf.P
    public N.a f(Object obj) {
        return ((N) obj).c();
    }

    @Override // com.google.protobuf.P
    public Map g(Object obj) {
        return (O) obj;
    }

    @Override // com.google.protobuf.P
    public Map h(Object obj) {
        return (O) obj;
    }
}
