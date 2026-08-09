package I0;

import I0.b0;
import V0.C0428g;
import c.AbstractC0527b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Z f2241b = new Z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f2242a = new CopyOnWriteArrayList();

    static abstract class a {
        a() {
        }

        static a d(C0373n c0373n, boolean z2, int i3, int i4, int i5) {
            return new C0371l(c0373n, z2, i3, i4, i5);
        }

        static a e(C0373n c0373n, b0.b bVar, C0377s c0377s) {
            C0428g c0428gB = c0377s.b();
            if (c0428gB == null) {
                return null;
            }
            return d(c0373n, bVar == b0.b.SUCCESS, c0428gB.c0(), c0428gB.a0().a0().size(), c0428gB.a0().c0());
        }

        abstract boolean a();

        abstract int b();

        abstract C0373n c();

        abstract int f();

        abstract int g();
    }

    static abstract class b {
        b() {
        }

        static b b(int i3, int i4, String str, String str2, a aVar) {
            return new C0372m(i3, i4, str, str2, aVar);
        }

        static b e(int i3, C0377s c0377s, D0.f fVar, C0373n c0373n, b0.b bVar) {
            return b(i3, c0377s.a(), fVar.i(), fVar.h(), a.e(c0373n, bVar, c0377s));
        }

        abstract a a();

        abstract String c();

        abstract int d();

        abstract int f();

        abstract String g();
    }

    private Z() {
    }

    static Z a() {
        return f2241b;
    }

    void b(b bVar) {
        Iterator it = this.f2242a.iterator();
        while (it.hasNext()) {
            AbstractC0527b.a(((AtomicReference) it.next()).get());
        }
    }
}
