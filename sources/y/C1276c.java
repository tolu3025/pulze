package y;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0516e;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: y.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1276c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11731d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1277d f11732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.savedstate.a f11733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11734c;

    /* JADX INFO: renamed from: y.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final C1276c a(InterfaceC1277d owner) {
            m.e(owner, "owner");
            return new C1276c(owner, null);
        }
    }

    private C1276c(InterfaceC1277d interfaceC1277d) {
        this.f11732a = interfaceC1277d;
        this.f11733b = new androidx.savedstate.a();
    }

    public static final C1276c a(InterfaceC1277d interfaceC1277d) {
        return f11731d.a(interfaceC1277d);
    }

    public final androidx.savedstate.a b() {
        return this.f11733b;
    }

    public final void c() {
        AbstractC0516e abstractC0516eA = this.f11732a.a();
        if (abstractC0516eA.b() != AbstractC0516e.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        abstractC0516eA.a(new Recreator(this.f11732a));
        this.f11733b.e(abstractC0516eA);
        this.f11734c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f11734c) {
            c();
        }
        AbstractC0516e abstractC0516eA = this.f11732a.a();
        if (!abstractC0516eA.b().e(AbstractC0516e.b.STARTED)) {
            this.f11733b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + abstractC0516eA.b()).toString());
    }

    public final void e(Bundle outBundle) {
        m.e(outBundle, "outBundle");
        this.f11733b.g(outBundle);
    }

    public /* synthetic */ C1276c(InterfaceC1277d interfaceC1277d, h hVar) {
        this(interfaceC1277d);
    }
}
