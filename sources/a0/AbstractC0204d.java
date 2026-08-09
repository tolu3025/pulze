package A0;

import J0.AbstractC0386b;
import android.app.Activity;
import android.app.Fragment;
import com.google.firebase.firestore.InterfaceC0720c0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: A0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0204d {

    /* JADX INFO: renamed from: A0.d$b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f116a;

        private b() {
            this.f116a = new ArrayList();
        }

        synchronized void a(Runnable runnable) {
            this.f116a.add(runnable);
        }

        void b() {
            for (Runnable runnable : this.f116a) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    /* JADX INFO: renamed from: A0.d$c */
    public static class c extends Fragment {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        b f117a = new b();

        @Override // android.app.Fragment
        public void onStop() {
            b bVar;
            super.onStop();
            synchronized (this.f117a) {
                bVar = this.f117a;
                this.f117a = new b();
            }
            bVar.b();
        }
    }

    /* JADX INFO: renamed from: A0.d$d, reason: collision with other inner class name */
    public static class C0000d extends androidx.fragment.app.Fragment {

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        b f118d0 = new b();

        @Override // androidx.fragment.app.Fragment
        public void z0() {
            b bVar;
            super.z0();
            synchronized (this.f118d0) {
                bVar = this.f118d0;
                this.f118d0 = new b();
            }
            bVar.b();
        }
    }

    public static InterfaceC0720c0 c(Activity activity, final InterfaceC0720c0 interfaceC0720c0) {
        if (activity != null) {
            if (activity instanceof androidx.fragment.app.d) {
                Objects.requireNonNull(interfaceC0720c0);
                h((androidx.fragment.app.d) activity, new Runnable() { // from class: A0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC0720c0.remove();
                    }
                });
            } else {
                Objects.requireNonNull(interfaceC0720c0);
                g(activity, new Runnable() { // from class: A0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC0720c0.remove();
                    }
                });
            }
        }
        return interfaceC0720c0;
    }

    private static Object d(Class cls, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Fragment with tag '" + str + "' is a " + obj.getClass().getName() + " but should be a " + cls.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Activity activity, Runnable runnable) {
        c cVar = (c) d(c.class, activity.getFragmentManager().findFragmentByTag("FirestoreOnStopObserverFragment"), "FirestoreOnStopObserverFragment");
        if (cVar == null || cVar.isRemoving()) {
            cVar = new c();
            activity.getFragmentManager().beginTransaction().add(cVar, "FirestoreOnStopObserverFragment").commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        cVar.f117a.a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(androidx.fragment.app.d dVar, Runnable runnable) {
        C0000d c0000d = (C0000d) d(C0000d.class, dVar.I().d("FirestoreOnStopObserverSupportFragment"), "FirestoreOnStopObserverSupportFragment");
        if (c0000d == null || c0000d.S()) {
            c0000d = new C0000d();
            dVar.I().a().b(c0000d, "FirestoreOnStopObserverSupportFragment").e();
            dVar.I().c();
        }
        c0000d.f118d0.a(runnable);
    }

    private static void g(final Activity activity, final Runnable runnable) {
        AbstractC0386b.d(!(activity instanceof androidx.fragment.app.d), "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", new Object[0]);
        activity.runOnUiThread(new Runnable() { // from class: A0.c
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0204d.e(activity, runnable);
            }
        });
    }

    private static void h(final androidx.fragment.app.d dVar, final Runnable runnable) {
        dVar.runOnUiThread(new Runnable() { // from class: A0.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0204d.f(dVar, runnable);
            }
        });
    }
}
