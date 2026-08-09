package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0516e;
import androidx.lifecycle.DefaultLifecycleObserver;
import g1.InterfaceC0872a;
import h1.InterfaceC0881a;
import h1.InterfaceC0883c;
import i1.AbstractC0903a;
import io.flutter.plugins.imagepicker.l;
import io.flutter.plugins.imagepicker.p;
import l1.InterfaceC1017c;

/* JADX INFO: loaded from: classes.dex */
public class ImagePickerPlugin implements InterfaceC0872a, InterfaceC0881a, p.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0872a.b f8008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    b f8009d;

    private class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f8010a;

        LifeCycleObserver(Activity activity) {
            this.f8010a = activity;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void a(androidx.lifecycle.i iVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void b(androidx.lifecycle.i iVar) {
            onActivityDestroyed(this.f8010a);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void c(androidx.lifecycle.i iVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void f(androidx.lifecycle.i iVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void g(androidx.lifecycle.i iVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void h(androidx.lifecycle.i iVar) {
            onActivityStopped(this.f8010a);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f8010a != activity || activity.getApplicationContext() == null) {
                return;
            }
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (this.f8010a == activity) {
                ImagePickerPlugin.this.f8009d.b().W();
            }
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8013b;

        static {
            int[] iArr = new int[p.m.values().length];
            f8013b = iArr;
            try {
                iArr[p.m.GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8013b[p.m.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[p.k.values().length];
            f8012a = iArr2;
            try {
                iArr2[p.k.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8012a[p.k.REAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Application f8014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f8015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private l f8016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private LifeCycleObserver f8017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private InterfaceC0883c f8018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private InterfaceC1017c f8019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private AbstractC0516e f8020g;

        b(Application application, Activity activity, InterfaceC1017c interfaceC1017c, p.f fVar, InterfaceC0883c interfaceC0883c) {
            this.f8014a = application;
            this.f8015b = activity;
            this.f8018e = interfaceC0883c;
            this.f8019f = interfaceC1017c;
            this.f8016c = ImagePickerPlugin.this.e(activity);
            u.f(interfaceC1017c, fVar);
            this.f8017d = ImagePickerPlugin.this.new LifeCycleObserver(activity);
            interfaceC0883c.e(this.f8016c);
            interfaceC0883c.f(this.f8016c);
            AbstractC0516e abstractC0516eA = AbstractC0903a.a(interfaceC0883c);
            this.f8020g = abstractC0516eA;
            abstractC0516eA.a(this.f8017d);
        }

        Activity a() {
            return this.f8015b;
        }

        l b() {
            return this.f8016c;
        }

        void c() {
            InterfaceC0883c interfaceC0883c = this.f8018e;
            if (interfaceC0883c != null) {
                interfaceC0883c.g(this.f8016c);
                this.f8018e.h(this.f8016c);
                this.f8018e = null;
            }
            AbstractC0516e abstractC0516e = this.f8020g;
            if (abstractC0516e != null) {
                abstractC0516e.c(this.f8017d);
                this.f8020g = null;
            }
            u.f(this.f8019f, null);
            Application application = this.f8014a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.f8017d);
                this.f8014a = null;
            }
            this.f8015b = null;
            this.f8017d = null;
            this.f8016c = null;
        }
    }

    private l h() {
        b bVar = this.f8009d;
        if (bVar == null || bVar.a() == null) {
            return null;
        }
        return this.f8009d.b();
    }

    private void i(l lVar, p.l lVar2) {
        p.k kVarB = lVar2.b();
        if (kVarB != null) {
            lVar.X(a.f8012a[kVarB.ordinal()] != 1 ? l.c.REAR : l.c.FRONT);
        }
    }

    private void k(InterfaceC1017c interfaceC1017c, Application application, Activity activity, InterfaceC0883c interfaceC0883c) {
        this.f8009d = new b(application, activity, interfaceC1017c, this, interfaceC0883c);
    }

    private void l() {
        b bVar = this.f8009d;
        if (bVar != null) {
            bVar.c();
            this.f8009d = null;
        }
    }

    @Override // g1.InterfaceC0872a
    public void A(InterfaceC0872a.b bVar) {
        this.f8008c = bVar;
    }

    @Override // h1.InterfaceC0881a
    public void C() {
        j();
    }

    @Override // io.flutter.plugins.imagepicker.p.f
    public void a(p.i iVar, p.e eVar, p.j jVar) {
        l lVarH = h();
        if (lVarH == null) {
            jVar.b(new p.d("no_activity", "image_picker plugin requires a foreground activity.", null));
        } else {
            lVarH.l(iVar, eVar, jVar);
        }
    }

    @Override // io.flutter.plugins.imagepicker.p.f
    public void b(p.l lVar, p.h hVar, p.e eVar, p.j jVar) {
        l lVarH = h();
        if (lVarH == null) {
            jVar.b(new p.d("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        i(lVarH, lVar);
        if (eVar.b().booleanValue()) {
            lVarH.m(hVar, eVar.d().booleanValue(), n.a(eVar), jVar);
            return;
        }
        int i3 = a.f8013b[lVar.c().ordinal()];
        if (i3 == 1) {
            lVarH.k(hVar, eVar.d().booleanValue(), jVar);
        } else {
            if (i3 != 2) {
                return;
            }
            lVarH.Z(hVar, jVar);
        }
    }

    @Override // io.flutter.plugins.imagepicker.p.f
    public void c(p.l lVar, p.n nVar, p.e eVar, p.j jVar) {
        l lVarH = h();
        if (lVarH == null) {
            jVar.b(new p.d("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        i(lVarH, lVar);
        if (eVar.b().booleanValue()) {
            jVar.b(new RuntimeException("Multi-video selection is not implemented"));
            return;
        }
        int i3 = a.f8013b[lVar.c().ordinal()];
        if (i3 == 1) {
            lVarH.n(nVar, eVar.d().booleanValue(), jVar);
        } else {
            if (i3 != 2) {
                return;
            }
            lVarH.a0(nVar, jVar);
        }
    }

    @Override // io.flutter.plugins.imagepicker.p.f
    public p.b d() {
        l lVarH = h();
        if (lVarH != null) {
            return lVarH.V();
        }
        throw new p.d("no_activity", "image_picker plugin requires a foreground activity.", null);
    }

    final l e(Activity activity) {
        return new l(activity, new o(activity, new io.flutter.plugins.imagepicker.a()), new c(activity));
    }

    @Override // h1.InterfaceC0881a
    public void f(InterfaceC0883c interfaceC0883c) {
        k(this.f8008c.b(), (Application) this.f8008c.a(), interfaceC0883c.d(), interfaceC0883c);
    }

    @Override // h1.InterfaceC0881a
    public void g(InterfaceC0883c interfaceC0883c) {
        f(interfaceC0883c);
    }

    @Override // h1.InterfaceC0881a
    public void j() {
        l();
    }

    @Override // g1.InterfaceC0872a
    public void y(InterfaceC0872a.b bVar) {
        this.f8008c = null;
    }
}
