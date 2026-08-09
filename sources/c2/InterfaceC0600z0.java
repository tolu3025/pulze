package c2;

import M1.g;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: c2.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0600z0 extends g.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f5183i = b.f5184a;

    /* JADX INFO: renamed from: c2.z0$b */
    public static final class b implements g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f5184a = new b();

        private b() {
        }
    }

    InterfaceC0589u attachChild(InterfaceC0593w interfaceC0593w);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    a2.c getChildren();

    k2.a getOnJoin();

    InterfaceC0600z0 getParent();

    InterfaceC0561f0 invokeOnCompletion(U1.l lVar);

    InterfaceC0561f0 invokeOnCompletion(boolean z2, boolean z3, U1.l lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(M1.d dVar);

    InterfaceC0600z0 plus(InterfaceC0600z0 interfaceC0600z0);

    boolean start();

    /* JADX INFO: renamed from: c2.z0$a */
    public static final class a {
        public static /* synthetic */ void b(InterfaceC0600z0 interfaceC0600z0, CancellationException cancellationException, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i3 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC0600z0.cancel(cancellationException);
        }

        public static Object c(InterfaceC0600z0 interfaceC0600z0, Object obj, U1.p pVar) {
            return g.b.a.a(interfaceC0600z0, obj, pVar);
        }

        public static g.b d(InterfaceC0600z0 interfaceC0600z0, g.c cVar) {
            return g.b.a.b(interfaceC0600z0, cVar);
        }

        public static M1.g e(InterfaceC0600z0 interfaceC0600z0, g.c cVar) {
            return g.b.a.c(interfaceC0600z0, cVar);
        }

        public static M1.g f(InterfaceC0600z0 interfaceC0600z0, M1.g gVar) {
            return g.b.a.d(interfaceC0600z0, gVar);
        }

        public static InterfaceC0600z0 g(InterfaceC0600z0 interfaceC0600z0, InterfaceC0600z0 interfaceC0600z02) {
            return interfaceC0600z02;
        }
    }
}
