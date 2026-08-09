package l2;

import h2.A;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
final class k extends A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f9827e;

    public k(long j3, k kVar, int i3) {
        super(j3, kVar, i3);
        this.f9827e = new AtomicReferenceArray(j.f9826f);
    }

    @Override // h2.A
    public int r() {
        return j.f9826f;
    }

    @Override // h2.A
    public void s(int i3, Throwable th, M1.g gVar) {
        v().set(i3, j.f9825e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f7422c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f9827e;
    }
}
