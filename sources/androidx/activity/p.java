package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f3694b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private U1.a f3695c;

    public p(boolean z2) {
        this.f3693a = z2;
    }

    public final void a(c cancellable) {
        kotlin.jvm.internal.m.e(cancellable, "cancellable");
        this.f3694b.add(cancellable);
    }

    public final U1.a b() {
        return this.f3695c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(b backEvent) {
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
    }

    public void f(b backEvent) {
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
    }

    public final boolean g() {
        return this.f3693a;
    }

    public final void h() {
        Iterator it = this.f3694b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).cancel();
        }
    }

    public final void i(c cancellable) {
        kotlin.jvm.internal.m.e(cancellable, "cancellable");
        this.f3694b.remove(cancellable);
    }

    public final void j(boolean z2) {
        this.f3693a = z2;
        U1.a aVar = this.f3695c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void k(U1.a aVar) {
        this.f3695c = aVar;
    }
}
