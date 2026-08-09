package s1;

import F0.AbstractC0305i;
import F0.AbstractC0315t;
import com.google.firebase.firestore.C0727g;
import com.google.firebase.firestore.C0752t;
import com.google.firebase.firestore.X0;
import com.google.firebase.firestore.Z;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k0.C1004r;

/* JADX INFO: renamed from: s1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1211b {
    static AbstractC0305i a(List list, q qVar) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("'and' requires at least one expression");
        }
        AbstractC0305i abstractC0305iO = qVar.O((Map) list.get(0));
        if (list.size() == 1) {
            return abstractC0305iO;
        }
        AbstractC0305i[] abstractC0305iArr = new AbstractC0305i[list.size() - 1];
        for (int i3 = 1; i3 < list.size(); i3++) {
            abstractC0305iArr[i3 - 1] = qVar.O((Map) list.get(i3));
        }
        return AbstractC0315t.e(abstractC0305iO, abstractC0305iArr);
    }

    static AbstractC0315t b(Object obj) {
        if (obj == null) {
            return AbstractC0315t.m0();
        }
        if (obj instanceof String) {
            return AbstractC0315t.H((String) obj);
        }
        if (obj instanceof Number) {
            return AbstractC0315t.G((Number) obj);
        }
        if (obj instanceof Boolean) {
            return AbstractC0315t.B(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Date) {
            return AbstractC0315t.I((Date) obj);
        }
        if (obj instanceof C1004r) {
            return AbstractC0315t.J((C1004r) obj);
        }
        if (obj instanceof Z) {
            return AbstractC0315t.E((Z) obj);
        }
        if (obj instanceof byte[]) {
            return AbstractC0315t.K((byte[]) obj);
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!(it.next() instanceof Number)) {
                        break;
                    }
                } else if (!list.isEmpty()) {
                    byte[] bArr = new byte[list.size()];
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        bArr[i3] = ((Number) list.get(i3)).byteValue();
                    }
                    return AbstractC0315t.K(bArr);
                }
            }
        } else {
            if (obj instanceof C0727g) {
                return AbstractC0315t.C((C0727g) obj);
            }
            if (obj instanceof C0752t) {
                return AbstractC0315t.D((C0752t) obj);
            }
            if (obj instanceof X0) {
                return AbstractC0315t.F((X0) obj);
            }
        }
        throw new IllegalArgumentException("Constant value must be one of: String, Number, Boolean, Date, Timestamp, GeoPoint, byte[], Blob, DocumentReference, or VectorValue. Got: " + obj.getClass().getName());
    }

    static AbstractC0305i c(List list, q qVar) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("'or' requires at least one expression");
        }
        AbstractC0305i abstractC0305iO = qVar.O((Map) list.get(0));
        if (list.size() == 1) {
            return abstractC0305iO;
        }
        AbstractC0305i[] abstractC0305iArr = new AbstractC0305i[list.size() - 1];
        for (int i3 = 1; i3 < list.size(); i3++) {
            abstractC0305iArr[i3 - 1] = qVar.O((Map) list.get(i3));
        }
        return AbstractC0315t.n0(abstractC0305iO, abstractC0305iArr);
    }

    static AbstractC0305i d(List list, q qVar) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("'xor' requires at least one expression");
        }
        AbstractC0305i abstractC0305iO = qVar.O((Map) list.get(0));
        if (list.size() == 1) {
            return abstractC0305iO;
        }
        AbstractC0305i[] abstractC0305iArr = new AbstractC0305i[list.size() - 1];
        for (int i3 = 1; i3 < list.size(); i3++) {
            abstractC0305iArr[i3 - 1] = qVar.O((Map) list.get(i3));
        }
        return AbstractC0315t.A0(abstractC0305iO, abstractC0305iArr);
    }
}
