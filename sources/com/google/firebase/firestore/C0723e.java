package com.google.firebase.firestore;

import com.google.firebase.firestore.AbstractC0715a;
import com.google.firebase.firestore.C0754u;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.firebase.firestore.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0723e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0721d f6326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f6327b;

    C0723e(C0721d c0721d, Map map) {
        J0.C.b(c0721d);
        this.f6326a = c0721d;
        this.f6327b = map;
    }

    private Object a(Object obj, AbstractC0715a abstractC0715a, Class cls) {
        if (obj == null) {
            return null;
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        throw new RuntimeException("AggregateField '" + abstractC0715a.c() + "' is not a " + cls.getName());
    }

    private Object g(AbstractC0715a abstractC0715a) {
        if (this.f6327b.containsKey(abstractC0715a.c())) {
            return new W0(this.f6326a.d().f6177b, C0754u.a.f6410d).f((V0.I) this.f6327b.get(abstractC0715a.c()));
        }
        throw new IllegalArgumentException("'" + abstractC0715a.e() + "(" + abstractC0715a.d() + ")' was not requested in the aggregation query.");
    }

    private Object i(AbstractC0715a abstractC0715a, Class cls) {
        return a(g(abstractC0715a), abstractC0715a, cls);
    }

    public long b(AbstractC0715a.c cVar) {
        Long lH = h(cVar);
        if (lH != null) {
            return lH.longValue();
        }
        throw new IllegalArgumentException("RunAggregationQueryResponse alias " + cVar.c() + " is null");
    }

    public Double c(AbstractC0715a.b bVar) {
        return f(bVar);
    }

    public Object d(AbstractC0715a abstractC0715a) {
        return g(abstractC0715a);
    }

    public long e() {
        return b(AbstractC0715a.b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0723e)) {
            return false;
        }
        C0723e c0723e = (C0723e) obj;
        return this.f6326a.equals(c0723e.f6326a) && this.f6327b.equals(c0723e.f6327b);
    }

    public Double f(AbstractC0715a abstractC0715a) {
        Number number = (Number) i(abstractC0715a, Number.class);
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }

    public Long h(AbstractC0715a abstractC0715a) {
        Number number = (Number) i(abstractC0715a, Number.class);
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    public int hashCode() {
        return Objects.hash(this.f6326a, this.f6327b);
    }
}
