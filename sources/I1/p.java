package I1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class p implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private U1.a f2414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f2415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f2416c;

    public p(U1.a initializer, Object obj) {
        kotlin.jvm.internal.m.e(initializer, "initializer");
        this.f2414a = initializer;
        this.f2415b = s.f2418a;
        this.f2416c = obj == null ? this : obj;
    }

    @Override // I1.g
    public boolean d() {
        return this.f2415b != s.f2418a;
    }

    @Override // I1.g
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f2415b;
        s sVar = s.f2418a;
        if (obj != sVar) {
            return obj;
        }
        synchronized (this.f2416c) {
            objInvoke = this.f2415b;
            if (objInvoke == sVar) {
                U1.a aVar = this.f2414a;
                kotlin.jvm.internal.m.b(aVar);
                objInvoke = aVar.invoke();
                this.f2415b = objInvoke;
                this.f2414a = null;
            }
        }
        return objInvoke;
    }

    public String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ p(U1.a aVar, Object obj, int i3, kotlin.jvm.internal.h hVar) {
        this(aVar, (i3 & 2) != 0 ? null : obj);
    }
}
