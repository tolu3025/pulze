package s1;

import F0.AbstractC0305i;
import F0.AbstractC0315t;
import F0.C0299c;
import F0.C0300d;
import F0.C0301e;
import F0.C0302f;
import F0.K;
import F0.y;
import android.util.Log;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseFirestore f11267a;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2);
    }

    q(FirebaseFirestore firebaseFirestore) {
        this.f11267a = firebaseFirestore;
    }

    private AbstractC0305i H(Map map) {
        AbstractC0315t abstractC0315tT = T((Map) map.get("array"));
        return map.get("values") != null ? abstractC0315tT.k(U((List) map.get("values"))) : abstractC0315tT.j(T((Map) map.get("array_expression")));
    }

    private AbstractC0305i I(Map map) {
        return T((Map) map.get("array")).l(U((List) map.get("values")));
    }

    private AbstractC0305i J(Map map) {
        return T((Map) map.get("array")).i(T((Map) map.get("element")));
    }

    private AbstractC0305i K(Map map) {
        return P(map, "expression").p();
    }

    private AbstractC0305i L(Map map, a aVar) {
        return (AbstractC0305i) aVar.a(T((Map) map.get("left")), T((Map) map.get("right")));
    }

    private AbstractC0305i M(String str, Map map) {
        a aVar;
        str.hashCode();
        switch (str) {
            case "greater_than":
                aVar = new a() { // from class: s1.i
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.V(abstractC0315t2);
                    }
                };
                break;
            case "equal":
                aVar = new a() { // from class: s1.c
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.Q(abstractC0315t2);
                    }
                };
                break;
            case "greater_than_or_equal":
                aVar = new a() { // from class: s1.j
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.W(abstractC0315t2);
                    }
                };
                break;
            case "less_than":
                aVar = new a() { // from class: s1.k
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.d0(abstractC0315t2);
                    }
                };
                break;
            case "less_than_or_equal":
                aVar = new a() { // from class: s1.l
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.e0(abstractC0315t2);
                    }
                };
                break;
            case "not_equal":
                aVar = new a() { // from class: s1.h
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.k0(abstractC0315t2);
                    }
                };
                break;
            default:
                throw new IllegalArgumentException("Not a binary comparison expression: " + str);
        }
        return L(map, aVar);
    }

    private AbstractC0315t N(Map map, a aVar) {
        return (AbstractC0315t) aVar.a(T((Map) map.get("left")), T((Map) map.get("right")));
    }

    private AbstractC0315t P(Map map, String str) {
        return T((Map) map.get(str));
    }

    private AbstractC0305i R(Map map) {
        return T((Map) map.get("value")).R(U((List) map.get("values")));
    }

    private AbstractC0305i S(Map map) {
        return P(map, "expression").T();
    }

    private List U(List list) {
        AbstractC0315t[] abstractC0315tArr = new AbstractC0315t[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            abstractC0315tArr[i3] = T((Map) list.get(i3));
        }
        return Arrays.asList(abstractC0315tArr);
    }

    private AbstractC0305i V(Map map) {
        return P(map, "expression").Z();
    }

    private AbstractC0305i W(Map map) {
        return P(map, "expression").a0();
    }

    private AbstractC0305i X(Map map) {
        return T((Map) map.get("value")).l0(U((List) map.get("values")));
    }

    private static Map o(Map map) {
        Map map2 = (Map) map.get("args");
        return map2 != null ? map2 : new HashMap();
    }

    C0299c D(Map map) {
        String str;
        AbstractC0315t abstractC0315tT;
        str = (String) map.get("function");
        if (str == null) {
            str = (String) map.get("name");
        }
        Map map2 = (Map) map.get("args");
        abstractC0315tT = map2 != null ? T((Map) map2.get("expression")) : null;
        str.hashCode();
        switch (str) {
            case "average":
                return C0299c.b(abstractC0315tT);
            case "sum":
                return C0299c.h(abstractC0315tT);
            case "count":
                return C0299c.c(abstractC0315tT);
            case "count_distinct":
                return C0299c.e(abstractC0315tT);
            case "maximum":
                return C0299c.f(abstractC0315tT);
            case "minimum":
                return C0299c.g(abstractC0315tT);
            case "count_all":
                return C0299c.d();
            default:
                throw new IllegalArgumentException("Unknown aggregate function: " + str);
        }
    }

    C0300d E(Map map) {
        return new C0300d();
    }

    C0301e F(Map map) {
        C0301e c0301eG;
        List list = (List) map.get("accumulators");
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("AggregateStage must have at least one accumulator");
        }
        int size = list.size();
        C0302f[] c0302fArr = new C0302f[size];
        for (int i3 = 0; i3 < list.size(); i3++) {
            c0302fArr[i3] = G((Map) list.get(i3));
        }
        if (size == 1) {
            c0301eG = C0301e.g(c0302fArr[0], new C0302f[0]);
        } else {
            int i4 = size - 1;
            C0302f[] c0302fArr2 = new C0302f[i4];
            System.arraycopy(c0302fArr, 1, c0302fArr2, 0, i4);
            c0301eG = C0301e.g(c0302fArr[0], c0302fArr2);
        }
        List list2 = (List) map.get("groups");
        if (list2 == null || list2.isEmpty()) {
            return c0301eG;
        }
        K kY = Y((Map) list2.get(0));
        if (list2.size() == 1) {
            return c0301eG.h(kY, new Object[0]);
        }
        Object[] objArr = new Object[list2.size() - 1];
        for (int i5 = 1; i5 < list2.size(); i5++) {
            objArr[i5 - 1] = T((Map) list2.get(i5));
        }
        return c0301eG.h(kY, objArr);
    }

    C0302f G(Map map) {
        String str;
        if ("alias".equals((String) map.get("name"))) {
            Map map2 = (Map) map.get("args");
            str = (String) map2.get("alias");
            map = (Map) map2.get("aggregate_function");
        } else {
            str = (String) map.get("alias");
            if (str == null) {
                throw new IllegalArgumentException("Aggregate function must have an alias. Expected AliasedAggregateFunction format.");
            }
        }
        return D(map).a(str);
    }

    AbstractC0305i O(Map map) {
        Map mapO;
        String str = (String) map.get("name");
        if (str == null) {
            throw new IllegalArgumentException("BooleanExpression must have a 'name' field");
        }
        mapO = o(map);
        switch (str) {
            case "array_contains_all":
                return H(mapO);
            case "array_contains_any":
                return I(mapO);
            case "greater_than":
            case "equal":
            case "greater_than_or_equal":
            case "less_than":
            case "less_than_or_equal":
            case "not_equal":
                return M(str, mapO);
            case "exists":
                return S(mapO);
            case "as_boolean":
                return K(mapO);
            case "is_absent":
                return V(mapO);
            case "array_contains":
                return J(mapO);
            case "or":
                return AbstractC1211b.c((List) mapO.get("expressions"), this);
            case "and":
                return AbstractC1211b.a((List) mapO.get("expressions"), this);
            case "not":
                return O((Map) mapO.get("expression")).B0();
            case "xor":
                return AbstractC1211b.d((List) mapO.get("expressions"), this);
            case "is_error":
                return W(mapO);
            case "not_equal_any":
                return X(mapO);
            case "equal_any":
                return R(mapO);
            default:
                AbstractC0315t abstractC0315tT = T(map);
                if (abstractC0315tT instanceof AbstractC0305i) {
                    return (AbstractC0305i) abstractC0315tT;
                }
                Log.w("ExpressionParsers", "Expression type '" + str + "' is not a BooleanExpression, attempting cast");
                throw new IllegalArgumentException("Expression type '" + str + "' cannot be used as a BooleanExpression");
        }
    }

    y.b Q(String str) {
        str.hashCode();
        switch (str) {
            case "cosine":
                return y.b.f1510d;
            case "dotProduct":
                return y.b.f1511e;
            case "euclidean":
                return y.b.f1509c;
            default:
                throw new IllegalArgumentException("Unknown distance measure: " + str + ". Expected: cosine, euclidean, or dotProduct");
        }
    }

    AbstractC0315t T(Map map) {
        Map mapO;
        String str;
        String str2 = (String) map.get("name");
        if (str2 == null) {
            if (map.containsKey("field_name")) {
                return AbstractC0315t.U((String) map.get("field_name"));
            }
            Map map2 = (Map) map.get("args");
            if (map2 == null || !map2.containsKey("field")) {
                throw new IllegalArgumentException("Expression must have a 'name' field");
            }
            return AbstractC0315t.U((String) map2.get("field"));
        }
        mapO = o(map);
        switch (str2) {
            case "if_absent":
                return AbstractC0315t.X(T((Map) mapO.get("expression")), T((Map) mapO.get("else")));
            case "subtract":
                return N(mapO, new a() { // from class: s1.n
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.q0(abstractC0315t2);
                    }
                });
            case "array_reverse":
                return AbstractC0315t.n(P(mapO, "expression"));
            case "array_concat":
                return AbstractC0315t.g(T((Map) mapO.get("first")), T((Map) mapO.get("second")), new Object[0]);
            case "bit_left_shift":
                return T((Map) mapO.get("expression")).s(T((Map) mapO.get("amount")));
            case "array_length":
                return AbstractC0315t.m(P(mapO, "expression"));
            case "array_contains_all":
                return H(mapO);
            case "array_contains_any":
                return I(mapO);
            case "array_sum":
                return AbstractC0315t.o(P(mapO, "expression"));
            case "bit_or":
                return N(mapO, new a() { // from class: s1.f
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.u(abstractC0315t2);
                    }
                });
            case "greater_than":
            case "equal":
            case "greater_than_or_equal":
            case "less_than":
            case "less_than_or_equal":
            case "not_equal":
                return M(str2, mapO);
            case "concat":
                List list = (List) mapO.get("expressions");
                if (list == null || list.size() < 2) {
                    throw new IllegalArgumentException("concat requires at least two expressions");
                }
                AbstractC0315t abstractC0315tT = T((Map) list.get(0));
                AbstractC0315t abstractC0315tT2 = T((Map) list.get(1));
                if (list.size() == 2) {
                    return AbstractC0315t.z(abstractC0315tT, abstractC0315tT2, new Object[0]);
                }
                Object[] objArr = new Object[list.size() - 2];
                for (int i3 = 2; i3 < list.size(); i3++) {
                    objArr[i3 - 2] = T((Map) list.get(i3));
                }
                return AbstractC0315t.z(abstractC0315tT, abstractC0315tT2, objArr);
            case "divide":
                return N(mapO, new a() { // from class: s1.p
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.N(abstractC0315t2);
                    }
                });
            case "exists":
                return S(mapO);
            case "as_boolean":
                return K(mapO);
            case "length":
                return AbstractC0315t.c0(P(mapO, "expression"));
            case "modulo":
                return N(mapO, new a() { // from class: s1.d
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.h0(abstractC0315t2);
                    }
                });
            case "negate":
                return AbstractC0315t.r0(AbstractC0315t.G(0), P(mapO, "expression"));
            case "is_absent":
                return V(mapO);
            case "collection_id":
                return AbstractC0315t.y(P(mapO, "expression"));
            case "timestamp_truncate":
                Map map3 = (Map) mapO.get("timestamp");
                String str3 = (String) mapO.get("unit");
                if (str3 != null) {
                    return AbstractC0315t.u0(T(map3), str3);
                }
                throw new IllegalArgumentException("timestamp_truncate requires 'unit'");
            case "constant":
                Object obj = mapO.get("value");
                if (!(obj instanceof Map)) {
                    return AbstractC1211b.b(obj);
                }
                return AbstractC0315t.D(this.f11267a.y((String) ((Map) obj).get("path")));
            case "timestamp_subtract":
                Map map4 = (Map) mapO.get("timestamp");
                String str4 = (String) mapO.get("unit");
                Map map5 = (Map) mapO.get("amount");
                if (str4 == null || map5 == null) {
                    throw new IllegalArgumentException("timestamp_subtract requires 'unit' and 'amount'");
                }
                return AbstractC0315t.t0(T(map4), AbstractC0315t.H(str4), T(map5));
            case "to_lower_case":
                return AbstractC0315t.v0(P(mapO, "expression"));
            case "bit_right_shift":
                return T((Map) mapO.get("expression")).v(T((Map) mapO.get("amount")));
            case "bit_and":
                return N(mapO, new a() { // from class: s1.e
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.r(abstractC0315t2);
                    }
                });
            case "bit_not":
                return P(mapO, "expression").t();
            case "bit_xor":
                return N(mapO, new a() { // from class: s1.g
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.w(abstractC0315t2);
                    }
                });
            case "or":
                return AbstractC1211b.c((List) mapO.get("expressions"), this);
            case "abs":
                return AbstractC0315t.a(P(mapO, "expression"));
            case "add":
                return N(mapO, new a() { // from class: s1.m
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.c(abstractC0315t2);
                    }
                });
            case "and":
                return AbstractC1211b.a((List) mapO.get("expressions"), this);
            case "map":
                Map map6 = (Map) mapO.get("data");
                if (map6 == null) {
                    throw new IllegalArgumentException("map requires 'data'");
                }
                HashMap map7 = new HashMap();
                for (Map.Entry entry : map6.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Map) {
                        Map map8 = (Map) value;
                        if (map8.containsKey("name") && map8.containsKey("args")) {
                            str = (String) entry.getKey();
                            value = T(map8);
                        } else {
                            str = (String) entry.getKey();
                        }
                    } else {
                        str = (String) entry.getKey();
                        value = AbstractC1211b.b(value);
                    }
                    map7.put(str, value);
                }
                return AbstractC0315t.f0(map7);
            case "not":
                return AbstractC0315t.j0(O((Map) mapO.get("expression")));
            case "xor":
                return AbstractC1211b.d((List) mapO.get("expressions"), this);
            case "join":
                return AbstractC0315t.b0(T((Map) mapO.get("expression")), T((Map) mapO.get("delimiter")));
            case "null":
                return AbstractC0315t.m0();
            case "trim":
                return AbstractC0315t.y0(P(mapO, "expression"));
            case "alias":
                return T((Map) mapO.get("expression")).d((String) mapO.get("alias"));
            case "array":
                List list2 = (List) mapO.get("elements");
                if (list2 == null) {
                    throw new IllegalArgumentException("array requires 'elements'");
                }
                Object[] objArr2 = new Object[list2.size()];
                for (int i4 = 0; i4 < list2.size(); i4++) {
                    Object obj2 = list2.get(i4);
                    if (obj2 instanceof Map) {
                        objArr2[i4] = T((Map) obj2);
                    } else {
                        objArr2[i4] = AbstractC1211b.b(obj2);
                    }
                }
                return AbstractC0315t.f(Arrays.asList(objArr2));
            case "field":
                String str5 = (String) mapO.get("field");
                if (str5 != null) {
                    return AbstractC0315t.U(str5);
                }
                throw new IllegalArgumentException("Field expression must have a 'field' argument");
            case "split":
                return AbstractC0315t.o0(T((Map) mapO.get("expression")), T((Map) mapO.get("delimiter")));
            case "is_error":
                return W(mapO);
            case "document_id":
                return AbstractC0315t.O(P(mapO, "expression"));
            case "substring":
                Map map9 = (Map) mapO.get("expression");
                Map map10 = (Map) mapO.get("start");
                Map map11 = (Map) mapO.get("end");
                AbstractC0315t abstractC0315tT3 = T(map9);
                AbstractC0315t abstractC0315tT4 = T(map10);
                return AbstractC0315t.p0(abstractC0315tT3, abstractC0315tT4, AbstractC0315t.r0(T(map11), abstractC0315tT4));
            case "multiply":
                return N(mapO, new a() { // from class: s1.o
                    @Override // s1.q.a
                    public final Object a(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
                        return abstractC0315t.i0(abstractC0315t2);
                    }
                });
            case "map_get":
                return AbstractC0315t.g0(T((Map) mapO.get("map")), T((Map) mapO.get("key")));
            case "document_id_from_ref":
                String str6 = (String) mapO.get("doc_ref");
                if (str6 != null) {
                    return AbstractC0315t.P(this.f11267a.y(str6));
                }
                throw new IllegalArgumentException("document_id_from_ref requires 'doc_ref' argument");
            case "array_slice":
                throw new UnsupportedOperationException("Expression type 'array_slice' is not supported on Android Firestore pipeline API");
            case "array_concat_multiple":
                List list3 = (List) mapO.get("arrays");
                if (list3 == null || list3.size() < 2) {
                    throw new IllegalArgumentException("array_concat_multiple requires at least two arrays");
                }
                int i5 = 0;
                AbstractC0315t abstractC0315tG = AbstractC0315t.g(T((Map) list3.get(0)), T((Map) list3.get(1)), new Object[0]);
                int i6 = 2;
                while (i6 < list3.size()) {
                    abstractC0315tG = abstractC0315tG.h(T((Map) list3.get(i6)), new Object[i5]);
                    i6++;
                    i5 = 0;
                }
                return abstractC0315tG;
            case "to_upper_case":
                return AbstractC0315t.x0(P(mapO, "expression"));
            case "conditional":
                return AbstractC0315t.A(O((Map) mapO.get("condition")), T((Map) mapO.get("then")), T((Map) mapO.get("else")));
            case "if_error":
                return AbstractC0315t.Y(T((Map) mapO.get("expression")), T((Map) mapO.get("catch")));
            case "current_timestamp":
                return AbstractC0315t.L();
            case "timestamp_add":
                Map map12 = (Map) mapO.get("timestamp");
                String str7 = (String) mapO.get("unit");
                Map map13 = (Map) mapO.get("amount");
                if (str7 == null || map13 == null) {
                    throw new IllegalArgumentException("timestamp_add requires 'unit' and 'amount'");
                }
                return AbstractC0315t.s0(T(map12), AbstractC0315t.H(str7), T(map13));
            default:
                Log.w("ExpressionParsers", "Unsupported expression type: " + str2);
                throw new UnsupportedOperationException("Expression type not yet implemented: " + str2);
        }
    }

    K Y(Map map) {
        AbstractC0315t abstractC0315tT = T(map);
        if (abstractC0315tT instanceof K) {
            return (K) abstractC0315tT;
        }
        throw new IllegalArgumentException("Expression must be a Selectable (Field or AliasedExpression). Got: " + map.get("name"));
    }
}
