package h2;

import c2.AbstractC0550a;

/* JADX INFO: loaded from: classes.dex */
public class z extends AbstractC0550a implements kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M1.d f7480d;

    public z(M1.g gVar, M1.d dVar) {
        super(gVar, true, true);
        this.f7480d = dVar;
    }

    @Override // c2.AbstractC0550a
    protected void I0(Object obj) {
        M1.d dVar = this.f7480d;
        dVar.resumeWith(c2.E.a(obj, dVar));
    }

    @Override // c2.F0
    protected final boolean e0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        M1.d dVar = this.f7480d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // c2.F0
    protected void w(Object obj) {
        AbstractC0892i.b(N1.c.c(this.f7480d), c2.E.a(obj, this.f7480d));
    }
}
