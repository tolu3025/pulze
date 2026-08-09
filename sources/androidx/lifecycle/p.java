package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0516e;

/* JADX INFO: loaded from: classes.dex */
public class p extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4762a = new b(null);

    public interface a {
        void a();

        void b();

        void c();
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.h hVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Activity activity, AbstractC0516e.a event) {
            kotlin.jvm.internal.m.e(activity, "activity");
            kotlin.jvm.internal.m.e(event, "event");
            if (activity instanceof i) {
                AbstractC0516e abstractC0516eA = ((i) activity).a();
                if (abstractC0516eA instanceof j) {
                    ((j) abstractC0516eA).h(event);
                }
            }
        }

        public final void b(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new p(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final void a(Activity activity) {
                kotlin.jvm.internal.m.e(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.m.e(activity, "activity");
            p.f4762a.a(activity, AbstractC0516e.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            p.f4762a.a(activity, AbstractC0516e.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            p.f4762a.a(activity, AbstractC0516e.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            p.f4762a.a(activity, AbstractC0516e.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            p.f4762a.a(activity, AbstractC0516e.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            p.f4762a.a(activity, AbstractC0516e.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.m.e(activity, "activity");
            kotlin.jvm.internal.m.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }
    }

    private final void a(AbstractC0516e.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f4762a;
            Activity activity = getActivity();
            kotlin.jvm.internal.m.d(activity, "activity");
            bVar.a(activity, aVar);
        }
    }

    private final void b(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private final void c(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    private final void d(a aVar) {
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(null);
        a(AbstractC0516e.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(AbstractC0516e.a.ON_DESTROY);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(AbstractC0516e.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        c(null);
        a(AbstractC0516e.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        d(null);
        a(AbstractC0516e.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(AbstractC0516e.a.ON_STOP);
    }
}
