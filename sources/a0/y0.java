package A0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0.t f309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E0.d f310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f311c;

    y0(D0.t tVar, E0.d dVar, List list) {
        this.f309a = tVar;
        this.f310b = dVar;
        this.f311c = list;
    }

    public E0.f a(D0.l lVar, E0.m mVar) {
        E0.d dVar = this.f310b;
        return dVar != null ? new E0.l(lVar, this.f309a, dVar, mVar, this.f311c) : new E0.o(lVar, this.f309a, mVar, this.f311c);
    }
}
