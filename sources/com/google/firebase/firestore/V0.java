package com.google.firebase.firestore;

import E0.a;
import F0.AbstractC0315t;
import J0.AbstractC0386b;
import V0.C0423b;
import V0.I;
import V0.x;
import com.google.firebase.firestore.AbstractC0762y;
import e0.InterfaceC0823d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0.f f6293a;

    public V0(D0.f fVar) {
        this.f6293a = fVar;
    }

    private D0.t a(Object obj, A0.x0 x0Var) {
        if (obj.getClass().isArray()) {
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
        }
        V0.I iD = d(J0.r.c(obj), x0Var);
        if (iD.F0()) {
            return new D0.t(iD);
        }
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: " + J0.L.w(obj));
    }

    private List c(List list) {
        A0.w0 w0Var = new A0.w0(A0.A0.Argument);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            arrayList.add(b(list.get(i3), w0Var.f().c(i3)));
        }
        return arrayList;
    }

    private V0.I d(Object obj, A0.x0 x0Var) {
        if (obj instanceof Map) {
            return f((Map) obj, x0Var);
        }
        if (obj instanceof AbstractC0762y) {
            k((AbstractC0762y) obj, x0Var);
            return null;
        }
        if (x0Var.h() != null) {
            x0Var.a(x0Var.h());
        }
        if (!(obj instanceof List)) {
            return j(obj, x0Var);
        }
        if (!x0Var.i() || x0Var.g() == A0.A0.ArrayArgument) {
            return e((List) obj, x0Var);
        }
        throw x0Var.f("Nested arrays are not supported");
    }

    private V0.I e(List list, A0.x0 x0Var) {
        C0423b.C0068b c0068bJ0 = C0423b.j0();
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            V0.I iD = d(it.next(), x0Var.c(i3));
            if (iD == null) {
                iD = (V0.I) V0.I.J0().I(com.google.protobuf.e0.NULL_VALUE).n();
            }
            c0068bJ0.x(iD);
            i3++;
        }
        return (V0.I) V0.I.J0().x(c0068bJ0).n();
    }

    private V0.I f(Map map, A0.x0 x0Var) {
        I.b bVarG;
        if (map.isEmpty()) {
            if (x0Var.h() != null && !x0Var.h().isEmpty()) {
                x0Var.a(x0Var.h());
            }
            bVarG = V0.I.J0().H(V0.x.b0());
        } else {
            x.b bVarJ0 = V0.x.j0();
            for (Map.Entry entry : map.entrySet()) {
                if (!(entry.getKey() instanceof String)) {
                    throw x0Var.f(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
                }
                String str = (String) entry.getKey();
                V0.I iD = d(entry.getValue(), x0Var.e(str));
                if (iD != null) {
                    bVarJ0.y(str, iD);
                }
            }
            bVarG = V0.I.J0().G(bVarJ0);
        }
        return (V0.I) bVarG.n();
    }

    private void k(AbstractC0762y abstractC0762y, A0.x0 x0Var) {
        E0.p jVar;
        D0.r rVarH;
        if (!x0Var.j()) {
            throw x0Var.f(String.format("%s() can only be used with set() and update()", abstractC0762y.d()));
        }
        if (x0Var.h() == null) {
            throw x0Var.f(String.format("%s() is not currently supported inside arrays", abstractC0762y.d()));
        }
        if (abstractC0762y instanceof AbstractC0762y.c) {
            if (x0Var.g() == A0.A0.MergeSet) {
                x0Var.a(x0Var.h());
                return;
            } else {
                if (x0Var.g() != A0.A0.Update) {
                    throw x0Var.f("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
                }
                AbstractC0386b.d(x0Var.h().w() > 0, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
                throw x0Var.f("FieldValue.delete() can only appear at the top level of your update data");
            }
        }
        if (abstractC0762y instanceof AbstractC0762y.e) {
            rVarH = x0Var.h();
            jVar = E0.n.d();
        } else {
            if (abstractC0762y instanceof AbstractC0762y.b) {
                jVar = new a.b(c(((AbstractC0762y.b) abstractC0762y).i()));
            } else if (abstractC0762y instanceof AbstractC0762y.a) {
                jVar = new a.C0010a(c(((AbstractC0762y.a) abstractC0762y).i()));
            } else {
                if (!(abstractC0762y instanceof AbstractC0762y.d)) {
                    throw AbstractC0386b.a("Unknown FieldValue type: %s", J0.L.w(abstractC0762y));
                }
                jVar = new E0.j(h(((AbstractC0762y.d) abstractC0762y).i()));
            }
            rVarH = x0Var.h();
        }
        x0Var.b(rVarH, jVar);
    }

    public V0.I b(Object obj, A0.x0 x0Var) {
        return d(J0.r.c(obj), x0Var);
    }

    public A0.y0 g(Object obj, E0.d dVar) {
        A0.w0 w0Var = new A0.w0(A0.A0.MergeSet);
        D0.t tVarA = a(obj, w0Var.f());
        if (dVar == null) {
            return w0Var.g(tVarA);
        }
        for (D0.r rVar : dVar.c()) {
            if (!w0Var.d(rVar)) {
                throw new IllegalArgumentException("Field '" + rVar.toString() + "' is specified in your field mask but not in your input data.");
            }
        }
        return w0Var.h(tVarA, dVar);
    }

    public V0.I h(Object obj) {
        return i(obj, false);
    }

    public V0.I i(Object obj, boolean z2) {
        A0.w0 w0Var = new A0.w0(z2 ? A0.A0.ArrayArgument : A0.A0.Argument);
        V0.I iB = b(obj, w0Var.f());
        AbstractC0386b.d(iB != null, "Parsed data should not be null.", new Object[0]);
        AbstractC0386b.d(w0Var.e().isEmpty(), "Field transforms should have been disallowed.", new Object[0]);
        return iB;
    }

    public V0.I j(Object obj, final A0.x0 x0Var) {
        if (obj == null) {
            return D0.z.f1310c;
        }
        if (obj.getClass().isArray()) {
            throw x0Var.f("Arrays are not supported; use a List instead");
        }
        if (obj instanceof C0752t) {
            C0752t c0752t = (C0752t) obj;
            Objects.requireNonNull(x0Var);
            n(c0752t, new InterfaceC0823d() { // from class: com.google.firebase.firestore.U0
                @Override // e0.InterfaceC0823d
                public final Object c(Object obj2) {
                    return x0Var.f((String) obj2);
                }
            });
            return D0.z.A(c0752t);
        }
        if (obj instanceof AbstractC0315t) {
            throw x0Var.f("Pipeline expressions are not supported user objects");
        }
        try {
            return D0.z.t(obj);
        } catch (IllegalArgumentException unused) {
            throw x0Var.f("Unsupported type: " + J0.L.w(obj));
        }
    }

    public A0.y0 l(Object obj) {
        A0.w0 w0Var = new A0.w0(A0.A0.Set);
        return w0Var.i(a(obj, w0Var.f()));
    }

    public A0.z0 m(List list) {
        AbstractC0386b.d(list.size() % 2 == 0, "Expected fieldAndValues to contain an even number of elements", new Object[0]);
        A0.w0 w0Var = new A0.w0(A0.A0.Update);
        A0.x0 x0VarF = w0Var.f();
        D0.t tVar = new D0.t();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object next2 = it.next();
            boolean z2 = next instanceof String;
            AbstractC0386b.d(z2 || (next instanceof C0760x), "Expected argument to be String or FieldPath.", new Object[0]);
            D0.r rVarC = (z2 ? C0760x.b((String) next) : (C0760x) next).c();
            if (next2 instanceof AbstractC0762y.c) {
                x0VarF.a(rVarC);
            } else {
                V0.I iB = b(next2, x0VarF.d(rVarC));
                if (iB != null) {
                    x0VarF.a(rVarC);
                    tVar.l(rVarC, iB);
                }
            }
        }
        return w0Var.j(tVar);
    }

    public void n(C0752t c0752t, InterfaceC0823d interfaceC0823d) {
        D0.f fVarB = c0752t.p().B();
        if (!fVarB.equals(this.f6293a)) {
            throw ((RuntimeException) interfaceC0823d.c(String.format("Document reference is for database %s/%s but should be for database %s/%s", fVarB.i(), fVarB.h(), this.f6293a.i(), this.f6293a.h())));
        }
    }
}
