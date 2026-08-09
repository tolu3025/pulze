package androidx.activity;

import J1.C0402f;
import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC0516e;
import j.InterfaceC0980a;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f3642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0980a f3643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0402f f3644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p f3645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnBackInvokedCallback f3646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnBackInvokedDispatcher f3647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f3648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f3649h;

    private final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.g, androidx.activity.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC0516e f3650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p f3651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.activity.c f3652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f3653d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC0516e lifecycle, p onBackPressedCallback) {
            kotlin.jvm.internal.m.e(lifecycle, "lifecycle");
            kotlin.jvm.internal.m.e(onBackPressedCallback, "onBackPressedCallback");
            this.f3653d = onBackPressedDispatcher;
            this.f3650a = lifecycle;
            this.f3651b = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.c
        public void cancel() {
            this.f3650a.c(this);
            this.f3651b.i(this);
            androidx.activity.c cVar = this.f3652c;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f3652c = null;
        }

        @Override // androidx.lifecycle.g
        public void d(androidx.lifecycle.i source, AbstractC0516e.a event) {
            kotlin.jvm.internal.m.e(source, "source");
            kotlin.jvm.internal.m.e(event, "event");
            if (event == AbstractC0516e.a.ON_START) {
                this.f3652c = this.f3653d.i(this.f3651b);
                return;
            }
            if (event != AbstractC0516e.a.ON_STOP) {
                if (event == AbstractC0516e.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.c cVar = this.f3652c;
                if (cVar != null) {
                    cVar.cancel();
                }
            }
        }
    }

    static final class a extends kotlin.jvm.internal.n implements U1.l {
        a() {
            super(1);
        }

        public final void b(androidx.activity.b backEvent) {
            kotlin.jvm.internal.m.e(backEvent, "backEvent");
            OnBackPressedDispatcher.this.m(backEvent);
        }

        @Override // U1.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((androidx.activity.b) obj);
            return I1.u.f2419a;
        }
    }

    static final class b extends kotlin.jvm.internal.n implements U1.l {
        b() {
            super(1);
        }

        public final void b(androidx.activity.b backEvent) {
            kotlin.jvm.internal.m.e(backEvent, "backEvent");
            OnBackPressedDispatcher.this.l(backEvent);
        }

        @Override // U1.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((androidx.activity.b) obj);
            return I1.u.f2419a;
        }
    }

    static final class c extends kotlin.jvm.internal.n implements U1.a {
        c() {
            super(0);
        }

        public final void b() {
            OnBackPressedDispatcher.this.k();
        }

        @Override // U1.a
        public /* bridge */ /* synthetic */ Object invoke() {
            b();
            return I1.u.f2419a;
        }
    }

    static final class d extends kotlin.jvm.internal.n implements U1.a {
        d() {
            super(0);
        }

        public final void b() {
            OnBackPressedDispatcher.this.j();
        }

        @Override // U1.a
        public /* bridge */ /* synthetic */ Object invoke() {
            b();
            return I1.u.f2419a;
        }
    }

    static final class e extends kotlin.jvm.internal.n implements U1.a {
        e() {
            super(0);
        }

        public final void b() {
            OnBackPressedDispatcher.this.k();
        }

        @Override // U1.a
        public /* bridge */ /* synthetic */ Object invoke() {
            b();
            return I1.u.f2419a;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f3659a = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(U1.a onBackInvoked) {
            kotlin.jvm.internal.m.e(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback b(final U1.a onBackInvoked) {
            kotlin.jvm.internal.m.e(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.q
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.f.c(onBackInvoked);
                }
            };
        }

        public final void d(Object dispatcher, int i3, Object callback) {
            kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.m.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i3, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.m.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f3660a = new g();

        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ U1.l f3661a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.l f3662b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ U1.a f3663c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ U1.a f3664d;

            a(U1.l lVar, U1.l lVar2, U1.a aVar, U1.a aVar2) {
                this.f3661a = lVar;
                this.f3662b = lVar2;
                this.f3663c = aVar;
                this.f3664d = aVar2;
            }

            public void onBackCancelled() {
                this.f3664d.invoke();
            }

            public void onBackInvoked() {
                this.f3663c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                kotlin.jvm.internal.m.e(backEvent, "backEvent");
                this.f3662b.invoke(new androidx.activity.b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                kotlin.jvm.internal.m.e(backEvent, "backEvent");
                this.f3661a.invoke(new androidx.activity.b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback a(U1.l onBackStarted, U1.l onBackProgressed, U1.a onBackInvoked, U1.a onBackCancelled) {
            kotlin.jvm.internal.m.e(onBackStarted, "onBackStarted");
            kotlin.jvm.internal.m.e(onBackProgressed, "onBackProgressed");
            kotlin.jvm.internal.m.e(onBackInvoked, "onBackInvoked");
            kotlin.jvm.internal.m.e(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    private final class h implements androidx.activity.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f3665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f3666b;

        public h(OnBackPressedDispatcher onBackPressedDispatcher, p onBackPressedCallback) {
            kotlin.jvm.internal.m.e(onBackPressedCallback, "onBackPressedCallback");
            this.f3666b = onBackPressedDispatcher;
            this.f3665a = onBackPressedCallback;
        }

        @Override // androidx.activity.c
        public void cancel() {
            this.f3666b.f3644c.remove(this.f3665a);
            if (kotlin.jvm.internal.m.a(this.f3666b.f3645d, this.f3665a)) {
                this.f3665a.c();
                this.f3666b.f3645d = null;
            }
            this.f3665a.i(this);
            U1.a aVarB = this.f3665a.b();
            if (aVarB != null) {
                aVarB.invoke();
            }
            this.f3665a.k(null);
        }
    }

    /* synthetic */ class i extends kotlin.jvm.internal.k implements U1.a {
        i(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void c() {
            ((OnBackPressedDispatcher) this.receiver).p();
        }

        @Override // U1.a
        public /* bridge */ /* synthetic */ Object invoke() {
            c();
            return I1.u.f2419a;
        }
    }

    /* synthetic */ class j extends kotlin.jvm.internal.k implements U1.a {
        j(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void c() {
            ((OnBackPressedDispatcher) this.receiver).p();
        }

        @Override // U1.a
        public /* bridge */ /* synthetic */ Object invoke() {
            c();
            return I1.u.f2419a;
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        Object objPrevious;
        p pVar = this.f3645d;
        if (pVar == null) {
            C0402f c0402f = this.f3644c;
            ListIterator<E> listIterator = c0402f.listIterator(c0402f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((p) objPrevious).g()) {
                        break;
                    }
                }
            }
            pVar = (p) objPrevious;
        }
        this.f3645d = null;
        if (pVar != null) {
            pVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(androidx.activity.b bVar) {
        Object objPrevious;
        p pVar = this.f3645d;
        if (pVar == null) {
            C0402f c0402f = this.f3644c;
            ListIterator<E> listIterator = c0402f.listIterator(c0402f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((p) objPrevious).g()) {
                        break;
                    }
                }
            }
            pVar = (p) objPrevious;
        }
        if (pVar != null) {
            pVar.e(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(androidx.activity.b bVar) {
        Object objPrevious;
        C0402f c0402f = this.f3644c;
        ListIterator<E> listIterator = c0402f.listIterator(c0402f.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((p) objPrevious).g()) {
                    break;
                }
            }
        }
        p pVar = (p) objPrevious;
        if (this.f3645d != null) {
            j();
        }
        this.f3645d = pVar;
        if (pVar != null) {
            pVar.f(bVar);
        }
    }

    private final void o(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f3647f;
        OnBackInvokedCallback onBackInvokedCallback = this.f3646e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z2 && !this.f3648g) {
            f.f3659a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f3648g = true;
        } else {
            if (z2 || !this.f3648g) {
                return;
            }
            f.f3659a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f3648g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        boolean z2 = this.f3649h;
        C0402f c0402f = this.f3644c;
        boolean z3 = false;
        if (!(c0402f instanceof Collection) || !c0402f.isEmpty()) {
            Iterator<E> it = c0402f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((p) it.next()).g()) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f3649h = z3;
        if (z3 != z2) {
            InterfaceC0980a interfaceC0980a = this.f3643b;
            if (interfaceC0980a != null) {
                interfaceC0980a.accept(Boolean.valueOf(z3));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                o(z3);
            }
        }
    }

    public final void h(androidx.lifecycle.i owner, p onBackPressedCallback) {
        kotlin.jvm.internal.m.e(owner, "owner");
        kotlin.jvm.internal.m.e(onBackPressedCallback, "onBackPressedCallback");
        AbstractC0516e abstractC0516eA = owner.a();
        if (abstractC0516eA.b() == AbstractC0516e.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new LifecycleOnBackPressedCancellable(this, abstractC0516eA, onBackPressedCallback));
        p();
        onBackPressedCallback.k(new i(this));
    }

    public final androidx.activity.c i(p onBackPressedCallback) {
        kotlin.jvm.internal.m.e(onBackPressedCallback, "onBackPressedCallback");
        this.f3644c.add(onBackPressedCallback);
        h hVar = new h(this, onBackPressedCallback);
        onBackPressedCallback.a(hVar);
        p();
        onBackPressedCallback.k(new j(this));
        return hVar;
    }

    public final void k() {
        Object objPrevious;
        p pVar = this.f3645d;
        if (pVar == null) {
            C0402f c0402f = this.f3644c;
            ListIterator<E> listIterator = c0402f.listIterator(c0402f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((p) objPrevious).g()) {
                        break;
                    }
                }
            }
            pVar = (p) objPrevious;
        }
        this.f3645d = null;
        if (pVar != null) {
            pVar.d();
            return;
        }
        Runnable runnable = this.f3642a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void n(OnBackInvokedDispatcher invoker) {
        kotlin.jvm.internal.m.e(invoker, "invoker");
        this.f3647f = invoker;
        o(this.f3649h);
    }

    public OnBackPressedDispatcher(Runnable runnable, InterfaceC0980a interfaceC0980a) {
        this.f3642a = runnable;
        this.f3643b = interfaceC0980a;
        this.f3644c = new C0402f();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            this.f3646e = i3 >= 34 ? g.f3660a.a(new a(), new b(), new c(), new d()) : f.f3659a.b(new e());
        }
    }
}
