package h2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: h2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0899p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7464a = AtomicReferenceFieldUpdater.newUpdater(C0899p.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C0899p(boolean z2) {
        this._cur$volatile = new q(8, z2);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7464a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            int iA = qVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.b.a(f7464a, this, qVar, qVar.l());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7464a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f7464a, this, qVar, qVar.l());
            }
        }
    }

    public final int c() {
        return ((q) f7464a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7464a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            Object objM = qVar.m();
            if (objM != q.f7468h) {
                return objM;
            }
            androidx.concurrent.futures.b.a(f7464a, this, qVar, qVar.l());
        }
    }
}
