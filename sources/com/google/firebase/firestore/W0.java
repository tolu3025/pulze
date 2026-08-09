package com.google.firebase.firestore;

import J0.AbstractC0386b;
import V0.C0423b;
import com.google.firebase.firestore.C0754u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseFirestore f6297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0754u.a f6298b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6299a;

        static {
            int[] iArr = new int[C0754u.a.values().length];
            f6299a = iArr;
            try {
                iArr[C0754u.a.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6299a[C0754u.a.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public W0(FirebaseFirestore firebaseFirestore, C0754u.a aVar) {
        this.f6297a = firebaseFirestore;
        this.f6298b = aVar;
    }

    private List a(C0423b c0423b) {
        ArrayList arrayList = new ArrayList(c0423b.i0());
        Iterator it = c0423b.g().iterator();
        while (it.hasNext()) {
            arrayList.add(f((V0.I) it.next()));
        }
        return arrayList;
    }

    private Object c(V0.I i3) {
        D0.f fVarG = D0.f.g(i3.y0());
        D0.l lVarI = D0.l.i(i3.y0());
        D0.f fVarB = this.f6297a.B();
        if (!fVarG.equals(fVarB)) {
            J0.A.e("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", lVarI.p(), fVarG.i(), fVarG.h(), fVarB.i(), fVarB.h());
        }
        return new C0752t(lVarI, this.f6297a);
    }

    private Object d(V0.I i3) {
        int i4 = a.f6299a[this.f6298b.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                return null;
            }
            return e(D0.v.a(i3));
        }
        V0.I iB = D0.v.b(i3);
        if (iB == null) {
            return null;
        }
        return f(iB);
    }

    private Object e(com.google.protobuf.t0 t0Var) {
        return new C1004r(t0Var.e0(), t0Var.d0());
    }

    Map b(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), f((V0.I) entry.getValue()));
        }
        return map2;
    }

    public Object f(V0.I i3) {
        switch (D0.z.f0(i3)) {
            case 0:
                return null;
            case 1:
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case 11:
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 14:
            default:
                throw AbstractC0386b.a("Unknown value type: " + i3.B0(), new Object[0]);
            case 2:
                return Boolean.valueOf(i3.p0());
            case 3:
            case 4:
                return i3.E0() ? Long.valueOf(i3.w0()) : Double.valueOf(i3.s0());
            case 5:
                return e(i3.A0());
            case 6:
                return d(i3);
            case 7:
                return i3.z0();
            case 8:
                return C0727g.e(i3.q0());
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return c(i3);
            case 13:
                return new Z(i3.v0().d0(), i3.v0().e0());
            case 15:
                return a(i3.o0());
            case 16:
                return g(i3.x0().d0());
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return b(i3.x0().d0());
        }
    }

    X0 g(Map map) {
        List listG = ((V0.I) map.get("value")).o0().g();
        double[] dArr = new double[listG.size()];
        for (int i3 = 0; i3 < listG.size(); i3++) {
            dArr[i3] = ((V0.I) listG.get(i3)).s0();
        }
        return new X0(dArr);
    }
}
