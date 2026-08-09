package I0;

import com.google.protobuf.AbstractC0791i;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0791i f2230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0.e f2232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t0.e f2233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t0.e f2234e;

    public X(AbstractC0791i abstractC0791i, boolean z2, t0.e eVar, t0.e eVar2, t0.e eVar3) {
        this.f2230a = abstractC0791i;
        this.f2231b = z2;
        this.f2232c = eVar;
        this.f2233d = eVar2;
        this.f2234e = eVar3;
    }

    public static X a(boolean z2, AbstractC0791i abstractC0791i) {
        return new X(abstractC0791i, z2, D0.l.h(), D0.l.h(), D0.l.h());
    }

    public t0.e b() {
        return this.f2232c;
    }

    public t0.e c() {
        return this.f2233d;
    }

    public t0.e d() {
        return this.f2234e;
    }

    public AbstractC0791i e() {
        return this.f2230a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X.class != obj.getClass()) {
            return false;
        }
        X x2 = (X) obj;
        if (this.f2231b == x2.f2231b && this.f2230a.equals(x2.f2230a) && this.f2232c.equals(x2.f2232c) && this.f2233d.equals(x2.f2233d)) {
            return this.f2234e.equals(x2.f2234e);
        }
        return false;
    }

    public boolean f() {
        return this.f2231b;
    }

    public int hashCode() {
        return (((((((this.f2230a.hashCode() * 31) + (this.f2231b ? 1 : 0)) * 31) + this.f2232c.hashCode()) * 31) + this.f2233d.hashCode()) * 31) + this.f2234e.hashCode();
    }
}
