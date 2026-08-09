package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i0 f6780c = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f6782b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f6781a = new M();

    private i0() {
    }

    public static i0 a() {
        return f6780c;
    }

    public n0 b(Class cls, n0 n0Var) {
        C.b(cls, "messageType");
        C.b(n0Var, "schema");
        return (n0) this.f6782b.putIfAbsent(cls, n0Var);
    }

    public n0 c(Class cls) {
        C.b(cls, "messageType");
        n0 n0Var = (n0) this.f6782b.get(cls);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0VarA = this.f6781a.a(cls);
        n0 n0VarB = b(cls, n0VarA);
        return n0VarB != null ? n0VarB : n0VarA;
    }

    public n0 d(Object obj) {
        return c(obj.getClass());
    }
}
