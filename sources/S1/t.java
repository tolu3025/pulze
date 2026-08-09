package s1;

import F0.AbstractC0315t;
import F0.C0301e;
import F0.C0302f;
import F0.E;
import F0.I;
import F0.K;
import F0.T;
import F0.w;
import F0.x;
import F0.y;
import com.google.firebase.firestore.C0751s0;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f11273a;

    t(q qVar) {
        this.f11273a = qVar;
    }

    private C0751s0 b(C0751s0 c0751s0, Map map) {
        List list = (List) map.get("expressions");
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("'add_fields' requires at least one expression");
        }
        K kY = this.f11273a.Y((Map) list.get(0));
        if (list.size() == 1) {
            return c0751s0.c(kY, new K[0]);
        }
        K[] kArr = new K[list.size() - 1];
        for (int i3 = 1; i3 < list.size(); i3++) {
            kArr[i3 - 1] = this.f11273a.Y((Map) list.get(i3));
        }
        return c0751s0.c(kY, kArr);
    }

    private C0751s0 c(C0751s0 c0751s0, Map map) {
        List list = (List) map.get("aggregate_functions");
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("'aggregate' requires at least one aggregate function");
        }
        C0302f c0302fG = this.f11273a.G((Map) list.get(0));
        if (list.size() == 1) {
            return c0751s0.f(c0302fG, new C0302f[0]);
        }
        C0302f[] c0302fArr = new C0302f[list.size() - 1];
        for (int i3 = 1; i3 < list.size(); i3++) {
            c0302fArr[i3 - 1] = this.f11273a.G((Map) list.get(i3));
        }
        return c0751s0.f(c0302fG, c0302fArr);
    }

    private C0751s0 d(C0751s0 c0751s0, Map map) {
        C0301e c0301eF = this.f11273a.F((Map) map.get("aggregate_stage"));
        Map map2 = (Map) map.get("options");
        return (map2 == null || map2.isEmpty()) ? c0751s0.d(c0301eF) : c0751s0.e(c0301eF, this.f11273a.E(map2));
    }

    private C0751s0 e(C0751s0 c0751s0, Map map) {
        List list = (List) map.get("expressions");
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("'distinct' requires at least one expression");
        }
        K kY = this.f11273a.Y((Map) list.get(0));
        if (list.size() == 1) {
            return c0751s0.h(kY, new Object[0]);
        }
        Object[] objArr = new Object[list.size() - 1];
        for (int i3 = 1; i3 < list.size(); i3++) {
            objArr[i3 - 1] = this.f11273a.T((Map) list.get(i3));
        }
        return c0751s0.h(kY, objArr);
    }

    private C0751s0 f(C0751s0 c0751s0, Map map) {
        String str = (String) map.get("vector_field");
        List list = (List) map.get("vector_value");
        String str2 = (String) map.get("distance_measure");
        Number number = (Number) map.get("limit");
        if (str2 == null) {
            throw new IllegalArgumentException("'find_nearest' requires a 'distance_measure' argument");
        }
        y.b bVarQ = this.f11273a.Q(str2);
        double[] dArr = new double[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            dArr[i3] = ((Number) list.get(i3)).doubleValue();
        }
        return number != null ? c0751s0.n(str, AbstractC0315t.z0(dArr), bVarQ, new x().g(number.intValue())) : c0751s0.m(AbstractC0315t.U(str), dArr, bVarQ);
    }

    private C0751s0 g(C0751s0 c0751s0, Map map) {
        return c0751s0.o(((Number) map.get("limit")).intValue());
    }

    private C0751s0 h(C0751s0 c0751s0, Map map) {
        return c0751s0.p(((Number) map.get("offset")).intValue());
    }

    private C0751s0 i(C0751s0 c0751s0, Map map) {
        List list = (List) map.get("field_paths");
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("'remove_fields' requires at least one field path");
        }
        w wVarU = AbstractC0315t.U((String) list.get(0));
        if (list.size() == 1) {
            return c0751s0.q(wVarU, new w[0]);
        }
        w[] wVarArr = new w[list.size() - 1];
        for (int i3 = 1; i3 < list.size(); i3++) {
            wVarArr[i3 - 1] = AbstractC0315t.U((String) list.get(i3));
        }
        return c0751s0.q(wVarU, wVarArr);
    }

    private C0751s0 j(C0751s0 c0751s0, Map map) {
        return c0751s0.r(this.f11273a.T((Map) map.get("expression")));
    }

    private C0751s0 k(C0751s0 c0751s0, Map map) {
        boolean zEquals = "percentage".equals((String) map.get("type"));
        Number number = (Number) map.get("value");
        return c0751s0.s(zEquals ? I.h(number.doubleValue()) : I.g(number.intValue()));
    }

    private C0751s0 l(C0751s0 c0751s0, Map map) {
        List list = (List) map.get("expressions");
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("'select' requires at least one expression");
        }
        K kY = this.f11273a.Y((Map) list.get(0));
        if (list.size() == 1) {
            return c0751s0.t(kY, new Object[0]);
        }
        Object[] objArr = new Object[list.size() - 1];
        for (int i3 = 1; i3 < list.size(); i3++) {
            objArr[i3 - 1] = this.f11273a.T((Map) list.get(i3));
        }
        return c0751s0.t(kY, objArr);
    }

    private C0751s0 m(C0751s0 c0751s0, Map map) {
        List list = (List) map.get("orderings");
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("'sort' requires at least one ordering");
        }
        Map map2 = (Map) list.get(0);
        AbstractC0315t abstractC0315tT = this.f11273a.T((Map) map2.get("expression"));
        E eQ = "asc".equals((String) map2.get("order_direction")) ? abstractC0315tT.q() : abstractC0315tT.M();
        if (list.size() == 1) {
            return c0751s0.u(eQ, new E[0]);
        }
        E[] eArr = new E[list.size() - 1];
        for (int i3 = 1; i3 < list.size(); i3++) {
            Map map3 = (Map) list.get(i3);
            AbstractC0315t abstractC0315tT2 = this.f11273a.T((Map) map3.get("expression"));
            eArr[i3 - 1] = "asc".equals((String) map3.get("order_direction")) ? abstractC0315tT2.q() : abstractC0315tT2.M();
        }
        return c0751s0.u(eQ, eArr);
    }

    private C0751s0 n(C0751s0 c0751s0, Map map, FirebaseFirestore firebaseFirestore) {
        List list = (List) map.get("pipeline");
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("'union' requires a non-empty 'pipeline' argument");
        }
        return c0751s0.y(s.b(firebaseFirestore, list));
    }

    private C0751s0 o(C0751s0 c0751s0, Map map) {
        K kY = this.f11273a.Y((Map) map.get("expression"));
        String str = (String) map.get("index_field");
        return str != null ? c0751s0.A(kY, new T().g(str)) : c0751s0.z(kY);
    }

    private C0751s0 p(C0751s0 c0751s0, Map map) {
        return c0751s0.B(this.f11273a.O((Map) map.get("expression")));
    }

    C0751s0 a(C0751s0 c0751s0, String str, Map map, FirebaseFirestore firebaseFirestore) {
        str.hashCode();
        switch (str) {
            case "offset":
                return h(c0751s0, map);
            case "sample":
                return k(c0751s0, map);
            case "select":
                return l(c0751s0, map);
            case "unnest":
                return o(c0751s0, map);
            case "find_nearest":
                return f(c0751s0, map);
            case "sort":
                return m(c0751s0, map);
            case "limit":
                return g(c0751s0, map);
            case "union":
                return n(c0751s0, map, firebaseFirestore);
            case "where":
                return p(c0751s0, map);
            case "aggregate":
                return c(c0751s0, map);
            case "distinct":
                return e(c0751s0, map);
            case "replace_with":
                return j(c0751s0, map);
            case "remove_fields":
                return i(c0751s0, map);
            case "add_fields":
                return b(c0751s0, map);
            case "aggregate_with_options":
                return d(c0751s0, map);
            default:
                throw new IllegalArgumentException("Unknown pipeline stage: " + str);
        }
    }
}
