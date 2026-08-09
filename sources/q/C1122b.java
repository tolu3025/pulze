package q;

import M1.d;
import U1.l;
import kotlin.jvm.internal.m;
import p.C1050d;
import p.InterfaceC1051e;

/* JADX INFO: renamed from: q.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1122b implements InterfaceC1051e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f10614a;

    public C1122b(l produceNewData) {
        m.e(produceNewData, "produceNewData");
        this.f10614a = produceNewData;
    }

    @Override // p.InterfaceC1051e
    public Object a(C1050d c1050d, d dVar) {
        return this.f10614a.invoke(c1050d);
    }
}
