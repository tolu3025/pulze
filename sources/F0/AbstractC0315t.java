package F0;

import F0.AbstractC0315t;
import G0.AbstractC0323a;
import G0.AbstractC0330d0;
import G0.AbstractC0340i0;
import G0.F0;
import G0.n0;
import G0.z0;
import J1.AbstractC0412p;
import com.google.firebase.firestore.C0727g;
import com.google.firebase.firestore.C0751s0;
import com.google.firebase.firestore.C0752t;
import com.google.firebase.firestore.C0760x;
import com.google.firebase.firestore.V0;
import com.google.firebase.firestore.X0;
import com.google.firebase.firestore.Z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k0.C1004r;

/* JADX INFO: renamed from: F0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0315t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1490a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC0315t f1491b = new b(D0.z.f1310c);

    /* JADX INFO: renamed from: F0.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        private final AbstractC0315t k0(Object obj) {
            AbstractC0315t abstractC0315tD;
            if (obj == null) {
                abstractC0315tD = AbstractC0315t.f1491b;
            } else if (obj instanceof AbstractC0315t) {
                abstractC0315tD = (AbstractC0315t) obj;
            } else if (obj instanceof String) {
                abstractC0315tD = B((String) obj);
            } else if (obj instanceof Number) {
                abstractC0315tD = A((Number) obj);
            } else if (obj instanceof Date) {
                abstractC0315tD = C((Date) obj);
            } else if (obj instanceof C1004r) {
                abstractC0315tD = D((C1004r) obj);
            } else if (obj instanceof Boolean) {
                abstractC0315tD = v(((Boolean) obj).booleanValue());
            } else if (obj instanceof Z) {
                abstractC0315tD = y((Z) obj);
            } else if (obj instanceof C0727g) {
                abstractC0315tD = w((C0727g) obj);
            } else if (obj instanceof C0752t) {
                abstractC0315tD = x((C0752t) obj);
            } else if (obj instanceof byte[]) {
                abstractC0315tD = E((byte[]) obj);
            } else if (obj instanceof X0) {
                abstractC0315tD = z((X0) obj);
            } else if (obj instanceof V0.I) {
                abstractC0315tD = new b((V0.I) obj);
            } else if (obj instanceof Map) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (!(key instanceof String)) {
                        throw new IllegalArgumentException("Maps with non-string keys are not supported");
                    }
                    J1.u.r(arrayList, AbstractC0412p.j(AbstractC0315t.f1490a.B((String) key), k0(entry.getValue())));
                }
                abstractC0315tD = a0((AbstractC0315t[]) arrayList.toArray(new AbstractC0315t[0]));
            } else {
                abstractC0315tD = obj instanceof List ? d((List) obj) : obj instanceof C0751s0 ? new F((C0751s0) obj) : null;
            }
            if (abstractC0315tD != null) {
                return abstractC0315tD;
            }
            throw new IllegalArgumentException("Unknown type: " + obj);
        }

        public final AbstractC0315t A(Number value) {
            kotlin.jvm.internal.m.e(value, "value");
            return new b(D0.z.F(value));
        }

        public final AbstractC0315t B(String value) {
            kotlin.jvm.internal.m.e(value, "value");
            return new b(D0.z.G(value));
        }

        public final AbstractC0315t C(Date value) {
            kotlin.jvm.internal.m.e(value, "value");
            return new b(D0.z.H(value));
        }

        public final AbstractC0315t D(C1004r value) {
            kotlin.jvm.internal.m.e(value, "value");
            return new b(D0.z.J(value));
        }

        public final AbstractC0315t E(byte[] value) {
            kotlin.jvm.internal.m.e(value, "value");
            return new b(D0.z.L(value));
        }

        public final AbstractC0315t F() {
            return new z("current_timestamp", F0.a());
        }

        public final AbstractC0315t G(AbstractC0315t dividend, AbstractC0315t divisor) {
            kotlin.jvm.internal.m.e(dividend, "dividend");
            kotlin.jvm.internal.m.e(divisor, "divisor");
            return new z("divide", AbstractC0323a.d(), dividend, divisor);
        }

        public final AbstractC0315t H(AbstractC0315t documentPath) {
            kotlin.jvm.internal.m.e(documentPath, "documentPath");
            return new z("document_id", F0.a(), documentPath);
        }

        public final AbstractC0315t I(C0752t docRef) {
            kotlin.jvm.internal.m.e(docRef, "docRef");
            return H(x(docRef));
        }

        public final AbstractC0305i J(AbstractC0315t left, AbstractC0315t right) {
            kotlin.jvm.internal.m.e(left, "left");
            kotlin.jvm.internal.m.e(right, "right");
            return new C0307k("equal", G0.G.a(), left, right);
        }

        public final AbstractC0305i K(AbstractC0315t expression, AbstractC0315t arrayExpression) {
            kotlin.jvm.internal.m.e(expression, "expression");
            kotlin.jvm.internal.m.e(arrayExpression, "arrayExpression");
            return new C0307k("equal_any", G0.F.E0(), expression, arrayExpression);
        }

        public final AbstractC0305i L(AbstractC0315t expression, List values) {
            kotlin.jvm.internal.m.e(expression, "expression");
            kotlin.jvm.internal.m.e(values, "values");
            return K(expression, d(values));
        }

        public final AbstractC0305i M(AbstractC0315t value) {
            kotlin.jvm.internal.m.e(value, "value");
            return new C0307k("exists", G0.J.e(), value);
        }

        public final w N(C0760x fieldPath) {
            kotlin.jvm.internal.m.e(fieldPath, "fieldPath");
            D0.r rVarC = fieldPath.c();
            kotlin.jvm.internal.m.d(rVarC, "getInternalPath(...)");
            return new w(rVarC);
        }

        public final w O(String name) {
            kotlin.jvm.internal.m.e(name, "name");
            int iHashCode = name.hashCode();
            if (iHashCode != -1178228688) {
                if (iHashCode != -625729597) {
                    if (iHashCode == -281103477 && name.equals("__name__")) {
                        D0.r KEY_PATH = D0.r.f1277b;
                        kotlin.jvm.internal.m.d(KEY_PATH, "KEY_PATH");
                        return new w(KEY_PATH);
                    }
                } else if (name.equals("__update_time__")) {
                    D0.r UPDATE_TIME_PATH = D0.r.f1278c;
                    kotlin.jvm.internal.m.d(UPDATE_TIME_PATH, "UPDATE_TIME_PATH");
                    return new w(UPDATE_TIME_PATH);
                }
            } else if (name.equals("__create_time__")) {
                D0.r CREATE_TIME_PATH = D0.r.f1279d;
                kotlin.jvm.internal.m.d(CREATE_TIME_PATH, "CREATE_TIME_PATH");
                return new w(CREATE_TIME_PATH);
            }
            D0.r rVarC = C0760x.b(name).c();
            kotlin.jvm.internal.m.d(rVarC, "getInternalPath(...)");
            return new w(rVarC);
        }

        public final AbstractC0305i P(AbstractC0315t left, AbstractC0315t right) {
            kotlin.jvm.internal.m.e(left, "left");
            kotlin.jvm.internal.m.e(right, "right");
            return new C0307k("greater_than", G0.G.b(), left, right);
        }

        public final AbstractC0305i Q(AbstractC0315t left, AbstractC0315t right) {
            kotlin.jvm.internal.m.e(left, "left");
            kotlin.jvm.internal.m.e(right, "right");
            return new C0307k("greater_than_or_equal", G0.G.c(), left, right);
        }

        public final AbstractC0315t R(AbstractC0315t ifExpr, AbstractC0315t elseExpr) {
            kotlin.jvm.internal.m.e(ifExpr, "ifExpr");
            kotlin.jvm.internal.m.e(elseExpr, "elseExpr");
            return new z("if_absent", F0.a(), ifExpr, elseExpr);
        }

        public final AbstractC0315t S(AbstractC0315t tryExpr, AbstractC0315t catchExpr) {
            kotlin.jvm.internal.m.e(tryExpr, "tryExpr");
            kotlin.jvm.internal.m.e(catchExpr, "catchExpr");
            return new z("if_error", F0.a(), tryExpr, catchExpr);
        }

        public final AbstractC0305i T(AbstractC0315t value) {
            kotlin.jvm.internal.m.e(value, "value");
            return new C0307k("is_absent", G0.J.f(), value);
        }

        public final AbstractC0305i U(AbstractC0315t expr) {
            kotlin.jvm.internal.m.e(expr, "expr");
            return new C0307k("is_error", G0.J.g(), expr);
        }

        public final AbstractC0315t V(AbstractC0315t arrayExpression, AbstractC0315t delimiterExpression) {
            kotlin.jvm.internal.m.e(arrayExpression, "arrayExpression");
            kotlin.jvm.internal.m.e(delimiterExpression, "delimiterExpression");
            return new z("join", G0.F.F0(), arrayExpression, delimiterExpression);
        }

        public final AbstractC0315t W(AbstractC0315t expr) {
            kotlin.jvm.internal.m.e(expr, "expr");
            return new z("length", G0.U.g(), expr);
        }

        public final AbstractC0305i X(AbstractC0315t left, AbstractC0315t right) {
            kotlin.jvm.internal.m.e(left, "left");
            kotlin.jvm.internal.m.e(right, "right");
            return new C0307k("less_than", G0.G.d(), left, right);
        }

        public final AbstractC0305i Y(AbstractC0315t left, AbstractC0315t right) {
            kotlin.jvm.internal.m.e(left, "left");
            kotlin.jvm.internal.m.e(right, "right");
            return new C0307k("less_than_or_equal", G0.G.e(), left, right);
        }

        public final AbstractC0315t Z(Map elements) {
            kotlin.jvm.internal.m.e(elements, "elements");
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : elements.entrySet()) {
                a aVar = AbstractC0315t.f1490a;
                J1.u.r(arrayList, AbstractC0412p.j(aVar.B((String) entry.getKey()), aVar.s0(entry.getValue())));
            }
            return a0((AbstractC0315t[]) arrayList.toArray(new AbstractC0315t[0]));
        }

        public final AbstractC0315t a(AbstractC0315t numericExpr) {
            kotlin.jvm.internal.m.e(numericExpr, "numericExpr");
            return new z("abs", AbstractC0323a.a(), numericExpr);
        }

        public final AbstractC0315t a0(AbstractC0315t[] elements) {
            kotlin.jvm.internal.m.e(elements, "elements");
            return new z("map", AbstractC0340i0.e(), elements, null, 8, null);
        }

        public final AbstractC0315t b(AbstractC0315t first, AbstractC0315t second) {
            kotlin.jvm.internal.m.e(first, "first");
            kotlin.jvm.internal.m.e(second, "second");
            return new z("add", AbstractC0323a.b(), first, second);
        }

        public final AbstractC0315t b0(AbstractC0315t mapExpression, AbstractC0315t keyExpression) {
            kotlin.jvm.internal.m.e(mapExpression, "mapExpression");
            kotlin.jvm.internal.m.e(keyExpression, "keyExpression");
            return new z("map_get", AbstractC0340i0.f(), mapExpression, keyExpression);
        }

        public final AbstractC0305i c(AbstractC0305i condition, AbstractC0305i... conditions) {
            kotlin.jvm.internal.m.e(condition, "condition");
            kotlin.jvm.internal.m.e(conditions, "conditions");
            return new C0307k("and", AbstractC0330d0.q(), condition, Arrays.copyOf(conditions, conditions.length));
        }

        public final AbstractC0315t c0(AbstractC0315t dividend, AbstractC0315t divisor) {
            kotlin.jvm.internal.m.e(dividend, "dividend");
            kotlin.jvm.internal.m.e(divisor, "divisor");
            return new z("mod", AbstractC0323a.f(), dividend, divisor);
        }

        public final AbstractC0315t d(List elements) {
            kotlin.jvm.internal.m.e(elements, "elements");
            U1.l lVarM0 = G0.F.m0();
            ArrayList arrayList = new ArrayList(J1.q.n(elements, 10));
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                arrayList.add(s0(it.next()));
            }
            return new z("array", lVarM0, (AbstractC0315t[]) arrayList.toArray(new AbstractC0315t[0]), null, 8, null);
        }

        public final AbstractC0315t d0(AbstractC0315t first, AbstractC0315t second) {
            kotlin.jvm.internal.m.e(first, "first");
            kotlin.jvm.internal.m.e(second, "second");
            return new z("multiply", AbstractC0323a.g(), first, second);
        }

        public final AbstractC0315t e(AbstractC0315t firstArray, AbstractC0315t secondArray, Object... otherArrays) {
            kotlin.jvm.internal.m.e(firstArray, "firstArray");
            kotlin.jvm.internal.m.e(secondArray, "secondArray");
            kotlin.jvm.internal.m.e(otherArrays, "otherArrays");
            return new z("array_concat", G0.F.n0(), firstArray, secondArray, Arrays.copyOf(otherArrays, otherArrays.length));
        }

        public final AbstractC0305i e0(AbstractC0305i condition) {
            kotlin.jvm.internal.m.e(condition, "condition");
            return new C0307k("not", G0.G.g(), condition);
        }

        public final AbstractC0305i f(AbstractC0315t array, AbstractC0315t element) {
            kotlin.jvm.internal.m.e(array, "array");
            kotlin.jvm.internal.m.e(element, "element");
            return new C0307k("array_contains", G0.F.o0(), array, element);
        }

        public final AbstractC0305i f0(AbstractC0315t left, AbstractC0315t right) {
            kotlin.jvm.internal.m.e(left, "left");
            kotlin.jvm.internal.m.e(right, "right");
            return new C0307k("not_equal", G0.G.f(), left, right);
        }

        public final AbstractC0305i g(AbstractC0315t array, AbstractC0315t arrayExpression) {
            kotlin.jvm.internal.m.e(array, "array");
            kotlin.jvm.internal.m.e(arrayExpression, "arrayExpression");
            return new C0307k("array_contains_all", G0.F.p0(), array, arrayExpression);
        }

        public final AbstractC0305i g0(AbstractC0315t expression, AbstractC0315t arrayExpression) {
            kotlin.jvm.internal.m.e(expression, "expression");
            kotlin.jvm.internal.m.e(arrayExpression, "arrayExpression");
            return new C0307k("not_equal_any", G0.F.G0(), expression, arrayExpression);
        }

        public final AbstractC0305i h(AbstractC0315t array, List values) {
            kotlin.jvm.internal.m.e(array, "array");
            kotlin.jvm.internal.m.e(values, "values");
            return g(array, d(values));
        }

        public final AbstractC0305i h0(AbstractC0315t expression, List values) {
            kotlin.jvm.internal.m.e(expression, "expression");
            kotlin.jvm.internal.m.e(values, "values");
            return g0(expression, d(values));
        }

        public final AbstractC0305i i(AbstractC0315t array, List values) {
            kotlin.jvm.internal.m.e(array, "array");
            kotlin.jvm.internal.m.e(values, "values");
            return new C0307k("array_contains_any", G0.F.q0(), array, d(values));
        }

        public final AbstractC0315t i0() {
            return AbstractC0315t.f1491b;
        }

        public final AbstractC0315t j(AbstractC0315t array) {
            kotlin.jvm.internal.m.e(array, "array");
            return new z("array_length", G0.F.y0(), array);
        }

        public final AbstractC0305i j0(AbstractC0305i condition, AbstractC0305i... conditions) {
            kotlin.jvm.internal.m.e(condition, "condition");
            kotlin.jvm.internal.m.e(conditions, "conditions");
            return new C0307k("or", AbstractC0330d0.y(), condition, Arrays.copyOf(conditions, conditions.length));
        }

        public final AbstractC0315t k(AbstractC0315t array) {
            kotlin.jvm.internal.m.e(array, "array");
            return new z("array_reverse", G0.F.D0(), array);
        }

        public final AbstractC0315t l(AbstractC0315t array) {
            kotlin.jvm.internal.m.e(array, "array");
            return new z("sum", F0.a(), array);
        }

        public final AbstractC0315t l0(AbstractC0315t value, AbstractC0315t delimiter) {
            kotlin.jvm.internal.m.e(value, "value");
            kotlin.jvm.internal.m.e(delimiter, "delimiter");
            return new z("split", F0.a(), value, delimiter);
        }

        public final AbstractC0315t m(AbstractC0315t bits, AbstractC0315t bitsOther) {
            kotlin.jvm.internal.m.e(bits, "bits");
            kotlin.jvm.internal.m.e(bitsOther, "bitsOther");
            return new z("bit_and", F0.a(), bits, bitsOther);
        }

        public final AbstractC0315t m0(AbstractC0315t stringExpression, AbstractC0315t index, AbstractC0315t length) {
            kotlin.jvm.internal.m.e(stringExpression, "stringExpression");
            kotlin.jvm.internal.m.e(index, "index");
            kotlin.jvm.internal.m.e(length, "length");
            return new z("substring", n0.v(), stringExpression, index, length);
        }

        public final AbstractC0315t n(AbstractC0315t bits, AbstractC0315t numberExpr) {
            kotlin.jvm.internal.m.e(bits, "bits");
            kotlin.jvm.internal.m.e(numberExpr, "numberExpr");
            return new z("bit_left_shift", F0.a(), bits, numberExpr);
        }

        public final AbstractC0315t n0(AbstractC0315t minuend, AbstractC0315t subtrahend) {
            kotlin.jvm.internal.m.e(minuend, "minuend");
            kotlin.jvm.internal.m.e(subtrahend, "subtrahend");
            return new z("subtract", AbstractC0323a.k(), minuend, subtrahend);
        }

        public final AbstractC0315t o(AbstractC0315t bits) {
            kotlin.jvm.internal.m.e(bits, "bits");
            return new z("bit_not", F0.a(), bits);
        }

        public final AbstractC0315t o0(AbstractC0315t timestamp, AbstractC0315t unit, AbstractC0315t amount) {
            kotlin.jvm.internal.m.e(timestamp, "timestamp");
            kotlin.jvm.internal.m.e(unit, "unit");
            kotlin.jvm.internal.m.e(amount, "amount");
            return new z("timestamp_add", z0.d(), timestamp, unit, amount);
        }

        public final AbstractC0315t p(AbstractC0315t bits, AbstractC0315t bitsOther) {
            kotlin.jvm.internal.m.e(bits, "bits");
            kotlin.jvm.internal.m.e(bitsOther, "bitsOther");
            return new z("bit_or", F0.a(), bits, bitsOther);
        }

        public final AbstractC0315t p0(AbstractC0315t timestamp, AbstractC0315t unit, AbstractC0315t amount) {
            kotlin.jvm.internal.m.e(timestamp, "timestamp");
            kotlin.jvm.internal.m.e(unit, "unit");
            kotlin.jvm.internal.m.e(amount, "amount");
            return new z("timestamp_subtract", z0.e(), timestamp, unit, amount);
        }

        public final AbstractC0315t q(AbstractC0315t bits, AbstractC0315t numberExpr) {
            kotlin.jvm.internal.m.e(bits, "bits");
            kotlin.jvm.internal.m.e(numberExpr, "numberExpr");
            return new z("bit_right_shift", F0.a(), bits, numberExpr);
        }

        public final AbstractC0315t q0(AbstractC0315t timestamp, String granularity) {
            kotlin.jvm.internal.m.e(timestamp, "timestamp");
            kotlin.jvm.internal.m.e(granularity, "granularity");
            return new z("timestamp_trunc", F0.a(), timestamp, B(granularity));
        }

        public final AbstractC0315t r(AbstractC0315t bits, AbstractC0315t bitsOther) {
            kotlin.jvm.internal.m.e(bits, "bits");
            kotlin.jvm.internal.m.e(bitsOther, "bitsOther");
            return new z("bit_xor", F0.a(), bits, bitsOther);
        }

        public final AbstractC0315t[] r0(Object[] others) {
            kotlin.jvm.internal.m.e(others, "others");
            ArrayList arrayList = new ArrayList(others.length);
            for (Object obj : others) {
                arrayList.add(s0(obj));
            }
            return (AbstractC0315t[]) arrayList.toArray(new AbstractC0315t[0]);
        }

        public final AbstractC0315t s(AbstractC0315t path) {
            kotlin.jvm.internal.m.e(path, "path");
            return new z("collection_id", F0.a(), path);
        }

        public final AbstractC0315t s0(Object obj) {
            AbstractC0315t abstractC0315tD;
            if (obj == null) {
                abstractC0315tD = AbstractC0315t.f1491b;
            } else if (obj instanceof AbstractC0315t) {
                abstractC0315tD = (AbstractC0315t) obj;
            } else if (obj instanceof String) {
                abstractC0315tD = B((String) obj);
            } else if (obj instanceof Number) {
                abstractC0315tD = A((Number) obj);
            } else if (obj instanceof Date) {
                abstractC0315tD = C((Date) obj);
            } else if (obj instanceof C1004r) {
                abstractC0315tD = D((C1004r) obj);
            } else if (obj instanceof Boolean) {
                abstractC0315tD = v(((Boolean) obj).booleanValue());
            } else if (obj instanceof Z) {
                abstractC0315tD = y((Z) obj);
            } else if (obj instanceof C0727g) {
                abstractC0315tD = w((C0727g) obj);
            } else if (obj instanceof C0752t) {
                abstractC0315tD = x((C0752t) obj);
            } else if (obj instanceof byte[]) {
                abstractC0315tD = E((byte[]) obj);
            } else if (obj instanceof X0) {
                abstractC0315tD = z((X0) obj);
            } else if (obj instanceof V0.I) {
                abstractC0315tD = new b((V0.I) obj);
            } else if (obj instanceof Map) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (!(key instanceof String)) {
                        throw new IllegalArgumentException("Maps with non-string keys are not supported");
                    }
                    J1.u.r(arrayList, AbstractC0412p.j(AbstractC0315t.f1490a.B((String) key), s0(entry.getValue())));
                }
                abstractC0315tD = a0((AbstractC0315t[]) arrayList.toArray(new AbstractC0315t[0]));
            } else {
                abstractC0315tD = obj instanceof List ? d((List) obj) : obj instanceof C0751s0 ? new F((C0751s0) obj) : null;
            }
            return abstractC0315tD == null ? k0(J0.r.c(obj)) : abstractC0315tD;
        }

        public final AbstractC0315t t(AbstractC0315t first, AbstractC0315t second, Object... others) {
            kotlin.jvm.internal.m.e(first, "first");
            kotlin.jvm.internal.m.e(second, "second");
            kotlin.jvm.internal.m.e(others, "others");
            return new z("concat", G0.U.f(), first, second, Arrays.copyOf(others, others.length));
        }

        public final AbstractC0315t t0(AbstractC0315t stringExpression) {
            kotlin.jvm.internal.m.e(stringExpression, "stringExpression");
            return new z("to_lower", n0.w(), stringExpression);
        }

        public final AbstractC0315t u(AbstractC0305i condition, AbstractC0315t thenExpr, AbstractC0315t elseExpr) {
            kotlin.jvm.internal.m.e(condition, "condition");
            kotlin.jvm.internal.m.e(thenExpr, "thenExpr");
            kotlin.jvm.internal.m.e(elseExpr, "elseExpr");
            return new z("conditional", AbstractC0330d0.r(), condition, thenExpr, elseExpr);
        }

        public final AbstractC0315t u0(AbstractC0315t stringExpression) {
            kotlin.jvm.internal.m.e(stringExpression, "stringExpression");
            return new z("to_upper", n0.x(), stringExpression);
        }

        public final AbstractC0305i v(boolean z2) {
            return new C0304h(new b(D0.z.K(z2)));
        }

        public final AbstractC0315t v0(AbstractC0315t stringExpression) {
            kotlin.jvm.internal.m.e(stringExpression, "stringExpression");
            return new z("trim", n0.y(), stringExpression);
        }

        public final AbstractC0315t w(C0727g value) {
            kotlin.jvm.internal.m.e(value, "value");
            return new b(D0.z.z(value));
        }

        public final AbstractC0315t w0(double[] vector) {
            kotlin.jvm.internal.m.e(vector, "vector");
            return new b(D0.z.M(vector));
        }

        public final AbstractC0315t x(C0752t ref) {
            kotlin.jvm.internal.m.e(ref, "ref");
            return new b(D0.z.A(ref));
        }

        public final AbstractC0305i x0(AbstractC0305i condition, AbstractC0305i... conditions) {
            kotlin.jvm.internal.m.e(condition, "condition");
            kotlin.jvm.internal.m.e(conditions, "conditions");
            return new C0307k("xor", AbstractC0330d0.z(), condition, Arrays.copyOf(conditions, conditions.length));
        }

        public final AbstractC0315t y(Z value) {
            kotlin.jvm.internal.m.e(value, "value");
            return new b(D0.z.B(value));
        }

        public final AbstractC0315t z(X0 value) {
            kotlin.jvm.internal.m.e(value, "value");
            return new b(D0.z.C(value));
        }
    }

    /* JADX INFO: renamed from: F0.t$b */
    public static final class b extends AbstractC0315t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final V0.I f1492c;

        public b(V0.I value) {
            kotlin.jvm.internal.m.e(value, "value");
            this.f1492c = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final G0.P C0(b bVar, D0.s sVar) {
            kotlin.jvm.internal.m.e(sVar, "<unused var>");
            return new G0.P(bVar.f1492c);
        }

        public final V0.I D0() {
            return this.f1492c;
        }

        @Override // F0.AbstractC0315t
        public U1.l S(G0.Q context) {
            kotlin.jvm.internal.m.e(context, "context");
            return new U1.l() { // from class: F0.u
                @Override // U1.l
                public final Object invoke(Object obj) {
                    return AbstractC0315t.b.C0(this.f1493a, (D0.s) obj);
                }
            };
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return kotlin.jvm.internal.m.a(this.f1492c, ((b) obj).f1492c);
            }
            return false;
        }

        public int hashCode() {
            return this.f1492c.hashCode();
        }

        public String toString() {
            return x();
        }

        @Override // F0.AbstractC0315t
        public V0.I w0(V0 userDataReader) {
            kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
            return this.f1492c;
        }

        @Override // F0.AbstractC0315t
        public String x() {
            return "cst(" + D0.z.c(this.f1492c) + ')';
        }
    }

    public static final AbstractC0315t A(AbstractC0305i abstractC0305i, AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
        return f1490a.u(abstractC0305i, abstractC0315t, abstractC0315t2);
    }

    public static final AbstractC0305i A0(AbstractC0305i abstractC0305i, AbstractC0305i... abstractC0305iArr) {
        return f1490a.x0(abstractC0305i, abstractC0305iArr);
    }

    public static final AbstractC0305i B(boolean z2) {
        return f1490a.v(z2);
    }

    public static final AbstractC0315t C(C0727g c0727g) {
        return f1490a.w(c0727g);
    }

    public static final AbstractC0315t D(C0752t c0752t) {
        return f1490a.x(c0752t);
    }

    public static final AbstractC0315t E(Z z2) {
        return f1490a.y(z2);
    }

    public static final AbstractC0315t F(X0 x02) {
        return f1490a.z(x02);
    }

    public static final AbstractC0315t G(Number number) {
        return f1490a.A(number);
    }

    public static final AbstractC0315t H(String str) {
        return f1490a.B(str);
    }

    public static final AbstractC0315t I(Date date) {
        return f1490a.C(date);
    }

    public static final AbstractC0315t J(C1004r c1004r) {
        return f1490a.D(c1004r);
    }

    public static final AbstractC0315t K(byte[] bArr) {
        return f1490a.E(bArr);
    }

    public static final AbstractC0315t L() {
        return f1490a.F();
    }

    public static final AbstractC0315t O(AbstractC0315t abstractC0315t) {
        return f1490a.H(abstractC0315t);
    }

    public static final AbstractC0315t P(C0752t c0752t) {
        return f1490a.I(c0752t);
    }

    public static final w U(String str) {
        return f1490a.O(str);
    }

    public static final AbstractC0315t X(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
        return f1490a.R(abstractC0315t, abstractC0315t2);
    }

    public static final AbstractC0315t Y(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
        return f1490a.S(abstractC0315t, abstractC0315t2);
    }

    public static final AbstractC0315t a(AbstractC0315t abstractC0315t) {
        return f1490a.a(abstractC0315t);
    }

    public static final AbstractC0315t b0(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
        return f1490a.V(abstractC0315t, abstractC0315t2);
    }

    public static final AbstractC0315t c0(AbstractC0315t abstractC0315t) {
        return f1490a.W(abstractC0315t);
    }

    public static final AbstractC0305i e(AbstractC0305i abstractC0305i, AbstractC0305i... abstractC0305iArr) {
        return f1490a.c(abstractC0305i, abstractC0305iArr);
    }

    public static final AbstractC0315t f(List list) {
        return f1490a.d(list);
    }

    public static final AbstractC0315t f0(Map map) {
        return f1490a.Z(map);
    }

    public static final AbstractC0315t g(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2, Object... objArr) {
        return f1490a.e(abstractC0315t, abstractC0315t2, objArr);
    }

    public static final AbstractC0315t g0(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
        return f1490a.b0(abstractC0315t, abstractC0315t2);
    }

    public static final AbstractC0305i j0(AbstractC0305i abstractC0305i) {
        return f1490a.e0(abstractC0305i);
    }

    public static final AbstractC0315t m(AbstractC0315t abstractC0315t) {
        return f1490a.j(abstractC0315t);
    }

    public static final AbstractC0315t m0() {
        return f1490a.i0();
    }

    public static final AbstractC0315t n(AbstractC0315t abstractC0315t) {
        return f1490a.k(abstractC0315t);
    }

    public static final AbstractC0305i n0(AbstractC0305i abstractC0305i, AbstractC0305i... abstractC0305iArr) {
        return f1490a.j0(abstractC0305i, abstractC0305iArr);
    }

    public static final AbstractC0315t o(AbstractC0315t abstractC0315t) {
        return f1490a.l(abstractC0315t);
    }

    public static final AbstractC0315t o0(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
        return f1490a.l0(abstractC0315t, abstractC0315t2);
    }

    public static final AbstractC0315t p0(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2, AbstractC0315t abstractC0315t3) {
        return f1490a.m0(abstractC0315t, abstractC0315t2, abstractC0315t3);
    }

    public static final AbstractC0315t r0(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2) {
        return f1490a.n0(abstractC0315t, abstractC0315t2);
    }

    public static final AbstractC0315t s0(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2, AbstractC0315t abstractC0315t3) {
        return f1490a.o0(abstractC0315t, abstractC0315t2, abstractC0315t3);
    }

    public static final AbstractC0315t t0(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2, AbstractC0315t abstractC0315t3) {
        return f1490a.p0(abstractC0315t, abstractC0315t2, abstractC0315t3);
    }

    public static final AbstractC0315t u0(AbstractC0315t abstractC0315t, String str) {
        return f1490a.q0(abstractC0315t, str);
    }

    public static final AbstractC0315t v0(AbstractC0315t abstractC0315t) {
        return f1490a.t0(abstractC0315t);
    }

    public static final AbstractC0315t x0(AbstractC0315t abstractC0315t) {
        return f1490a.u0(abstractC0315t);
    }

    public static final AbstractC0315t y(AbstractC0315t abstractC0315t) {
        return f1490a.s(abstractC0315t);
    }

    public static final AbstractC0315t y0(AbstractC0315t abstractC0315t) {
        return f1490a.v0(abstractC0315t);
    }

    public static final AbstractC0315t z(AbstractC0315t abstractC0315t, AbstractC0315t abstractC0315t2, Object... objArr) {
        return f1490a.t(abstractC0315t, abstractC0315t2, objArr);
    }

    public static final AbstractC0315t z0(double[] dArr) {
        return f1490a.w0(dArr);
    }

    public final E M() {
        return E.f1424c.b(this);
    }

    public final AbstractC0315t N(AbstractC0315t divisor) {
        kotlin.jvm.internal.m.e(divisor, "divisor");
        return f1490a.G(this, divisor);
    }

    public final AbstractC0305i Q(AbstractC0315t other) {
        kotlin.jvm.internal.m.e(other, "other");
        return f1490a.J(this, other);
    }

    public final AbstractC0305i R(List values) {
        kotlin.jvm.internal.m.e(values, "values");
        return f1490a.L(this, values);
    }

    public abstract U1.l S(G0.Q q2);

    public final AbstractC0305i T() {
        return f1490a.M(this);
    }

    public final AbstractC0305i V(AbstractC0315t other) {
        kotlin.jvm.internal.m.e(other, "other");
        return f1490a.P(this, other);
    }

    public final AbstractC0305i W(AbstractC0315t other) {
        kotlin.jvm.internal.m.e(other, "other");
        return f1490a.Q(this, other);
    }

    public final AbstractC0305i Z() {
        return f1490a.T(this);
    }

    public final AbstractC0305i a0() {
        return f1490a.U(this);
    }

    public final AbstractC0315t c(AbstractC0315t second) {
        kotlin.jvm.internal.m.e(second, "second");
        return f1490a.b(this, second);
    }

    public C0303g d(String alias) {
        kotlin.jvm.internal.m.e(alias, "alias");
        return new C0303g(alias, this);
    }

    public final AbstractC0305i d0(AbstractC0315t other) {
        kotlin.jvm.internal.m.e(other, "other");
        return f1490a.X(this, other);
    }

    public final AbstractC0305i e0(AbstractC0315t other) {
        kotlin.jvm.internal.m.e(other, "other");
        return f1490a.Y(this, other);
    }

    public final AbstractC0315t h(AbstractC0315t secondArray, Object... otherArrays) {
        kotlin.jvm.internal.m.e(secondArray, "secondArray");
        kotlin.jvm.internal.m.e(otherArrays, "otherArrays");
        return f1490a.e(this, secondArray, Arrays.copyOf(otherArrays, otherArrays.length));
    }

    public final AbstractC0315t h0(AbstractC0315t divisor) {
        kotlin.jvm.internal.m.e(divisor, "divisor");
        return f1490a.c0(this, divisor);
    }

    public final AbstractC0305i i(AbstractC0315t element) {
        kotlin.jvm.internal.m.e(element, "element");
        return f1490a.f(this, element);
    }

    public final AbstractC0315t i0(AbstractC0315t second) {
        kotlin.jvm.internal.m.e(second, "second");
        return f1490a.d0(this, second);
    }

    public final AbstractC0305i j(AbstractC0315t arrayExpression) {
        kotlin.jvm.internal.m.e(arrayExpression, "arrayExpression");
        return f1490a.g(this, arrayExpression);
    }

    public final AbstractC0305i k(List values) {
        kotlin.jvm.internal.m.e(values, "values");
        return f1490a.h(this, values);
    }

    public final AbstractC0305i k0(AbstractC0315t other) {
        kotlin.jvm.internal.m.e(other, "other");
        return f1490a.f0(this, other);
    }

    public final AbstractC0305i l(List values) {
        kotlin.jvm.internal.m.e(values, "values");
        return f1490a.i(this, values);
    }

    public final AbstractC0305i l0(List values) {
        kotlin.jvm.internal.m.e(values, "values");
        return f1490a.h0(this, values);
    }

    public final AbstractC0305i p() {
        if (this instanceof AbstractC0305i) {
            return (AbstractC0305i) this;
        }
        if (this instanceof b) {
            return new C0304h((b) this);
        }
        if (this instanceof w) {
            return new C0306j((w) this);
        }
        kotlin.jvm.internal.m.c(this, "null cannot be cast to non-null type com.google.firebase.firestore.pipeline.FunctionExpression");
        return new C0307k((z) this);
    }

    public final E q() {
        return E.f1424c.a(this);
    }

    public final AbstractC0315t q0(AbstractC0315t subtrahend) {
        kotlin.jvm.internal.m.e(subtrahend, "subtrahend");
        return f1490a.n0(this, subtrahend);
    }

    public final AbstractC0315t r(AbstractC0315t bitsOther) {
        kotlin.jvm.internal.m.e(bitsOther, "bitsOther");
        return f1490a.m(this, bitsOther);
    }

    public final AbstractC0315t s(AbstractC0315t numberExpr) {
        kotlin.jvm.internal.m.e(numberExpr, "numberExpr");
        return f1490a.n(this, numberExpr);
    }

    public final AbstractC0315t t() {
        return f1490a.o(this);
    }

    public final AbstractC0315t u(AbstractC0315t bitsOther) {
        kotlin.jvm.internal.m.e(bitsOther, "bitsOther");
        return f1490a.p(this, bitsOther);
    }

    public final AbstractC0315t v(AbstractC0315t numberExpr) {
        kotlin.jvm.internal.m.e(numberExpr, "numberExpr");
        return f1490a.q(this, numberExpr);
    }

    public final AbstractC0315t w(AbstractC0315t bitsOther) {
        kotlin.jvm.internal.m.e(bitsOther, "bitsOther");
        return f1490a.r(this, bitsOther);
    }

    public abstract V0.I w0(V0 v02);

    public abstract String x();
}
