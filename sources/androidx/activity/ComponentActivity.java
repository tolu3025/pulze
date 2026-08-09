package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.core.view.C0478e;
import androidx.lifecycle.AbstractC0516e;
import androidx.lifecycle.C;
import androidx.lifecycle.D;
import androidx.lifecycle.E;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0515d;
import androidx.lifecycle.w;
import androidx.lifecycle.z;
import androidx.savedstate.a;
import b.C0518a;
import c.AbstractC0528c;
import j.InterfaceC0980a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import v.AbstractC1252a;
import v.C1255d;
import y.AbstractC1278e;
import y.C1276c;
import y.InterfaceC1277d;

/* JADX INFO: loaded from: classes.dex */
public abstract class ComponentActivity extends androidx.core.app.d implements androidx.lifecycle.i, D, InterfaceC0515d, InterfaceC1277d, r, o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final b f3601A = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0518a f3602c = new C0518a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0478e f3603d = new C0478e(new Runnable() { // from class: androidx.activity.d
        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.D(this.f3673a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1276c f3604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C f3605f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f3606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final I1.g f3607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f3608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicInteger f3609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AbstractC0528c f3610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final CopyOnWriteArrayList f3611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final CopyOnWriteArrayList f3612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final CopyOnWriteArrayList f3613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CopyOnWriteArrayList f3614t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final CopyOnWriteArrayList f3615u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final CopyOnWriteArrayList f3616v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f3617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f3618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final I1.g f3619y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final I1.g f3620z;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3622a = new a();

        private a() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            kotlin.jvm.internal.m.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f3623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C f3624b;

        public final C a() {
            return this.f3624b;
        }

        public final void b(Object obj) {
            this.f3623a = obj;
        }

        public final void c(C c3) {
            this.f3624b = c3;
        }
    }

    private interface d extends Executor {
        void c();

        void q(View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f3625a = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f3626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f3627c;

        public e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(e this$0) {
            kotlin.jvm.internal.m.e(this$0, "this$0");
            Runnable runnable = this$0.f3626b;
            if (runnable != null) {
                kotlin.jvm.internal.m.b(runnable);
                runnable.run();
                this$0.f3626b = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.d
        public void c() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            kotlin.jvm.internal.m.e(runnable, "runnable");
            this.f3626b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            kotlin.jvm.internal.m.d(decorView, "window.decorView");
            if (!this.f3627c) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.e.b(this.f3680a);
                    }
                });
            } else if (kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f3626b;
            if (runnable != null) {
                runnable.run();
                this.f3626b = null;
                if (!ComponentActivity.this.A().c()) {
                    return;
                }
            } else if (SystemClock.uptimeMillis() <= this.f3625a) {
                return;
            }
            this.f3627c = false;
            ComponentActivity.this.getWindow().getDecorView().post(this);
        }

        @Override // androidx.activity.ComponentActivity.d
        public void q(View view) {
            kotlin.jvm.internal.m.e(view, "view");
            if (this.f3627c) {
                return;
            }
            this.f3627c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public static final class f extends AbstractC0528c {
        f() {
        }
    }

    static final class g extends kotlin.jvm.internal.n implements U1.a {
        g() {
            super(0);
        }

        @Override // U1.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w invoke() {
            Application application = ComponentActivity.this.getApplication();
            ComponentActivity componentActivity = ComponentActivity.this;
            return new w(application, componentActivity, componentActivity.getIntent() != null ? ComponentActivity.this.getIntent().getExtras() : null);
        }
    }

    static final class h extends kotlin.jvm.internal.n implements U1.a {

        static final class a extends kotlin.jvm.internal.n implements U1.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ComponentActivity f3632a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ComponentActivity componentActivity) {
                super(0);
                this.f3632a = componentActivity;
            }

            public final void b() {
                this.f3632a.reportFullyDrawn();
            }

            @Override // U1.a
            public /* bridge */ /* synthetic */ Object invoke() {
                b();
                return I1.u.f2419a;
            }
        }

        h() {
            super(0);
        }

        @Override // U1.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            return new n(ComponentActivity.this.f3606l, new a(ComponentActivity.this));
        }
    }

    static final class i extends kotlin.jvm.internal.n implements U1.a {
        i() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(ComponentActivity this$0) {
            kotlin.jvm.internal.m.e(this$0, "this$0");
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e3) {
                if (!kotlin.jvm.internal.m.a(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e3;
                }
            } catch (NullPointerException e4) {
                if (!kotlin.jvm.internal.m.a(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e4;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(ComponentActivity this$0, OnBackPressedDispatcher dispatcher) {
            kotlin.jvm.internal.m.e(this$0, "this$0");
            kotlin.jvm.internal.m.e(dispatcher, "$dispatcher");
            this$0.v(dispatcher);
        }

        @Override // U1.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final OnBackPressedDispatcher invoke() {
            final ComponentActivity componentActivity = ComponentActivity.this;
            final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.k
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity.i.g(componentActivity);
                }
            });
            final ComponentActivity componentActivity2 = ComponentActivity.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper())) {
                    componentActivity2.v(onBackPressedDispatcher);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentActivity.i.i(componentActivity2, onBackPressedDispatcher);
                        }
                    });
                }
            }
            return onBackPressedDispatcher;
        }
    }

    public ComponentActivity() {
        C1276c c1276cA = C1276c.f11731d.a(this);
        this.f3604e = c1276cA;
        this.f3606l = y();
        this.f3607m = I1.i.a(new h());
        this.f3609o = new AtomicInteger();
        this.f3610p = new f();
        this.f3611q = new CopyOnWriteArrayList();
        this.f3612r = new CopyOnWriteArrayList();
        this.f3613s = new CopyOnWriteArrayList();
        this.f3614t = new CopyOnWriteArrayList();
        this.f3615u = new CopyOnWriteArrayList();
        this.f3616v = new CopyOnWriteArrayList();
        if (a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
        }
        a().a(new androidx.lifecycle.g() { // from class: androidx.activity.e
            @Override // androidx.lifecycle.g
            public final void d(androidx.lifecycle.i iVar, AbstractC0516e.a aVar) {
                ComponentActivity.n(this.f3674a, iVar, aVar);
            }
        });
        a().a(new androidx.lifecycle.g() { // from class: androidx.activity.f
            @Override // androidx.lifecycle.g
            public final void d(androidx.lifecycle.i iVar, AbstractC0516e.a aVar) {
                ComponentActivity.o(this.f3675a, iVar, aVar);
            }
        });
        a().a(new androidx.lifecycle.g() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.g
            public void d(androidx.lifecycle.i source, AbstractC0516e.a event) {
                kotlin.jvm.internal.m.e(source, "source");
                kotlin.jvm.internal.m.e(event, "event");
                ComponentActivity.this.z();
                ComponentActivity.this.a().c(this);
            }
        });
        c1276cA.c();
        androidx.lifecycle.t.c(this);
        if (Build.VERSION.SDK_INT <= 23) {
            a().a(new ImmLeaksCleaner(this));
        }
        k().h("android:support:activity-result", new a.c() { // from class: androidx.activity.g
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return ComponentActivity.p(this.f3676a);
            }
        });
        x(new b.b() { // from class: androidx.activity.h
            @Override // b.b
            public final void a(Context context) {
                ComponentActivity.q(this.f3677a, context);
            }
        });
        this.f3619y = I1.i.a(new g());
        this.f3620z = I1.i.a(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(ComponentActivity this$0) {
        kotlin.jvm.internal.m.e(this$0, "this$0");
        this$0.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(ComponentActivity this$0, androidx.lifecycle.i iVar, AbstractC0516e.a event) {
        Window window;
        View viewPeekDecorView;
        kotlin.jvm.internal.m.e(this$0, "this$0");
        kotlin.jvm.internal.m.e(iVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.m.e(event, "event");
        if (event != AbstractC0516e.a.ON_STOP || (window = this$0.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ComponentActivity this$0, androidx.lifecycle.i iVar, AbstractC0516e.a event) {
        kotlin.jvm.internal.m.e(this$0, "this$0");
        kotlin.jvm.internal.m.e(iVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.m.e(event, "event");
        if (event == AbstractC0516e.a.ON_DESTROY) {
            this$0.f3602c.b();
            if (!this$0.isChangingConfigurations()) {
                this$0.e().a();
            }
            this$0.f3606l.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle p(ComponentActivity this$0) {
        kotlin.jvm.internal.m.e(this$0, "this$0");
        Bundle bundle = new Bundle();
        this$0.f3610p.e(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(ComponentActivity this$0, Context it) {
        kotlin.jvm.internal.m.e(this$0, "this$0");
        kotlin.jvm.internal.m.e(it, "it");
        Bundle bundleB = this$0.k().b("android:support:activity-result");
        if (bundleB != null) {
            this$0.f3610p.d(bundleB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(final OnBackPressedDispatcher onBackPressedDispatcher) {
        a().a(new androidx.lifecycle.g() { // from class: androidx.activity.i
            @Override // androidx.lifecycle.g
            public final void d(androidx.lifecycle.i iVar, AbstractC0516e.a aVar) {
                ComponentActivity.w(onBackPressedDispatcher, this, iVar, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(OnBackPressedDispatcher dispatcher, ComponentActivity this$0, androidx.lifecycle.i iVar, AbstractC0516e.a event) {
        kotlin.jvm.internal.m.e(dispatcher, "$dispatcher");
        kotlin.jvm.internal.m.e(this$0, "this$0");
        kotlin.jvm.internal.m.e(iVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.m.e(event, "event");
        if (event == AbstractC0516e.a.ON_CREATE) {
            dispatcher.n(a.f3622a.a(this$0));
        }
    }

    private final d y() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        if (this.f3605f == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f3605f = cVar.a();
            }
            if (this.f3605f == null) {
                this.f3605f = new C();
            }
        }
    }

    public n A() {
        return (n) this.f3607m.getValue();
    }

    public void B() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        E.a(decorView, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView2, "window.decorView");
        F.a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView3, "window.decorView");
        AbstractC1278e.a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView4, "window.decorView");
        u.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView5, "window.decorView");
        t.a(decorView5, this);
    }

    public void C() {
        invalidateOptionsMenu();
    }

    public Object E() {
        return null;
    }

    @Override // androidx.core.app.d, androidx.lifecycle.i
    public AbstractC0516e a() {
        return super.a();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        d dVar = this.f3606l;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        dVar.q(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC0515d
    public AbstractC1252a d() {
        C1255d c1255d = new C1255d(null, 1, null);
        if (getApplication() != null) {
            AbstractC1252a.b bVar = z.a.f4796g;
            Application application = getApplication();
            kotlin.jvm.internal.m.d(application, "application");
            c1255d.c(bVar, application);
        }
        c1255d.c(androidx.lifecycle.t.f4771a, this);
        c1255d.c(androidx.lifecycle.t.f4772b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c1255d.c(androidx.lifecycle.t.f4773c, extras);
        }
        return c1255d;
    }

    @Override // androidx.lifecycle.D
    public C e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
        }
        z();
        C c3 = this.f3605f;
        kotlin.jvm.internal.m.b(c3);
        return c3;
    }

    @Override // androidx.activity.r
    public final OnBackPressedDispatcher j() {
        return (OnBackPressedDispatcher) this.f3620z.getValue();
    }

    @Override // y.InterfaceC1277d
    public final androidx.savedstate.a k() {
        return this.f3604e.b();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i3, int i4, Intent intent) {
        if (this.f3610p.b(i3, i4, intent)) {
            return;
        }
        super.onActivityResult(i3, i4, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        j().k();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.m.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f3611q.iterator();
        while (it.hasNext()) {
            ((InterfaceC0980a) it.next()).accept(newConfig);
        }
    }

    @Override // androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f3604e.d(bundle);
        this.f3602c.c(this);
        super.onCreate(bundle);
        androidx.lifecycle.p.f4762a.b(this);
        int i3 = this.f3608n;
        if (i3 != 0) {
            setContentView(i3);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i3, Menu menu) {
        kotlin.jvm.internal.m.e(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        this.f3603d.a(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, MenuItem item) {
        kotlin.jvm.internal.m.e(item, "item");
        if (super.onMenuItemSelected(i3, item)) {
            return true;
        }
        if (i3 == 0) {
            return this.f3603d.c(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2, Configuration newConfig) {
        kotlin.jvm.internal.m.e(newConfig, "newConfig");
        this.f3617w = true;
        try {
            super.onMultiWindowModeChanged(z2, newConfig);
            this.f3617w = false;
            Iterator it = this.f3614t.iterator();
            while (it.hasNext()) {
                ((InterfaceC0980a) it.next()).accept(new androidx.core.app.e(z2, newConfig));
            }
        } catch (Throwable th) {
            this.f3617w = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f3613s.iterator();
        while (it.hasNext()) {
            ((InterfaceC0980a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i3, Menu menu) {
        kotlin.jvm.internal.m.e(menu, "menu");
        this.f3603d.b(menu);
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2, Configuration newConfig) {
        kotlin.jvm.internal.m.e(newConfig, "newConfig");
        this.f3618x = true;
        try {
            super.onPictureInPictureModeChanged(z2, newConfig);
            this.f3618x = false;
            Iterator it = this.f3615u.iterator();
            while (it.hasNext()) {
                ((InterfaceC0980a) it.next()).accept(new androidx.core.app.l(z2, newConfig));
            }
        } catch (Throwable th) {
            this.f3618x = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i3, View view, Menu menu) {
        kotlin.jvm.internal.m.e(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        this.f3603d.d(menu);
        return true;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objE = E();
        C cA = this.f3605f;
        if (cA == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            cA = cVar.a();
        }
        if (cA == null && objE == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.b(objE);
        cVar2.c(cA);
        return cVar2;
    }

    @Override // androidx.core.app.d, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.m.e(outState, "outState");
        if (a() instanceof androidx.lifecycle.j) {
            AbstractC0516e abstractC0516eA = a();
            kotlin.jvm.internal.m.c(abstractC0516eA, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.j) abstractC0516eA).m(AbstractC0516e.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.f3604e.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f3612r.iterator();
        while (it.hasNext()) {
            ((InterfaceC0980a) it.next()).accept(Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f3616v.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (A.b.h()) {
                A.b.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            A().b();
            A.b.f();
        } catch (Throwable th) {
            A.b.f();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i3) {
        B();
        d dVar = this.f3606l;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        dVar.q(decorView);
        super.setContentView(i3);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i3) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startActivityForResult(intent, i3);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i3, Intent intent2, int i4, int i5, int i6) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startIntentSenderForResult(intent, i3, intent2, i4, i5, i6);
    }

    public final void x(b.b listener) {
        kotlin.jvm.internal.m.e(listener, "listener");
        this.f3602c.a(listener);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        B();
        d dVar = this.f3606l;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        dVar.q(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startActivityForResult(intent, i3, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i3, Intent intent2, int i4, int i5, int i6, Bundle bundle) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startIntentSenderForResult(intent, i3, intent2, i4, i5, i6, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        d dVar = this.f3606l;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        dVar.q(decorView);
        super.setContentView(view, layoutParams);
    }
}
