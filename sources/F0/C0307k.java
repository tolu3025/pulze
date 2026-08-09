package F0;

import com.google.firebase.firestore.V0;

/* JADX INFO: renamed from: F0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0307k extends AbstractC0305i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC0315t f1482d;

    public C0307k(AbstractC0315t expr) {
        kotlin.jvm.internal.m.e(expr, "expr");
        this.f1482d = expr;
    }

    public final AbstractC0315t C0() {
        return this.f1482d;
    }

    @Override // F0.AbstractC0315t
    public U1.l S(G0.Q context) {
        kotlin.jvm.internal.m.e(context, "context");
        return this.f1482d.S(context);
    }

    public boolean equals(Object obj) {
        AbstractC0315t abstractC0315t;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0307k) {
            abstractC0315t = this.f1482d;
            obj = ((C0307k) obj).f1482d;
        } else {
            if (!(obj instanceof z)) {
                return false;
            }
            abstractC0315t = this.f1482d;
        }
        return kotlin.jvm.internal.m.a(abstractC0315t, obj);
    }

    public int hashCode() {
        return this.f1482d.hashCode();
    }

    public String toString() {
        return this.f1482d.toString();
    }

    @Override // F0.AbstractC0315t
    public V0.I w0(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return this.f1482d.w0(userDataReader);
    }

    @Override // F0.AbstractC0315t
    public String x() {
        return this.f1482d.x();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0307k(String name, U1.l function, AbstractC0315t param) {
        this(name, function, new AbstractC0315t[]{param});
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(function, "function");
        kotlin.jvm.internal.m.e(param, "param");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0307k(String name, U1.l function, AbstractC0315t param1, AbstractC0315t param2) {
        this(name, function, new AbstractC0315t[]{param1, param2});
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(function, "function");
        kotlin.jvm.internal.m.e(param1, "param1");
        kotlin.jvm.internal.m.e(param2, "param2");
    }

    public C0307k(String name, U1.l function, AbstractC0315t param, Object... params) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(function, "function");
        kotlin.jvm.internal.m.e(param, "param");
        kotlin.jvm.internal.m.e(params, "params");
        kotlin.jvm.internal.B b3 = new kotlin.jvm.internal.B(2);
        b3.a(param);
        b3.b(AbstractC0315t.f1490a.r0(params));
        this(name, function, (AbstractC0315t[]) b3.d(new AbstractC0315t[b3.c()]));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0307k(String name, U1.l function, AbstractC0315t[] params) {
        this(new z(name, function, params, null, 8, null));
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(function, "function");
        kotlin.jvm.internal.m.e(params, "params");
    }
}
